import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void printThreeWords() {
        System.out.println("Orange" + "Banana" + "Apple");
    }

    public static void checkSumSign() {
        int a = 2;
        int b = -5;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else
            System.out.println("Сумма отрицательная");

    }

    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers() {
        int a = 20;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void checkSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int b = sc.nextInt();
        System.out.println("Введите второе целое число: ");
        int a = sc.nextInt();
        if (b + a >= 10 && b + a <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }

    }

    public static void positiveOrNegativeNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int number = sc.nextInt();
        if (number >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static void trueOrFalse() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void printStringInConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String times = sc.nextLine();
        System.out.println("Сколько раз напечатать: ");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++)
            System.out.println(times);
    }

    public static boolean leapYearOrNot() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void arrayTask() {
        int[] array = new int[]{1, 1, 0, 0, 1, 0, 1, 0, 0};
        System.out.println("Исходный массив:  " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println("Измененный массив:" + Arrays.toString(array));
    }

    public static void arrayTask2() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println("Измененный массив:" + Arrays.toString(array));
    }

    public static void arrayTask3() {
        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив:  " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 6) {
                array[i] *= 2;
            }
        }
        System.out.println("Измененный массив:" + Arrays.toString(array));
    }

    public static void arrayTask4() {
        int[][] array = new int[4][4];
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(".......");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][3 - i] = 1;
                if (i == j) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void arrayTask5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер и число в массиве: ");
        int len = sc.nextInt();
        int initialValue = sc.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        } System.out.println("Исходный массив:  " + Arrays.toString(array));
    }

    public static int[] arrayTask6(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void main(String[] args) {
        //printThreeWords();
        //checkSumSign();
        //printColor();
        //compareNumbers();
        //checkSum();
        //positiveOrNegativeNumber();
        //trueOrFalse();
        //printStringInConsole();
        //leapYearOrNot();
        //arrayTask();
        //arrayTask2();
        //arrayTask3();
        //arrayTask4();
        //arrayTask5();
    }
}


