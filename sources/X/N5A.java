package X;

import java.util.List;

public final class N5A extends AnonymousClass0T0 implements C74522PwH {
    public final List A00;
    public final List A01;
    public final Boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N5A) {
                N5A n5a = (N5A) obj;
                if (!0qQ.A0K(this.A00, n5a.A00) || !0qQ.A0K(this.A02, n5a.A02) || !0qQ.A0K(this.A01, n5a.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public N5A(Boolean bool, List list, List list2) {
        this.A00 = list;
        this.A02 = bool;
        this.A01 = list2;
    }
}
