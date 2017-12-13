package org.mahikero01.service;

import java.util.List;

import org.mahikero01.model.Customer;
import org.mahikero01.repository.CustomerRepository;
import org.mahikero01.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl () {
		
	}
	
	public CustomerServiceImpl (CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
}
