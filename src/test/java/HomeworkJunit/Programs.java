package HomeworkJunit;

import java.util.Scanner;

public class Programs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для вычисления факториала: ");
        int num1 = scanner.nextInt();
        long factorial = calculateFactorial(num1);
        System.out.println("Факториал числа " + num1 + " = " + factorial);


        System.out.print("Введите основание треугольника: ");
        double base = scanner.nextDouble();
        System.out.print("Введите высоту треугольника: ");
        double height = scanner.nextDouble();
        double area = calculateTriangleArea(base, height);
        System.out.println("Площадь треугольника = " + area);


        System.out.print("Введите первое целое число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int num3 = scanner.nextInt();
        System.out.println("Сложение = " + (num2 + num3));
        System.out.println("Вычитание = " + (num2 - num3));
        System.out.println("Умножение = " + (num2 * num3));
        if (num3 != 0) {
            System.out.println("Деление = " + ((double) num2 / num3));
        } else {
            System.out.println("Деление на ноль невозможно");
        }


        System.out.print("Введите первое целое число для сравнения: ");
        int num4 = scanner.nextInt();
        System.out.print("Введите второе целое число для сравнения: ");
        int num5 = scanner.nextInt();
        if (num4 > num5) {
            System.out.println(num4 + " больше " + num5);
        } else if (num4 < num5) {
            System.out.println(num4 + " меньше " + num5);
        } else {
            System.out.println(num4 + " равно " + num5);
        }

        scanner.close();
    }

    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль.");
        }
        return (double) a / b;
    }
    public static int compare(int a, int b) {
        return Integer.compare(a, b);
    }
}


