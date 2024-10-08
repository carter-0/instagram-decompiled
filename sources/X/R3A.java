package X;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

public final class R3A extends C11363SPb {
    public int A00;
    public int A01 = Integer.MAX_VALUE;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public final InputStream A06;
    public final byte[] A07;

    public R3A(InputStream inputStream) {
        Charset charset = SD9.A04;
        this.A06 = inputStream;
        this.A07 = new byte[4096];
        this.A00 = 0;
        this.A03 = 0;
        this.A04 = 0;
    }

    public static void A01(R3A r3a) {
        int i = r3a.A00 + r3a.A05;
        r3a.A00 = i;
        int i2 = r3a.A04 + i;
        int i3 = r3a.A01;
        if (i2 > i3) {
            int i4 = i2 - i3;
            r3a.A05 = i4;
            r3a.A00 = i - i4;
            return;
        }
        r3a.A05 = 0;
    }

    public static boolean A03(R3A r3a, int i) {
        int i2 = r3a.A03;
        int i3 = i2 + i;
        int i4 = r3a.A00;
        if (i3 > i4) {
            int i5 = r3a.A04;
            if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= r3a.A01) {
                if (i2 > 0) {
                    if (i4 > i2) {
                        byte[] bArr = r3a.A07;
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    i5 = r3a.A04 + i2;
                    r3a.A04 = i5;
                    i4 = r3a.A00 - i2;
                    r3a.A00 = i4;
                    r3a.A03 = 0;
                }
                InputStream inputStream = r3a.A06;
                try {
                    int read = inputStream.read(r3a.A07, i4, Pxh.A04(Integer.MAX_VALUE - i5, i4, 4096 - i4));
                    if (read == 0 || read < -1 || read > 4096) {
                        StringBuilder A1A = AnonymousClass7TE.A1A();
                        A1A.append(inputStream.getClass());
                        A1A.append(C273654mx.A00(434));
                        A1A.append(read);
                        throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0l(C273654mx.A00(97), A1A));
                    } else if (read > 0) {
                        r3a.A00 += read;
                        A01(r3a);
                        if (r3a.A00 >= i) {
                            return true;
                        }
                        return A03(r3a, i);
                    }
                } catch (AnonymousClass5I7 e) {
                    e.A01 = true;
                    throw e;
                }
            }
            return false;
        }
        throw AnonymousClass7TE.A0z(002.A0c(C273654mx.A00(932), C273654mx.A00(432), i));
    }

    public static byte[] A05(R3A r3a, int i) {
        if (i >= 0) {
            int i2 = r3a.A04;
            int i3 = r3a.A03;
            int i4 = i2 + i3 + i;
            if (i4 - Integer.MAX_VALUE <= 0) {
                int i5 = r3a.A01;
                if (i4 <= i5) {
                    int i6 = r3a.A00 - i3;
                    int i7 = i - i6;
                    if (i7 >= 4096) {
                        try {
                            if (i7 > r3a.A06.available()) {
                                return null;
                            }
                        } catch (AnonymousClass5I7 e) {
                            e.A01 = true;
                            throw e;
                        }
                    }
                    byte[] bArr = new byte[i];
                    System.arraycopy(r3a.A07, r3a.A03, bArr, 0, i6);
                    r3a.A04 += r3a.A00;
                    r3a.A03 = 0;
                    r3a.A00 = 0;
                    while (i6 < i) {
                        int read = r3a.A06.read(bArr, i6, i - i6);
                        if (read != -1) {
                            r3a.A04 += read;
                            i6 += read;
                        }
                    }
                    return bArr;
                }
                r3a.A0b((i5 - i2) - i3);
                throw AnonymousClass5I7.A02();
            }
            throw Pxg.A0T(C273654mx.A00(112));
        }
        throw AnonymousClass5I7.A01();
    }

    public final int A0W() {
        int i = this.A03;
        if (this.A00 - i < 4) {
            A02(this, 4);
            i = this.A03;
        }
        byte[] bArr = this.A07;
        this.A03 = i + 4;
        return Pxk.A02(bArr, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r4[r2] < 0) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0X() {
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
            long r0 = r5.A0a()
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
        throw new UnsupportedOperationException("Method not decompiled: X.R3A.A0X():int");
    }

    public final long A0Y() {
        int i = this.A03;
        if (this.A00 - i < 8) {
            A02(this, 8);
            i = this.A03;
        }
        byte[] bArr = this.A07;
        this.A03 = i + 8;
        return C11363SPb.A06(bArr, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (((long) r7[r11]) < 0) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A0Z() {
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
            long r3 = r12.A0a()
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
        throw new UnsupportedOperationException("Method not decompiled: X.R3A.A0Z():long");
    }

    public final long A0a() {
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
        throw Pxg.A0T("CodedInputStream encountered a malformed varint.");
    }

    public final void A0b(int i) {
        int i2;
        IllegalStateException illegalStateException;
        int i3 = this.A00;
        int i4 = this.A03;
        int i5 = i3 - i4;
        if (i <= i5) {
            if (i >= 0) {
                i2 = i4 + i;
            }
            throw AnonymousClass5I7.A01();
        }
        if (i >= 0) {
            int i6 = this.A04;
            int i7 = i6 + i4;
            int i8 = i7 + i;
            int i9 = this.A01;
            if (i8 <= i9) {
                this.A04 = i7;
                this.A00 = 0;
                this.A03 = 0;
                while (i5 < i) {
                    int i10 = i - i5;
                    try {
                        InputStream inputStream = this.A06;
                        long j = (long) i10;
                        long skip = inputStream.skip(j);
                        if (skip >= 0 && skip <= j) {
                            if (skip == 0) {
                                break;
                            }
                            i5 += (int) skip;
                        } else {
                            StringBuilder A1A = AnonymousClass7TE.A1A();
                            A1A.append(inputStream.getClass());
                            A1A.append(C273654mx.A00(435));
                            A1A.append(skip);
                            illegalStateException = AnonymousClass7TE.A0z(AnonymousClass7TF.A0l(C273654mx.A00(97), A1A));
                            throw illegalStateException;
                        }
                    } catch (AnonymousClass5I7 e) {
                        e.A01 = true;
                        illegalStateException = e;
                    } catch (Throwable th) {
                        this.A04 += i5;
                        A01(this);
                        throw th;
                    }
                }
                this.A04 += i5;
                A01(this);
                if (i5 < i) {
                    int i11 = this.A00;
                    int i12 = i11 - this.A03;
                    this.A03 = i11;
                    while (true) {
                        A02(this, 1);
                        i2 = i - i12;
                        int i13 = this.A00;
                        if (i2 <= i13) {
                            break;
                        }
                        i12 += i13;
                        this.A03 = i13;
                    }
                } else {
                    return;
                }
            } else {
                A0b((i9 - i6) - i4);
                throw AnonymousClass5I7.A02();
            }
        }
        throw AnonymousClass5I7.A01();
        this.A03 = i2;
    }

    public static ArrayList A00(R3A r3a, int i) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = r3a.A06.read(bArr, i2, min - i2);
                if (read != -1) {
                    r3a.A04 += read;
                    i2 += read;
                } else {
                    throw AnonymousClass5I7.A02();
                }
            }
            i -= min;
            A1C.add(bArr);
        }
        return A1C;
    }

    public static void A02(R3A r3a, int i) {
        if (A03(r3a, i)) {
            return;
        }
        if (i > (Integer.MAX_VALUE - r3a.A04) - r3a.A03) {
            throw Pxg.A0T(C273654mx.A00(112));
        }
        throw AnonymousClass5I7.A02();
    }

    public static byte[] A04(R3A r3a, int i) {
        byte[] A052 = A05(r3a, i);
        if (A052 == null) {
            int i2 = r3a.A03;
            int i3 = r3a.A00;
            int i4 = i3 - i2;
            r3a.A04 += i3;
            r3a.A03 = 0;
            r3a.A00 = 0;
            ArrayList A002 = A00(r3a, i - i4);
            A052 = new byte[i];
            System.arraycopy(r3a.A07, i2, A052, 0, i4);
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
