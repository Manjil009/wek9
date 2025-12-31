package week9workshop;
public class Person
{
    protected int id;
    protected String name;
    protected double basicsalary;
    public static String collegename="ING";
    
    public Person(int id,String name,double basicsalary){
        this.id=id;
        this.name=name;
        this.basicsalary=basicsalary;
    }
    public double salaryannual(){
        return basicsalary*12;
    }
}