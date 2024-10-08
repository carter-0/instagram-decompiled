package X;

/* renamed from: X.Gln  reason: case insensitive filesystem */
public final class C53301Gln extends AnonymousClass0T0 {
    public final int A00;
    public final AnonymousClass2DO A01;
    public final AnonymousClass2DO A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53301Gln) {
                C53301Gln gln = (C53301Gln) obj;
                if (!(this.A00 == gln.A00 && 0qQ.A0K(this.A03, gln.A03) && 0qQ.A0K(this.A02, gln.A02) && 0qQ.A0K(this.A01, gln.A01) && this.A06 == gln.A06 && this.A07 == gln.A07 && this.A04 == gln.A04 && this.A05 == gln.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00 * 31;
        return DbS.A06(this.A05, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A06, (((AnonymousClass7TF.A08(this.A03, i) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A01)) * 31))));
    }

    public C53301Gln(AnonymousClass2DO r2, AnonymousClass2DO r3, String str, int i, boolean z, boolean z2, boolean z3) {
        boolean A1Y = DbW.A1Y(str);
        this.A00 = i;
        this.A03 = str;
        this.A02 = r2;
        this.A01 = r3;
        this.A06 = z;
        this.A07 = A1Y;
        this.A04 = z2;
        this.A05 = z3;
    }
}
