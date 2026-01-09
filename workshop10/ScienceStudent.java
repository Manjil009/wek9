package workshop10;
public class ScienceStudent extends Student {
    
    public ScienceStudent(int rollNo, String name, int marks) {
        super(rollNo, name, marks);
    }

    // Override method using super
    @Override
    public double calculateResult() {
        // Science students might get a 5% practical weightage bonus
        return super.calculateResult() * 1.05;
    }

    // Overload method with graceMarks
    public double calculateResult(int graceMarks) {
        return calculateResult() + graceMarks;
    }
}