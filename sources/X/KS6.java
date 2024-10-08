package X;

public final class KS6 extends L1Z {
    public final C62545Khb A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KS6) {
                KS6 ks6 = (KS6) obj;
                if (!0qQ.A0K(this.A01, ks6.A01) || this.A00 != ks6.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A01)) + 1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KS6(C62545Khb khb, String str) {
        super(AnonymousClass05K.A0C);
        AnonymousClass7TG.A1O(str, khb);
        this.A01 = str;
        this.A00 = khb;
    }
}
