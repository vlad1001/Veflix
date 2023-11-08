package com.veflix

import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.dsl.ApplicationProductFlavor
import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project

enum class FlavorDimension {
    contentType
}

// The content for the app can either come from local static data which is useful for demo
// purposes, or from a production backend server which supplies up-to-date, real content.
// These two product flavors reflect this behaviour.
enum class Flavor(
    val dimension: FlavorDimension,
    val applicationIdSuffix: String? = null,
    val appName: String,
    val mapsApiKey: String,
    val deepLinkDomain: String,
    val veflixBaseUrl: String,
    ) {
    dev(
        dimension = FlavorDimension.contentType,
        applicationIdSuffix = ".dev",
        appName = "Veflix (Dev)",
        deepLinkDomain = "veflix.example.com",
        mapsApiKey = "",
        veflixBaseUrl = ""
    ),
    staging(
        dimension = FlavorDimension.contentType,
        applicationIdSuffix = ".staging",
        appName = "Veflix (Staging)",
        deepLinkDomain = "veflix.example.com",
        mapsApiKey = "",
        veflixBaseUrl = ""
    ),
    prod(
        dimension = FlavorDimension.contentType,
        applicationIdSuffix = null,
        appName = "Veflix",
        deepLinkDomain = "veflix.example.com",
        mapsApiKey = "",
        veflixBaseUrl = ""
    )
}

fun Project.configureFlavors(
    commonExtension: CommonExtension<*, *, *, *>
) {
    commonExtension.apply {
        flavorDimensions += FlavorDimension.contentType.name
        productFlavors {
            Flavor.values().forEach {
                create(it.name) {
                    dimension = it.dimension.name

                    buildConfigField("String", "veflix_BASE_URL", "\"${it.veflixBaseUrl}\"")
                    buildConfigField("String", "MAPS_API_KEY", "\"${it.mapsApiKey}\"")
                    buildConfigField("String", "DOMAIN", "\"${it.deepLinkDomain}\"")
                    resValue( "string", "app_name", "${it.appName}")

                    if (this@apply is ApplicationExtension && this is ApplicationProductFlavor) {
                        if (it.applicationIdSuffix != null) {
                            this.applicationIdSuffix = it.applicationIdSuffix
                        }
                    }
                }
            }
        }
    }
}