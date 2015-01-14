package lesson2;

public class LoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean condition = true;
		int i = 1;

		while (i <= 100) {
			// System.out.println("przebiegiem " + i + " metrów");
			i++; // i = i + 1;
		}

		for (int j = 0; j < 100; j = j + 10) {
			// System.out.println("Przebieglem " + j + " metrów");
		}
		for (int j = 1; j < 10; j++) {
			if (j == 5) {
				continue;
			}
			if (j == 9){
				break;
			}
			System.out.println("Przebieglem " + j + " metrów");
		}
	}

}
