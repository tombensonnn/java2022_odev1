package javaOdevIntro;

public class findingNumber {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 11;
		
		boolean varMi = false;
		
		
		for (int i : sayilar) {
			if(i == aranacak) {
				varMi = true;
			}
		}
		
		if(varMi) {
			System.out.println("Aranan sayı var.");
		} else {
			System.out.println("Aranan sayı yok.");
		}
	}

}
