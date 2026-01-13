package workshop10.Q5;
public class Order
{
    private String orderId;
    private String customerName;
    private double amount;
    
    public Order(String orderId,String customerName,double amount){
        this.orderId=orderId;
        this.customerName=customerName;
        this.amount=amount;
    }
    public double getAmount()
    {
        return amount;
    }
    public String getCustomerName()
    {
        return customerName;
    }
    public double calculateFinalAmount(){
        return amount;
    }
    @Override
    public String toString(){
        return "Order ID:"+orderId+"Customer:"+customerName+"Base Amount:Rs"+amount;
    }
}
