package X;

public final class WI6 implements X9i {
    public static WI6 A00;

    /* JADX WARNING: type inference failed for: r0v3, types: [X.WI6, java.lang.Object] */
    public static synchronized WI6 A00() {
        WI6 wi6;
        synchronized (WI6.class) {
            WI6 wi62 = A00;
            wi6 = wi62;
            if (wi62 == null) {
                ? obj = new Object();
                A00 = obj;
                wi6 = obj;
            }
        }
        return wi6;
    }
}
