package workshop10;
public class DeliveryPartner {
    private int partnerId;
    private String name;
    private double basePay;

    public DeliveryPartner(int partnerId, String name, double basePay) {
        this.partnerId = partnerId;
        this.name = name;
        this.basePay = basePay;
    }

    // Getters and Setters
    public int getPartnerId() { return partnerId; }
    public String getName() { return name; }
    public double getBasePay() { return basePay; }

    public void setPartnerId(int partnerId) { this.partnerId = partnerId; }
    public void setName(String name) { this.name = name; }
    public void setBasePay(double basePay) { this.basePay = basePay; }

    // Base calculation method
    public double calculatePayment() {
        return basePay;
    }

    @Override
    public String toString() {
        return "ID: " + partnerId + ", Name: " + name + ", Base Pay: $" + basePay;
    }
}