// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()

        maven { url  = uri("https://jitpack.io") }
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    alias(libs.plugins.hilt) apply false
    alias(libs.plugins.secrets) apply false
    alias(libs.plugins.google.play.services) apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    id("com.android.library") version "7.4.2" apply false
}