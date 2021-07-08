package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer gurkanYakar = new IndividualCustomer();
		gurkanYakar.setCustomerNumber("1921221043");
		
		CorparateCustomer hepsiBurada = new CorparateCustomer();
		hepsiBurada.setCustomerNumber("99999999");
		
		CustomerManager customerManager = new CustomerManager();
//		customerManager.add(gurkanYakar);
//		customerManager.add(hepsiBurada);
		Customer[] customers = {gurkanYakar, hepsiBurada};
		customerManager.addMultiple(customers);
	}
}
