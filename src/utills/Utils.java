package utills;

public class Utils {
	public static void printArrays(int[] array) {
		System.out.print("[");

		for (int x = 0; x <= array.length - 1; x++) {
			System.out.print(array[x]);
			if (x <= array.length - 2) {
				System.out.print(", ");
			}

		}
		System.out.println("]");
	}
	public static void printArrays(double[] array) {
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


