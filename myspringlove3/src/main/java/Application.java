import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vovex.service.UserService;

import myspringlove.service.CustomerService;
import myspringlove.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		    ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
			CustomerService customerservice = appContext.getBean("customerService",CustomerService.class);			
			System.out.println(customerservice.findAll().get(0).getName());
	

	}

}
