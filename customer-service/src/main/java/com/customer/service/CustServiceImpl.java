package com.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.entity.Customer;
import com.customer.repository.customerRepository;

@Service
public class CustServiceImpl implements CustService {
	
	@Autowired
	private customerRepository customerRepository;
	
	
	@Override
	public List<Customer> fetchAllCustomers() {
		return (List<Customer>) customerRepository.findAll();
	}

	@Override
	public Customer fetchById(Long id) {
		return customerRepository.findById(id).get();
	}

	@Override
	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public String delateCustomer(Customer customer) {
		customerRepository.delete(customer);
		return "Customer is Deleted successfully for id: "+customer.getId();
	}

}
