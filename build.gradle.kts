allprojects {
    repositories {
        repositories.google()
        repositories.mavenLocal()
        repositories.mavenCentral()
        repositories.maven("https://jitpack.io")
    }
}

tasks {
    register("clean", Delete::class) {
        delete(rootProject.buildDir)
    }
}

subprojects {
    plugins.apply(BuildPlugins.KTLINT)
}