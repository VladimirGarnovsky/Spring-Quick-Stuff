import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pluralsight.service.CustomerService;
import com.vladimir.service.UserService;
import com.vladimir.service.UserServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService service = appContext.getBean("userService",UserService.class);
		System.out.println(service.findAll().get(0).getName() +" | "+ service.findAll().get(0).getSalary());

	}

}
