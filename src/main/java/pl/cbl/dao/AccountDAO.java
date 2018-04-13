package pl.cbl.dao;

import org.springframework.stereotype.Component;

import pl.cbl.aop.startClass.Account;

@Component
public class AccountDAO {

	
	public void addAcount(Account acc) {
		System.out.println(getClass() + " - everything is fine");
	}
	
	
	
}
