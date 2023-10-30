plugins {
    alias(libs.plugins.depsmanagement.arch.infrastructure)
}

android {
    namespace = "com.example.depsmanagement.feature.first.infrastructure"
}

dependencies {
    implementation(project(":feature:first:domain"))
}