buildscript {
    repositories {
        jcenter()
        google()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:${Versions.androidBuildTools}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}")
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
