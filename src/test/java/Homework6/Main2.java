package Homework6;

public class Main2 {
    public static void main(String[] args) {
        TelephoneDirectory TelephoneDirectory = new TelephoneDirectory();

        TelephoneDirectory.add("Zhibuliou", "136-52-47");
        TelephoneDirectory.add("Kazak", "137-91-29");
        TelephoneDirectory.add("Zhibuliou", "555-35-35");
        TelephoneDirectory.add("Birukova", "555-55-55");

        System.out.println("Phone numbers for Zhibuliou: " + TelephoneDirectory.get("Zhibuliou"));
        System.out.println("Phone numbers for Kazak: " + TelephoneDirectory.get("Kazak"));
        System.out.println("Phone numbers for Gordon: " + TelephoneDirectory.get("Gordon"));

    }

}
