package lesson6;

import utills.Utils;

public class Fibo {
	public static void main(String[] args) {
		
		double[] array = new double[100];
		
		array[0] = 1;
		array[1] = 1;
				
		for (int x = 2; x < 100; x++){
			array[x] = array[x - 2] + array[x - 1] ;
		}

		
		Utils.printArrays(array);
	}
}
