import com.android.build.gradle.LibraryExtension
import com.veflix.AndroidConfig
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.kotlin

class AndroidFeatureConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply {
                apply("swift_lift.android.library")
                apply("swift_lift.android.hilt")
            }
            extensions.configure<LibraryExtension> {
                defaultConfig {
                    testInstrumentationRunner = AndroidConfig.testInstrumentationRunner
                }
                buildFeatures {
                    viewBinding = true
                }
            }

            val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

            dependencies {
                add("implementation", project(":model"))
                add("implementation", project(":core"))
//                add("implementation", project(":domain"))

//                add("testImplementation", kotlin("test"))
//                add("testImplementation", project(":testing"))
//                add("androidTestImplementation", kotlin("test"))
//                add("androidTestImplementation", project(":testing"))

                add("implementation", libs.findLibrary("androidx.fragment").get())
                add("implementation", libs.findLibrary("timber").get())


                add("implementation", libs.findLibrary("coil.kt").get())
                add("implementation", libs.findLibrary("coil.kt.compose").get())

                add("implementation", libs.findLibrary("androidx-navigation-ui").get())
                add("implementation", libs.findLibrary("androidx-navigation-fragment").get())
                add("implementation", libs.findLibrary("androidx.hilt.navigation.compose").get())
                add("implementation", libs.findLibrary("androidx.lifecycle.runtimeCompose").get())
                add("implementation", libs.findLibrary("androidx.lifecycle.viewModelCompose").get())

                add("implementation", libs.findLibrary("kotlinx.coroutines.android").get())
                add("implementation", libs.findLibrary("lottie.compose").get())
            }
        }
    }
}
