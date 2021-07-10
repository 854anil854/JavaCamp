package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class KahveDunyasýCustomerManager extends BaseCustomerManager {
	private CustomerCheckService checkService;
	
	public KahveDunyasýCustomerManager(CustomerCheckService checkService) {
		this.checkService = checkService;
	}

	@Override
	public void save(Customer customer) {
		if (checkService.checkPerson(customer)) {
			System.out.println("New user for Kahve Dünyasý - Saved to database verified user : " + customer.getFirstName() + " " + customer.getLastName());
		}else {
			System.out.println("Not a valid person");
		}
	}
}
