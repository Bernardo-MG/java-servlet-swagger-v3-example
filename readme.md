# Java Servlet Example

Example setting up Swagger for OpenApi 3 in a Servlet. This is an extension of the [Java Servlet Example](https://github.com/Bernardo-MG/java-servlet-example).

[![Release docs](https://img.shields.io/badge/docs-release-blue.svg)][site-release]
[![Development docs](https://img.shields.io/badge/docs-develop-blue.svg)][site-develop]

[![Release javadocs](https://img.shields.io/badge/javadocs-release-blue.svg)][javadoc-release]
[![Development javadocs](https://img.shields.io/badge/javadocs-develop-blue.svg)][javadoc-develop]

## Features

- Java servlet
- Swagger for OpenApi v3 servlet documentation

## Documentation

Documentation is always generated for the latest release, kept in the 'master' branch:

- The [latest release documentation page][site-release].
- The [latest release Javadoc site][javadoc-release].

Documentation is also generated from the latest snapshot, taken from the 'develop' branch:

- The [the latest snapshot documentation page][site-develop].
- The [latest snapshot Javadoc site][javadoc-develop].

### Building the docs

The documentation site is actually a Maven site, and its sources are included in the project. If required it can be generated by using the following Maven command:

```
mvn verify site
```

The verify phase is required, otherwise some of the reports won't be generated.

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

To ease deployin the project, Docker files are included:

```
docker-compose -f docker/docker-compose.yml --project-name java-servlet-swagger-v3-example up
```

## Collaborate

Any kind of help with the project will be well received, and there are two main ways to give such help:

- Reporting errors and asking for extensions through the issues management
- or forking the repository and extending the project

### Issues management

Issues are managed at the GitHub [project issues tracker][issues], where any Github user may report bugs or ask for new features.

### Getting the code

If you wish to fork or modify the code, visit the [GitHub project page][scm], where the latest versions are always kept. Check the 'master' branch for the latest release, and the 'develop' for the current, and stable, development version.

## License

The project has been released under the [MIT License][license].

[issues]: https://github.com/bernardo-mg/java-servlet-swagger-v3-example/issues
[javadoc-develop]: https://docs.bernardomg.com/development/maven/java-servlet-swagger-v3-example/apidocs
[javadoc-release]: https://docs.bernardomg.com/maven/java-servlet-swagger-v3-example/apidocs
[license]: https://www.opensource.org/licenses/mit-license.php
[scm]: https://github.com/bernardo-mg/java-servlet-swagger-v3-example
[site-develop]: https://docs.bernardomg.com/development/maven/java-servlet-swagger-v3-example
[site-release]: https://docs.bernardomg.com/maven/java-servlet-swagger-v3-example
