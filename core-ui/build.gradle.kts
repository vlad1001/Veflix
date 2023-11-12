plugins {
    id("veflix.android.library")
    id("veflix.android.library.compose")
    id("veflix.android.library.jacoco")
}

android {
    namespace = "com.example.veflix.core_ui"
}

dependencies {
    implementation(project(":model"))
    implementation(project(":core"))
    api(project(":designsystem"))

    implementation(libs.androidx.core.ktx)
    implementation(libs.coil.kt)
    implementation(libs.coil.kt.compose)
    implementation(libs.kotlinx.datetime)
    implementation(libs.timber)
    implementation(libs.lottie.compose)
    api(libs.coil.kt)
    api(libs.coil.kt.compose)

    api(libs.androidx.paging.runtime)
    api(libs.androidx.paging.compose)
    api(libs.androidx.compose.animation.graphics)
    api(libs.androidx.compose.foundation)
    api(libs.androidx.compose.foundation.layout)
    api(libs.androidx.compose.material.iconsExtended)
    api(libs.androidx.compose.material)
    api(libs.androidx.compose.material3)
    debugApi(libs.androidx.compose.ui.tooling)
    api(libs.androidx.compose.ui.tooling.preview)
    api(libs.androidx.compose.ui.util)
    api(libs.androidx.compose.runtime)
    api(libs.androidx.metrics)
    api(libs.androidx.tracing.ktx)
    api(libs.androidx.fragment)
    api(libs.accompanist.placeholder)
    api(libs.accompanist.systemuicontroller)
    api(libs.androidx.activity.compose)
    api(libs.gson)
    api(libs.timber)
    api(libs.androidx.lifecycle.viewModelCompose)
}
