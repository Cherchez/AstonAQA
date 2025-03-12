package Homework5;

public class Main {
    public static void main(String[] args) {
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };


        String[][] invalidArrayRows = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "+", "12"}
        };


        String[][] invalidArrayCols = {
                {"1", "2", "3", "4", "5"},
                {"5", "6", "A", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        MyArraySizeException.processArray(validArray);
        MyArraySizeException.processArray(invalidArrayCols);
        MyArraySizeException.processArray(invalidArrayRows);
        System.out.println(MyArrayDataException.processArray(validArray));
        System.out.println(MyArrayDataException.processArray(invalidArrayCols));
        System.out.println(MyArrayDataException.processArray(invalidArrayRows));

    }
}

