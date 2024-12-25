public enum Confidence {
    CONFIDENT("уверенно"),
    UNCONFIDENT("робко попробовал"),
    CAREFULL("осторожно");
    private final String type;

    Confidence(String type) {

        this.type = type;
    }

    public String Type() {

        return this.type;
    }
}
