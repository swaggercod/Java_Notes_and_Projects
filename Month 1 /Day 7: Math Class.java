//  Code Example (CSV circle calculator):

import java.io.*;
import java.util.*;

public class Day9_MathClassCSV {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("circles.csv", true);
        
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        double area = Math.PI * Math.pow(r, 2);
        double circ = 2 * Math.PI * r;
        
        fw.append(r + "," + area + "," + circ + "\n");
        fw.close();
        System.out.printf("Area: %.2f, Circumference: %.2f\n", area, circ);
    }
}
