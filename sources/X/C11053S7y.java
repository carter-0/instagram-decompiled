package X;

/* renamed from: X.S7y  reason: case insensitive filesystem */
public abstract class C11053S7y {
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004f, code lost:
        if (r2 != 3) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C11389SRd r9, X.C13900TjN[] r10, long r11) {
        /*
        L_0x0000:
            int r5 = r9.A00
            int r0 = r9.A01
            int r0 = r5 - r0
            r4 = 1
            if (r0 <= r4) goto L_0x0084
            r3 = 0
        L_0x000a:
            int r0 = r9.A01
            int r0 = r5 - r0
            if (r0 != 0) goto L_0x007a
            r3 = -1
        L_0x0011:
            r2 = 0
        L_0x0012:
            int r0 = r9.A01
            int r0 = r5 - r0
            if (r0 != 0) goto L_0x0070
            r2 = -1
        L_0x0019:
            int r1 = r9.A01
            int r8 = r1 + r2
            r0 = -1
            if (r2 == r0) goto L_0x0066
            int r5 = r5 - r1
            if (r2 > r5) goto L_0x0066
            r0 = 4
            if (r3 != r0) goto L_0x0060
            r0 = 8
            if (r2 < r0) goto L_0x0060
            int r7 = r9.A05()
            int r6 = r9.A08()
            r5 = 49
            if (r6 != r5) goto L_0x0064
            int r3 = r9.A01()
        L_0x003a:
            int r2 = r9.A05()
            r1 = 47
            if (r6 != r1) goto L_0x0045
            r9.A0P(r4)
        L_0x0045:
            r0 = 181(0xb5, float:2.54E-43)
            if (r7 != r0) goto L_0x0051
            if (r6 == r5) goto L_0x004d
            if (r6 != r1) goto L_0x0051
        L_0x004d:
            r0 = 3
            r1 = 1
            if (r2 == r0) goto L_0x0052
        L_0x0051:
            r1 = 0
        L_0x0052:
            if (r6 != r5) goto L_0x005b
            r0 = 1195456820(0x47413934, float:49465.203)
            if (r3 == r0) goto L_0x005a
            r4 = 0
        L_0x005a:
            r1 = r1 & r4
        L_0x005b:
            if (r1 == 0) goto L_0x0060
            A01(r9, r10, r11)
        L_0x0060:
            r9.A0O(r8)
            goto L_0x0000
        L_0x0064:
            r3 = 0
            goto L_0x003a
        L_0x0066:
            java.lang.String r1 = "CeaUtil"
            java.lang.String r0 = "Skipping remainder of malformed SEI NAL unit."
            X.STH.A03(r1, r0)
            int r8 = r9.A00
            goto L_0x0060
        L_0x0070:
            int r1 = r9.A05()
            int r2 = r2 + r1
            r0 = 255(0xff, float:3.57E-43)
            if (r1 == r0) goto L_0x0012
            goto L_0x0019
        L_0x007a:
            int r1 = r9.A05()
            int r3 = r3 + r1
            r0 = 255(0xff, float:3.57E-43)
            if (r1 == r0) goto L_0x000a
            goto L_0x0011
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11053S7y.A00(X.SRd, X.TjN[], long):void");
    }

    public static void A01(C11389SRd sRd, C13900TjN[] tjNArr, long j) {
        int A05 = sRd.A05();
        if ((A05 & 64) != 0) {
            sRd.A0P(1);
            int i = (A05 & 31) * 3;
            int i2 = sRd.A01;
            for (C13900TjN tjN : tjNArr) {
                sRd.A0O(i2);
                tjN.EJf(sRd, i);
                C11366SPh.A02(AnonymousClass7TF.A1P((j > -9223372036854775807L ? 1 : (j == -9223372036854775807L ? 0 : -1))));
                tjN.EJm((S4h) null, 1, i, 0, j);
            }
        }
    }
}
