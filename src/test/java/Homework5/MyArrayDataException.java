package Homework5;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }

    public static int processArray(String[][] array){

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    System.err.println("Невалидные данные в массиве[" + i + "][" + j + "]: " + array[i][j]);
                }
            }
        }
        return sum;
    }
}


