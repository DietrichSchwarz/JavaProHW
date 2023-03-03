package hm5.task1;

public class Rectangle implements Shape{

    private double side1;
    private double side2;

    // для вычисления нам нужно знать 2 стороны фигуры

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return side1*side2;
    }

    @Override
    public void info() {
        System.out.println("Площадь прямоугольника: " + getArea());
    }
}

