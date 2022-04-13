plugins {
	`kotlin-dsl`
}

group = "net.malkowscy"
version = "1.0-SNAPSHOT"

allprojects {
	repositories {
		jcenter()
		mavenCentral()
		google()
		maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
		maven("https://maven.pkg.jetbrains.space/public/p/kotlinx-html/maven")
	}
}

buildscript {
	repositories {
		mavenLocal()
		google()
	}
	dependencies {
		classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
	}
}
