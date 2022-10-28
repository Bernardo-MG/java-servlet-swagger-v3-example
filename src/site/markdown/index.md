# Java Servlet Example with Swagger for OpenApi v3

Example setting up Swagger for OpenApi 3 in a Servlet. This is an extension of the [Java Servlet Example](https://github.com/Bernardo-MG/java-servlet-example).

## Features

- Java servlet

## Usage

Build the war and deploy it in a servlet container, such as Tomcat.

If deployed locally then the project will be accessible at the URL:

```
http://localhost:8080/java-servlet-swagger-v3-example/hello?name=me
```

The API docs will be available at:

```
http://localhost:8080/java-servlet-swagger-v3-example/api-docs/swagger.json
```

### Docker image

To ease deploying the project, Docker files are included:

```
docker-compose -f docker/docker-compose.yml --project-name java-servlet-swagger-v3-example up
```
