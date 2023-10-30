plugins {
    alias(libs.plugins.depsmanagement.android.library)
    alias(libs.plugins.depsmanagement.android.room)
    alias(libs.plugins.depsmanagement.android.hilt)
}

android {
    namespace = "com.example.depsmanagement.database"
}