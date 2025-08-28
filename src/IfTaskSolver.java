import java.util.Scanner;

public class IfTaskSolver {
    public static void main(String[] args) {
      // checkNumberPlus();
      // checkNumberMax();
      // checkNumberOneFive();
      // numberCheckParity();
      // discond();
      // checkBall();


    }
    public static void checkNumberPlus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println("Число положительное");
        } else if (a < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }
    }

    public static void checkNumberMax() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public static void checkNumberOneFive() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = scanner.nextInt();
        if (a > 5 || a < 1) {
            System.out.println("Оценка не может быть больше 5 или меньше 1");
        } else if (a == 5) {
            System.out.println("Отлично");
        } else if (a == 4) {
            System.out.println("Хорошо");
        } else if (a == 3) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Неудовлетворительно");
        }
    }

    public static void numberCheckParity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println(a + " Четное");
        } else {
            System.out.println(a + " Нечетное");
        }
    }

    public static void discond() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст:");
        int a = scanner.nextInt();
        if (a < 18) {
            System.out.println("Скидка 25%");
        } else if (a > 65) {
            System.out.println("Скидка 30%");
        } else {
            System.out.println("Скидка недоступна");
        }
    }

    public static void checkBall() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите результат теста:");
        int a = scanner.nextInt();
        if (a > 100 || a < 0) {
            System.out.println("Результат не может быть больше 100 или меньше 0");
        } else if (a >= 90) {
            System.out.println("Отлично");
        } else if (a >= 75 && a <= 89) {
            System.out.println("Хорошо");
        } else if (a >= 60 && a <= 74) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Неудовлетворительно");
        }
    }

}
