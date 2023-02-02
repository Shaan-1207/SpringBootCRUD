package com.greatlearning.library.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	// Run- > http://localhost:8080/swagger-ui.html

	@Bean
	public Docket liberaryAPI() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(ApiInfo()).groupName("Liberary-API")
				.select().apis(RequestHandlerSelectors.basePackage("com.greatlearning.library.controller"))
				.build();
	}
	public ApiInfo ApiInfo(){
		return new ApiInfoBuilder().title("Shahid's Swagger API")
		.description("Library API refrence")
		.termsOfServiceUrl("fakeapi.com")
		.contact(new Contact("Library API", "fakeapi.com", "fakeapi@gmail.com"))
		.license("Liberary Licence")
		.licenseUrl("http://fakeliberary.com")
		.version("1.0")
		.build();
	}
	
}
