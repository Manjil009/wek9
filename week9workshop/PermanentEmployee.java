package week9workshop;
class PermanentEmployee extends Employee {
    private double houseRentAllowance; 
    private double dearnessAllowance; 

    
    public PermanentEmployee(int employeeId, String name, double basicSalary, double hra, double da) {
        super(employeeId, name, basicSalary); 
        this.houseRentAllowance = hra;
        this.dearnessAllowance = da;
    }

    
    public double calculateTotalSalary() {
        return basicsalary + houseRentAllowance + dearnessAllowance + basicsalary();
    }
}