package Homework5;

public class Exercise4 {

    public static void main(String[] args) {
        int[] array = new int[6];
        try {
            int value = array[15];
            System.out.println("Значение: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано исключение: " + e.toString());
        }
        System.out.println("Программа продолжает выполнение после обработки исключения.");
    }
}

