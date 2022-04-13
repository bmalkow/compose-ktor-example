plugins {
	`kotlin-dsl`
}

repositories {
	mavenLocal()
	google()
	mavenCentral()
	maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

dependencies {
	implementation(Deps.JetBrains.Compose.gradlePlugin)
	implementation(Deps.JetBrains.Kotlin.gradlePlugin)
	implementation(kotlin("serialization", version = Deps.JetBrains.Kotlin.VERSION))

}

kotlin {
	// Add Deps to compilation, so it will become available in main project
	sourceSets.getByName("main").kotlin.srcDir("buildSrc/src/main/kotlin")
}