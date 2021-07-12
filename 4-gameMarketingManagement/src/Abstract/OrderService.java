package Abstract;

import Entities.Game;
import Entities.Gamer;
import Entities.Order;

public interface OrderService {
	void cancel(Game game, Gamer gamer, Order order);
	void buy(Gamer gamer, Game[] games);
}
