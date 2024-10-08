package X;

/* renamed from: X.S7v  reason: case insensitive filesystem */
public abstract class C11050S7v {
    public static void A00(char[] cArr, byte b, byte b2, byte b3, byte b4, int i) {
        if (b2 > -65 || Pxi.A04(b, b2) != 0 || b3 > -65 || b4 > -65) {
            throw new C289845eJ("Protocol message had invalid UTF-8.");
        }
        Pxk.A0M(((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6), b4 & 63, cArr, i);
    }

    public static void A01(char[] cArr, byte b, byte b2, byte b3, int i) {
        if (b2 > -65 || (b != -32 ? !(b != -19 || b2 < -96) : b2 < -96) || b3 > -65) {
            throw new C289845eJ("Protocol message had invalid UTF-8.");
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }
}
