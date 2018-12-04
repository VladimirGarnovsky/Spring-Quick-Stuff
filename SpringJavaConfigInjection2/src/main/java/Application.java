import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vladimir.service.UserService;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService service = appContext.getBean("userService",UserService.class);
		System.out.println(service.findAll().get(0).getName() +" | "+ service.findAll().get(0).getSalary());

	}

}
