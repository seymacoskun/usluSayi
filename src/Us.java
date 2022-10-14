import java.util.Scanner;

public class Us {

	public static void main(String[] args) {
		int taban, us, toplam=1;
		Scanner inp = new Scanner(System.in);
		System.out.println("Ussu alýnacak sayi: ");
		taban = inp.nextInt();
		System.out.println("Us olacak sayi");
		us = inp.nextInt();
		
		for(int i=1; i<=us; i++) {
			toplam *= taban;
		}
		System.out.println("Cevap: " +toplam);
	}

}
