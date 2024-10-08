package X;

import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableSet;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: X.SRd  reason: case insensitive filesystem */
public final class C11389SRd {
    public static final ImmutableSet A03 = ImmutableSet.A05(new Object[]{AnonymousClass2RN.A01, AnonymousClass2RN.A05, AnonymousClass2RN.A02, AnonymousClass2RN.A03, AnonymousClass2RN.A04}, 5);
    public static final char[] A04 = {13, 10};
    public static final char[] A05 = {10};
    public int A00;
    public int A01;
    public byte[] A02;

    public final String A0F() {
        int i = this.A00;
        int i2 = this.A01;
        if (i - i2 == 0) {
            return null;
        }
        int i3 = i2;
        while (i3 < i && this.A02[i3] != 0) {
            i3++;
        }
        String A11 = Pxe.A11(AnonymousClass2RN.A05, this.A02, i2, i3 - i2);
        this.A01 = i3;
        if (i3 >= this.A00) {
            return A11;
        }
        this.A01 = i3 + 1;
        return A11;
    }

    public static int A00(C11389SRd sRd, Charset charset) {
        byte b;
        byte b2;
        byte b3;
        int i = 2;
        if (charset.equals(AnonymousClass2RN.A05) || charset.equals(AnonymousClass2RN.A01)) {
            int i2 = sRd.A00;
            int i3 = sRd.A01;
            if (i2 - i3 >= 1) {
                b3 = (byte) C301765zx.A00((long) (sRd.A02[i3] & 255));
                i = 1;
                return (C301765zx.A00((long) b3) << 16) + i;
            }
        }
        if (charset.equals(AnonymousClass2RN.A02) || charset.equals(AnonymousClass2RN.A03)) {
            int i4 = sRd.A00;
            int i5 = sRd.A01;
            if (i4 - i5 >= 2) {
                byte[] bArr = sRd.A02;
                b = bArr[i5];
                b2 = bArr[i5 + 1];
                b3 = (byte) ((char) ((b << 8) | (b2 & 255)));
                return (C301765zx.A00((long) b3) << 16) + i;
            }
        }
        if (!charset.equals(AnonymousClass2RN.A04)) {
            return 0;
        }
        int i6 = sRd.A00;
        int i7 = sRd.A01;
        if (i6 - i7 < 2) {
            return 0;
        }
        byte[] bArr2 = sRd.A02;
        b = bArr2[i7 + 1];
        b2 = bArr2[i7];
        b3 = (byte) ((char) ((b << 8) | (b2 & 255)));
        return (C301765zx.A00((long) b3) << 16) + i;
    }

