package X;

public final class UID extends V2A {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UID) {
                UID uid = (UID) obj;
                if (!0qQ.A0K(this.A00, uid.A00) || this.A01 != uid.A01) {
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

    public UID(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
