package X;

/* renamed from: X.GEk  reason: case insensitive filesystem */
public final class C52090GEk extends AnonymousClass0T0 implements JN7 {
    public final 1Xj A00;
    public final AnonymousClass3W1 A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52090GEk) {
                C52090GEk gEk = (C52090GEk) obj;
                if (!0qQ.A0K(this.A00, gEk.A00) || !0qQ.A0K(this.A01, gEk.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public C52090GEk(1Xj r1, AnonymousClass3W1 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
