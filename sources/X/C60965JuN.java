package X;

/* renamed from: X.JuN  reason: case insensitive filesystem */
public final class C60965JuN extends AnonymousClass0T0 {
    public String A00;
    public String A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final C69311NjC A06;
    public final Long A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60965JuN) {
                C60965JuN juN = (C60965JuN) obj;
                if (!0qQ.A0K(this.A03, juN.A03) || this.A02 != juN.A02 || !0qQ.A0K(this.A04, juN.A04) || !0qQ.A0K(this.A08, juN.A08) || !0qQ.A0K(this.A07, juN.A07) || !0qQ.A0K(this.A00, juN.A00) || this.A05 != juN.A05 || !0qQ.A0K(this.A01, juN.A01) || this.A06 != juN.A06) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A09(this.A05, ((((((((((AnonymousClass7TG.A0E(this.A03) * 31) + this.A02) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31 * 31) + AnonymousClass7TE.A0L(this.A06);
    }

    public C60965JuN(C69311NjC njC, Long l, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        this.A03 = str;
        this.A02 = i;
        this.A04 = str2;
        this.A08 = str3;
        this.A07 = l;
        this.A00 = str4;
        this.A05 = z;
        this.A01 = str5;
        this.A06 = njC;
    }
}
