package X;

/* renamed from: X.SRq  reason: case insensitive filesystem */
public abstract class C11397SRq {
    public static /* bridge */ /* synthetic */ void A02(char[] cArr, byte b, byte b2, int i) {
        if (b < -62 || A03(b2)) {
            throw C8842RCi.A02();
        }
        Pxi.A0s(b, b2, cArr, i);
    }

    public static boolean A03(byte b) {
        return C51970G9q.A1W(b, -65);
    }

    public static /* bridge */ /* synthetic */ void A00(char[] cArr, byte b, byte b2, byte b3, byte b4, int i) {
        if (A03(b2) || Pxi.A04(b, b2) != 0 || A03(b3) || A03(b4)) {
            throw C8842RCi.A02();
        }
        Pxk.A0M(((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6), b4 & 63, cArr, i);
    }

    public static /* bridge */ /* synthetic */ void A01(char[] cArr, byte b, byte b2, byte b3, int i) {
        if (!A03(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            } else if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!A03(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw C8842RCi.A02();
    }
}
