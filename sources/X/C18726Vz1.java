package X;

/* renamed from: X.Vz1  reason: case insensitive filesystem */
public final class C18726Vz1 {
    public static final C18634VvU[] A01 = new C18634VvU[0];
    public final C18542Vtu A00 = new C18542Vtu();

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C19872Wgz A00(X.C19872Wgz r13) {
        /*
            r12 = 0
            r1 = 0
        L_0x0002:
            int[] r6 = r13.A03
            int r5 = r6.length
            if (r1 >= r5) goto L_0x000e
            r0 = r6[r1]
            if (r0 != 0) goto L_0x000e
            int r1 = r1 + 1
            goto L_0x0002
        L_0x000e:
            if (r1 != r5) goto L_0x001c
            r7 = 0
        L_0x0011:
            r11 = 1
            int r5 = r5 - r11
        L_0x0013:
            if (r5 < 0) goto L_0x0046
            r4 = r6[r5]
            if (r4 != 0) goto L_0x0036
            int r5 = r5 + -1
            goto L_0x0013
        L_0x001c:
            int r0 = r13.A01
            int r4 = r1 / r0
            int r0 = r1 % r0
            int r3 = r0 * 32
            r2 = r6[r1]
            r1 = 0
        L_0x0027:
            int r0 = 31 - r1
            int r0 = r2 << r0
            if (r0 != 0) goto L_0x0030
            int r1 = r1 + 1
            goto L_0x0027
        L_0x0030:
            int r3 = r3 + r1
            int[] r7 = new int[]{r3, r4}
            goto L_0x0011
        L_0x0036:
            int r0 = r13.A01
            int r3 = r5 / r0
            int r5 = r5 % r0
            int r2 = r5 * 32
            r1 = 31
        L_0x003f:
            int r0 = r4 >>> r1
            if (r0 != 0) goto L_0x0048
            int r1 = r1 + -1
            goto L_0x003f
        L_0x0046:
            r10 = 0
            goto L_0x004d
        L_0x0048:
            int r2 = r2 + r1
            int[] r10 = new int[]{r2, r3}
        L_0x004d:
            if (r7 == 0) goto L_0x00e4
            if (r10 == 0) goto L_0x00e4
            int r6 = r13.A00
            int r5 = r13.A02
            r4 = r7[r12]
            r9 = r4
            r3 = 1
            r2 = r7[r11]
            r8 = r2
            r1 = 0
        L_0x005d:
            if (r4 >= r5) goto L_0x0073
            if (r2 >= r6) goto L_0x0073
            boolean r0 = r13.A03(r4, r2)
            if (r3 == r0) goto L_0x006e
            int r1 = r1 + 1
            r0 = 5
            if (r1 == r0) goto L_0x0073
            r3 = r3 ^ 1
        L_0x006e:
            int r4 = r4 + 1
            int r2 = r2 + 1
            goto L_0x005d
        L_0x0073:
            if (r4 == r5) goto L_0x00e4
            if (r2 == r6) goto L_0x00e4
            int r4 = r4 - r9
            float r7 = (float) r4
            r0 = 1088421888(0x40e00000, float:7.0)
            float r7 = r7 / r0
            r2 = r10[r11]
            r3 = r10[r12]
            if (r9 >= r3) goto L_0x00e4
            if (r8 >= r2) goto L_0x00e4
            int r1 = r2 - r8
            int r0 = r3 - r9
            if (r1 == r0) goto L_0x008e
            int r3 = r9 + r1
            if (r3 >= r5) goto L_0x00e4
        L_0x008e:
            int r0 = r3 - r9
            int r0 = r0 + 1
            float r0 = (float) r0
            int r6 = X.JTO.A04(r0, r7)
            int r0 = r1 + 1
            float r0 = (float) r0
            int r5 = X.JTO.A04(r0, r7)
            if (r6 <= 0) goto L_0x00e4
            if (r5 <= 0) goto L_0x00e4
            if (r5 != r6) goto L_0x00e4
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r7 / r0
            int r1 = (int) r0
            int r8 = r8 + r1
            int r9 = r9 + r1
            int r0 = r6 + -1
            float r0 = (float) r0
            float r0 = r0 * r7
            int r0 = (int) r0
            int r0 = r0 + r9
            int r0 = r0 - r3
            if (r0 <= 0) goto L_0x00b7
            if (r0 > r1) goto L_0x00e4
            int r9 = r9 - r0
        L_0x00b7:
            int r0 = r5 + -1
            float r0 = (float) r0
            float r0 = r0 * r7
            int r0 = (int) r0
            int r0 = r0 + r8
            int r0 = r0 - r2
            if (r0 <= 0) goto L_0x00c3
            if (r0 > r1) goto L_0x00e4
            int r8 = r8 - r0
        L_0x00c3:
            X.Wgz r4 = new X.Wgz
            r4.<init>(r6, r5)
            r3 = 0
        L_0x00c9:
            float r0 = (float) r3
            float r0 = r0 * r7
            int r2 = (int) r0
            int r2 = r2 + r8
            r1 = 0
        L_0x00ce:
            float r0 = (float) r1
            float r0 = r0 * r7
            int r0 = (int) r0
            int r0 = r0 + r9
            boolean r0 = r13.A03(r0, r2)
            if (r0 == 0) goto L_0x00db
            r4.A01(r1, r3)
        L_0x00db:
            int r1 = r1 + 1
            if (r1 < r6) goto L_0x00ce
            int r3 = r3 + 1
            if (r3 < r5) goto L_0x00c9
            return r4
        L_0x00e4:
            X.R7E r0 = X.R7E.A00
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18726Vz1.A00(X.Wgz):X.Wgz");
    }
}
