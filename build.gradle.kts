buildscript {
    repositories {
        jcenter()
        google()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:3.2.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.2.71")
    }
}

allprojects {
    repositories {
        jcenter()
        google()
    }
}

task ("clean", Delete::class) {
    delete(rootProject.buildDir)
}
