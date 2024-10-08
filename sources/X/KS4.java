package X;

public final class KS4 extends L1Y {
    public final C53368Gms A00;
    public final BBV A01;
    public final C61076JwE A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KS4(C53368Gms gms, BBV bbv, C61076JwE jwE, String str) {
        super(AnonymousClass05K.A0C);
        0qQ.A0B(jwE, 2);
        this.A01 = bbv;
        this.A02 = jwE;
        this.A00 = gms;
        this.A03 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KS4) {
                KS4 ks4 = (KS4) obj;
                if (!0qQ.A0K(this.A01, ks4.A01) || !0qQ.A0K(this.A02, ks4.A02) || !0qQ.A0K(this.A00, ks4.A00) || !0qQ.A0K(this.A03, ks4.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A01))) + AnonymousClass7TG.A0E(this.A03);
    }
}
