package X;

/* renamed from: X.JvC  reason: case insensitive filesystem */
public final class C61012JvC extends AnonymousClass0T0 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61012JvC) {
                C61012JvC jvC = (C61012JvC) obj;
                if (!(this.A0F == jvC.A0F && this.A03 == jvC.A03 && this.A04 == jvC.A04 && this.A05 == jvC.A05 && this.A06 == jvC.A06 && this.A08 == jvC.A08 && this.A09 == jvC.A09 && this.A0C == jvC.A0C && this.A0D == jvC.A0D && this.A0E == jvC.A0E && this.A07 == jvC.A07 && 0qQ.A0K(this.A01, jvC.A01) && this.A0A == jvC.A0A && 0qQ.A0K(this.A02, jvC.A02) && this.A00 == jvC.A00 && this.A0B == jvC.A0B)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C61012JvC(String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        C51969G9p.A1P(str, 12, str2);
        this.A0F = z;
        this.A03 = z2;
        this.A04 = z3;
        this.A05 = z4;
        this.A06 = z5;
        this.A08 = z6;
        this.A09 = z7;
        this.A0C = z8;
        this.A0D = z9;
        this.A0E = z10;
        this.A07 = z11;
        this.A01 = str;
        this.A0A = z12;
        this.A02 = str2;
        this.A00 = i;
        this.A0B = z13;
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A0E, AnonymousClass7TF.A09(this.A0D, AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A03, C51965G9l.A05(this.A0F)))))))))))));
        return DbS.A06(this.A0B, (AnonymousClass7TF.A08(this.A02, A092) + this.A00) * 31);
    }

    public C61012JvC() {
        this("", "", 0, false, false, false, false, false, false, false, false, false, false, false, false, false);
    }
}
