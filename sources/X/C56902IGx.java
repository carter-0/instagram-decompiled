package X;

/* renamed from: X.IGx  reason: case insensitive filesystem */
public final class C56902IGx implements JS3 {
    public final int A00;
    public final int A01;
    public final boolean A02;

    public final int E1S(int i) {
        return i + this.A01;
    }

    public final int FHr(int i) {
        boolean z = this.A02;
        int i2 = this.A01;
        if (z) {
            i -= i2;
            i2 = this.A00;
        }
        int i3 = i - i2;
        return C51970G9q.A07(i3, i3);
    }

    public C56902IGx(boolean z, int i, int i2) {
        this.A02 = z;
        this.A01 = i;
        this.A00 = i2;
    }
}
