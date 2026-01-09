package workshop10;
public class OrderApp {
    public static void main(String[] args) {
        
        NormalOrder nOrder = new NormalOrder("N101", "Alice", 100.0);
        
        PremiumOrder pOrder = new PremiumOrder("P202", "Bob", 200.0);

        System.out.println("--- E-COMMERCE INVOICES ---");
    
        System.out.println(nOrder.toString());
        System.out.println("Final Total: $" + nOrder.calculateFinalAmount());
        
        System.out.println("---------------------------");
        System.out.println(pOrder.toString());
        System.out.println("Premium Total (10% off): $" + pOrder.calculateFinalAmount());
        System.out.println("Final Total with $5 Coupon: $" + pOrder.calculateFinalAmount(5.0));
    }
}