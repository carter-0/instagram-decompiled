package X;

public final class MeZ extends AnonymousClass0T0 {
    public final int A00;
    public final 2EM A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08 = true;
    public final boolean A09;

    public MeZ(2EM r2, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A02 = str;
        this.A05 = z;
        this.A01 = r2;
        this.A06 = z2;
        this.A04 = z3;
        this.A00 = i;
        this.A07 = z4;
        this.A03 = z5;
        this.A09 = z6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MeZ) {
                MeZ meZ = (MeZ) obj;
                if (!(0qQ.A0K(this.A02, meZ.A02) && this.A05 == meZ.A05 && 0qQ.A0K(this.A01, meZ.A01) && this.A06 == meZ.A06 && this.A04 == meZ.A04 && this.A00 == meZ.A00 && this.A07 == meZ.A07 && this.A08 == meZ.A08 && this.A03 == meZ.A03 && this.A09 == meZ.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A02);
        int A092 = AnonymousClass7TF.A09(this.A06, (AnonymousClass7TF.A09(this.A05, A0O) + AnonymousClass7TG.A0C(this.A01)) * 31);
        return DbS.A06(this.A09, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A07, (AnonymousClass7TF.A09(this.A04, A092) + this.A00) * 31))));
    }
}
