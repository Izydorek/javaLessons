package lesson5;

import utills.Utils;

public class ArraysTest {

	public static void main(String[] args) {

		int[] a = new int[2];
		a = new int[4];

		a[0] = 10;
		a[1] = a[0] + 10;
		a[2] = a[1] + a[0];
		a[3] = a[2] + a[1];

		int c = 0;
		System.out.println(a[c++]);
		System.out.println(a[c++]);
		System.out.println(a[c++]);
		System.out.println(a[c]);

		System.out.println(a[3] < a[2] + a[0]);

		System.out.println(a.length);

		System.out.println(a[a.length - 1]);

		/* szybki sposób */
		int[] array = new int[] { 1, 15, 2, 3, 4, 5, 18 };

		ar(array);

		Utils.printArrays(array);
	}

	public static void ar(int[] array) {
		System.out.print("[");

		for (int x = 0; x <= array.length - 1; x++) {
			System.out.print(array[x]);
			if (x <= array.length - 2) {
				System.out.print(", ");
			}

		}
		System.out.println("]");

	}

}
