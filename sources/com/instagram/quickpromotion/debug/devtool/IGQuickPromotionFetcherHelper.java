package com.instagram.quickpromotion.debug.devtool;

public final class IGQuickPromotionFetcherHelper {
    /* JADX WARNING: type inference failed for: r9v1, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: type inference failed for: r9v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e2, code lost:
        r15 = r6.A06;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(android.content.Context r21, com.instagram.common.session.UserSession r22, com.instagram.quickpromotion.debug.devtool.IGQuickPromotionFetcherHelper r23, com.instagram.quickpromotion.intf.QuickPromotionSlot r24, java.util.Map r25, X.AnonymousClass4D7 r26) {
        /*
            r4 = r23
            r5 = r24
            r6 = r22
            r7 = r25
            r3 = 28
            r8 = r26
            boolean r0 = X.ME0.A02(r3, r8)
            if (r0 == 0) goto L_0x0077
            r9 = r8
            X.ME0 r9 = (X.ME0) r9
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0077
            int r2 = r2 - r1
            r9.A00 = r2
        L_0x0020:
            java.lang.Object r1 = r9.A05
            X.1Hj r8 = X.1Hj.A02
            int r0 = r9.A00
            r10 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 != r10) goto L_0x015c
            java.lang.Object r7 = r9.A04
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r6 = r9.A03
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            java.lang.Object r5 = r9.A02
            com.instagram.quickpromotion.intf.QuickPromotionSlot r5 = (com.instagram.quickpromotion.intf.QuickPromotionSlot) r5
            java.lang.Object r4 = r9.A01
            X.0eS.A00(r1)
        L_0x003c:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0141
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r9 = r1.A00
            X.4W5 r9 = (X.AnonymousClass4W5) r9
            monitor-enter(r4)
            goto L_0x007d
        L_0x004a:
            X.0eS.A00(r1)
            if (r21 == 0) goto L_0x0075
            android.util.DisplayMetrics r0 = X.AnonymousClass7TF.A0E(r21)
            float r0 = r0.density
            double r0 = (double) r0
            double r2 = java.lang.Math.ceil(r0)
            int r1 = (int) r2
        L_0x005b:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.1OC r1 = X.C49842F9h.A00(r6, r5, r0, r1)
            r9.A01 = r4
            r9.A02 = r5
            r9.A03 = r6
            r9.A04 = r7
            r9.A00 = r10
            r0 = 700377912(0x29beeb38, float:8.478499E-14)
            java.lang.Object r1 = r1.A00(r0, r9)
            if (r1 != r8) goto L_0x003c
            return r8
        L_0x0075:
            r1 = 1
            goto L_0x005b
        L_0x0077:
            X.ME0 r9 = new X.ME0
            r9.<init>(r4, r8, r3)
            goto L_0x0020
        L_0x007d:
            java.util.List r0 = X.AnonymousClass2kY.A01(r5)     // Catch:{ all -> 0x013e }
            java.util.Iterator r17 = r0.iterator()     // Catch:{ all -> 0x013e }
        L_0x0085:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x0153
            java.lang.Object r0 = r17.next()     // Catch:{ all -> 0x013e }
            X.2ka r0 = (X.C227972ka) r0     // Catch:{ all -> 0x013e }
            com.instagram.quickpromotion.intf.QuickPromotionSurface r10 = r0.A00     // Catch:{ all -> 0x013e }
            java.util.List r0 = r9.A00(r10)     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x0085
            java.util.List r1 = r9.A00(r10)     // Catch:{ all -> 0x013e }
            int r0 = r10.A00     // Catch:{ all -> 0x013e }
            java.lang.String r8 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x013e }
            java.lang.Object r5 = r7.get(r8)     // Catch:{ all -> 0x013e }
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x013e }
            if (r5 != 0) goto L_0x00af
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x013e }
        L_0x00af:
            if (r1 == 0) goto L_0x0134
            java.util.Iterator r16 = r1.iterator()     // Catch:{ all -> 0x013e }
        L_0x00b5:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x0134
            java.lang.Object r13 = r16.next()     // Catch:{ all -> 0x013e }
            X.5Ji r13 = (X.C283795Ji) r13     // Catch:{ all -> 0x013e }
            X.5Jm r3 = r13.A02     // Catch:{ all -> 0x013e }
            X.0qQ.A07(r3)     // Catch:{ all -> 0x013e }
            java.lang.Long r0 = r13.A03     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x0131
            long r11 = r0.longValue()     // Catch:{ all -> 0x013e }
        L_0x00ce:
            X.5Jk r0 = r13.A01     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x0125
            java.lang.Long r0 = r0.A00     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x0125
            long r0 = r0.longValue()     // Catch:{ all -> 0x013e }
        L_0x00da:
            X.5Jy r2 = X.C283935Jx.A03     // Catch:{ all -> 0x013e }
            X.5Jx r11 = r2.A00()     // Catch:{ all -> 0x013e }
            if (r11 == 0) goto L_0x00ec
            java.lang.String r15 = r6.A06     // Catch:{ all -> 0x013e }
            java.lang.String r2 = r3.A05     // Catch:{ all -> 0x013e }
            X.4VB r14 = r11.A00(r15, r2)     // Catch:{ all -> 0x013e }
            if (r14 != 0) goto L_0x00f5
        L_0x00ec:
            java.lang.String r15 = r6.A06     // Catch:{ all -> 0x013e }
            java.lang.String r2 = r3.A05     // Catch:{ all -> 0x013e }
            X.4VB r14 = new X.4VB     // Catch:{ all -> 0x013e }
            r14.<init>(r15, r2, r0)     // Catch:{ all -> 0x013e }
        L_0x00f5:
            X.5Jm r12 = r13.A02     // Catch:{ all -> 0x013e }
            X.0qQ.A07(r12)     // Catch:{ all -> 0x013e }
            java.util.List r2 = r12.A06     // Catch:{ all -> 0x013e }
            if (r2 == 0) goto L_0x0139
            java.lang.Object r11 = X.AnonymousClass7TE.A13(r2)     // Catch:{ all -> 0x013e }
            X.4V7 r11 = (X.AnonymousClass4V7) r11     // Catch:{ all -> 0x013e }
            int r3 = r13.A00     // Catch:{ all -> 0x013e }
            boolean r2 = r13.A04     // Catch:{ all -> 0x013e }
            r22 = r15
            r23 = r3
            r24 = r0
            r26 = r2
            r19 = r11
            r20 = r12
            r21 = r14
            r18 = r10
            X.4UC r1 = X.AnonymousClass5K3.A01(r18, r19, r20, r21, r22, r23, r24, r26)     // Catch:{ all -> 0x013e }
            X.4VQ r0 = new X.4VQ     // Catch:{ all -> 0x013e }
            r0.<init>(r1)     // Catch:{ all -> 0x013e }
            r5.add(r0)     // Catch:{ all -> 0x013e }
            goto L_0x00b5
        L_0x0125:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x013e }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x013e }
            long r0 = r2.toSeconds(r0)     // Catch:{ all -> 0x013e }
            long r0 = r0 + r11
            goto L_0x00da
        L_0x0131:
            r11 = 0
            goto L_0x00ce
        L_0x0134:
            r7.put(r8, r5)     // Catch:{ all -> 0x013e }
            goto L_0x0085
        L_0x0139:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()     // Catch:{ all -> 0x013e }
            throw r0     // Catch:{ all -> 0x013e }
        L_0x013e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0141:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0157
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r0 = r1.A00
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "ERROR:QP_IG_DEV_TOOL"
            X.0KC.A0C(r0, r1)
            goto L_0x0154
        L_0x0153:
            monitor-exit(r4)
        L_0x0154:
            X.0gF r8 = X.C60340gF.A00
            return r8
        L_0x0157:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x015c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quickpromotion.debug.devtool.IGQuickPromotionFetcherHelper.A00(android.content.Context, com.instagram.common.session.UserSession, com.instagram.quickpromotion.debug.devtool.IGQuickPromotionFetcherHelper, com.instagram.quickpromotion.intf.QuickPromotionSlot, java.util.Map, X.4D7):java.lang.Object");
    }
}
