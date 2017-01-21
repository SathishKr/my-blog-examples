package org.workspace7.camel.rap.routes;

import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kameshs
 */
public class MyRouteBuilder extends RouteBuilder {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyRouteBuilder.class);

    @Override
    public void configure() throws Exception {

        LOGGER.info("Starting my route ...");

        from("{{ftp.uri}}")
            .process(exchange -> LOGGER.info("Processing Order {}", exchange.getIn().getHeader("CamelFileName")))
            .to("{{jms.orders.uri}}");

        from("{{jms.orders.uri}}")
            .log("Received Order : ${body}");
    }
}
