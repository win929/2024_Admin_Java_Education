public class Main {
    public static void main(String[] args) {
        Quadrangle q1 = new Quadrangle(3);
        System.out.println("사각형의 넓이 : " + q1.area());
        System.out.println("사각형의 둘레 : " + q1.perimeter());

        Quadrangle q2 = new Quadrangle(3, 4);
        System.out.println("사각형의 넓이 : " + q2.area());
        System.out.println("사각형의 둘레 : " + q2.perimeter());
    }
}

