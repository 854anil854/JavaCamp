package oopIntro;

public class Main {
	public static void main(String[] args) {
									 //id,		name,	 price,    detail,    discount
		Product product1 = new Product(1, "Asus X550VX", 6000, "Asus Laptop", 10);
		
		Product product2 = new Product(2, "Casper Excalibur", 9999, "Casper Laptop", 33);
		
		Product product3 = new Product(3, "Lenovo V15", 8000, "Lenovo Laptop", 25);
		
		Product[] products = {product1, product2, product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		System.out.println(product1.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Mobil Phone");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Laptop");
		
		//System.out.println(category1.getName());
		//System.out.println(category2.getName());
		
		product1.setCategory(category2.getName());
		product2.setCategory(category2.getName());
		product3.setCategory(category2.getName());
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
		
		System.out.println("-----------------------------------------------------");
		for (Product product : products) {
			System.out.println("Id : "+product.getId() +
					"\nProduct name : "+product.getName() +
					"\nProduct detail : " +product.getDetail() +
					"\nProduct category :"+product.getCategory() +
					"\nProduct price : "+product.getUnitPrice() +
					"\nProduct discount rate : %"+product.getDiscount() +
					"\nProduct discounted price : "+product.getUnitPriceAfterDiscount() );
			System.out.println("-----------------------------------------------------");
		}
		}
		
}
