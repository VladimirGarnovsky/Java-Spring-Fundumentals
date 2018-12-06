import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vladimir.repository.CustomerRepository;
import com.vladimir.repository.CustomerRepositoryImpl;
import com.vladimir.service.CustomerService;
import com.vladimir.service.CustomerServiceImpl;

@Configuration
public class AppConfig {
	
	@Bean(name="customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new CustomerRepositoryImpl();
	}
	@Bean(name="customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl service = new CustomerServiceImpl();
		service.setCustomerRepository(getCustomerRepository());
		return service;
	}
}
