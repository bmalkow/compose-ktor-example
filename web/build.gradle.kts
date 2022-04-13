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
            }
        }
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
    }
}
