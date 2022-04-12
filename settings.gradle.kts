
pluginManagement {
	repositories {
		gradlePluginPortal()
		maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
	}

}
rootProject.name = "compose-ktor-simple-example"

include(
	"backend",
	"web",
)