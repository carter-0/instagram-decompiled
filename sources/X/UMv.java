package X;

public final class UMv extends AnonymousClass0T0 implements C21012X9o {
    public final int A00;
    public final int A01;
    public final String A02;

    public UMv(int i, String str, int i2) {
        0qQ.A0B(str, 2);
        this.A00 = i;
        this.A02 = str;
        this.A01 = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UMv) {
                UMv uMv = (UMv) obj;
                if (!(this.A00 == uMv.A00 && 0qQ.A0K(this.A02, uMv.A02) && this.A01 == uMv.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A02, this.A00 * 31) + this.A01;
    }
}
