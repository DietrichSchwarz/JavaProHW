package hm5.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Member> members = new ArrayList<>();
        members.add(new Human("John", 1.0, 600.8));
        members.add(new Human("Denis", 1.76, 800.8));
        members.add(new Human("John", 2.10, 400.8));
        members.add(new Cat("Murzik", 2.08, 211.8));
        members.add(new Cat("Finik", 1.0, 130.8));
        members.add(new Robot("RT800", 3.0, 1300.8));
        members.add(new Robot("RT800", 1.0, 100.8));

        List<Barrier> barriers = new ArrayList<>();
        barriers.add(new Wall(2));
        barriers.add(new Track(500));


        //цикл нужнаа помощь)
    }
}
