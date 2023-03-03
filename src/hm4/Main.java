package hm4;

public class Main {
        public static void main(String[] args) {

            Cat catMurzik = new Cat();
            catMurzik.run(180);
            catMurzik.swim(100);

            System.out.println("------");

            Dog dogBobik = new Dog();
            dogBobik.run(300);
            dogBobik.swim(5);

            System.out.println("------");

            Dog dogMon = new Dog();
            dogMon.run(600);
            dogMon.swim(20);

            System.out.println("------");

            System.out.println("quantity of Animals: "+ Animal.getAnimalCount());
        }


    }

