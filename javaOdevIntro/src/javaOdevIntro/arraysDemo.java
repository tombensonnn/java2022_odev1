package javaOdevIntro;

public class arraysDemo {

	public static void main(String[] args) {
		
		String[] ogrenciler = new String[3];
		
		ogrenciler[0] = "Can";
		ogrenciler[1] = "Temmuz";
		ogrenciler[2] = "Mustafa";
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("*************");
		
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
