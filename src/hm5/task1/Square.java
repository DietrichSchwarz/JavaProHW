package hm5.task1;

public class Square implements Shape{

    private double sideValue;
    //если речь идет о площади квадрата, то нам достаточно знать толькоодну его сторону.

    public Square(double sideValue) {
        this.sideValue = sideValue;
    }

    public double getSideValue() {
        return sideValue;
    }

    public void setSideValue(double sideValue) {
        this.sideValue = sideValue;
    }

    @Override
    public double getArea() {
        return sideValue * sideValue;
    }
    public void info() {
        System.out.println("Площадь квадрата: " + getArea());
    }
}

