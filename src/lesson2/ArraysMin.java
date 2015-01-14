package lesson2;

public class ArraysMin {
	public static void main(String[] args) {

		int min = Integer.valueOf(args[0]);

		for (int i = 1; i < args.length; i++) {
			int x = Integer.valueOf(args[i]);
			if (x < min) {
				min = x;
			}

		}
		System.out.println(min);
	}
}