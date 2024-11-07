//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       /* Write a program:
        Write a Java program that performs basic arithmetic operations on two predefined
        numbers.
        The program should:
        1. Define two integer variables a and b with any values you choose.
        2. Calculate and print the result of:
        Adding a and b
        Subtracting b from a
        Multiplying a and b
        Dividing a by b (you can assume b is not zero)
        lec01-part6-Arithmetic operator 5
        Finding the remainder of a divided by b
        Example Output:
        If a = 10 and b = 3 , the program should display:
        Addition: 13
        Subtraction: 7
        Multiplication: 30
        Division: 3
        Remainder: 1
        */
        int a = 10;
        int b = 3;
        int addition = a+b;
        int subtraction = a-b;
        int multiplying = a*b;
        int division = a/b;
        int remainder = a%b;
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplying);
        System.out.println("Division: " + division);
        System.out.println("Remainder: " + remainder);


    }

}