package hm5.task2;

public class Track implements Barrier{

    public  int lenght;

    public Track(int lenght) {
        this.lenght = lenght;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    @Override
    /*public boolean overcome(Member member) {
        member.run(lenght);
        return true;
    }*/
    public boolean overcome (Member member){
        if (member.run(lenght)==false){
            return false;
        }else
            return true;
    }
}
