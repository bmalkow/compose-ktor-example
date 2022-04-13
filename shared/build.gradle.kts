plugins {
    id("multiplatform-setup")
}

kotlin {

    sourceSets {
        commonMain {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2")
            }
        }
    }
}
