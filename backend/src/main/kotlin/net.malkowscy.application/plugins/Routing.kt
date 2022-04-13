package net.malkowscy.application.plugins

import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import net.malkowscy.model.Message
import java.text.SimpleDateFormat
import java.util.*

fun Application.configureRouting() {

	routing {
		get("/") {
			call.respondRedirect("/app/index.html")
		}
		get("/api/msg") {
			val timestamp = SimpleDateFormat.getDateTimeInstance()
				.format(Date())
			call.respond(Message(timestamp, "Hello world from Ktor :-)"))
		}
		// Static plugin. Try to access `/static/index.html`
		static("/static") {
			resources("static")
		}
		static("/app") {
			resources("app")
		}
	}
}
