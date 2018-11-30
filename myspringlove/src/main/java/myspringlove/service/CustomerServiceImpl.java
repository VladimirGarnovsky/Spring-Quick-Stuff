package myspringlove.service;

import java.util.List;

import myspringlove.model.Customer;
import myspringlove.repository.*;

public class CustomerServiceImpl implements CustomerService {
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
