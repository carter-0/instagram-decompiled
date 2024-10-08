package X;

/* renamed from: X.HsM  reason: case insensitive filesystem */
public final class C56073HsM {
    public final int A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56073HsM) {
                C56073HsM hsM = (C56073HsM) obj;
                if (!0qQ.A0K(this.A01, hsM.A01) || this.A00 != hsM.A00) {
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

    public C56073HsM(Object obj, int i) {
        this.A01 = obj;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("HorizontalAnchor(id=");
        A1A.append(this.A01);
        A1A.append(", index=");
        return C51975G9x.A0j(A1A, this.A00);
    }
}
