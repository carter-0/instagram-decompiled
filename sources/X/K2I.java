package X;

public final class K2I extends C62709Kl9 {
    public final C61081JwJ A00;
    public final C60962JuK A01;
    public final Integer A02;
    public final boolean A03;

    public K2I(C61081JwJ jwJ, C60962JuK juK, Integer num, boolean z) {
        0qQ.A0B(num, 4);
        this.A01 = juK;
        this.A03 = z;
        this.A00 = jwJ;
        this.A02 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K2I) {
                K2I k2i = (K2I) obj;
                if (!0qQ.A0K(this.A01, k2i.A01) || this.A03 != k2i.A03 || !0qQ.A0K(this.A00, k2i.A00) || this.A02 != k2i.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A09(this.A03, AnonymousClass7TE.A0K(this.A01)) + AnonymousClass7TG.A0C(this.A00)) * 31) + C63043KqY.A00(this.A02);
    }
}
