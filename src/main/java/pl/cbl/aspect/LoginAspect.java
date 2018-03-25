package pl.cbl.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAspect {

	
	
	@Before("execution(public void addAcount())")
	public void doSmthbefore(){
		System.out.println("we are doing this before method");
	}
	
}
