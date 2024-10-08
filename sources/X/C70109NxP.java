package X;

/* renamed from: X.NxP  reason: case insensitive filesystem */
public abstract class C70109NxP {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c8, code lost:
        if (r1 != 1011) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(com.instagram.common.session.UserSession r10, java.lang.Integer r11, java.lang.Integer r12, java.lang.Integer r13, java.lang.Integer r14, java.lang.Long r15, java.lang.String r16, boolean r17) {
        /*
            r9 = r16
            r0 = 5
            X.0qQ.A0B(r10, r0)
            X.5Cv r4 = X.C282375Cv.A00(r10)
            X.0qQ.A07(r4)
            r6 = 15
            if (r11 != 0) goto L_0x0013
            r6 = 13
        L_0x0013:
            if (r16 != 0) goto L_0x006e
            java.lang.String r3 = com.facebook.msys.mci.TraceLogger.createTraceIdForType(r6)
            if (r3 == 0) goto L_0x0099
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            if (r11 == 0) goto L_0x0058
            int r0 = r11.intValue()
            switch(r0) {
                case 1: goto L_0x009e;
                case 2: goto L_0x00a0;
                case 3: goto L_0x00a2;
                case 4: goto L_0x00a4;
                case 5: goto L_0x00a6;
                case 6: goto L_0x0028;
                case 7: goto L_0x00a8;
                case 8: goto L_0x00a0;
                case 9: goto L_0x00a4;
                case 10: goto L_0x00a0;
                default: goto L_0x0028;
            }
        L_0x0028:
            r5 = 0
        L_0x0029:
            long r0 = (long) r5
            X.AnonymousClass7TE.A1Y(r2, r0)
            if (r13 == 0) goto L_0x0058
            int r1 = r13.intValue()
            r0 = 1005(0x3ed, float:1.408E-42)
            if (r1 == r0) goto L_0x009a
            r0 = 1007(0x3ef, float:1.411E-42)
            if (r1 == r0) goto L_0x009a
            r0 = 1003(0x3eb, float:1.406E-42)
            if (r1 == r0) goto L_0x009a
            r0 = 1011(0x3f3, float:1.417E-42)
            if (r1 == r0) goto L_0x009a
            r0 = 1002(0x3ea, float:1.404E-42)
            if (r1 != r0) goto L_0x0058
            r0 = 70540(0x1138c, float:9.8848E-41)
        L_0x004a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x0058
            int r0 = r0.intValue()
            long r0 = (long) r0
            X.AnonymousClass7TE.A1Y(r2, r0)
        L_0x0058:
            if (r17 == 0) goto L_0x006a
            r0 = 50301(0xc47d, double:2.4852E-319)
            X.AnonymousClass7TE.A1Y(r2, r0)
            if (r14 == 0) goto L_0x006a
            int r0 = r14.intValue()
            long r0 = (long) r0
            X.AnonymousClass7TE.A1Y(r2, r0)
        L_0x006a:
            r4.A04(r2, r6, r3)
            r9 = r3
        L_0x006e:
            if (r12 == 0) goto L_0x0077
            r2 = 0
            r1 = 1003(0x3eb, float:1.406E-42)
            r0 = 0
            X.C282375Cv.A03(r9, r2, r6, r1, r0)
        L_0x0077:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320644342096566(0x81096f000622b6, double:3.0326599612131167E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
            if (r0 == 0) goto L_0x0099
            if (r15 == 0) goto L_0x0099
            X.C282375Cv.A00(r10)
            r5 = 0
            r10 = 0
            java.lang.Long[] r0 = new java.lang.Long[]{r15}
            java.util.List r11 = java.util.Arrays.asList(r0)
            r8 = 2220(0x8ac, float:3.111E-42)
            r7 = r5
            com.facebook.msys.mci.TraceLogger.logCrucialCheckpoint(r5, r6, r7, r8, r9, r10, r11)
        L_0x0099:
            return r9
        L_0x009a:
            r0 = 70541(0x1138d, float:9.8849E-41)
            goto L_0x004a
        L_0x009e:
            r5 = 1
            goto L_0x0029
        L_0x00a0:
            r5 = 2
            goto L_0x0029
        L_0x00a2:
            r5 = 3
            goto L_0x0029
        L_0x00a4:
            r5 = 4
            goto L_0x0029
        L_0x00a6:
            r5 = 5
            goto L_0x0029
        L_0x00a8:
            if (r13 == 0) goto L_0x0028
            int r1 = r13.intValue()
            r0 = 1005(0x3ed, float:1.408E-42)
            if (r1 != r0) goto L_0x00b7
            r5 = 70520(0x11378, float:9.882E-41)
            goto L_0x0029
        L_0x00b7:
            r0 = 1007(0x3ef, float:1.411E-42)
            if (r1 == r0) goto L_0x00cc
            r0 = 1003(0x3eb, float:1.406E-42)
            if (r1 == r0) goto L_0x00cc
            r0 = 1002(0x3ea, float:1.404E-42)
            if (r1 == r0) goto L_0x00cc
            r0 = 1011(0x3f3, float:1.417E-42)
            r5 = 70522(0x1137a, float:9.8822E-41)
            if (r1 == r0) goto L_0x0029
            goto L_0x0028
        L_0x00cc:
            r5 = 70521(0x11379, float:9.8821E-41)
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70109NxP.A00(com.instagram.common.session.UserSession, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, boolean):java.lang.String");
    }
}
