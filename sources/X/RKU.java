package X;

public final class RKU extends Exception {
    public final int A00;

    public RKU(int i, String str) {
        super(str);
        this.A00 = i;
    }
}
