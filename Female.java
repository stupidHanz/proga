import java.util.LinkedList;
import java.util.Objects;

public class Female extends Person{
    public Female(String name) {

        super(name);
        this.place=Places.KITCHEN;
        this.clothes = new LinkedList();
        this.seeInt = SeeIntense.AVERAGE;
    }
    public void setClothes(Clothes... clothes) {
        if (clothes.length == 0) {
            this.clothes.add(Clothes.NOTHING);
        } else {
            Clothes[] arr = clothes;
            int var1 = arr.length;

            for (int i = 0; i < var1; i++) {
                Clothes var2 = arr[i];
                this.clothes.add(var2);
            }
        }
    }
    public void printClothes() {
        String answer = " ";
        for (int i = 0; i < this.clothes.size(); i++) {
            answer += this.clothes.get(i).Type();
            answer += this.clothes.size() - 1 != i ? " и " : " ";
        }
        System.out.print(answer);
    }
    public void walkIn(Places place) {
        System.out.print(this.name + " вошла " + place.Type());
    }
    public void comeTo(Places place) {
        System.out.print(this.name + " подошла к " + place.Type());
    }
    public void stand(Person p) {
        System.out.print(this.name + " стоит над " + p.name);
    }
    public void stand() {
        System.out.print(this.name + " стоит ");
    }
    public void setSeeInt(SeeIntense seeInt) {
        this.seeInt = seeInt;
    }
    @Override
    public void see(Person p){
        String sentence = "";
        sentence += this.name;
        sentence += " вглядывается так ";
        sentence += this.seeInt.Type();
        sentence += ", что ";
        System.out.print(sentence);
        p.itch(Body.ALL);
    }

    @Override
    public String toString() {
        return this.name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Female f = (Female) o;
        return (Objects.equals(this.name, f.name) && Objects.equals(this.place, f.place) && Objects.equals(this.seeInt, f.seeInt) && Objects.equals(this.clothes, f.clothes));
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, place, seeInt, clothes);
    }
}


