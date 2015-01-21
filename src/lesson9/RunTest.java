package lesson9;

import lesson9.Instrument.Category;

public class RunTest {
	
	public static void main(String[] args) {
		Instrument instrument = new Instrument(Category.BRASS, "Perkusion");
		Player muzyk = new Player("Jan", "Kowalski", instrument);
		Player muzyk2 = muzyk;
		System.out.println(muzyk.firstaName);
		muzyk = null;
		muzyk = new Player("Wojtek", "Róg", instrument);
		System.out.println(muzyk.firstaName);
		muzyk.playsong("song");
	}
}
