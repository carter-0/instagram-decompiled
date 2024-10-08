package X;

import java.util.List;

public final class EPH extends C48200Eag {
    public final List A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EPH) {
                EPH eph = (EPH) obj;
                if (!(0qQ.A0K(this.A00, eph.A00) && this.A02 == eph.A02 && this.A01 == eph.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TF.A09(this.A02, AnonymousClass7TE.A0K(this.A00)));
    }

    public EPH(List list, boolean z, boolean z2) {
        this.A00 = list;
        this.A02 = z;
        this.A01 = z2;
    }
}
