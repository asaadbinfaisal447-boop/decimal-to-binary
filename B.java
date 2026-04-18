import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int input = s.nextInt();
        
       
        int[] binaryArray = convert(input);
        
       
        System.out.print("Binary: ");
        for (int i = 0; i < binaryArray.length; i++) {
            System.out.print(binaryArray[i]);
        }
        System.out.println();
    }

    
    public static int[] convert(int n) {
       
        int temp = n;
        int size = 0;
        if (n == 0) size = 1;
        while (temp > 0) {
            temp = temp / 2;
            size++;
        }

        int[] arr = new int[size];
        int k = size - 1; 
        
        if (n == 0) {
            arr[0] = 0;
            return arr;
        }

       
        while (n > 0) {
            arr[k] = n % 2;
            n = n / 2;
            k--;
        }
        
        return arr;
    }
}