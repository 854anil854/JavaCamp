package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService checkService;
	
	public StarbucksCustomerManager(CustomerCheckService checkService) {
		this.checkService = checkService;
	}

	@Override
	public void save(Customer customer) {
		if (checkService.checkPerson(customer)) {
			System.out.println("New user for Starbucks - Saved to database verified user : " + customer.getFirstName() + " " + customer.getLastName());
		}else {
			System.out.println("Not a valid person");
		}

	}


	

}
