package javaOdevIntro;

public class ArkadasSayilar {

	public static void main(String[] args) {
		int number1 = 220;
		int number2 = 284;
		
		int subMultiple1 = 0;
		int subMultiple2 = 0;
		
		for (int i = 1; i < number1; i++) {
			if(number1 % i == 0) {
				subMultiple1 += i;
			}
		}
		
		for (int i = 1; i < number2; i++) {
			if(number2 % i == 0) {
				subMultiple2 += i;
			}
		}
		
		
		if(number1 == subMultiple2 && number2 == subMultiple1) {
			System.out.println("Sayılar arkadaş sayılardır.");
		}
		
		

	}

}
