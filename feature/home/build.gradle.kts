@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("kmp-library-plugin")
    alias(libs.plugins.jetbrainsCompose)
    alias(libs.plugins.compose.compiler)
    id("koin-annotations-plugin-setup")
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(compose.ui)
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material3)
            implementation(compose.animation)
            implementation(compose.uiUtil)

            implementation(libs.rinku.core)
            implementation(libs.rinku.compose.ext)
            implementation(libs.kotlinx.coroutines.core)

            implementation(libs.lifecycle.viewmodel.compose)

            implementation(libs.bundles.voyager)

            implementation(libs.kotlin.stdlib)

            // other projects
            implementation(project(":platform"))
            implementation(project(":domain"))
        }
    }
}