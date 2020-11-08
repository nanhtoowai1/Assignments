import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
		
		try {
			
			Scanner input1=new Scanner(System.in);
			System.out.print("Enter your deposit money per month: ");
			double depositperMonth=input1.nextDouble();
			
			Scanner input2=new Scanner(System.in);
			System.out.print("Enter interest rate(%): ");
			double interestRate=(input2.nextDouble())/100;
			
			double depositperYear=depositperMonth*12;
			double balance=depositperYear+depositperYear*interestRate;
			System.out.println("Your balance is "+balance);
			
			input1.close();
			input2.close();
		} 
		catch (InputMismatchException e) {
			System.out.println("You entered the string value");
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
