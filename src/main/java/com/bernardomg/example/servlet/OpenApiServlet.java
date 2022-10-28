/**
 * The MIT License (MIT)
 * <p>
 * Copyright (c) 2022 the original author or authors.
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.bernardomg.example.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.swagger.v3.core.util.Json;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.PathItem;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.parameters.Parameter;
import io.swagger.v3.oas.models.servers.Server;

/**
 * Servlet for returning and OpenApi endpoint description.
 *
 * @author Bernardo Mart&iacute;nez Garrido
 *
 */
public final class OpenApiServlet extends HttpServlet {

    /**
     * Serialization id.
     */
    private static final long serialVersionUID = 5892091829006189796L;

    /**
     * Returns the OpenApi description. This is static, as it is an example.
     * 
     * @return the OpenApi description
     */
    private final OpenAPI getOpenAPI() {
        final Info      info;
        final License   license;
        final Server    server;
        final PathItem  pathItem;
        final Operation get;
        final Parameter getParameter;

        license = new License().name("MIT License")
            .url("http://www.opensource.org/licenses/mit-license.php");

        info = new Info().version("1.0.0")
            .title("Hello servlet")
            .description("This servlet sends a greeting")
            .license(license);

        server = new Server().url("http://localhost:8080");

        getParameter = new Parameter().name("name")
            .description("Name to greet");

        get = new Operation().addParametersItem(getParameter);

        pathItem = new PathItem().get(get);

        return new OpenAPI().info(info)
            .addServersItem(server)
            .path("/hello", pathItem);
    }

    @Override
    protected void doGet(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {
        final OpenAPI openAPI;

        openAPI = getOpenAPI();

        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter()
            .write(Json.pretty(openAPI));
        response.getWriter()
            .flush();
    }

}
