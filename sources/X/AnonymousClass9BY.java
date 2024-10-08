package X;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.9BY  reason: invalid class name */
public final class AnonymousClass9BY extends AnonymousClass97U {
    public int A00;
    public int A01 = Integer.MAX_VALUE;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public final InputStream A06;
    public final byte[] A07;

    public AnonymousClass9BY(InputStream inputStream) {
        Charset charset = AnonymousClass97S.A04;
        this.A06 = inputStream;
        this.A07 = new byte[4096];
        this.A00 = 0;
        this.A03 = 0;
        this.A04 = 0;
    }

    public static ArrayList A00(AnonymousClass9BY r6, int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = r6.A06.read(bArr, i2, min - i2);
                if (read != -1) {
                    r6.A04 += read;
                    i2 += read;
                } else {
                    throw AnonymousClass9GO.A01();
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public static void A01(AnonymousClass9BY r3) {
        int i = r3.A00 + r3.A05;
        r3.A00 = i;
        int i2 = r3.A04 + i;
        int i3 = r3.A01;
        if (i2 > i3) {
            int i4 = i2 - i3;
            r3.A05 = i4;
            r3.A00 = i - i4;
            return;
        }
        r3.A05 = 0;
    }

    public static boolean A03(AnonymousClass9BY r8, int i) {
        int i2 = r8.A03;
        int i3 = i2 + i;
        int i4 = r8.A00;
        if (i3 > i4) {
            int i5 = r8.A04;
            if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= r8.A01) {
                if (i2 > 0) {
                    if (i4 > i2) {
                        byte[] bArr = r8.A07;
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    i5 = r8.A04 + i2;
                    r8.A04 = i5;
                    i4 = r8.A00 - i2;
                    r8.A00 = i4;
                    r8.A03 = 0;
                }
                InputStream inputStream = r8.A06;
                try {
                    int read = inputStream.read(r8.A07, i4, Math.min(4096 - i4, (Integer.MAX_VALUE - i5) - i4));
                    if (read == 0 || read < -1 || read > 4096) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(inputStream.getClass());
                        sb.append(C273654mx.A00(434));
                        sb.append(read);
                        sb.append(C273654mx.A00(97));
                        throw new IllegalStateException(sb.toString());
                    } else if (read > 0) {
                        r8.A00 += read;
                        A01(r8);
                        if (r8.A00 >= i) {
                            return true;
                        }
                        return A03(r8, i);
                    }
                } catch (AnonymousClass9GO e) {
                    e.A01 = true;
                    throw e;
                }
            }
            return false;
        }
        throw new IllegalStateException(002.A0c(C273654mx.A00(932), C273654mx.A00(432), i));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    public static byte[] A05(AnonymousClass9BY r5, int i) {
        if (i >= 0) {
            int i2 = r5.A04;
            int i3 = r5.A03;
            int i4 = i2 + i3 + i;
            if (i4 - Integer.MAX_VALUE <= 0) {
                int i5 = r5.A01;
                if (i4 <= i5) {
                    int i6 = r5.A00 - i3;
                    int i7 = i - i6;
                    if (i7 >= 4096) {
                        try {
                            if (i7 > r5.A06.available()) {
                                return null;
                            }
                        } catch (AnonymousClass9GO e) {
                            e.A01 = true;
                            throw e;
                        }
                    }
                    byte[] bArr = new byte[i];
                    System.arraycopy(r5.A07, r5.A03, bArr, 0, i6);
                    r5.A04 += r5.A00;
                    r5.A03 = 0;
                    r5.A00 = 0;
                    while (i6 < i) {
                        int read = r5.A06.read(bArr, i6, i - i6);
                        if (read != -1) {
                            r5.A04 += read;
                            i6 += read;
                        }
                    }
                    return bArr;
                }
                r5.A0X((i5 - i2) - i3);
                throw AnonymousClass9GO.A01();
            }
            ? iOException = new IOException(C273654mx.A00(112));
            iOException.A00 = null;
            throw iOException;
        }
        ? iOException2 = new IOException(C273654mx.A00(6));
        iOException2.A00 = null;
        throw iOException2;
    }

    public final int A0S() {
        int i = this.A03;
        if (this.A00 - i < 4) {
            A02(this, 4);
            i = this.A03;
        }
        byte[] bArr = this.A07;
        this.A03 = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r4[r2] < 0) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0T() {
        /*
            r5 = this;
            int r0 = r5.A03
            int r1 = r5.A00
            if (r1 == r0) goto L_0x003c
            byte[] r4 = r5.A07
            int r2 = r0 + 1
            byte r3 = r4[r0]
            if (r3 < 0) goto L_0x005d
            r5.A03 = r2
            return r3
        L_0x0011:
            int r2 = r1 + 1
            byte r1 = r4[r1]
            int r0 = r1 << 28
            r3 = r3 ^ r0
            r0 = 266354560(0xfe03f80, float:2.2112565E-29)
            r3 = r3 ^ r0
            if (r1 >= 0) goto L_0x004d
            int r1 = r2 + 1
            byte r0 = r4[r2]
            if (r0 >= 0) goto L_0x006d
            int r2 = r1 + 1
            byte r0 = r4[r1]
            if (r0 >= 0) goto L_0x004d
            int r1 = r2 + 1
            byte r0 = r4[r2]
            if (r0 >= 0) goto L_0x006d
            int r2 = r1 + 1
            byte r0 = r4[r1]
            if (r0 >= 0) goto L_0x004d
            int r1 = r2 + 1
            byte r0 = r4[r2]
            if (r0 >= 0) goto L_0x006d
        L_0x003c:
            long r0 = r5.A0W()
            int r3 = (int) r0
            return r3
        L_0x0042:
            int r2 = r1 + 1
            byte r0 = r4[r1]
            int r0 = r0 << 14
            r3 = r3 ^ r0
            if (r3 < 0) goto L_0x004f
            r3 = r3 ^ 16256(0x3f80, float:2.278E-41)
        L_0x004d:
            r1 = r2
            goto L_0x006d
        L_0x004f:
            int r1 = r2 + 1
            byte r0 = r4[r2]
            int r0 = r0 << 21
            r3 = r3 ^ r0
            if (r3 >= 0) goto L_0x0011
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r3 = r3 ^ r0
            goto L_0x006d
        L_0x005d:
            int r1 = r1 - r2
            r0 = 9
            if (r1 < r0) goto L_0x003c
            int r1 = r2 + 1
            byte r0 = r4[r2]
            int r0 = r0 << 7
            r3 = r3 ^ r0
            if (r3 >= 0) goto L_0x0042
            r3 = r3 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x006d:
            r5.A03 = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9BY.A0T():int");
    }

    public final long A0U() {
        int i = this.A03;
        if (this.A00 - i < 8) {
            A02(this, 8);
            i = this.A03;
        }
        byte[] bArr = this.A07;
        this.A03 = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (((long) r7[r11]) < 0) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A0V() {
        /*
            r12 = this;
            int r0 = r12.A03
            int r3 = r12.A00
            if (r3 == r0) goto L_0x002f
            byte[] r7 = r12.A07
            int r2 = r0 + 1
            byte r1 = r7[r0]
            if (r1 < 0) goto L_0x00a0
            r12.A03 = r2
            long r3 = (long) r1
            return r3
        L_0x0012:
            int r11 = r8 + 1
            byte r0 = r7[r8]
            long r1 = (long) r0
            r0 = 56
            long r1 = r1 << r0
            long r5 = r5 ^ r1
            r0 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r5 ^ r0
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0040
            int r8 = r11 + 1
            byte r0 = r7[r11]
            long r1 = (long) r0
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b1
        L_0x002f:
            long r3 = r12.A0W()
            return r3
        L_0x0034:
            int r11 = r8 + 1
            byte r0 = r7[r8]
            int r0 = r0 << 14
            r1 = r1 ^ r0
            if (r1 < 0) goto L_0x0042
            r0 = r1 ^ 16256(0x3f80, float:2.278E-41)
            long r3 = (long) r0
        L_0x0040:
            r8 = r11
            goto L_0x00b1
        L_0x0042:
            int r8 = r11 + 1
            byte r0 = r7[r11]
            int r0 = r0 << 21
            r1 = r1 ^ r0
            if (r1 >= 0) goto L_0x0050
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r1 = r1 ^ r0
            goto L_0x00b0
        L_0x0050:
            long r5 = (long) r1
            int r11 = r8 + 1
            byte r0 = r7[r8]
            long r1 = (long) r0
            r0 = 28
            long r1 = r1 << r0
            long r5 = r5 ^ r1
            r9 = 0
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0065
            r3 = 266354560(0xfe03f80, double:1.315966377E-315)
        L_0x0063:
            long r3 = r3 ^ r5
            goto L_0x0040
        L_0x0065:
            int r8 = r11 + 1
            byte r0 = r7[r11]
            long r1 = (long) r0
            r0 = 35
            long r1 = r1 << r0
            long r5 = r5 ^ r1
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x007a
            r0 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L_0x0077:
            long r3 = r5 ^ r0
            goto L_0x00b1
        L_0x007a:
            int r11 = r8 + 1
            byte r0 = r7[r8]
            long r1 = (long) r0
            r0 = 42
            long r1 = r1 << r0
            long r5 = r5 ^ r1
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x008d
            r3 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x0063
        L_0x008d:
            int r8 = r11 + 1
            byte r0 = r7[r11]
            long r1 = (long) r0
            r0 = 49
            long r1 = r1 << r0
            long r5 = r5 ^ r1
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0012
            r0 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x0077
        L_0x00a0:
            int r3 = r3 - r2
            r0 = 9
            if (r3 < r0) goto L_0x002f
            int r8 = r2 + 1
            byte r0 = r7[r2]
            int r0 = r0 << 7
            r1 = r1 ^ r0
            if (r1 >= 0) goto L_0x0034
            r1 = r1 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x00b0:
            long r3 = (long) r1
        L_0x00b1:
            r12.A03 = r8
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9BY.A0V():long");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    public final long A0W() {
        long j = 0;
        int i = 0;
        do {
            if (this.A03 == this.A00) {
                A02(this, 1);
            }
            byte[] bArr = this.A07;
            int i2 = this.A03;
            this.A03 = i2 + 1;
            byte b = bArr[i2];
            j |= ((long) (b & Byte.MAX_VALUE)) << i;
            if ((b & 128) == 0) {
                return j;
            }
            i += 7;
        } while (i < 64);
        ? iOException = new IOException(Pxd.A00(5));
        iOException.A00 = null;
        throw iOException;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: X.9GO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.IllegalStateException} */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0X(int r11) {
        /*
            r10 = this;
            int r4 = r10.A00
            int r5 = r10.A03
            int r4 = r4 - r5
            if (r11 > r4) goto L_0x000d
            if (r11 < 0) goto L_0x00a0
            int r5 = r5 + r11
        L_0x000a:
            r10.A03 = r5
        L_0x000c:
            return
        L_0x000d:
            if (r11 < 0) goto L_0x00a0
            int r3 = r10.A04
            int r2 = r3 + r5
            int r1 = r2 + r11
            int r0 = r10.A01
            if (r1 > r0) goto L_0x0096
            r0 = 0
            r10.A04 = r2
            r10.A00 = r0
            r10.A03 = r0
        L_0x0020:
            if (r4 >= r11) goto L_0x003c
            int r0 = r11 - r4
            java.io.InputStream r9 = r10.A06     // Catch:{ all -> 0x008c }
            long r5 = (long) r0     // Catch:{ all -> 0x008c }
            long r1 = r9.skip(r5)     // Catch:{ 9GO -> 0x0087 }
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x005c
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x005c
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x003c
            int r0 = (int) r1     // Catch:{ 9GO -> 0x0087 }
            int r4 = r4 + r0
            goto L_0x0020
        L_0x003c:
            int r0 = r10.A04
            int r0 = r0 + r4
            r10.A04 = r0
            A01(r10)
            if (r4 >= r11) goto L_0x000c
            int r1 = r10.A00
            int r0 = r10.A03
            int r2 = r1 - r0
            r10.A03 = r1
            r1 = 1
        L_0x004f:
            A02(r10, r1)
            int r5 = r11 - r2
            int r0 = r10.A00
            if (r5 <= r0) goto L_0x000a
            int r2 = r2 + r0
            r10.A03 = r0
            goto L_0x004f
        L_0x005c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x008c }
            r3.<init>()     // Catch:{ all -> 0x008c }
            java.lang.Class r0 = r9.getClass()     // Catch:{ all -> 0x008c }
            r3.append(r0)     // Catch:{ all -> 0x008c }
            r0 = 435(0x1b3, float:6.1E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x008c }
            r3.append(r0)     // Catch:{ all -> 0x008c }
            r3.append(r1)     // Catch:{ all -> 0x008c }
            r0 = 97
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ all -> 0x008c }
            r3.append(r0)     // Catch:{ all -> 0x008c }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x008c }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008c }
            r1.<init>(r0)     // Catch:{ all -> 0x008c }
            goto L_0x008b
        L_0x0087:
            r1 = move-exception
            r0 = 1
            r1.A01 = r0     // Catch:{ all -> 0x008c }
        L_0x008b:
            throw r1     // Catch:{ all -> 0x008c }
        L_0x008c:
            r1 = move-exception
            int r0 = r10.A04
            int r0 = r0 + r4
            r10.A04 = r0
            A01(r10)
            throw r1
        L_0x0096:
            int r0 = r0 - r3
            int r0 = r0 - r5
            r10.A0X(r0)
            X.9GO r1 = X.AnonymousClass9GO.A01()
            throw r1
        L_0x00a0:
            r0 = 6
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.9GO r1 = new X.9GO
            r1.<init>(r0)
            r0 = 0
            r1.A00 = r0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9BY.A0X(int):void");
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Throwable, X.9GO, java.io.IOException] */
    public static void A02(AnonymousClass9BY r2, int i) {
        if (A03(r2, i)) {
            return;
        }
        if (i > (Integer.MAX_VALUE - r2.A04) - r2.A03) {
            ? iOException = new IOException(C273654mx.A00(112));
            iOException.A00 = null;
            throw iOException;
        }
        throw AnonymousClass9GO.A01();
    }

    public static byte[] A04(AnonymousClass9BY r6, int i) {
        byte[] A052 = A05(r6, i);
        if (A052 == null) {
            int i2 = r6.A03;
            int i3 = r6.A00;
            int i4 = i3 - i2;
            r6.A04 += i3;
            r6.A03 = 0;
            r6.A00 = 0;
            ArrayList A002 = A00(r6, i - i4);
            A052 = new byte[i];
            System.arraycopy(r6.A07, i2, A052, 0, i4);
            Iterator it = A002.iterator();
            while (it.hasNext()) {
                byte[] bArr = (byte[]) it.next();
                int length = bArr.length;
                System.arraycopy(bArr, 0, A052, i4, length);
                i4 += length;
            }
        }
        return A052;
    }
}
