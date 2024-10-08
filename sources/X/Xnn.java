package X;

public final class Xnn {
    public static final Xnn A01 = new Xnn("SHA1");
    public static final Xnn A02 = new Xnn("SHA224");
    public static final Xnn A03 = new Xnn("SHA256");
    public static final Xnn A04 = new Xnn("SHA384");
    public static final Xnn A05 = new Xnn("SHA512");
    public final String A00;

    public Xnn(String str) {
        this.A00 = str;
    }

    public final String toString() {
        return this.A00;
    }
}
