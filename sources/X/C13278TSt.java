package X;

/* renamed from: X.TSt  reason: case insensitive filesystem */
public final class C13278TSt extends 0sg {
    public long A00;
    public boolean A01;
    public final long A02;
    public final long A03 = 1;

    public C13278TSt(long j, long j2) {
        this.A02 = j2;
        boolean z = j > j2 ? false : true;
        this.A01 = z;
        this.A00 = !z ? j2 : j;
    }

    public final long A00() {
        long j = this.A00;
        if (j != this.A02) {
            this.A00 = this.A03 + j;
            return j;
        } else if (this.A01) {
            this.A01 = false;
            return j;
        } else {
            throw Pxe.A1C();
        }
    }

    public final boolean hasNext() {
        return this.A01;
    }
}
