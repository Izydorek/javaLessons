package lesson9;

import lesson9.Instrument.Category;

public class Player {

	public String firstaName;
	public String lastName;
	public Instrument instrument;
	
	
	public Player(String firstaName, String lastName, Instrument instrument) {
		this.firstaName = firstaName;
		this.lastName = lastName;
		this.instrument = instrument;
	}

	public void playsong(String songName) {
		
		System.out.println(songName);
		String[] sound = {"C", "D", "E", "F", "G", "A", "H"};
		String[] hz = {"1", "3", "4", "1", "6", "3"};
		
		instrument.playnote(sound[1], hz[3]);
	}
	
	public String toString() {
		return "Player [firstaName=" + firstaName + ", lastName=" + lastName
				+ ", instrument=" + instrument + "]";
 	}
	

		
}
	


//* Instrument ma miec metode playnote  - ma pobiera� 2 parametry (obydwa String)
// 1. wysokosc dziweku / player ma miec metode playsong. ta metoda ma dostac
// tablice string�w,
// za pomoca instrumentu playera ma w pentli zagracc ca�y utw�r ze stringa
