package X;

import java.util.List;

/* renamed from: X.HAa  reason: case insensitive filesystem */
public final class C54360HAa extends C54695HPa {
    public final List A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54360HAa) {
                C54360HAa hAa = (C54360HAa) obj;
                if (!0qQ.A0K(this.A01, hAa.A01) || !0qQ.A0K(this.A00, hAa.A00)) {
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

    public C54360HAa(List list, List list2) {
        AnonymousClass7TG.A1O(list, list2);
        this.A01 = list;
        this.A00 = list2;
    }
}
