package codingbat.warming1;

public class SleepIn {

	public static void main(String[] args) {
		testSleepIn(false, false, true);
		testSleepIn(true, false, false);
		testSleepIn(false, true, true);
		testSleepIn(true, true, true);
	}

	public static boolean sleepIn(boolean weekday, boolean vacation) {
		return true;
	}

	public static void testSleepIn(boolean weekday, boolean vacation,
			boolean expectedResult) {

		boolean result = sleepIn(weekday, vacation);

		String resultTekst;

		if (result || !expectedResult) {
			resultTekst = " ok ";
		} else {
			resultTekst = " wrong ";
		}

		System.out.println("sleepIn: " + weekday + ", " + vacation
				+ resultTekst + ". expected: " + expectedResult + ". actual: "
				+ result);

	}
}
