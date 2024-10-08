package X;

/* renamed from: X.Jxg  reason: case insensitive filesystem */
public final class C61130Jxg extends AnonymousClass0T0 implements C66380MPm {
    public final C8918RFl A00;
    public final String A01;
    public final String A02 = "iap_funding_failure";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61130Jxg) {
                C61130Jxg jxg = (C61130Jxg) obj;
                if (this.A00 != jxg.A00 || !0qQ.A0K(this.A02, jxg.A02) || !0qQ.A0K(this.A01, jxg.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C61130Jxg(C8918RFl rFl, String str) {
        this.A00 = rFl;
        this.A01 = str;
    }

    public final int hashCode() {
        return (AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0K(this.A00)) * 31) + C41845B3m.A00(this.A01);
    }
}
