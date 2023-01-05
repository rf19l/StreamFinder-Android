// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("org.jetbrains.kotlin.android") version "1.7.20" apply false
    id("com.android.application") version "8.0.0-alpha11" apply false
    id("com.android.library") version "8.0.0-alpha11" apply false
    id("io.realm.kotlin") version "1.4.0" apply false
    id("org.jetbrains.kotlin.plugin.serialization") version "1.7.20" apply false
    kotlin("kapt") version "1.7.20"
    id("com.google.dagger.hilt.android") version "2.44.2" apply false
}
buildscript {
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")
        //classpath("com.google.dagger:hilt-android-gradle-plugin:2.44.2")
    }
}
extra.apply {
    set("compose_version", "1.3.2")
    set("kotlin_version", "1.7.20")
    set("room_version", "2.3.0")
}