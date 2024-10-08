package X;

public final class HJ4 extends HQB {
    public final C2606046i A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HJ4) {
                HJ4 hj4 = (HJ4) obj;
                if (!0qQ.A0K(this.A01, hj4.A01) || !0qQ.A0K(this.A00, hj4.A00)) {
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

    public HJ4(C2606046i r1, String str) {
        AnonymousClass7TG.A1O(str, r1);
        this.A01 = str;
        this.A00 = r1;
    }
}
