package gr.aueb.cf.test;

public class Pet {
    private int legs;
    private int tail;

    public Pet() {
    }

    public Pet(int legs, int tail) {
        this.legs = legs;
        this.tail = tail;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public String info() {
        String info = Integer.toString(this.legs);
        return info;
    }
}
