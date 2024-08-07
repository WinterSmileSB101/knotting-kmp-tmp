import config.ConfigurationKeys
import ext.configureBuildTypes
import ext.configureCompileOptions
import ext.configureDefaultConfig
import ext.configurePlatformTargets
import ext.configureTestOptions
import ext.configureSigning

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.multiplatform")
    id("kover-app-plugin")
    id("detekt-plugin-setup")
}

android {
    compileSdk = ConfigurationKeys.sdkConfiguration.compileSdk
    namespace = ConfigurationKeys.APPLICATION_ID

    defaultConfig {
        applicationId = ConfigurationKeys.APPLICATION_ID
    }

    configureDefaultConfig()
    configureCompileOptions()
    configureTestOptions()
    configureSigning()
    configureBuildTypes()
}

kotlin {
    configurePlatformTargets()
}