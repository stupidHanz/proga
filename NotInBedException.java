public class NotInBedException extends Exception{
    public String m;
    public NotInBedException(String message) {
        super(message);
        this.m = message;
    }
    @Override
    public String getMessage() {
        return this.m;
    }
}
