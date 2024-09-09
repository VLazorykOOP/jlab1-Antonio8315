import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір масиву n (n <= 400): ");
        int n = scanner.nextInt();

        if (n > 400) {
            System.out.println("Розмір масиву не повинен перевищувати 400.");
            return;
        }

        int[] A = new int[n];

        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] < 0) {
                if (i != j) {
                    int temp = A[i];
                    System.arraycopy(A, j, A, j + 1, i - j);
                    A[j] = temp;
                }
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (A[i] == 0) {
                if (i != j) {
                    int temp = A[i];
                    System.arraycopy(A, j, A, j + 1, i - j);
                    A[j] = temp;
                }
                j++;
            }
        }

        System.out.println("Перетворений масив:");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        if (n % 10 != 0) {
            System.out.println();
        }
        scanner.close();
    }
}