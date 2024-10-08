package X;

import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;

/* renamed from: X.T8y  reason: case insensitive filesystem */
public final class C12827T8y implements Closeable {
    public C10469Rsk A00;
    public final C11227SGf A01 = new C11227SGf();
    public final InputStream A02;
    public final byte[] A03 = new byte[8];

    private final void A03(byte[] bArr, int i) {
        int i2 = 0;
        while (i2 != i) {
            int read = this.A02.read(bArr, i2, i - i2);
            if (read != -1) {
                i2 += read;
            } else {
                throw new EOFException();
            }
        }
        this.A00 = null;
    }

    public static final long A00(C12827T8y t8y) {
        long j;
        long j2;
        C12827T8y t8y2 = t8y;
        C10469Rsk rsk = t8y2.A00;
        byte b = rsk.A01;
        if (b < 24) {
            long j3 = (long) b;
            t8y2.A00 = null;
            return j3;
        } else if (b == 24) {
            int read = t8y2.A02.read();
            if (read != -1) {
                t8y2.A00 = null;
                return ((long) read) & 255;
            }
            throw new EOFException();
        } else if (b == 25) {
            byte[] bArr = t8y2.A03;
            t8y2.A03(bArr, 2);
            return ((((long) bArr[0]) & 255) << 8) | (255 & ((long) bArr[1]));
        } else {
            if (b == 26) {
                byte[] bArr2 = t8y2.A03;
                t8y2.A03(bArr2, 4);
                long j4 = (long) bArr2[0];
                long j5 = (long) bArr2[1];
                long j6 = (j5 & 255) << 16;
                j = j6 | ((j4 & 255) << 24) | ((((long) bArr2[2]) & 255) << 8);
                j2 = ((long) bArr2[3]) & 255;
            } else if (b == 27) {
                byte[] bArr3 = t8y2.A03;
                t8y2.A03(bArr3, 8);
                long j7 = (long) bArr3[0];
                long j8 = (long) bArr3[1];
                long j9 = (long) bArr3[2];
                long j10 = (long) bArr3[3];
                long j11 = (long) bArr3[4];
                long j12 = (((long) bArr3[5]) & 255) << 16;
                j = j12 | ((j9 & 255) << 40) | ((j7 & 255) << 56) | ((j8 & 255) << 48) | ((j10 & 255) << 32) | ((j11 & 255) << 24) | ((((long) bArr3[6]) & 255) << 8);
                j2 = ((long) bArr3[7]) & 255;
            } else {
                throw JTO.A0u(String.format("invalid additional information %s for major type %s", C51968G9o.A1Z(Byte.valueOf(b), (rsk.A00 >> 5) & 7)));
            }
            return j2 | j;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0106, code lost:
        if (r8 == -5) goto L_0x00e3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C10469Rsk A05() {
        /*
            r10 = this;
            X.Rsk r0 = r10.A00
            if (r0 != 0) goto L_0x00ef
            java.io.InputStream r0 = r10.A02
            int r1 = r0.read()
            r0 = -1
            if (r1 != r0) goto L_0x0014
            X.SGf r0 = r10.A01
            r0.A01()
            r0 = 0
            return r0
        L_0x0014:
            X.Rsk r2 = new X.Rsk
            r2.<init>(r1)
            r10.A00 = r2
            byte r1 = r2.A00
            r0 = -128(0xffffffffffffff80, float:NaN)
            if (r1 == r0) goto L_0x00ae
            r0 = -96
            if (r1 == r0) goto L_0x00ae
            r0 = -64
            if (r1 == r0) goto L_0x00ae
            r0 = -32
            if (r1 == r0) goto L_0x0080
            if (r1 == 0) goto L_0x00ae
            r0 = 32
            if (r1 == r0) goto L_0x00ae
            r0 = 64
            if (r1 == r0) goto L_0x006c
            r0 = 96
            if (r1 != r0) goto L_0x0071
            X.SGf r7 = r10.A01
            r8 = -2
        L_0x003f:
            long r5 = X.C11227SGf.A00(r7)
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x00d1
            r3 = -1
            r1 = -2
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0055
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00d1
            r5 = -2
        L_0x0055:
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "expected non-string scope or scope %s but found %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        L_0x006c:
            X.SGf r7 = r10.A01
            r8 = -1
            goto L_0x003f
        L_0x0071:
            int r0 = r1 >> 5
            r0 = r0 & 7
            java.lang.Object[] r1 = X.AnonymousClass7TF.A1b(r0)
            java.lang.String r0 = "invalid major type: %s"
            java.lang.IllegalStateException r0 = X.Pxf.A0Y(r0, r1)
            throw r0
        L_0x0080:
            byte r1 = r2.A01
            r0 = 31
            if (r1 != r0) goto L_0x00ae
            X.SGf r7 = r10.A01
            long r3 = X.C11227SGf.A00(r7)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x009f
            r1 = -5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0109
            java.lang.String r0 = "expected a value for dangling key in indefinite-length map"
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        L_0x009f:
            java.lang.Object[] r1 = X.Pxf.A1W(r3)
            java.lang.String r0 = "expected indefinite length scope but found %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        L_0x00ae:
            X.SGf r7 = r10.A01
            long r5 = X.C11227SGf.A00(r7)
            r3 = -2
            r1 = -1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00c2
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00d1
            r5 = -2
        L_0x00c2:
            java.lang.Object[] r1 = X.Pxf.A1W(r5)
            java.lang.String r0 = "expected non-string scope but found %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        L_0x00d1:
            long r8 = X.C11227SGf.A00(r7)
            r1 = 1
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0109
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f2
            r0 = -1
            long r4 = r8 + r0
        L_0x00e3:
            java.util.Deque r3 = r7.A00
            r3.pop()
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
        L_0x00ec:
            r3.push(r0)
        L_0x00ef:
            X.Rsk r0 = r10.A00
            return r0
        L_0x00f2:
            r1 = -5
            r4 = -4
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0104
            java.util.Deque r3 = r7.A00
            r3.pop()
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            goto L_0x00ec
        L_0x0104:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00ef
            goto L_0x00e3
        L_0x0109:
            java.util.Deque r0 = r7.A00
            r0.pop()
            goto L_0x00ef
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12827T8y.A05():X.Rsk");
    }

    public final void close() {
        this.A02.close();
        this.A01.A01();
    }

    public C12827T8y(InputStream inputStream) {
        this.A02 = inputStream;
    }

    public static final void A01(C12827T8y t8y) {
        t8y.A05();
        byte b = t8y.A00.A01;
        if (b == 31) {
            throw Pxf.A0Y("expected definite length but found %s", new Object[]{Byte.valueOf(b)});
        }
    }

    public static final void A02(C12827T8y t8y, byte b) {
        t8y.A05();
        byte b2 = t8y.A00.A00;
        if (b2 != b) {
            throw Pxf.A0Y("expected major type %s but found %s", C51968G9o.A1Z(Integer.valueOf((b >> 5) & 7), (b2 >> 5) & 7));
        }
    }

    public static final byte[] A04(C12827T8y t8y) {
        A01(t8y);
        long A002 = A00(t8y);
        if (A002 < 0 || A002 > 2147483647L) {
            throw AnonymousClass7TE.A1B(String.format("the maximum supported byte/text string length is %s bytes", AnonymousClass7TF.A1b(Integer.MAX_VALUE)));
        } else if (((long) t8y.A02.available()) >= A002) {
            int i = (int) A002;
            byte[] bArr = new byte[i];
            t8y.A03(bArr, i);
            return bArr;
        } else {
            throw new EOFException();
        }
    }
}
