plugins {
    alias(libs.plugins.depsmanagement.arch.infrastructure)
}

android {
    namespace = "com.example.depsmanagement.feature.second.infrastructure"
}

dependencies {
    implementation(project(":feature:second:domain"))
}