package net.malkowscy.application.plugins

import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.http.content.*
import io.ktor.server.plugins.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {

	routing {
		get("/") {
			call.respondText("Hello World!")
		}
		// Static plugin. Try to access `/static/index.html`
		static("/static") {
			resources("static")
		}
		static("/app") {
			resources("app")
		}
//		install(StatusPages) {
//			exception<AuthenticationException> { call, cause ->
//				call.respond(HttpStatusCode.Unauthorized)
//			}
//			exception<AuthorizationException> { call, cause ->
//				call.respond(HttpStatusCode.Forbidden)
//			}
//
//		}
	}
}

class AuthenticationException : RuntimeException()
class AuthorizationException : RuntimeException()
