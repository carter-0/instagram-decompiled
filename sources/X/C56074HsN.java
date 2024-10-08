package X;

/* renamed from: X.HsN  reason: case insensitive filesystem */
public final class C56074HsN {
    public final int A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56074HsN) {
                C56074HsN hsN = (C56074HsN) obj;
                if (!0qQ.A0K(this.A01, hsN.A01) || this.A00 != hsN.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A01) + this.A00;
    }

    public C56074HsN(Object obj, int i) {
        this.A01 = obj;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("VerticalAnchor(id=");
        A1A.append(this.A01);
        A1A.append(", index=");
        return C51975G9x.A0j(A1A, this.A00);
    }
}
