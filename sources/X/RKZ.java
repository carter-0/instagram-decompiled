package X;

public final class RKZ extends Exception {
    public final String A00;

    public final String getMessage() {
        return this.A00;
    }

    public RKZ(String str) {
        super(str);
        this.A00 = str;
    }
}
