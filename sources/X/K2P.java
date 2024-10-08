package X;

import java.util.List;

public final class K2P extends C62710KlA {
    public final C61081JwJ A00;
    public final Integer A01;
    public final List A02;
    public final boolean A03;

    public K2P(C61081JwJ jwJ, Integer num, List list, boolean z) {
        0qQ.A0B(num, 4);
        this.A02 = list;
        this.A03 = z;
        this.A00 = jwJ;
        this.A01 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K2P) {
                K2P k2p = (K2P) obj;
                if (!0qQ.A0K(this.A02, k2p.A02) || this.A03 != k2p.A03 || !0qQ.A0K(this.A00, k2p.A00) || this.A01 != k2p.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A09(this.A03, AnonymousClass7TE.A0K(this.A02)) + AnonymousClass7TG.A0C(this.A00)) * 31) + C63043KqY.A00(this.A01);
    }
}
