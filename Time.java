public enum Time {
    LASTMOMENT("в самый последний момент"),
    INTIME("вовремя"),
    FAST("очень быстро");
    private final String type;

    Time(String type) {

        this.type = type;
    }

    public String Type() {

        return this.type;
    }
}
