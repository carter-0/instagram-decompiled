package X;

import java.util.List;

/* renamed from: X.Icw  reason: case insensitive filesystem */
public final class C57569Icw implements JMS {
    public final List A00;
    public final List A01;

    public C57569Icw(List list, List list2) {
        0qQ.A0B(list, 1);
        this.A01 = list;
        this.A00 = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C57569Icw) {
                C57569Icw icw = (C57569Icw) obj;
                if (!0qQ.A0K(this.A01, icw.A01) || !0qQ.A0K(this.A00, icw.A00)) {
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

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Success(suggestions=");
        A1A.append(this.A01);
        A1A.append(", spotlightItems=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
