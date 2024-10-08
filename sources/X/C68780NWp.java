package X;

/* renamed from: X.NWp  reason: case insensitive filesystem */
public final class C68780NWp extends C69600Noi {
    public final C254743sy A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68780NWp) {
                C68780NWp nWp = (C68780NWp) obj;
                if (!0qQ.A0K(this.A00, nWp.A00) || this.A01 != nWp.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public C68780NWp(C254743sy r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }
}
