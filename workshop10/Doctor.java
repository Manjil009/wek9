package workshop10;
public class Doctor extends Person
{
    private String specialization;
    private double consultationFee;
    public Doctor(int id,String name,String specialization,double consultationFee){
        super(id,name);
        this.specialization=specialization;
        this.consultationFee=consultationFee;
    }
    @Override
    public double calculateSalary(){
        return super.calculateSalary() + consultationFee;
    }
    public double calculateSalary(int emergencyCases){
        return this.calculateSalary() + (emergencyCases * 100.0);
    }
    @Override
    public String toString(){
        return super.toString()+",Specialization:"+specialization;
    }
}