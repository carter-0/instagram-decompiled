package X;

public final class UIC extends V2A {
    public final String A00;
    public final boolean A01;

    public UIC(String str, boolean z) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UIC) {
                UIC uic = (UIC) obj;
                if (!0qQ.A0K(this.A00, uic.A00) || this.A01 != uic.A01) {
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
}
