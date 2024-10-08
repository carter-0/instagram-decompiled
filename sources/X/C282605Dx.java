package X;

/* renamed from: X.5Dx  reason: invalid class name and case insensitive filesystem */
public final class C282605Dx extends C282615Dy {
    public final long A00;

    public final boolean equals(Object obj) {
        if (obj != this) {
            return obj != null && (obj instanceof C282605Dx) && ((C282605Dx) obj).A00 == this.A00;
        }
        return true;
    }

    public final String A06() {
        long j = this.A00;
        String[] strArr = 17g.A04;
        if (j > 2147483647L || j < -2147483648L) {
            return Long.toString(j);
        }
        return 17g.A08((int) j);
    }

    public final void EN9(17Z r3, C269504fE r4) {
        r3.A0h(this.A00);
    }

    public final int hashCode() {
        long j = this.A00;
        return ((int) j) ^ ((int) (j >> 32));
    }

    public C282605Dx(long j) {
        this.A00 = j;
    }
}
