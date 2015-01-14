package lesson6;

import utills.Utils;

public class petla {

	public static void main(String[] args) {
		
		int[] array = new int[50];
		
		for (int x = 1; x <= 50; x = x + 2){
			System.out.print(x + ", ");
			array[(x - 1)/2] = x;
		}

		System.out.println();
		System.out.println();
		
		Utils.printArrays(array);
	}

}
