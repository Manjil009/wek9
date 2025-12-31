package week9workshop;
public class Teacher extends Person
{
    private String subject;
    private double bonus;
    
    public Teacher(int id,String name,double basicsalary,String subject,double bonus){
        super(id,name,basicsalary);
        this.subject=subject;
        this.bonus=bonus;
    }
    public double salaryannual(){
        return super.salaryannual()+bonus;
    }
}