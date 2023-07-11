package training.day5.Exercise;

public class Triangle implements Shape{
    private double sideA;
    private double sideB;
    private double sideC;
    private double sideHeight;

    public Triangle(double sideA, double sideB, double sideC, double sideHeight) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideHeight = sideHeight;
    }

    @Override
    public double calculateArea() {
        return (sideA * sideHeight) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getSideHeight() {
        return sideHeight;
    }

    public void setSideHeight(double sideHeight) {
        this.sideHeight = sideHeight;
    }
}
