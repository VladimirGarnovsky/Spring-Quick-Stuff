package myspringlove.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myspringlove.model.Customer;
import myspringlove.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		System.out.println("We are using constructor injection");
		this.customerRepository = customerRepository;
	}

	//@Autowired
	private CustomerRepository customerRepository;
	
	
	//@Autowired
	public void setCustomerRepository(CustomerRepository customerrepository) {
		System.out.println("We are using setter injection");
		this.customerRepository = customerrepository;
	}

	/* (non-Javadoc)
	 * @see myspringlove.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
}
