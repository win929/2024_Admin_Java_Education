import java.util.Scanner;

public class Main_3_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] score = new int[n];

        int max = 0;
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
            if (score[i] > max) {
                max = score[i];
            }
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (double) score[i] / max * 100;
        }

        System.out.println(sum / n);

        sc.close();
    }
}
