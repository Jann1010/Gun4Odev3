package gun4odev3;

public class SellGameManager {
	public void sellGame(Gamer gamer, Game game) {
		System.out.println(gamer.getUsername() + " ki�isi oyunu " + game.getPriceAfterDiscount() + " TL fiyattan sat�n ald�.");
		gamer.setHasBought(true);
	}
}