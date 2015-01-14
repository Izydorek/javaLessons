package lesson6;

import utills.Utils;

public class Potegi {

	public static void main(String[] args) {

		int[] array = new int[10];
		
		for(int y = 1; y <= 10; y++){
			array[y - 1] = y * y; 
		}
		
		Utils.printArrays(array);
	}

}
