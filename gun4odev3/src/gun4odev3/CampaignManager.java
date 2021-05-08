package gun4odev3;

import java.util.ArrayList;

public class CampaignManager {
	private ArrayList<Campaign> campaigns;

	public CampaignManager() {
		campaigns = new ArrayList<Campaign>();
	}
	
	public void addCampaign(Campaign campaign, Game game) {
		campaigns.add(campaign);
		game.setPriceAfterDiscount(game.getPrice() - (game.getPrice() * campaign.getDiscountRate() / 100));
	}
	
	public void updateCampaign(Campaign campaign, int discountRate, Game game) {
		campaign.setDiscountRate(discountRate);
		game.setPriceAfterDiscount(game.getPrice() - (game.getPrice() * campaign.getDiscountRate() / 100));
	}
	
	public void deleteCampaign(Campaign campaign, Game game) {
		campaigns.remove(campaign);
		game.setPriceAfterDiscount(game.getPrice());
	}
}