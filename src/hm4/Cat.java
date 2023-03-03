package hm4;

public class Cat extends Animal{

    @Override
    public void run(int value){
        if (value>200){
            System.out.println("Distance is out of zone");
        }else
            System.out.println("Murzik probig (m): "+value );
    }
    @Override
    public void swim(int value){
        System.out.println("Sorry, but Cat cant swim");
    }

}
