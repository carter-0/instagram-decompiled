package X;

/* renamed from: X.Glz  reason: case insensitive filesystem */
public final class C53313Glz extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final long A06;
    public final C266444Yx A07;
    public final C266444Yx A08;
    public final Integer A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53313Glz) {
                C53313Glz glz = (C53313Glz) obj;
                if (!(0qQ.A0K(this.A08, glz.A08) && this.A06 == glz.A06 && this.A01 == glz.A01 && this.A00 == glz.A00 && 0qQ.A0K(this.A07, glz.A07) && this.A04 == glz.A04 && this.A05 == glz.A05 && 0qQ.A0K(this.A09, glz.A09) && this.A03 == glz.A03 && this.A02 == glz.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A08);
        return ((((((((AnonymousClass7TF.A07(this.A07, (((C51972G9s.A07(this.A06, A0K) + this.A01) * 31) + this.A00) * 31) + this.A04) * 31) + this.A05) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + this.A03) * 31) + this.A02;
    }

    public C53313Glz(C266444Yx r1, C266444Yx r2, Integer num, int i, int i2, int i3, int i4, int i5, int i6, long j) {
        this.A08 = r1;
        this.A06 = j;
        this.A01 = i;
        this.A00 = i2;
        this.A07 = r2;
        this.A04 = i3;
        this.A05 = i4;
        this.A09 = num;
        this.A03 = i5;
        this.A02 = i6;
    }
}
