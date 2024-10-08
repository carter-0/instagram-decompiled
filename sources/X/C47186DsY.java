package X;

/* renamed from: X.DsY  reason: case insensitive filesystem */
public final class C47186DsY extends AnonymousClass0T0 implements G8N {
    public final C47188Dsa A00;
    public final C61093Jx4 A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47186DsY) {
                C47186DsY dsY = (C47186DsY) obj;
                if (!0qQ.A0K(this.A01, dsY.A01) || !0qQ.A0K(this.A00, dsY.A00)) {
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

    public C47186DsY(C47188Dsa dsa, C61093Jx4 jx4) {
        AnonymousClass7TG.A1O(jx4, dsa);
        this.A01 = jx4;
        this.A00 = dsa;
    }
}
