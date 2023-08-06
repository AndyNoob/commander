plugins {
    id("java")
    id("maven-publish")
}

group = "me.quadraboy.commander"
version = "0.1-BETA"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20.1-R0.1-SNAPSHOT")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.github.QuadraBoy"
            artifactId = "commander"
            version = "BETA-0.1"

            from(components["java"])
        }
    }
}