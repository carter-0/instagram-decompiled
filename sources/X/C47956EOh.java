package X;

/* renamed from: X.EOh  reason: case insensitive filesystem */
public final class C47956EOh extends C48190EaW {
    public final 2EG A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47956EOh) {
                C47956EOh eOh = (C47956EOh) obj;
                if (!0qQ.A0K(this.A01, eOh.A01) || this.A00 != eOh.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0O(this.A01));
    }

    public C47956EOh(2EG r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }
}
