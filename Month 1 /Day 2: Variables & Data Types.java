/**
 * Educational Note:
 * Java is strongly typed - every variable must have a declared type.
 * Common types: int (integers), double (decimals), String (text), boolean (true/false)
 */
public class Day2_Variables {
    public static void main(String[] args) {
        // Primitive types
        int studentId = 101;        // Whole numbers
        double gpa = 3.75;          // Decimal numbers
        boolean isActive = true;    // True or false
        
        // Reference types
        String name = "John Doe";   // Text (object)
        
        System.out.println("📊 Student Record");
        System.out.println("Name: " + name);
        System.out.println("ID: " + studentId);
        System.out.println("GPA: " + gpa);
        System.out.println("Status: " + (isActive ? "Active" : "Inactive"));
    }
}
