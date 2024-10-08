package X;

public final class Xnj {
    public static final Xnj A01 = new Xnj("COMPRESSED");
    public static final Xnj A02 = new Xnj("LEGACY_UNCOMPRESSED");
    public static final Xnj A03 = new Xnj("UNCOMPRESSED");
    public final String A00;

    public Xnj(String str) {
        this.A00 = str;
    }

    public final String toString() {
        return this.A00;
    }
}
