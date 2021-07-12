import java.time.LocalDate;

import Abstract.BaseGamePlatformManager;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.OrderManager;
import Concrete.SteamGamerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Entities.Order;

public class Main {
	public static void main(String[] args) {
		
		BaseGamePlatformManager manager = new SteamGamerManager(new MernisServiceAdapter());
		Gamer gurkanYakar = new Gamer(1, "Gürkan", "Yakar", LocalDate.of(1998, 2, 2), "01234567890", 100);
		Gamer furkanYakar = new Gamer(2, "Furkan", "Yakar", LocalDate.of(1900, 2, 2), "01234567890", 500);
		manager.add(gurkanYakar);
		manager.add(furkanYakar);
		
		
		String csgoDescription = "Counter-Strike: Global Offensive (CS:GO) is a multiplayer first-person shooter developed by Valve and Hidden Path Entertainment. It is the fourth game in the Counter-Strike series. Developed for over two years, Global Offensive was released for Windows, macOS, Xbox 360, and PlayStation 3 in August 2012, and for Linux in 2014. Valve still regularly updates the game, both with smaller balancing patches and larger content additions.";
		Game csgo = new Game(1, "Counter-Strike: Global Offensive", csgoDescription, 123);
		
		String fallGuysDescription = "Fall Guys: Ultimate Knockout is a platform battle royale game developed by Mediatonic and published by Devolver Digital. It was released for Microsoft Windows and PlayStation 4 on 4 August 2020. The game is planned for release on Nintendo Switch, Xbox One, and Xbox Series X/S soon.";
		Game fallGuys = new Game(2, "Fall Guys", fallGuysDescription, 38);
		
		Order order = new Order(101, 2, 1);
		
		Campaign summerCampaign = new Campaign(1, "Summer campaign", 30);
		
		Game[] games = {csgo, fallGuys};
		Gamer[] gamers = {gurkanYakar, furkanYakar};
		
		System.out.println("-------------------------------base prices-------------------------------");
		for (Game game : games) {
			System.out.println("Game : " + game.getName() + "\t Price : " + game.getPrice());
		}
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.applyMultipleDiscount(games, summerCampaign);
		
		System.out.println("------------------------------apply summer discount-----------------------------------");
		for (Game game : games) {
			System.out.println("Game : " + game.getName() + "\tPrice : " + game.getPrice());
		}
		System.out.println("---------------------------all users---------------------------------------");
		manager.getAllUsers(gamers);
		System.out.println("---------------------------------------------------------------------------------");
		OrderManager orderManager = new OrderManager();
		orderManager.buy(furkanYakar, games);
		System.out.println("---------------------------------------------------------------------------------");
		orderManager.buy(gurkanYakar, games);
		System.out.println("---------------------------------------------------------------------------------");
		manager.getAllUsers(gamers);
		
	}
}
