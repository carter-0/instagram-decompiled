package X;

import java.io.DataOutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: X.SPu  reason: case insensitive filesystem */
public abstract class C11369SPu {
    public static int A02(DataOutputStream dataOutputStream, int i) {
        int i2 = 0;
        do {
            int i3 = i % 128;
            i /= 128;
            if (i > 0) {
                i3 |= 128;
            }
            dataOutputStream.writeByte(i3);
            i2++;
        } while (i > 0);
        return i2;
    }

    public static int A00(C11207SFh sFh) {
        int i = 0;
        if (sFh.A05) {
            i = 128;
        }
        if (sFh.A04) {
            i |= 64;
        }
        if (sFh.A07) {
            i |= 32;
        }
        int i2 = i | ((sFh.A02 & 3) << 3);
        if (sFh.A06) {
            i2 |= 4;
        }
        if (sFh.A03) {
            return i2 | 2;
        }
        return i2;
    }

    public static int A01(SNX snx) {
        int i = snx.A03.A00 << 4;
        if (snx.A04) {
            i |= 8;
        }
        int i2 = i | (snx.A02 << 1);
        if (snx.A01) {
            return i2 | 1;
        }
        return i2;
    }

    public static byte[] A03(String str) {
        try {
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            throw C41845B3m.A0j(e);
        }
    }
}
