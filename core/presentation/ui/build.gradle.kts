plugins {
    alias(libs.plugins.lzcalderaro.android.library.compose)
}

android {
    namespace = "com.lzcalderaro.android.core.presentation.ui"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.core.presentation.designsystem)
}
