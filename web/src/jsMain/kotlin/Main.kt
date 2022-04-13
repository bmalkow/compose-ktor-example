import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import kotlinx.browser.window
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.await
import kotlinx.coroutines.launch
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import net.malkowscy.model.Message
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable

fun main() {
	val mainScope = MainScope()
	var message: Message? by mutableStateOf(null)

	renderComposable(rootElementId = "root") {
		Div({ style { padding(25.px) } }) {

			Div({
					style {
						padding(25.px)
						backgroundColor(Color.aliceblue)
					}
				}) {

				message?.let {
					Div {
						Text(it.text)
					}
					Div({
							style {
								fontSize(12.px)
							}
						}) {
						Text(it.timestamp)
					}
				}
			}


			Button(attrs = {
				onClick {
					mainScope.launch {
						message = fetchMessage()

					}
				}
			}) {
				Text("Call server")
			}

		}
	}
}

suspend fun fetchMessage(): Message {
	val response = window.fetch("http://0.0.0.0:8080/api/msg")
		.await()
		.text()
		.await()
	return Json.decodeFromString(response)
}
