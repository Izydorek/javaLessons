package lesson7;

public class Strings {

	public static void main(String[] args) {
		
		String name = "Damian";
		System.out.println("length: " + name.length());
			
		
		for(int i = 0; i < name.length(); i++){
			System.out.print(name.charAt(i) + " ");
		}

		System.out.println();
		
		String reversename = "";
		
		
		
		for(int i = name.length() - 1; i >= 0; i--){
			System.out.print(name.charAt(i) + " ");
			reversename = reversename + name.charAt(i);
			
		}
		
		
		System.out.println();
		
		System.out.println("reversename:  " + reversename);
		
		for(int i = 0; i < name.length(); i++){
			System.out.println(reversename.substring(0, i + 1));
		} 
		
		for(int i = 0; i < name.length(); i++){
			System.out.println(reversename.substring(i , name.length()));
		} 
	}

}
