package javaOdevIntro;

public class recapDemo1 {

	public static void main(String[] args) {
		int sayi1 = 100;
		int sayi2 = 40;
		int sayi3 = 50;
		int enBuyuk = sayi1;
		
		if(enBuyuk<sayi2) {
			enBuyuk = sayi1;
		}
		
		if(enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En buyuk sayi: " + enBuyuk);
		

	}

}
