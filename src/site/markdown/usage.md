# Usage

This is a Maven project, first package the war:

```
mvn clean package
```

Then deploy into a servlet container, such as Tomcat. If done locally the project will be accessible at the URL:

```
http://localhost:8080/java-servlet-swagger-v3-example/hello?name=me
```

The API docs will be available at:

```
http://localhost:8080/java-servlet-swagger-v3-example/api-docs/swagger.json
```

### Docker image

To make things easier just make use of the Docker files:

```
docker-compose -f docker/docker-compose.yml --project-name java-servlet-swagger-v3-example up
```

This will build and deploy locally the project. The URLs are the same as in the previous example.