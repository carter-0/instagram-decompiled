package X;

/* renamed from: X.GqH  reason: case insensitive filesystem */
public final class C53546GqH extends AnonymousClass0T0 implements JM9 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass4A5 A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53546GqH) {
                C53546GqH gqH = (C53546GqH) obj;
                if (!(this.A03 == gqH.A03 && this.A0A == gqH.A0A && this.A0B == gqH.A0B && this.A08 == gqH.A08 && this.A04 == gqH.A04 && this.A02 == gqH.A02 && this.A06 == gqH.A06 && this.A05 == gqH.A05 && this.A00 == gqH.A00 && this.A01 == gqH.A01 && this.A07 == gqH.A07 && this.A09 == gqH.A09)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TE.A0K(this.A03))));
        int A093 = AnonymousClass7TF.A09(this.A06, (AnonymousClass7TF.A09(this.A04, A092) + this.A02) * 31);
        return DbS.A06(this.A09, AnonymousClass7TF.A09(this.A07, (((AnonymousClass7TF.A09(this.A05, A093) + this.A00) * 31) + this.A01) * 31));
    }

    public C53546GqH(AnonymousClass4A5 r1, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A03 = r1;
        this.A0A = z;
        this.A0B = z2;
        this.A08 = z3;
        this.A04 = z4;
        this.A02 = i;
        this.A06 = z5;
        this.A05 = z6;
        this.A00 = i2;
        this.A01 = i3;
        this.A07 = z7;
        this.A09 = z8;
    }

    public C53546GqH() {
        this(AnonymousClass4A5.UNSET, 0, 0, 0, false, true, false, false, false, false, false, false);
    }
}
