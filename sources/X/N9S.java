package X;

import java.util.List;

public final class N9S extends AnonymousClass0T0 implements C74270Pry {
    public final List A00;
    public final List A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N9S) {
                N9S n9s = (N9S) obj;
                if (this.A02 != n9s.A02 || !0qQ.A0K(this.A01, n9s.A01) || !0qQ.A0K(this.A00, n9s.A00)) {
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

    public N9S(List list, List list2, boolean z) {
        AnonymousClass7TG.A1Q(list, list2);
        this.A02 = z;
        this.A01 = list;
        this.A00 = list2;
    }
}
