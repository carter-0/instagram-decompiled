package X;

public final class KS5 extends L1Y {
    public final C53368Gms A00;
    public final BBV A01;
    public final C61076JwE A02;
    public final C61076JwE A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KS5) {
                KS5 ks5 = (KS5) obj;
                if (!0qQ.A0K(this.A01, ks5.A01) || !0qQ.A0K(this.A03, ks5.A03) || !0qQ.A0K(this.A02, ks5.A02) || !0qQ.A0K(this.A00, ks5.A00) || !0qQ.A0K(this.A04, ks5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0K(this.A01)))) + AnonymousClass7TG.A0E(this.A04);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KS5(C53368Gms gms, BBV bbv, C61076JwE jwE, C61076JwE jwE2, String str) {
        super(AnonymousClass05K.A00);
        AnonymousClass7TG.A1Q(jwE, jwE2);
        this.A01 = bbv;
        this.A03 = jwE;
        this.A02 = jwE2;
        this.A00 = gms;
        this.A04 = str;
    }
}
