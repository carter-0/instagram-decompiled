package X;

public final class Y5R extends Throwable {
    public final Throwable fillInStackTrace() {
        return this;
    }

    public Y5R() {
        super("No further exceptions");
    }
}
