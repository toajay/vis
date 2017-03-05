package com.vis.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
//I'm Sonali
@Configuration
@EnableSwagger2
@EnableWebMvc
//I'm Ajay testing conflict
public class SwaggerConfig{
	/*@Bean
	public Docket api() {                
	    return new Docket(DocumentationType.SWAGGER_2)          
	      .select()
	      .apis(RequestHandlerSelectors.basePackage("com.vis.rest"))
	      .paths(PathSelectors.ant("/visrest/*"))
	      .build()
	      .apiInfo(apiInfo());
	}
	 
	private ApiInfo apiInfo() {
		 return new ApiInfoBuilder()
	                .title("VIS Rest Services")
	                .description("VIS Rest Services with Swagger")
	                .termsOfServiceUrl("https://github.com/toajay")
	                .contact("Ajay Kumar")
	                .license("Apache License Version 2.0")
	                .licenseUrl("https://github.com/toajay")
	                .version("2.0")
	                .build();
	    }*/
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.any())                          
          .build();                                           
    }
}
