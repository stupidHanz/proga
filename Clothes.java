public enum Clothes {
    SHIRT("в ночной рубашке, белевшей в темноте"),
    NOTHING("в чем мать родила");
    private final String type;

    Clothes(String type) {

        this.type = type;
    }

    public String Type() {

        return this.type;
    }
}
