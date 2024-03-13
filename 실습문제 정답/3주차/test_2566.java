import java.util.Scanner;

public class test_2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int max = 0;
        int row = 1;
        int column = 1;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int n = sc.nextInt();
                if (n > max) {
                    max = n;
                    row = i;
                    column = j;
                }
            }
        }

        System.out.println(max);
        System.out.println(row + " " + column);

        sc.close();
    }
}
