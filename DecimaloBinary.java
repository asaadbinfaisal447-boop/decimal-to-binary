import java.util.Scanner;

public class DecimaloBinary {
    public static void main(String[] args) {
        // Using 'sc' or 'input' is common for students
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your number:");
        int n = sc.nextInt();
        
        String res = ""; // Short variable names like 'res' or 's' look more human
        
        // Simple check for zero
        if (n == 0) {
            System.out.println("0");
        } else {
            // The literal way students are taught to convert
            while (n > 0) {
                int rem = n % 2;
                res = rem + res; // Putting the number in front flips the binary
                n = n / 2;
            }
            System.out.println("Binary is: " + res);
        }
    }
}