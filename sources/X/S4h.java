package X;

import java.util.Arrays;

public final class S4h {
    public final int A00;
    public final int A01;
    public final int A02;
    public final byte[] A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            S4h s4h = (S4h) obj;
            if (!(this.A01 == s4h.A01 && this.A02 == s4h.A02 && this.A00 == s4h.A00 && Arrays.equals(this.A03, s4h.A03))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((Pxh.A0D(this.A03, this.A01 * 31) * 31) + this.A02) * 31) + this.A00;
    }

    public S4h(int i, byte[] bArr, int i2, int i3) {
        this.A01 = i;
        this.A03 = bArr;
        this.A02 = i2;
        this.A00 = i3;
    }
}
