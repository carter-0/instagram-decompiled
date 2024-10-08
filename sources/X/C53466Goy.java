package X;

/* renamed from: X.Goy  reason: case insensitive filesystem */
public final class C53466Goy extends AnonymousClass0T0 implements XA4 {
    public final XA3 A00;
    public final 1Xj A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53466Goy) {
                C53466Goy goy = (C53466Goy) obj;
                if (!0qQ.A0K(this.A01, goy.A01) || !0qQ.A0K(this.A00, goy.A00)) {
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

    public C53466Goy(XA3 xa3, 1Xj r2) {
        this.A01 = r2;
        this.A00 = xa3;
    }
}
