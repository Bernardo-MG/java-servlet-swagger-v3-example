# Usage

If deployed locally then the project will be accessible at the URL:

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