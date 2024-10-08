package X;

/* renamed from: X.EOo  reason: case insensitive filesystem */
public final class C47963EOo extends C48192EaY {
    public final 2EG A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47963EOo) {
                C47963EOo eOo = (C47963EOo) obj;
                if (!0qQ.A0K(this.A01, eOo.A01) || this.A00 != eOo.A00) {
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

    public C47963EOo(2EG r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }
}
