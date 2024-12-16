plugins {
    kotlin("jvm") version "1.9.21"
}

group = "org.netology_exceptions"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    testImplementation("junit:junit:4.13.2")
}

kotlin {
    jvmToolchain(17)
}