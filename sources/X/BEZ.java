package X;

public final class BEZ extends AnonymousClass0T0 implements DR5 {
    public final int A00;
    public final int A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BEZ) {
                BEZ bez = (BEZ) obj;
                if (!(this.A00 == bez.A00 && this.A01 == bez.A01 && this.A02 == bez.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A00 * 31) + this.A01) * 31) + this.A02;
    }

    public BEZ(int i, int i2, int i3) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }
}
