
public class SavingsAccount extends Account{
	private double overdraftLimit;
	
SavingsAccount(){
	
}

SavingsAccount(double overdraftLimit){
	this.overdraftLimit = overdraftLimit;
}
public double withdraw(double amount) {
if(amount<=getBalance()) {
	setBalance(getBalance() - amount);
}
else {
	System.err.print("You can't overdraw a Savings account");
}
return amount;
}
}