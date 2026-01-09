package workshop10;
public class BankApp {
    public static void main(String[] args) {
        SavingsAccount save = new SavingsAccount(1001, "John Doe", 5000.0);
        CurrentAccount curr = new CurrentAccount(2001, "Jane Smith", 5000.0);

        System.out.println("--- Savings Account ---");
        System.out.println(save.toString());
        System.out.println("Default Interest: $" + save.calculateInterest());
        System.out.println("Interest at 5% rate: $" + save.calculateInterest(5.0));

        System.out.println("\n--- Current Account ---");
        System.out.println(curr.toString());
        System.out.println("Default Interest: $" + curr.calculateInterest());
        System.out.println("Interest at 1% rate: $" + curr.calculateInterest(1.0));
    }
}