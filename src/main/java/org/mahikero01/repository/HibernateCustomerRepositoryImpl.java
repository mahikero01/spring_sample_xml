package org.mahikero01.repository;

import java.util.ArrayList;
import java.util.List;

import org.mahikero01.model.Customer;
import org.springframework.beans.factory.annotation.Value;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see org.mahikero01.repository.CustomerRepository#findAll()
	 */
	
	@Value("${dbUsername}")
	private String dbUsername;
	
	

	@Override
	public List<Customer> findAll() {
		
		System.out.println(dbUsername);
		
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		
		customer.setFirstname("Rico");
		customer.setLasstname("Sarm");
		
		customers.add(customer);
		
		return customers;
	}

}
