package X;

/* renamed from: X.TsG  reason: case insensitive filesystem */
public final class C14233TsG extends AnonymousClass0T0 {
    public final int A00;
    public final C61074JwC A01;
    public final C16616UyC A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C14233TsG(C61074JwC jwC, C16616UyC uyC, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        0qQ.A0B(uyC, 3);
        this.A00 = i;
        this.A08 = z;
        this.A02 = uyC;
        this.A03 = str;
        this.A04 = z2;
        this.A05 = z3;
        this.A06 = z4;
        this.A07 = z5;
        this.A01 = jwC;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C14233TsG) {
                C14233TsG tsG = (C14233TsG) obj;
                if (!(this.A00 == tsG.A00 && this.A08 == tsG.A08 && this.A02 == tsG.A02 && 0qQ.A0K(this.A03, tsG.A03) && this.A04 == tsG.A04 && this.A05 == tsG.A05 && this.A06 == tsG.A06 && this.A07 == tsG.A07 && 0qQ.A0K(this.A01, tsG.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A09 = AnonymousClass7TF.A09(this.A08, this.A00 * 31);
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A04, (AnonymousClass7TF.A07(this.A02, A09) + AnonymousClass7TG.A0E(this.A03)) * 31)))));
    }
}
