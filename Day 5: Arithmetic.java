import java.io.*;
import java.util.*;

public class Day5_ArithmeticCSV {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total bill: ");
        double total = sc.nextDouble();
        System.out.print("Number of people: ");
        int people = sc.nextInt();
        
        double each = total / people;
        
        FileWriter fw = new FileWriter("bill_split.csv", true);
        fw.append(total + "," + people + "," + each + "\n");
        fw.close();
        System.out.printf("Each person pays: %.2f\n", each);
    }
}
