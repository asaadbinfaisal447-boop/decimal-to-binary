import java.util.Scanner;

public class partc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your number: ");
        int myNum = input.nextInt();
        
        
        String finalBinary = decimalToBinary(myNum);
        
        System.out.println("The binary value is: " + finalBinary);
    }

   
    public static String decimalToBinary(int n) {
        String result = ""; // Start with an empty string
        
        if (n == 0) {
            return "0";
        }

        while (n > 0) {
            int rem = n % 2;
            
            result = rem + result; 
            
            n = n / 2; // Shrink the number
        }
        
        return result;
    }
}