package lesson3;

public class MethodTest {

	public static void main(String[] args) {

		sayHello("ania");
		
		
	}
// public static TYP_ZWRACANY name(typp nazwap, typp nazwap)
// void - specjalny typ kt�ry nic nie zwraca
// return - u�yte w metodzie powoduje natychmiastowe zakonczenie metody i opcjonalne zwr�cenie rezultatu

	public static void sayHello(String name){
		System.out.println("hello " + name);
	}
	
	
}

