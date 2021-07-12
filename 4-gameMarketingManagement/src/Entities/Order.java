package Entities;

import Abstract.Entity;

public class Order implements Entity{
	private int id;
	private int gameId;
	private int gamerId;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(int id, int gameId, int gamerId) {
		this.id = id;
		this.gameId = gameId;
		this.gamerId = gamerId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}
	
	
}
