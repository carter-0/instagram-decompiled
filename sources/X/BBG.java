package X;

public final class BBG extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BBG) {
                BBG bbg = (BBG) obj;
                if (!(this.A00 == bbg.A00 && this.A02 == bbg.A02 && this.A03 == bbg.A03 && this.A01 == bbg.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A02, this.A00 * 31)) + this.A01;
    }

    public BBG(int i, int i2, boolean z, boolean z2) {
        this.A00 = i;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = i2;
    }
}
