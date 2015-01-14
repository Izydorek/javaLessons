
public class Bar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int age = Integer.valueOf(args[0]);
	String name = args [1];
	int pay = 5;
	
	    
		if (("Janusz".equals(name)) && (age >= 60)) {
			System.out.println("Your name is Janusz and you have " + age + " years, We have an extra promo to you, you pay only " + 0.8D * pay + "$.");
		} else if ((age > 17) && (age < 60) && ( "Janusz".equals(name))) {
		  	System.out.println("Hello " + name + ", you have -5%, you pay " + 0.95D * pay + "$.");
		} else if (age >= 60) {
		  	System.out.println("Hello " + name + ". Are you " + age + "? you have - 15%, you pay " + 0.85D * pay + "$.");
		} else if ((age > 17) && (age < 60)) {
			System.out.println("Hello " + name + ". Here is your beer, you pay " + pay + "$.");
		} else {
			System.out.println("Get out " + name + ", you are not 18!");
		}
	  }
	}
