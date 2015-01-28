package lesson10;

public class RunTest {

	public static void main(String[] args) {
		
	Transmision transmision = new Transmision(false, 6);
	Engine engine = new Engine(50, 3);
	Car car = new Car(4, "KMY 2334", engine, transmision);  //referencja -> engine&& trensmision
	Colour colour = Colour.GREEN;
	
	car.colour = Colour.GREEN;
	
	System.out.println(car);
	}
	
}
