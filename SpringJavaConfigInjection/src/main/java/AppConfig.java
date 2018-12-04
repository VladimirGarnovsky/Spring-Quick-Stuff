import org.springframework.context.annotation.Bean;

import com.vladimir.repository.UserRepository;
import com.vladimir.repository.UserRepositoryImpl;
import com.vladimir.service.UserService;
import com.vladimir.service.UserServiceImpl;

public class AppConfig {
	@Bean(name = "userRepository")
	public UserRepository getUserRepository() {
		UserRepositoryImpl repository = new UserRepositoryImpl();
		
		return repository;
	}
	@Bean(name="userService")
	public UserService getUserService() {
		UserServiceImpl service = new UserServiceImpl();
		service.setUserRepository(getUserRepository());
		
		return service;
	}
}
