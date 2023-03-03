package hm5.task1;

public class Round implements Shape{

    private double radius;

    public Round(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*(radius*radius);
    }

    @Override
    public void info() {
        System.out.println("Площадь круга: " + getArea());
    }
}
