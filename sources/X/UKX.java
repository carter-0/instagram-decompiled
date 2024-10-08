package X;

public final class UKX extends AnonymousClass0T0 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UKX) {
                UKX ukx = (UKX) obj;
                if (!0qQ.A0K(this.A02, ukx.A02) || this.A06 != ukx.A06 || this.A05 != ukx.A05 || this.A04 != ukx.A04 || !0qQ.A0K(this.A03, ukx.A03) || !0qQ.A0K(this.A01, ukx.A01) || !0qQ.A0K(this.A00, ukx.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A00, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A06, AnonymousClass7TE.A0O(this.A02)))))));
    }

    public UKX(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this.A02 = str;
        this.A06 = z;
        this.A05 = z2;
        this.A04 = z3;
        this.A03 = str2;
        this.A01 = str3;
        this.A00 = str4;
    }
}
