package pl.cbl.aop.startClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.cbl.dao.AccountDAO;

public class AppStart {

	
	
	public static void main(String[] args) {
		
	
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); // we rad a app config here
		
		AccountDAO acountDao = context.getBean("accountDAO", AccountDAO.class); // we are geting a bean here id our dao class
		
		acountDao.addAcount(); // calling method in dao class
		
		acountDao.addAcount();
		
		
		
		context.close();
		
	}
	
	
}
