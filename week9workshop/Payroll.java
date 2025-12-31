package week9workshop;
    
public class Payroll {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "John Doe", 5000.00);
        emp.displayVehicleInfo();
        System.out.println("Calculated Value (10%): $" + emp.basicsalary());
    }
}
