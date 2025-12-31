package week9workshop;
public class BankApp
{
    public static void main(String[] args){
        SavingAccount sa=new SavingAccount("sa1010","Harry",5000.0,200.0);
        CurrentAccount ca=new CurrentAccount("ca122","Bobby",50000.0,40000.0);
        System.out.println("Saving Account");
        System.out.println(sa.accountinfo());
        sa.deposit(200.0);
        System.out.println("Attempting withdraw");
        ca.withdraw(750.0);
        System.out.println("Attempting withdraw");
        ca.withdraw(300.0);
        System.out.println("Current Balance:"+ca.gbalance());
    }
}