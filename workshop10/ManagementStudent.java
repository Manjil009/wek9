package workshop10;
public class ManagementStudent extends Student {

    public ManagementStudent(int rollNo, String name, int marks) {
        super(rollNo, name, marks);
    }
    @Override
    public double calculateResult() {
       
        return super.calculateResult() + 2.0;
    }

    public double calculateResult(int graceMarks) {
        return calculateResult() + graceMarks;
    }
}