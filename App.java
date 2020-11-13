public class App {

	public static void main(String[] args) {
		double deposit=50;
		double interestRate=0.05;
		double newdeposit=deposit;
		
		for(int i=1;i<=12;i++) {
			
			double interest=newdeposit*interestRate;
			double balance=interest+newdeposit;//52.5
			
			System.out.println(Math.round(balance*100.0)/100.0);
			newdeposit=deposit+balance;//52.5
		}
	}

}
