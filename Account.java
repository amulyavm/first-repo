package bankOA;

public class Account {

	public static void main(String[] args) {
		Bank anu = new Bank();

		anu.deposite(1000);
		anu.withdraw(55.5);
		anu.intrest();
		
		Bank ram = new Bank();
		ram.deposite(10000);
		ram.withdraw(6500.50);
		ram.intrest();
		
		anu.deposite(500);
		ram.intrest();
		ram.deposite(1000);
		ram.withdraw(500);
		anu.withdraw(1000);
		anu.intrest();
		anu.deposite(5000);
		ram.deposite(6000);
		
		
		
		// TODO Auto-generated method stub

	}

}
