package workshop10.Q5;
public class PremiumOrder extends Order
{
    private double taxRate=0.05;
    public PremiumOrder(String orderId,String customerName,double amount){
        super(orderId,customerName,amount);
    }
    @Override
    public double calculateFinalAmount(){
        return super.calculateFinalAmount() + (getAmount() * taxRate);
    }
    public double calculateFinalAmount(double discountAmount){
        return calculateFinalAmount() - discountAmount;
    }
}
