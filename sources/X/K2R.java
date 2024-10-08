package X;

import java.util.List;

public final class K2R extends C62710KlA {
    public final C61081JwJ A00;
    public final C61037Jvb A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K2R) {
                K2R k2r = (K2R) obj;
                if (!0qQ.A0K(this.A06, k2r.A06) || !0qQ.A0K(this.A04, k2r.A04) || !0qQ.A0K(this.A05, k2r.A05) || !0qQ.A0K(this.A03, k2r.A03) || !0qQ.A0K(this.A01, k2r.A01) || !0qQ.A0K(this.A00, k2r.A00) || this.A02 != k2r.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A04, AnonymousClass7TE.A0K(this.A06))))) + AnonymousClass7TG.A0C(this.A00)) * 31) + C63043KqY.A00(this.A02);
    }

    public K2R(C61081JwJ jwJ, C61037Jvb jvb, Integer num, String str, String str2, String str3, List list) {
        C51974G9v.A1P(list, str, str2, str3);
        0qQ.A0B(num, 7);
        this.A06 = list;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A01 = jvb;
        this.A00 = jwJ;
        this.A02 = num;
    }
}
