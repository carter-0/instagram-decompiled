package X;

import com.facebook.common.dextricks.Constants;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* renamed from: X.TPe  reason: case insensitive filesystem */
public final class C13198TPe implements YCT, YCS, Cloneable, ByteChannel {
    public static final byte[] A02 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    public long A00;
    public SRX A01;

    public final byte A00(long j) {
        int i;
        SRX srx;
        long j2 = j;
        SCP.A00(this.A00, j2, 1);
        long j3 = this.A00;
        if (j3 - j > j) {
            srx = this.A01;
            while (true) {
                int i2 = srx.A00;
                i = srx.A01;
                long j4 = (long) (i2 - i);
                if (j2 < j4) {
                    break;
                }
                j2 -= j4;
                srx = srx.A02;
            }
        } else {
            j2 = j - j3;
            srx = this.A01;
            do {
                srx = srx.A03;
                int i3 = srx.A00;
                i = srx.A01;
                j2 += (long) (i3 - i);
            } while (j2 < 0);
        }
        return srx.A06[i + ((int) j2)];
    }

    public final int A02(byte[] bArr, int i, int i2) {
        SCP.A00((long) bArr.length, (long) i, (long) i2);
        SRX srx = this.A01;
        if (srx == null) {
            return -1;
        }
        int i3 = srx.A00;
        int i4 = srx.A01;
        int A04 = Pxh.A04(i3, i4, i2);
        System.arraycopy(srx.A06, i4, bArr, i, A04);
        int i5 = srx.A01 + A04;
        srx.A01 = i5;
        this.A00 -= (long) A04;
        if (i5 != srx.A00) {
            return A04;
        }
        SRX.A01(this, srx);
        return A04;
    }

    public final SRX A09(int i) {
        if (i < 1 || i > 8192) {
            throw Pxe.A0g();
        }
        SRX srx = this.A01;
        if (srx == null) {
            SRX A002 = C11318SMs.A00();
            this.A01 = A002;
            A002.A03 = A002;
            A002.A02 = A002;
            return A002;
        }
        SRX srx2 = srx.A03;
        if (srx2.A00 + i <= 8192 && srx2.A04) {
            return srx2;
        }
        SRX A003 = C11318SMs.A00();
        srx2.A05(A003);
        return A003;
    }

    public final void A0B(int i) {
        SRX A09 = A09(1);
        byte[] bArr = A09.A06;
        int i2 = A09.A00;
        A09.A00 = i2 + 1;
        bArr[i2] = (byte) i;
        this.A00++;
    }

    public final void A0C(int i) {
        SRX A09 = A09(4);
        byte[] bArr = A09.A06;
        int i2 = A09.A00;
        int i3 = i2 + 1;
        Pxe.A1H(i >>> 24, bArr, i2);
        int i4 = i3 + 1;
        Pxe.A1H(i >>> 16, bArr, i3);
        int i5 = i4 + 1;
        Pxe.A1H(i >>> 8, bArr, i4);
        Pxe.A1H(i, bArr, i5);
        A09.A00 = i5 + 1;
        this.A00 += 4;
    }

    public final void A0D(int i) {
        SRX A09 = A09(2);
        byte[] bArr = A09.A06;
        int i2 = A09.A00;
        int i3 = i2 + 1;
        Pxe.A1H(i >>> 8, bArr, i2);
        Pxe.A1H(i, bArr, i3);
        A09.A00 = i3 + 1;
        this.A00 += 2;
    }

