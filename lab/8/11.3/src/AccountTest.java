import java.util.Date;
import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Account account1 = new Account(01252, 20000,10);
		Account account2 = new SavingsAccount();
		Account account3 = new CheckingAccount();
		account1.deposit(3000);
		account1.withdraw(2500);
		System.out.println("Account ID:" + account1.getId());
		System.out.println("Your Balance is:" + account1.getBalance());
		System.out.println("Interest Rate:"+ account1.getMonthlyInterestRate());
		System.out.println("Date Created:"+ account1.getDateCreated());
		System.out.println("Account:" + account1.toString());
		System.out.println("Account 2:"+ account2.toString());
		System.out.println("Account 3:"+ account3.toString());
}
}