package X;

public abstract class RR2 {
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x016e, code lost:
        r0 = X.C10021RlG.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0176, code lost:
        if (r1 == 0) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0179, code lost:
        if (r1 == 1) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x017c, code lost:
        if (r1 != 2) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x017e, code lost:
        r9 = X.C11430STu.A01;
        r0 = X.C11430STu.A00;
        r2 = r9.A00(r8, r0 + r4);
        r1 = r9.A00(r8, r0 + (r4 + 1));
        r0 = X.C10021RlG.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x019f, code lost:
        r1 = X.C11430STu.A01.A00(r8, X.C11430STu.A00 + r4);
        r0 = X.C10021RlG.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01b7, code lost:
        throw X.Pxe.A0d();
     */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x007a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d7 A[LOOP:0: B:7:0x0021->B:64:0x00d7, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(byte[] r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r3 = r20
            r7 = r19
            boolean r0 = r0 instanceof X.R77
            r8 = r18
            if (r0 == 0) goto L_0x006b
            r2 = r19 | r20
            int r1 = r8.length
            int r0 = r1 - r20
            r2 = r2 | r0
            if (r2 < 0) goto L_0x0144
            long r4 = (long) r7
            long r0 = (long) r3
            long r0 = r0 - r4
            int r9 = (int) r0
            r12 = r4
            r3 = 0
            r0 = 16
            if (r9 >= r0) goto L_0x0037
        L_0x001e:
            int r9 = r9 - r3
            long r0 = (long) r3
            long r4 = r4 + r0
        L_0x0021:
            r7 = 0
        L_0x0022:
            r15 = 1
            if (r9 <= 0) goto L_0x00b5
            long r10 = r4 + r15
            X.S7k r2 = X.C11430STu.A01
            long r0 = X.C11430STu.A00
            long r0 = r0 + r4
            byte r7 = r2.A00(r8, r0)
            if (r7 < 0) goto L_0x00b9
            int r9 = r9 + -1
            r4 = r10
            goto L_0x0022
        L_0x0037:
            int r6 = r3 + 8
            if (r6 > r9) goto L_0x0055
            long r0 = X.C11430STu.A00
            long r0 = r0 + r12
            X.S7k r2 = X.C11430STu.A01
            long r10 = r2.A05(r8, r0)
            r0 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r0
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0055
            r0 = 8
            long r12 = r12 + r0
            r3 = r6
            goto L_0x0037
        L_0x0055:
            if (r3 >= r9) goto L_0x0069
            r6 = 1
            long r6 = r6 + r12
            X.S7k r2 = X.C11430STu.A01
            long r0 = X.C11430STu.A00
            long r0 = r0 + r12
            byte r0 = r2.A00(r8, r0)
            if (r0 < 0) goto L_0x001e
            int r3 = r3 + 1
            r12 = r6
            goto L_0x0055
        L_0x0069:
            r3 = r9
            goto L_0x001e
        L_0x006b:
            if (r7 >= r3) goto L_0x0074
            byte r0 = r18[r7]
            if (r0 < 0) goto L_0x0074
            int r7 = r7 + 1
            goto L_0x006b
        L_0x0074:
            if (r7 < r3) goto L_0x0077
            goto L_0x00b7
        L_0x0077:
            if (r7 < r3) goto L_0x007b
            r14 = 0
        L_0x007a:
            return r14
        L_0x007b:
            int r5 = r7 + 1
            byte r7 = r18[r7]
            if (r7 >= 0) goto L_0x0141
            r9 = -32
            r14 = -1
            r6 = -65
            if (r7 >= r9) goto L_0x0095
            if (r5 >= r3) goto L_0x00b8
            r0 = -62
            if (r7 < r0) goto L_0x007a
            int r7 = r5 + 1
            byte r0 = r18[r5]
        L_0x0092:
            if (r0 <= r6) goto L_0x0077
            return r14
        L_0x0095:
            r0 = -16
            if (r7 >= r0) goto L_0x0124
            int r0 = r20 + -1
            if (r5 >= r0) goto L_0x014f
            int r4 = r5 + 1
            byte r2 = r18[r5]
            if (r2 > r6) goto L_0x007a
            r1 = -96
            if (r7 != r9) goto L_0x00ae
            if (r2 < r1) goto L_0x007a
        L_0x00a9:
            int r7 = r4 + 1
            byte r0 = r18[r4]
            goto L_0x0092
        L_0x00ae:
            r0 = -19
            if (r7 != r0) goto L_0x00a9
            if (r2 >= r1) goto L_0x007a
            goto L_0x00a9
        L_0x00b5:
            if (r9 != 0) goto L_0x00ba
        L_0x00b7:
            r7 = 0
        L_0x00b8:
            return r7
        L_0x00b9:
            r4 = r10
        L_0x00ba:
            int r1 = r9 + -1
            r13 = -32
            r6 = -65
            r14 = -1
            if (r7 >= r13) goto L_0x00da
            if (r1 == 0) goto L_0x00b8
            int r9 = r1 + -1
            r0 = -62
            if (r7 < r0) goto L_0x007a
        L_0x00cb:
            long r15 = r15 + r4
            X.S7k r12 = X.C11430STu.A01
            long r2 = X.C11430STu.A00
            long r2 = r2 + r4
        L_0x00d1:
            byte r0 = r12.A00(r8, r2)
            if (r0 > r6) goto L_0x007a
            r4 = r15
            goto L_0x0021
        L_0x00da:
            r0 = -16
            if (r7 >= r0) goto L_0x0101
            r0 = 2
            if (r1 < r0) goto L_0x0176
            int r9 = r1 + -2
            long r10 = r4 + r15
            X.S7k r12 = X.C11430STu.A01
            long r2 = X.C11430STu.A00
            long r0 = r2 + r4
            byte r4 = r12.A00(r8, r0)
            if (r4 > r6) goto L_0x007a
            r1 = -96
            if (r7 != r13) goto L_0x00fa
            if (r4 < r1) goto L_0x007a
        L_0x00f7:
            long r15 = r15 + r10
            long r2 = r2 + r10
            goto L_0x00d1
        L_0x00fa:
            r0 = -19
            if (r7 != r0) goto L_0x00f7
            if (r4 >= r1) goto L_0x007a
            goto L_0x00f7
        L_0x0101:
            r0 = 3
            if (r1 < r0) goto L_0x0176
            int r9 = r1 + -3
            long r11 = r4 + r15
            X.S7k r10 = X.C11430STu.A01
            long r2 = X.C11430STu.A00
            long r0 = r2 + r4
            byte r0 = r10.A00(r8, r0)
            if (r0 > r6) goto L_0x007a
            int r0 = X.Pxi.A04(r7, r0)
            if (r0 != 0) goto L_0x007a
            long r4 = r11 + r15
            long r2 = r2 + r11
            byte r0 = r10.A00(r8, r2)
            if (r0 > r6) goto L_0x007a
            goto L_0x00cb
        L_0x0124:
            int r0 = r20 + -2
            if (r5 >= r0) goto L_0x014f
            int r2 = r5 + 1
            byte r0 = r18[r5]
            if (r0 > r6) goto L_0x007a
            int r0 = X.Pxi.A04(r7, r0)
            if (r0 != 0) goto L_0x007a
            int r1 = r2 + 1
            byte r0 = r18[r2]
            if (r0 > r6) goto L_0x007a
            int r5 = r1 + 1
            byte r0 = r18[r1]
            if (r0 <= r6) goto L_0x0141
            return r14
        L_0x0141:
            r7 = r5
            goto L_0x0077
        L_0x0144:
            java.lang.Object[] r1 = X.Pxh.A1a(r1, r7, r3)
            java.lang.String r0 = "Array length=%d, index=%d, limit=%d"
            java.lang.ArrayIndexOutOfBoundsException r0 = X.Pxf.A0V(r0, r1)
            throw r0
        L_0x014f:
            X.RR2 r0 = X.C10021RlG.A00
            int r0 = r5 + -1
            byte r7 = r18[r0]
            int r3 = r20 - r5
            if (r3 == 0) goto L_0x0170
            r0 = 1
            if (r3 == r0) goto L_0x016b
            r0 = 2
            if (r3 != r0) goto L_0x0166
            byte r2 = r18[r5]
            int r0 = r5 + 1
            byte r1 = r18[r0]
            goto L_0x0190
        L_0x0166:
            java.lang.AssertionError r0 = X.Pxe.A0d()
            throw r0
        L_0x016b:
            byte r1 = r18[r5]
            goto L_0x01aa
        L_0x016e:
            X.RR2 r0 = X.C10021RlG.A00
        L_0x0170:
            r0 = -12
            if (r7 <= r0) goto L_0x019e
        L_0x0174:
            r7 = -1
            return r7
        L_0x0176:
            if (r1 == 0) goto L_0x016e
            r0 = 1
            if (r1 == r0) goto L_0x019f
            r0 = 2
            if (r1 != r0) goto L_0x01b3
            X.S7k r9 = X.C11430STu.A01
            long r0 = X.C11430STu.A00
            long r2 = r0 + r4
            byte r2 = r9.A00(r8, r2)
            long r4 = r4 + r15
            long r0 = r0 + r4
            byte r1 = r9.A00(r8, r0)
            X.RR2 r0 = X.C10021RlG.A00
        L_0x0190:
            r0 = -12
            if (r7 > r0) goto L_0x0174
            if (r2 > r6) goto L_0x0174
            if (r1 > r6) goto L_0x0174
            int r0 = r2 << 8
            r7 = r7 ^ r0
            int r0 = r1 << 16
        L_0x019d:
            r7 = r7 ^ r0
        L_0x019e:
            return r7
        L_0x019f:
            X.S7k r2 = X.C11430STu.A01
            long r0 = X.C11430STu.A00
            long r0 = r0 + r4
            byte r1 = r2.A00(r8, r0)
            X.RR2 r0 = X.C10021RlG.A00
        L_0x01aa:
            r0 = -12
            if (r7 > r0) goto L_0x0174
            if (r1 > r6) goto L_0x0174
            int r0 = r1 << 8
            goto L_0x019d
        L_0x01b3:
            java.lang.AssertionError r0 = X.Pxe.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RR2.A00(byte[], int, int):int");
    }
}
