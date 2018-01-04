package my.personal.project.portal_backend.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import my.personal.project.portal_backend.dao.AccountDAO;
import my.personal.project.portal_backend.model.Account;

@Repository("accountDAO")
public class AccountDAOImpl implements AccountDAO{
	
	@Autowired
	public HibernateTemplate hibernateTemplate;

	@Override
	public boolean createAccount(Account account) {
		try
		{
			hibernateTemplate.save(account);
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	

}
