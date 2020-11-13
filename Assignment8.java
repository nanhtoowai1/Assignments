import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment8 {
	public static void main(String[] args) {
		try {
			Scanner input1=new Scanner(System.in);
			System.out.print("Enter your deposit for one month: ");
			double deposit=input1.nextDouble();
			
			Scanner input2=new Scanner(System.in);
			System.out.print("Enter your interest rate for one month: ");
			double interestrate=(input2.nextDouble())/100;
			input1.close();
			input2.close();
			
			double newdeposit=deposit;
			double balance=0;
			double interest;
			for(int i=1;i<=12;i++) {
				
				interest=newdeposit*interestrate;
				balance=interest+newdeposit;//52.5
				
				System.out.println("Balance after "+i+"month is "+Math.round(balance*100.0)/100.0);
				newdeposit=deposit+balance;//52.5
			}
			System.out.println("Balance after a year is "+Math.round(balance*100.0)/100.0);
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("Please enter number");
		}
		
	}
}
