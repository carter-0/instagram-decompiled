package X;

public final class KMH extends L0V {
    public final AnonymousClass51P A00;
    public final boolean A01;
    public final boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KMH(AnonymousClass51P r2, boolean z, boolean z2) {
        super(AnonymousClass05K.A0N);
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A02 = z;
        this.A01 = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KMH) {
                KMH kmh = (KMH) obj;
                if (!(0qQ.A0K(this.A00, kmh.A00) && this.A02 == kmh.A02 && this.A01 == kmh.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TF.A09(this.A02, AnonymousClass7TE.A0K(this.A00)));
    }
}