    public final int A01() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int A0D = Pxf.A0D(bArr, i3, ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16));
        this.A01 = i4 + 1;
        return (bArr[i4] & 255) | A0D;
    }

    public final int A02() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        byte b = bArr[i] & 255;
        int i3 = i2 + 1;
        int A0D = Pxf.A0D(bArr, i2, b);
        int i4 = i3 + 1;
        int i5 = A0D | ((bArr[i3] & 255) << 16);
        this.A01 = i4 + 1;
        return ((bArr[i4] & 255) << 24) | i5;
    }

    public final int A03() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        byte b = bArr[i] & 255;
        this.A01 = i2 + 1;
        return ((bArr[i2] & 255) << 8) | b;
    }

    public final int A05() {
        byte[] bArr = this.A02;
        int i = this.A01;
        this.A01 = i + 1;
        return bArr[i] & 255;
    }

    public final int A06() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int A0D = Pxf.A0D(bArr, i2, (bArr[i] & 255) << 16);
        this.A01 = i3 + 1;
        return (bArr[i3] & 255) | A0D;
    }

    public final int A08() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) << 8;
        this.A01 = i2 + 1;
        return (bArr[i2] & 255) | i3;
    }

    public final long A09() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        byte b = bArr[i3];
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        int i8 = i7 + 1;
        long A0C = Pxg.A0C(b, (((long) bArr[i]) & 255) | (Pxe.A0D(bArr, i2) << 8)) | (Pxe.A0D(bArr, i4) << 24) | (Pxe.A0D(bArr, i5) << 32) | (Pxe.A0D(bArr, i6) << 40) | (Pxe.A0D(bArr, i7) << 48);
        this.A01 = i8 + 1;
        return (Pxe.A0D(bArr, i8) << 56) | A0C;
    }

    public final long A0A() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        long A0C = Pxg.A0C(bArr[i3], (((long) bArr[i]) & 255) | (Pxe.A0D(bArr, i2) << 8));
        this.A01 = i4 + 1;
        return (Pxe.A0D(bArr, i4) << 24) | A0C;
    }

    public final long A0B() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        byte b = bArr[i6];
        int i8 = i7 + 1;
        this.A01 = i8 + 1;
        return Pxe.A0D(bArr, i8) | Pxg.A0C(b, ((((long) bArr[i]) & 255) << 56) | (Pxe.A0D(bArr, i2) << 48) | (Pxe.A0D(bArr, i3) << 40) | (Pxe.A0D(bArr, i4) << 32) | (Pxe.A0D(bArr, i5) << 24)) | (Pxe.A0D(bArr, i7) << 8);
    }

    public final long A0C() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        int i3 = i2 + 1;
        byte b = bArr[i2];
        int i4 = i3 + 1;
        this.A01 = i4 + 1;
        return Pxe.A0D(bArr, i4) | Pxg.A0C(b, (((long) bArr[i]) & 255) << 24) | (Pxe.A0D(bArr, i3) << 8);
    }

    public final long A0E() {
        int i;
        byte[] bArr = this.A02;
        int i2 = this.A01;
        long j = (long) bArr[i2];
        int i3 = 7;
        while (true) {
            int i4 = 1;
            if (i3 < 0) {
                break;
            }
            int i5 = 1 << i3;
            if ((((long) i5) & j) == 0) {
                if (i3 < 6) {
                    j &= (long) (i5 - 1);
                    i = 7 - i3;
                    if (i != 0) {
                        while (i4 < i) {
                            byte b = bArr[i2 + i4];
                            if ((b & 192) == 128) {
                                j = (j << 6) | ((long) (b & 63));
                                i4++;
                            } else {
                                throw new NumberFormatException(002.A0Q("Invalid UTF-8 sequence continuation byte: ", j));
                            }
                        }
                    }
                } else if (i3 == 7) {
                    i = 1;
                }
                this.A01 = i2 + i;
                return j;
            }
            i3--;
        }
        throw new NumberFormatException(002.A0Q("Invalid UTF-8 sequence first byte: ", j));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r4.A02[r1] != 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A0G(int r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0005
            java.lang.String r1 = ""
            return r1
        L_0x0005:
            int r3 = r4.A01
            int r0 = r3 + r5
            int r1 = r0 + -1
            int r0 = r4.A00
            if (r1 >= r0) goto L_0x0017
            byte[] r0 = r4.A02
            byte r0 = r0[r1]
            int r2 = r5 + -1
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r2 = r5
        L_0x0018:
            byte[] r1 = r4.A02
            java.nio.charset.Charset r0 = X.AnonymousClass2RN.A05
            java.lang.String r1 = X.Pxe.A11(r0, r1, r3, r2)
            int r0 = r4.A01
            int r0 = r0 + r5
            r4.A01 = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11389SRd.A0G(int):java.lang.String");
    }

    public final String A0H(Charset charset) {
        int i;
        byte b;
        C11366SPh.A03(A03.contains(charset), AnonymousClass7TG.A0m(charset, "Unsupported charset: ", AnonymousClass7TE.A1A()));
        if (Pxe.A06(this) == 0) {
            return null;
        }
        Charset charset2 = AnonymousClass2RN.A01;
        if (!charset.equals(charset2)) {
            A0J();
        }
        Charset charset3 = AnonymousClass2RN.A05;
        if (charset.equals(charset3) || charset.equals(charset2)) {
            i = 1;
        } else if (charset.equals(AnonymousClass2RN.A02) || charset.equals(AnonymousClass2RN.A04) || charset.equals(AnonymousClass2RN.A03)) {
            i = 2;
        } else {
            throw C51973G9u.A0g(charset, "Unsupported charset: ", AnonymousClass7TE.A1A());
        }
        int i2 = this.A01;
        while (true) {
            int i3 = this.A00;
            if (i2 < i3 - (i - 1)) {
                if ((charset.equals(charset3) || charset.equals(charset2)) && ((b = this.A02[i2]) == 10 || b == 13)) {
                    break;
                }
                if (charset.equals(AnonymousClass2RN.A02) || charset.equals(AnonymousClass2RN.A03)) {
                    byte[] bArr = this.A02;
                    if (bArr[i2] == 0) {
                        byte b2 = bArr[i2 + 1];
                        if (b2 != 10) {
                            if (b2 == 13) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (charset.equals(AnonymousClass2RN.A04)) {
                    byte[] bArr2 = this.A02;
                    if (bArr2[i2 + 1] == 0) {
                        byte b3 = bArr2[i2];
                        if (b3 == 10 || b3 == 13) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i2 += i;
            } else {
                i2 = i3;
                break;
            }
        }
        String A0I = A0I(charset, i2 - this.A01);
        if (this.A01 == this.A00) {
            return A0I;
        }
        char[] cArr = A04;
        int A002 = A00(this, charset);
        if (A002 == 0) {
            return A0I;
        }
        char c = (char) (A002 >> 16);
        int i4 = 0;
        while (cArr[i4] != c) {
            i4++;
            if (i4 >= 2) {
                return A0I;
            }
        }
        this.A01 += A002 & 65535;
        if (c != 13) {
            return A0I;
        }
        char[] cArr2 = A05;
        int A003 = A00(this, charset);
        if (A003 == 0 || cArr2[0] != ((char) (A003 >> 16))) {
            return A0I;
        }
        this.A01 += A003 & 65535;
        return A0I;
    }

    public final String A0I(Charset charset, int i) {
        String A11 = Pxe.A11(charset, this.A02, this.A01, i);
        this.A01 += i;
        return A11;
    }

    public final Charset A0J() {
        int i = this.A00;
        int i2 = this.A01;
        int i3 = i - i2;
        if (i3 >= 3) {
            byte[] bArr = this.A02;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.A01 = i2 + 3;
                return AnonymousClass2RN.A05;
            }
        } else if (i3 < 2) {
            return null;
        }
        byte[] bArr2 = this.A02;
        byte b = bArr2[i2];
        if (b == -2) {
            if (bArr2[i2 + 1] != -1) {
                return null;
            }
            this.A01 = i2 + 2;
            return AnonymousClass2RN.A03;
        } else if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        } else {
            this.A01 = i2 + 2;
            return AnonymousClass2RN.A04;
        }
    }

    public final short A0K() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) << 8;
        this.A01 = i2 + 1;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public final void A0L(int i) {
        byte[] bArr = this.A02;
        if (i > bArr.length) {
            this.A02 = Arrays.copyOf(bArr, i);
        }
    }

    public final void A0M(int i) {
        byte[] bArr = this.A02;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        A0Q(bArr, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        if (r3 > r2.A02.length) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0N(int r3) {
        /*
            r2 = this;
            if (r3 < 0) goto L_0x0008
            byte[] r0 = r2.A02
            int r1 = r0.length
            r0 = 1
            if (r3 <= r1) goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            X.C11366SPh.A01(r0)
            r2.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11389SRd.A0N(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        if (r3 > r2.A00) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0O(int r3) {
        /*
            r2 = this;
            if (r3 < 0) goto L_0x0007
            int r1 = r2.A00
            r0 = 1
            if (r3 <= r1) goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            X.C11366SPh.A01(r0)
            r2.A01 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11389SRd.A0O(int):void");
    }

    public final void A0P(int i) {
        A0O(this.A01 + i);
    }

    public final void A0Q(byte[] bArr, int i) {
        this.A02 = bArr;
        this.A00 = i;
        this.A01 = 0;
    }

    public final void A0R(byte[] bArr, int i, int i2) {
        System.arraycopy(this.A02, this.A01, bArr, i, i2);
        this.A01 += i2;
    }

    public C11389SRd(byte[] bArr) {
        this.A02 = bArr;
        this.A00 = bArr.length;
    }

    public final int A04() {
        return (A05() << 21) | (A05() << 14) | (A05() << 7) | A05();
    }

    public final int A07() {
        int A012 = A01();
        if (A012 >= 0) {
            return A012;
        }
        throw DbW.A0b("Top bit not zero: ", A012);
    }

    public final long A0D() {
        long A0B = A0B();
        if (A0B >= 0) {
            return A0B;
        }
        throw AnonymousClass7TE.A0z(002.A0Q("Top bit not zero: ", A0B));
    }

    public C11389SRd() {
        this.A02 = Util.A07;
    }
}
