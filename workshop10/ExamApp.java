package workshop10;
public class ExamApp {
    public static void main(String[] args) {
        ScienceStudent sciStud = new ScienceStudent(501, "Aryan", 85);
        ManagementStudent mgmtStud = new ManagementStudent(701, "Deepa", 80);

        System.out.println("--- Science Student ---");
        System.out.println(sciStud.toString());
        System.out.println("Final Result: " + sciStud.calculateResult());
        System.out.println("Result with 3 Grace Marks: " + sciStud.calculateResult(3));

        System.out.println("\n--- Management Student ---");
        System.out.println(mgmtStud.toString());
        System.out.println("Final Result: " + mgmtStud.calculateResult());
        System.out.println("Result with 2 Grace Marks: " + mgmtStud.calculateResult(2));
    }
}