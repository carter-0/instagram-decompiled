package X;

import java.util.Arrays;

/* renamed from: X.XGy  reason: case insensitive filesystem */
public final class C21155XGy extends C21472Xc5 {
    public static final byte[] A01 = {79, 112, 117, 115, 84, 97, 103, 115};
    public static final byte[] A02 = {79, 112, 117, 115, 72, 101, 97, 100};
    public boolean A00;

    public static boolean A00(C11389SRd sRd, byte[] bArr) {
        int i = sRd.A00;
        int i2 = sRd.A01;
        if (i - i2 < 8) {
            return false;
        }
        byte[] bArr2 = new byte[8];
        sRd.A0R(bArr2, 0, 8);
        sRd.A0O(i2);
        return Arrays.equals(bArr2, bArr);
    }

    public final void A01(boolean z) {
        super.A01(z);
        if (z) {
            this.A00 = false;
        }
    }
}
