package X;

/* renamed from: X.QOr  reason: case insensitive filesystem */
public final class C7609QOr extends AnonymousClass0T0 {
    public final String A00 = "";
    public final String A01 = "";
    public final String A02 = "";
    public final String A03 = "";
    public final String A04 = "";
    public final String A05 = "";
    public final String A06 = "";
    public final String A07 = "";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7609QOr) {
                C7609QOr qOr = (C7609QOr) obj;
                if (!0qQ.A0K(this.A00, qOr.A00) || !0qQ.A0K(this.A07, qOr.A07) || !0qQ.A0K(this.A05, qOr.A05) || !0qQ.A0K(this.A06, qOr.A06) || !0qQ.A0K(this.A03, qOr.A03) || !0qQ.A0K(this.A04, qOr.A04) || !0qQ.A0K(this.A02, qOr.A02) || !0qQ.A0K(this.A01, qOr.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A07, AnonymousClass7TE.A0O(this.A00))));
        int i = (int) (0 >>> 32);
        return (AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A03, (((A08 + i) * 31) + i) * 31)))) * 31) + C54732HQn.A00();
    }
}
