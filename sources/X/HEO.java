package X;

import java.util.List;

public final class HEO extends C54703HPi {
    public final List A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HEO) {
                HEO heo = (HEO) obj;
                if (!0qQ.A0K(this.A00, heo.A00) || this.A01 != heo.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public HEO(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
    }
}
