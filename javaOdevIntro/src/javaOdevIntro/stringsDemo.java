package javaOdevIntro;

public class stringsDemo {

	public static void main(String[] args) {
		String mesaj = "  Bugün hava çok güzel. ";
		
		System.out.println("Eleman sayısı: " + mesaj.length());
		System.out.println("Beşinci eleman: " + mesaj.charAt(4));
		System.out.println("Mesaj: " + mesaj.concat("Yaşasın!"));
		System.out.println(mesaj);
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith(" "));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('h'));
		System.out.println(mesaj.indexOf('ü'));
		System.out.println(mesaj.replace('B', 'b'));
		System.out.println(mesaj.substring(5,15));
		
		//String[] kelimeler = new String[4];
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		System.out.println(mesaj.trim()); // cümlenin sağındaki ve solundaki boşlukları siler.
		
	

	}

}
