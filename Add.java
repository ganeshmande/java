     /* 
     This CODE 
     will perform addition of 2 numbers
     */

import java.util.*;

public class Add
// Add 2 numbers

{
     public static void main(String args[])

    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Two Numers \n a = ");
        int a = sc.nextInt();
        System.out.print(" b = ");
        int b = sc.nextInt();

        System.out.println("         ");

        int sum = a + b;
        System.out.println("Addition Of Two Numers \n a + b = " + (sum) + "\n");

        int difference = a - b;
        System.out.println("Difference Of Two Numers \n a - b = " + (difference) + "\n");

        int product = a * b;
        System.out.println("Product Of Two Numers \n a * b =  " + (product) + "\n");

        int divide = a / b;
        System.out.println("Division Of Two Numers \n a / b =  " + (divide) + "\n");

    }

}