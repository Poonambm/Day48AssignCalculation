import java.util.Scanner;
public class Calculations {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
               System.out.println("Enter a number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter another number:");
        int num2 = scanner.nextInt();
               
        int addition = num1 + num2;
         int subtraction = num1 - num2;
         int Multiplication = num1 * num2;   
         double num3 = num2;
         double Division = num1/num3;
         int Modulus = num1 % num2;    
        System.out.println(num1 + " + " + num2 + " = " + addition);
        System.out.println(num1 + " - " + num2 + " = " + subtraction);
        System.out.println(num1 + " * " + num2 + " = " + Multiplication);
        System.out.println(num1 + " / " + num2 + " = " + Division);
        System.out.println(num1 + " % " + num2 + " = " + Modulus);
        
                    
             
            }
        
    }

