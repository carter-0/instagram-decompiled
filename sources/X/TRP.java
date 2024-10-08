package X;

public final class TRP extends Throwable {
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
