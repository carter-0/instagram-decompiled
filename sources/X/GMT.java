package X;

public final class GMT extends AnonymousClass0T0 implements C59492JLq {
    public final int A00;
    public final String A01;

    public GMT(String str, int i) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GMT) {
                GMT gmt = (GMT) obj;
                if (!0qQ.A0K(this.A01, gmt.A01) || this.A00 != gmt.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + this.A00;
    }
}
