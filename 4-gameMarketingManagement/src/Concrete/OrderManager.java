package Concrete;

import Abstract.OrderService;
import Entities.Game;
import Entities.Gamer;
import Entities.Order;

public class OrderManager implements OrderService {

	@Override
	public void cancel(Game game, Gamer gamer, Order order) {
		System.out.println("Your order cancelled.");
		
	}

	@Override
	public void buy(Gamer gamer, Game[] games) {
		// TODO Auto-generated method stub
		double totalPrice = 0;
		for (Game game : games) {
			totalPrice += game.getPrice();
		}
		
		if (gamer.getWallet() >= totalPrice) {
			gamer.setWallet(gamer.getWallet()-totalPrice);
			System.out.println(gamer.getFirstName() + ",Your payment has been confirmed.");
			System.out.println("The amount of your order is " + totalPrice);
			System.out.println("Your new balance : " + gamer.getWallet());
		}else {
			System.out.println(gamer.getFirstName() + ",Insufficient funds..! Current balance : " + gamer.getWallet() );
			System.out.println("The amount of your order is " + totalPrice);
		}
	}
	

	

}
