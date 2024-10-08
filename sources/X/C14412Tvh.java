package X;

/* renamed from: X.Tvh  reason: case insensitive filesystem */
public final class C14412Tvh extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final boolean A07;
    public final int A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C14412Tvh) {
                C14412Tvh tvh = (C14412Tvh) obj;
                if (!(this.A00 == tvh.A00 && this.A01 == tvh.A01 && this.A02 == tvh.A02 && this.A03 == tvh.A03 && this.A04 == tvh.A04 && this.A05 == tvh.A05 && this.A08 == tvh.A08 && this.A06 == tvh.A06 && this.A07 == tvh.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A07, ((((((((((((((this.A00 * 31) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31) + this.A04) * 31) + this.A05) * 31) + this.A08) * 31) + this.A06) * 31);
    }

    public C14412Tvh(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A04 = i5;
        this.A05 = i6;
        this.A08 = i7;
        this.A06 = i8;
        this.A07 = z;
    }
}
