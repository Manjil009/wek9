package workshop10;
public class Nurse extends Person
{
    private String shift;
    private double extraAllowance;
    
    public Nurse(int id,String name,String shift,double extraAllowance){
        super(id,name);
        this.shift=shift;
        this.extraAllowance=extraAllowance;
    }
    @Override
    public double calculateSalary(){
        return super.calculateSalary() + extraAllowance;
    }
    @Override
    public String toString(){
        return super.toString()+", Shift:"+shift;
    }
}