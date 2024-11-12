import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름: ");
        String name = sc.next();
        System.out.print("나이: ");
        int age = sc.nextInt();
        System.out.print("급여: ");
        int pay = sc.nextInt();

        System.out.println("===== Person =====");
        Person p = new Person(name, age, pay);
        p.print();

        System.out.println("===== Manager =====");
        Manager m = new Manager(name, age, pay);
        m.print();
    }
}

class Person {
    String name;
    int age;
    int pay;

    Person(String name, int age, int pay) {
        this.name = name;
        this.age = age;
        this.pay = pay;
    }

    void print() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("급여: " + pay);
    }
}

class Manager extends Person {
    Manager(String name, int age, int pay) {
        super(name, age, pay);
    }

    void print() {
        super.print();
        System.out.println("보너스: " + pay * 0.5);
    }
}
