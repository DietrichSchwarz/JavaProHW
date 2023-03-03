package hm4;

public class Dog extends Animal{

    @Override
    public void run(int value){
        if (value>500){
            System.out.println("Distance is out of zone");
        }else
            System.out.println("Bobik probig (m): "+value );
    }
    @Override
    public void swim(int value){
        if (value>10){
            System.out.println("Distance is out of zone");
        }else
            System.out.println("Bobik proplil (m): "+ value);
    }
}
