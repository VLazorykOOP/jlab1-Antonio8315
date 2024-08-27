import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть  n (n <= 15): ");
        int n = scanner.nextInt();

        if (n > 15) {
            System.out.println("Розмір n не повинен перевищувати 15.");
            return;
        }

        int[][] A = new int[n][n];
        System.out.println("Введіть елементи матриці А:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            A[i][j] = scanner.nextInt();

            }
        }

        int[][] B = new int[n][n];
        System.out.println("Введіть елементи матриці B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = scanner.nextInt();

            }
        }

        int[] X = new int[n];

        for (int i = 0; i < n; i++) {
            X[i]=1;
            for (int j = 0; j < n; j++) {
                if(A[i][j] <= B[i][j]){
                    X[i]=0;
                    break;
                }

            }
        }

        System.out.print("X: ");
        for (int i = 0; i < n; i++) {
            System.out.print(X[i] + " ");
        }
        scanner.close();
    }
}
