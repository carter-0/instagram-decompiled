package X;

/* renamed from: X.S5m  reason: case insensitive filesystem */
public final class C11015S5m {
    public final Q3P A00;
    public final Q4Q A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C11015S5m) {
                C11015S5m s5m = (C11015S5m) obj;
                if (!0qQ.A0K(this.A01, s5m.A01) || !0qQ.A0K(this.A00, s5m.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TG.A0C(this.A01) * 31);
    }

    public C11015S5m(Q3P q3p, Q4Q q4q) {
        this.A01 = q4q;
        this.A00 = q3p;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("BloksTreeUpdateOperation(treeModification=");
        A1A.append(this.A01);
        A1A.append(", variableUpdate=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
