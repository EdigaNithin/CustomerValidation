FROM openjdk:17-alpine
COPY target/customervalid.jar customervalid.jar
EXPOSE 9080
ENV DATABASE_URL jdbc:postgresql://localhost:5432/e_governance
ENV DATABASE_USERNAME postgres
ENV DATABASE_PASSWORD 123@123Nnit
ENTRYPOINT ["java", "-jar", "customervalid.jar"]
