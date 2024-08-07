package ext

import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import config.EnvKeys
import java.io.File

internal fun BaseAppModuleExtension.configureSigning() {
    signingConfigs {
        create("release") {
            keyAlias = System.getenv(EnvKeys.BITRISE_ANDROID_KEYSTORE_ALIAS)
            keyPassword = System.getenv(EnvKeys.BITRISE_ANDROID_KEYSTORE_PRIVATE_KEY_PASSWORD)

            val path = System.getenv("HOME").plus("/knotting-keystore")
            storeFile = File(path)
            storePassword = System.getenv(EnvKeys.BITRISE_ANDROID_KEYSTORE_PASSWORD)
        }
    }
}

internal fun BaseAppModuleExtension.configureBuildTypes() {
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            signingConfig = signingConfigs.getByName("release")
        }
    }
}