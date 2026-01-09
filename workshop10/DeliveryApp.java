package workshop10;
public class DeliveryApp {
    public static void main(String[] args) {
        BikeDelivery bike = new BikeDelivery(101, "Alex", 50.0);
        CarDelivery car = new CarDelivery(201, "Sarah", 50.0);

        System.out.println("--- Bike Delivery Details ---");
        System.out.println(bike.toString());
        System.out.println("Standard Payment: $" + bike.calculatePayment());
        System.out.println("Payment with 5 extra orders: $" + bike.calculatePayment(5));

        System.out.println("\n--- Car Delivery Details ---");
        System.out.println(car.toString());
        System.out.println("Standard Payment: $" + car.calculatePayment());
        System.out.println("Payment with 5 extra orders: $" + car.calculatePayment(5));
    }
}