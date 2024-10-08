package X;

public final class N5Y extends AnonymousClass0T0 implements C232262tL {
    public final C69358Njy A00;
    public final 0sP A01;

    public N5Y(C69358Njy njy, 0sP r3) {
        0qQ.A0B(njy, 1);
        this.A00 = njy;
        this.A01 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N5Y) {
                N5Y n5y = (N5Y) obj;
                if (this.A00 != n5y.A00 || !0qQ.A0K(this.A01, n5y.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
