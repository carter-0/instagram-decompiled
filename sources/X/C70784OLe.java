package X;

/* renamed from: X.OLe  reason: case insensitive filesystem */
public final class C70784OLe {
    public int A00;
    public int A01;
    public long A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final C62320sa A06;

    public final boolean A00() {
        long A0O = JTR.A0O(this.A06);
        long j = this.A02;
        boolean z = true;
        if (A0O >= j) {
            z = false;
            if (j > 0) {
                this.A00 = 0;
                this.A02 = 0;
            }
        }
        return z;
    }

    public C70784OLe(C62320sa r1, int i, int i2, int i3, int i4, int i5, long j) {
        this.A05 = i;
        this.A04 = i2;
        this.A03 = i3;
        this.A06 = r1;
        this.A00 = i4;
        this.A01 = i5;
        this.A02 = j;
    }
}
