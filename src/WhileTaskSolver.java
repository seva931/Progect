import java.util.Scanner;

public class WhileTaskSolver {
    public static void main(String[] args) {
    // factorial();
     // evenNumberN();
     // backN();
     // numberPositive();
     // password();
     // numberOneTeanDo();
     // exit();
     // countingTheNumbers();

    }
    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n");
        int n = scanner.nextInt();
        int i = 1;
        int result = 1;
        while (i <= n) {
            result *= i;
            i++;
        }
        System.out.println(result);
    }

    public static void evenNumberN() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n");
        int n = scanner.nextInt();
        int i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;

        }
    }

    public static void backN() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Ошибка");
            return;
        }
        while (n >= 1) {
            System.out.println(n);
            n--;

        }

    }

    public static void numberPositive() {
        Scanner scanner = new Scanner(System.in);
        int a;
        do {
            System.out.println("Введите число");
            a = scanner.nextInt();
            if (a <= 0) {
                System.out.println("Ошибка, число не может быть отрицательным");
            }
        } while (a <= 0);
        System.out.println("Ваше число: " + a);
    }

    public static void password() {
        Scanner scanner = new Scanner(System.in);
        String password = "Пророк";
        String string;
        do {
            System.out.println("Введите пароль");
            string = scanner.nextLine();
        } while (!string.equals(password));
        System.out.println("Добро пожаловать");
    }

    public static void numberOneTeanDo() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public static void exit() {
        Scanner scanner = new Scanner(System.in);
        String string;
        do {
            System.out.println("Введите фразу");
            string = scanner.nextLine();
        } while (!string.equals("exit"));
        System.out.println("Успешно");
    }

    public static void countingTheNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int scan = scanner.nextInt();
        int sum = 0;
        if (scan == 0) {
            sum = 1;
        }
        do {
            sum++;
            scan /= 10;
        } while (scan > 0);
        System.out.println(sum);
    }

}
