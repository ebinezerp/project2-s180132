package my.personal.project.portal_backend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("my.personal.project")
@EnableTransactionManagement
public class HibernateConfig {

	@Bean
	public DataSource getDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/portal?useSSL=false");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}

	@Bean
	public SessionFactory getSessionFactory(DataSource dataSource) {
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);
		// add the properties to hibernate

		builder.addProperties(getProperties());

		// Perform Spring-based scanning for entity classes, registering them as
		// annotated classes with this Configuration.

		builder.scanPackages("my.personal.project.portal_backend.model");

		// Building sesion Factory and returns a SessionFactory Object for to create a
		// Bean

		return builder.buildSessionFactory();

	}

	public Properties getProperties() {
		// creating a properties object to set for LocalSessionFactoryBuilder
		Properties pros = new Properties();
		// adding all the hibernate properties to the created properties object.
		/*
		 * 
		 * http://docs.jboss.org/hibernate/orm/3.3/reference/en/html/session-
		 * configuration.html
		 * 
		 * Follow the above link to know about hibernate properties.
		 * 
		 * Some of the hibernate properties are adding here according to our simple
		 * project requirements.
		 * 
		 * 
		 */

		// org.hibernate.dialect.Dialect which allows Hibernate to generate SQL
		// optimized for a particular relational database.
		pros.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		// This property is for to show sql statements in the console.
		pros.setProperty("hibernate.show_sql", "true");
		// hibernate.format_sql is for to prettify the sql statements in console.
		pros.setProperty("hibernate.format_sql", "true");

		// hibernate.hbm2ddl.auto is a Miscellaneous Properties
		/*
		 * Automatically validates or exports schema DDL to the database when the
		 * SessionFactory is created. With create-drop, the database schema will be
		 * dropped when the SessionFactory is closed explicitly.
		 */

		pros.setProperty("hibernate.hbm2ddl.auto", "update");

		return pros;

	}
	
	
	@Bean
	public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory)
	{
		// Hibernate TransactionManager is to maintain Single session Factory for every generated Session.
		return new HibernateTransactionManager(sessionFactory);
	}
	
	@Bean
	public HibernateTemplate getHibernateTemplate(SessionFactory sessionFactory)
	{
		return new HibernateTemplate(sessionFactory);
	}

}
