package entities;

public class Student {

    public String name;
    public double noteFirst;
    public double noteSecond;
    public double noteThird;

    public double mediaNote() {
        return noteFirst + noteSecond + noteThird;
    }

    public double remainingNote() {
        return 60.00 - mediaNote();
    }
}
