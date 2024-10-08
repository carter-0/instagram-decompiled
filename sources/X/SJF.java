package X;

import java.util.Arrays;

public final class SJF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final boolean A05;
    public final byte[] A06;
    public final char[] A07;

    public final String toString() {
        return this.A04;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SJF(java.lang.String r10, char[] r11) {
        /*
            r9 = this;
            r8 = 128(0x80, float:1.794E-43)
            byte[] r7 = new byte[r8]
            r6 = -1
            java.util.Arrays.fill(r7, r6)
            r5 = 0
            r4 = 0
        L_0x000a:
            int r0 = r11.length
            if (r4 >= r0) goto L_0x0049
            char r3 = r11[r4]
            r2 = 1
            boolean r0 = X.AnonymousClass7TF.A1T(r3, r8)
            java.lang.String r1 = "Non-ASCII character: %s"
            if (r0 == 0) goto L_0x0038
            byte r0 = r7[r3]
            if (r0 == r6) goto L_0x001d
            r2 = 0
        L_0x001d:
            java.lang.String r1 = "Duplicate character: %s"
            if (r2 == 0) goto L_0x0027
            byte r0 = (byte) r4
            r7[r3] = r0
            int r4 = r4 + 1
            goto L_0x000a
        L_0x0027:
            java.lang.Character r0 = java.lang.Character.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = X.C9705RfO.A00(r1, r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0038:
            java.lang.Character r0 = java.lang.Character.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = X.C9705RfO.A00(r1, r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0049:
            r9.<init>(r10, r7, r11, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SJF.<init>(java.lang.String, char[]):void");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SJF)) {
            return false;
        }
        SJF sjf = (SJF) obj;
        if (this.A05 != sjf.A05 || !Arrays.equals(this.A07, sjf.A07)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.A05;
        int hashCode = Arrays.hashCode(this.A07);
        int i = 1231;
        if (true != z) {
            i = 1237;
        }
        return hashCode + i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        r3 = 31 - java.lang.Integer.numberOfLeadingZeros(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        r5.A01 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        r2 = java.lang.Integer.numberOfTrailingZeros(r3);
        r5.A02 = 1 << (3 - r2);
        r5.A03 = r3 >> r2;
        r5.A00 = r4 - 1;
        r5.A06 = r7;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        if (r3 >= r5.A03) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        r1 = r5.A01;
        X.C9708RfR.A00(java.math.RoundingMode.CEILING, r3 * 8, r1);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0077, code lost:
        r5.A05 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0079, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SJF(java.lang.String r6, byte[] r7, char[] r8, boolean r9) {
        /*
            r5 = this;
            r5.<init>()
            r5.A04 = r6
            r8.getClass()
            r5.A07 = r8
            int r4 = r8.length     // Catch:{ ArithmeticException -> 0x007a }
            java.math.RoundingMode r1 = java.math.RoundingMode.UNNECESSARY     // Catch:{ ArithmeticException -> 0x007a }
            if (r4 <= 0) goto L_0x002b
            int[] r0 = X.C9994Rko.A00     // Catch:{ ArithmeticException -> 0x007a }
            int r0 = X.Pxe.A08(r1, r0)     // Catch:{ ArithmeticException -> 0x007a }
            switch(r0) {
                case 1: goto L_0x001d;
                case 2: goto L_0x003c;
                case 3: goto L_0x003c;
                case 4: goto L_0x0033;
                case 5: goto L_0x0033;
                case 6: goto L_0x0043;
                case 7: goto L_0x0043;
                case 8: goto L_0x0043;
                default: goto L_0x0018;
            }     // Catch:{ ArithmeticException -> 0x007a }
        L_0x0018:
            java.lang.AssertionError r1 = X.Pxe.A0d()     // Catch:{ ArithmeticException -> 0x007a }
        L_0x001c:
            throw r1     // Catch:{ ArithmeticException -> 0x007a }
        L_0x001d:
            int r0 = r4 + -1
            r0 = r0 & r4
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = "mode was UNNECESSARY, but rounding was necessary"
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException     // Catch:{ ArithmeticException -> 0x007a }
            r1.<init>(r0)     // Catch:{ ArithmeticException -> 0x007a }
            goto L_0x001c
        L_0x002b:
            java.lang.String r0 = "x (0) must be > 0"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ ArithmeticException -> 0x007a }
            goto L_0x001c
        L_0x0033:
            int r0 = r4 + -1
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)     // Catch:{ ArithmeticException -> 0x007a }
            int r3 = 32 - r0
            goto L_0x0051
        L_0x003c:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r4)     // Catch:{ ArithmeticException -> 0x007a }
            int r3 = 31 - r0
            goto L_0x0051
        L_0x0043:
            r1 = -1257966797(0xffffffffb504f333, float:-4.9527733E-7)
            int r0 = java.lang.Integer.numberOfLeadingZeros(r4)     // Catch:{ ArithmeticException -> 0x007a }
            int r1 = r1 >>> r0
            int r3 = 31 - r0
            int r1 = r1 - r4
            int r0 = r1 >>> 31
            int r3 = r3 + r0
        L_0x0051:
            r5.A01 = r3     // Catch:{ ArithmeticException -> 0x007a }
            int r2 = java.lang.Integer.numberOfTrailingZeros(r3)
            int r1 = 3 - r2
            r0 = 1
            int r0 = r0 << r1
            r5.A02 = r0
            int r3 = r3 >> r2
            r5.A03 = r3
            int r0 = r4 + -1
            r5.A00 = r0
            r5.A06 = r7
            r3 = 0
        L_0x0067:
            int r0 = r5.A03
            if (r3 >= r0) goto L_0x0077
            int r2 = r3 * 8
            int r1 = r5.A01
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            X.C9708RfR.A00(r0, r2, r1)
            int r3 = r3 + 1
            goto L_0x0067
        L_0x0077:
            r5.A05 = r9
            return
        L_0x007a:
            r2 = move-exception
            int r1 = r8.length
            java.lang.String r0 = "Illegal alphabet length "
            java.lang.String r0 = X.002.A0O(r0, r1)
            java.lang.IllegalArgumentException r0 = X.Pxe.A0h(r0, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SJF.<init>(java.lang.String, byte[], char[], boolean):void");
    }
}
