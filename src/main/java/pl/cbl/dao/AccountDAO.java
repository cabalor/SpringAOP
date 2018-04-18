package pl.cbl.dao;

import org.springframework.stereotype.Component;

import pl.cbl.aop.startClass.Account;

@Component
public class AccountDAO {

	
	public void addAcount(Account acc, boolean premAcc) {
		System.out.println(getClass() + " - everything is fine");
	}
	
	
	public boolean write() {
		
		System.out.println("piszemy piszemy w koncie" + getClass());
		
		return true;
	}
	
}
