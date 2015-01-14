package lesson6;

import utills.Utils;

public class Potega2 {

	public static void main(String[] args) {

		int[] arraya = new int[10];
		
		
		for(int y = 1; y <= 10; y++){
			int pot = (int) Math.pow(2, y); 
			arraya[y - 1] = pot ;
		}
		
		Utils.printArrays(arraya);
		
		int[] arrayb = new int[10];
		
		
		for(int y = 1; y <= 10; y++){
			int pot = (int) Math.pow(4, y); 
			arrayb[y - 1] = pot ;
		}
		
		Utils.printArrays(arrayb);
		
		int[] arrayc = new int[10];
		
		
		for(int y = 1; y <= 10; y++){
			int pot = (int) Math.pow(5, y); 
			arrayc[y - 1] = pot ;
		}
		
		Utils.printArrays(arrayc);
	}
}
