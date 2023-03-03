package hm5.task2;


public abstract class Member {
    private String name;
    private double jumpMaximum;
    private double runMaximum;

    public Member(String name, double jumpMaximum, double runMaximum) {
        this.name = name;
        this.jumpMaximum = jumpMaximum;
        this.runMaximum = runMaximum;
    }

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getJumpMaximum() {
        return jumpMaximum;
    }

    public void setJumpMaximum(double jumpMaximum) {
        this.jumpMaximum = jumpMaximum;
    }

    public double getRunMaximum() {
        return runMaximum;
    }

    public void setRunMaximum(double runMaximum) {
        this.runMaximum = runMaximum;
    }

    abstract boolean run(int distance);

    abstract boolean jump(int height);

}

