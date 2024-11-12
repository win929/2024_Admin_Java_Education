import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        while(true) {
            try {
                System.out.print("어떤 수를 나누시겠습니까? : ");
                a = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("정수를 입력해주세요. 다시 입력해주세요.");
                sc = new Scanner(System.in);
            }
        }
        while(true) {
            try {
                System.out.print("어떤 수로 나누시겠습니까? : ");
                b = sc.nextInt();
                if (b == 0) {
                    throw new ArithmeticException();
                }
                break;
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
                sc = new Scanner(System.in);
            } catch (InputMismatchException e) {
                System.out.println("정수를 입력해주세요. 다시 입력해주세요.");
                sc = new Scanner(System.in);
            }
        }
        System.out.println(a + " / " + b + " = " + a / b);
    }   
}


