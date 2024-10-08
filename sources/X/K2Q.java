package X;

import java.util.List;

public final class K2Q extends C62710KlA {
    public final C61081JwJ A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K2Q) {
                K2Q k2q = (K2Q) obj;
                if (!0qQ.A0K(this.A04, k2q.A04) || !0qQ.A0K(this.A03, k2q.A03) || !0qQ.A0K(this.A02, k2q.A02) || !0qQ.A0K(this.A00, k2q.A00) || this.A01 != k2q.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A03, AnonymousClass7TE.A0K(this.A04))) + AnonymousClass7TG.A0C(this.A00)) * 31) + C63043KqY.A00(this.A01);
    }

    public K2Q(C61081JwJ jwJ, Integer num, String str, String str2, List list) {
        AnonymousClass7TG.A1U(list, str, str2);
        0qQ.A0B(num, 5);
        this.A04 = list;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = jwJ;
        this.A01 = num;
    }
}
