import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.project

class ArchInfrastructureConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply {
                apply("depsmanagement.android.library")
            }

            dependencies {
                add("implementation", project(":database"))
                add("implementation", project(":model"))
            }
        }
    }
}