package X;

public final class Q3P extends C9108RPf {
    public final Object A00;
    public final String A01;

    public Q3P(String str, Object obj) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Q3P) {
                Q3P q3p = (Q3P) obj;
                if (!0qQ.A0K(this.A01, q3p.A01) || !0qQ.A0K(this.A00, q3p.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0C(this.A00);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VariableUpdate(variableIdentifier=");
        A1A.append(this.A01);
        A1A.append(", value=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
