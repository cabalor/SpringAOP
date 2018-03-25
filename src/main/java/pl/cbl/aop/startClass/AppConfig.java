package pl.cbl.aop.startClass;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;



@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "pl.cbl.*")
public class AppConfig {

}
