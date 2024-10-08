package X;

public final class S6N {
    public final int A00;
    public final C276544tV A01;
    public final C277014uI A02;
    public final Object A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S6N) {
                S6N s6n = (S6N) obj;
                if (this.A00 != s6n.A00 || !0qQ.A0K(this.A01, s6n.A01) || !0qQ.A0K(this.A02, s6n.A02) || !0qQ.A0K(this.A03, s6n.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A01, this.A00 * 31)) + AnonymousClass7TG.A0C(this.A03);
    }

    public S6N(C276544tV r1, C277014uI r2, Object obj, int i) {
        this.A00 = i;
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = obj;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AttributeBindingArgs(attributeKey=");
        A1A.append(this.A00);
        A1A.append(", model=");
        A1A.append(this.A01);
        A1A.append(", script=");
        A1A.append(this.A02);
        A1A.append(", defaultValue=");
        return AnonymousClass7TG.A0n(this.A03, A1A);
    }
}
