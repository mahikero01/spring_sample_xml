package org.mahikero01.repository;

import java.util.ArrayList;
import java.util.List;

import org.mahikero01.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see org.mahikero01.repository.CustomerRepository#findAll()
	 */
	
	private String dbUsername;
	
	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}

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
