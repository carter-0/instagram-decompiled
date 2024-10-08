package X;

/* renamed from: X.Gm5  reason: case insensitive filesystem */
public final class C53319Gm5 extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final C266444Yx A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53319Gm5) {
                C53319Gm5 gm5 = (C53319Gm5) obj;
                if (!(this.A05 == gm5.A05 && this.A09 == gm5.A09 && this.A0A == gm5.A0A && this.A06 == gm5.A06 && 0qQ.A0K(this.A02, gm5.A02) && this.A01 == gm5.A01 && 0qQ.A0K(this.A03, gm5.A03) && this.A04 == gm5.A04 && this.A07 == gm5.A07 && this.A08 == gm5.A08 && this.A00 == gm5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A09, C51965G9l.A05(this.A05)));
        return AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A08(this.A03, (((AnonymousClass7TF.A09(this.A06, A092) + AnonymousClass7TG.A0C(this.A02)) * 31) + this.A01) * 31)))) + this.A00;
    }

    public C53319Gm5(C266444Yx r1, String str, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A05 = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A06 = z4;
        this.A02 = r1;
        this.A01 = i;
        this.A03 = str;
        this.A04 = z5;
        this.A07 = z6;
        this.A08 = z7;
        this.A00 = i2;
    }
}
