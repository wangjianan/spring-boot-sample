package com.yfengchan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2 {

	  @Bean
	  public Docket swaggerSpringMvcPlugin() {
	    return new Docket(DocumentationType.SWAGGER_2)
	    		.apiInfo(apiInfo())
	            .groupName("sample-api")
	            .select()
	              .apis(RequestHandlerSelectors.basePackage("com.learn")) //Selection by RequestHandler
	              .paths(PathSelectors.any()) // and by paths
	              .build();
	  }
	  
	  private ApiInfo apiInfo() {
	        return new ApiInfoBuilder()
	                .title("Spring Boot With Swagger2 for RESTful APIs")
	                .description("For More details, please refer to Swagger site:http://swagger.io/")
	                .contact("yfengchan")
	                .version("1.0")
	                .build();
	    }

	  //Here is an example where we select any api that matches one of these paths
	  /*private Predicate<String> paths() {
	    return or(
	        regex("/business.*"),
	        regex("/some.*"),
	        regex("/contacts.*"),
	        regex("/pet.*"),
	        regex("/springsRestController.*"),
	        regex("/test.*"));
	  }*/
}
