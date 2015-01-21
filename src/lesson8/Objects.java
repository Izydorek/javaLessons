package lesson8;

import javax.print.attribute.standard.PrinterLocation;

public class Objects {

	public static void main(String[] args) {

	//	System.out.println(Man.getPopulation());
		
		Man bolek;
		bolek = new Man("Bolek" , 20, 180, 75);

	//	System.out.println(Man.getPopulation()); //population + 1 = 1
		
		new Man();

	//	System.out.println(Man.getPopulation()); //population + 1 = 2
				
		Man lolek;
		lolek = new Man("Lolek" , 30, 175, 57);
		
	//	System.out.println("name: " + bolek.name + ", age: " + bolek.age);
		
	//	System.out.println("name: " + lolek.name + ", age: " + lolek.age);	
		
		
		bolek.name = "Bartek";
		lolek.name = "Wac³aw";
		bolek.age = 22;
		lolek.age = 9;
		
		bolek.introduce();
		lolek.introduce();
	
		System.out.println();
		
		System.out.println(lolek.getBMI());
		System.out.println(bolek.getBMI());
		
		System.out.println();
		
		bolek.getOlder(600);
		bolek.introduce();
		
		lolek.growTall(13);
		lolek.introduce();
		
		System.out.println();
		
		System.out.println(Man.getPopulation());
		
		//System.out.println(Man.getaverageAge());
	}

}

class Man {

	
	private static int Population;
	private static int averageAge;
	private static double BMI;
	
	String name;
	int age;
	int height;
	int weigth;
	
	public Man(){
		Population++;
		BMI = weigth / Math.sqrt(height);
		name = "Adam";
		age = 1111111111;
		averageAge = (age + averageAge) / Population;
		height = 180;
		weigth = 80;
		
	} 
//	constructor
	
	public Man(String name, int age, int height, int weigth){
		Population++;
		BMI = weigth / Math.sqrt(height);
		averageAge = (age + averageAge) / Population;
		this.name = name;
		this.age = age;
		this.height = height;
		this.weigth = weigth;
	}
	
	public void introduce () {
		System.out.println("name: " + this.name + "; age: " + this.age + "; height: " + this.height + "; weigth " + this.weigth);
	}
	
	public static int getPopulation(){
		return Population;
	}
	
	public static int getaverageAge(){
		return averageAge;
	}
	
	public void getOlder(int years) {
		age = age + years;
	}
	
	public static double getBMI(){
		return BMI;
	}
	
	public void growTall(int tall) {
		height = height + tall;
	}
}




/* 
ZADANIE: 
na podobnej zas jak population utwórz averageAge utrzymujace sredni wiek spo³eczenstwa. PRIVATE

Rozbuduj cz³owieka o wzrost oraz metode growTall
Roz. o wagê.
Srednia waga i œredni wzrost w spo³eczenstwie.
BMI danego cz³owieka zmienna(metoda getBmi, typ zwracany double).


wypisz print static statistics

Zamodeluj samochód na podobnym.

COdingbat! !  <(-,o<)



*/