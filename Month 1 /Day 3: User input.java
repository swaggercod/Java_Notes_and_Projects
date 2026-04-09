
//Code Example (CSV user registration):

import java.io.*;
import java.util.*;

public class Day3_UserInputCSV {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileWriter fw = new FileWriter("users.csv", true);
        
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter city: ");
        String city = scanner.nextLine();
        
        fw.append(name + "," + age + "," + city + "\n");
        fw.close();
        System.out.println("✅ Saved to users.csv");
        scanner.close();
    }
}
