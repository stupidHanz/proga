public class Main {
    public static void main(String[] args) {
        Male malish = new Male("Малыш");
        Male karlson = new Male("Карлсон");
        Female freaken = new Female("Фрекен Бок");
        freaken.setClothes(Clothes.SHIRT,Clothes.NOTHING,Clothes.SHIRT);
        freaken.setSeeInt(SeeIntense.INTENTLY);
        // первое предложение
        karlson.run(Places.KITCHEN);
        malish.hide(Places.BEDROOM);
        malish.rush(Places.BED);
        // второе предложение
        malish.manage(Time.LASTMOMENT);
        // второе предложение
        try {
            malish.cover(CoverType.BLANKET);
        } catch (NotInBedException e) {
            System.out.println(e.getMessage());
            System.out.print(freaken.name + " наказала его");
            System.exit(1);
        }
        malish.setConfidence(Confidence.UNCONFIDENT);
        malish.makeSound("хррр");
        malish.success();
        malish.lay();
        malish.hear(freaken);
        // третье предложение
        malish.openEyes();
        malish.see(freaken);
        freaken.stand();
        freaken.see(malish);
    }
}
