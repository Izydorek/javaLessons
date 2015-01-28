package lesson10;

public class Transmision {

	public boolean automatic;
	public int gears;
	
	
	
	public Transmision(boolean automatic, int gears) {

		this.automatic = automatic;
		this.gears = gears;
		
	}

	
	public String toString() {
		return "Transmision [automatic=" + automatic + ", gears=" + gears + "]";
	}
	
	
	
}
