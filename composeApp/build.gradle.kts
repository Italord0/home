import org.jetbrains.compose.ExperimentalComposeLibrary
import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.jetbrainsCompose)
    alias(libs.plugins.kotlinxSerialization)
}

kotlin {
    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        moduleName = "Home"
        browser {
            commonWebpackConfig {
                outputFileName = "home.js"
            }
        }
        binaries.executable()
    }

    sourceSets {

        commonMain.dependencies {
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material)
            implementation(compose.ui)
            @OptIn(ExperimentalComposeLibrary::class)
            implementation(compose.components.resources)

            implementation(libs.kotlinx.coroutines)

            //ktor
            implementation("io.ktor:ktor-client-core:3.0.0-wasm2")
            implementation("io.ktor:ktor-serialization-kotlinx-json:3.0.0-wasm2")
            implementation("io.ktor:ktor-client-content-negotiation:3.0.0-wasm2")

        }
    }
}



compose.experimental {
    web.application {}
}