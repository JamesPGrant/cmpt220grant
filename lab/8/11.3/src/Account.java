import java.util.Date;

public class Account {
	private int ID;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
Account(){
	
}
public int getId() {
	return ID;
}
public void setId(int ID) {
	this.ID = ID;
}
public double getAnnualInterestRate() {
	return annualInterestRate;
}
public void setAnnualInterestRate(double annualInterestRate) {
	this.annualInterestRate = annualInterestRate;
}
public java.util.Date getDateCreated() {
	return dateCreated;
}
public void setDateCreated(Date dateCreated) {
	this.dateCreated = dateCreated;
}
Account(int ID, double balance, double annualInterestRate){
	this.ID = ID;
	this.setBalance(balance);
	this.annualInterestRate = annualInterestRate;
}
public Account(Date dateCreated) {
	dateCreated = new  Date();
}
public double getMonthlyInterestRate() {
	 return annualInterestRate/12;
}
public double getMonthlyInterest() {
	return getBalance() * getMonthlyInterestRate();
}
public double withdraw(double withdraw) {
	this.setBalance(this.getBalance() - withdraw);
	return withdraw;
	
}
public double deposit(double deposit) {
	setBalance(getBalance() + deposit);
	return deposit;
	
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
}

