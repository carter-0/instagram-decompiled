package X;

/* renamed from: X.4Rr  reason: invalid class name and case insensitive filesystem */
public class C264884Rr {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C264884Rr)) {
            return false;
        }
        C264884Rr r7 = (C264884Rr) obj;
        return this.A04.equals(r7.A04) && this.A00 == r7.A00 && this.A01 == r7.A01 && this.A03 == r7.A03 && this.A02 == r7.A02;
    }

    public final int hashCode() {
        return ((((((((527 + this.A04.hashCode()) * 31) + this.A00) * 31) + this.A01) * 31) + ((int) this.A03)) * 31) + this.A02;
    }

    public C264884Rr(C264884Rr r3) {
        this.A04 = r3.A04;
        this.A00 = r3.A00;
        this.A01 = r3.A01;
        this.A03 = r3.A03;
        this.A02 = r3.A02;
    }

    public C264884Rr(Object obj, int i, int i2, int i3, long j) {
        this.A04 = obj;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = j;
        this.A02 = i3;
    }
}
