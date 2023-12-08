plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id ("kotlin-parcelize")
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.example.indolive"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.indolive"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures{
        viewBinding = true
        dataBinding = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //    Navigation
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.5")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.5")

//    Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-moshi:2.9.0")


// Logging Interceptor
    implementation("com.squareup.okhttp3:logging-interceptor:4.11.0")


// KSP
    ksp("com.squareup.moshi:moshi-kotlin-codegen:1.14.0")


// Moshi
    implementation("com.squareup.moshi:moshi:1.14.0")


// coroutine
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")


// liveData
    api("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")


// FusedLocation
    implementation("com.google.android.gms:play-services-location:21.0.1")

    //Picasso
    implementation("com.squareup.picasso:picasso:2.8")
}