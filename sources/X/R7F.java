package X;

public final class R7F extends RKY {
    public static final R7F A00;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Throwable, X.R7F, java.lang.Exception] */
    static {
        ? exc = new Exception();
        A00 = exc;
        exc.setStackTrace(RKY.A01);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.R7F, java.lang.Exception] */
    public static R7F A00() {
        if (RKY.A00) {
            return new Exception();
        }
        return A00;
    }
}
