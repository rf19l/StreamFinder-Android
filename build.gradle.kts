
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("org.jetbrains.kotlin.android") version "1.7.20" apply false
    id ("com.android.application") version "8.0.0-alpha10" apply false
    id ("com.android.library") version "8.0.0-alpha10" apply false
    id ("io.realm.kotlin") version "1.4.0" apply false
    id("org.jetbrains.kotlin.plugin.serialization") version "1.7.20" apply false



}
buildscript{
    dependencies{
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")
    }
}

extra.apply{
    set("compose_version", "1.3.2")
    set("kotlin_version","1.7.20")
}