import java.util.Scanner;

public class GetArrayMean {
    public static double getArrayMean(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            System.out.println("Array cannot be null or empty");
            System.exit(0);
            return 0.0;
        }
        
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            numbers[i] = scanner.nextInt();
        }
        
        System.out.printf("Mean of array is: %.2f", getArrayMean(numbers));
        
        scanner.close();
    }
}
