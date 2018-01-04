package my.personal.project.portal_backend.dao;


import org.springframework.stereotype.Component;

import my.personal.project.portal_backend.model.Account;

@Component
public interface AccountDAO {
	
	public boolean createAccount(Account account);

}
