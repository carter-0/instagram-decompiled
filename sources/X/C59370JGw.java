package X;

/* renamed from: X.JGw  reason: case insensitive filesystem */
public final class C59370JGw extends 0Yg implements 0sK {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59370JGw(Object obj, Object obj2, Object obj3, String str, int i) {
        super(3);
        this.A00 = i;
        this.A03 = obj;
        this.A01 = obj2;
        this.A04 = str;
        this.A02 = obj3;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c8, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0107, code lost:
        if (r12 == 0) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0235, code lost:
        r1.Evl();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r31, java.lang.Object r32, java.lang.Object r33) {
        /*
            r30 = this;
            r0 = r30
            r13 = r33
            r5 = r31
            r1 = r32
            int r2 = r0.A00
            switch(r2) {
                case 0: goto L_0x023a;
                case 1: goto L_0x01c2;
                case 2: goto L_0x0161;
                case 3: goto L_0x00c9;
                default: goto L_0x000d;
            }
        L_0x000d:
            X.5Wy r1 = (X.C286575Wy) r1
            int r2 = X.AnonymousClass7TE.A0M(r13)
            r3 = 0
            X.0qQ.A0B(r5, r3)
            r4 = r2 & 17
            r2 = 16
            if (r4 != r2) goto L_0x0023
            boolean r2 = r1.Bwn()
            if (r2 != 0) goto L_0x0235
        L_0x0023:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0031
            r4 = -1916288718(0xffffffff8dc7c132, float:-1.2310832E-30)
            java.lang.String r2 = "instagram.features.clips.bottomsheet.blend.ui.BlendSuggestedUsersForReelListComponent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BlendContextBottomSheetComposables.kt:151)"
            X.0fL.A01(r4, r2)
        L_0x0031:
            java.lang.Object r7 = r0.A03
            X.3lr r7 = (X.C250663lr) r7
            java.lang.String r2 = "profile_pic_url"
            java.lang.String r2 = r7.A0C(r2)
            com.instagram.common.typedurl.SimpleImageUrl r2 = X.DbS.A0V(r2)
            r10 = 0
            X.2DN r9 = X.1zC.A00(r1, r2)
            r8 = -862273014(0xffffffffcc9ac20a, float:-8.1137744E7)
            java.lang.Object r4 = r0.A02
            java.lang.String r5 = r0.A04
            r6 = 3
            X.JGo r2 = new X.JGo
            r2.<init>(r4, r9, r5, r6)
            X.5PJ r17 = X.AnonymousClass5PI.A01(r1, r2, r8)
            java.lang.String r2 = X.AnonymousClass9NF.A00()
            java.lang.String r13 = r7.A08(r2)
            if (r13 != 0) goto L_0x0061
            java.lang.String r13 = ""
        L_0x0061:
            java.lang.String r2 = "full_name"
            java.lang.String r14 = r7.A09(r2)
            r4 = 4
            r2 = 1534(0x5fe, float:2.15E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            boolean r22 = r7.getCoercedBooleanField(r4, r2)
            java.lang.String r2 = "account_badges"
            com.google.common.collect.ImmutableList r4 = r7.getCoercedCompactedIntListField(r6, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            boolean r23 = r4.contains(r2)
            r2 = -809142604(0xffffffffcfc576b4, float:-6.6257818E9)
            r1.ExS(r2)
            java.lang.Object r4 = r0.A01
            boolean r0 = r1.AGw(r4)
            boolean r2 = X.C51965G9l.A1Z(r1, r5, r0)
            java.lang.Object r0 = r1.ECw()
            if (r2 != 0) goto L_0x009a
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r0 != r2) goto L_0x00a4
        L_0x009a:
            r2 = 28
            X.Iw3 r0 = new X.Iw3
            r0.<init>(r5, r4, r2)
            r1.FLL(r0)
        L_0x00a4:
            X.0sa r0 = (X.C62320sa) r0
            X.C51965G9l.A1X(r1, r3)
            r19 = 6
            r21 = 1428(0x594, float:2.001E-42)
            r11 = r10
            r12 = r10
            r15 = r10
            r18 = r10
            r20 = r3
            r9 = r1
            r16 = r0
            X.GS8.A02(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00c6
            r0 = -935088524(0xffffffffc843ae74, float:-200377.81)
        L_0x00c3:
            X.0fL.A00(r0)
        L_0x00c6:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x00c9:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r1 = (java.lang.String) r1
            X.N49 r13 = (X.N49) r13
            r11 = 0
            X.0qQ.A0B(r5, r11)
            java.lang.String r26 = X.DbV.A0s()
            java.lang.String r9 = X.DbV.A0s()
            X.HNL r8 = X.HNL.THREADVIEW_SUGGESTED_PROMPT
            java.lang.Object r4 = r0.A03
            X.7ZX r4 = (X.AnonymousClass7ZX) r4
            com.instagram.common.session.UserSession r7 = r4.A0g
            r14 = 0
            X.N1a r6 = X.C70892OQk.A00(r8, r14, r7, r14, r9)
            X.0eM r2 = r4.A0y
            java.lang.Object r3 = r2.getValue()
            X.5D7 r3 = (X.AnonymousClass5D7) r3
            java.lang.Object r2 = r0.A01
            X.2Eq r2 = (X.2Eq) r2
            java.lang.String r20 = r2.C6C()
            if (r20 != 0) goto L_0x00fc
            java.lang.String r20 = ""
        L_0x00fc:
            java.lang.String r10 = r2.C6C()
            if (r10 == 0) goto L_0x0109
            int r12 = r10.length()
            r10 = 0
            if (r12 != 0) goto L_0x010a
        L_0x0109:
            r10 = 1
        L_0x010a:
            java.lang.Boolean r17 = X.DbT.A0l(r10)
            java.lang.String r10 = r0.A04
            r23 = 1
            r15 = r3
            r16 = r8
            r18 = r14
            r19 = r26
            r21 = r10
            r22 = r9
            r24 = r11
            r15.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.7Zi r12 = X.C333527Zh.A00(r7)
            com.instagram.model.direct.DirectThreadKey r17 = r2.BJy()
            java.lang.Object r0 = r0.A02
            X.7L5 r0 = (X.AnonymousClass7L5) r0
            if (r0 == 0) goto L_0x0134
            java.lang.String r10 = r0.A00()
        L_0x0134:
            org.json.JSONObject r0 = r6.A00
            java.lang.String r27 = java.lang.String.valueOf(r0)
            java.lang.String r23 = "none"
            r15 = r14
            r16 = r14
            r19 = r14
            r20 = r14
            r21 = r14
            r24 = r10
            r25 = r1
            r28 = r11
            r29 = r11
            r22 = r5
            r12.A0D(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            X.7OC r1 = r4.A0A
            if (r1 == 0) goto L_0x015d
            X.0mo r0 = r4.A0R()
            r0.A08(r1)
        L_0x015d:
            r4.A0A = r14
            goto L_0x00c6
        L_0x0161:
            X.5Wy r1 = (X.C286575Wy) r1
            int r3 = X.AnonymousClass7TE.A0M(r13)
            r2 = 0
            X.0qQ.A0B(r5, r2)
            r4 = r3 & 81
            r3 = 16
            if (r4 != r3) goto L_0x0177
            boolean r3 = r1.Bwn()
            if (r3 != 0) goto L_0x0235
        L_0x0177:
            boolean r3 = X.0fL.A02()
            if (r3 == 0) goto L_0x0185
            r4 = -1698860682(0xffffffff9abd7176, float:-7.8351874E-23)
            java.lang.String r3 = "com.instagram.creator.achievements.modules.views.EarnedAchievementsScreen.<anonymous>.<anonymous> (EarnedAchievementsScreen.kt:28)"
            X.0fL.A01(r4, r3)
        L_0x0185:
            X.5a0 r5 = X.C287275Zs.A04
            X.5Qk r3 = androidx.compose.ui.Modifier.A00
            r17 = 1
            r6 = 0
            androidx.compose.ui.Modifier r3 = X.C51966G9m.A0T(r3)
            androidx.compose.ui.Modifier r9 = X.C287195Zj.A04(r3)
            r11 = 3
            r4 = 753971369(0x2cf0b0a9, float:6.8408235E-12)
            java.lang.Object r14 = r0.A01
            java.lang.Object r13 = r0.A03
            java.lang.Object r3 = r0.A02
            java.lang.String r0 = r0.A04
            X.JGw r12 = new X.JGw
            r15 = r3
            r16 = r0
            r12.<init>(r13, r14, r15, r16, r17)
            X.5PJ r10 = X.AnonymousClass5PI.A01(r1, r12, r4)
            r13 = 1575990(0x180c36, float:2.208432E-39)
            r14 = 52
            r7 = r6
            r8 = r1
            r12 = r2
            X.I5T.A02(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00c6
            r0 = -387331516(0xffffffffe8e9ca44, float:-8.83234E24)
            goto L_0x00c3
        L_0x01c2:
            X.5Wy r1 = (X.C286575Wy) r1
            int r3 = X.C51968G9o.A0E(r13)
            r2 = 16
            if (r3 != r2) goto L_0x01d2
            boolean r2 = r1.Bwn()
            if (r2 != 0) goto L_0x0235
        L_0x01d2:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x01e0
            r3 = -147985079(0xfffffffff72ded49, float:-3.5276565E33)
            java.lang.String r2 = "com.instagram.creator.achievements.modules.views.EarnedAchievementsScreen.<anonymous>.<anonymous>.<anonymous> (EarnedAchievementsScreen.kt:32)"
            X.0fL.A01(r3, r2)
        L_0x01e0:
            java.lang.Object r6 = r0.A01
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x022a
            java.lang.Object r5 = r0.A03
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r4 = r0.A02
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            java.lang.String r3 = r0.A04
            r0 = 1427843744(0x551b2aa0, float:1.0662961E13)
            java.util.Iterator r2 = X.C51968G9o.A17(r1, r6, r0)
        L_0x01f7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x020e
            java.lang.Object r0 = r2.next()
            com.instagram.creator.achievements.modules.models.Badge r0 = (com.instagram.creator.achievements.modules.models.Badge) r0
            r12 = 584(0x248, float:8.18E-43)
            r7 = r1
            r8 = r4
            r9 = r5
            r10 = r0
            r11 = r3
            X.C54935HYr.A00(r7, r8, r9, r10, r11, r12)
            goto L_0x01f7
        L_0x020e:
            r4 = r1
            X.5Wx r4 = (X.C286565Wx) r4
            r3 = 0
            X.C286565Wx.A0L(r4, r3)
            r0 = 1427847979(0x551b3b2b, float:1.06674017E13)
            r1.ExS(r0)
            int r0 = r6.size()
            int r2 = r0 % 3
            r0 = 2
            if (r2 != r0) goto L_0x0227
            X.C54942HYy.A00(r1, r3)
        L_0x0227:
            X.C286565Wx.A0L(r4, r3)
        L_0x022a:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00c6
            r0 = -2054940549(0xffffffff8584187b, float:-1.2422213E-35)
            goto L_0x00c3
        L_0x0235:
            r1.Evl()
            goto L_0x00c6
        L_0x023a:
            X.5Wy r1 = (X.C286575Wy) r1
            boolean r2 = X.G9w.A1a(r13)
            if (r2 == 0) goto L_0x024a
            r3 = -1345539656(0xffffffffafccb1b8, float:-3.723366E-10)
            java.lang.String r2 = "com.instagram.barcelona.feed.mediaviewer.ui.MediaViewerScreen.<anonymous>.<anonymous>.<anonymous> (MediaViewerScreen.kt:492)"
            X.0fL.A01(r3, r2)
        L_0x024a:
            r2 = 2131238564(0x7f081ea4, float:1.809341E38)
            r5 = 0
            X.2DO r12 = X.C287975bA.A00(r1, r2, r5)
            r2 = 2131953692(0x7f13081c, float:1.9543862E38)
            java.lang.String r13 = X.C288035bG.A00(r1, r2)
            X.5Qk r4 = androidx.compose.ui.Modifier.A00
            X.5aV r3 = X.C51965G9l.A0R(r5)
            r2 = -257572663(0xfffffffff0a5c0c9, float:-4.103847E29)
            r1.ExS(r2)
            java.lang.Object r8 = r0.A03
            boolean r2 = r1.AGu(r8)
            java.lang.Object r7 = r0.A01
            boolean r2 = X.C51965G9l.A1Z(r1, r7, r2)
            java.lang.String r10 = r0.A04
            boolean r2 = X.C51965G9l.A1Z(r1, r10, r2)
            java.lang.Object r9 = r0.A02
            java.lang.Object r6 = r1.ECw()
            if (r2 != 0) goto L_0x0283
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r6 != r0) goto L_0x028c
        L_0x0283:
            r11 = 4
            X.IoE r6 = new X.IoE
            r6.<init>(r7, r8, r9, r10, r11)
            r1.FLL(r6)
        L_0x028c:
            X.0sa r6 = (X.C62320sa) r6
            X.C51965G9l.A1X(r1, r5)
            androidx.compose.ui.Modifier r0 = X.C288235ba.A02(r1, r4, r3, r6)
            androidx.compose.ui.Modifier r11 = X.C287205Zk.A04(r0)
            long r2 = X.C51966G9m.A0E(r1)
            long r14 = X.C51973G9u.A09(r1, r2)
            r10 = r1
            X.C288165bT.A08(r10, r11, r12, r13, r14)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00c6
            r0 = 2019170808(0x785a19f8, float:1.7694491E34)
            goto L_0x00c3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59370JGw.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
