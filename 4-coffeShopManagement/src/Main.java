import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.KahveDunyasýCustomerManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {
	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1, "Omer Guzel", "Sahin", LocalDate.of(1996, 5, 1), "01234567890"));
	
		BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager2.save(new Customer(2, "Gurkan", "Yakar", LocalDate.of(1998, 2, 9), "01234567890"));
		
		BaseCustomerManager customerManager3 = new KahveDunyasýCustomerManager(new MernisServiceAdapter());
		customerManager3.save(new Customer(3, "Canan", "Eroglu", LocalDate.of(2000, 1, 30), "01234567890"));
	}
}
