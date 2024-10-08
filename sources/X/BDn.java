package X;

import java.util.List;

public final class BDn extends AnonymousClass0T0 implements C46233DRo {
    public final List A00;
    public final List A01;

    public final BDn F09(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BDn) {
                BDn bDn = (BDn) obj;
                if (!0qQ.A0K(this.A00, bDn.A00) || !0qQ.A0K(this.A01, bDn.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public BDn(List list, List list2) {
        AnonymousClass7TG.A1O(list, list2);
        this.A00 = list;
        this.A01 = list2;
    }

    public final C46233DRo E6z(1E9 r1) {
        return this;
    }
}
