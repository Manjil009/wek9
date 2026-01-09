package workshop10;
public class HospitalApp
{
    public static void main(String[] args){
        Doctor doc=new Doctor(101,"Dr.Smith","Cardiology",500.0);
        Nurse nur=new Nurse(201,"Nurse Joy","Night",200.0);
        
        System.out.println("--Hospital System--");
        System.out.println(doc.toString()+"| Total Salary:$"+doc.calculateSalary());
        System.out.println("Doctor Salary (with 2 cases):$"+doc.calculateSalary(2));
        
        System.out.println("-------------------");
        System.out.println(nur.toString()+"| Total Salary:$"+nur.calculateSalary());
    }
}