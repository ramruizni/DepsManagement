plugins {
    alias(libs.plugins.depsmanagement.android.application)
    alias(libs.plugins.depsmanagement.android.application.compose)
    alias(libs.plugins.depsmanagement.android.hilt)
}

android {
    namespace = "com.example.depsmanagement"

    defaultConfig {
        applicationId = "com.example.depsmanagement"
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.core.ktx)
    implementation(libs.lifecycle.runtime.ktx)
    implementation(libs.activity.compose)
    implementation(platform(libs.compose.bom))
    implementation(libs.ui)
    implementation(libs.ui.graphics)
    implementation(libs.ui.tooling.preview)
    implementation(libs.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(platform(libs.compose.bom))
    androidTestImplementation(libs.ui.test.junit4)
    debugImplementation(libs.ui.tooling)
    debugImplementation(libs.ui.test.manifest)

    implementation(libs.androidx.hilt.navigation.compose)
    implementation(libs.androidx.navigation.compose)

    implementation(project(":feature:first:domain"))
    implementation(project(":feature:first:infrastructure"))
    implementation(project(":feature:first:view"))
    implementation(project(":feature:second:domain"))
    implementation(project(":feature:second:infrastructure"))
    implementation(project(":feature:second:view"))

    implementation(project(":database"))
    implementation(project(":model"))
}