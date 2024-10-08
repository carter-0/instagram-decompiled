package X;

import java.io.Serializable;

/* renamed from: X.T9j  reason: case insensitive filesystem */
public final class C12837T9j implements Serializable {
    public static final C12837T9j A06 = new C12837T9j(167.A02, -1, -1, -1, -1);
    public final int A00;
    public final int A01;
    public final long A02;
    public final 167 A03;
    public final long A04;
    public transient String A05;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && (obj instanceof C12837T9j)) {
                C12837T9j t9j = (C12837T9j) obj;
                if (!(this.A03.equals(t9j.A03) && this.A01 == t9j.A01 && this.A00 == t9j.A00 && this.A04 == t9j.A04 && this.A02 == t9j.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01 ^ 2) + this.A00) ^ ((int) this.A04)) + ((int) this.A02);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        if (r0 >= 0) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d3, code lost:
        if (r7 != null) goto L_0x00d5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r12 = this;
            java.lang.String r1 = r12.A05
            if (r1 != 0) goto L_0x001b
            X.167 r5 = r12.A03
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.StringBuilder r3 = X.Pxe.A14(r0)
            java.lang.Object r4 = r5.A01
            if (r4 != 0) goto L_0x0082
            java.lang.String r0 = "UNKNOWN"
        L_0x0012:
            r3.append(r0)
        L_0x0015:
            java.lang.String r1 = r3.toString()
            r12.A05 = r1
        L_0x001b:
            int r0 = r1.length()
            int r0 = r0 + 40
            java.lang.StringBuilder r6 = X.Pxe.A14(r0)
            java.lang.String r0 = "[Source: "
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = "; "
            r6.append(r0)
            X.167 r0 = r12.A03
            boolean r0 = r0.A00
            java.lang.String r2 = ", column: "
            java.lang.String r1 = "line: "
            java.lang.String r5 = "UNKNOWN"
            if (r0 == 0) goto L_0x005b
            r6.append(r1)
            int r0 = r12.A01
            if (r0 < 0) goto L_0x0057
            r6.append(r0)
        L_0x0048:
            r6.append(r2)
            int r0 = r12.A00
            if (r0 < 0) goto L_0x007e
        L_0x004f:
            r6.append(r0)
        L_0x0052:
            java.lang.String r0 = X.Pxg.A0w(r6)
            return r0
        L_0x0057:
            r6.append(r5)
            goto L_0x0048
        L_0x005b:
            int r0 = r12.A01
            if (r0 <= 0) goto L_0x006d
            r6.append(r1)
            r6.append(r0)
            int r0 = r12.A00
            if (r0 <= 0) goto L_0x0052
            r6.append(r2)
            goto L_0x004f
        L_0x006d:
            java.lang.String r0 = "byte offset: #"
            r6.append(r0)
            long r3 = r12.A02
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x007e
            r6.append(r3)
            goto L_0x0052
        L_0x007e:
            r6.append(r5)
            goto L_0x0052
        L_0x0082:
            boolean r0 = r4 instanceof java.lang.Class
            if (r0 == 0) goto L_0x016e
            r2 = r4
            java.lang.Class r2 = (java.lang.Class) r2
        L_0x0089:
            java.lang.String r1 = r2.getName()
            java.lang.String r0 = "java."
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x015e
            java.lang.String r1 = r2.getSimpleName()
        L_0x0099:
            r0 = 40
            r3.append(r0)
            r3.append(r1)
            r0 = 41
            r3.append(r0)
            boolean r0 = r5.A00
            if (r0 == 0) goto L_0x018e
            r5 = 500(0x1f4, float:7.0E-43)
            r1 = 0
            r0 = -1
            r11 = 1
            int[] r6 = new int[]{r0, r0}
            boolean r0 = r4 instanceof java.lang.CharSequence
            java.lang.String r2 = " chars"
            if (r0 == 0) goto L_0x0128
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r0 = r4.length()
            X.167.A00(r6, r0)
            r1 = r6[r1]
            r0 = r6[r11]
            int r0 = java.lang.Math.min(r0, r5)
            int r0 = r0 + r1
            java.lang.CharSequence r0 = r4.subSequence(r1, r0)
            java.lang.String r7 = r0.toString()
            if (r7 == 0) goto L_0x0015
        L_0x00d5:
            r8 = 34
            r3.append(r8)
            int r4 = r7.length()
            r1 = 0
        L_0x00df:
            if (r1 >= r4) goto L_0x0174
            char r9 = r7.charAt(r1)
            boolean r0 = java.lang.Character.isISOControl(r9)
            if (r0 == 0) goto L_0x0124
            r0 = 13
            if (r9 == r0) goto L_0x0124
            r0 = 10
            if (r9 == r0) goto L_0x0124
            r0 = 92
            r3.append(r0)
            r0 = 117(0x75, float:1.64E-43)
            r3.append(r0)
            int r0 = r9 >> 12
            r0 = r0 & 15
            char[] r10 = X.AnonymousClass161.A00
            char r0 = r10[r0]
            r3.append(r0)
            int r0 = r9 >> 8
            r0 = r0 & 15
            char r0 = r10[r0]
            r3.append(r0)
            int r0 = r9 >> 4
            r0 = r0 & 15
            char r0 = r10[r0]
            r3.append(r0)
            r0 = r9 & 15
            char r0 = r10[r0]
            r3.append(r0)
        L_0x0121:
            int r1 = r1 + 1
            goto L_0x00df
        L_0x0124:
            r3.append(r9)
            goto L_0x0121
        L_0x0128:
            boolean r0 = r4 instanceof char[]
            if (r0 == 0) goto L_0x0140
            char[] r4 = (char[]) r4
            int r0 = r4.length
            X.167.A00(r6, r0)
            r1 = r6[r1]
            r0 = r6[r11]
            int r0 = java.lang.Math.min(r0, r5)
            java.lang.String r7 = new java.lang.String
            r7.<init>(r4, r1, r0)
            goto L_0x00d5
        L_0x0140:
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L_0x0015
            byte[] r4 = (byte[]) r4
            int r0 = r4.length
            X.167.A00(r6, r0)
            r2 = r6[r1]
            r0 = r6[r11]
            int r1 = java.lang.Math.min(r0, r5)
            java.nio.charset.Charset r0 = X.Pxe.A17()
            java.lang.String r7 = X.Pxe.A11(r0, r4, r2, r1)
            java.lang.String r2 = " bytes"
            goto L_0x00d5
        L_0x015e:
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L_0x0166
            java.lang.String r1 = "byte[]"
            goto L_0x0099
        L_0x0166:
            boolean r0 = r4 instanceof char[]
            if (r0 == 0) goto L_0x0099
            java.lang.String r1 = "char[]"
            goto L_0x0099
        L_0x016e:
            java.lang.Class r2 = r4.getClass()
            goto L_0x0089
        L_0x0174:
            r3.append(r8)
            r1 = r6[r11]
            if (r1 <= r5) goto L_0x0015
            java.lang.String r0 = "[truncated "
            r3.append(r0)
            int r1 = r1 - r5
            r3.append(r1)
            r3.append(r2)
            r0 = 93
            r3.append(r0)
            goto L_0x0015
        L_0x018e:
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L_0x0015
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            r0 = 91
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = " bytes]"
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12837T9j.toString():java.lang.String");
    }

    public C12837T9j(167 r1, int i, int i2, long j, long j2) {
        this.A03 = r1 == null ? 167.A02 : r1;
        this.A02 = j;
        this.A04 = j2;
        this.A01 = i;
        this.A00 = i2;
    }
}
