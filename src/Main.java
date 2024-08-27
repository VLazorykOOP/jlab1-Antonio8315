import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lab 1 Java");
        System.out.println("Task 1.1:");
        System.out.print("Введіть число m: ");
        float m = scanner.nextInt();
        System.out.print("Введіть число n: ");
        float n = scanner.nextInt();

        float answer = (float) (((n + 1) / Math.pow(n, 2) * n + 2) + ((m + n) / (m - n) + Math.pow(n,3)));
        System.out.println("Answer: " + answer);


        System.out.println("Task 1.2:");
        System.out.print("Введіть число m1: ");
        int m1 = scanner.nextInt();
        System.out.print("Введіть число n1: ");
        int n1 = scanner.nextInt();

        float answer1 = (float) (((n1 + 1) / Math.pow(n1, 2) * n1 + 2) + ((m1 + n1) / (m1 - n1) + Math.pow(n1,3)));
        System.out.println("Answer: " + answer1);


        System.out.println("Task 1.3:");
        System.out.print("Введіть число m2: ");
        float m2 = scanner.nextInt();
        System.out.print("Введіть число n2: ");
        float n2 = scanner.nextInt();

        int answer2 = (int) (((n2 + 1) / Math.pow(n2, 2) * n2 + 2) + ((m2 + n2) / (m2 - n2) + Math.pow(n2,3)));
        System.out.println("Answer: " + answer2);
        scanner.close();
    }
}
