package X;

public final class BGU extends AnonymousClass0T0 implements DSO {
    public final int A00;
    public final int A01;

    public final BGU F9F() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BGU) {
                BGU bgu = (BGU) obj;
                if (!(this.A00 == bgu.A00 && this.A01 == bgu.A01)) {
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

    public final int B1h() {
        return this.A00;
    }

    public final int Bys() {
        return this.A01;
    }

    public BGU(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
