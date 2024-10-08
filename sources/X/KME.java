package X;

public final class KME extends L40 {
    public final int A00;
    public final C61193Jym A01;
    public final float A02;

    public KME(C61193Jym jym, float f, int i) {
        super(2, String.valueOf(2));
        this.A01 = jym;
        this.A00 = i;
        this.A02 = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KME) {
                KME kme = (KME) obj;
                if (!(0qQ.A0K(this.A01, kme.A01) && this.A00 == kme.A00 && Float.compare(this.A02, kme.A02) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.A01.hashCode() + 62) * 31) + this.A00) * 31) + Float.floatToIntBits(this.A02);
    }
}
