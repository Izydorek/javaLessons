package lesson7;

import utills.Utils;

public class Sumka {

	public static void main(String[] args) {
	
		int x = Integer.valueOf(args[0]);
		
		if(x < 1){
			System.out.println("Liczba " + x + "nie jest liczb¹ naturaln¹");		
		}
		
		int a = 1;

		int[] array = new int[1];
		
		for (int y = 1; a <= x; y = y + a){
			a = a + 1;
		//	array[a] = y;
			System.out.println(y);
	}

		
		Utils.printArrays(array);
}
}
