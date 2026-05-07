FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY . .

RUN ./mvnw clean package -DskipeTest

EXPOSE 8080

RUN mv target/*.jar app.jar

CMD ["java", "-jar", "app.jar"]