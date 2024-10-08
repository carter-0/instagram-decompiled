package X;

/* renamed from: X.6g6  reason: invalid class name and case insensitive filesystem */
public final class C313226g6 {
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (r3.A0C.Aze() == null) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(com.instagram.common.session.UserSession r14, X.C255773uh r15, X.C250973mM r16, X.AnonymousClass3BQ r17, X.C316026kz r18, X.C309426Yf r19) {
        /*
            r13 = this;
            r1 = r18
            r2 = 1
            r0 = 3
            r5 = r17
            X.0qQ.A0B(r5, r0)
            r0 = 5
            X.0qQ.A0B(r14, r0)
            X.1Xj r3 = r15.A0b
            if (r3 == 0) goto L_0x0115
            boolean r0 = r3.A66()
            if (r0 != r2) goto L_0x0115
            boolean r0 = r1 instanceof X.C309406Yd
            r12 = 0
            if (r0 == 0) goto L_0x003e
            X.6Yd r1 = (X.C309406Yd) r1
            if (r1 == 0) goto L_0x003e
            X.6PJ r0 = r1.A0m
            X.3oV r0 = r0.A01
            android.view.View r0 = r0.getView()
            com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView r0 = (com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView) r0
            if (r0 == 0) goto L_0x003e
            long r0 = r0.getDurationSeconds()
            r6 = 0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x003e
            r6 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r6
            int r4 = (int) r0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
        L_0x003e:
            boolean r0 = r15.CcK()
            if (r0 == 0) goto L_0x0050
            r3.getClass()
            X.1Xy r0 = r3.A0C
            java.lang.Integer r1 = r0.Aze()
            r0 = 1
            if (r1 != 0) goto L_0x0051
        L_0x0050:
            r0 = 0
        L_0x0051:
            r11 = 5000(0x1388, float:7.006E-42)
            r9 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x00b8
            r3.getClass()
            X.1Xy r0 = r3.A0C
            java.lang.Integer r0 = r0.Aze()
            if (r0 == 0) goto L_0x00b8
            int r0 = r0.intValue()
            if (r12 == 0) goto L_0x0111
            int r7 = r12.intValue()
        L_0x006c:
            long r0 = (long) r0
            long r0 = r0 * r9
            int r6 = (int) r0
            int r8 = r7 + r6
            if (r8 > 0) goto L_0x00d5
            X.0wj r4 = X.0wj.A01
            r1 = 817903741(0x30c0387d, float:1.3985894E-9)
            java.lang.String r0 = "STORY_AD_DYNAMIC_THREAD_NEGATIVE_TIME_CHANGE"
            X.0f9 r4 = r4.AEf(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Story Ad Dynamic Thread Duration Negative Time Change: The total duration is negative (="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = "). More info: [originalDuration: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", dtdDuration: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", adId:"
            r1.append(r0)
            java.lang.String r0 = r15.A0U(r14)
            r1.append(r0)
            r0 = 93
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "message"
            r4.ABQ(r0, r1)
            r4.report()
        L_0x00b8:
            r0 = r19
            r1 = r16
            boolean r0 = X.C297785sK.A0M(r14, r15, r1, r5, r0)
            if (r0 == 0) goto L_0x00d6
            X.3yM r0 = r15.A0F()
            if (r0 == 0) goto L_0x0118
            java.lang.Integer r0 = r0.BFy()
            if (r0 == 0) goto L_0x0104
            int r0 = r0.intValue()
        L_0x00d2:
            long r0 = (long) r0
            long r0 = r0 * r9
        L_0x00d4:
            int r8 = (int) r0
        L_0x00d5:
            return r8
        L_0x00d6:
            boolean r0 = r15.A1S()
            if (r0 == 0) goto L_0x00e7
            r1 = 0
            java.lang.String r0 = "Suggested clips unit is missing suggested clips model"
            X.17k.A07(r1, r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x00e7:
            boolean r0 = r15.A1q(r14)
            if (r0 == 0) goto L_0x00f5
            r0 = 1167867904(0x459c4000, float:5000.0)
            long r0 = X.AnonymousClass4EQ.A03(r14, r15, r1, r0)
            goto L_0x00d4
        L_0x00f5:
            if (r3 == 0) goto L_0x0104
            boolean r0 = r3.A66()
            if (r0 != r2) goto L_0x0104
            if (r12 == 0) goto L_0x0104
            int r0 = r12.intValue()
            return r0
        L_0x0104:
            com.instagram.model.reels.Reel r0 = r1.A0H
            java.lang.Integer r0 = r0.A0g
            if (r0 == 0) goto L_0x0120
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x0120
            goto L_0x00d2
        L_0x0111:
            r7 = 5000(0x1388, float:7.006E-42)
            goto L_0x006c
        L_0x0115:
            r12 = 0
            goto L_0x003e
        L_0x0118:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0120:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C313226g6.A00(com.instagram.common.session.UserSession, X.3uh, X.3mM, X.3BQ, X.6kz, X.6Yf):int");
    }
}
