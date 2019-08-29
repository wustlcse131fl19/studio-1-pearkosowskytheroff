package studio1;

import support.cse131.ArgsProcessor;

public class Average {

    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        double n1 = ap.nextDouble("Enter value 1");
        double n2 = ap.nextDouble("Enter value 2");
        double average = (n1 + n2)/2;
        System.out.println("This is the average: " + average);
    }
}
