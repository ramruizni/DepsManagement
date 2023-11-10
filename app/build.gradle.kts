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
    }
}

dependencies {
    implementation(project(":feature:first:domain"))
    implementation(project(":feature:first:infrastructure"))
    implementation(project(":feature:first:view"))
    implementation(project(":feature:second:domain"))
    implementation(project(":feature:second:infrastructure"))
    implementation(project(":feature:second:view"))

    implementation(project(":database"))
    implementation(project(":model"))
}