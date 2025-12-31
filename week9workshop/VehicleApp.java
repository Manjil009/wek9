package week9workshop;
public class VehicleApp
{
    public static void main(String[] args){
        Car mycar=new Car(101,"Tesla",50000.00,4,"Electric");
        Bike mybike=new Bike(122,"FZ",3150,"160");
        System.out.println("Car Details");
        mycar.display();
        System.out.println("Tax:$"+mycar.Tax());
        System.out.println("Final Price:$"+mycar.finalprice());
        
        System.out.println("Bike Details");
        mybike.display();
        System.out.println("Tax:$"+mybike.Tax());
        System.out.println("Final Price:$"+mybike.finalprice());
    }
    
}