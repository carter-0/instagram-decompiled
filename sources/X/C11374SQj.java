package X;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* renamed from: X.SQj  reason: case insensitive filesystem */
public final class C11374SQj {
    public int A00 = 0;
    public C10829Ryp A01;
    public ByteBuffer A02;
    public final byte[] A03 = new byte[256];

    public static int A00(C11374SQj sQj) {
        try {
            return sQj.A02.get() & 255;
        } catch (Exception unused) {
            sQj.A01.A05 = 1;
            return 0;
        }
    }

    public static int[] A02(C11374SQj sQj, int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            sQj.A02.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i2 + 1;
                byte b = bArr[i2] & 255;
                int i5 = i4 + 1;
                byte b2 = bArr[i4] & 255;
                i2 = i5 + 1;
                iArr[i3] = (b << 16) | -16777216 | (b2 << 8) | (bArr[i5] & 255);
            }
        } catch (BufferUnderflowException unused) {
            Log.isLoggable("GifHeaderParser", 3);
            sQj.A01.A05 = 1;
        }
        return iArr;
    }

    public static void A01(C11374SQj sQj) {
        int A002 = A00(sQj);
        sQj.A00 = A002;
        if (A002 > 0) {
            int i = 0;
            while (true) {
                try {
                    int i2 = sQj.A00;
                    if (i < i2) {
                        int i3 = i2 - i;
                        sQj.A02.get(sQj.A03, i, i3);
                        i += i3;
                    } else {
                        return;
                    }
                } catch (Exception unused) {
                    Log.isLoggable("GifHeaderParser", 3);
                    sQj.A01.A05 = 1;
                    return;
                }
            }
        }
    }
}
