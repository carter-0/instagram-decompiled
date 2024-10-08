package X;

public final class S5V {
    public final C276634te A00;
    public final String A01;

    public S5V(C276634te r2, String str) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S5V) {
                S5V s5v = (S5V) obj;
                if (!0qQ.A0K(this.A01, s5v.A01) || !0qQ.A0K(this.A00, s5v.A00)) {
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
        A1A.append("BloksStackFrame(offset=");
        A1A.append(this.A01);
        A1A.append(", nextFrame=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
