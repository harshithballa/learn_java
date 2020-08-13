//package learning;
import java.util.Scanner;
class Account {
	int id;
	double balance;
	double interestRate;
	
	public Account(int id, double balance, double ir) {
		this.id = id;
		this.balance = balance;
		this.interestRate = ir;
	}
	
	public int  getId() {
		return id;
	}
	public void setId(int i) {
		this.id = i;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}


}


public class NC1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		double b = sc.nextDouble();
		double ir = sc.nextDouble();
		
		Account ac = new Account(i, b, ir);
		
		int noOfYears = sc.nextInt();
		
		double result = calculateInterest(ac, noOfYears);
		
		System.out.format("%.3f",result);
		
		
		
	}
	
	public static double calculateInterest(Account a, int y) {
		int i = a.id;
		double b = a.balance;
		double ir = a.interestRate;
		
		ir = ir + (ir/100)*y ;
		return ( b * ir )/ 100;
	}
}
