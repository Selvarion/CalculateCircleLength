import java.util.Scanner;

import static java.lang.Math.PI;

public class CalculateCircleLength {
    public static void main(String[] args) {

        //Formula: l = d * PI

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to calculator of a Circle length");
        System.out.println("Write a diameter of a circle (Use a decimal point for floating-point numbers): ");

        while(scan.hasNext()){
            //If the next is a number (double), print the result and close a program
            if (scan.hasNextDouble()) {
                System.out.println("Cricle length: " + (scan.nextDouble()* PI));
                break;
            }
            //If no double is found, print "It's not a number" and the token
            System.out.println("It's not a number: " + scan.next());
        }
        scan.close();
    }


}
