package lesson11.bank;

public class Account {

	private int amount;

	
	
	public Account(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void decreaseAmount(int by) {

		this.amount = amount - by;

	}

	public void increaseAmount(int by) {

		amount = amount + by;

	}

	public void transferTo(Account to, int a){
		
		this.decreaseAmount(a);
		to.increaseAmount(a);
		
	}
	
	@Override
	public String toString() {
		return "Account [amount=" + amount + "]";
	}

	public static void main(String[] args) {

	}

}
