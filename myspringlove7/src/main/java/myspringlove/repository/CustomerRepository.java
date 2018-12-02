package myspringlove.repository;

import java.util.List;

import myspringlove.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}