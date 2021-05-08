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
		System.out.println("E Devlet ile giriþ: ");
		System.out.print("TC: ");
		String tc = scanner.nextLine();
		
		System.out.print("Ad: ");
		String name = scanner.nextLine();
		
		System.out.print("Soyad: ");
		String lastName = scanner.nextLine();
		
		System.out.print("Doðum yýlý: "); 
		int yearOfBirth = scanner.nextInt();
		
		if (gamer.getTcNo().equals(tc) && gamer.getName().equals(name) && gamer.getLastName().equals(lastName) 
				&& gamer.getYearOfBirth() == yearOfBirth ) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Kullanýcý adý belirleyin: ");
			String userName = scan.nextLine();
			gamer.setUsername(userName);
			gamers.add(gamer);	
			System.out.println("Kayýt baþarýlý.");
		}
		
		else {
			System.out.println("Kullanýcý bilgileri E Devlet bilgileriyle örtüþmüyor.");
			System.exit(0);
		}
	}
	
	public void update(Gamer gamer) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Yeni kullanýcý adý: ");
		String userName = scan.nextLine();
		gamer.setUsername(userName);
		System.out.println("Kullanýcý adý güncellendi.");
		
	}
	
	public void delete(Gamer gamer) {
		gamers.remove(gamer);
		System.out.println("Silme iþlemi baþarýlý.");
	}
}