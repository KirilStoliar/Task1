import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();

        comparison(a, b);
        mathOperations(a, b);
    }

    public static void comparison(int a, int b) {
        if (a > b) System.out.printf("Введенные вами числа имеют следующий результат: %s > %d\n", a, b);
        else if (a < b) System.out.printf("Введенные вами числа имеют следующий результат: %s < %d\n", a, b);
        else System.out.printf("Введенные вами числа имеют следующий результат: %s = %d\n", a, b);
    }

    public static void mathOperations(int a, int b) {
        System.out.println("Результатом сложения двух введеных цифр будет: " + (a + b));
        System.out.println("Результатом вычитания двух введеных цифр будет: " + (a - b));
        System.out.println("Результатом умножения двух введеных цифр будет: " + (a * b));
        System.out.println("Результатом деления двух введеных цифр будет: " + (a / b));
    }
}