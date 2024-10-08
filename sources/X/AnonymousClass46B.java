package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.46B  reason: invalid class name */
public final class AnonymousClass46B extends AnonymousClass46C {
    public static final AnonymousClass46E A07 = new AnonymousClass46E("", (byte) 0, 0);
    public static final AnonymousClass46D A08 = new Object();
    public static final byte[] A09;
    public AnonymousClass46F A00;
    public AnonymousClass46E A01 = null;
    public Boolean A02 = null;
    public short A03 = 0;
    public final byte[] A04 = new byte[10];
    public final long A05 = -1;
    public final long A06 = -1;

    public static void A05(AnonymousClass46B r4, int i) {
        int i2 = 0;
        while (true) {
            int i3 = i & -128;
            byte[] bArr = r4.A04;
            int i4 = i2 + 1;
            if (i3 == 0) {
                bArr[i2] = (byte) i;
                r4.A00.A01(bArr, i4);
                return;
            }
            bArr[i2] = (byte) ((i & 127) | 128);
            i >>>= 7;
            i2 = i4;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.46D, java.lang.Object] */
    static {
        byte[] bArr = new byte[20];
        A09 = bArr;
        bArr[0] = 0;
        bArr[2] = 1;
        bArr[3] = 3;
        bArr[6] = 4;
        bArr[8] = 5;
        bArr[10] = 6;
        bArr[4] = 7;
        bArr[11] = 8;
        bArr[15] = 9;
        bArr[14] = 10;
        bArr[13] = 11;
        bArr[12] = 12;
        bArr[19] = 13;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.46F, java.lang.Object] */
    public AnonymousClass46B(C2605145y r6) {
        this.A00 = r6;
        ? obj = new Object();
        obj.A00 = -1;
        obj.A01 = new short[15];
        this.A00 = obj;
    }

    public static byte A00(byte b) {
        byte b2 = (byte) (b & 15);
        switch (b2) {
            case 0:
                return 0;
            case 1:
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 6;
            case 5:
                return 8;
            case 6:
                return 10;
            case 7:
                return 4;
            case 8:
                return 11;
            case 9:
                return 15;
            case 10:
                return 14;
            case 11:
                return 13;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return 12;
            case 13:
                return 19;
            default:
                throw new RuntimeException(002.A0O("don't know what type: ", b2));
        }
    }

    public static int A01(AnonymousClass46B r5) {
        C2605245z r0 = C2605145y.A02;
        int i = 0;
        int i2 = 0;
        while (true) {
            byte A062 = r5.A06();
            i |= (A062 & Byte.MAX_VALUE) << i2;
            if ((A062 & 128) != 128) {
                return i;
            }
            i2 += 7;
        }
    }

    public static void A02(AnonymousClass46B r3, byte b) {
        byte[] bArr = r3.A04;
        bArr[0] = b;
        r3.A00.A01(bArr, 1);
    }

    public static void A03(AnonymousClass46B r4, int i) {
        if (i >= 0) {
            long j = r4.A05;
            if (j > 0 && ((long) i) > j) {
                throw new RuntimeException(String.format(AnonymousClass000.A00(2178), new Object[]{Integer.valueOf(i), Long.valueOf(j)}));
            }
            return;
        }
        throw new RuntimeException(002.A0O(AnonymousClass000.A00(458), i));
    }

    public static void A04(AnonymousClass46B r4, int i) {
        if (i >= 0) {
            long j = r4.A06;
            if (j > 0 && ((long) i) > j) {
                throw new RuntimeException(String.format(AnonymousClass000.A00(2501), new Object[]{Integer.valueOf(i), Long.valueOf(j)}));
            }
            return;
        }
        throw new RuntimeException(002.A0O(AnonymousClass000.A00(458), i));
    }

    public final void A0b(byte b) {
        byte b2 = b & 15;
        if (b2 != 2 && b2 != 3 && b2 != 4 && b2 != 6 && b2 != 8 && b2 != 19) {
            switch (b2) {
                case 10:
                case 11:
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                case 13:
                case 14:
                case 15:
                case 16:
                    return;
                default:
                    throw new RuntimeException(002.A0O(AnonymousClass000.A00(2519), (byte) b2));
            }
        }
    }
}
