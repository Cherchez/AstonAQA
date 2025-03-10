package Homework5;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);

        String[][] correctArray = {
                {"11", "2", "32", "4"},
                {"23", "10", "17", "88"},
                {"44", "51", "11", "12"},
                {"13", "42", "75", "16"}
        };

        String[][] incorrectArray = {
                {"1", "2", "A", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "44", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int sumCorrect = processArray(correctArray);
            System.out.println("Сумма элементов массива: " + sumCorrect);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных в массиве: " + e.getMessage());
        }

        try {
            int sumIncorrect = processArray(incorrectArray);
            System.out.println("Сумма элементов массива: " + sumIncorrect);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных в массиве: " + e.getMessage());
        }
    }

    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Массив должен быть размером 4x4.");
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }
}
