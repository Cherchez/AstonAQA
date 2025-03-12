package Homework5;

class MyArraySizeException extends Exception {

    public MyArraySizeException(String message) {
        super(message);
    }

    public static void processArray(String[][] array) {
        try {
            if (array.length != 4) {
                throw new MyArraySizeException("Массив должен иметь 4 строки");
            }

            for (String[] row : array) {
                if (row.length != 4) {
                    throw new MyArraySizeException("Каждная строка должна содержать 4 стобца");
                }
            }

            System.out.println("Размер массива валидный");

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.println("Элемент в [" + i + "][" + j + "]: " + array[i][j]);
                }
            }
        } catch (MyArraySizeException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}


