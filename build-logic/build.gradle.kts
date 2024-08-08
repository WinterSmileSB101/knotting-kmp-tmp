//plugins {
//    `kotlin-dsl`
//}
plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
    maven(url = "https://plugins.gradle.org/m2/")
}

dependencies {
    implementation(libs.kotlin.gradle.plugin)
//    implementation(libs.plugins.jetbrainsCompose)
//    implementation(libs.plugins.compose.compiler)
    implementation(libs.gradle)
    implementation(libs.kover.gradle.plugin)
    implementation(libs.com.google.devtools.ksp.gradle.plugin)
    implementation(libs.detekt.gradle.plugin)
}