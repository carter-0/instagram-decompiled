package X;

import com.facebook.common.dextricks.Constants;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: X.4bd  reason: invalid class name and case insensitive filesystem */
public final class C267484bd extends 17X {
    public static final byte[] A08 = {102, 97, 108, 115, 101};
    public static final byte[] A09 = AnonymousClass161.A00();
    public static final byte[] A0A = {110, 117, 108, 108};
    public static final byte[] A0B = {116, 114, 117, 101};
    public byte A00;
    public int A01;
    public byte[] A02;
    public char[] A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final OutputStream A07;

    public static final int A02(InputStream inputStream, byte[] bArr, int i, int i2, int i3) {
        int read;
        int i4 = 0;
        while (i < i2) {
            bArr[i4] = bArr[i];
            i4++;
            i++;
        }
        int min = Math.min(i3, bArr.length);
        do {
            int i5 = min - i4;
            if (i5 == 0 || (read = inputStream.read(bArr, i4, i5)) < 0 || (i4 = i4 + read) >= 3) {
                return i4;
            }
            int i52 = min - i4;
            break;
        } while ((i4 = i4 + read) >= 3);
        return i4;
    }

    private final void A06(String str, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = i2 + i;
        int i7 = this.A01;
        byte[] bArr = this.A02;
        int[] iArr = this.A03;
        while (r10 < i6) {
            char charAt = str.charAt(r10);
            if (charAt > 127 || iArr[charAt] != 0) {
                break;
            }
            bArr[i7] = (byte) charAt;
            i = r10 + 1;
            i7++;
        }
        this.A01 = i7;
        if (r10 < i6) {
            int i8 = this.A00;
            int i9 = i7 + ((i6 - r10) * 6);
            int i10 = this.A05;
            if (i8 == 0) {
                if (i9 > i10) {
                    A15();
                }
                i3 = this.A01;
                byte[] bArr2 = this.A02;
                int[] iArr2 = this.A03;
                while (r10 < i6) {
                    int i11 = r10 + 1;
                    char charAt2 = str.charAt(r10);
                    if (charAt2 <= 127) {
                        i4 = iArr2[charAt2];
                        if (i4 == 0) {
                            bArr2[i3] = (byte) charAt2;
                            r10 = i11;
                            i3++;
                        } else if (i4 > 0) {
                            i5 = i3 + 1;
                            bArr2[i3] = 92;
                            i3 = i5 + 1;
                        } else {
                            i3 = A00(charAt2, i3);
                            r10 = i11;
                        }
                    } else if (charAt2 <= 2047) {
                        i5 = i3 + 1;
                        bArr2[i3] = (byte) ((charAt2 >> 6) | 192);
                        i3 = i5 + 1;
                        i4 = (charAt2 & '?') | 128;
                    } else {
                        i3 = A01(charAt2, i3);
                        r10 = i11;
                    }
                    bArr2[i5] = (byte) i4;
                    r10 = i11;
                }
            } else {
                if (i9 > i10) {
                    A15();
                }
                int i12 = this.A01;
                byte[] bArr3 = this.A02;
                int[] iArr3 = this.A03;
                while (r10 < i6) {
                    int i13 = r10 + 1;
                    char charAt3 = str.charAt(r10);
                    if (charAt3 <= 127) {
                        int i14 = iArr3[charAt3];
                        if (i14 == 0) {
                            bArr3[i3] = (byte) charAt3;
                            r10 = i13;
                            i12 = i3 + 1;
                        } else if (i14 > 0) {
                            int i15 = i3 + 1;
                            bArr3[i3] = 92;
                            i12 = i15 + 1;
                            bArr3[i15] = (byte) i14;
                            r10 = i13;
                        }
                    }
                    i12 = A00(charAt3, i3);
                    r10 = i13;
                }
            }
            this.A01 = i3;
        }
    }

