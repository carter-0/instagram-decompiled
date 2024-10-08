package X;

public final class GMO extends AnonymousClass0T0 implements C59491JLp {
    public final C59492JLq A00;
    public final C59492JLq A01;

    public GMO(C59492JLq jLq, C59492JLq jLq2) {
        0qQ.A0B(jLq, 1);
        this.A01 = jLq;
        this.A00 = jLq2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GMO) {
                GMO gmo = (GMO) obj;
                if (!0qQ.A0K(this.A01, gmo.A01) || !0qQ.A0K(this.A00, gmo.A00)) {
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
}
