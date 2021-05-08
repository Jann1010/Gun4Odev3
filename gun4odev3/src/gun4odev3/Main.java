package gun4odev3;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer(1, "Aziz Can", "ÖZ", "11111111111", 2000);
		
		Systems systems = new Systems();
		systems.register(gamer);
		
		Game game = new Game(1000);
		
		Campaign campaign = new Campaign(10);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign, game);
		
		SellGameManager gameManager = new SellGameManager();
		
		gameManager.sellGame(gamer, game);
		
		systems.update(gamer);
		
		campaignManager.updateCampaign(campaign, 30, game);
		gameManager.sellGame(gamer, game);
		
		campaignManager.deleteCampaign(campaign, game);
		gameManager.sellGame(gamer, game);
	}
}