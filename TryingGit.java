package tryProject;

public class TryingGit {

	public static void main(String[] args) {
		int salary = 25000;
		double bonus =  5000;
		double total = salary + bonus;
		double pay;
		double tax;
		if (salary <= 15000)
		{
			tax = total * .10;
			pay = total - tax;
			System.out.println("Amount credited to your account is "+ pay);
		}else if (salary<= 30000 ) {
			tax = total * .20;
			pay = total - tax;
			System.out.println("Amount credited to your account is " + pay);
			
		}else { 
			tax=total * .30;
			pay = total - tax;
			System.out.println("Amount credited to your account is "+ pay);
		// TODO Auto-generated method stub

	}

}}
