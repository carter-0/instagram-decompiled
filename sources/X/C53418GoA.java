package X;

import java.util.List;

/* renamed from: X.GoA  reason: case insensitive filesystem */
public final class C53418GoA extends AnonymousClass0T0 implements JLY {
    public final int A00;
    public final List A01;

    public C53418GoA(int i, List list) {
        0qQ.A0B(list, 2);
        this.A00 = i;
        this.A01 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53418GoA) {
                C53418GoA goA = (C53418GoA) obj;
                if (this.A00 != goA.A00 || !0qQ.A0K(this.A01, goA.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, this.A00 * 31);
    }
}
