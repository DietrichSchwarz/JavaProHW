package hm5.task2;

public class Human extends Member {

    public Human(String name, double jumpMaximum, double runMaximum) {
        super(name, jumpMaximum, runMaximum);
    }


    @Override
    boolean run(int distance) {
        if (distance>getRunMaximum()){
            System.out.println("Участник: "+ getName() + " "
                    + "НЕ смог преодолеть препятствие (Дорожка)"+" - "+ distance+" метров.");
            return false;
        }else
            System.out.println("Участник: "+ getName() + " "
                    + "преодолел препятствие (Дорожка)"+" - "+ distance+" метров.");
        return true;
    }

    @Override
    boolean jump(int height) {
        if (height > getJumpMaximum()) {
            System.out.println("Участник: " + getName() + " "
                    + "НЕ смог преодолеть препятствие (Стена)"+" - "+ height+" метра.");
            return false;
        } else
            System.out.println("Участник: " + getName() + " "
                    + "преодолел препятствие (Стена)"+" - "+ height+" метра.");
        return true;

    }


}

