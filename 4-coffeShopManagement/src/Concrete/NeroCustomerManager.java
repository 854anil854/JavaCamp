package Concrete;

import Abstract.BaseCustomerManager;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	@Override
	public void save(Customer customer) {
		System.out.println("New user for Nero - Saved to database unverified user : " + customer.getFirstName() + " " + customer.getLastName());
	}
}
