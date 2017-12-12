package my.personal.project.portal_middleware.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("my.personal.project")
@EnableWebMvc
public class ApplicationContext implements WebMvcConfigurer{

}
