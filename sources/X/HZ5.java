package X;

public abstract class HZ5 {
    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r4 == false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        if (r4 == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0091, code lost:
        if ((r26 & 16) != 0) goto L_0x0093;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r20, androidx.compose.ui.Modifier r21, X.AnonymousClass5Z4 r22, int r23, int r24, int r25, int r26, long r27) {
        /*
            r8 = r27
            r15 = r22
            r13 = r21
            r0 = -829914416(0xffffffffce8882d0, float:-1.14513715E9)
            r12 = r20
            r12.ExV(r0)
            r2 = r26
            r0 = r26 & 1
            r11 = r23
            r3 = r25
            if (r0 == 0) goto L_0x0147
            r0 = r25 | 6
        L_0x001a:
            r1 = r26 & 2
            r10 = r24
            if (r1 == 0) goto L_0x013c
            r0 = r0 | 48
        L_0x0022:
            r5 = r26 & 4
            if (r5 == 0) goto L_0x0131
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0028:
            r1 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x003b
            r1 = r26 & 8
            if (r1 != 0) goto L_0x0038
            boolean r4 = r12.AGu(r15)
            r1 = 2048(0x800, float:2.87E-42)
            if (r4 != 0) goto L_0x003a
        L_0x0038:
            r1 = 1024(0x400, float:1.435E-42)
        L_0x003a:
            r0 = r0 | r1
        L_0x003b:
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r25
            if (r1 != 0) goto L_0x0051
            r1 = r26 & 16
            if (r1 != 0) goto L_0x004e
            boolean r4 = r12.AGt(r8)
            r1 = 16384(0x4000, float:2.2959E-41)
            if (r4 != 0) goto L_0x0050
        L_0x004e:
            r1 = 8192(0x2000, float:1.14794E-41)
        L_0x0050:
            r0 = r0 | r1
        L_0x0051:
            r4 = 46811(0xb6db, float:6.5596E-41)
            r4 = r4 & r0
            r1 = 9362(0x2492, float:1.3119E-41)
            if (r4 != r1) goto L_0x007b
            boolean r1 = r12.Bwn()
            if (r1 == 0) goto L_0x007b
            r12.Evl()
        L_0x0062:
            X.5Xd r1 = r12.ASQ()
            if (r1 == 0) goto L_0x007a
            X.J8u r0 = new X.J8u
            r12 = r0
            r14 = r15
            r15 = r11
            r16 = r10
            r17 = r3
            r18 = r2
            r19 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r1.A06 = r0
        L_0x007a:
            return
        L_0x007b:
            r12.Ewr()
            r1 = r25 & 1
            r4 = -57345(0xffffffffffff1fff, float:NaN)
            if (r1 == 0) goto L_0x00df
            boolean r1 = r12.Aw3()
            if (r1 != 0) goto L_0x00df
            int r0 = X.C51971G9r.A05(r12, r2, r0)
            r1 = r26 & 16
            if (r1 == 0) goto L_0x0094
        L_0x0093:
            r0 = r0 & r4
        L_0x0094:
            boolean r1 = X.C51967G9n.A1S(r12)
            if (r1 == 0) goto L_0x00a2
            r4 = -425621944(0xffffffffe6a18648, float:-3.8138903E23)
            java.lang.String r1 = "com.instagram.creator.achievements.modules.views.TextProgress (TextProgress.kt:34)"
            X.0fL.A01(r4, r1)
        L_0x00a2:
            android.content.res.Resources r6 = X.C51975G9x.A0B(r12)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            X.0qQ.A0A(r6)
            r1 = 0
            r5 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r7 = X.C253673rC.A04(r6, r4, r5, r1, r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            java.lang.String r6 = X.C253673rC.A04(r6, r4, r5, r1, r1)
            r17 = 0
            X.6Bd r5 = X.C51969G9p.A0b()
            r23 = 0
            X.5ZD r20 = X.AnonymousClass5ZD.A01
            r22 = 65531(0xfffb, float:9.1828E-41)
            X.5ZB r4 = new X.5ZB
            r18 = r17
            r19 = r17
            r21 = r17
            r25 = r23
            r27 = r23
            r16 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r25, r27)
            int r4 = r5.A00(r4)
            goto L_0x00f6
        L_0x00df:
            if (r5 == 0) goto L_0x00e3
            X.5Qk r13 = androidx.compose.ui.Modifier.A00
        L_0x00e3:
            r1 = r26 & 8
            if (r1 == 0) goto L_0x00ed
            X.5Z4 r15 = X.C51966G9m.A0b(r12)
            r0 = r0 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00ed:
            r1 = r26 & 16
            if (r1 == 0) goto L_0x0094
            long r8 = X.C51966G9m.A0M(r12)
            goto L_0x0093
        L_0x00f6:
            r5.A09(r7)     // Catch:{ all -> 0x0156 }
            r5.A04(r4)
            java.lang.String r4 = "/"
            r5.A09(r4)
            r5.A09(r6)
            X.5Tq r14 = r5.A02()
            r16 = 3
            int r4 = r0 >> 3
            r19 = r4 & 112(0x70, float:1.57E-43)
            int r4 = r0 >> 6
            r4 = r4 & 896(0x380, float:1.256E-42)
            r19 = r19 | r4
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r21 = 24440(0x5f78, float:3.4248E-41)
            r18 = r1
            r22 = r8
            r17 = r1
            r20 = r0
            X.AnonymousClass5ZZ.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0062
            r0 = 1251410539(0x4a97026b, float:4948277.5)
            X.0fL.A00(r0)
            goto L_0x0062
        L_0x0131:
            r1 = r3 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L_0x0028
            int r1 = X.G9t.A0Q(r12, r13)
            r0 = r0 | r1
            goto L_0x0028
        L_0x013c:
            r1 = r25 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x0022
            int r1 = X.G9t.A06(r12, r10)
            r0 = r0 | r1
            goto L_0x0022
        L_0x0147:
            r0 = r25 & 14
            if (r0 != 0) goto L_0x0153
            int r0 = X.G9t.A05(r12, r11)
            r0 = r0 | r25
            goto L_0x001a
        L_0x0153:
            r0 = r3
            goto L_0x001a
        L_0x0156:
            r0 = move-exception
            r5.A04(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HZ5.A00(X.5Wy, androidx.compose.ui.Modifier, X.5Z4, int, int, int, int, long):void");
    }
}
