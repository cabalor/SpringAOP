package pl.cbl.aop.startClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.cbl.dao.AccountDAO;
import pl.cbl.dao.MembershipDAO;

public class AppStart {

	
	
	public static void main(String[] args) {
		
	
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); // we rad a app config here
		
		AccountDAO acountDao = context.getBean("accountDAO", AccountDAO.class); // we are geting a bean here id our dao class
		
		MembershipDAO membDEO = context.getBean("membershipDAO", MembershipDAO.class);
		
		
		Account ac = new Account();
		
		acountDao.addAcount(ac, true); // calling method in dao class
		
		acountDao.addAcount(ac, false);
		acountDao.write();
		
		membDEO.addAcount();
		
		membDEO.addKuap();
		
		
		context.close();
		
	}
	
	
}
