pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Deps Management"
include(":app")
include(":database")
include(":model")
include(":feature:first:domain")
include(":feature:first:infrastructure")
include(":feature:first:view")
include(":feature:second:domain")
include(":feature:second:infrastructure")
include(":feature:second:view")
