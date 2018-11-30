package myspringlove.repository;

import java.util.ArrayList;
import java.util.List;

import myspringlove.model.Customer;

public class CustomerRepositoryImpl implements CustomerRepository {
	List<Customer> customers = new ArrayList<>();
	
	public CustomerRepositoryImpl() {
		Customer customer = new Customer();
		customer.setAge(20);
		customer.setName("Vladimir Garnovski EX repository implementation");
		customers.add(customer);
	}
	@Override
	public List<Customer> findAll(){
		return customers;
	}
}
