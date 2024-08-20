import java.util.Scanner;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lab 1 Java");
        System.out.println("Task 1:");
        System.out.print("Введіть число x: "); //ціле
        int m = scanner.nextInt();

        // Запитуємо друге число
        System.out.print("Введіть число y: "); //ціле
        int n = scanner.nextInt();

        double dod1 = (n+1) / Math.pow(n, 2) * n +2;
        double dod2 = (m+n) / (m-n);
        double answer = dod1 + dod2;
        System.out.print("Answer: " + answer);
    }
}
