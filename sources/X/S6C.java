package X;

public final class S6C {
    public final int A00;
    public final int A01;
    public final C276544tV A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S6C) {
                S6C s6c = (S6C) obj;
                if (!(this.A01 == s6c.A01 && this.A00 == s6c.A00 && 0qQ.A0K(this.A02, s6c.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, ((this.A01 * 31) + this.A00) * 31);
    }

    public S6C(C276544tV r1, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = r1;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LayoutSignalArgs(widthSpec=");
        A1A.append(this.A01);
        A1A.append(", heightSpec=");
        A1A.append(this.A00);
        A1A.append(", model=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
