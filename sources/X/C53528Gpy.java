package X;

/* renamed from: X.Gpy  reason: case insensitive filesystem */
public final class C53528Gpy extends AnonymousClass0T0 implements C59498JLw {
    public final C59494JLs A00;
    public final L82 A01;
    public final HMG A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53528Gpy) {
                C53528Gpy gpy = (C53528Gpy) obj;
                if (!(this.A02 == gpy.A02 && 0qQ.A0K(this.A01, gpy.A01) && 0qQ.A0K(this.A00, gpy.A00) && this.A03 == gpy.A03 && this.A06 == gpy.A06 && this.A07 == gpy.A07 && this.A05 == gpy.A05 && this.A04 == gpy.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A04, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A07(this.A00, (AnonymousClass7TE.A0K(this.A02) + AnonymousClass7TG.A0C(this.A01)) * 31))))));
    }

    public C53528Gpy(C59494JLs jLs, L82 l82, HMG hmg, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        AnonymousClass7TG.A1P(hmg, jLs);
        this.A02 = hmg;
        this.A01 = l82;
        this.A00 = jLs;
        this.A03 = z;
        this.A06 = z2;
        this.A07 = z3;
        this.A05 = z4;
        this.A04 = z5;
    }
}
