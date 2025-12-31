package week9workshop;

public class Bike extends Vehicle
{
    private  String engineCapacity;
    public Bike(int vehicleId,String brand,double basePrice,String engineCapacity){
        super(vehicleId,brand,basePrice);
        this.engineCapacity=engineCapacity;
    }
    public double finalprice(){
       return basePrice+super.Tax(); 
    }
    public void display(){
        super.display();
        System.out.println("Engine Capacity:"+engineCapacity);
    }
    
}