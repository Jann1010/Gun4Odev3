package gun4odev3;

public class Gamer extends Base {
	private String lastName;
	private String tcNo;
	private int yearOfBirth;
	private boolean hasBought;
	
	public Gamer(int id, String name, String lastName, String tcNo, int yearOfBirth) {
		super(id, name);
		this.lastName = lastName;
		this.tcNo = tcNo;
		this.yearOfBirth = yearOfBirth;
		this.hasBought = false;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public boolean isHasBought() {
		return hasBought;
	}

	public void setHasBought(boolean hasBought) {
		this.hasBought = hasBought;
	}
}