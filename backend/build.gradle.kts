plugins {
	kotlin("jvm")
	application
}


application {
	mainClass.set("net.malkowscy.application.ServerKt")
}

dependencies {
	implementation(Deps.Ktor.core)
	implementation(Deps.Ktor.hostCommon)
	implementation(Deps.Ktor.statusPages)
	implementation(Deps.Ktor.netty)
	implementation(Deps.Logback.classic)
	testImplementation(Deps.Ktor.tests)
	testImplementation(Deps.JetBrains.Kotlin.testJunit)
}


tasks.named<ProcessResources>("processResources") {
	dependsOn(":web:assemble")
	from(File(rootProject.project("web").buildDir, "distributions/")) {
		into("app")
	}
}