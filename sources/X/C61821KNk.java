package X;

import com.instagram.monetization.repository.MonetizationRepository;

/* renamed from: X.KNk  reason: case insensitive filesystem */
public final class C61821KNk extends C60276JiX {
    public final C61266K0b A00;
    public final C63635L0x A01;
    public final C50327FYh A02;
    public final MonetizationRepository A03;
    public final 1Av A04;
    public final Integer A05;
    public final String A06;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61821KNk(com.instagram.common.session.UserSession r16, X.C61266K0b r17, X.C63635L0x r18, X.C50327FYh r19, com.instagram.monetization.repository.MonetizationRepository r20, X.1Av r21, java.lang.Integer r22, java.lang.String r23, long r24) {
        /*
            r15 = this;
            r3 = 1
            r6 = r19
            r5 = r20
            r8 = r16
            X.AnonymousClass7TG.A0w(r3, r8, r6, r5)
            r10 = 9
            r4 = r21
            X.0Tu r2 = X.DbS.A0J(r4, r10)
            r0 = 36319604959616546(0x81087d00001e22, double:3.032002651547495E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            r7 = 0
            if (r0 == 0) goto L_0x0034
            r0 = 36601079936389224(0x82087d00011068, double:3.210008560267294E-306)
            long r8 = X.182.A01(r2, r8, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r1 = 0
            if (r0 == 0) goto L_0x0034
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00a5
            r7 = 1
        L_0x0034:
            r0 = r24
            r15.<init>(r0, r7)
            r0 = r18
            r15.A01 = r0
            r15.A02 = r6
            r15.A03 = r5
            r0 = r23
            r15.A06 = r0
            r0 = r22
            r15.A05 = r0
            r0 = r17
            r15.A00 = r0
            r15.A04 = r4
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.INCENTIVE_PLATFORM
            boolean r0 = r5.A04(r0)
            r1 = 0
            if (r0 != 0) goto L_0x00ad
            X.05G r5 = r15.A06
        L_0x005a:
            java.lang.Object r6 = r5.getValue()
            r4 = 0
            r0 = 2131953936(0x7f130910, float:1.9544357E38)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            r0 = 2131953937(0x7f130911, float:1.954436E38)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            r0 = 2131953938(0x7f130912, float:1.9544361E38)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            X.JwC r9 = new X.JwC
            r9.<init>(r10, r11, r12, r13, r14)
            X.0sn r0 = X.0sn.A00
            java.util.ArrayList r0 = A00(r15, r0)
            boolean r0 = X.JV5.A02(r9, r6, r0, r5, r4)
            if (r0 == 0) goto L_0x005a
            X.K0b r2 = r15.A00
            if (r2 == 0) goto L_0x00a4
            java.lang.String r0 = "not_eligible_for_monetization"
            r2.A0K(r0, r3)
            X.34p r0 = r2.A00
            r0.A03()
            java.lang.String r0 = "deal_count"
            r2.A0G(r0, r4)
            java.lang.String r0 = "within_24hr_bonus_tagging_window"
            r2.A0K(r0, r4)
            X.34p r0 = r2.A00
            r0.A08(r1)
        L_0x00a4:
            return
        L_0x00a5:
            r1 = 1
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0034
            r7 = 2
            goto L_0x0034
        L_0x00ad:
            X.K0b r0 = r15.A00
            if (r0 == 0) goto L_0x00b6
            X.34p r0 = r0.A00
            r0.A08(r1)
        L_0x00b6:
            X.6oS r1 = X.C318116oQ.A00(r15)
            r0 = 8
            X.MH9.A04(r15, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61821KNk.<init>(com.instagram.common.session.UserSession, X.K0b, X.L0x, X.FYh, com.instagram.monetization.repository.MonetizationRepository, X.1Av, java.lang.Integer, java.lang.String, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0090, code lost:
        if (r6.intValue() >= r3.intValue()) goto L_0x0092;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A00(X.C61821KNk r18, java.util.List r19) {
        /*
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            boolean r0 = r19.isEmpty()
            r2 = 1
            r3 = r0 ^ 1
            r10 = 0
            r0 = r18
            if (r3 == 0) goto L_0x00fb
            java.util.Iterator r9 = r19.iterator()
        L_0x0015:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x00e8
            java.lang.Object r5 = r9.next()
            X.Jud r5 = (X.C60981Jud) r5
            com.instagram.api.schemas.IGCreatorIncentiveProgram r3 = r5.A00
            int r7 = r3.ordinal()
            r3 = 16
            if (r7 == r3) goto L_0x007e
            r4 = 10
            java.lang.String r6 = r5.A04
            long r15 = java.lang.Long.parseLong(r6)
            java.lang.String r3 = r5.A05
            X.GKw r13 = X.JUH.A00(r3)
            java.lang.String r3 = r5.A06
            X.GKw r14 = X.JUH.A00(r3)
            if (r7 == r4) goto L_0x005e
            long r6 = java.lang.Long.parseLong(r6)
            X.0Ud r3 = r0.A07
            long r4 = X.JTT.A0A(r3)
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            boolean r17 = X.AnonymousClass7TF.A1Q(r3)
            r19 = 0
        L_0x0053:
            X.JvG r12 = new X.JvG
            r18 = r2
            r12.<init>(r13, r14, r15, r17, r18, r19)
        L_0x005a:
            r1.add(r12)
            goto L_0x0015
        L_0x005e:
            X.1Av r3 = r0.A04
            X.0xa r4 = r3.A01
            java.lang.String r3 = "reels_boost_tooltip_shown_count"
            int r4 = X.DbT.A00(r4, r3)
            r3 = 3
            boolean r19 = X.AnonymousClass7TF.A1T(r4, r3)
            long r6 = java.lang.Long.parseLong(r6)
            X.0Ud r3 = r0.A07
            long r4 = X.JTT.A0A(r3)
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            boolean r17 = X.AnonymousClass7TF.A1Q(r3)
            goto L_0x0053
        L_0x007e:
            java.lang.Integer r6 = r5.A01
            if (r6 == 0) goto L_0x0092
            java.lang.Integer r3 = r5.A02
            if (r3 == 0) goto L_0x0092
            int r4 = r6.intValue()
            int r3 = r3.intValue()
            r18 = 1
            if (r4 < r3) goto L_0x0094
        L_0x0092:
            r18 = 0
        L_0x0094:
            java.lang.String r7 = r5.A04
            long r15 = java.lang.Long.parseLong(r7)
            java.lang.String r3 = r5.A05
            X.GKw r13 = X.JUH.A00(r3)
            java.lang.Integer r3 = r5.A02
            if (r6 == 0) goto L_0x00e1
            if (r3 == 0) goto L_0x00e1
            int r4 = r6.intValue()
            int r6 = r3.intValue()
            r3 = 0
            if (r4 >= r6) goto L_0x00d7
            int r6 = r6 - r4
            java.lang.Object[] r5 = X.AnonymousClass7TF.A1b(r6)
            r4 = 2131820590(0x7f11002e, float:1.92739E38)
            X.H6w r3 = new X.H6w
            r3.<init>(r5, r4, r6)
        L_0x00be:
            long r7 = java.lang.Long.parseLong(r7)
            X.0Ud r4 = r0.A07
            long r5 = X.JTT.A0A(r4)
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            boolean r17 = X.AnonymousClass7TF.A1Q(r4)
            r19 = 0
            X.JvG r12 = new X.JvG
            r14 = r3
            r12.<init>(r13, r14, r15, r17, r18, r19)
            goto L_0x005a
        L_0x00d7:
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r3 = 2131953940(0x7f130914, float:1.9544365E38)
            X.GKO r3 = X.DbS.A0Q(r4, r3)
            goto L_0x00be
        L_0x00e1:
            java.lang.String r3 = ""
            X.GKw r3 = X.JUH.A00(r3)
            goto L_0x00be
        L_0x00e8:
            X.JvG r6 = X.C60276JiX.A0B
            r1.add(r6)
            X.0Ud r3 = r0.A07
            long r4 = X.JTT.A0A(r3)
            int r3 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            boolean r3 = X.AnonymousClass7TF.A1Q(r3)
            r6.A00 = r3
        L_0x00fb:
            boolean r5 = r1 instanceof java.util.Collection
            if (r5 == 0) goto L_0x013e
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x013e
        L_0x0105:
            X.JvG r3 = X.C60276JiX.A0B
            r3.A00 = r2
            X.05G r4 = r0.A03
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            r4.Epw(r3)
        L_0x0112:
            if (r5 == 0) goto L_0x0120
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x0120
        L_0x011a:
            X.05G r0 = r0.A05
            X.AnonymousClass7TF.A1O(r0, r2)
            return r1
        L_0x0120:
            java.util.Iterator r4 = r1.iterator()
        L_0x0124:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x011a
            java.lang.Object r3 = r4.next()
            X.JvG r3 = (X.C61016JvG) r3
            boolean r3 = r3.A05
            if (r3 == 0) goto L_0x0124
            X.K0b r4 = r0.A00
            if (r4 == 0) goto L_0x011a
            java.lang.String r3 = "tooltip_should_be_shown"
            r4.A0K(r3, r2)
            goto L_0x011a
        L_0x013e:
            java.util.Iterator r4 = r1.iterator()
        L_0x0142:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x0105
            java.lang.Object r3 = r4.next()
            X.JvG r3 = (X.C61016JvG) r3
            boolean r3 = r3.A00
            if (r3 == 0) goto L_0x0142
            goto L_0x0112
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61821KNk.A00(X.KNk, java.util.List):java.util.ArrayList");
    }
}
