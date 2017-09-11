package com.tianshouzhi.springboot.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Springfox Swagger configuration.
 *
 * Warning! When having a lot of REST endpoints, Springfox can become a performance issue. In that
 * case, you can use a specific Spring profile for this class, so that only front-end developers
 * have access to the Swagger view.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    private final Logger log = LoggerFactory.getLogger(SwaggerConfiguration.class);

    public static final String DEFAULT_INCLUDE_PATTERN = "/api/.*";

    /**
     * Swagger Springfox configuration.
     */
    @Bean
    public Docket swaggerSpringfoxDocket() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(ApiInfo.DEFAULT)
            .select().apis(RequestHandlerSelectors.basePackage("com.tianshouzhi.springboot"))
            .paths(PathSelectors.any())
            .build();
//            .genericModelSubstitutes(ResponseEntity.class)
//            .forCodeGeneration(true)
//            .genericModelSubstitutes(ResponseEntity.class)
//            .select()
//            .paths(regex(DEFAULT_INCLUDE_PATTERN))
//            .build();
        return docket;
    }
}
