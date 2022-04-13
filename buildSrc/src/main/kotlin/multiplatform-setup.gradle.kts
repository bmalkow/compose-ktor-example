plugins {
	kotlin("multiplatform")
	kotlin("plugin.serialization")
}


kotlin {
	jvm {
		withJava()
		testRuns["test"].executionTask.configure {
			useJUnit()
		}
	}
	js(IR) {
		browser {
			commonWebpackConfig {
				cssSupport.enabled = true
			}
			testTask {
				testLogging.showStandardStreams = true
				useKarma {
					useChromeHeadless()
					useFirefox()
				}
			}
		}
		binaries.executable()
	}

	sourceSets {
		all {
			languageSettings {
				optIn("kotlin.RequiresOptIn")
			}
		}
		named("commonMain") {
			dependencies {
				implementation(kotlin("stdlib-common"))
			}
		}
		named("commonTest") {
			dependencies {
				implementation(kotlin("test-common"))
				implementation(kotlin("test-annotations-common"))
			}
		}
		named("jvmMain") { }
		named("jvmTest") {
			dependencies {
				implementation(kotlin("test-junit"))
			}
		}
		named("jsMain") {
			dependencies {
				implementation(kotlin("stdlib-js"))
			}
		}
		named("jsTest") {
			dependencies {
				implementation(kotlin("test-js"))
			}
		}

	}
	tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
		kotlinOptions.jvmTarget = "1.8"
	}
}