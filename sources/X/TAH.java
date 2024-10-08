package X;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class TAH implements Comparable, Serializable {
    public static final TAH A02 = A03(new byte[0]);
    public static final char[] A03 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public transient int A00;
    public transient String A01;
    public final byte[] data;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r6 = (X.TAH) r6;
        r2 = r6.A05();
        r1 = r5.data;
        r0 = r1.length;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r4 = 1
            if (r6 == r5) goto L_0x0019
            boolean r0 = r6 instanceof X.TAH
            r3 = 0
            if (r0 == 0) goto L_0x001a
            X.TAH r6 = (X.TAH) r6
            int r2 = r6.A05()
            byte[] r1 = r5.data
            int r0 = r1.length
            if (r2 != r0) goto L_0x001a
            boolean r0 = r6.A0D(r1, r3, r3, r0)
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            return r4
        L_0x001a:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TAH.equals(java.lang.Object):boolean");
    }

    public static int A00(char c) {
        char c2;
        if (c >= '0') {
            if (c <= '9') {
                return c - '0';
            }
            char c3 = 'a';
            if (c >= 'a') {
                c2 = 'f';
            } else {
                c3 = 'A';
                if (c >= 'A') {
                    c2 = 'F';
                }
            }
            if (c <= c2) {
                return (c - c3) + 10;
            }
        }
        throw AnonymousClass7TE.A0w(002.A0C("Unexpected hex digit: ", c));
    }

    public static TAH A02(String str) {
        if (str != null) {
            TAH tah = new TAH(str.getBytes(SCP.A00));
            tah.A01 = str;
            return tah;
        }
        throw AnonymousClass7TE.A0w("s == null");
    }

    public static TAH A03(byte... bArr) {
        if (bArr != null) {
            return new TAH((byte[]) bArr.clone());
        }
        throw AnonymousClass7TE.A0w("data == null");
    }

    public final byte A04(int i) {
        byte[] bArr;
        int i2;
        if (this instanceof TZ4) {
            TZ4 tz4 = (TZ4) this;
            int[] iArr = tz4.A00;
            byte[][] bArr2 = tz4.A01;
            int length = bArr2.length;
            SCP.A00((long) iArr[length - 1], (long) i, 1);
            int binarySearch = Arrays.binarySearch(iArr, 0, length, i + 1);
            if (binarySearch < 0) {
                binarySearch ^= -1;
            }
            if (binarySearch == 0) {
                i2 = 0;
            } else {
                i2 = iArr[binarySearch - 1];
            }
            int i3 = iArr[length + binarySearch];
            bArr = bArr2[binarySearch];
            i = (i - i2) + i3;
        } else {
            bArr = this.data;
        }
        return bArr[i];
    }

    public final int A05() {
        if (!(this instanceof TZ4)) {
            return this.data.length;
        }
        TZ4 tz4 = (TZ4) this;
        return tz4.A00[tz4.A01.length - 1];
    }

    public final String A06() {
        int i;
        byte[] bArr = this.data;
        byte[] bArr2 = C10048Rll.A00;
        int length = bArr.length;
        byte[] bArr3 = new byte[(((length + 2) / 3) * 4)];
        int i2 = length % 3;
        int i3 = length - i2;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5 += 3) {
            int i6 = i4 + 1;
            bArr3[i4] = bArr2[(bArr[i5] & 255) >> 2];
            int i7 = i6 + 1;
            int i8 = i5 + 1;
            bArr3[i6] = bArr2[((bArr[i5] & 3) << 4) | ((bArr[i8] & 255) >> 4)];
            int i9 = i7 + 1;
            int i10 = i5 + 2;
            bArr3[i7] = bArr2[((bArr[i8] & 15) << 2) | ((bArr[i10] & 255) >> 6)];
            i4 = i9 + 1;
            bArr3[i9] = bArr2[bArr[i10] & 63];
        }
        if (i2 != 1) {
            if (i2 == 2) {
                int i11 = i4 + 1;
                bArr3[i4] = bArr2[(bArr[i3] & 255) >> 2];
                int i12 = i11 + 1;
                int i13 = i3 + 1;
                bArr3[i11] = bArr2[((bArr[i13] & 255) >> 4) | ((bArr[i3] & 3) << 4)];
                i = i12 + 1;
                bArr3[i12] = bArr2[(bArr[i13] & 15) << 2];
            }
            return new String(bArr3, "US-ASCII");
        }
        int i14 = i4 + 1;
        bArr3[i4] = bArr2[(bArr[i3] & 255) >> 2];
        int i15 = i14 + 1;
        bArr3[i14] = bArr2[(bArr[i3] & 3) << 4];
        i = i15 + 1;
        bArr3[i15] = 61;
        bArr3[i] = 61;
        try {
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw Pxe.A0e(e);
        }
    }

    public final String A07() {
        if (this instanceof TZ4) {
            return new TAH(A0E()).A07();
        }
        char[] cArr = new char[(r7 * 2)];
        int i = 0;
        for (byte b : this.data) {
            int i2 = i + 1;
            char[] cArr2 = A03;
            Pxe.A1a(cArr2, cArr, b >> 4, i);
            i = i2 + 1;
            Pxe.A1a(cArr2, cArr, b, i2);
        }
        return new String(cArr);
    }

    public final String A08() {
        if (this instanceof TZ4) {
            return new String(A0E(), SCP.A00);
        }
        String str = this.A01;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.data, SCP.A00);
        this.A01 = str2;
        return str2;
    }

    public final TAH A09() {
        if (this instanceof TZ4) {
            return new TAH(A0E()).A09();
        }
        byte[] bArr = this.data;
        int length = bArr.length;
        if (64 > length) {
            throw AnonymousClass7TE.A0w(002.A0c("endIndex > length(", ")", length));
        } else if (64 == length) {
            return this;
        } else {
            byte[] bArr2 = new byte[64];
            System.arraycopy(bArr, 0, bArr2, 0, 64);
            return new TAH(bArr2);
        }
    }

    public final TAH A0A() {
        if (this instanceof TZ4) {
            return new TAH(A0E()).A0A();
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b < 65 || b > 90) {
                i++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i2] = (byte) (b2 + 32);
                    }
                }
                return new TAH(bArr2);
            }
        }
    }

    public final void A0B(C13198TPe tPe) {
        if (this instanceof TZ4) {
            TZ4 tz4 = (TZ4) this;
            byte[][] bArr = tz4.A01;
            int length = bArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int[] iArr = tz4.A00;
                int i3 = iArr[length + i];
                int i4 = iArr[i];
                SRX srx = new SRX(bArr[i], i3, (i3 + i4) - i2, true, false);
                SRX srx2 = tPe.A01;
                if (srx2 == null) {
                    srx.A03 = srx;
                    srx.A02 = srx;
                    tPe.A01 = srx;
                } else {
                    srx2.A03.A05(srx);
                }
                i++;
                i2 = i4;
            }
            tPe.A00 += (long) i2;
            return;
        }
        byte[] bArr2 = this.data;
        tPe.A0K(bArr2, bArr2.length);
    }

    public final boolean A0C(TAH tah, int i) {
        int i2;
        if (!(this instanceof TZ4)) {
            return tah.A0D(this.data, 0, 0, i);
        }
        TZ4 tz4 = (TZ4) this;
        int i3 = 0;
        int i4 = 0;
        if (0 > tz4.A05() - i) {
            return false;
        }
        int[] iArr = tz4.A00;
        byte[][] bArr = tz4.A01;
        int length = bArr.length;
        int binarySearch = Arrays.binarySearch(iArr, 0, length, 1);
        if (binarySearch < 0) {
            binarySearch ^= -1;
        }
        while (i > 0) {
            if (binarySearch == 0) {
                i2 = 0;
            } else {
                i2 = iArr[binarySearch - 1];
            }
            int A04 = Pxh.A04((iArr[binarySearch] - i2) + i2, i3, i);
            if (!tah.A0D(bArr[binarySearch], i4, (i3 - i2) + iArr[length + binarySearch], A04)) {
                return false;
            }
            i3 += A04;
            i4 += A04;
            i -= A04;
            binarySearch++;
        }
        return true;
    }

    public final boolean A0D(byte[] bArr, int i, int i2, int i3) {
        int i4;
        if (this instanceof TZ4) {
            TZ4 tz4 = (TZ4) this;
            if (i < 0 || i > tz4.A05() - i3 || i2 < 0 || i2 > bArr.length - i3) {
                return false;
            }
            int[] iArr = tz4.A00;
            byte[][] bArr2 = tz4.A01;
            int length = bArr2.length;
            int binarySearch = Arrays.binarySearch(iArr, 0, length, i + 1);
            if (binarySearch < 0) {
                binarySearch ^= -1;
            }
            while (i3 > 0) {
                if (binarySearch == 0) {
                    i4 = 0;
                } else {
                    i4 = iArr[binarySearch - 1];
                }
                int A04 = Pxh.A04((iArr[binarySearch] - i4) + i4, i, i3);
                int i5 = (i - i4) + iArr[length + binarySearch];
                byte[] bArr3 = bArr2[binarySearch];
                for (int i6 = 0; i6 < A04; i6++) {
                    if (bArr3[i6 + i5] != bArr[i6 + i2]) {
                        return false;
                    }
                }
                i += A04;
                i2 += A04;
                i3 -= A04;
                binarySearch++;
            }
            return true;
        }
        if (i >= 0) {
            byte[] bArr4 = this.data;
            if (i <= bArr4.length - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
                int i7 = 0;
                while (i7 < i3) {
                    if (bArr4[i7 + i] == bArr[i7 + i2]) {
                        i7++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final byte[] A0E() {
        if (!(this instanceof TZ4)) {
            return (byte[]) this.data.clone();
        }
        TZ4 tz4 = (TZ4) this;
        int[] iArr = tz4.A00;
        byte[][] bArr = tz4.A01;
        int length = bArr.length;
        byte[] bArr2 = new byte[iArr[length - 1]];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            System.arraycopy(bArr[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        TAH tah = (TAH) obj;
        int A05 = A05();
        int A052 = tah.A05();
        int min = Math.min(A05, A052);
        int i = 0;
        while (i < min) {
            byte A04 = A04(i) & 255;
            byte A042 = tah.A04(i) & 255;
            if (A04 == A042) {
                i++;
            } else if (A04 < A042) {
                return -1;
            } else {
                return 1;
            }
        }
        if (A05 == A052) {
            return 0;
        }
        if (A05 < A052) {
            return -1;
        }
        return 1;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.data);
        this.A00 = hashCode;
        return hashCode;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r6 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        r3 = r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r9 = this;
            byte[] r0 = r9.data
            int r0 = r0.length
            if (r0 != 0) goto L_0x0008
            java.lang.String r0 = "[size=0]"
            return r0
        L_0x0008:
            java.lang.String r8 = r9.A08()
            r2 = 64
            int r6 = r8.length()
            r4 = r6
            r3 = 0
            r5 = 0
        L_0x0015:
            if (r3 >= r6) goto L_0x0039
            if (r5 == r2) goto L_0x003a
            int r1 = r8.codePointAt(r3)
            boolean r0 = java.lang.Character.isISOControl(r1)
            if (r0 == 0) goto L_0x0033
            r0 = 10
            if (r1 == r0) goto L_0x002b
            r0 = 13
            if (r1 != r0) goto L_0x0038
        L_0x002b:
            int r5 = r5 + 1
            int r0 = java.lang.Character.charCount(r1)
            int r3 = r3 + r0
            goto L_0x0015
        L_0x0033:
            r0 = 65533(0xfffd, float:9.1831E-41)
            if (r1 != r0) goto L_0x002b
        L_0x0038:
            r6 = -1
        L_0x0039:
            r3 = r6
        L_0x003a:
            r1 = -1
            java.lang.String r5 = "…]"
            java.lang.String r7 = "[size="
            java.lang.String r6 = "]"
            r0 = 0
            if (r3 != r1) goto L_0x0062
            byte[] r0 = r9.data
            int r0 = r0.length
            if (r0 > r2) goto L_0x0090
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "[hex="
            r2.append(r0)
            java.lang.String r1 = r9.A07()
        L_0x0057:
            r2.append(r1)
            r2.append(r6)
        L_0x005d:
            java.lang.String r0 = r2.toString()
            return r0
        L_0x0062:
            java.lang.String r2 = r8.substring(r0, r3)
            java.lang.String r1 = "\\"
            java.lang.String r0 = "\\\\"
            java.lang.String r2 = r2.replace(r1, r0)
            java.lang.String r1 = "\n"
            java.lang.String r0 = "\\n"
            java.lang.String r2 = r2.replace(r1, r0)
            java.lang.String r1 = "\r"
            java.lang.String r0 = "\\r"
            java.lang.String r1 = r2.replace(r1, r0)
            if (r3 >= r4) goto L_0x00ab
            java.lang.StringBuilder r2 = X.AnonymousClass7TF.A0n(r7)
            byte[] r0 = r9.data
            int r0 = r0.length
            r2.append(r0)
            java.lang.String r0 = " text="
            r2.append(r0)
            goto L_0x00a4
        L_0x0090:
            java.lang.StringBuilder r2 = X.AnonymousClass7TF.A0n(r7)
            r2.append(r0)
            java.lang.String r0 = " hex="
            r2.append(r0)
            X.TAH r0 = r9.A09()
            java.lang.String r1 = r0.A07()
        L_0x00a4:
            r2.append(r1)
            r2.append(r5)
            goto L_0x005d
        L_0x00ab:
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "[text="
            r2.append(r0)
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TAH.toString():java.lang.String");
    }

    public TAH(byte[] bArr) {
        this.data = bArr;
    }

    public static TAH A01(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            int i = length / 2;
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 2;
                bArr[i2] = (byte) ((A00(str.charAt(i3)) << 4) + A00(str.charAt(i3 + 1)));
            }
            return A03(bArr);
        }
        throw AnonymousClass7TF.A0W("Unexpected hex string: ", str);
    }
}
