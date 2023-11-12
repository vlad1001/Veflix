plugins {
        id("veflix.android.feature")
        id("veflix.android.library.compose")
        id("org.jetbrains.kotlin.android")
    }

    android {
        namespace = "com.example.veflix.lobby_ui"
    }

    dependencies {
        implementation(project(":model"))
        implementation(project(":core"))
        implementation(project(":core-ui"))
    }
