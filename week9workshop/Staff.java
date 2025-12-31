package week9workshop;
public class Staff extends Person
{
    private double workinghours;
    private double rateperhours;
    public Staff(int id,String name,double basicsalary, double workinghours, double rateperhour) {
        super(id, name, basicsalary);
        this.workinghours = workinghours;
        this.rateperhours = rateperhours;
    }
    public double salary() {
        return workinghours * rateperhours;
    }
}