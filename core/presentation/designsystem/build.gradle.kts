plugins {
    alias(libs.plugins.lzcalderaro.android.library.compose)
}

android {
    namespace = "com.lzcalderaro.android.core.presentation.designsystem"
}

dependencies {
    api(libs.androidx.material3)
}
