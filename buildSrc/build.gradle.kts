plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
    maven("https://plugins.gradle.org/m2/")
    maven("https://jitpack.io")
}

object PluginVersion {
    const val KTLINT = "10.0.0"
    const val KOTLIN = "1.6.10"
}

dependencies {
    implementation("com.android.tools.build:gradle:7.0.4")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${PluginVersion.KOTLIN}")
    implementation("org.jlleitschuh.gradle:ktlint-gradle:${PluginVersion.KTLINT}")
}