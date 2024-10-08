package X;

import java.util.Arrays;

/* renamed from: X.OMt  reason: case insensitive filesystem */
public final class C70821OMt {
    public final Integer A00;
    public final Integer A01;
    public final boolean A02;
    public final byte[] A03;
    public final byte[] A04;
    public final byte[] A05;
    public final byte[] A06;
    public final byte[] A07;
    public final byte[] A08;

    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (this != obj) {
            if (obj == null || !DbY.A1b(this, obj)) {
                return false;
            }
            C70821OMt oMt = (C70821OMt) obj;
            Integer num = this.A00;
            Integer num2 = oMt.A00;
            if (num == null) {
                equals = DbW.A1a(num2);
            } else {
                equals = num.equals(num2);
            }
            Integer num3 = this.A01;
            Integer num4 = oMt.A01;
            if (num3 == null) {
                equals2 = DbW.A1a(num4);
            } else {
                equals2 = num3.equals(num4);
            }
            if (!Arrays.equals(this.A03, oMt.A03) || !Arrays.equals(this.A04, oMt.A04) || !Arrays.equals(this.A05, oMt.A05) || !Arrays.equals(this.A06, oMt.A06) || this.A02 != oMt.A02 || !equals || !equals2 || !Arrays.equals(this.A07, oMt.A07) || !Arrays.equals(this.A08, oMt.A08)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TF.A09(this.A02, ((((((Arrays.hashCode(this.A03) * 31) + Arrays.hashCode(this.A04)) * 31) + Arrays.hashCode(this.A05)) * 31) + Arrays.hashCode(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TE.A0L(this.A01)) * 31) + Arrays.hashCode(this.A07)) * 31) + Arrays.hashCode(this.A08);
    }

    public C70821OMt(Integer num, Integer num2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, boolean z) {
        C51974G9v.A1P(bArr, bArr2, bArr3, bArr4);
        AnonymousClass7TF.A1G(bArr5, 8, bArr6);
        this.A02 = z;
        this.A00 = num;
        this.A01 = num2;
        this.A03 = C66583MXo.A1b(bArr);
        this.A04 = C66583MXo.A1b(bArr2);
        this.A05 = C66583MXo.A1b(bArr3);
        this.A06 = C66583MXo.A1b(bArr4);
        this.A07 = Arrays.copyOf(bArr5, bArr5.length);
        this.A08 = Arrays.copyOf(bArr6, bArr6.length);
    }
}
