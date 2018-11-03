
public class CheckingAccount extends Account{
	private double overdraftLimit;

CheckingAccount(){
	
}
	
CheckingAccount(double overdraftLimit){
	this.overdraftLimit = overdraftLimit;
	
}
public double getOverdrawnAmount() {
for(int overdraftLimit = 0; overdraftLimit <= 1000; overdraftLimit++ );
if(overdraftLimit >= 1000){
	System.err.println("You can't overdraw more than 1000 dollars at a time.");
}
else {
return getOverdrawnAmount();
}
return overdraftLimit;
}

}
