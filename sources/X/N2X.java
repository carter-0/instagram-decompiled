package X;

import java.util.List;

public final class N2X extends AnonymousClass0T0 {
    public final O6D A00;
    public final List A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N2X) {
                N2X n2x = (N2X) obj;
                if (this.A02 != n2x.A02 || !0qQ.A0K(this.A01, n2x.A01) || !0qQ.A0K(this.A00, n2x.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A07(this.A01, C51965G9l.A05(this.A02)));
    }

    public N2X(O6D o6d, List list, boolean z) {
        AnonymousClass7TG.A1Q(list, o6d);
        this.A02 = z;
        this.A01 = list;
        this.A00 = o6d;
    }
}
