package X;

/* renamed from: X.BFn  reason: case insensitive filesystem */
public final class C42060BFn extends AnonymousClass0T0 implements DSN {
    public final BE3 A00;
    public final C61111JxN A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42060BFn) {
                C42060BFn bFn = (C42060BFn) obj;
                if (!0qQ.A0K(this.A00, bFn.A00) || !0qQ.A0K(this.A01, bFn.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C66563MWr AmG() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ C66566MWu BdJ() {
        return this.A01;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C42060BFn(BE3 be3, C61111JxN jxN) {
        this.A00 = be3;
        this.A01 = jxN;
    }

    public final DSN E7w(1E9 r1) {
        return this;
    }
}
