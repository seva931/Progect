import java.util.Scanner;

public class ForTaskSolver {
    public static void main(String[] args) {
      // numberThree();
       // numberOneN();
       // multiplication();
       // numberOneTen();
       // checkSimpleNumber();

    }
    public static void numberThree() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void numberOneN() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void multiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            int res = n * i;
            System.out.println(n + " * " + i + " = " + res );
        }
    }

    public static void numberOneTen() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void checkSimpleNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        boolean simple = true;
        if (a <= 1) {
            simple = false;
        } else {
            for (int i = 2; i <= a / 2; i++) {
                if (a % 2 == 0) {
                    simple = false;
                    break;
                }

            }
        }
        if (simple) {
            System.out.println("Простоe");
        } else {
            System.out.println("Непростое");
        }
    }

}
