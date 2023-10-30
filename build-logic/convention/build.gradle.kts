plugins {
    `kotlin-dsl`
}

group = "com.example.depsmanagement.buildlogic"

// Configure the build-logic plugins to target JDK 17
// This matches the JDK used to build the project, and is not related to what is running on device.
java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

dependencies {
    compileOnly(libs.android.gradle.plugin)
    compileOnly(libs.kotlin.gradle.plugin)
    compileOnly(libs.ksp.gradle.plugin)
}

gradlePlugin {
    plugins {
        register("android-application-compose") {
            id = "depsmanagement.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }
        register("android-application") {
            id = "depsmanagement.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("android-library-compose") {
            id = "depsmanagement.android.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"
        }
        register("android-library") {
            id = "depsmanagement.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
        register("android-test") {
            id = "depsmanagement.android.test"
            implementationClass = "AndroidTestConventionPlugin"
        }
        register("android-hilt") {
            id = "depsmanagement.android.hilt"
            implementationClass = "AndroidHiltConventionPlugin"
        }
        register("android-room") {
            id = "depsmanagement.android.room"
            implementationClass = "AndroidRoomConventionPlugin"
        }
        register("jvm-library") {
            id = "depsmanagement.jvm.library"
            implementationClass = "JvmLibraryConventionPlugin"
        }

        // Architecture
        register("arch-view") {
            id = "depsmanagement.arch.view"
            implementationClass = "ArchViewConventionPlugin"
        }
        register("arch-domain") {
            id = "depsmanagement.arch.domain"
            implementationClass = "ArchDomainConventionPlugin"
        }
        register("arch-infrastructure") {
            id = "depsmanagement.arch.infrastructure"
            implementationClass = "ArchInfrastructureConventionPlugin"
        }
    }
}