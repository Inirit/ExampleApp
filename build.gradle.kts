buildscript {
    repositories {
        jcenter()
        google()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:3.2.0")
        classpath(kotlin("gradle-plugin", version = "1.2.71"))
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
