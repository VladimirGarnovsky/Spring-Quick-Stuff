package myspringlove.service;

import java.util.List;

import myspringlove.model.Customer;
import myspringlove.repository.CustomerRepository;

public interface CustomerService {

	void setCustomerRepository(CustomerRepository customerrepository);

	List<Customer> findAll();

}