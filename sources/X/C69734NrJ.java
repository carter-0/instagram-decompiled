package X;

/* renamed from: X.NrJ  reason: case insensitive filesystem */
public abstract class C69734NrJ {
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0093, code lost:
        if ((r15.size() % 2) != 1) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b4, code lost:
        if (r20 == false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bf, code lost:
        if (r20 == false) goto L_0x00c1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.N48 A00(com.facebook.rtc.views.omnigrid.GridLayoutInput r39) {
        /*
            r33 = 0
            java.lang.String r1 = "computeDefaultLayout"
            r0 = -1596681157(0xffffffffa0d4943b, float:-3.6012288E-19)
            X.0fh.A01(r1, r0)
            r4 = r39
            java.util.List r15 = r4.items     // Catch:{ all -> 0x0152 }
            int r12 = r4.width     // Catch:{ all -> 0x0152 }
            int r7 = r4.height     // Catch:{ all -> 0x0152 }
            r9 = 1
            boolean r13 = X.C51970G9q.A1W(r7, r12)
            int r8 = r15.size()     // Catch:{ all -> 0x0152 }
            r2 = 2
            r6 = 2
            if (r8 != r2) goto L_0x0020
            r6 = 1
        L_0x0020:
            r5 = 4
            if (r8 != r2) goto L_0x0028
            r0 = 2
        L_0x0024:
            if (r13 != 0) goto L_0x0030
            r6 = r0
            goto L_0x0030
        L_0x0028:
            int r0 = r8 + 1
            int r0 = r0 / r2
            int r0 = java.lang.Math.min(r0, r5)     // Catch:{ all -> 0x0152 }
            goto L_0x0024
        L_0x0030:
            float r1 = (float) r8     // Catch:{ all -> 0x0152 }
            float r0 = (float) r6     // Catch:{ all -> 0x0152 }
            float r1 = r1 / r0
            double r0 = (double) r1     // Catch:{ all -> 0x0152 }
            double r0 = java.lang.Math.ceil(r0)     // Catch:{ all -> 0x0152 }
            float r3 = (float) r0     // Catch:{ all -> 0x0152 }
            int r1 = (int) r3     // Catch:{ all -> 0x0152 }
            if (r13 != 0) goto L_0x003d
            r5 = 2
        L_0x003d:
            int r11 = java.lang.Math.min(r1, r5)     // Catch:{ all -> 0x0152 }
            com.facebook.rtc.views.omnigrid.GridLayoutConfigForLayoutInput r5 = r4.config     // Catch:{ all -> 0x0152 }
            int r10 = r5.verticalSpacing     // Catch:{ all -> 0x0152 }
            int r0 = r5.horizontalSpacing     // Catch:{ all -> 0x0152 }
            r28 = 0
            if (r1 <= r11) goto L_0x004d
            r28 = 2
        L_0x004d:
            if (r10 != 0) goto L_0x0052
            if (r0 != 0) goto L_0x0052
            goto L_0x0057
        L_0x0052:
            r23 = 0
            java.lang.Integer r32 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0152 }
            goto L_0x005d
        L_0x0057:
            java.lang.Integer r23 = java.lang.Integer.valueOf(r33)     // Catch:{ all -> 0x0152 }
            java.lang.Integer r32 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0152 }
        L_0x005d:
            int r1 = r5.leftPadding     // Catch:{ all -> 0x0152 }
            int r22 = r12 - r1
            int r1 = r5.rightPadding     // Catch:{ all -> 0x0152 }
            int r22 = r22 - r1
            int r4 = r6 + -1
            int r0 = r0 * r4
            int r22 = r22 - r0
            int r22 = r22 / r6
            r1 = 8
            if (r8 <= r1) goto L_0x0088
            int r0 = r5.itemHeightOffset     // Catch:{ all -> 0x0152 }
        L_0x0072:
            int r21 = r7 - r0
            int r3 = r5.topPadding     // Catch:{ all -> 0x0152 }
            int r21 = r21 - r3
            int r0 = r5.bottomPadding     // Catch:{ all -> 0x0152 }
            int r21 = r21 - r0
            int r0 = r11 + -1
            int r0 = r0 * r10
            int r21 = r21 - r0
            int r21 = r21 / r11
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x0152 }
            goto L_0x008a
        L_0x0088:
            r0 = 0
            goto L_0x0072
        L_0x008a:
            if (r8 >= r1) goto L_0x0095
            int r0 = r15.size()     // Catch:{ all -> 0x0152 }
            int r0 = r0 % r2
            r20 = 1
            if (r0 == r9) goto L_0x0097
        L_0x0095:
            r20 = 0
        L_0x0097:
            java.util.Iterator r19 = r15.iterator()     // Catch:{ all -> 0x0152 }
            r2 = 0
        L_0x009c:
            boolean r0 = r19.hasNext()     // Catch:{ all -> 0x0152 }
            if (r0 == 0) goto L_0x012c
            int r18 = r2 + 1
            java.lang.Object r8 = r19.next()     // Catch:{ all -> 0x0152 }
            com.facebook.rtc.views.omnigrid.GridLayoutInputItem r8 = (com.facebook.rtc.views.omnigrid.GridLayoutInputItem) r8     // Catch:{ all -> 0x0152 }
            int r0 = X.C51966G9m.A06(r15)     // Catch:{ all -> 0x0152 }
            if (r2 != r0) goto L_0x00b6
            if (r13 == 0) goto L_0x00b6
            r17 = 1
            if (r20 != 0) goto L_0x00b8
        L_0x00b6:
            r17 = 0
        L_0x00b8:
            if (r2 != r4) goto L_0x00c1
            if (r13 != 0) goto L_0x00c1
            r16 = 0
            r14 = 1
            if (r20 != 0) goto L_0x00c4
        L_0x00c1:
            r16 = r13
            r14 = 0
        L_0x00c4:
            int r1 = r2 % r6
            int r0 = r5.leftPadding     // Catch:{ all -> 0x0152 }
            int r10 = r5.horizontalSpacing     // Catch:{ all -> 0x0152 }
            int r13 = r22 + r10
            int r13 = r13 * r1
            int r0 = r0 + r13
            int r37 = r0 + r22
            if (r17 == 0) goto L_0x00d8
            int r13 = r22 * 2
            int r37 = r0 + r13
            int r37 = r37 + r10
        L_0x00d8:
            if (r14 == 0) goto L_0x00e3
            int r38 = r21 * 2
            int r38 = r38 + r3
            int r10 = r5.verticalSpacing     // Catch:{ all -> 0x0152 }
            int r38 = r38 + r10
            goto L_0x00e5
        L_0x00e3:
            int r38 = r3 + r21
        L_0x00e5:
            if (r17 == 0) goto L_0x00e8
            goto L_0x00f5
        L_0x00e8:
            if (r1 != 0) goto L_0x00ed
            java.lang.Integer r31 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0152 }
            goto L_0x00f7
        L_0x00ed:
            if (r1 != r4) goto L_0x00f2
            java.lang.Integer r31 = X.AnonymousClass05K.A0Y     // Catch:{ all -> 0x0152 }
            goto L_0x00f7
        L_0x00f2:
            java.lang.Integer r31 = X.AnonymousClass05K.A0u     // Catch:{ all -> 0x0152 }
            goto L_0x00f7
        L_0x00f5:
            java.lang.Integer r31 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x0152 }
        L_0x00f7:
            long r13 = r8.id     // Catch:{ all -> 0x0152 }
            X.ULb r30 = new X.ULb     // Catch:{ all -> 0x0152 }
            r34 = r30
            r35 = r0
            r36 = r3
            r39 = r33
            r34.<init>(r35, r36, r37, r38, r39)     // Catch:{ all -> 0x0152 }
            X.N2s r0 = new X.N2s     // Catch:{ all -> 0x0152 }
            r29 = r0
            r34 = r13
            r36 = r33
            r29.<init>(r30, r31, r32, r33, r34, r36)     // Catch:{ all -> 0x0152 }
            r11.add(r0)     // Catch:{ all -> 0x0152 }
            int r0 = r15.size()     // Catch:{ all -> 0x0152 }
            int r0 = r0 - r9
            if (r2 != r0) goto L_0x011c
            goto L_0x0124
        L_0x011c:
            if (r1 != r4) goto L_0x0126
            int r0 = r5.verticalSpacing     // Catch:{ all -> 0x0152 }
            int r0 = r0 + r21
            int r3 = r3 + r0
            goto L_0x0126
        L_0x0124:
            int r3 = r3 + r21
        L_0x0126:
            r2 = r18
            r13 = r16
            goto L_0x009c
        L_0x012c:
            int r0 = r5.bottomPadding     // Catch:{ all -> 0x0152 }
            int r3 = r3 + r0
            if (r3 <= r7) goto L_0x0134
            int r0 = r5.bottomInset     // Catch:{ all -> 0x0152 }
            int r3 = r3 + r0
        L_0x0134:
            java.lang.Integer r21 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0152 }
            r19 = 0
            com.facebook.rtc.views.omnigrid.GridSelfViewLocation r20 = com.facebook.rtc.views.omnigrid.GridSelfViewLocation.TOP_RIGHT     // Catch:{ all -> 0x0152 }
            X.N48 r18 = new X.N48     // Catch:{ all -> 0x0152 }
            r22 = r21
            r24 = r11
            r25 = r19
            r26 = r12
            r27 = r3
            r29 = r9
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x0152 }
            r0 = 317391288(0x12eb01b8, float:1.4831009E-27)
            X.0fh.A00(r0)
            return r18
        L_0x0152:
            r1 = move-exception
            r0 = 1881868461(0x702b08ad, float:2.117297E29)
            X.0fh.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69734NrJ.A00(com.facebook.rtc.views.omnigrid.GridLayoutInput):X.N48");
    }
}
