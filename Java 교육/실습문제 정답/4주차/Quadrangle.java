public class Quadrangle {
    int a;
    int b;

    Quadrangle(int a) {
        this.a = a;
        this.b = a;
    }

    Quadrangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int area() {
        return a * b;
    }

    public int perimeter() {
        return 2 * (a + b);
    }
}

