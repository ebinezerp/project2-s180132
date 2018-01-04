package my.personal.project.portal_backend;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import my.personal.project.portal_backend.config.HibernateConfig;
import my.personal.project.portal_backend.dao.AccountDAO;
import my.personal.project.portal_backend.model.Account;

public class AccountTesting {
	
	private AnnotationConfigApplicationContext context;
	private Account account;
	private AccountDAO accountDAO;
	
	@Before
	public void setup()
	{
		context=new AnnotationConfigApplicationContext(HibernateConfig.class);
		accountDAO=(AccountDAO)context.getBean("accountDAO");
		account=new Account();
		
	}
	
	@Test
	public void addAccountTest()
	{
		account.setFirstname("ebinezer");
		
		
		assertEquals("account been created", true,accountDAO.createAccount(account));
	}

}
