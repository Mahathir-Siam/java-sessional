import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner checkEven = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = checkEven.nextInt();

        System.out.print("Enter the ending number: ");
        int end = checkEven.nextInt();

        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }

        int[] evenNumbers = new int[count];
        int index = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenNumbers[index++] = i;
            }
        }

        System.out.println("Even numbers in the given range:");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }

        checkEven.close();
    }
}
