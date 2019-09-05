package Question_5;

import java.util.Scanner;

public class question_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers of cells n: ");
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of a" + i + ": ");
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i<n; i++) {
            if(a[i]>i) {
                System.out.println(a[i] + " > " + i + ": " + a[i]);
            }
        }
    }
}
