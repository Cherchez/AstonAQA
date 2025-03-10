package Homework5;

class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);

        String[][] correctArray = {
                {"11", "2", "32", "4"},
                {"23", "10", "17", "88"},
                {"44", "51", "11", "12"},
                {"13", "42", "75", "16"}
        };

        String[][] incorrectArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        try {
            checkArraySize(correctArray);
            System.out.println("Массив правильного размера");
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }

        try {
            checkArraySize(incorrectArray);
            System.out.println("Массив правильного размера");
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkArraySize(String[][] array) throws MyArraySizeException {
        if (array.length != 4) {
            throw new MyArraySizeException("Массив должен иметь 4 строки.");
        }

        for (String[] row : array) {
            if (row.length != 4) {
                throw new MyArraySizeException("Каждая строка массива должна содержать 4 элемента.");
            }
        }
    }
}


