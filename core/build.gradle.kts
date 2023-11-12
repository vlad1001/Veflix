plugins {
    id("org.jetbrains.kotlin.android")
    id("kotlin-android")
    id("veflix.android.library")
    id("veflix.android.hilt")
    kotlin("kapt")
}

android {
    namespace = "com.example.veflix.core"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("proguard-rules.pro")
    }
}

dependencies {
    implementation(project(":model"))

    implementation(libs.material)
    implementation(libs.kotlin.stdlib)
    api(libs.kotlinx.datetime)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.androidx.dataStore.core)
    implementation(libs.androidx.dataStore.preferences)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime)
    implementation(libs.androidx.startup)
    implementation(libs.androidx.security.crypto)

    implementation(libs.okhttp)
    implementation(libs.okhttp.logging)
    implementation(libs.retrofit.core)
    implementation(libs.retrofit.converter.gson)
    implementation(libs.timber)
    implementation(libs.retrofit.core)
    implementation(libs.retrofit.converter.gson)
    implementation(libs.gson)
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    api(libs.room.runtime)
    api(libs.room.ktx)

    kapt(libs.room.compiler)
}

