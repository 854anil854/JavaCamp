package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("A game has been added : " + game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("New updates : " + game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("A game has been deleted : " + game.getName());
		
	}



}
