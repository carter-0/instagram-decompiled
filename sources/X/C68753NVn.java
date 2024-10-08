package X;

/* renamed from: X.NVn  reason: case insensitive filesystem */
public final class C68753NVn extends C69585NoT {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68753NVn) {
                C68753NVn nVn = (C68753NVn) obj;
                if (!0qQ.A0K(this.A00, nVn.A00) || this.A01 != nVn.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public C68753NVn(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
