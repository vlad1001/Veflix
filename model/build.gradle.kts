plugins {
    id("veflix.android.library")
    id("kotlin-android")
    id("kotlin-parcelize")
}

android {
    namespace = "com.example.veflix.model"
    defaultConfig {
        consumerProguardFiles("proguard-rules.pro")
    }
}

dependencies {
    implementation(libs.gson)
    implementation(libs.androidx.annotation)
}