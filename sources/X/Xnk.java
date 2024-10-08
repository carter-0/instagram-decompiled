package X;

public final class Xnk {
    public static final Xnk A01 = new Xnk("CRUNCHY");
    public static final Xnk A02 = new Xnk("NO_PREFIX");
    public static final Xnk A03 = new Xnk("TINK");
    public final String A00;

    public Xnk(String str) {
        this.A00 = str;
    }

    public final String toString() {
        return this.A00;
    }
}
