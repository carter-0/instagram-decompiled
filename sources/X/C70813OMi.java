package X;

import java.util.Arrays;

/* renamed from: X.OMi  reason: case insensitive filesystem */
public final class C70813OMi {
    public final Integer A00;
    public final Integer A01;
    public final byte[] A02;
    public final byte[] A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !DbY.A1b(this, obj)) {
                return false;
            }
            C70813OMi oMi = (C70813OMi) obj;
            if (!Arrays.equals(this.A02, oMi.A02) || !Arrays.equals(this.A03, oMi.A03) || !0qQ.A0K(this.A00, oMi.A00) || !0qQ.A0K(this.A01, oMi.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((Arrays.hashCode(this.A02) * 31) + Arrays.hashCode(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C70813OMi(Integer num, Integer num2, byte[] bArr, byte[] bArr2) {
        AnonymousClass7TG.A1O(bArr, bArr2);
        this.A00 = num;
        this.A01 = num2;
        this.A02 = C66583MXo.A1b(bArr);
        this.A03 = C66583MXo.A1b(bArr2);
    }
}
