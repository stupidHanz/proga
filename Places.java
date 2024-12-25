public enum Places {
    KITCHEN(" на кухню"),
    BEDROOM(" в комнату(e)"),
    BED(" кровать(и)");
    private final String type;

    Places(String type) {

        this.type = type;
    }

    public String Type() {

        return this.type;
    }

}
