package X;

public abstract class OJG {
    public static final C73573Pg3 A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0139, code lost:
        if (r12 != -2) goto L_0x013b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] A00(java.lang.CharSequence r20, int r21) {
        /*
            r19 = this;
            r9 = r20
            r7 = 0
            boolean r0 = r9 instanceof java.lang.String
            r8 = r21
            if (r0 == 0) goto L_0x00d1
            int r0 = r9.length()
            X.C60370gV.A01(r8, r0)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r1 = X.C51967G9n.A0q(r9, r7, r8)
            java.nio.charset.Charset r0 = X.AnonymousClass15Q.A00
            byte[] r5 = r1.getBytes(r0)
            X.0qQ.A07(r5)
        L_0x001f:
            int r10 = r5.length
            X.C60370gV.A01(r10, r10)
            r3 = r10
            if (r10 != 0) goto L_0x00b3
            r9 = 0
        L_0x0027:
            byte[] r8 = new byte[r9]
            int[] r18 = X.O5A.A00
            r13 = -8
            r11 = 0
            r4 = 0
            r3 = 0
            r12 = -8
        L_0x0030:
            java.lang.String r6 = ") at index "
            java.lang.String r7 = "'("
            r1 = -2
            if (r4 >= r10) goto L_0x0139
            if (r12 != r13) goto L_0x007e
            int r0 = r4 + 3
            if (r0 >= r10) goto L_0x007e
            int r2 = r4 + 1
            byte r0 = r5[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r17 = r18[r0]
            int r4 = r2 + 1
            byte r0 = r5[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r16 = r18[r0]
            int r2 = r4 + 1
            byte r0 = r5[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r15 = r18[r0]
            int r4 = r2 + 1
            byte r0 = r5[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r14 = r18[r0]
            int r2 = r17 << 18
            int r0 = r16 << 12
            r2 = r2 | r0
            int r0 = r15 << 6
            r2 = r2 | r0
            r2 = r2 | r14
            if (r2 < 0) goto L_0x007c
            int r6 = r11 + 1
            int r0 = r2 >> 16
            byte r0 = (byte) r0
            r8[r11] = r0
            int r1 = r6 + 1
            int r0 = r2 >> 8
            byte r0 = (byte) r0
            r8[r6] = r0
            int r11 = r1 + 1
            byte r0 = (byte) r2
            r8[r1] = r0
            goto L_0x0030
        L_0x007c:
            int r4 = r4 + -4
        L_0x007e:
            byte r0 = r5[r4]
            r2 = r0 & 255(0xff, float:3.57E-43)
            r0 = r18[r2]
            if (r0 >= 0) goto L_0x0099
            if (r0 != r1) goto L_0x010e
            if (r12 == r13) goto L_0x0107
            r0 = -6
            if (r12 == r0) goto L_0x00fd
            r0 = -4
            if (r12 == r0) goto L_0x00f3
            if (r12 == r1) goto L_0x0178
            java.lang.String r0 = "Unreachable"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0099:
            int r4 = r4 + 1
            int r3 = r3 << 6
            r3 = r3 | r0
            int r12 = r12 + 6
            if (r12 < 0) goto L_0x0030
            int r2 = r11 + 1
            int r0 = r3 >>> r12
            byte r0 = (byte) r0
            r8[r11] = r0
            r1 = 1
            int r0 = r1 << r12
            int r0 = r0 - r1
            r3 = r3 & r0
            int r12 = r12 + -8
            r11 = r2
            goto L_0x0030
        L_0x00b3:
            r2 = 1
            if (r10 == r2) goto L_0x017f
            int r2 = r10 + -1
            byte r0 = r5[r2]
            r1 = 61
            if (r0 != r1) goto L_0x00c7
            r3 = r2
            int r0 = r10 + -2
            byte r0 = r5[r0]
            if (r0 != r1) goto L_0x00c7
            int r3 = r2 + -1
        L_0x00c7:
            long r2 = (long) r3
            r0 = 6
            long r2 = r2 * r0
            r0 = 8
            long r2 = r2 / r0
            int r9 = (int) r2
            goto L_0x0027
        L_0x00d1:
            r6 = 0
            int r0 = r9.length()
            X.C60370gV.A01(r8, r0)
            byte[] r5 = new byte[r8]
            r4 = 0
        L_0x00dc:
            if (r6 >= r8) goto L_0x001f
            char r3 = r9.charAt(r6)
            r2 = 255(0xff, float:3.57E-43)
            int r1 = r4 + 1
            r0 = 63
            if (r3 > r2) goto L_0x00ed
            int r1 = r4 + 1
            byte r0 = (byte) r3
        L_0x00ed:
            r5[r4] = r0
            r4 = r1
            int r6 = r6 + 1
            goto L_0x00dc
        L_0x00f3:
            int r4 = r4 + 1
            if (r4 == r10) goto L_0x0100
            byte r1 = r5[r4]
            r0 = 61
            if (r1 != r0) goto L_0x0100
        L_0x00fd:
            int r4 = r4 + 1
            goto L_0x013b
        L_0x0100:
            java.lang.String r0 = "Missing one pad character at index "
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r4)
            throw r0
        L_0x0107:
            java.lang.String r0 = "Redundant pad character at index "
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r4)
            throw r0
        L_0x010e:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Invalid symbol '"
            r1.append(r0)
            char r0 = (char) r2
            r1.append(r0)
            r1.append(r7)
            r0 = 8
            java.lang.String r0 = java.lang.Integer.toString(r2, r0)
            X.0qQ.A07(r0)
            r1.append(r0)
            r1.append(r6)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0139:
            if (r12 == r1) goto L_0x0178
        L_0x013b:
            if (r4 < r10) goto L_0x0145
            if (r11 != r9) goto L_0x0140
            return r8
        L_0x0140:
            java.lang.IllegalStateException r0 = X.DbT.A0m()
            throw r0
        L_0x0145:
            byte r0 = r5[r4]
            r2 = r0 & 255(0xff, float:3.57E-43)
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Symbol '"
            r1.append(r0)
            char r0 = (char) r2
            r1.append(r0)
            r1.append(r7)
            r0 = 8
            java.lang.String r0 = java.lang.Integer.toString(r2, r0)
            X.0qQ.A07(r0)
            r1.append(r0)
            r1.append(r6)
            r0 = 1
            int r4 = r4 - r0
            r1.append(r4)
            java.lang.String r0 = " is prohibited after the pad character"
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0178:
            java.lang.String r0 = "The last unit of input does not have enough bits"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x017f:
            java.lang.String r1 = "Input should have at list 2 symbols for Base64 decoding, startIndex: "
            java.lang.String r0 = ", endIndex: "
            java.lang.String r0 = X.002.A02(r7, r2, r1, r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OJG.A00(java.lang.CharSequence, int):byte[]");
    }
}
