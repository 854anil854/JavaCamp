package Concrete;

import Abstract.BaseGamePlatformManager;
import Abstract.GamerCheckService;
import Entities.Gamer;

public class SteamGamerManager extends BaseGamePlatformManager {
	private GamerCheckService gamerCheckService;

	public SteamGamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if (gamerCheckService.checkGamer(gamer)) {
			System.out.println("Welcome to steam game platform : " + gamer.getFirstName());
		}else {
			System.out.println("Not a valid person. Try again.");
		}
	}
	
	@Override
	public void update(Gamer gamer) {
		System.out.println("A user updated : " + gamer.getFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("A user deleted : " + gamer.getFirstName());
	}

	@Override
	public void getUser(Gamer gamer) {
		System.out.println("First Name : " + gamer.getFirstName() +
							" Last Name : " + gamer.getLastName() +
							" TC No : " + gamer.getNationalIdentity() +
							" Date of Birth: " + gamer.getDateOfBirth() +
							" Balance : " + gamer.getWallet()
							);
		
	}

	@Override
	public void getAllUsers(Gamer[] gamer) {
		for (Gamer player : gamer) {
			System.out.println("First Name : " + player.getFirstName() +
					" Last Name : " + player.getLastName() +
					" TC No : " + player.getNationalIdentity() +
					" Date of Birth: " + player.getDateOfBirth() +
					" Balance : " + player.getWallet()
					);
		}
		
	}
	
	
}
