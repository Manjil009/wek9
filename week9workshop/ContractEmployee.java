package week9workshop;
public class ContractEmployee extends Employee {
    private int workingDays;
    public ContractEmployee(int employeeId, String name, double basicSalary, int workingDays) {
        super(employeeId, name, basicSalary);
        this.workingDays = workingDays;
    }

    
    public double calculateTotalSalary() {
        return basicsalary * workingDays;
    }
}