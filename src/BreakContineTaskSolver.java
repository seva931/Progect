import java.util.Scanner;

public class BreakContineTaskSolver {
    public static void main(String[] args) {
        // numberNegative();
        // numberPassThree();
        // numberAlwaysPositive();
        // stop();

    }
    public static void numberNegative() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Введите число");
            int a = scanner.nextInt();
            if (a < 0) {
                break;
            }
            sum += a;
        }
        System.out.println(sum);
    }

    public static void numberPassThree() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0)
            continue;
            System.out.println(i);

        }
    }

    public static void numberAlwaysPositive() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число");
            int a = scanner.nextInt();
            if (a < 0) {
                continue;
            }
            System.out.println(a);
        }

    }

    public static void stop() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите команду");
            String string = scanner.nextLine();
            if (string.equals("stop")) {
                break;
            }
        }
        System.out.println("Конец");
    }

}

