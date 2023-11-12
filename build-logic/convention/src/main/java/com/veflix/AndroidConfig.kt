package com.veflix

import org.gradle.api.JavaVersion
import java.io.File
import java.io.FileInputStream
import java.util.Properties

object AndroidConfig {
    const val compileSdk = 33
    const val minSdk = 23
    const val targetSdk = 33

    const val versionCode = 1
    const val versionName = "1.0"
    const val applicationId = "com.veflix"
    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    val sourceCompatibility = JavaVersion.VERSION_11
    val targetCompatibility = JavaVersion.VERSION_11

    private val versionProperties by lazy {
        Properties().apply { load(FileInputStream(File("version.properties"))) }
    }

    fun generateVersionCode(): Int {
        return Integer.valueOf(versionProperties.getProperty("version.code"))
    }
}


