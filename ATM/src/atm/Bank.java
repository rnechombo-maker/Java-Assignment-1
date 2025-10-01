package atm;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;


public abstract class Bank {
protected String accountName;
protected Double balance;

public Bank(String accountName, double balance) {
	this.accountName= accountName;
	this.balance= balance;
		
}
public abstract void deposit(double amount);
public abstract void withdraw(double amount);
public abstract double getBalance();

protected void transactionRecord(String message) {
	try(PrintWriter  writer = new  PrintWriter(new FileWriter("Bank.txt", true))){
		writer.println(message);

	}
	catch(IOException e) {
		System.out.println("Error Recording Transaction");
	}
	
	}
}

class Account extends Bank{
	
	public Account(String accountName, double balance) {
		super(accountName, balance);
	}
	
	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		System.out.println("You Deposited:" + amount);
		transactionRecord(accountName + " Deposited " + amount +". New Balance is: " + balance);
		}
		else {
            System.out.println("Invalid deposit amount");
            transactionRecord(accountName + " attempted invalid deposit: " + amount);
        }
	}
	@Override
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Invalid deposit amount");
			transactionRecord(accountName + " Withdrew :" + amount +". New Balance is: " + balance);
		}
		else {
            System.out.println("Invalid deposit amount");
            transactionRecord(accountName + " attempted invalid withdrawal: " + amount);
        }
			
	}
	
	@Override
	 public double getBalance() {
        transactionRecord(accountName + " checked balance: " + balance);
        return balance;
    }
	
}


	




