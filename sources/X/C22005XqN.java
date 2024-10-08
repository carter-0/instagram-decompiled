package X;

import java.io.ByteArrayOutputStream;
import java.util.List;

/* renamed from: X.XqN  reason: case insensitive filesystem */
public final class C22005XqN {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 4096;
    public int A03 = 7;
    public Xs6[] A04 = new Xs6[8];
    public final List A05 = AnonymousClass7TE.A1C();
    public final YCT A06;

    public static TAH A00(C22005XqN xqN, int i) {
        Xs6 xs6;
        boolean z = true;
        if (i < 0 || i > 60) {
            z = false;
        }
        Xs6[] xs6Arr = C11317SMr.A01;
        if (z) {
            xs6 = xs6Arr[i];
        } else {
            int i2 = xqN.A03 + 1 + (i - 61);
            if (i2 >= 0) {
                Xs6[] xs6Arr2 = xqN.A04;
                if (i2 < xs6Arr2.length) {
                    xs6 = xs6Arr2[i2];
                }
            }
            throw JTO.A0u(002.A0O("Header index too large ", i + 1));
        }
        return xs6.A01;
    }

    public static void A01(C22005XqN xqN, int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            Xs6[] xs6Arr = xqN.A04;
            int length = xs6Arr.length;
            while (true) {
                length--;
                i2 = xqN.A03;
                if (length < i2 || i <= 0) {
                    int i4 = i2 + 1;
                    System.arraycopy(xs6Arr, i4, xs6Arr, i4 + i3, xqN.A01);
                    xqN.A03 += i3;
                } else {
                    int i5 = xs6Arr[length].A00;
                    i -= i5;
                    xqN.A00 -= i5;
                    xqN.A01--;
                    i3++;
                }
            }
            int i42 = i2 + 1;
            System.arraycopy(xs6Arr, i42, xs6Arr, i42 + i3, xqN.A01);
            xqN.A03 += i3;
        }
    }

    public final int A02(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            int A002 = YCT.A00(this.A06);
            if ((A002 & 128) == 0) {
                return i2 + (A002 << i4);
            }
            i2 += (A002 & 127) << i4;
            i4 += 7;
        }
    }

    public C22005XqN(C13970TmY tmY) {
        this.A06 = new C13197TPd(tmY);
    }

    public final TAH A03() {
        YCT yct = this.A06;
        int A002 = YCT.A00(yct);
        boolean A1S = AnonymousClass7TF.A1S(A002 & 128, 128);
        int A022 = A02(A002, 127);
        if (!A1S) {
            return yct.E6I((long) A022);
        }
        C21959Xmo xmo = C21959Xmo.A01;
        byte[] E6H = yct.E6H((long) A022);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C21968Xmz xmz = xmo.A00;
        C21968Xmz xmz2 = xmz;
        byte b = 0;
        int i = 0;
        for (byte b2 : E6H) {
            b = (b << 8) | (b2 & 255);
            i += 8;
            while (i >= 8) {
                xmz = xmz.A02[(b >>> (i - 8)) & 255];
                if (xmz.A02 == null) {
                    byteArrayOutputStream.write(xmz.A00);
                    i -= xmz.A01;
                    xmz = xmz2;
                } else {
                    i -= 8;
                }
            }
        }
        while (i > 0) {
            C21968Xmz xmz3 = xmz.A02[(b << (8 - i)) & 255];
            if (xmz3.A02 != null || xmz3.A01 > i) {
                break;
            }
            byteArrayOutputStream.write(xmz3.A00);
            i -= xmz3.A01;
            xmz = xmz2;
        }
        return TAH.A03(byteArrayOutputStream.toByteArray());
    }
}
