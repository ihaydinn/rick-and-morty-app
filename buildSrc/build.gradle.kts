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
    const val GRADLE_ANDROID = "7.0.4"
    const val KOTLIN = "1.6.10"
    const val KTLINT = "10.0.0"
    const val DAGGER_HILT = "2.40.5"
    const val SAFE_ARGS = "2.3.5"
}

dependencies {
    implementation("com.android.tools.build:gradle:${PluginVersion.GRADLE_ANDROID}")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${PluginVersion.KOTLIN}")
    implementation("org.jlleitschuh.gradle:ktlint-gradle:${PluginVersion.KTLINT}")
    implementation("com.google.dagger:hilt-android-gradle-plugin:${PluginVersion.DAGGER_HILT}")
    implementation("androidx.navigation:navigation-safe-args-gradle-plugin:${PluginVersion.SAFE_ARGS}")
}