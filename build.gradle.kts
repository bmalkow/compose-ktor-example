//import org.jetbrains.compose.compose
//
//plugins {
//    kotlin("multiplatform") version "1.6.10"
//    id("org.jetbrains.compose") version "1.1.1"
//    application
//}

group = "net.malkowscy"
version = "1.0-SNAPSHOT"

//repositories {
//    jcenter()
//    mavenCentral()
//    google()
//    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
//    maven("https://maven.pkg.jetbrains.space/public/p/kotlinx-html/maven")
//}

//kotlin {
//    jvm {
//        compilations.all {
//            kotlinOptions.jvmTarget = "1.8"
//        }
//        withJava()
//        testRuns["test"].executionTask.configure {
//            useJUnitPlatform()
//        }
//    }
//    js(IR) {
//        browser {
//            testTask {
//                testLogging.showStandardStreams = true
//                useKarma {
//                    useChromeHeadless()
//                    useFirefox()
//                }
////                commonWebpackConfig {
////                    cssSupport.enabled = true
////                }
//            }
//        }
//        binaries.executable()
//    }
//    sourceSets {
//        val commonMain by getting
//        val commonTest by getting {
//            dependencies {
//                implementation(kotlin("test"))
//            }
//        }
//        val jvmMain by getting {
//            dependencies {
//                implementation("io.ktor:ktor-server-netty:1.6.7")
//                implementation("io.ktor:ktor-html-builder:1.6.7")
//                implementation("org.jetbrains.kotlinx:kotlinx-html-jvm:0.7.2")
//            }
//        }
//        val jvmTest by getting
//        val jsMain by getting {
//            dependencies {
//                implementation(compose.web.core)
//                implementation(compose.runtime)
//            }
//        }
//        val jsTest by getting
//    }
//}

//application {
//    mainClass.set("net.malkowscy.application.ServerKt")
//}

//tasks.named<Copy>("jvmProcessResources") {
//    val jsBrowserDistribution = tasks.named("jsBrowserDistribution")
//    from(jsBrowserDistribution)
//}

//tasks.named<JavaExec>("run") {
//    dependsOn(tasks.named<Jar>("jvmJar"))
//    classpath(tasks.named<Jar>("jvmJar"))
//}