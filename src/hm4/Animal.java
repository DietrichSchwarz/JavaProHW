package hm4;

public abstract class Animal {
    private static int animalCount;

    public Animal(){
        animalCount++;
    }
    public static int getAnimalCount(){
        return animalCount;
    }


    public void run(int value){
        System.out.println();
    }

    public void swim(int value){
        System.out.println();
    }
}

