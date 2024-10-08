package X;

public final class KN2 extends C62767Km5 {
    public final int A00;
    public final int A01;
    public final AnonymousClass51R A02;

    public KN2(AnonymousClass51R r2, int i, int i2) {
        0qQ.A0B(r2, 1);
        this.A02 = r2;
        this.A01 = i;
        this.A00 = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KN2) {
                KN2 kn2 = (KN2) obj;
                if (!(0qQ.A0K(this.A02, kn2.A02) && this.A01 == kn2.A01 && this.A00 == kn2.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0K(this.A02) + this.A01) * 31) + this.A00;
    }
}
