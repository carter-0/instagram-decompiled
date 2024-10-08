package X;

import java.io.IOException;
import java.math.RoundingMode;

public abstract class S01 {
    public static final S01 A00 = new C8464Qv9(new SJF("base16()", "0123456789ABCDEF".toCharArray()));
    public static final S01 A01;
    public static final S01 A02;
    public static final S01 A03 = new C8465QvA(new SJF("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567".toCharArray()), '=');
    public static final S01 A04 = new C8465QvA(new SJF("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV".toCharArray()), '=');

    public final String A00(byte[] bArr, int i) {
        int length = bArr.length;
        SKo.A02(0, i, length);
        C8465QvA qvA = (C8465QvA) this;
        SJF sjf = qvA.A00;
        int i2 = sjf.A03;
        StringBuilder A14 = Pxe.A14(sjf.A02 * C9708RfR.A00(RoundingMode.CEILING, i, i2));
        try {
            if (qvA instanceof C8463Qv8) {
                int i3 = 0;
                SKo.A02(0, i, length);
                for (int i4 = i; i4 >= 3; i4 -= 3) {
                    int i5 = i3 + 1;
                    int i6 = i5 + 1;
                    byte b = ((bArr[i3] & 255) << 16) | ((bArr[i5] & 255) << 8) | (bArr[i6] & 255);
                    char[] cArr = sjf.A07;
                    A14.append(cArr[b >>> 18]);
                    A14.append(cArr[(b >>> 12) & 63]);
                    A14.append(cArr[(b >>> 6) & 63]);
                    A14.append(cArr[b & 63]);
                    i3 = i6 + 1;
                }
                if (i3 < i) {
                    qvA.A01(A14, bArr, i3, i - i3);
                }
            } else if (qvA instanceof C8464Qv9) {
                C8464Qv9 qv9 = (C8464Qv9) qvA;
                SKo.A02(0, i, length);
                for (int i7 = 0; i7 < i; i7++) {
                    byte b2 = bArr[i7] & 255;
                    char[] cArr2 = qv9.A00;
                    A14.append(cArr2[b2]);
                    A14.append(cArr2[b2 | 256]);
                }
            } else {
                SKo.A02(0, i, length);
                for (int i8 = 0; i8 < i; i8 += i2) {
                    qvA.A01(A14, bArr, i8, Pxh.A04(i, i8, i2));
                }
            }
            return A14.toString();
        } catch (IOException e) {
            throw Pxe.A0e(e);
        }
    }

    static {
        SJF sjf = new SJF("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray());
        C8465QvA qvA = new C8465QvA(sjf, '=');
        if (sjf.A07.length == 64) {
            A01 = qvA;
            SJF sjf2 = new SJF("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray());
            C8465QvA qvA2 = new C8465QvA(sjf2, '=');
            if (sjf2.A07.length == 64) {
                A02 = qvA2;
                return;
            }
            throw Pxe.A0g();
        }
        throw Pxe.A0g();
    }
}
