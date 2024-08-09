rootProject.name = "knotting-KMP"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    includeBuild("build-logic")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
//    repositories {
//        google {
//            mavenContent {
//                includeGroupAndSubgroups("androidx")
//                includeGroupAndSubgroups("com.android")
//                includeGroupAndSubgroups("com.google")
//            }
//        }
//        mavenCentral()
//        gradlePluginPortal()
//    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
//    repositories {
//        google {
//            mavenContent {
//                includeGroupAndSubgroups("androidx")
//                includeGroupAndSubgroups("com.android")
//                includeGroupAndSubgroups("com.google")
//            }
//        }
//        mavenCentral()
//    }
}

include(":composeApp", ":domain", ":platform")