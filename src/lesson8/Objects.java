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
		lolek.name = "Wac³aw";
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
na podobnej zas jak population utwórz averageAge utrzymujace sredni wiek spo³eczenstwa. PRIVATE

Rozbuduj cz³owieka o wzrost oraz metode growTall
Roz. o wagê.
Srednia waga i œredni wzrost w spo³eczenstwie.
BMI danego cz³owieka zmienna(metoda getBmi, typ zwracany double).

Zamodeluj samochód na podobnym.

COdingbat! !  <(-,o<)



*/