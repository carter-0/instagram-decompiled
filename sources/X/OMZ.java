package X;

import java.util.Arrays;

public final class OMZ {
    public final byte[] A00;
    public final byte[] A01;
    public final byte[] A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !DbY.A1b(this, obj)) {
                return false;
            }
            OMZ omz = (OMZ) obj;
            if (!Arrays.equals(this.A01, omz.A01) || !Arrays.equals(this.A02, omz.A02) || !Arrays.equals(this.A00, omz.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.A01);
        int hashCode2 = hashCode + (hashCode * 31) + Arrays.hashCode(this.A02);
        return hashCode2 + (hashCode2 * 31) + Arrays.hashCode(this.A00);
    }

    public OMZ(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        AnonymousClass7TG.A1U(bArr, bArr2, bArr3);
        this.A01 = C66583MXo.A1b(bArr);
        this.A00 = C66583MXo.A1b(bArr3);
        this.A02 = C66583MXo.A1b(bArr2);
    }
}
