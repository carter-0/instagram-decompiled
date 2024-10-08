package X;

import java.util.Map;

/* renamed from: X.9HX  reason: invalid class name */
public abstract class AnonymousClass9HX {
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0148, code lost:
        if (r1 != true) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01bd, code lost:
        if (r0.isRestricted() != true) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (r11.BHS() != 0) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01d1, code lost:
        if (r0.CPV() != true) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        if (r0.isRestricted() != true) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        if (r0.CPV() != true) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0128, code lost:
        if (r1 == 29) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(com.instagram.common.session.UserSession r10, X.AnonymousClass2Ep r11, X.AnonymousClass9HZ r12) {
        /*
            r5 = 0
            r4 = 1
            r7 = 2
            X.0qQ.A0B(r12, r7)
            r0 = r11
            X.3U9 r0 = (X.AnonymousClass3U9) r0
            X.3S9 r6 = r0.A01
            X.3Tg r3 = r6.A0u
            if (r3 != 0) goto L_0x0010
            return r5
        L_0x0010:
            boolean r2 = r12 instanceof X.C376259Hg
            if (r2 == 0) goto L_0x01dc
            X.0qQ.A0B(r10, r5)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36316486813880727(0x8105a700081197, double:3.0300307236283977E-306)
        L_0x001e:
            boolean r0 = X.182.A06(r8, r10, r0)
            if (r0 != 0) goto L_0x026c
            if (r2 == 0) goto L_0x00b2
            int r0 = r11.C6a()
            r9 = 0
            r2 = 29
            if (r0 == r2) goto L_0x0036
            int r0 = r11.BHS()
            r8 = 1
            if (r0 == 0) goto L_0x0037
        L_0x0036:
            r8 = 0
        L_0x0037:
            boolean r7 = r11.isPending()
            boolean r0 = r11.CUG()
            if (r0 != 0) goto L_0x004e
            com.instagram.user.model.User r0 = r11.BZK()
            if (r0 == 0) goto L_0x004e
            boolean r0 = r0.isRestricted()
            r6 = 1
            if (r0 == r4) goto L_0x004f
        L_0x004e:
            r6 = 0
        L_0x004f:
            boolean r0 = r11.CUG()
            if (r0 != 0) goto L_0x0062
            com.instagram.user.model.User r0 = r11.BZK()
            if (r0 == 0) goto L_0x0062
            boolean r0 = r0.CPV()
            r5 = 1
            if (r0 == r4) goto L_0x0063
        L_0x0062:
            r5 = 0
        L_0x0063:
            com.google.common.collect.ImmutableList r1 = X.C376259Hg.A00
            int r0 = r11.BHS()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            r3 = r0 ^ 1
            if (r8 != 0) goto L_0x00a6
            int r0 = r11.C6a()
            if (r0 != r2) goto L_0x00af
            boolean r0 = r11.COP()
            r2 = 0
            if (r0 == 0) goto L_0x0083
            r2 = 1
        L_0x0083:
            java.lang.String r0 = r11.AsX()
            if (r0 == 0) goto L_0x00a1
            java.lang.String r1 = r11.AsX()
            java.lang.String r0 = r10.A06
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00b0
            java.util.List r0 = r11.BJk()
            if (r0 == 0) goto L_0x00a1
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00b0
        L_0x00a1:
            r0 = 0
        L_0x00a2:
            if (r2 == 0) goto L_0x00af
            if (r0 == 0) goto L_0x00af
        L_0x00a6:
            if (r7 != 0) goto L_0x00af
            if (r6 != 0) goto L_0x00af
            if (r5 != 0) goto L_0x00af
            if (r3 == 0) goto L_0x00af
        L_0x00ae:
            r9 = 1
        L_0x00af:
            return r9
        L_0x00b0:
            r0 = 1
            goto L_0x00a2
        L_0x00b2:
            boolean r0 = r12 instanceof X.C376279Hi
            if (r0 == 0) goto L_0x00d9
            int r0 = r11.BHS()
            r9 = 1
            r2 = 0
            if (r0 != 0) goto L_0x00bf
            r2 = 1
        L_0x00bf:
            int r1 = r11.C6a()
            r0 = 29
            if (r1 != r0) goto L_0x00c8
            r5 = 1
        L_0x00c8:
            boolean r0 = r11.CUG()
            if (r0 == 0) goto L_0x02ed
            boolean r0 = r11.isPending()
            if (r0 != 0) goto L_0x02ed
            if (r2 == 0) goto L_0x02ed
        L_0x00d6:
            if (r5 != 0) goto L_0x02ed
            return r9
        L_0x00d9:
            boolean r0 = r12 instanceof X.C376229Hd
            if (r0 != 0) goto L_0x02e0
            boolean r0 = r12 instanceof X.C376239He
            if (r0 != 0) goto L_0x02e0
            boolean r0 = r12 instanceof X.C376249Hf
            if (r0 != 0) goto L_0x02e0
            boolean r0 = r12 instanceof X.C376219Hc
            if (r0 == 0) goto L_0x0116
            int r0 = r11.C6a()
            com.instagram.direct.capabilities.Capabilities r3 = X.C376169Gw.A00(r10, r0)
            java.lang.String r0 = r10.A06
            boolean r2 = r11.Ce4(r0)
            int r1 = r11.C6a()
            int r0 = r11.BHS()
            r9 = 1
            if (r0 != 0) goto L_0x0103
            r5 = 1
        L_0x0103:
            X.9Gx r0 = X.C376179Gx.THREAD_DETAILS_SHOW_THEME_SETTINGS
            boolean r0 = r3.A00(r0)
            if (r0 == 0) goto L_0x02ed
            boolean r0 = X.AnonymousClass7LY.A00(r1)
            if (r0 == 0) goto L_0x00af
            if (r2 == 0) goto L_0x02ed
        L_0x0113:
            if (r5 == 0) goto L_0x02ed
            return r9
        L_0x0116:
            boolean r0 = r12 instanceof X.C376309Hl
            if (r0 == 0) goto L_0x0152
            int r1 = r11.C6a()
            boolean r0 = X.AnonymousClass48O.A02(r1)
            r9 = 1
            if (r0 != 0) goto L_0x012a
            r0 = 29
            r5 = 1
            if (r1 != r0) goto L_0x012b
        L_0x012a:
            r5 = 0
        L_0x012b:
            int r0 = r11.BHS()
            r3 = 0
            if (r0 != 0) goto L_0x0133
            r3 = 1
        L_0x0133:
            boolean r2 = r11.isPending()
            boolean r0 = r11.CUG()
            if (r0 != 0) goto L_0x014a
            com.instagram.user.model.User r0 = r11.BZK()
            if (r0 == 0) goto L_0x014a
            boolean r1 = r0.isRestricted()
            r0 = 1
            if (r1 == r4) goto L_0x014b
        L_0x014a:
            r0 = 0
        L_0x014b:
            if (r3 == 0) goto L_0x02ed
            if (r2 != 0) goto L_0x02ed
            if (r0 != 0) goto L_0x02ed
            goto L_0x0113
        L_0x0152:
            boolean r0 = r12 instanceof X.C376289Hj
            if (r0 == 0) goto L_0x0189
            java.lang.String r2 = r10.A06
            int r1 = r11.C6a()
            X.3Te r0 = r6.A0s
            boolean r4 = X.C329997La.A02(r0, r2, r1)
            int r1 = r11.C6a()
            X.3Te r0 = r6.A0s
            boolean r3 = X.C329997La.A05(r0, r2, r1)
            int r1 = r11.C6a()
            X.3Te r0 = r6.A0s
            boolean r2 = X.C329997La.A06(r0, r2, r1)
            r0 = 2342159521797312942(0x208105ad000711ae, double:4.062628846975515E-152)
            boolean r0 = X.182.A06(r8, r10, r0)
            if (r4 != 0) goto L_0x00ae
            if (r2 != 0) goto L_0x00ae
            if (r3 == 0) goto L_0x02ed
            if (r0 == 0) goto L_0x02ed
            goto L_0x00ae
        L_0x0189:
            boolean r0 = r12 instanceof X.C376299Hk
            if (r0 == 0) goto L_0x019b
            int r1 = r11.C6a()
            boolean r0 = X.AnonymousClass48O.A01(r1)
            if (r0 != 0) goto L_0x02ed
            r0 = 29
            goto L_0x02ea
        L_0x019b:
            boolean r0 = r12 instanceof X.C376269Hh
            if (r0 == 0) goto L_0x00ae
            int r0 = r11.BHS()
            r9 = 1
            r3 = 0
            if (r0 != 0) goto L_0x01a8
            r3 = 1
        L_0x01a8:
            boolean r2 = r11.isPending()
            boolean r0 = r11.CUG()
            if (r0 != 0) goto L_0x01bf
            com.instagram.user.model.User r0 = r11.BZK()
            if (r0 == 0) goto L_0x01bf
            boolean r0 = r0.isRestricted()
            r1 = 1
            if (r0 == r4) goto L_0x01c0
        L_0x01bf:
            r1 = 0
        L_0x01c0:
            boolean r0 = r11.CUG()
            if (r0 != 0) goto L_0x01d3
            com.instagram.user.model.User r0 = r11.BZK()
            if (r0 == 0) goto L_0x01d3
            boolean r0 = r0.CPV()
            r5 = 1
            if (r0 == r4) goto L_0x01d4
        L_0x01d3:
            r5 = 0
        L_0x01d4:
            if (r3 == 0) goto L_0x02ed
            if (r2 != 0) goto L_0x02ed
            if (r1 != 0) goto L_0x02ed
            goto L_0x00d6
        L_0x01dc:
            boolean r0 = r12 instanceof X.C376279Hi
            if (r0 == 0) goto L_0x01ec
            X.0qQ.A0B(r10, r5)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36316486814077338(0x8105a7000b119a, double:3.030030723752735E-306)
            goto L_0x001e
        L_0x01ec:
            boolean r0 = r12 instanceof X.C376229Hd
            if (r0 == 0) goto L_0x01fc
            X.0qQ.A0B(r10, r5)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36316486813618580(0x8105a700041194, double:3.030030723462615E-306)
            goto L_0x001e
        L_0x01fc:
            boolean r0 = r12 instanceof X.C376239He
            if (r0 == 0) goto L_0x020c
            X.0qQ.A0B(r10, r5)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36316486813684117(0x8105a700051195, double:3.030030723504061E-306)
            goto L_0x001e
        L_0x020c:
            boolean r0 = r12 instanceof X.C376249Hf
            if (r0 == 0) goto L_0x021c
            X.0qQ.A0B(r10, r5)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36316486813749654(0x8105a700061196, double:3.0300307235455066E-306)
            goto L_0x001e
        L_0x021c:
            boolean r0 = r12 instanceof X.C376219Hc
            if (r0 == 0) goto L_0x022c
            X.0qQ.A0B(r10, r5)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36316486813421971(0x8105a700011193, double:3.0300307233382785E-306)
            goto L_0x001e
        L_0x022c:
            boolean r0 = r12 instanceof X.C376309Hl
            if (r0 == 0) goto L_0x023c
            X.0qQ.A0B(r10, r5)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36316486814208412(0x8105a7000d119c, double:3.030030723835627E-306)
            goto L_0x001e
        L_0x023c:
            boolean r0 = r12 instanceof X.C376289Hj
            if (r0 == 0) goto L_0x024c
            X.0qQ.A0B(r10, r5)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36316486814011801(0x8105a7000a1199, double:3.0300307237112894E-306)
            goto L_0x001e
        L_0x024c:
            boolean r0 = r12 instanceof X.C376299Hk
            if (r0 == 0) goto L_0x025c
            X.0qQ.A0B(r10, r5)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36316486814142875(0x8105a7000c119b, double:3.030030723794181E-306)
            goto L_0x001e
        L_0x025c:
            boolean r0 = r12 instanceof X.C376269Hh
            if (r0 == 0) goto L_0x026c
            X.0qQ.A0B(r10, r5)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36316486813946264(0x8105a700091198, double:3.0300307236698435E-306)
            goto L_0x001e
        L_0x026c:
            X.7Ly r6 = com.facebook.xapp.messaging.capability.vector.Capabilities.A01
            long[] r2 = new long[r7]
            long r0 = r3.A00
            r2[r5] = r0
            long r0 = r3.A01
            r2[r4] = r0
            com.facebook.xapp.messaging.capability.vector.Capabilities r3 = r6.A00(r2)
            boolean r0 = r12 instanceof X.C376319Hm
            if (r0 == 0) goto L_0x029c
            X.0qQ.A0B(r3, r4)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319407397346669(0x81084f005f1d6d, double:3.031877712372505E-306)
            boolean r0 = X.182.A06(r2, r10, r0)
            if (r0 == 0) goto L_0x02ed
        L_0x0290:
            int r1 = r12.A00
            java.util.BitSet r0 = r3.A00
            boolean r0 = r0.get(r1)
        L_0x0298:
            r9 = 1
            if (r0 != 0) goto L_0x00af
            goto L_0x02ed
        L_0x029c:
            boolean r0 = r12 instanceof X.AnonymousClass9HY
            if (r0 == 0) goto L_0x02aa
            X.0qQ.A0B(r3, r4)
            int r0 = r11.BHS()
            if (r0 != 0) goto L_0x02ed
            goto L_0x0290
        L_0x02aa:
            boolean r0 = r12 instanceof X.C376199Ha
            if (r0 == 0) goto L_0x02c7
            X.0qQ.A0B(r3, r4)
            int r1 = r12.A00
            java.util.BitSet r0 = r3.A00
            boolean r0 = r0.get(r1)
            if (r0 == 0) goto L_0x02ed
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318230570080266(0x81073d0000180a, double:3.031133482070529E-306)
        L_0x02c2:
            boolean r0 = X.182.A06(r2, r10, r0)
            goto L_0x0298
        L_0x02c7:
            boolean r2 = r12 instanceof X.C376329Hn
            X.0qQ.A0B(r3, r4)
            int r1 = r12.A00
            java.util.BitSet r0 = r3.A00
            if (r2 == 0) goto L_0x02ef
            boolean r0 = r0.get(r1)
            if (r0 == 0) goto L_0x02ed
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319407397018984(0x81084f005a1d68, double:3.031877712165276E-306)
            goto L_0x02c2
        L_0x02e0:
            int r1 = r11.C6a()
            r0 = 1012(0x3f4, float:1.418E-42)
            if (r1 == r0) goto L_0x02ed
            r0 = 1014(0x3f6, float:1.421E-42)
        L_0x02ea:
            r9 = 1
            if (r1 != r0) goto L_0x00af
        L_0x02ed:
            r9 = 0
            return r9
        L_0x02ef:
            boolean r9 = r0.get(r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9HX.A01(com.instagram.common.session.UserSession, X.2Ep, X.9HZ):boolean");
    }

    public static final Map A00() {
        0eP[] r60 = new 0eP[44];
        0eP r0 = new 0eP(12, new AnonymousClass9HY());
        0eP r02 = new 0eP(24, new C376199Ha());
        0eP r03 = new 0eP(42, new C376209Hb(42, "CanCustomReact", true));
        0eP r04 = new 0eP(14, new C376219Hc());
        0eP r05 = new 0eP(44, new C376209Hb(44, "CanViewComments", false));
        0eP r5 = new 0eP(45, new C376209Hb(45, "CanToggleCommentsControl", false));
        0eP r34 = r02;
        0eP r35 = r03;
        0eP r36 = r04;
        0eP r37 = r05;
        0eP r38 = r5;
        System.arraycopy(new 0eP[]{r0, r34, r35, r36, r37, r38, new 0eP(46, new C376209Hb(46, "CanAddComments", false)), new 0eP(47, new C376209Hb(47, "CanDeleteOwnComments", false)), new 0eP(48, new C376209Hb(48, "canDeleteOtherComments", false)), new 0eP(6, new C376209Hb(6, "CanCreateQuestionPrompt", false)), new 0eP(50, new C376209Hb(50, "CanInviteCollaborator", true)), new 0eP(53, new C376209Hb(53, "CanSendAiStickers", false)), new 0eP(8, new C376209Hb(8, "CanCreateAddYours", true)), new 0eP(49, new C376209Hb(49, "CanSeeCommentsUpsell", false)), new 0eP(56, new C376229Hd()), new 0eP(60, new C376239He()), new 0eP(57, new C376249Hf()), new 0eP(61, new C376209Hb(61, "CanCreateEvent", false)), new 0eP(5, new C376209Hb(5, "CanForwardMessage", true)), new 0eP(34, new C376209Hb(34, "CanAddModerators", false)), new 0eP(40, new C376209Hb(40, "CanXpostToFbChannels", false)), new 0eP(25, new C376259Hg()), new 0eP(26, new C376269Hh()), new 0eP(27, new C376279Hi()), new 0eP(28, new C376289Hj()), new 0eP(51, new C376209Hb(51, "CanCreateWelcomeVideo", false)), new 0eP(7, new C376209Hb(7, "CanDeletePromptAndResponse", false))}, 0, r60, 0, 27);
        0eP r06 = new 0eP(59, new C376209Hb(59, "CanShareLocation", false));
        0eP r07 = new 0eP(33, new C376299Hk());
        0eP r08 = new 0eP(30, new C376309Hl());
        0eP r09 = new 0eP(9, new C376209Hb(9, "CanRemoveOtherUsersMessages", false));
        0eP r010 = new 0eP(54, new C376209Hb(54, "CanDeleteMessagesForYou", false));
        0eP r12 = new 0eP(37, new C376319Hm());
        0eP r23 = r06;
        0eP r24 = r07;
        0eP r25 = r08;
        0eP r26 = r09;
        0eP r27 = r010;
        0eP r28 = r12;
        System.arraycopy(new 0eP[]{r23, r24, r25, r26, r27, r28, new 0eP(52, new C376209Hb(52, "CanWriteWithAI", false)), new 0eP(35, new C376329Hn()), new 0eP(55, new C376209Hb(55, "CanSendFile", false)), new 0eP(22, new C376209Hb(22, "CanCreateChallenge", false)), new 0eP(23, new C376209Hb(23, "CanConsumeChallenge", false)), new 0eP(65, new C376209Hb(65, "CanCreateFFAddYoursPrompt", false)), new 0eP(66, new C376209Hb(66, "CanAddOrDeleteDailyPrompt", false)), new 0eP(67, new C376209Hb(67, "CanAddDailyPromptSubmission", false)), new 0eP(68, new C376209Hb(68, "CanDeleteOthersDailyPromptSubmission", false)), new 0eP(69, new C376209Hb(69, "CanStartBlend", false)), new 0eP(71, new C376209Hb(71, "CanSeeBlendEntrypoint", false))}, 0, r60, 27, 17);
        return 0Yt.A06(r60);
    }
}
