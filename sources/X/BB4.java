package X;

public final class BB4 extends AnonymousClass0T0 {
    public final C44843Clt A00;
    public final C60903JtN A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BB4) {
                BB4 bb4 = (BB4) obj;
                if (!0qQ.A0K(this.A01, bb4.A01) || !0qQ.A0K(this.A00, bb4.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public BB4(C44843Clt clt, C60903JtN jtN) {
        this.A01 = jtN;
        this.A00 = clt;
    }
}
