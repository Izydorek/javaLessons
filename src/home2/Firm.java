package home2;

public class Firm {

	public static void main(String args[]) {
		
	/*	Worker worker1 = new Worker();
		Worker worker2 = new Worker();
		
		worker1.name = "Jack";
		worker1.sname = "First";
		worker1.age = 21;
		
		worker2.name = "Bob";
		worker2.sname = "Yel";
		worker2.age = 34;
		
		System.out.println("Pracownik 1: " + worker1.name + " " + worker1.sname + ", " + worker1.age + " years." );
		System.out.println("Pracownik 2: " + worker2.name + " " + worker2.sname + ", " + worker2.age + " years." ); */
		
		Worker[] workers = new Worker[3];
		
		String[] names = {"Jack", "Chuck", "Bob"};
		String[] snames = {"First", "Yel", "Luck"};
		int[] ages = {34, 17, 21};
		
		for(int i = 0; i < workers.length; i++){
			
			workers[i] = new Worker();
			workers[i].name = names[i];
			workers[i].sname = snames[i];
			workers[i].age = ages[i];
			
		}
		
		System.out.println("Pracownicy firmy:");
		for(int i = 0; i < workers.length; i++){
			System.out.println(workers[i].name + " " + workers[i].sname + " " + workers[i].age + " years.");
			
		}
		
		
		
		
		
	}
	
}
