package com.example.demo.service;

import java.util.List;

import com.example.demo.Entity.Customer;

public interface CustomerService {

	
	public List<Customer> getAllCustomers();
	public Customer findCustomerById(int id);
	public String saveCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public String deleteCustomerById(int id);
	public Customer findCustomerByEmail(String email);
	
}
