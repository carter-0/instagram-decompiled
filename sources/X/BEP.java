package X;

public final class BEP extends AnonymousClass0T0 implements MW9 {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BEP) {
                BEP bep = (BEP) obj;
                if (!(this.A00 == bep.A00 && this.A01 == bep.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public BEP(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
