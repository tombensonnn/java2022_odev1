package javaOdevIntro;

public class loopDemo {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i+=2) {
			System.out.println(i);
		}
		
		System.out.println("Dongu bitti");

		
		int[] sayilar = {1,2,3,4,5};
		int sayac = 0;
			
		
		while (sayac<sayilar.length) {
			System.out.println(sayilar[sayac]);
			sayac++;
		}
		
	}

}
