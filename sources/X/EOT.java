package X;

public final class EOT extends C48187EaT {
    public final boolean A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EOT) {
                EOT eot = (EOT) obj;
                if (!(this.A01 == eot.A01 && this.A00 == eot.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return DbS.A06(this.A00, i * 31);
    }

    public EOT(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }
}
