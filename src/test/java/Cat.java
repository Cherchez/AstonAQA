public class Cat extends Animal {
    boolean isFull;

    public Cat(String name) {
        super(name, 200, 0);
        isFull = false;
        incrementCatCount();
    }
}