    private final void A09(byte[] bArr) {
        int length = bArr.length;
        if (this.A01 + length > this.A05) {
            A15();
            if (length > 512) {
                this.A07.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this.A02, this.A01, length);
        this.A01 += length;
    }

    private final void A0A(char[] cArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = i2 + i;
        int i7 = this.A01;
        byte[] bArr = this.A02;
        int[] iArr = this.A03;
        while (r10 < i6) {
            char c = cArr[r10];
            if (c > 127 || iArr[c] != 0) {
                break;
            }
            bArr[i7] = (byte) c;
            i = r10 + 1;
            i7++;
        }
        this.A01 = i7;
        if (r10 < i6) {
            int i8 = this.A00;
            int i9 = i7 + ((i6 - r10) * 6);
            int i10 = this.A05;
            if (i8 == 0) {
                if (i9 > i10) {
                    A15();
                }
                i3 = this.A01;
                byte[] bArr2 = this.A02;
                int[] iArr2 = this.A03;
                while (r10 < i6) {
                    int i11 = r10 + 1;
                    char c2 = cArr[r10];
                    if (c2 <= 127) {
                        i4 = iArr2[c2];
                        if (i4 == 0) {
                            bArr2[i3] = (byte) c2;
                            r10 = i11;
                            i3++;
                        } else if (i4 > 0) {
                            i5 = i3 + 1;
                            bArr2[i3] = 92;
                            i3 = i5 + 1;
                        } else {
                            i3 = A00(c2, i3);
                            r10 = i11;
                        }
                    } else if (c2 <= 2047) {
                        i5 = i3 + 1;
                        bArr2[i3] = (byte) ((c2 >> 6) | 192);
                        i3 = i5 + 1;
                        i4 = (c2 & '?') | 128;
                    } else {
                        i3 = A01(c2, i3);
                        r10 = i11;
                    }
                    bArr2[i5] = (byte) i4;
                    r10 = i11;
                }
            } else {
                if (i9 > i10) {
                    A15();
                }
                int i12 = this.A01;
                byte[] bArr3 = this.A02;
                int[] iArr3 = this.A03;
                while (r10 < i6) {
                    int i13 = r10 + 1;
                    char c3 = cArr[r10];
                    if (c3 <= 127) {
                        int i14 = iArr3[c3];
                        if (i14 == 0) {
                            bArr3[i3] = (byte) c3;
                            r10 = i13;
                            i12 = i3 + 1;
                        } else if (i14 > 0) {
                            int i15 = i3 + 1;
                            bArr3[i3] = 92;
                            i12 = i15 + 1;
                            bArr3[i15] = (byte) i14;
                            r10 = i13;
                        }
                    }
                    i12 = A00(c3, i3);
                    r10 = i13;
                }
            }
            this.A01 = i3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        r6 = r5 + 1;
        r5 = r9[r5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r5 >= 2048) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r4 = r8.A01;
        r1 = r4 + 1;
        r3[r4] = (byte) ((r5 >> 6) | 192);
        r8.A01 = r1 + 1;
        r3[r1] = (byte) ((r5 & '?') | 128);
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        r5 = A03(r9, r5, r6, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        if (r5 >= 2048) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        r4 = r8.A02;
        r2 = r8.A01;
        r1 = r2 + 1;
        r4[r2] = (byte) ((r5 >> 6) | 192);
        r8.A01 = r1 + 1;
        r4[r1] = (byte) ((r5 & '?') | 128);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
        r3 = A03(r9, r5, r3, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if ((r0 + 3) < r2) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        A15();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0y(char[] r9, int r10, int r11) {
        /*
            r8 = this;
            r3 = 0
            int r1 = r11 + r11
            int r1 = r1 + r11
            int r0 = r8.A01
            int r0 = r0 + r1
            int r2 = r8.A05
            if (r0 <= r2) goto L_0x0048
            if (r2 >= r1) goto L_0x0045
            r5 = 0
            byte[] r3 = r8.A02
        L_0x0010:
            if (r5 >= r11) goto L_0x0096
        L_0x0012:
            char r4 = r9[r5]
            r7 = 128(0x80, float:1.794E-43)
            int r0 = r8.A01
            if (r4 < r7) goto L_0x0084
            int r0 = r0 + 3
            if (r0 < r2) goto L_0x0021
            r8.A15()
        L_0x0021:
            int r6 = r5 + 1
            char r5 = r9[r5]
            r0 = 2048(0x800, float:2.87E-42)
            if (r5 >= r0) goto L_0x0040
            int r4 = r8.A01
            int r1 = r4 + 1
            int r0 = r5 >> 6
            r0 = r0 | 192(0xc0, float:2.69E-43)
            byte r0 = (byte) r0
            r3[r4] = r0
            int r0 = r1 + 1
            r8.A01 = r0
            r0 = r5 & 63
            r0 = r0 | r7
            byte r0 = (byte) r0
            r3[r1] = r0
            r5 = r6
            goto L_0x0010
        L_0x0040:
            int r5 = r8.A03(r9, r5, r6, r11)
            goto L_0x0010
        L_0x0045:
            r8.A15()
        L_0x0048:
            if (r3 >= r11) goto L_0x0096
        L_0x004a:
            char r5 = r9[r3]
            r0 = 127(0x7f, float:1.78E-43)
            if (r5 <= r0) goto L_0x0074
            int r3 = r3 + 1
            r0 = 2048(0x800, float:2.87E-42)
            if (r5 >= r0) goto L_0x006f
            byte[] r4 = r8.A02
            int r2 = r8.A01
            int r1 = r2 + 1
            int r0 = r5 >> 6
            r0 = r0 | 192(0xc0, float:2.69E-43)
            byte r0 = (byte) r0
            r4[r2] = r0
            int r0 = r1 + 1
            r8.A01 = r0
            r0 = r5 & 63
            r0 = r0 | 128(0x80, float:1.794E-43)
            byte r0 = (byte) r0
            r4[r1] = r0
            goto L_0x0048
        L_0x006f:
            int r3 = r8.A03(r9, r5, r3, r11)
            goto L_0x0048
        L_0x0074:
            byte[] r2 = r8.A02
            int r1 = r8.A01
            int r0 = r1 + 1
            r8.A01 = r0
            byte r0 = (byte) r5
            r2[r1] = r0
            int r3 = r3 + 1
            if (r3 < r11) goto L_0x004a
            return
        L_0x0084:
            if (r0 < r2) goto L_0x0089
            r8.A15()
        L_0x0089:
            int r1 = r8.A01
            int r0 = r1 + 1
            r8.A01 = r0
            byte r0 = (byte) r4
            r3[r1] = r0
            int r5 = r5 + 1
            if (r5 < r11) goto L_0x0012
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C267484bd.A0y(char[], int, int):void");
    }

    private int A00(int i, int i2) {
        int i3;
        byte[] bArr = this.A02;
        int i4 = i2 + 1;
        bArr[i2] = 92;
        int i5 = i4 + 1;
        bArr[i4] = 117;
        if (i > 255) {
            int i6 = 255 & (i >> 8);
            int i7 = i5 + 1;
            byte[] bArr2 = A09;
            bArr[i5] = bArr2[i6 >> 4];
            i3 = i7 + 1;
            bArr[i7] = bArr2[i6 & 15];
            i &= 255;
        } else {
            int i8 = i5 + 1;
            bArr[i5] = 48;
            i3 = i8 + 1;
            bArr[i8] = 48;
        }
        int i9 = i3 + 1;
        byte[] bArr3 = A09;
        bArr[i3] = bArr3[i >> 4];
        int i10 = i9 + 1;
        bArr[i9] = bArr3[i & 15];
        return i10;
    }

    private final int A01(int i, int i2) {
        int i3;
        int i4;
        byte b;
        byte[] bArr = this.A02;
        if (i < 55296 || i > 57343) {
            int i5 = i2 + 1;
            bArr[i2] = (byte) ((i >> 12) | 224);
            i3 = i5 + 1;
            bArr[i5] = (byte) (((i >> 6) & 63) | 128);
            i4 = i3 + 1;
            b = (byte) ((i & 63) | 128);
        } else {
            int i6 = i2 + 1;
            bArr[i2] = 92;
            int i7 = i6 + 1;
            bArr[i6] = 117;
            int i8 = i7 + 1;
            byte[] bArr2 = A09;
            bArr[i7] = bArr2[(i >> 12) & 15];
            int i9 = i8 + 1;
            bArr[i8] = bArr2[(i >> 8) & 15];
            i3 = i9 + 1;
            bArr[i9] = bArr2[(i >> 4) & 15];
            i4 = i3 + 1;
            b = bArr2[i & 15];
        }
        bArr[i3] = b;
        return i4;
    }

    private final void A04() {
        if (this.A01 + 4 >= this.A05) {
            A15();
        }
        System.arraycopy(A0A, 0, this.A02, this.A01, 4);
        this.A01 += 4;
    }

    private final void A05(String str) {
        int i = this.A01;
        int i2 = this.A05;
        if (i >= i2) {
            A15();
        }
        byte[] bArr = this.A02;
        int i3 = this.A01;
        this.A01 = i3 + 1;
        byte b = this.A00;
        bArr[i3] = b;
        A0s(str);
        if (this.A01 >= i2) {
            A15();
        }
        byte[] bArr2 = this.A02;
        int i4 = this.A01;
        this.A01 = i4 + 1;
        bArr2[i4] = b;
    }

    private final void A07(String str, boolean z) {
        if (z) {
            if (this.A01 >= this.A05) {
                A15();
            }
            byte[] bArr = this.A02;
            int i = this.A01;
            this.A01 = i + 1;
            bArr[i] = this.A00;
        }
        int length = str.length();
        int i2 = 0;
        while (length > 0) {
            int min = Math.min(this.A06, length);
            if (this.A01 + min > this.A05) {
                A15();
            }
            A06(str, i2, min);
            i2 += min;
            length -= min;
        }
        if (z) {
            if (this.A01 >= this.A05) {
                A15();
            }
            byte[] bArr2 = this.A02;
            int i3 = this.A01;
            this.A01 = i3 + 1;
            bArr2[i3] = this.A00;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0108, code lost:
        if (r8 > 0) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010a, code lost:
        r1 = A02(r20, r10, r4, r3, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0110, code lost:
        if (r1 <= 0) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0114, code lost:
        if (r13.A01 <= r7) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0116, code lost:
        A15();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0119, code lost:
        r2 = r10[0] << 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011e, code lost:
        if (1 >= r1) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0120, code lost:
        r2 = r2 | ((r10[1] & 255) << 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0127, code lost:
        r13.A01 = r14.A03(r13.A02, r2, r6, r13.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0132, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0134, code lost:
        r8 = r8 - r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0135, code lost:
        if (r8 <= 0) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0137, code lost:
        A0L(X.002.A0n("Too few bytes available: missing ", " bytes (out of ", ")", r8, r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0148, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0X(X.C268974eN r22, java.io.InputStream r23, int r24) {
        /*
            r21 = this;
            r9 = r24
            java.lang.String r0 = "write a binary value"
            r13 = r21
            r13.A12(r0)
            int r0 = r13.A01
            int r12 = r13.A05
            if (r0 < r12) goto L_0x0012
            r13.A15()
        L_0x0012:
            byte[] r2 = r13.A02
            int r1 = r13.A01
            int r0 = r1 + 1
            r13.A01 = r0
            byte r0 = r13.A00
            r18 = r0
            r2[r1] = r0
            X.16B r11 = r13.A04
            byte[] r10 = r11.A04()
            r14 = r22
            r20 = r23
            if (r24 >= 0) goto L_0x00ac
            int r5 = r12 + -6
            int r2 = r14.A01     // Catch:{ all -> 0x015e }
            r3 = 2
            int r2 = r2 >> r3
            r16 = r2
            r15 = 0
            r6 = 0
            r1 = 0
            r9 = 0
        L_0x0038:
            int r4 = r10.length     // Catch:{ all -> 0x015e }
            r0 = r20
            int r1 = A02(r0, r10, r6, r1, r4)     // Catch:{ all -> 0x015e }
            r0 = 3
            if (r1 >= r0) goto L_0x0043
            goto L_0x0086
        L_0x0043:
            int r7 = r1 + -3
            r6 = 0
        L_0x0046:
            int r0 = r13.A01     // Catch:{ all -> 0x015e }
            if (r0 <= r5) goto L_0x004d
            r13.A15()     // Catch:{ all -> 0x015e }
        L_0x004d:
            int r8 = r6 + 1
            byte r0 = r10[r6]     // Catch:{ all -> 0x015e }
            int r6 = r0 << 8
            int r4 = r8 + 1
            byte r0 = r10[r8]     // Catch:{ all -> 0x015e }
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r6
            int r8 = r0 << 8
            int r6 = r4 + 1
            byte r0 = r10[r4]     // Catch:{ all -> 0x015e }
            r0 = r0 & 255(0xff, float:3.57E-43)
            r8 = r8 | r0
            int r9 = r9 + 3
            byte[] r4 = r13.A02     // Catch:{ all -> 0x015e }
            int r0 = r13.A01     // Catch:{ all -> 0x015e }
            int r8 = r14.A02(r4, r8, r0)     // Catch:{ all -> 0x015e }
            r13.A01 = r8     // Catch:{ all -> 0x015e }
            int r2 = r2 + -1
            if (r2 > 0) goto L_0x0083
            int r2 = r8 + 1
            r0 = 92
            r4[r8] = r0     // Catch:{ all -> 0x015e }
            int r0 = r2 + 1
            r13.A01 = r0     // Catch:{ all -> 0x015e }
            r0 = 110(0x6e, float:1.54E-43)
            r4[r2] = r0     // Catch:{ all -> 0x015e }
            r2 = r16
        L_0x0083:
            if (r6 <= r7) goto L_0x0046
            goto L_0x0038
        L_0x0086:
            if (r1 <= 0) goto L_0x0149
            int r0 = r13.A01     // Catch:{ all -> 0x015e }
            if (r0 <= r5) goto L_0x008f
            r13.A15()     // Catch:{ all -> 0x015e }
        L_0x008f:
            byte r0 = r10[r15]     // Catch:{ all -> 0x015e }
            int r2 = r0 << 16
            r0 = 1
            if (r0 >= r1) goto L_0x00aa
            byte r0 = r10[r0]     // Catch:{ all -> 0x015e }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r2 = r2 | r0
        L_0x009d:
            int r9 = r9 + r3
            byte[] r1 = r13.A02     // Catch:{ all -> 0x015e }
            int r0 = r13.A01     // Catch:{ all -> 0x015e }
            int r0 = r14.A03(r1, r2, r3, r0)     // Catch:{ all -> 0x015e }
            r13.A01 = r0     // Catch:{ all -> 0x015e }
            goto L_0x0149
        L_0x00aa:
            r3 = 1
            goto L_0x009d
        L_0x00ac:
            r8 = r9
            int r7 = r12 + -6
            int r15 = r14.A01     // Catch:{ all -> 0x015e }
            r6 = 2
            int r15 = r15 >> r6
            r19 = r15
            r5 = -3
            r17 = 0
            r4 = 0
            r3 = 0
        L_0x00ba:
            if (r8 <= r6) goto L_0x0108
            if (r4 <= r5) goto L_0x00ca
            r0 = r20
            int r3 = A02(r0, r10, r4, r3, r8)     // Catch:{ all -> 0x015e }
            r0 = 3
            r4 = 0
            if (r3 < r0) goto L_0x010a
            int r5 = r3 + -3
        L_0x00ca:
            int r0 = r13.A01     // Catch:{ all -> 0x015e }
            if (r0 <= r7) goto L_0x00d1
            r13.A15()     // Catch:{ all -> 0x015e }
        L_0x00d1:
            int r16 = r4 + 1
            byte r0 = r10[r4]     // Catch:{ all -> 0x015e }
            int r2 = r0 << 8
            int r1 = r16 + 1
            byte r0 = r10[r16]     // Catch:{ all -> 0x015e }
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r2
            int r2 = r0 << 8
            int r4 = r1 + 1
            byte r0 = r10[r1]     // Catch:{ all -> 0x015e }
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            int r8 = r8 + -3
            byte[] r1 = r13.A02     // Catch:{ all -> 0x015e }
            int r0 = r13.A01     // Catch:{ all -> 0x015e }
            int r2 = r14.A02(r1, r2, r0)     // Catch:{ all -> 0x015e }
            r13.A01 = r2     // Catch:{ all -> 0x015e }
            int r15 = r15 + -1
            if (r15 > 0) goto L_0x00ba
            int r15 = r2 + 1
            r0 = 92
            r1[r2] = r0     // Catch:{ all -> 0x015e }
            int r0 = r15 + 1
            r13.A01 = r0     // Catch:{ all -> 0x015e }
            r0 = 110(0x6e, float:1.54E-43)
            r1[r15] = r0     // Catch:{ all -> 0x015e }
            r15 = r19
            goto L_0x00ba
        L_0x0108:
            if (r8 <= 0) goto L_0x0149
        L_0x010a:
            r0 = r20
            int r1 = A02(r0, r10, r4, r3, r8)     // Catch:{ all -> 0x015e }
            if (r1 <= 0) goto L_0x0137
            int r0 = r13.A01     // Catch:{ all -> 0x015e }
            if (r0 <= r7) goto L_0x0119
            r13.A15()     // Catch:{ all -> 0x015e }
        L_0x0119:
            byte r0 = r10[r17]     // Catch:{ all -> 0x015e }
            int r2 = r0 << 16
            r0 = 1
            if (r0 >= r1) goto L_0x0132
            byte r0 = r10[r0]     // Catch:{ all -> 0x015e }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            r2 = r2 | r0
        L_0x0127:
            byte[] r1 = r13.A02     // Catch:{ all -> 0x015e }
            int r0 = r13.A01     // Catch:{ all -> 0x015e }
            int r0 = r14.A03(r1, r2, r6, r0)     // Catch:{ all -> 0x015e }
            r13.A01 = r0     // Catch:{ all -> 0x015e }
            goto L_0x0134
        L_0x0132:
            r6 = 1
            goto L_0x0127
        L_0x0134:
            int r8 = r8 - r6
            if (r8 <= 0) goto L_0x0149
        L_0x0137:
            java.lang.String r2 = "Too few bytes available: missing "
            java.lang.String r1 = " bytes (out of "
            java.lang.String r0 = ")"
            java.lang.String r0 = X.002.A0n(r2, r1, r0, r8, r9)     // Catch:{ all -> 0x015e }
            r13.A0L(r0)     // Catch:{ all -> 0x015e }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x015e }
            throw r0     // Catch:{ all -> 0x015e }
        L_0x0149:
            r11.A01(r10)
            int r0 = r13.A01
            if (r0 < r12) goto L_0x0153
            r13.A15()
        L_0x0153:
            byte[] r2 = r13.A02
            int r1 = r13.A01
            int r0 = r1 + 1
            r13.A01 = r0
            r2[r1] = r18
            return r9
        L_0x015e:
            r0 = move-exception
            r11.A01(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C267484bd.A0X(X.4eN, java.io.InputStream, int):int");
    }

    public final void A0Y() {
        17b r2 = this.A02;
        if (r2.A01 == 1) {
            AnonymousClass15w r1 = this.A00;
            if (r1 != null) {
                r1.FNp(this, r2.A00 + 1);
            } else {
                if (this.A01 >= this.A05) {
                    A15();
                }
                byte[] bArr = this.A02;
                int i = this.A01;
                this.A01 = i + 1;
                bArr[i] = 93;
            }
            17b r12 = this.A02;
            r12.A01 = null;
            this.A02 = r12.A05;
            return;
        }
        A0L(002.A0R("Current context not Array but ", r2.A02()));
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0Z() {
        17b r2 = this.A02;
        if (r2.A01 == 2) {
            AnonymousClass15w r1 = this.A00;
            if (r1 != null) {
                r1.FNq(this, r2.A00 + 1);
            } else {
                if (this.A01 >= this.A05) {
                    A15();
                }
                byte[] bArr = this.A02;
                int i = this.A01;
                this.A01 = i + 1;
                bArr[i] = 125;
            }
            17b r12 = this.A02;
            r12.A01 = null;
            this.A02 = r12.A05;
            return;
        }
        A0L(002.A0R("Current context not Object but ", r2.A02()));
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0a() {
        A12("write a null");
        A04();
    }

    public final void A0b() {
        A12("start an array");
        this.A02 = this.A02.A07();
        AnonymousClass15w r0 = this.A00;
        if (r0 != null) {
            r0.FO8(this);
            return;
        }
        if (this.A01 >= this.A05) {
            A15();
        }
        byte[] bArr = this.A02;
        int i = this.A01;
        this.A01 = i + 1;
        bArr[i] = 91;
    }

    public final void A0c() {
        A12("start an object");
        this.A02 = this.A02.A08();
        AnonymousClass15w r0 = this.A00;
        if (r0 != null) {
            r0.FO9(this);
            return;
        }
        if (this.A01 >= this.A05) {
            A15();
        }
        byte[] bArr = this.A02;
        int i = this.A01;
        this.A01 = i + 1;
        bArr[i] = 123;
    }

    public final void A0d(char c) {
        if (this.A01 + 3 >= this.A05) {
            A15();
        }
        byte[] bArr = this.A02;
        int i = this.A01;
        this.A01 = i + 1;
        bArr[i] = (byte) c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if ((r2.A00 & X.15u.A08.A00) != 0) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0e(double r3) {
        /*
            r2 = this;
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x001b
            java.lang.String[] r0 = X.17g.A04
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 != 0) goto L_0x0012
            boolean r0 = java.lang.Double.isInfinite(r3)
            if (r0 == 0) goto L_0x0023
        L_0x0012:
            X.15u r0 = X.15u.A08
            int r1 = r2.A00
            int r0 = r0.A00
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0023
        L_0x001b:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            r2.A0t(r0)
            return
        L_0x0023:
            java.lang.String r0 = "write a number"
            r2.A12(r0)
            java.lang.String r0 = java.lang.String.valueOf(r3)
            r2.A0s(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C267484bd.A0e(double):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if ((r2.A00 & X.15u.A08.A00) != 0) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0f(float r3) {
        /*
            r2 = this;
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x001b
            java.lang.String[] r0 = X.17g.A04
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 != 0) goto L_0x0012
            boolean r0 = java.lang.Float.isInfinite(r3)
            if (r0 == 0) goto L_0x0023
        L_0x0012:
            X.15u r0 = X.15u.A08
            int r1 = r2.A00
            int r0 = r0.A00
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0023
        L_0x001b:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            r2.A0t(r0)
            return
        L_0x0023:
            java.lang.String r0 = "write a number"
            r2.A12(r0)
            java.lang.String r0 = java.lang.String.valueOf(r3)
            r2.A0s(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C267484bd.A0f(float):void");
    }

    public final void A0g(int i) {
        A12("write a number");
        int i2 = this.A01 + 11;
        int i3 = this.A05;
        if (i2 >= i3) {
            A15();
        }
        if (this.A03) {
            if (this.A01 + 13 >= i3) {
                A15();
            }
            byte[] bArr = this.A02;
            int i4 = this.A01;
            int i5 = i4 + 1;
            this.A01 = i5;
            byte b = this.A00;
            bArr[i4] = b;
            int A032 = 17g.A03(bArr, i, i5);
            byte[] bArr2 = this.A02;
            this.A01 = A032 + 1;
            bArr2[A032] = b;
            return;
        }
        this.A01 = 17g.A03(this.A02, i, this.A01);
    }

    public final void A0h(long j) {
        A12("write a number");
        if (this.A03) {
            if (this.A01 + 23 >= this.A05) {
                A15();
            }
            byte[] bArr = this.A02;
            int i = this.A01;
            int i2 = i + 1;
            this.A01 = i2;
            byte b = this.A00;
            bArr[i] = b;
            int A062 = 17g.A06(bArr, i2, j);
            byte[] bArr2 = this.A02;
            this.A01 = A062 + 1;
            bArr2[A062] = b;
            return;
        }
        if (this.A01 + 21 >= this.A05) {
            A15();
        }
        this.A01 = 17g.A06(this.A02, this.A01, j);
    }

    public final void A0i(C268974eN r12, byte[] bArr, int i, int i2) {
        A12("write a binary value");
        int i3 = this.A01;
        int i4 = this.A05;
        if (i3 >= i4) {
            A15();
        }
        byte[] bArr2 = this.A02;
        int i5 = this.A01;
        int i6 = i5 + 1;
        this.A01 = i6;
        byte b = this.A00;
        bArr2[i5] = b;
        int i7 = i2 + i;
        int i8 = i7 - 3;
        int i9 = i4 - 6;
        int i10 = r12.A01 >> 2;
        int i11 = i10;
        while (i <= i8) {
            if (i6 > i9) {
                A15();
            }
            int i12 = i + 1;
            int i13 = i12 + 1;
            i = i13 + 1;
            byte[] bArr3 = this.A02;
            i6 = r12.A02(bArr3, (((bArr[i] << 8) | (bArr[i12] & 255)) << 8) | (bArr[i13] & 255), this.A01);
            this.A01 = i6;
            i10--;
            if (i10 <= 0) {
                int i14 = i6 + 1;
                bArr3[i6] = 92;
                i6 = i14 + 1;
                this.A01 = i6;
                bArr3[i14] = 110;
                i10 = i11;
            }
        }
        int i15 = i7 - i;
        if (i15 > 0) {
            if (i6 > i9) {
                A15();
            }
            int i16 = i + 1;
            int i17 = bArr[i] << 16;
            if (i15 == 2) {
                i17 |= (bArr[i16] & 255) << 8;
            }
            i6 = r12.A03(this.A02, i17, i15, this.A01);
            this.A01 = i6;
        }
        if (i6 >= i4) {
            A15();
        }
        byte[] bArr4 = this.A02;
        int i18 = this.A01;
        this.A01 = i18 + 1;
        bArr4[i18] = b;
    }

    public final void A0j(15z r7) {
        A12("write a raw (unencoded) value");
        byte[] bArr = this.A02;
        int i = this.A01;
        15y r72 = (15y) r7;
        byte[] bArr2 = r72.A01;
        if (bArr2 == null) {
            bArr2 = 160.A01(r72.A03);
            r72.A01 = bArr2;
        }
        int length = bArr2.length;
        if (i + length > bArr.length) {
            A09(bArr2);
            return;
        }
        System.arraycopy(bArr2, 0, bArr, i, length);
        this.A01 += length;
    }

    public final void A0k(15z r8) {
        AnonymousClass15w r1 = this.A00;
        17b r0 = this.A02;
        if (r1 != null) {
            15y r5 = (15y) r8;
            String str = r5.A03;
            int A062 = r0.A06(str);
            if (A062 != 4) {
                AnonymousClass15w r02 = this.A00;
                if (A062 == 1) {
                    r02.FNz(this);
                } else {
                    r02.ADB(this);
                }
                boolean z = !this.A02;
                if (z) {
                    if (this.A01 >= this.A05) {
                        A15();
                    }
                    byte[] bArr = this.A02;
                    int i = this.A01;
                    this.A01 = i + 1;
                    bArr[i] = this.A00;
                }
                int ABf = r8.ABf(this.A02, this.A01);
                if (ABf < 0) {
                    byte[] bArr2 = r5.A00;
                    if (bArr2 == null) {
                        bArr2 = 15y.A04.A02(str);
                        r5.A00 = bArr2;
                    }
                    A09(bArr2);
                } else {
                    this.A01 += ABf;
                }
                if (z) {
                    if (this.A01 >= this.A05) {
                        A15();
                    }
                    byte[] bArr3 = this.A02;
                    int i2 = this.A01;
                    this.A01 = i2 + 1;
                    bArr3[i2] = this.A00;
                    return;
                }
                return;
            }
        } else {
            15y r6 = (15y) r8;
            String str2 = r6.A03;
            int A063 = r0.A06(str2);
            if (A063 != 4) {
                if (A063 == 1) {
                    if (this.A01 >= this.A05) {
                        A15();
                    }
                    byte[] bArr4 = this.A02;
                    int i3 = this.A01;
                    this.A01 = i3 + 1;
                    bArr4[i3] = 44;
                }
                if (this.A02) {
                    int ABf2 = r8.ABf(this.A02, this.A01);
                    if (ABf2 < 0) {
                        byte[] bArr5 = r6.A00;
                        if (bArr5 == null) {
                            bArr5 = 15y.A04.A02(str2);
                            r6.A00 = bArr5;
                        }
                        A09(bArr5);
                        return;
                    }
                    this.A01 += ABf2;
                    return;
                }
                int i4 = this.A01;
                int i5 = this.A05;
                if (i4 >= i5) {
                    A15();
                }
                byte[] bArr6 = this.A02;
                int i6 = this.A01;
                int i7 = i6 + 1;
                this.A01 = i7;
                byte b = this.A00;
                bArr6[i6] = b;
                int ABf3 = r8.ABf(bArr6, i7);
                if (ABf3 < 0) {
                    byte[] bArr7 = r6.A00;
                    if (bArr7 == null) {
                        bArr7 = 15y.A04.A02(str2);
                        r6.A00 = bArr7;
                    }
                    A09(bArr7);
                } else {
                    this.A01 += ABf3;
                }
                if (this.A01 >= i5) {
                    A15();
                }
                byte[] bArr8 = this.A02;
                int i8 = this.A01;
                this.A01 = i8 + 1;
                bArr8[i8] = b;
                return;
            }
        }
        A0L("Can not write a field name, expecting a value");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0l(15z r7) {
        byte[] bArr = this.A02;
        int i = this.A01;
        15y r72 = (15y) r7;
        byte[] bArr2 = r72.A01;
        if (bArr2 == null) {
            bArr2 = 160.A01(r72.A03);
            r72.A01 = bArr2;
        }
        int length = bArr2.length;
        if (i + length > bArr.length) {
            A09(bArr2);
            return;
        }
        System.arraycopy(bArr2, 0, bArr, i, length);
        this.A01 += length;
    }

    public final void A0m(15z r6) {
        A12("write a string");
        int i = this.A01;
        int i2 = this.A05;
        if (i >= i2) {
            A15();
        }
        byte[] bArr = this.A02;
        int i3 = this.A01;
        int i4 = i3 + 1;
        this.A01 = i4;
        byte b = this.A00;
        bArr[i3] = b;
        int ABf = r6.ABf(bArr, i4);
        if (ABf < 0) {
            15y r62 = (15y) r6;
            byte[] bArr2 = r62.A00;
            if (bArr2 == null) {
                bArr2 = 15y.A04.A02(r62.A03);
                r62.A00 = bArr2;
            }
            A09(bArr2);
        } else {
            this.A01 += ABf;
        }
        if (this.A01 >= i2) {
            A15();
        }
        byte[] bArr3 = this.A02;
        int i5 = this.A01;
        this.A01 = i5 + 1;
        bArr3[i5] = b;
    }

    public final void A0n(Object obj) {
        A12("start an array");
        this.A02 = this.A02.A09(obj);
        AnonymousClass15w r0 = this.A00;
        if (r0 != null) {
            r0.FO8(this);
            return;
        }
        if (this.A01 >= this.A05) {
            A15();
        }
        byte[] bArr = this.A02;
        int i = this.A01;
        this.A01 = i + 1;
        bArr[i] = 91;
    }

    public final void A0o(Object obj) {
        A12("start an object");
        this.A02 = this.A02.A0A(obj);
        AnonymousClass15w r0 = this.A00;
        if (r0 != null) {
            r0.FO9(this);
            return;
        }
        if (this.A01 >= this.A05) {
            A15();
        }
        byte[] bArr = this.A02;
        int i = this.A01;
        this.A01 = i + 1;
        bArr[i] = 123;
    }

    public final void A0p(Object obj, int i) {
        A12("start an array");
        this.A02 = this.A02.A09(obj);
        AnonymousClass15w r0 = this.A00;
        if (r0 != null) {
            r0.FO8(this);
            return;
        }
        if (this.A01 >= this.A05) {
            A15();
        }
        byte[] bArr = this.A02;
        int i2 = this.A01;
        this.A01 = i2 + 1;
        bArr[i2] = 91;
    }

    public final void A0q(String str) {
        boolean z;
        byte b;
        int i;
        AnonymousClass15w r1 = this.A00;
        17b r0 = this.A02;
        if (r1 != null) {
            int A062 = r0.A06(str);
            if (A062 != 4) {
                AnonymousClass15w r02 = this.A00;
                if (A062 == 1) {
                    r02.FNz(this);
                } else {
                    r02.ADB(this);
                }
                z = false;
                if (!this.A02) {
                    int length = str.length();
                    if (length > this.A04) {
                        A07(str, true);
                        return;
                    }
                    int i2 = this.A01;
                    i = this.A05;
                    if (i2 >= i) {
                        A15();
                    }
                    byte[] bArr = this.A02;
                    int i3 = this.A01;
                    this.A01 = i3 + 1;
                    b = this.A00;
                    bArr[i3] = b;
                    str.getChars(0, length, this.A03, 0);
                    int i4 = this.A06;
                    if (length <= i4) {
                        if (this.A01 + length > i) {
                            A15();
                        }
                        A0A(this.A03, 0, length);
                    } else {
                        char[] cArr = this.A03;
                        int i5 = 0;
                        do {
                            int min = Math.min(i4, length);
                            if (this.A01 + min > i) {
                                A15();
                            }
                            A0A(cArr, i5, min);
                            i5 += min;
                            length -= min;
                        } while (length > 0);
                    }
                }
                A07(str, z);
                return;
            }
            A0L("Can not write a field name, expecting a value");
            throw AnonymousClass00P.createAndThrow();
        }
        int A063 = r0.A06(str);
        if (A063 != 4) {
            z = true;
            if (A063 == 1) {
                if (this.A01 >= this.A05) {
                    A15();
                }
                byte[] bArr2 = this.A02;
                int i6 = this.A01;
                this.A01 = i6 + 1;
                bArr2[i6] = 44;
            }
            if (this.A02) {
                A07(str, false);
                return;
            }
            int length2 = str.length();
            if (length2 <= this.A04) {
                int i7 = this.A01;
                i = this.A05;
                if (i7 >= i) {
                    A15();
                }
                byte[] bArr3 = this.A02;
                int i8 = this.A01;
                int i9 = i8 + 1;
                this.A01 = i9;
                b = this.A00;
                bArr3[i8] = b;
                int i10 = this.A06;
                if (length2 <= i10) {
                    if (i9 + length2 > i) {
                        A15();
                    }
                    A06(str, 0, length2);
                } else {
                    int i11 = 0;
                    do {
                        int min2 = Math.min(i10, length2);
                        if (this.A01 + min2 > i) {
                            A15();
                        }
                        A06(str, i11, min2);
                        i11 += min2;
                        length2 -= min2;
                    } while (length2 > 0);
                }
            }
            A07(str, z);
            return;
        }
        A0L("Can not write a field name, expecting a value");
        throw AnonymousClass00P.createAndThrow();
        if (this.A01 >= i) {
            A15();
        }
        byte[] bArr4 = this.A02;
        int i12 = this.A01;
        this.A01 = i12 + 1;
        bArr4[i12] = b;
    }

    public final void A0r(String str) {
        A12("write a number");
        if (str == null) {
            A04();
        } else if (this.A03) {
            A05(str);
        } else {
            A0s(str);
        }
    }

    public final void A0t(String str) {
        A12("write a string");
        if (str == null) {
            A04();
            return;
        }
        int length = str.length();
        if (length > this.A06) {
            A07(str, true);
            return;
        }
        int i = this.A01 + length;
        int i2 = this.A05;
        if (i >= i2) {
            A15();
        }
        byte[] bArr = this.A02;
        int i3 = this.A01;
        this.A01 = i3 + 1;
        byte b = this.A00;
        bArr[i3] = b;
        A06(str, 0, length);
        if (this.A01 >= i2) {
            A15();
        }
        byte[] bArr2 = this.A02;
        int i4 = this.A01;
        this.A01 = i4 + 1;
        bArr2[i4] = b;
    }

    public final void A0u(BigDecimal bigDecimal) {
        A12("write a number");
        if (bigDecimal == null) {
            A04();
            return;
        }
        boolean z = this.A03;
        String A10 = A10(bigDecimal);
        if (z) {
            A05(A10);
        } else {
            A0s(A10);
        }
    }

    public final void A0v(BigInteger bigInteger) {
        A12("write a number");
        if (bigInteger == null) {
            A04();
            return;
        }
        boolean z = this.A03;
        String obj = bigInteger.toString();
        if (z) {
            A05(obj);
        } else {
            A0s(obj);
        }
    }

    public final void A0w(short s) {
        A12("write a number");
        int i = this.A01 + 6;
        int i2 = this.A05;
        if (i >= i2) {
            A15();
        }
        if (this.A03) {
            if (this.A01 + 8 >= i2) {
                A15();
            }
            byte[] bArr = this.A02;
            int i3 = this.A01;
            int i4 = i3 + 1;
            this.A01 = i4;
            byte b = this.A00;
            bArr[i3] = b;
            int A032 = 17g.A03(bArr, s, i4);
            byte[] bArr2 = this.A02;
            this.A01 = A032 + 1;
            bArr2[A032] = b;
            return;
        }
        this.A01 = 17g.A03(this.A02, s, this.A01);
    }

    public final void A0x(boolean z) {
        byte[] bArr;
        A12("write a boolean value");
        if (this.A01 + 5 >= this.A05) {
            A15();
        }
        if (z) {
            bArr = A0B;
        } else {
            bArr = A08;
        }
        int length = bArr.length;
        System.arraycopy(bArr, 0, this.A02, this.A01, length);
        this.A01 += length;
    }

    public final void A0z(char[] cArr, int i, int i2) {
        A12("write a string");
        int i3 = this.A01;
        int i4 = this.A05;
        if (i3 >= i4) {
            A15();
        }
        byte[] bArr = this.A02;
        int i5 = this.A01;
        int i6 = i5 + 1;
        this.A01 = i6;
        byte b = this.A00;
        bArr[i5] = b;
        int i7 = this.A06;
        if (i2 <= i7) {
            if (i6 + i2 > i4) {
                A15();
            }
            A0A(cArr, i, i2);
        } else {
            do {
                int min = Math.min(i7, i2);
                if (this.A01 + min > i4) {
                    A15();
                }
                A0A(cArr, i, min);
                i += min;
                i2 -= min;
            } while (i2 > 0);
        }
        if (this.A01 >= i4) {
            A15();
        }
        byte[] bArr2 = this.A02;
        int i8 = this.A01;
        this.A01 = i8 + 1;
        bArr2[i8] = b;
    }

    public final void A12(String str) {
        byte b;
        int A052 = this.A02.A05();
        if (this.A00 != null) {
            A14(str, A052);
            return;
        }
        if (A052 == 1) {
            b = 44;
        } else if (A052 == 2) {
            b = 58;
        } else if (A052 == 3) {
            15y r2 = this.A01;
            if (r2 != null) {
                15y r22 = r2;
                byte[] bArr = r22.A01;
                if (bArr == null) {
                    bArr = 160.A01(r22.A03);
                    r22.A01 = bArr;
                }
                if (bArr.length > 0) {
                    A09(bArr);
                    return;
                }
                return;
            }
            return;
        } else if (A052 == 5) {
            A13(str);
            throw AnonymousClass00P.createAndThrow();
        } else {
            return;
        }
        if (this.A01 >= this.A05) {
            A15();
        }
        byte[] bArr2 = this.A02;
        int i = this.A01;
        this.A01 = i + 1;
        bArr2[i] = b;
    }

    public final void A15() {
        int i = this.A01;
        if (i > 0) {
            this.A01 = 0;
            this.A07.write(this.A02, 0, i);
        }
    }

    public final void close() {
        if (this.A02 != null && A0W(15u.A03)) {
            while (true) {
                int i = this.A02.A01;
                if (i != 1) {
                    if (i != 2) {
                        break;
                    }
                    A0Z();
                } else {
                    A0Y();
                }
            }
        }
        A15();
        this.A01 = 0;
        OutputStream outputStream = this.A07;
        if (outputStream != null) {
            if (this.A04.A09 || A0W(15u.A04)) {
                outputStream.close();
            } else if (A0W(15u.A06)) {
                outputStream.flush();
            }
        }
        byte[] bArr = this.A02;
        if (bArr != null) {
            this.A02 = null;
            16B r2 = this.A04;
            byte[] bArr2 = r2.A02;
            if (bArr == bArr2 || bArr.length >= bArr2.length) {
                r2.A02 = null;
                r2.A08.A00.set(1, bArr);
            } else {
                throw new IllegalArgumentException("Trying to release buffer smaller than original");
            }
        }
        char[] cArr = this.A03;
        if (cArr != null) {
            this.A03 = null;
            this.A04.A03(cArr);
        }
    }

    public C267484bd(C249933kc r5, 16B r6, OutputStream outputStream, char c, int i) {
        super(r5, r6, i);
        this.A07 = outputStream;
        this.A00 = (byte) c;
        if (c != '\"') {
            int[] iArr = AnonymousClass161.A07;
            int[][] iArr2 = C18424VrT.A01.A00;
            int[] iArr3 = iArr2[c];
            if (iArr3 == null) {
                iArr3 = Arrays.copyOf(AnonymousClass161.A07, 128);
                if (iArr3[c] == 0) {
                    iArr3[c] = -1;
                }
                iArr2[c] = iArr3;
            }
            this.A03 = iArr3;
        }
        16B.A00(r6.A02);
        AnonymousClass16A r2 = r6.A08;
        byte[] A002 = r2.A00(1);
        r6.A02 = A002;
        this.A02 = A002;
        int length = A002.length;
        this.A05 = length;
        this.A06 = length >> 3;
        16B.A00(r6.A03);
        char[] A012 = r2.A01(1, 0);
        r6.A03 = A012;
        this.A03 = A012;
        this.A04 = A012.length;
        if (A0W(15u.A05)) {
            this.A00 = 127;
        }
    }

    private final int A03(char[] cArr, int i, int i2, int i3) {
        Object[] objArr;
        String str;
        if (i < 55296 || i > 57343) {
            byte[] bArr = this.A02;
            int i4 = this.A01;
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 12) | 224);
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((i >> 6) & 63) | 128);
            this.A01 = i6 + 1;
            bArr[i6] = (byte) ((i & 63) | 128);
            return i2;
        }
        if (i2 < i3) {
            char c = cArr[i2];
            if (c < 56320 || c > 57343) {
                objArr = new Object[]{Integer.valueOf(i), Integer.valueOf(c)};
                str = "Incomplete surrogate pair: first char 0x%04X, second 0x%04X";
            } else {
                int i7 = ((i - 55296) << 10) + Constants.LOAD_RESULT_PGO_ATTEMPTED + (c - 56320);
                if (this.A01 + 4 > this.A05) {
                    A15();
                }
                byte[] bArr2 = this.A02;
                int i8 = this.A01;
                int i9 = i8 + 1;
                bArr2[i8] = (byte) ((i7 >> 18) | 240);
                int i10 = i9 + 1;
                bArr2[i9] = (byte) (((i7 >> 12) & 63) | 128);
                int i11 = i10 + 1;
                bArr2[i10] = (byte) (((i7 >> 6) & 63) | 128);
                this.A01 = i11 + 1;
                bArr2[i11] = (byte) ((i7 & 63) | 128);
                return i2 + 1;
            }
        } else {
            objArr = new Object[]{Integer.valueOf(i)};
            str = "Split surrogate on writeRaw() input (last character): first character 0x%4x";
        }
        A0L(String.format(str, objArr));
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        r2 = r4 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0s(java.lang.String r15) {
        /*
            r14 = this;
            int r10 = r15.length()
            char[] r9 = r14.A03
            int r2 = r9.length
            r8 = 0
            if (r10 > r2) goto L_0x0011
            r15.getChars(r8, r10, r9, r8)
            r14.A0y(r9, r8, r10)
        L_0x0010:
            return
        L_0x0011:
            r7 = 0
            int r6 = r14.A05
            int r1 = r6 >> 2
            int r0 = r6 >> 4
            int r1 = r1 + r0
            int r5 = java.lang.Math.min(r2, r1)
            int r13 = r5 * 3
        L_0x001f:
            int r4 = java.lang.Math.min(r5, r10)
            int r0 = r7 + r4
            r15.getChars(r7, r0, r9, r8)
            int r0 = r14.A01
            int r0 = r0 + r13
            if (r0 <= r6) goto L_0x0030
            r14.A15()
        L_0x0030:
            r0 = 1
            if (r4 <= r0) goto L_0x0042
            int r2 = r4 + -1
            char r1 = r9[r2]
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r0) goto L_0x0042
            r0 = 56319(0xdbff, float:7.892E-41)
            if (r1 > r0) goto L_0x0042
            r4 = r2
        L_0x0042:
            r3 = 0
        L_0x0043:
            if (r3 >= r4) goto L_0x007e
        L_0x0045:
            char r11 = r9[r3]
            r0 = 127(0x7f, float:1.78E-43)
            if (r11 <= r0) goto L_0x006f
            int r3 = r3 + 1
            r0 = 2048(0x800, float:2.87E-42)
            if (r11 >= r0) goto L_0x006a
            byte[] r1 = r14.A02
            int r2 = r14.A01
            int r12 = r2 + 1
            int r0 = r11 >> 6
            r0 = r0 | 192(0xc0, float:2.69E-43)
            byte r0 = (byte) r0
            r1[r2] = r0
            int r0 = r12 + 1
            r14.A01 = r0
            r0 = r11 & 63
            r0 = r0 | 128(0x80, float:1.794E-43)
            byte r0 = (byte) r0
            r1[r12] = r0
            goto L_0x0043
        L_0x006a:
            int r3 = r14.A03(r9, r11, r3, r4)
            goto L_0x0043
        L_0x006f:
            byte[] r2 = r14.A02
            int r1 = r14.A01
            int r0 = r1 + 1
            r14.A01 = r0
            byte r0 = (byte) r11
            r2[r1] = r0
            int r3 = r3 + 1
            if (r3 < r4) goto L_0x0045
        L_0x007e:
            int r7 = r7 + r4
            int r10 = r10 - r4
            if (r10 <= 0) goto L_0x0010
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C267484bd.A0s(java.lang.String):void");
    }

    public final void flush() {
        A15();
        OutputStream outputStream = this.A07;
        if (outputStream != null && A0W(15u.A06)) {
            outputStream.flush();
        }
    }
}
