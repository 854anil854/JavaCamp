package interfaces;

public class Main {

	public static void main(String[] args) {
		//interface newlenmez
		Customer customer = new Customer(1, "John", "Doe");
		
		//CustomerManager customerManager = new CustomerManager(new EmailLogger());
		Logger[] loggers = {new DatabaseLogger(),new EmailLogger()};
		CustomerManager customerManager2 = new CustomerManager(loggers);
		
		customerManager2.addMultiple(customer);
		
	}

}
