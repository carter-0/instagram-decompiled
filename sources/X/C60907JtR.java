package X;

import java.util.List;

/* renamed from: X.JtR  reason: case insensitive filesystem */
public final class C60907JtR extends AnonymousClass0T0 {
    public final C276104sZ A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60907JtR) {
                C60907JtR jtR = (C60907JtR) obj;
                if (!0qQ.A0K(this.A01, jtR.A01) || !0qQ.A0K(this.A00, jtR.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0K(this.A01));
    }

    public C60907JtR(C276104sZ r1, List list) {
        AnonymousClass7TG.A1O(list, r1);
        this.A01 = list;
        this.A00 = r1;
    }
}
