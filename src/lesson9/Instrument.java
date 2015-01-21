package lesson9;

public class Instrument {
	
	public enum Category {
		
		STRINGS, BRASS, PERCUSSION
		
	}
	private Category category;
	private String name;
	private String sound;
	private String hz;
	
	public Instrument (Category category, String name){
		this.category = category;
		this.name = name;
		
	}
	
	public void playnote(String sound, String hz){
		this.sound = sound;
		this.hz = hz;
		
		System.out.println(name + " is playing " + sound);
	}
	
	

	
	public String toString() {
		return "Instrument [category=" + category + ", name=" + name + "]";
	}
	
	public static void main(String[] args) {
		Instrument instrument = new Instrument(Category.STRINGS , "Gitara");
		
		System.out.println(instrument);
	}
	

	
	
}
//* Instrument ma miec metode playnote  - ma pobieraæ 2 parametry (obydwa String) 1. wysokosc dziweku / 
// player ma miec metode playsong. ta metoda ma dostac tablice stringów, za pomoca instrumentu playera ma w pentli zagracc ca³y utwór ze stringa
