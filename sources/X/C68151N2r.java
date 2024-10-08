package X;

/* renamed from: X.N2r  reason: case insensitive filesystem */
public final class C68151N2r extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68151N2r) {
                C68151N2r n2r = (C68151N2r) obj;
                if (!(0qQ.A0K(this.A04, n2r.A04) && this.A01 == n2r.A01 && this.A02 == n2r.A02 && this.A03 == n2r.A03 && this.A00 == n2r.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TE.A0O(this.A04) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31) + this.A00;
    }

    public C68151N2r(String str, int i, int i2, int i3, int i4) {
        this.A04 = str;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i4;
    }
}
