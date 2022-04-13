object Deps {

	object JetBrains {

		object Kotlin {

			// __KOTLIN_COMPOSE_VERSION__
			private const val VERSION = "1.6.10"
			const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$VERSION"
			const val testCommon = "org.jetbrains.kotlin:kotlin-test-common:$VERSION"
			const val testJunit = "org.jetbrains.kotlin:kotlin-test-junit:$VERSION"
			const val testJs = "org.jetbrains.kotlin:kotlin-test-js:$VERSION"
			const val testAnnotationsCommon = "org.jetbrains.kotlin:kotlin-test-annotations-common:$VERSION"
		}

		object Compose {

			// __LATEST_COMPOSE_RELEASE_VERSION__
			private const val VERSION = "1.0.1"
			const val gradlePlugin = "org.jetbrains.compose:compose-gradle-plugin:$VERSION"
		}

		object KotlinX {

			const val dateTime = "org.jetbrains.kotlinx:kotlinx-datetime:0.3.1"
		}

	}

	object Ktor {

		private const val VERSION = "2.0.0"
		const val core = "io.ktor:ktor-server-core-jvm:$VERSION"
		const val hostCommon = "io.ktor:ktor-server-host-common-jvm:$VERSION"
		const val statusPages = "io.ktor:ktor-server-status-pages-jvm:$VERSION"
		const val netty = "io.ktor:ktor-server-netty-jvm:$VERSION"

		const val tests = "io.ktor:ktor-server-tests-jvm:$VERSION"
	}

	object Logback {

		private const val VERSION = "1.2.3"
		const val classic = "ch.qos.logback:logback-classic:$VERSION"

	}

	object Android {

		object Tools {

			object Build {

				const val gradlePlugin = "com.android.tools.build:gradle:4.1.0"
			}
		}
	}

}
