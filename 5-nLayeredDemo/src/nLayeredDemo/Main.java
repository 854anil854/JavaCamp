package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.XyzProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Spring IoC 
		ProductService productService = new ProductManager(new XyzProductDao(), new JLoggerManagerAdapter());
		
		Product product = new Product(1, 25, "Laptop", 4500, 100);
		productService.add(product);

	}

}
