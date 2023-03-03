package hm5.task2;


public class Wall implements Barrier{
    public  int heightWall;

    public Wall(int heightWall) {
        this.heightWall = heightWall;
    }

    public int getHeightWall() {
        return heightWall;
    }

    public void setHeightWall(int heightWall) {
        this.heightWall = heightWall;
    }

    @Override
    public boolean overcome(Member member) {
        if (member.jump(heightWall)== false){
            return false;
        }else
            return true;

    }
}