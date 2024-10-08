package X;

public final class HCK extends C54698HPd {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HCK) {
                HCK hck = (HCK) obj;
                if (!0qQ.A0K(this.A01, hck.A01) || this.A00 != hck.A00) {
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

    public HCK(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }
}
