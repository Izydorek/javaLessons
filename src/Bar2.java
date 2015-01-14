public class Bar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int age = Integer.valueOf(args[0]);
	String name = args [1] ;
	int pay = 5 ;
	
		
		if (age > 17) {
			System.out.println("Here is your beer, you pay " + pay + "$." );
		} else {
				System.out.println("Go out, you are not 18!");
			}
		if (age >= 60) {
		System.out.println("Are You 60+? you have - 15%, you pay only " + 2 * pay + "$.");
		}
		if (name == "Janusz") {
			System.out.println("Hello Janusz, you have -5%, you pay only "  );
		} else {
			System.out.println("I don't know you");
		}
		
	}
}
