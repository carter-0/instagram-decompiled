package X;

import java.util.List;

public final class K2O extends C62710KlA {
    public final C61081JwJ A00;
    public final Integer A01;
    public final String A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K2O) {
                K2O k2o = (K2O) obj;
                if (!0qQ.A0K(this.A03, k2o.A03) || !0qQ.A0K(this.A02, k2o.A02) || !0qQ.A0K(this.A00, k2o.A00) || this.A01 != k2o.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0K(this.A03)) + AnonymousClass7TG.A0C(this.A00)) * 31) + C63043KqY.A00(this.A01);
    }

    public K2O(C61081JwJ jwJ, Integer num, String str, List list) {
        C51972G9s.A1C(str, num);
        this.A03 = list;
        this.A02 = str;
        this.A00 = jwJ;
        this.A01 = num;
    }
}
