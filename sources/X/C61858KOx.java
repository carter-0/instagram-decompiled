package X;

/* renamed from: X.KOx  reason: case insensitive filesystem */
public final class C61858KOx extends C62785KmN {
    public final int A00;
    public final int A01 = 2131968772;
    public final int A02 = 2131956028;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61858KOx) {
                C61858KOx kOx = (C61858KOx) obj;
                if (!(this.A03 == kOx.A03 && this.A00 == kOx.A00 && this.A01 == kOx.A01 && this.A02 == kOx.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A03 * 31) + this.A00) * 31) + this.A01) * 31) + this.A02;
    }

    public C61858KOx(int i, int i2) {
        this.A03 = i;
        this.A00 = i2;
    }
}
