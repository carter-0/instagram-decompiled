package X;

/* renamed from: X.Gls  reason: case insensitive filesystem */
public final class C53306Gls extends AnonymousClass0T0 {
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53306Gls) {
                C53306Gls gls = (C53306Gls) obj;
                if (!0qQ.A0K(this.A04, gls.A04) || !0qQ.A0K(this.A03, gls.A03) || !0qQ.A0K(this.A02, gls.A02) || this.A05 != gls.A05 || this.A06 != gls.A06 || this.A07 != gls.A07 || !0qQ.A0K(this.A01, gls.A01) || !0qQ.A0K(this.A00, gls.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A05, ((((AnonymousClass7TG.A0E(this.A04) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31))) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C53306Gls(Integer num, Integer num2, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.A04 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A05 = z;
        this.A06 = z2;
        this.A07 = z3;
        this.A01 = num;
        this.A00 = num2;
    }
}
