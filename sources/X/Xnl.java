package X;

public final class Xnl {
    public static final Xnl A01 = new Xnl("CRUNCHY");
    public static final Xnl A02 = new Xnl("NO_PREFIX");
    public static final Xnl A03 = new Xnl("TINK");
    public final String A00;

    public Xnl(String str) {
        this.A00 = str;
    }

    public final String toString() {
        return this.A00;
    }
}
