package gun4odev3;

import java.util.ArrayList;
import java.util.Scanner;         

public class Systems {
	private ArrayList<Gamer> gamers;
	static Scanner scanner = new Scanner(System.in);
	
	public Systems() {
		gamers = new ArrayList<Gamer>();
	}
	
	public void register(Gamer gamer) {
		System.out.println("E Devlet ile giri�: ");
		System.out.print("TC: ");
		String tc = scanner.nextLine();
		
		System.out.print("Ad: ");
		String name = scanner.nextLine();
		
		System.out.print("Soyad: ");
		String lastName = scanner.nextLine();
		
		System.out.print("Do�um y�l�: "); 
		int yearOfBirth = scanner.nextInt();
		
		if (gamer.getTcNo().equals(tc) && gamer.getName().equals(name) && gamer.getLastName().equals(lastName) 
				&& gamer.getYearOfBirth() == yearOfBirth ) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Kullan�c� ad� belirleyin: ");
			String userName = scan.nextLine();
			gamer.setUsername(userName);
			gamers.add(gamer);	
			System.out.println("Kay�t ba�ar�l�.");
		}
		
		else {
			System.out.println("Kullan�c� bilgileri E Devlet bilgileriyle �rt��m�yor.");
			System.exit(0);
		}
	}
	
	public void update(Gamer gamer) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Yeni kullan�c� ad�: ");
		String userName = scan.nextLine();
		gamer.setUsername(userName);
		System.out.println("Kullan�c� ad� g�ncellendi.");
		
	}
	
	public void delete(Gamer gamer) {
		gamers.remove(gamer);
		System.out.println("Silme i�lemi ba�ar�l�.");
	}
}