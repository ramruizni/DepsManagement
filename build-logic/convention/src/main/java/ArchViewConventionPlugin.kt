import com.android.build.gradle.LibraryExtension
import com.example.depsmanagement.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

class ArchViewConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply {
                apply("depsmanagement.android.library")
                apply("depsmanagement.android.library.compose")
                apply("depsmanagement.android.hilt")
            }
            extensions.configure<LibraryExtension> {
                defaultConfig {
                    testInstrumentationRunner =
                        "androidx.test.runner.AndroidJUnitRunner"
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
                add("implementation", libs.findLibrary("androidx.lifecycle.runtime-compose").get())
                add("implementation", libs.findLibrary("androidx.lifecycle.view.model.compose").get())
                add("implementation", libs.findLibrary("kotlinx.coroutines.android").get())
            }
        }
    }
}