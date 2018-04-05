package pl.cbl.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAspect {

	
	//@Before("execution(public void pl.cbl.dao.AccountDAO.addAcount())") // add account inly from specific class
	//@Before("execution(public void addAcount())") // any add acount
	//@Before("execution(public void updateAcount())")
	@Before("execution(public void add*())")
	public void doSmthbefore(){
		System.out.println("we are doing this before method now update");
	}
	
}
