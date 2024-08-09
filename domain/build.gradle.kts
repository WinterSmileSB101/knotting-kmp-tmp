@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("kmp-library-plugin")
    id("koin-plugin-setup")
}

kotlin {
    sourceSets {
        commonTest.dependencies {
//            implementation(libs.bundles.test.multiplatform)
        }
    }
}