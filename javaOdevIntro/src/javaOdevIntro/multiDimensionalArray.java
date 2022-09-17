package javaOdevIntro;

public class multiDimensionalArray {

	public static void main(String[] args) {
		String[][] sehirler = new String[3][3];
		
		sehirler[0][0] = "Istanbul";
		sehirler[0][1] = "Canakkale";
		sehirler[0][2] = "Tekirdag";
		sehirler[1][0] = "Samsun";
		sehirler[1][1] = "Ordu";
		sehirler[1][2] = "Giresun";
		sehirler[2][0] = "Izmir";
		sehirler[2][1] = "Aydin";
		sehirler[2][2] = "Afyon";

		
		for (int i = 0; i < 3; i++) {
			System.out.println("-------------------------");
			for (int j = 0; j < 3; j++) {
				System.out.println(sehirler[i][j]);
			}
		}
	}

}
