package X;

/* renamed from: X.Xmz  reason: case insensitive filesystem */
public final class C21968Xmz {
    public final int A00;
    public final int A01;
    public final C21968Xmz[] A02;

    public C21968Xmz(int i, int i2) {
        this.A02 = null;
        this.A00 = i;
        int i3 = i2 & 7;
        this.A01 = i3 == 0 ? 8 : i3;
    }

    public C21968Xmz() {
        this.A02 = new C21968Xmz[256];
        this.A00 = 0;
        this.A01 = 0;
    }
}
