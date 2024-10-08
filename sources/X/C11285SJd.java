package X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: X.SJd  reason: case insensitive filesystem */
public final class C11285SJd {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final boolean A05;
    public final byte[] A06;
    public final char[] A07;
    public final boolean[] A08;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11285SJd(java.lang.String r9, char[] r10) {
        /*
            r8 = this;
            r7 = 128(0x80, float:1.794E-43)
            byte[] r6 = new byte[r7]
            r5 = -1
            java.util.Arrays.fill(r6, r5)
            r4 = 0
        L_0x0009:
            int r0 = r10.length
            if (r4 >= r0) goto L_0x0048
            char r3 = r10[r4]
            r2 = 1
            boolean r0 = X.AnonymousClass7TF.A1T(r3, r7)
            java.lang.String r1 = "Non-ASCII character: %s"
            if (r0 == 0) goto L_0x0037
            byte r0 = r6[r3]
            if (r0 == r5) goto L_0x001c
            r2 = 0
        L_0x001c:
            java.lang.String r1 = "Duplicate character: %s"
            if (r2 == 0) goto L_0x0026
            byte r0 = (byte) r4
            r6[r3] = r0
            int r4 = r4 + 1
            goto L_0x0009
        L_0x0026:
            java.lang.Character r0 = java.lang.Character.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = com.google.common.base.Strings.A00(r1, r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0037:
            java.lang.Character r0 = java.lang.Character.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = com.google.common.base.Strings.A00(r1, r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0048:
            r0 = 0
            r8.<init>(r9, r6, r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11285SJd.<init>(java.lang.String, char[]):void");
    }

    public final int A00(char c) {
        if (c <= 127) {
            byte b = this.A06[c];
            if (b != -1) {
                return b;
            }
            if (c <= ' ' || c == 127) {
                throw new IOException(002.A0R("Unrecognized character: 0x", Integer.toHexString(c)));
            }
            throw new IOException(002.A0C("Unrecognized character: ", c));
        }
        throw new IOException(002.A0R("Unrecognized character: 0x", Integer.toHexString(c)));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11285SJd)) {
            return false;
        }
        C11285SJd sJd = (C11285SJd) obj;
        if (this.A05 != sJd.A05 || !Arrays.equals(this.A07, sJd.A07)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.A07);
        int i = 1237;
        if (this.A05) {
            i = 1231;
        }
        return hashCode + i;
    }

    public final String toString() {
        return this.A04;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        r2 = 31 - java.lang.Integer.numberOfLeadingZeros(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0061, code lost:
        r6.A00 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0063, code lost:
        r1 = java.lang.Integer.numberOfTrailingZeros(r2);
        r0 = 1 << (3 - r1);
        r6.A02 = r0;
        r6.A01 = r2 >> r1;
        r6.A03 = r3 - 1;
        r6.A06 = r8;
        r4 = new boolean[r0];
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007b, code lost:
        if (r3 >= r6.A01) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007d, code lost:
        r1 = r6.A00;
        r4[X.SN3.A01(java.math.RoundingMode.CEILING, r3 * 8, r1)] = true;
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008c, code lost:
        r6.A08 = r4;
        r6.A05 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0090, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11285SJd(java.lang.String r7, byte[] r8, char[] r9, boolean r10) {
        /*
            r6 = this;
            r6.<init>()
            r7.getClass()
            r6.A04 = r7
            r9.getClass()
            r6.A07 = r9
            int r3 = r9.length     // Catch:{ ArithmeticException -> 0x0091 }
            java.math.RoundingMode r1 = java.math.RoundingMode.UNNECESSARY     // Catch:{ ArithmeticException -> 0x0091 }
            java.lang.String r4 = "x"
            if (r3 <= 0) goto L_0x0031
            int[] r0 = X.C10010Rl5.A00     // Catch:{ ArithmeticException -> 0x0091 }
            int r0 = X.Pxe.A08(r1, r0)     // Catch:{ ArithmeticException -> 0x0091 }
            switch(r0) {
                case 1: goto L_0x0023;
                case 2: goto L_0x0052;
                case 3: goto L_0x0052;
                case 4: goto L_0x0059;
                case 5: goto L_0x0059;
                case 6: goto L_0x003f;
                case 7: goto L_0x003f;
                case 8: goto L_0x003f;
                default: goto L_0x001e;
            }     // Catch:{ ArithmeticException -> 0x0091 }
        L_0x001e:
            java.lang.AssertionError r1 = X.Pxe.A0d()     // Catch:{ ArithmeticException -> 0x0091 }
        L_0x0022:
            throw r1     // Catch:{ ArithmeticException -> 0x0091 }
        L_0x0023:
            int r0 = r3 + -1
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = "mode was UNNECESSARY, but rounding was necessary"
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException     // Catch:{ ArithmeticException -> 0x0091 }
            r1.<init>(r0)     // Catch:{ ArithmeticException -> 0x0091 }
            goto L_0x0022
        L_0x0031:
            java.lang.String r2 = " ("
            r1 = 0
            java.lang.String r0 = ") must be > 0"
            java.lang.String r0 = X.002.A06(r1, r4, r2, r0)     // Catch:{ ArithmeticException -> 0x0091 }
            java.lang.IllegalArgumentException r1 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ ArithmeticException -> 0x0091 }
            goto L_0x0022
        L_0x003f:
            int r1 = java.lang.Integer.numberOfLeadingZeros(r3)     // Catch:{ ArithmeticException -> 0x0091 }
            r0 = -1257966797(0xffffffffb504f333, float:-4.9527733E-7)
            int r0 = r0 >>> r1
            int r2 = 31 - r1
            int r0 = r0 - r3
            r0 = r0 ^ -1
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r2 = r2 + r0
            goto L_0x0061
        L_0x0052:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r3)     // Catch:{ ArithmeticException -> 0x0091 }
            int r2 = 31 - r0
            goto L_0x0061
        L_0x0059:
            int r0 = r3 + -1
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)     // Catch:{ ArithmeticException -> 0x0091 }
            int r2 = 32 - r0
        L_0x0061:
            r6.A00 = r2     // Catch:{ ArithmeticException -> 0x0091 }
            int r1 = java.lang.Integer.numberOfTrailingZeros(r2)
            int r0 = 3 - r1
            r5 = 1
            int r0 = r5 << r0
            r6.A02 = r0
            int r2 = r2 >> r1
            r6.A01 = r2
            int r3 = r3 - r5
            r6.A03 = r3
            r6.A06 = r8
            boolean[] r4 = new boolean[r0]
            r3 = 0
        L_0x0079:
            int r0 = r6.A01
            if (r3 >= r0) goto L_0x008c
            int r2 = r3 * 8
            int r1 = r6.A00
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            int r0 = X.SN3.A01(r0, r2, r1)
            r4[r0] = r5
            int r3 = r3 + 1
            goto L_0x0079
        L_0x008c:
            r6.A08 = r4
            r6.A05 = r10
            return
        L_0x0091:
            r2 = move-exception
            java.lang.String r1 = "Illegal alphabet length "
            int r0 = r9.length
            java.lang.String r0 = X.002.A0O(r1, r0)
            java.lang.IllegalArgumentException r0 = X.Pxe.A0h(r0, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11285SJd.<init>(java.lang.String, byte[], char[], boolean):void");
    }
}
