import java.util.Objects;

public class Male extends Person implements Managable{
    public Male(String name) {

        super(name);
        this.place=Places.KITCHEN;
        this.conf = Confidence.UNCONFIDENT;
    }
    public void setConfidence(Confidence conf) {
        this.conf = conf;
    }
    public void run(Places place) {
        this.place = place;
        System.out.println(this.name + " помчался" + place.Type());
    }
    public void rush(Places place) {
        this.place = place;
        System.out.println(this.name + " кинулся на" + place.Type());
    }
    public void hide(Places place) {
        this.place = place;
        System.out.println(this.name + " скрылся" + place.Type());
    }

    @Override
    public void manage(Time t) {
        String sentence = "";
        sentence += "Все это ";
        sentence += this.name;
        sentence += " успел проделать ";
        sentence += t.Type();
        System.out.println(sentence);
    }

    public void cover(CoverType ct) throws NotInBedException{
        if (this.place == Places.BED) {
            System.out.println(this.name + " натянул " + ct.Type() + " на " + Body.HEAD.Type());
        } else {
            throw new NotInBedException("чувачок не в кровати");
        }
    }

    public void makeSound(String snor) {
        String volume;
        if (conf == Confidence.CONFIDENT) {
            volume = "громкий";
        }
        else {
            volume = "негромкий";
        }
        System.out.println(this.name + " "+ conf.Type() + " издал(ть) " + volume + " храп " + "\"" + snor + "\"");
    }

    public void success(){
        if (Math.random()>0.5) {
            System.out.println("и у него получилось");
        }
        else {
            System.out.println("но у него снова ничего не получилось");
        }
    }
    public void lay() {
        Talkative t = new Talkative("молча");
        System.out.println(this.name + " лежал " + t.type());
    }
    public void hear(Person p) {
        System.out.print(this.name + " слышал, как ");
        p.walkIn(Places.BEDROOM);
        System.out.print(" и ");
        p.comeTo(Places.BED);
        System.out.println();
    }
    public void openEyes(){
        System.out.println(this.name + " " + conf.Type() + " чуть приоткрыл(ть) глаза ");
    }
    public void openEyes(Confidence conf){
        System.out.println(this.name + " " + conf.Type() + " открыл(ть) глаза ");
    }
    @Override
    public void see(Person p){
        String sentence = "";
        sentence += this.name;
        sentence += " увидел, что ";
        System.out.print(sentence);
        p.stand(this);
        p.printClothes();
    }
    @Override
    public void itch(Body part){
        System.out.print(" у " + this.name + " " + part.Type() + " начало зудеть");
    }

    @Override
    public String toString() {
        return this.name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Male m = (Male) o;
        return (Objects.equals(this.name, m.name) && Objects.equals(this.place, m.place));
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, place);
    }
}



