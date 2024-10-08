package X;

import java.util.List;

public final class Jv0 extends AnonymousClass0T0 {
    public static final Jv0 A03;
    public static final Jv0 A04;
    public final List A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Jv0) {
                Jv0 jv0 = (Jv0) obj;
                if (!(this.A02 == jv0.A02 && this.A01 == jv0.A01 && 0qQ.A0K(this.A00, jv0.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    static {
        0sn r3 = 0sn.A00;
        A03 = new Jv0(r3, false, false);
        A04 = new Jv0(r3, true, false);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A09(this.A01, C51965G9l.A05(this.A02)));
    }

    public Jv0(List list, boolean z, boolean z2) {
        this.A02 = z;
        this.A01 = z2;
        this.A00 = list;
    }
}
