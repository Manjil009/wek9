package week9workshop;
public class Employee{
 protected int employeeId;
    protected String name;
    protected double basicsalary;

    
    public Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicsalary = basicsalary;
    }

 
    public void displayVehicleInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: $" + basicsalary);
    }

        
    public double basicsalary() {
        return basicsalary * 0.10;
    }
}