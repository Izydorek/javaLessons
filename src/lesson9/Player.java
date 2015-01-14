package lesson9;

import lesson9.Instrument.Category;

public class Player {

	private String firstaName;
	private String lastName;
	private Instrument instrument;
	
	
	public Player(String firstaName, String lastName, Instrument instrument) {
		this.firstaName = firstaName;
		this.lastName = lastName;
		this.instrument = instrument;
	}


	public String toString() {
		return "Player [firstaName=" + firstaName + ", lastName=" + lastName
				+ ", instrument=" + instrument + "]";
 	}
	
	public static void main(String[] args) {
		Instrument instrument = new Instrument(Category.BRASS, "Perkusion");
		Player player = new Player("Jan", "Kowalski", instrument);
		System.out.println(player);
		
	
	}
	

}

//* Instrument ma miec metode playnote  - ma pobieraæ 2 parametry (obydwa String) 1. wysokosc dziweku / player ma miec metode playsong. ta metoda ma dostac tablice stringów, za pomoca instrumentu playera ma w pentli zagracc ca³y utwór ze stringa
