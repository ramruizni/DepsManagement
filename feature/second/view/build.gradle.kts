plugins {
    alias(libs.plugins.depsmanagement.arch.view)
}

android {
    namespace = "com.example.depsmanagement.feature.second.view"
}

dependencies {
    implementation(project(":feature:second:domain"))
}