buildscript {
    repositories {
        jcenter()
        google()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:3.2.0")
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
