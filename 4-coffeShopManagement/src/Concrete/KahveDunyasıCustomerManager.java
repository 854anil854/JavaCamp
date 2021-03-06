package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class KahveDunyasıCustomerManager extends BaseCustomerManager {
	private CustomerCheckService checkService;
	
	public KahveDunyasıCustomerManager(CustomerCheckService checkService) {
		this.checkService = checkService;
	}

	@Override
	public void save(Customer customer) {
		if (checkService.checkPerson(customer)) {
			System.out.println("New user for Kahve Dünyası - Saved to database verified user : " + customer.getFirstName() + " " + customer.getLastName());
		}else {
			System.out.println("Not a valid person");
		}
	}
}
