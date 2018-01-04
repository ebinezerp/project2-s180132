package my.personal.project.portal_middleware.intializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import my.personal.project.portal_middleware.configuration.ApplicationContext;
import my.personal.project.portal_middleware.configuration.security.WebAppSecurity;

public class ApplicationIntializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] { ApplicationContext.class,WebAppSecurity.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub

		return new String[] { "/" };
	}

}
