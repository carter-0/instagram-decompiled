package X;

/* renamed from: X.KPm  reason: case insensitive filesystem */
public final class C61873KPm extends C62789KmR {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61873KPm) {
                C61873KPm kPm = (C61873KPm) obj;
                if (!(this.A01 == kPm.A01 && this.A00 == kPm.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public C61873KPm(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
