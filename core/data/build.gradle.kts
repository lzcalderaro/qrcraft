plugins {
    alias(libs.plugins.lzcalderaro.android.library)
}

android {
    namespace = "com.lzcalderaro.android.core.data"
}

dependencies {
   implementation(projects.core.domain)
}
