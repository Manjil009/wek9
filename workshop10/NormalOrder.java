package workshop10;
class NormalOrder extends Order {
    public NormalOrder(String orderId, String customerName, double amount) {
        super(orderId, customerName, amount);
    }
}

class PremiumOrder extends Order {
    private double membershipDiscount = 0.10;
    public PremiumOrder(String orderId, String customerName, double amount) {
        super(orderId, customerName, amount);
    }


    @Override
    public double calculateFinalAmount() {
        double base = super.calculateFinalAmount();
        return base - (base * membershipDiscount);
    }

    
    public double calculateFinalAmount(double discountAmount) {
        return this.calculateFinalAmount() - discountAmount;
    }
}