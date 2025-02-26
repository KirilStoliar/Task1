import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = console.nextInt();
        System.out.println("Введите второе число:");
        int b = console.nextInt();

        comparison(a, b);
        mathOperations(a, b);

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите первую строку для сравнения:");
            String line1 = br.readLine();
            System.out.println("Введите вторую строку для сравнения:");
            String line2 = br.readLine();

            stringComparison(line1, line2);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Вывод четных чисел массива:");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                if (i == array.length - 1) {
                    System.out.println(array[i]);
                } else System.out.print(array[i] + ", ");
            }
        }
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

    public static void stringComparison(String a, String b) {
        if (a.equals(b)) System.out.println("Строки идентичны");
        else System.out.println("Строки неидентичны");
    }

}