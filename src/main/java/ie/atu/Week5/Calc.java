package ie.atu.Week5;

import java.util.Scanner;

public class Calc {
    public static void main( String[] args ) {
        divide();
        subtract();
    }

    public static void divide()
    {
        System.out.println("Please enter your first number :");
        Scanner inputs = new Scanner(System.in);
        float firstNumber = inputs.nextInt();
        System.out.println("Please enter your second number :");
        float secondNumber = inputs.nextInt();
        float total = firstNumber/secondNumber;
        System.out.println("The total is " + total);
    }
    public static void subtract()
    {
        System.out.println("Enter your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber - secondNumber;
        System.out.println("Total: " + total);

    }
    public static void add(){

        System.out.printf("adding method");
        System.out.println("enter your first number");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.println("enter your second number");
        int secondNumber = input.nextInt();
        int total = firstNumber + secondNumber;
        System.out.println("The total is " + total);

    }

}
