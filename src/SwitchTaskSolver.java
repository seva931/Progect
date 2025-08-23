import java.util.Scanner;

public class SwitchTaskSolver {
    public static void main(String[] args) {
       // checkDay();
       // ticketPrice();
       // evaluation();
       // command();
       // calculator();

    }

    public static void checkDay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;

            default:
                System.out.println("Ошибка: введите число от 1 до 7");
        }
        scanner.close();
    }

    public static void ticketPrice () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7");
        int day = scanner.nextInt();
        if (day >= 1 && day <= 5) {
            System.out.println("300 рублей");
        } else if (day == 6 || day == 7) {
            System.out.println("450 рублей");
        } else {
            System.out.println("Ошибка: введите число от 1 до 7");
        }
        scanner.close();
    }

    public static void evaluation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите результат теста");
        int a = scanner.nextInt();
        if (a >= 90 && a <= 100) {
            System.out.println("А");
        } else if (a >= 80 && a <= 89) {
            System.out.println("B");
        } else if (a >= 70 && a <= 79) {
            System.out.println("C");
        } else if (a >= 60 && a <= 69) {
            System.out.println("D");
        } else if (a < 60) {
            System.out.println("F");
        } else {
            System.out.println("Ошибка: введите число от 0 до 100");
        }
        scanner.close();
    }

    public static void command() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите команду");
        String command = scanner.nextLine();
        switch (command) {
            case "start":
                System.out.println("Система запущена");
                break;
            case "stop":
                System.out.println("Система приастоновлена");
                break;
            case "restart":
                System.out.println("Система перезапущена");
                break;
            case "status":
                System.out.println("Система работает исправно");
                break;
            default:
                System.out.println("Неизвестная команда");
        }
        scanner.close();
    }

    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int num2 = scanner.nextInt();
        System.out.println("Выберите операцию");
        char operator = scanner.next().charAt(0);
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(result);
                break;
            case '/':
                if (num2 != 0) {
                    result = (double) num1 / num2;
                    System.out.println(result);
                } else {
                    System.out.println("На 0 делить нельзя");
                }
                break;
            default:
                System.out.println("Ошибка");

        }
        scanner.close();

    }

}
