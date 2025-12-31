package week9workshop;
public class BankAccount
{
    private String accountnumber;
    private String accountname;
    protected double balance;
    public BankAccount(String accountnumber,String accountname,double balance){
        this.accountnumber=accountnumber;
        this.accountname=accountname;
        this.balance=balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited:"+amount);
        }
        
    }
    public double gbalance(){
        return balance;
    }
    public String accountinfo(){
        return "Account:"+accountnumber+"Holder:"+accountname;
    }
}