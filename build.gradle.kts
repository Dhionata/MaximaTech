plugins {
    java
    id("org.springframework.boot") version "3.1.0"
    id("io.spring.dependency-management") version "1.1.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.junit:junit-bom:5.9.2"))
    implementation("org.junit.jupiter:junit-jupiter:5.9.2")
    implementation("org.springframework.boot:spring-boot-starter-test:3.1.0")

    implementation("org.springframework.boot:spring-boot-devtools:3.0.4")

    //implementation("org.springdoc:springdoc-openapi-ui:1.7.0")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.1.0")


    implementation("jakarta.servlet:jakarta.servlet-api:5.0.0")

    implementation("org.springframework.boot:spring-boot-starter-web:3.1.0")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.0.4")
    implementation("org.springframework.boot:spring-boot-starter-validation:3.0.4")
    implementation("org.springframework.boot:spring-boot-starter-jdbc:3.1.0")

    implementation("org.postgresql:postgresql:42.5.4")
    implementation("org.jetbrains:annotations:24.0.0")
}
