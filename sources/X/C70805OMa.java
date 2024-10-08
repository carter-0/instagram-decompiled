package X;

import java.util.Arrays;

/* renamed from: X.OMa  reason: case insensitive filesystem */
public final class C70805OMa {
    public final Integer A00;
    public final boolean A01;
    public final byte[] A02;

    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (this != obj) {
            if (obj == null || !DbY.A1b(this, obj)) {
                return false;
            }
            C70805OMa oMa = (C70805OMa) obj;
            Integer num = this.A00;
            Integer num2 = oMa.A00;
            if (num == null) {
                equals = DbW.A1a(num2);
            } else {
                equals = num.equals(num2);
            }
            byte[] bArr = this.A02;
            byte[] bArr2 = oMa.A02;
            if (bArr == null) {
                equals2 = DbW.A1a(bArr2);
            } else {
                equals2 = Arrays.equals(bArr, bArr2);
            }
            if (this.A01 != oMa.A01 || !equals2 || !equals) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        byte[] bArr = this.A02;
        if (bArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(bArr);
        }
        return AnonymousClass7TF.A09(this.A01, hashCode * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C70805OMa(Integer num, byte[] bArr, boolean z) {
        byte[] copyOf;
        this.A01 = z;
        this.A00 = num;
        if (bArr == null) {
            copyOf = null;
        } else {
            copyOf = Arrays.copyOf(bArr, bArr.length);
        }
        this.A02 = copyOf;
    }
}
