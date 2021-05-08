package gun4odev3;

public class SellGameManager {
	public void sellGame(Gamer gamer, Game game) {
		System.out.println(gamer.getUsername() + " kiþisi oyunu " + game.getPriceAfterDiscount() + " TL fiyattan satýn aldý.");
		gamer.setHasBought(true);
	}
}