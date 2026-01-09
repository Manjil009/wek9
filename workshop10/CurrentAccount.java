package workshop10;
public class CurrentAccount extends Account
{

    public CurrentAccount(int accountNo, String holderName, double balance) {
        super(accountNo, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        
        return super.calculateInterest() * 0.5;
    }

    
    public double calculateInterest(double rate) {
        return getBalance() * (rate / 100);
    }
}