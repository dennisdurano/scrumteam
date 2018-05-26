package ScrumTeam.ScrumTeam;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Import(SpringDataRestConfiguration.class)

public class SwaggerConfig {

	
	private Set<String> DEFAULT_PC=new HashSet<String>(Arrays.asList("application/json"));

	@Bean
	public Docket api(){
		return new Docket(DocumentationType.SWAGGER_2)
				.produces(DEFAULT_PC)
				.consumes(DEFAULT_PC);
	}
	
	
}
