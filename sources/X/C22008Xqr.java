package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Xqr  reason: case insensitive filesystem */
public final class C22008Xqr {
    public static final byte[] A05;
    public Short A00 = null;
    public List A01 = new ArrayList(15);
    public short A02 = 0;
    public final OutputStream A03;
    public final byte[] A04 = new byte[10];

    public static void A00(C22008Xqr xqr, int i) {
        int i2 = 0;
        while (true) {
            int i3 = i & -128;
            byte[] bArr = xqr.A04;
            int i4 = i2 + 1;
            if (i3 == 0) {
                bArr[i2] = (byte) i;
                xqr.A03.write(bArr, 0, i4);
                return;
            }
            bArr[i2] = (byte) ((i & 127) | 128);
            i >>>= 7;
            i2 = i4;
        }
    }

    public final void A03(long j) {
        long j2 = (j >> 63) ^ (j << 1);
        int i = 0;
        while (true) {
            int i2 = ((-128 & j2) > 0 ? 1 : ((-128 & j2) == 0 ? 0 : -1));
            byte[] bArr = this.A04;
            int i3 = i + 1;
            if (i2 == 0) {
                bArr[i] = (byte) ((int) j2);
                this.A03.write(bArr, 0, i3);
                return;
            }
            bArr[i] = (byte) ((int) ((127 & j2) | 128));
            j2 >>>= 7;
            i = i3;
        }
    }

    static {
        byte[] bArr = new byte[20];
        A05 = bArr;
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

    public final void A01() {
        this.A01.add(Short.valueOf(this.A02));
        this.A02 = 0;
    }

    public final void A02(int i, byte b) {
        if (i <= 14) {
            this.A03.write((byte) (A05[b] | (i << 4)));
            return;
        }
        this.A03.write((byte) (A05[b] | 240));
        A00(this, i);
    }

    public final void A04(String str) {
        try {
            byte[] bytes = str.getBytes(ReactWebViewManager.HTML_ENCODING);
            int length = bytes.length;
            A00(this, length);
            this.A03.write(bytes, 0, length);
        } catch (UnsupportedEncodingException unused) {
            throw JTO.A0u("UTF-8 not supported!");
        }
    }

    public C22008Xqr(OutputStream outputStream) {
        this.A03 = outputStream;
    }
}
