package my.personal.project.portal_middleware.configuration.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;



// This class is used to enable web security and configure it to our application

@Configuration
@EnableWebSecurity
public class WebAppSecurity extends WebSecurityConfigurerAdapter {

	/* This configuration method is to configure HttpSecurity */

	/*
	 * HttpSecurity ===============
	 * 
	 * This HttpSecurity is similar like <http> where we used in our first project
	 * to restrict the url form the access based on the authentication and
	 * authorization.
	 * 
	 * By default it restrict all the URL's from all the users but we can configure
	 * it depending on our requirement.
	 * 
	 * 
	 */

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("http authentication");

		http.authorizeRequests().anyRequest().authenticated();
		
	}

}
