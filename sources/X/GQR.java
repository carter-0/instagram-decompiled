package X;

public final class GQR extends AnonymousClass0T0 {
    public final Double A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final AnonymousClass62P A04;
    public final YCQ A05;
    public final boolean A06;

    public GQR(Double d, String str, String str2, String str3, AnonymousClass62P r6, YCQ ycq, boolean z) {
        0qQ.A0B(ycq, 6);
        this.A01 = str;
        this.A03 = str2;
        this.A04 = r6;
        this.A02 = str3;
        this.A00 = d;
        this.A05 = ycq;
        this.A06 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GQR) {
                GQR gqr = (GQR) obj;
                if (!0qQ.A0K(this.A01, gqr.A01) || !0qQ.A0K(this.A03, gqr.A03) || !0qQ.A0K(this.A04, gqr.A04) || !0qQ.A0K(this.A02, gqr.A02) || !0qQ.A0K(this.A00, gqr.A00) || !0qQ.A0K(this.A05, gqr.A05) || this.A06 != gqr.A06) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.A01;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.A03;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode4 = (((i2 + hashCode2) * 31) + this.A04.hashCode()) * 31;
        String str3 = this.A02;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (hashCode4 + hashCode3) * 31;
        Double d = this.A00;
        if (d != null) {
            i = d.hashCode();
        }
        int hashCode5 = (((i3 + i) * 31) + this.A05.hashCode()) * 31;
        int i4 = 1237;
        if (this.A06) {
            i4 = 1231;
        }
        return hashCode5 + i4;
    }
}
