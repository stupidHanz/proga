import java.util.LinkedList;

public abstract class Person implements Seeable{
    protected String name;
    protected Places place;
    protected Confidence conf;
    protected LinkedList<Clothes> clothes;
    protected SeeIntense seeInt;
    public Person(String name) {
        this.name = name;
    }

    public void itch(Body part) {
    }
    public void stand() {
    }
    public void stand(Person p) {
    }
    public void printClothes() {
    }
    public void walkIn(Places place) {
    }
    public void comeTo(Places place) {
    }
}

