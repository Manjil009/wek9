package week10tuto;
public class BankAccount
{
    private long accountNumber;
    private String holderName;
    private double balance;
    
    public BankAccount(long accountNumber,String holderName,double balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }
    public void setAccountNumber(long newAccountNumber)   //mutators
    {
        this.accountNumber=newAccountNumber;
    }
    public long getAccountNumber(){   //accessors
        return this.accountNumber;
    }
    public double getBalance()
    {
        return this.balance;
    }
   
    protected double getInterest()
    {
        return 0.0;
    }
    public double calculateCompoundInterest(double years)
    {
        return ((this.getBalance()*this.getInterest()*years)/100);
    }
    public void deposit(double amount)
    {
        balance
    }
}