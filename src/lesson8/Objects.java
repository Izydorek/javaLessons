package lesson8;

public class Objects {

	public static void main(String[] args) {

		System.out.println(Man.getPopulation());
		
		Man bolek;
		bolek = new Man("Bolek" , 20);

		new Man();
		
		System.out.println(Man.getPopulation());
		
		Man lolek;
		lolek = new Man("Lolek" , 30);
		
		System.out.println("name: " + bolek.name + ", age: " + bolek.age);
		
		System.out.println("name: " + lolek.name + ", age: " + lolek.age);	
		
		
		bolek.name = "Bartek";
		lolek.name = "Wac�aw";
		bolek.age = 22;
		lolek.age = 9;
		
		bolek.introduce();
		lolek.introduce();
		
		bolek.getOlder(600);
		bolek.introduce();
		
		System.out.println(Man.getPopulation());
	}

}

class Man {

	
	private static int Population;
	String name;
	int age;
	
	public Man(){
		Population++;
		name = "Adam";
		age = 1111111111;
	} 
//	constructor
	
	public Man(String name, int age){
		Population++;
		this.name = name;
		this.age = age;
	}
	
	public static int getPopulation(){
		
		return Population;
		
	}
	
	public void introduce () {
		System.out.println("name: " + this.name + ", age: " + this.age);
	}
	
	public void getOlder(int years) {
		age = age + years;
	}
	
	
}

/* 
ZADANIE: 
na podobnej zas jak population utw�rz averageAge utrzymujace sredni wiek spo�eczenstwa. PRIVATE

Rozbuduj cz�owieka o wzrost oraz metode growTall
Roz. o wag�.
Srednia waga i �redni wzrost w spo�eczenstwie.
BMI danego cz�owieka zmienna(metoda getBmi, typ zwracany double).

Zamodeluj samoch�d na podobnym.

COdingbat! !  <(-,o<)



*/