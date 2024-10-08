package X;

/* renamed from: X.Glh  reason: case insensitive filesystem */
public final class C53295Glh extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final C54617HLa A02;
    public final Integer A03;
    public final Integer A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53295Glh) {
                C53295Glh glh = (C53295Glh) obj;
                if (!(this.A02 == glh.A02 && this.A06 == glh.A06 && 0qQ.A0K(this.A04, glh.A04) && this.A01 == glh.A01 && this.A00 == glh.A00 && 0qQ.A0K(this.A03, glh.A03) && this.A05 == glh.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0C = AnonymousClass7TG.A0C(this.A02) * 31;
        return DbS.A06(this.A05, (((((((AnonymousClass7TF.A09(this.A06, A0C) + AnonymousClass7TG.A0C(this.A04)) * 31) + this.A01) * 31) + this.A00) * 31) + AnonymousClass7TE.A0L(this.A03)) * 31);
    }

    public C53295Glh(C54617HLa hLa, Integer num, Integer num2, int i, int i2, boolean z, boolean z2) {
        this.A02 = hLa;
        this.A06 = z;
        this.A04 = num;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = num2;
        this.A05 = z2;
    }
}
