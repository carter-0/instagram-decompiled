package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: X.9Dz  reason: invalid class name and case insensitive filesystem */
public abstract class C375539Dz {
    public static final Charset A00 = Charset.forName(ReactWebViewManager.HTML_ENCODING);

    public static String A00(byte[] bArr) {
        int i;
        try {
            int length = bArr.length;
            byte[] bArr2 = AnonymousClass9E0.A00;
            int i2 = (length / 3) * 4;
            if (length % 3 > 0) {
                i2 += 4;
            }
            byte[] bArr3 = new byte[i2];
            int i3 = -1;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int i6 = i4 + 3;
                if (i6 > length) {
                    break;
                }
                byte b = ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4] & 255) << 16) | (bArr[i4 + 2] & 255);
                bArr3[i5] = bArr2[(b >> 18) & 63];
                bArr3[i5 + 1] = bArr2[(b >> 12) & 63];
                bArr3[i5 + 2] = bArr2[(b >> 6) & 63];
                bArr3[i5 + 3] = bArr2[b & 63];
                i5 += 4;
                i3--;
                if (i3 == 0) {
                    bArr3[i5] = 10;
                    i5++;
                    i4 = i6;
                    i3 = 19;
                } else {
                    i4 = i6;
                }
            }
            if (i4 == length - 1) {
                int i7 = (bArr[i4] & 255) << 4;
                int i8 = i5 + 1;
                bArr3[i5] = bArr2[(i7 >> 6) & 63];
                int i9 = i8 + 1;
                bArr3[i8] = bArr2[i7 & 63];
                i = i9 + 1;
                bArr3[i9] = 61;
            } else {
                if (i4 == length - 2) {
                    int i10 = ((bArr[i4] & 255) << 10) | ((bArr[i4 + 1] & 255) << 2);
                    int i11 = i5 + 1;
                    bArr3[i5] = bArr2[(i10 >> 12) & 63];
                    int i12 = i11 + 1;
                    bArr3[i11] = bArr2[(i10 >> 6) & 63];
                    i = i12 + 1;
                    bArr3[i12] = bArr2[i10 & 63];
                }
                return new String(bArr3, "US-ASCII");
            }
            bArr3[i] = 61;
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006b, code lost:
        if (r13 != 4) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006d, code lost:
        if (r2 == r4) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006f, code lost:
        r1 = new byte[r2];
        java.lang.System.arraycopy(r3, 0, r1, 0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0075, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0109, code lost:
        return r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x006d A[EDGE_INSN: B:52:0x006d->B:15:0x006d ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A01(java.lang.String r17) {
        /*
            java.nio.charset.Charset r0 = A00
            r1 = r17
            byte[] r8 = r1.getBytes(r0)
            int r7 = r8.length
            r6 = 0
            int r0 = r7 * 3
            int r4 = r0 / 4
            byte[] r3 = new byte[r4]
            int[] r17 = X.AnonymousClass9E2.A00
            r16 = 6
            r5 = 0
            r2 = 0
        L_0x0016:
            r13 = 0
        L_0x0017:
            r9 = r6
            r14 = 3
            r12 = 4
            r11 = 2
            r15 = 1
            if (r6 >= r7) goto L_0x0065
            if (r13 != 0) goto L_0x008e
        L_0x0020:
            int r1 = r9 + 4
            if (r1 > r7) goto L_0x0062
            byte r0 = r8[r9]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r17[r0]
            int r5 = r0 << 18
            int r0 = r9 + 1
            byte r0 = r8[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r17[r0]
            int r0 = r0 << 12
            r5 = r5 | r0
            int r0 = r9 + 2
            byte r0 = r8[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r17[r0]
            int r0 = r0 << r16
            r5 = r5 | r0
            int r0 = r9 + 3
            byte r0 = r8[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r17[r0]
            r5 = r5 | r0
            if (r5 < 0) goto L_0x0062
            int r6 = r2 + 2
            byte r0 = (byte) r5
            r3[r6] = r0
            int r6 = r2 + 1
            int r0 = r5 >> 8
            byte r0 = (byte) r0
            r3[r6] = r0
            int r0 = r5 >> 16
            byte r0 = (byte) r0
            r3[r2] = r0
            int r2 = r2 + 3
            r9 = r1
            goto L_0x0020
        L_0x0062:
            if (r9 < r7) goto L_0x008e
            goto L_0x006d
        L_0x0065:
            if (r13 == r15) goto L_0x00a7
            if (r13 == r11) goto L_0x0085
            if (r13 == r14) goto L_0x0076
            if (r13 == r12) goto L_0x00a7
        L_0x006d:
            if (r2 == r4) goto L_0x0109
            byte[] r1 = new byte[r2]
            r0 = 0
            java.lang.System.arraycopy(r3, r0, r1, r0, r2)
            return r1
        L_0x0076:
            int r1 = r2 + 1
            int r0 = r5 >> 10
            byte r0 = (byte) r0
            r3[r2] = r0
            int r2 = r1 + 1
            int r0 = r5 >> 2
            byte r0 = (byte) r0
            r3[r1] = r0
            goto L_0x006d
        L_0x0085:
            int r1 = r2 + 1
            int r0 = r5 >> 4
            byte r0 = (byte) r0
            r3[r2] = r0
            r2 = r1
            goto L_0x006d
        L_0x008e:
            int r6 = r9 + 1
            byte r0 = r8[r9]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r9 = r17[r0]
            r10 = 5
            r1 = -1
            if (r13 == 0) goto L_0x00fc
            if (r13 == r15) goto L_0x00f7
            r0 = -2
            if (r13 == r11) goto L_0x00e5
            if (r13 == r14) goto L_0x00b4
            if (r13 == r12) goto L_0x00af
            if (r13 != r10) goto L_0x0017
            if (r9 == r1) goto L_0x0017
        L_0x00a7:
            java.lang.String r1 = "bad base-64"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00af:
            if (r9 == r0) goto L_0x00df
            if (r9 == r1) goto L_0x0017
            goto L_0x00a7
        L_0x00b4:
            if (r9 < 0) goto L_0x00cf
            int r0 = r5 << 6
            r9 = r9 | r0
            int r1 = r2 + 2
            byte r0 = (byte) r9
            r3[r1] = r0
            int r1 = r2 + 1
            int r0 = r9 >> 8
            byte r0 = (byte) r0
            r3[r1] = r0
            int r0 = r9 >> 16
            byte r0 = (byte) r0
            r3[r2] = r0
            int r2 = r2 + 3
            r5 = r9
            goto L_0x0016
        L_0x00cf:
            if (r9 != r0) goto L_0x00e2
            int r1 = r2 + 1
            int r0 = r5 >> 2
            byte r0 = (byte) r0
            r3[r1] = r0
            int r0 = r5 >> 10
            byte r0 = (byte) r0
            r3[r2] = r0
            int r2 = r2 + 2
        L_0x00df:
            r13 = 5
            goto L_0x0017
        L_0x00e2:
            if (r9 == r1) goto L_0x0017
            goto L_0x00a7
        L_0x00e5:
            if (r9 >= 0) goto L_0x0101
            if (r9 != r0) goto L_0x00f4
            int r1 = r2 + 1
            int r0 = r5 >> 4
            byte r0 = (byte) r0
            r3[r2] = r0
            r2 = r1
            r13 = 4
            goto L_0x0017
        L_0x00f4:
            if (r9 == r1) goto L_0x0017
            goto L_0x00a7
        L_0x00f7:
            if (r9 >= 0) goto L_0x0101
            if (r9 == r1) goto L_0x0017
            goto L_0x00a7
        L_0x00fc:
            if (r9 >= 0) goto L_0x0104
            if (r9 == r1) goto L_0x0017
            goto L_0x00a7
        L_0x0101:
            int r0 = r5 << 6
            r9 = r9 | r0
        L_0x0104:
            int r13 = r13 + 1
            r5 = r9
            goto L_0x0017
        L_0x0109:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C375539Dz.A01(java.lang.String):byte[]");
    }
}
