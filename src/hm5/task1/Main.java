package hm5.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(9));
        shapes.add(new Square(3));
        shapes.add(new Square(2));
        shapes.add(new Rectangle(2, 2));
        shapes.add(new Rectangle(5, 6));
        shapes.add(new Rectangle(9, 7));
        shapes.add(new Round(9));
        shapes.add(new Round(4));
        shapes.add(new Round(8));
        shapes.add(new Triangle(8, 5, 8));
        shapes.add(new Triangle(7, 3, 9));

        shapes.forEach(t -> {
            System.out.println("---------");
            t.info();
        });


    }
}
