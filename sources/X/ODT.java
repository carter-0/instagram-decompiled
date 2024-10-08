package X;

public final class ODT {
    public final int A00;
    public final int A01;
    public final boolean A02;

    public ODT(Integer num, int i, boolean z) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = DbX.A02(num);
    }
}
