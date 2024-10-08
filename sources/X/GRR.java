package X;

public final class GRR {
    public final C287725af A00;
    public final JNL A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GRR) {
                GRR grr = (GRR) obj;
                if (!0qQ.A0K(this.A00, grr.A00) || !0qQ.A0K(this.A01, grr.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public GRR(C287725af r1, JNL jnl) {
        this.A00 = r1;
        this.A01 = jnl;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VectorizedKeyframeSpecElementInfo(vectorValue=");
        A1A.append(this.A00);
        A1A.append(", easing=");
        A1A.append(this.A01);
        A1A.append(", arcMode=");
        A1A.append(002.A0I("ArcMode(value=", ')', 0));
        return C51967G9n.A0r(A1A, ')');
    }
}
