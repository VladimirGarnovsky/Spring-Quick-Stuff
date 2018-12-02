package myspringlove.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myspringlove.model.Customer;
import myspringlove.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerRepository customerRepository;
	
	
	@Override
	public void setCustomerRepository(CustomerRepository customerrepository) {
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
