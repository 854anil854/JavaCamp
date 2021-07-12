package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;
import Entities.Game;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("A new campaign has been added : " + campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("The campaign has been updated : " + campaign.getName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("The campaign has been deleted : " + campaign.getName());
		
	}

	@Override
	public void applyMultipleDiscount(Game[] games, Campaign campaign) {
			for (Game game : games) {
				game.setPrice(game.getPrice()-(game.getPrice()*campaign.getDiscountRate()/100));
			}
		
	}

	@Override
	public void applyDiscount(Game game, Campaign campaign) {
		game.setPrice(game.getPrice()-(game.getPrice()*campaign.getDiscountRate()/100));
		
	}
	
	

}
