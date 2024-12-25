public enum SeeIntense {
    INTENTLY("пристально"),
    AVERAGE("обычно"),
    UNINTENTLY("рассеянно");
    private final String type;

    SeeIntense(String type) {

        this.type = type;
    }

    public String Type() {

        return this.type;
    }
}
