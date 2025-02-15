import java.util.*;

public class AlgorithmVisualizer {
    public void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\n=== Algorithm Visualization ===");
            System.out.println("1. Fibonacci Series");
            System.out.println("2. Factorial Calculation");
            System.out.println("3. Binary Search");
            System.out.print("Choose an algorithm: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    fibonacciSeries();
                    break;
                case 2:
                    System.out.print("Enter a number for factorial: ");
                    int num = scanner.nextInt();
                    System.out.println("Factorial of " + num + " is: " + factorial(num));
                    break;
                case 3:
                    binarySearch();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private void fibonacciSeries() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of terms: ");
            int n = scanner.nextInt();
            int a = 0, b = 1, temp;
            System.out.print("Fibonacci Series: " + a + " " + b);
            for (int i = 2; i < n; i++) {
                temp = a + b;
                a = b;
                b = temp;
                System.out.print(" " + temp);
            }
        }
        System.out.println();
    }

    private int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    private void binarySearch() {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] arr = {2, 5, 7, 10, 15, 20};
            System.out.print("Enter number to search: ");
            int key = scanner.nextInt();
            int left = 0, right = arr.length - 1;
            boolean found = false;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] == key) {
                    System.out.println("Element found at index: " + mid);
                    found = true;
                    break;
                } else if (arr[mid] < key) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            if (!found) {
                System.out.println("Element not found.");
            }
        }
    }
}
