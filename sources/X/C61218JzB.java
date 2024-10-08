package X;

/* renamed from: X.JzB  reason: case insensitive filesystem */
public final class C61218JzB extends AnonymousClass0T0 implements C66552MWg {
    public final 1Xj A00;
    public final Integer A01;

    public C61218JzB(1Xj r2, Integer num) {
        0qQ.A0B(r2, 2);
        this.A01 = num;
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61218JzB) {
                C61218JzB jzB = (C61218JzB) obj;
                if (!0qQ.A0K(this.A01, jzB.A01) || !0qQ.A0K(this.A00, jzB.A00)) {
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
}
