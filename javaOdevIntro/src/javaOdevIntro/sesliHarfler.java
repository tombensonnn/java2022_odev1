package javaOdevIntro;

public class sesliHarfler {

	public static void main(String[] args) {
		char harf = 'İ';
		
		switch (harf) {
			case 'A':
			case 'I':
			case 'U':
			case 'O':
				System.out.println("Kalın sesli harf");
				break;
			default: 
				System.out.println("İnce sesli harf");
		}

	}

}
