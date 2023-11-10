/*
 * Copyright 2022 The Android Open Source Project
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

import com.android.build.api.dsl.ApplicationExtension
import com.example.depsmanagement.convention.ProjectConfig
import com.example.depsmanagement.convention.configureBuildTypes
import com.example.depsmanagement.convention.configureKotlinAndroid
import com.example.depsmanagement.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

class AndroidApplicationConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")
            }

            extensions.configure<ApplicationExtension> {
                configureKotlinAndroid(this)

                defaultConfig {
                    targetSdk = ProjectConfig.targetSdk

                    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                    vectorDrawables {
                        useSupportLibrary = true
                    }
                }

                configureBuildTypes(this)

                packaging {
                    resources {
                        excludes += "/META-INF/{AL2.0,LGPL2.1}"
                    }
                }
            }

            dependencies {
                add("implementation", libs.findLibrary("core.ktx").get())
                add("implementation", libs.findLibrary("lifecycle.runtime.ktx").get())
                add("implementation", libs.findLibrary("activity.compose").get())
                add("implementation", platform(libs.findLibrary("compose.bom").get()))
                add("implementation", libs.findLibrary("ui").get())
                add("implementation", libs.findLibrary("ui.graphics").get())
                add("implementation", libs.findLibrary("ui.tooling.preview").get())
                add("implementation", libs.findLibrary("material3").get())
                add("testImplementation", libs.findLibrary("junit").get())
                add("androidTestImplementation", libs.findLibrary("androidx.test.ext.junit").get())
                add("androidTestImplementation", libs.findLibrary("espresso.core").get())
                add("androidTestImplementation", platform(libs.findLibrary("compose.bom").get()))
                add("androidTestImplementation", libs.findLibrary("ui.test.junit4").get())
                add("debugImplementation", libs.findLibrary("ui.tooling").get())
                add("debugImplementation", libs.findLibrary("ui.test.manifest").get())

                add("implementation", libs.findLibrary("androidx.hilt.navigation.compose").get())
                add("implementation", libs.findLibrary("androidx.navigation.compose").get())
            }
        }
    }

}