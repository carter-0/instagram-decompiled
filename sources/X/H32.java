package X;

public final class H32 extends HPF {
    public final String A00;
    public final boolean A01;

    public H32(String str, boolean z) {
        0qQ.A0B(str, 1);
        this.A00 = str;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H32) {
                H32 h32 = (H32) obj;
                if (!0qQ.A0K(this.A00, h32.A00) || this.A01 != h32.A01) {
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
