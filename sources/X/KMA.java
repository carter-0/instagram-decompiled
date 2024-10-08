package X;

public final class KMA extends L0U {
    public final int A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KMA) {
                KMA kma = (KMA) obj;
                if (!(this.A00 == kma.A00 && this.A01 == kma.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public KMA(int i, boolean z) {
        super(AnonymousClass05K.A00);
        this.A00 = i;
        this.A01 = z;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, this.A00 * 31);
    }
}
