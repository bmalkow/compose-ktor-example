import org.jetbrains.compose.compose

plugins {
	id("multiplatform-setup")
	id("org.jetbrains.compose")
}

kotlin {

	sourceSets {
		val jsMain by getting {
			dependencies {
				implementation(compose.web.core)
				implementation(compose.runtime)
				implementation(project(":shared"))

//				implementation(Deps.Ktor.Client.core)
//				implementation(Deps.Ktor.Client.js)
//				implementation(Deps.Ktor.Client.contentNegotiation)
//				implementation(Deps.Ktor.serializationJson)
			}
		}
		val jsTest by getting {
			dependencies {
				implementation(kotlin("test-js"))
			}
		}
	}
}
