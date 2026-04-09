public class main {
    public static void main(String[] args){

        // ternary operator ? = Return 1 of 2 values if a condition is true
        // variable = (condition) ? ifTrue : ifFalse;

        //int hours = 13;
        // String timeofday = (hours < 12) ? "A.M." : "P.M.";

        int income = 30000;
        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.println(taxRate);

    }
}
