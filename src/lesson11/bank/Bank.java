package lesson11.bank;

public class Bank {
	
	//private Account[] accounts = new Account[3];

	public static void transferAmount(Account from, Account to, int amount){
		from.decreaseAmount(amount);
		to.increaseAmount(amount);
	}
	
	
	
	public static void main(String[] args) {
	
		Account a1 = new Account(2871);
		Account a2 = new Account(300);
		System.out.println(a1);
		System.out.println(a2);
		transferAmount(a1, a2, 100);
		System.out.println(a1);
		System.out.println(a2);
		transferAmount(a1, a1, 100);
		System.out.println(a1);
		System.out.println(a2);
		
		a1.transferTo(a2, 200);
		System.out.println(a1);
		System.out.println(a2);
		
		transferAmount(a1, null, 100);
		System.out.println(a1);
		System.out.println(a2);
	}

}
