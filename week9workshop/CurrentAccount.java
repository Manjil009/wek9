package week9workshop;
public class CurrentAccount extends BankAccount
{
    private double overdraftlimit;
    public CurrentAccount(String  accountnumber,String accountname,double balance,double overdraftlimit){
        super(accountnumber,accountname,balance);
        this.overdraftlimit=overdraftlimit;
    }
    public boolean withdraw(double amount){
        if(amount <= (balance +overdraftlimit)){
            balance-=amount;
            System.out.println("Withdrawn:"+amount);
            return true;
        }else
        {
            System.out.println("With denied");
            return false;
        }
    }
}