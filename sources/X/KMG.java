package X;

public final class KMG extends L0V {
    public final int A00;
    public final Boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KMG) {
                KMG kmg = (KMG) obj;
                if (!(this.A00 == kmg.A00 && this.A02 == kmg.A02 && 0qQ.A0K(this.A01, kmg.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public KMG(Boolean bool, int i, boolean z) {
        super(AnonymousClass05K.A00);
        this.A00 = i;
        this.A02 = z;
        this.A01 = bool;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A02, this.A00 * 31) + AnonymousClass7TG.A0C(this.A01);
    }
}
