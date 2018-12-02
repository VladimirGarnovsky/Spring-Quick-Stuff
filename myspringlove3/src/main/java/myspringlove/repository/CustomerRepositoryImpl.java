package myspringlove.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import myspringlove.model.Customer;


@Repository("customerRepository")
public class CustomerRepositoryImpl implements CustomerRepository {
	List<Customer> customers = new ArrayList<>();
	
	public CustomerRepositoryImpl() {
		Customer customer = new Customer();
		customer.setAge(20);
		customer.setName("Vladimir Garnovski EX repository implementation");
		customers.add(customer);
	}
	public CustomerRepositoryImpl(Customer c) {
		customers.add(c);
	}
	public CustomerRepositoryImpl(String name) {
		Customer customer = new Customer();
		customer.setAge(20);
		customer.setName(name);
		customers.add(customer);
	}
	@Override
	public List<Customer> findAll(){
		return customers;
	}
}
