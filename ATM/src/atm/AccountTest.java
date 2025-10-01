package atm;

public class AccountTest {
	
		public static void main(String[] args) {
			Account myAcc = new Account("Roy Nyasha Nechombo", 1000);
			
			System.out.println("Initial Balance: " + myAcc.getBalance());

	        myAcc.deposit(200);
	        System.out.println("Current Balance: " + myAcc.getBalance());

	        myAcc.withdraw(100);
	        System.out.println("Current Balance: " + myAcc.getBalance());

	        myAcc.withdraw(700); 
	        System.out.println("Current Balance: " + myAcc.getBalance());

	        myAcc.deposit(-50); 
	        System.out.println("Final Balance: " + myAcc.getBalance());
					
		}

}
