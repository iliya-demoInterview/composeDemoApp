// Top-level build file where you can add configuration options common to all sub-projects/modules.
@file:Suppress("DSL_SCOPE_VIOLATION")

import kotlin.script.experimental.jvm.util.classpathFromClasspathProperty

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.com.android.library) apply false
    alias(libs.plugins.com.google.hilt) apply false
    id("androidx.navigation.safeargs.kotlin") version "2.5.1" apply false
}
