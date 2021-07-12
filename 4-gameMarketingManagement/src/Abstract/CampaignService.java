package Abstract;

import Entities.Campaign;
import Entities.Game;

public interface CampaignService {
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
	void applyMultipleDiscount(Game[] games, Campaign campaign);
	void applyDiscount(Game game, Campaign campaign);
}
