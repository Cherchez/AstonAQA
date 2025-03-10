public class Animal {
    String name;
    int runLimit;
    int swimLimit;

    static int animalCount = 0;
    static int dogCount = 0;
    static int catCount = 0;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        animalCount++;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " метров.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " метров.");
        }
    }

    public void swim(int distance) {
        if (swimLimit == 0) {
            System.out.println(name + " не умеет плавать.");
        } else if (distance <= swimLimit) {
            System.out.println(name + " проплыл " + distance + " метров.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " метров.");
        }
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public static int getDogCount() {
        return dogCount;
    }

    public static int getCatCount() {
        return catCount;
    }

    public void incrementDogCount() {
        dogCount++;
    }

    public void incrementCatCount() {
        catCount++;
    }
}

class PetTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик");
        Cat cat1 = new Cat("Симон");
        Cat cat2 = new Cat("Лекса");

        dog.run(200);
        dog.swim(5);

        cat1.run(100);
        cat1.swim(5);

        cat2.run(300);
        cat2.swim(300);

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Собак: " + Animal.getDogCount());
        System.out.println("Котов: " + Animal.getCatCount());
    }
}