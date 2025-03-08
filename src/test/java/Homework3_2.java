public class Homework3_2 {
    public static void main(String[] args) {
        ColorAndParameters circle = new Circle(4, "Синий", "Белый");
        ColorAndParameters rectangle = new Rectangle(6, 8, "Черный", "Желтый");
        ColorAndParameters triangle = new Triangle(6, 7, 8, "Розовый", "Фиолетовый");

        printShapeDetails(circle);
        printShapeDetails(rectangle);
        printShapeDetails(triangle);
    }

    public static void printShapeDetails(ColorAndParameters colorAndParameters) {
        System.out.println("Perimeter: " + colorAndParameters.calculatePerimeter());
        System.out.println("Area: " + colorAndParameters.calculateArea());
        System.out.println("Fill Color: " + colorAndParameters.getFillColor());
        System.out.println("Border Color: " + colorAndParameters.getBorderColor());
        System.out.println();
    }
}
