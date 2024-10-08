package X;

import java.util.Set;

/* renamed from: X.S5n  reason: case insensitive filesystem */
public final class C11016S5n {
    public final Object A00;
    public final Set A01;

    public C11016S5n(Object obj, Set set) {
        0qQ.A0B(set, 2);
        this.A00 = obj;
        this.A01 = set;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C11016S5n) {
                C11016S5n s5n = (C11016S5n) obj;
                if (!0qQ.A0K(this.A00, s5n.A00) || !0qQ.A0K(this.A01, s5n.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TG.A0C(this.A00) * 31);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ValueEntry(value=");
        A1A.append(this.A00);
        A1A.append(", variableLog=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
