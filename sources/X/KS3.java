package X;

public final class KS3 extends L1Y {
    public final C53368Gms A00;
    public final C61076JwE A01;
    public final C61076JwE A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KS3) {
                KS3 ks3 = (KS3) obj;
                if (!0qQ.A0K(this.A02, ks3.A02) || !0qQ.A0K(this.A01, ks3.A01) || !0qQ.A0K(this.A00, ks3.A00) || !0qQ.A0K(this.A03, ks3.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A02))) + AnonymousClass7TG.A0E(this.A03);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KS3(C53368Gms gms, C61076JwE jwE, C61076JwE jwE2, String str) {
        super(AnonymousClass05K.A01);
        AnonymousClass7TG.A1O(jwE, jwE2);
        this.A02 = jwE;
        this.A01 = jwE2;
        this.A00 = gms;
        this.A03 = str;
    }
}
