package X;

public final class KS2 extends L1Y {
    public final C61076JwE A00;
    public final String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KS2(C61076JwE jwE, String str) {
        super(AnonymousClass05K.A0Y);
        0qQ.A0B(jwE, 1);
        this.A00 = jwE;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KS2) {
                KS2 ks2 = (KS2) obj;
                if (!0qQ.A0K(this.A00, ks2.A00) || !0qQ.A0K(this.A01, ks2.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0E(this.A01);
    }
}
