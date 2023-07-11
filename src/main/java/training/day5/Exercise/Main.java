package training.day5.Exercise;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 8);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        Triangle triangle = new Triangle(5, 6, 7,9);
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
}
