package inheritance;

public class CustomerManager {

	public void add(Customer customer) {
		System.out.println(customer.getCustomerNumber() +" ,you have successfully added.");
	}

	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			add(customer);
		}
	}
}