    public final void A0I(C13198TPe tPe, long j, long j2) {
        long j3 = j2;
        long j4 = j;
        if (tPe != null) {
            SCP.A00(this.A00, j4, j3);
            if (j2 != 0) {
                tPe.A00 += j2;
                SRX srx = this.A01;
                while (j4 >= SRX.A00(srx)) {
                    j4 -= SRX.A00(srx);
                    srx = srx.A02;
                }
                while (j3 > 0) {
                    SRX A03 = srx.A03();
                    int i = (int) (((long) A03.A01) + j4);
                    A03.A01 = i;
                    A03.A00 = Math.min(i + ((int) j3), A03.A00);
                    SRX srx2 = tPe.A01;
                    if (srx2 == null) {
                        A03.A03 = A03;
                        A03.A02 = A03;
                        tPe.A01 = A03;
                    } else {
                        srx2.A03.A05(A03);
                    }
                    j3 -= SRX.A00(A03);
                    srx = srx.A02;
                    j4 = 0;
                }
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0w("out == null");
    }

    public final void A0K(byte[] bArr, int i) {
        int i2 = 0;
        if (bArr != null) {
            long j = (long) i;
            SCP.A00((long) bArr.length, 0, j);
            while (i2 < i) {
                SRX A09 = A09(1);
                int i3 = A09.A00;
                int min = Math.min(i - i2, 8192 - i3);
                System.arraycopy(bArr, i2, A09.A06, i3, min);
                i2 += min;
                A09.A00 += min;
            }
            this.A00 += j;
            return;
        }
        throw AnonymousClass7TE.A0w("source == null");
    }

    public final C13198TPe AEA() {
        return this;
    }

    public final YCS ARF() {
        return this;
    }

    public final C13198TPe AiN() {
        return this;
    }

    public final long CMD(byte b) {
        return A03((byte) 0, 0, Long.MAX_VALUE);
    }

    public final int EL6(TS1 ts1) {
        int A012 = A01(ts1, false);
        if (A012 == -1) {
            return -1;
        }
        try {
            Evi((long) ts1.A01[A012].A05());
            return A012;
        } catch (EOFException unused) {
            throw Pxe.A0d();
        }
    }

    public final void FNi(C13198TPe tPe, long j) {
        int i;
        SRX A002;
        SRX srx;
        int i2;
        long j2 = j;
        if (tPe == null) {
            throw AnonymousClass7TE.A0w("source == null");
        } else if (tPe != this) {
            SCP.A00(tPe.A00, 0, j2);
            while (j2 > 0) {
                SRX srx2 = tPe.A01;
                int i3 = srx2.A00 - srx2.A01;
                if (j2 < ((long) i3)) {
                    SRX srx3 = this.A01;
                    if (!(srx3 == null || (srx = srx3.A03) == null || !srx.A04)) {
                        long j3 = ((long) srx.A00) + j2;
                        if (srx.A05) {
                            i2 = 0;
                        } else {
                            i2 = srx.A01;
                        }
                        if (j3 - ((long) i2) <= 8192) {
                            srx2.A06(srx, (int) j2);
                            tPe.A00 -= j2;
                            this.A00 += j2;
                            return;
                        }
                    }
                    int i4 = (int) j2;
                    if (i4 <= 0 || i4 > i3) {
                        throw Pxe.A0g();
                    }
                    if (i4 >= 1024) {
                        A002 = srx2.A03();
                    } else {
                        A002 = C11318SMs.A00();
                        System.arraycopy(srx2.A06, srx2.A01, A002.A06, 0, i4);
                    }
                    A002.A00 = A002.A01 + i4;
                    srx2.A01 += i4;
                    srx2.A03.A05(A002);
                    tPe.A01 = A002;
                    srx2 = A002;
                }
                int i5 = srx2.A00 - srx2.A01;
                long j4 = (long) i5;
                tPe.A01 = srx2.A02();
                SRX srx4 = this.A01;
                if (srx4 == null) {
                    this.A01 = srx2;
                    srx2.A03 = srx2;
                    srx2.A02 = srx2;
                } else {
                    srx4.A03.A05(srx2);
                    SRX srx5 = srx2.A03;
                    if (srx5 == srx2) {
                        throw Pxe.A0i();
                    } else if (srx5.A04) {
                        int i6 = 8192 - srx5.A00;
                        if (srx5.A05) {
                            i = 0;
                        } else {
                            i = srx5.A01;
                        }
                        if (i5 <= i6 + i) {
                            srx2.A06(srx5, i5);
                            srx2.A02();
                            C11318SMs.A01(srx2);
                        }
                    }
                }
                tPe.A00 -= j4;
                this.A00 += j4;
                j2 -= j4;
            }
        } else {
            throw AnonymousClass7TE.A0w("source == this");
        }
    }

    public final void close() {
    }

    public final void flush() {
    }

    public final boolean isOpen() {
        return true;
    }

    public final void readFully(byte[] bArr) {
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i < length) {
                int A022 = A02(bArr, i, length - i);
                if (A022 != -1) {
                    i += A022;
                } else {
                    throw new EOFException();
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004f, code lost:
        r0 = r7[r1];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A01(X.TS1 r16, boolean r17) {
        /*
            r15 = this;
            X.SRX r9 = r15.A01
            r14 = -2
            r1 = r16
            if (r9 != 0) goto L_0x0010
            if (r17 != 0) goto L_0x0082
            X.TAH r0 = X.TAH.A02
            int r0 = r1.indexOf(r0)
            return r0
        L_0x0010:
            byte[] r3 = r9.A06
            int r2 = r9.A01
            int r8 = r9.A00
            int[] r7 = r1.A00
            r6 = -1
            r5 = r9
            r1 = 0
            r13 = -1
        L_0x001c:
            int r0 = r1 + 1
            r11 = r7[r1]
            int r10 = r0 + 1
            r0 = r7[r0]
            if (r0 == r6) goto L_0x0027
            r13 = r0
        L_0x0027:
            if (r5 == 0) goto L_0x007f
            r12 = 0
            if (r11 >= 0) goto L_0x0057
            int r0 = -r11
            int r11 = r10 + r0
        L_0x002f:
            int r4 = r2 + 1
            byte r0 = r3[r2]
            r2 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r10 + 1
            r0 = r7[r10]
            if (r2 == r0) goto L_0x003c
            return r13
        L_0x003c:
            boolean r0 = X.AnonymousClass7TF.A1S(r1, r11)
            if (r4 != r8) goto L_0x0052
            X.SRX r5 = r5.A02
            int r4 = r5.A01
            byte[] r3 = r5.A06
            int r8 = r5.A00
            if (r5 != r9) goto L_0x0052
            if (r0 == 0) goto L_0x007f
            r5 = r12
        L_0x004f:
            r0 = r7[r1]
            goto L_0x0076
        L_0x0052:
            if (r0 != 0) goto L_0x004f
            r2 = r4
            r10 = r1
            goto L_0x002f
        L_0x0057:
            int r4 = r2 + 1
            byte r0 = r3[r2]
            r2 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r10 + r11
        L_0x005f:
            if (r10 != r1) goto L_0x0062
            return r13
        L_0x0062:
            r0 = r7[r10]
            if (r2 != r0) goto L_0x0079
            int r10 = r10 + r11
            r0 = r7[r10]
            if (r4 != r8) goto L_0x0076
            X.SRX r5 = r5.A02
            int r4 = r5.A01
            byte[] r3 = r5.A06
            int r8 = r5.A00
            if (r5 != r9) goto L_0x0076
            r5 = r12
        L_0x0076:
            if (r0 < 0) goto L_0x007c
            return r0
        L_0x0079:
            int r10 = r10 + 1
            goto L_0x005f
        L_0x007c:
            int r1 = -r0
            r2 = r4
            goto L_0x001c
        L_0x007f:
            if (r17 != 0) goto L_0x0082
            return r13
        L_0x0082:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13198TPe.A01(X.TS1, boolean):int");
    }

    public final long A03(byte b, long j, long j2) {
        SRX srx;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw Pxf.A0X("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.A00), Long.valueOf(j), Long.valueOf(j2)});
        }
        long j4 = this.A00;
        if (j2 > j4) {
            j2 = j4;
        }
        if (!(j == j2 || (srx = this.A01) == null)) {
            if (j4 - j < j) {
                while (j4 > j) {
                    srx = srx.A03;
                    j4 -= SRX.A00(srx);
                }
            } else {
                while (true) {
                    long A002 = SRX.A00(srx) + j3;
                    if (A002 >= j) {
                        break;
                    }
                    srx = srx.A02;
                    j3 = A002;
                }
                j4 = j3;
            }
            while (j4 < j2) {
                byte[] bArr = srx.A06;
                int i = srx.A00;
                int i2 = srx.A01;
                long j5 = (long) i2;
                int min = (int) Math.min((long) i, (j5 + j2) - j4);
                for (int i3 = (int) ((j5 + j) - j4); i3 < min; i3++) {
                    if (bArr[i3] == b) {
                        return ((long) (i3 - i2)) + j4;
                    }
                }
                j4 += (long) (i - i2);
                srx = srx.A02;
                j = j4;
            }
        }
        return -1;
    }

    public final long A04(TAH tah, long j) {
        int i;
        int i2;
        long j2 = 0;
        if (j >= 0) {
            SRX srx = this.A01;
            if (srx != null) {
                long j3 = this.A00;
                if (j3 - j < j) {
                    while (j3 > j) {
                        srx = srx.A03;
                        j3 -= SRX.A00(srx);
                    }
                } else {
                    while (true) {
                        long A002 = SRX.A00(srx) + j2;
                        if (A002 >= j) {
                            break;
                        }
                        srx = srx.A02;
                        j2 = A002;
                    }
                    j3 = j2;
                }
                if (tah.A05() == 2) {
                    byte A04 = tah.A04(0);
                    byte A042 = tah.A04(1);
                    while (j3 < this.A00) {
                        byte[] bArr = srx.A06;
                        i2 = srx.A01;
                        i = (int) ((((long) i2) + j) - j3);
                        int i3 = srx.A00;
                        while (i < i3) {
                            byte b = bArr[i];
                            if (!(b == A04 || b == A042)) {
                                i++;
                            }
                        }
                        j3 += (long) (i3 - i2);
                        srx = srx.A02;
                        j = j3;
                    }
                } else {
                    byte[] bArr2 = tah.data;
                    while (j3 < this.A00) {
                        byte[] bArr3 = srx.A06;
                        i2 = srx.A01;
                        int i4 = (int) ((((long) i2) + j) - j3);
                        int i5 = srx.A00;
                        while (i < i5) {
                            byte b2 = bArr3[i];
                            int length = bArr2.length;
                            int i6 = 0;
                            while (i6 < length) {
                                if (b2 != bArr2[i6]) {
                                    i6++;
                                }
                            }
                            i4 = i + 1;
                        }
                        j3 += (long) (i5 - i2);
                        srx = srx.A02;
                        j = j3;
                    }
                }
                return ((long) (i - i2)) + j3;
            }
            return -1;
        }
        throw AnonymousClass7TE.A0w("fromIndex < 0");
    }

    public final String A05() {
        try {
            return A07(SCP.A00, this.A00);
        } catch (EOFException e) {
            throw Pxe.A0e(e);
        }
    }

    public final String A06(long j) {
        String A07;
        long j2 = 1;
        if (j > 0) {
            long j3 = j - 1;
            if (A00(j3) == 13) {
                A07 = A07(SCP.A00, j3);
                j2 = 2;
                Evi(j2);
                return A07;
            }
        }
        A07 = A07(SCP.A00, j);
        Evi(j2);
        return A07;
    }

    public final String A07(Charset charset, long j) {
        SCP.A00(this.A00, 0, j);
        if (charset == null) {
            throw AnonymousClass7TE.A0w("charset == null");
        } else if (j > 2147483647L) {
            throw Pxg.A0b("byteCount > Integer.MAX_VALUE: ", j);
        } else if (j == 0) {
            return "";
        } else {
            SRX srx = this.A01;
            int i = srx.A01;
            if (((long) i) + j > ((long) srx.A00)) {
                return new String(E6H(j), charset);
            }
            String A11 = Pxe.A11(charset, srx.A06, i, (int) j);
            int i2 = (int) (((long) srx.A01) + j);
            srx.A01 = i2;
            this.A00 -= j;
            if (i2 != srx.A00) {
                return A11;
            }
            SRX.A01(this, srx);
            return A11;
        }
    }

    public final TAH A08() {
        try {
            return new TAH(E6H(this.A00));
        } catch (EOFException e) {
            throw Pxe.A0e(e);
        }
    }

    public final void A0A() {
        try {
            Evi(this.A00);
        } catch (EOFException e) {
            throw Pxe.A0e(e);
        }
    }

    public final void A0E(int i) {
        int i2;
        int i3;
        if (i >= 128) {
            if (i < 2048) {
                i3 = (i >> 6) | 192;
            } else {
                if (i < 65536) {
                    if (i < 55296 || i > 57343) {
                        i2 = (i >> 12) | 224;
                    } else {
                        A0B(63);
                        return;
                    }
                } else if (i <= 1114111) {
                    A0B((i >> 18) | 240);
                    i2 = ((i >> 12) & 63) | 128;
                } else {
                    throw AnonymousClass7TF.A0W("Unexpected code point: ", Integer.toHexString(i));
                }
                A0B(i2);
                i3 = ((i >> 6) & 63) | 128;
            }
            A0B(i3);
            i = (i & 63) | 128;
        }
        A0B(i);
    }

    public final void A0F(long j) {
        if (j == 0) {
            A0B(48);
            return;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        SRX A09 = A09(numberOfTrailingZeros);
        byte[] bArr = A09.A06;
        int i = A09.A00;
        int i2 = i + numberOfTrailingZeros;
        int i3 = i2;
        while (true) {
            i2--;
            if (i2 >= i) {
                bArr[i2] = A02[(int) (15 & j)];
                j >>>= 4;
            } else {
                A09.A00 = i3;
                this.A00 += (long) numberOfTrailingZeros;
                return;
            }
        }
    }

    public final void A0G(String str, int i, int i2) {
        int i3;
        int i4;
        char c;
        if (i < 0) {
            throw DbW.A0a("beginIndex < 0: ", i);
        } else if (i2 >= i) {
            int length = str.length();
            if (i2 > length) {
                throw AnonymousClass7TE.A0w(002.A02(i2, length, "endIndex > string.length: ", " > "));
            }
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    SRX A09 = A09(1);
                    byte[] bArr = A09.A06;
                    int i5 = A09.A00 - i;
                    int min = Math.min(i2, 8192 - i5);
                    i3 = i + 1;
                    bArr[i + i5] = (byte) charAt;
                    while (i3 < min) {
                        char charAt2 = str.charAt(i3);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i3 + i5] = (byte) charAt2;
                        i3++;
                    }
                    int i6 = A09.A00;
                    int i7 = (i5 + i3) - i6;
                    A09.A00 = i6 + i7;
                    this.A00 += (long) i7;
                } else {
                    if (charAt < 2048) {
                        i4 = (charAt >> 6) | 192;
                    } else if (charAt < 55296 || charAt > 57343) {
                        A0B((charAt >> 12) | 224);
                        i4 = ((charAt >> 6) & 63) | 128;
                    } else {
                        i3 = i + 1;
                        if (i3 < i2) {
                            c = str.charAt(i3);
                        } else {
                            c = 0;
                        }
                        if (charAt > 56319 || c < 56320 || c > 57343) {
                            A0B(63);
                        } else {
                            int i8 = (((charAt & 10239) << 10) | (9215 & c)) + Constants.LOAD_RESULT_PGO_ATTEMPTED;
                            A0B((i8 >> 18) | 240);
                            A0B(((i8 >> 12) & 63) | 128);
                            A0B(((i8 >> 6) & 63) | 128);
                            A0B((i8 & 63) | 128);
                            i += 2;
                        }
                    }
                    A0B(i4);
                    A0B((charAt & '?') | 128);
                    i++;
                }
                i = i3;
            }
        } else {
            throw AnonymousClass7TE.A0w(002.A02(i2, i, "endIndex < beginIndex: ", " < "));
        }
    }

    public final void A0H(C12824T8t t8t) {
        if (t8t.A03 == null) {
            t8t.A03 = this;
            t8t.A04 = true;
            return;
        }
        throw AnonymousClass7TE.A0z("already attached to a buffer");
    }

    public final void A0J(byte[] bArr) {
        if (bArr != null) {
            A0K(bArr, bArr.length);
            return;
        }
        throw AnonymousClass7TE.A0w("source == null");
    }

    public final boolean ATS() {
        return AnonymousClass7TF.A1Q((this.A00 > 0 ? 1 : (this.A00 == 0 ? 0 : -1)));
    }

    public final long CMF(TAH tah) {
        return A04(tah, 0);
    }

    public final InputStream CNP() {
        return new C8846RCm(this);
    }

    public final long E6C(C13198TPe tPe, long j) {
        if (tPe == null) {
            throw AnonymousClass7TE.A0w("sink == null");
        } else if (j >= 0) {
            long j2 = this.A00;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            tPe.FNi(this, j);
            return j;
        } else {
            throw Pxg.A0b("byteCount < 0: ", j);
        }
    }

    public final byte[] E6H(long j) {
        SCP.A00(this.A00, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            readFully(bArr);
            return bArr;
        }
        throw Pxg.A0b("byteCount > Integer.MAX_VALUE: ", j);
    }

    public final void E6S(C13198TPe tPe, long j) {
        long j2 = this.A00;
        if (j2 >= j) {
            tPe.FNi(this, j);
        } else {
            tPe.FNi(this, j2);
            throw new EOFException();
        }
    }

    /* JADX WARNING: type inference failed for: r0v16, types: [java.lang.Object, X.TPe] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x004d A[EDGE_INSN: B:46:0x004d->B:26:0x004d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long E6U() {
        /*
            r15 = this;
            long r1 = r15.A00
            r13 = 0
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x008d
            r6 = 0
            r4 = 0
            r12 = 0
        L_0x000c:
            X.SRX r8 = r15.A01
            byte[] r7 = r8.A06
            int r3 = r8.A01
            int r2 = r8.A00
        L_0x0014:
            if (r3 >= r2) goto L_0x004d
            byte r9 = r7[r3]
            r0 = 48
            if (r9 < r0) goto L_0x004a
            r0 = 57
            if (r9 > r0) goto L_0x0032
            int r1 = r9 + -48
        L_0x0022:
            r10 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r10 = r10 & r4
            int r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0062
            r0 = 4
            long r4 = r4 << r0
            long r0 = (long) r1
            long r4 = r4 | r0
            int r3 = r3 + 1
            int r6 = r6 + 1
            goto L_0x0014
        L_0x0032:
            r0 = 97
            if (r9 < r0) goto L_0x003f
            r0 = 102(0x66, float:1.43E-43)
            if (r9 > r0) goto L_0x004a
            int r0 = r9 + -97
        L_0x003c:
            int r1 = r0 + 10
            goto L_0x0022
        L_0x003f:
            r0 = 65
            if (r9 < r0) goto L_0x004a
            r0 = 70
            if (r9 > r0) goto L_0x004a
            int r0 = r9 + -65
            goto L_0x003c
        L_0x004a:
            if (r6 == 0) goto L_0x007d
            r12 = 1
        L_0x004d:
            if (r3 != r2) goto L_0x005f
            X.SRX.A01(r15, r8)
        L_0x0052:
            if (r12 != 0) goto L_0x0058
            X.SRX r0 = r15.A01
            if (r0 != 0) goto L_0x000c
        L_0x0058:
            long r2 = r15.A00
            long r0 = (long) r6
            long r2 = r2 - r0
            r15.A00 = r2
            return r4
        L_0x005f:
            r8.A01 = r3
            goto L_0x0052
        L_0x0062:
            X.TPe r0 = new X.TPe
            r0.<init>()
            r0.A0F(r4)
            r0.A0B(r9)
            java.lang.String r1 = "Number too large: "
            java.lang.String r0 = r0.A05()
            java.lang.String r0 = X.002.A0R(r1, r0)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r1.<init>(r0)
            throw r1
        L_0x007d:
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = java.lang.Integer.toHexString(r9)
            java.lang.String r0 = X.002.A0R(r1, r0)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r1.<init>(r0)
            throw r1
        L_0x008d:
            java.lang.String r0 = "size == 0"
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13198TPe.E6U():long");
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [java.lang.Object, X.TPe] */
    public final String E6q(long j) {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long A03 = A03((byte) 10, 0, j2);
            if (A03 != -1) {
                return A06(A03);
            }
            if (j2 < this.A00 && A00(j2 - 1) == 13 && A00(j2) == 10) {
                return A06(j2);
            }
            ? obj = new Object();
            A0I(obj, 0, Math.min(32, this.A00));
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("\\n not found: limit=");
            A1A.append(Math.min(this.A00, j));
            A1A.append(" content=");
            A1A.append(obj.A08().A07());
            throw new EOFException(C51967G9n.A0r(A1A, 8230));
        }
        throw Pxg.A0b("limit < 0: ", j);
    }

    public final boolean EHK(long j) {
        return Pxf.A1R((this.A00 > j ? 1 : (this.A00 == j ? 0 : -1)));
    }

    public final void EHi(long j) {
        if (this.A00 < j) {
            throw new EOFException();
        }
    }

    public final void Evi(long j) {
        while (j > 0) {
            SRX srx = this.A01;
            if (srx != null) {
                int i = srx.A00;
                int i2 = srx.A01;
                int min = (int) Math.min(j, (long) (i - i2));
                long j2 = (long) min;
                this.A00 -= j2;
                j -= j2;
                int i3 = i2 + min;
                srx.A01 = i3;
                if (i3 == i) {
                    SRX.A01(this, srx);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final C11291SJy Ezn() {
        return C11291SJy.A03;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, X.TPe] */
    public final /* bridge */ /* synthetic */ Object clone() {
        ? obj = new Object();
        long j = this.A00;
        if (j != 0) {
            SRX A03 = this.A01.A03();
            obj.A01 = A03;
            A03.A03 = A03;
            A03.A02 = A03;
            SRX srx = this.A01;
            SRX srx2 = srx;
            while (true) {
                srx = srx.A02;
                if (srx == srx2) {
                    break;
                }
                A03.A03.A05(srx.A03());
            }
            obj.A00 = j;
        }
        return obj;
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r17) {
        /*
            r16 = this;
            r3 = r17
            r15 = 1
            r6 = r16
            if (r6 == r3) goto L_0x005e
            boolean r0 = r3 instanceof X.C13198TPe
            r14 = 0
            if (r0 == 0) goto L_0x005d
            X.TPe r3 = (X.C13198TPe) r3
            long r4 = r6.A00
            long r1 = r3.A00
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x005d
            r12 = 0
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x005e
            X.SRX r9 = r6.A01
            X.SRX r8 = r3.A01
            int r6 = r9.A01
            int r10 = r8.A01
        L_0x0024:
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x005e
            int r1 = r9.A00
            int r1 = r1 - r6
            int r0 = r8.A00
            int r0 = X.Pxh.A04(r0, r10, r1)
            long r2 = (long) r0
            r11 = 0
        L_0x0033:
            long r0 = (long) r11
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x004b
            byte[] r0 = r9.A06
            int r7 = r6 + 1
            byte r6 = r0[r6]
            byte[] r0 = r8.A06
            int r1 = r10 + 1
            byte r0 = r0[r10]
            if (r6 != r0) goto L_0x005d
            int r11 = r11 + 1
            r6 = r7
            r10 = r1
            goto L_0x0033
        L_0x004b:
            int r0 = r9.A00
            if (r6 != r0) goto L_0x0053
            X.SRX r9 = r9.A02
            int r6 = r9.A01
        L_0x0053:
            int r0 = r8.A00
            if (r10 != r0) goto L_0x005b
            X.SRX r8 = r8.A02
            int r10 = r8.A01
        L_0x005b:
            long r12 = r12 + r2
            goto L_0x0024
        L_0x005d:
            return r14
        L_0x005e:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13198TPe.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        SRX srx = this.A01;
        SRX srx2 = srx;
        int i = 1;
        if (srx == null) {
            return 0;
        }
        do {
            int i2 = srx.A00;
            for (int i3 = srx.A01; i3 < i2; i3++) {
                i = (i * 31) + srx.A06[i3];
            }
            srx = srx.A02;
        } while (srx != srx2);
        return i;
    }

    public final int read(ByteBuffer byteBuffer) {
        SRX srx = this.A01;
        if (srx == null) {
            return -1;
        }
        int remaining = byteBuffer.remaining();
        int i = srx.A00;
        int i2 = srx.A01;
        int A04 = Pxh.A04(i, i2, remaining);
        byteBuffer.put(srx.A06, i2, A04);
        int i3 = srx.A01 + A04;
        srx.A01 = i3;
        this.A00 -= (long) A04;
        if (i3 != srx.A00) {
            return A04;
        }
        SRX.A01(this, srx);
        return A04;
    }

    public final byte readByte() {
        long j = this.A00;
        if (j != 0) {
            SRX srx = this.A01;
            int i = srx.A01;
            int i2 = srx.A00;
            int i3 = i + 1;
            byte b = srx.A06[i];
            this.A00 = j - 1;
            if (i3 == i2) {
                SRX.A01(this, srx);
                return b;
            }
            srx.A01 = i3;
            return b;
        }
        throw AnonymousClass7TE.A0z("size == 0");
    }

    public final int readInt() {
        long j = this.A00;
        if (j >= 4) {
            SRX srx = this.A01;
            int i = srx.A01;
            int i2 = srx.A00;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = srx.A06;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int A0D = Pxf.A0D(bArr, i4, ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16));
            int i6 = i5 + 1;
            byte b = A0D | (bArr[i5] & 255);
            this.A00 = j - 4;
            if (i6 == i2) {
                SRX.A01(this, srx);
                return b;
            }
            srx.A01 = i6;
            return b;
        }
        throw AnonymousClass7TE.A0z(002.A0Q("size < 4: ", j));
    }

    public final long readLong() {
        long j = this.A00;
        if (j >= 8) {
            SRX srx = this.A01;
            int i = srx.A01;
            int i2 = srx.A00;
            if (i2 - i < 8) {
                return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
            }
            byte[] bArr = srx.A06;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            long A0C = Pxg.A0C(bArr[i7], ((((long) bArr[i]) & 255) << 56) | (Pxe.A0D(bArr, i3) << 48) | (Pxe.A0D(bArr, i4) << 40) | (Pxe.A0D(bArr, i5) << 32) | (Pxe.A0D(bArr, i6) << 24));
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            long A0D = Pxe.A0D(bArr, i9) | (Pxe.A0D(bArr, i8) << 8) | A0C;
            this.A00 = j - 8;
            if (i10 == i2) {
                SRX.A01(this, srx);
                return A0D;
            }
            srx.A01 = i10;
            return A0D;
        }
        throw AnonymousClass7TE.A0z(002.A0Q("size < 8: ", j));
    }

    public final short readShort() {
        byte b;
        long j = this.A00;
        if (j >= 2) {
            SRX srx = this.A01;
            int i = srx.A01;
            int i2 = srx.A00;
            if (i2 - i < 2) {
                b = ((readByte() & 255) << 8) | (readByte() & 255);
            } else {
                byte[] bArr = srx.A06;
                int i3 = i + 1;
                int i4 = i3 + 1;
                b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
                this.A00 = j - 2;
                if (i4 == i2) {
                    SRX.A01(this, srx);
                } else {
                    srx.A01 = i4;
                }
            }
            return (short) b;
        }
        throw AnonymousClass7TE.A0z(002.A0Q("size < 2: ", j));
    }

    public final String toString() {
        Object tz4;
        long j = this.A00;
        if (j <= 2147483647L) {
            int i = (int) j;
            if (i == 0) {
                tz4 = TAH.A02;
            } else {
                tz4 = new TZ4(this, i);
            }
            return tz4.toString();
        }
        throw Pxg.A0b("size > Integer.MAX_VALUE: ", j);
    }

    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                SRX A09 = A09(1);
                int i2 = A09.A00;
                int min = Math.min(i, 8192 - i2);
                byteBuffer.get(A09.A06, i2, min);
                i -= min;
                A09.A00 += min;
            }
            this.A00 += (long) remaining;
            return remaining;
        }
        throw AnonymousClass7TE.A0w("source == null");
    }

    public final TAH E6I(long j) {
        return new TAH(E6H(j));
    }

    public final int E6X() {
        int readInt = readInt();
        return ((readInt & 255) << 24) | ((-16777216 & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    public final short E6l() {
        short readShort = readShort() & 65535;
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    public final /* bridge */ /* synthetic */ YCS FOH(String str) {
        A0G(str, 0, str.length());
        return this;
    }

    public final String E6p() {
        return E6q(Long.MAX_VALUE);
    }

    public final /* bridge */ /* synthetic */ YCS FNc(byte[] bArr) {
        A0J(bArr);
        return this;
    }

    public final /* bridge */ /* synthetic */ YCS FNn(int i) {
        A0B(i);
        return this;
    }

    public final /* bridge */ /* synthetic */ YCS FNu(long j) {
        A0F(j);
        return this;
    }

    public final /* bridge */ /* synthetic */ YCS FNw(int i) {
        A0C(i);
        return this;
    }

    public final /* bridge */ /* synthetic */ YCS FO7(int i) {
        A0D(i);
        return this;
    }
}
