
public class Vehicle
{
    protected int vehicleId;
    protected String brand;
    protected double basePrice;
    
    public Vehicle(int vehicleId,String brand,double basePrice){
        this.vehicleId=vehicleId;
        this.brand=brand;
        this.basePrice=basePrice;
    }
    public void display(){
    System.out.println("Vehicle ID:"+vehicleId);
    System.out.println("Brand:"+brand);
    System.out.println("Base Price:$"+basePrice);
    }
    public double Tax(){
        return 0.10*basePrice;
    }
}