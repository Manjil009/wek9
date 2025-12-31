package week9workshop;


public class Car extends Vehicle
{
    private int doors;
    private String fuelType;
    public Car(int vehicleId,String brand,double basePrice,int doors,String fuelType){
           super(vehicleId,brand,basePrice);
           this.doors=doors;
           this.fuelType=fuelType;
    }
    public double finalprice(){
        double tax=super.Tax();
        double luxuryCharge=0.05*basePrice;
        return basePrice+tax+luxuryCharge;
    }
    public void display(){
        super.display();
        System.out.println("Number of Doors:"+doors);
        System.out.println("Fuel Type:"+fuelType);
    }
}
