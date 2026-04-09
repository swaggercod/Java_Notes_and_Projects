// Code Example (CSV random lottery generator):

import java.io.*;
import java.util.*;

public class Day8_RandomCSV {
    public static void main(String[] args) throws IOException {
        Random rand = new Random();
        FileWriter fw = new FileWriter("lottery.csv", true);
        
        int num = rand.nextInt(100) + 1; // 1-100
        fw.append(num + "\n");
        fw.close();
        System.out.println("🎲 Random number saved: " + num);
    }
}
