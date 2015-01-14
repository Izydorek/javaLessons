package lesson4;

public class flow {

	public static void main(String[] args) {

		System.out.println("siema");

		System.out.println("siema " + 8);

		String x = null;

		// String x = "dss";

		System.out.println(x);

		x = "Ksi¹¿ka ";

		int y = 0;

		System.out.println(y);

		x = x + y;

		System.out.println(x);

		x = (x + y) + (y + 3) * 2; // Ksi¹¿ka 006

		System.out.println(x);

		boolean b = true;

		System.out.println(b);

		x = "b = " + b;

		b = true && false;

		b = false || false && true || true;

		System.out.println(b);

		b = true == false && true;

		y = 3;

		b = y > 1 || !(y * y != 9);

		String s;

		if (b) {

			s = "dsoo2";
			
			System.out.println(x + s);
			
		} else {
			
			s = null;
			
		}
		System.out.println(s);
	}
}
