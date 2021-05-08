package gun4odev3;

public class Game {
	private int price;
	private int priceAfterDiscount;

	public Game(int price) {
		this.price = price;
		this.priceAfterDiscount = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPriceAfterDiscount() {
		return priceAfterDiscount;
	}

	public void setPriceAfterDiscount(int priceAfterDiscount) {
		this.priceAfterDiscount = priceAfterDiscount;
	}
}