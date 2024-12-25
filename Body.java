public enum Body {
    ALL("все тело"),
    HEAD("голова"),
    HAND("рука");
    private String type;

    Body(String type) {

        this.type = type;
    }

    public String Type() {

        return this.type;
    }
}
