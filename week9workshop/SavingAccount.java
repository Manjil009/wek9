package week9workshop;
public class SavingAccount extends BankAccount
{
    private double interestrate;
    public SavingAccount(String accountnumber,String accountname,double balance,double interestrate){
        super(accountnumber,accountname,balance);
        this.interestrate=interestrate;
    }public double Interest(){
        return super.gbalance()*interestrate/100;
    }
    
}