package X;

import java.util.List;

/* renamed from: X.Hsg  reason: case insensitive filesystem */
public final class C56093Hsg {
    public final List A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56093Hsg) {
                C56093Hsg hsg = (C56093Hsg) obj;
                if (!0qQ.A0K(this.A00, hsg.A00) || this.A01 != hsg.A01) {
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

    public C56093Hsg(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("NuxBody(sections=");
        A1A.append(this.A00);
        A1A.append(", notNowButtonEnabled=");
        return G9t.A1C(A1A, this.A01);
    }
}
