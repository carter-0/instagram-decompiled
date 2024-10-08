package X;

public final class Xnm {
    public static final Xnm A01 = new Xnm("NIST_P256");
    public static final Xnm A02 = new Xnm("NIST_P384");
    public static final Xnm A03 = new Xnm("NIST_P521");
    public static final Xnm A04 = new Xnm("X25519");
    public final String A00;

    public Xnm(String str) {
        this.A00 = str;
    }

    public final String toString() {
        return this.A00;
    }
}
