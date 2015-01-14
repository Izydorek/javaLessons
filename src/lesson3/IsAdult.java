package lesson3;

public class IsAdult {

	public static void main(String[] args) {

		boolean isAniaAdult = isAdult(20);
		
		printMature("Ania", isAdult(12));
		printMature("Jan", isAdult(20));
	}

	public static void printMature(String imie, boolean isAdult) {
		if (isAdult == true) {
			System.out.println(imie + " jest Doros³y/a");
		} else {
			System.out.println(imie + " nie jest Doros³y/a");
		}
	}

	public static boolean isAdult(int wiek) {
		if (wiek >= 18) {
			return true;
		} else {
			return false;
		}
	}

}
