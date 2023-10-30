plugins {
    alias(libs.plugins.depsmanagement.arch.view)
}

android {
    namespace = "com.example.depsmanagement.feature.first.view"
}

dependencies {
    implementation(project(":feature:first:domain"))
}