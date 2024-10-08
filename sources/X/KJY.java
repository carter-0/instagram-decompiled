package X;

import java.util.List;

public final class KJY extends C62741Klf {
    public final List A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KJY) {
                KJY kjy = (KJY) obj;
                if (!0qQ.A0K(this.A00, kjy.A00) || this.A01 != kjy.A01) {
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

    public KJY(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
    }
}
