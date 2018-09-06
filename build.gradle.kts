import org.jetbrains.kotlin.gradle.dsl.Coroutines
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    application
    kotlin("jvm") version "1.2.61"
}

tasks.withType<KotlinCompile>().all {
    kotlinOptions.jvmTarget = "1.8"
}

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("software.amazon.awscdk:cdk:0.8.2")
    implementation("software.amazon.awscdk:s3:0.8.2")
}

kotlin.experimental.coroutines = Coroutines.ENABLE

application {
    mainClassName = "samples.HelloAwsCdkKt"
}
