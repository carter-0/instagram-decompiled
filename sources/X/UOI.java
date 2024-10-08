package X;

public final class UOI extends AnonymousClass0T0 implements C20853X1f {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UOI) {
                UOI uoi = (UOI) obj;
                if (!0qQ.A0K(this.A01, uoi.A01) || !0qQ.A0K(this.A00, uoi.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0E(this.A00);
    }

    public UOI(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
