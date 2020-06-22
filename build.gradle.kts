import com.soywiz.korge.gradle.*

    buildscript {
        val korgePluginVersion: String by project


        repositories {
            mavenLocal()
            maven { url = uri("https://dl.bintray.com/korlibs/korlibs") }
            maven { url = uri("https://plugins.gradle.org/m2/") }
            mavenCentral()
            google()
        }
        dependencies {
            classpath("com.soywiz.korlibs.korge.plugins:korge-gradle-plugin:$korgePluginVersion")
        }
    }

apply<KorgeGradlePlugin>()

korge {
    id = "com.sample.demo"
}

    val libEmiVersion : String by project

    repositories {
        maven { url = uri("https://dl.bintray.com/emign/libEmi") }
        mavenLocal()
    }

    dependencies {
        add("commonMainApi", "me.emig:libEmi:$libEmiVersion")
    }