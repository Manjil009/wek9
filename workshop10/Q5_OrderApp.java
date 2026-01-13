package workshop10;
public class Q5_OrderApp
{
    public static void main(String[] args){
        Order myOrder=new PremiumOrder("p1","Manjil",3000.00);
        System.out.println("customer:"+myOrder.getCustomerName());
        System.out.println("Final Amount:Rs"+myOrder.calculateFinalAmount());
    }
}