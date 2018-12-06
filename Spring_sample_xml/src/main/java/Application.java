import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vladimir.service.CustomerService;

public class Application {
	
	
	public static void main(String[] args) {
	
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService service = appContext.getBean("customerService",CustomerService.class);
		System.out.println(service.findAll().get(0).getName());
		
		
	}
}