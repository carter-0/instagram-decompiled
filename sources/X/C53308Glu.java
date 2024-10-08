package X;

/* renamed from: X.Glu  reason: case insensitive filesystem */
public final class C53308Glu extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public C53308Glu(Integer num, String str, String str2, int i, int i2, int i3, int i4, int i5, boolean z) {
        0qQ.A0B(str, 1);
        this.A07 = str;
        this.A06 = str2;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = i3;
        this.A03 = i4;
        this.A02 = i5;
        this.A08 = z;
        this.A05 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53308Glu) {
                C53308Glu glu = (C53308Glu) obj;
                if (!(0qQ.A0K(this.A07, glu.A07) && 0qQ.A0K(this.A06, glu.A06) && this.A01 == glu.A01 && this.A00 == glu.A00 && this.A04 == glu.A04 && this.A03 == glu.A03 && this.A02 == glu.A02 && this.A08 == glu.A08 && 0qQ.A0K(this.A05, glu.A05))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A07);
        return AnonymousClass7TF.A09(this.A08, (((((((((AnonymousClass7TF.A08(this.A06, A0O) + this.A01) * 31) + this.A00) * 31) + this.A04) * 31 * 31) + this.A03) * 31) + this.A02) * 31) + AnonymousClass7TG.A0C(this.A05);
    }
}
