package X;

import java.nio.charset.Charset;

/* renamed from: X.Xq3  reason: case insensitive filesystem */
public abstract class C21996Xq3 {
    public static final byte[] A00 = A01(2, 1);
    public static final byte[] A01 = A01(2, 2);
    public static final byte[] A02 = A01(1, 2);
    public static final byte[] A03 = A01(1, 0);
    public static final byte[] A04 = A01(2, 3);
    public static final byte[] A05 = new byte[0];
    public static final byte[] A06 = A01(2, 1);
    public static final byte[] A07 = A01(2, 2);
    public static final byte[] A08 = A01(2, 3);
    public static final byte[] A09;
    public static final byte[] A0A;
    public static final byte[] A0B;
    public static final byte[] A0C = A01(2, 16);
    public static final byte[] A0D = A01(2, 17);
    public static final byte[] A0E = A01(2, 18);
    public static final byte[] A0F = A01(2, 32);

    static {
        Charset charset = C3740397x.A00;
        A0B = "KEM".getBytes(charset);
        A09 = "HPKE".getBytes(charset);
        A0A = "HPKE-v1".getBytes(charset);
    }

    public static int A00(XOa xOa) {
        if (xOa == XOa.A03 || xOa == XOa.A00) {
            return 32;
        }
        if (xOa == XOa.A01) {
            return 48;
        }
        if (xOa == XOa.A02) {
            return 66;
        }
        throw AnonymousClass7TG.A0q("Unrecognized HPKE KEM identifier");
    }

    public static byte[] A01(int i, int i2) {
        if (i2 < 0 || i2 >= (1 << (i * 8))) {
            throw AnonymousClass7TE.A0w("value too large");
        }
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ((i2 >> (((i - i3) - 1) * 8)) & 255);
        }
        return bArr;
    }
}
