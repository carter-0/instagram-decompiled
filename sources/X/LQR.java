package X;

public final class LQR {
    public static final LQR A02 = new LQR(2);
    public static final LQR A03 = new LQR(3);
    public static final LQR A04 = new LQR(6);
    public static final LQR A05 = new LQR(4);
    public C62947Koz A00;
    public final int A01;

    public LQR(C62947Koz koz) {
        this.A00 = koz;
        this.A01 = 0;
    }

    public LQR(int i) {
        this.A01 = i;
    }
}
