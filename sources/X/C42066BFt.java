package X;

/* renamed from: X.BFt  reason: case insensitive filesystem */
public final class C42066BFt extends AnonymousClass0T0 implements DRL {
    public final int A00;
    public final int A01;
    public final long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42066BFt) {
                C42066BFt bFt = (C42066BFt) obj;
                if (!(this.A00 == bFt.A00 && this.A02 == bFt.A02 && this.A01 == bFt.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A01(this.A02, this.A00 * 31) + this.A01;
    }

    public C42066BFt(int i, long j, int i2) {
        this.A00 = i;
        this.A02 = j;
        this.A01 = i2;
    }
}
