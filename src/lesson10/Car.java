package lesson10;

public class Car {

	public int doors;
	public String plates;
	public Colour colour;
	public Engine engine;
	public Transmision transmision;
	
	
	
	public Car(int doors, String plates, Engine engine,
			Transmision transmision) {
		
		this.doors = doors;
		this.plates = plates;
		this.engine = engine;
		this.transmision = transmision;
		
	}


	public String toString() {
		return "Car [doors=" + doors + ", plates=" + plates + ", colour="
				+ colour + ", engine=" + engine + ", transmision="
				+ transmision + "]";
	}
	
	
	
}
