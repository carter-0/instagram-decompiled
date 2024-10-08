package X;

/* renamed from: X.XoN  reason: case insensitive filesystem */
public final class C21976XoN {
    public static final C21976XoN A02;
    public static final C21976XoN A03;
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C21976XoN xoN = (C21976XoN) obj;
            if (!(this.A01 == xoN.A01 && this.A00 == xoN.A00)) {
                return false;
            }
        }
        return true;
    }

    static {
        C21976XoN xoN = new C21976XoN(0, 0);
        A03 = xoN;
        new C21976XoN(Long.MAX_VALUE, Long.MAX_VALUE);
        new C21976XoN(Long.MAX_VALUE, 0);
        new C21976XoN(0, Long.MAX_VALUE);
        A02 = xoN;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public C21976XoN(long j, long j2) {
        boolean z = true;
        C11366SPh.A01(Pxf.A1R((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        C11366SPh.A01(j2 < 0 ? false : z);
        this.A01 = j;
        this.A00 = j2;
    }
}
