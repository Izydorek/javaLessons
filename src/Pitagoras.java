
public class Pitagoras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int PitagorasA = Integer.valueOf(args[0]);
		int PitagorasB = Integer.valueOf(args[1]);
		int kw; // kwadrat przekatnej
		double w; //wynik
		
		kw = (PitagorasA * PitagorasA) + (PitagorasB * PitagorasB);
		w = Math.sqrt(kw);
		
		System.out.println(w);
	}
}
