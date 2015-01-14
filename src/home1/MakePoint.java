package home1;

public class MakePoint {
	public static void main(String atgs[]){
		
		Point point = new Point();
		point.makeX(10);
		point.makeY(20);
		System.out.println("Wspó³rzêdne punktu to ("+point.giveX()+", "+point.giveY()+")");
		
	}	
}
