package X;

/* renamed from: X.JFx  reason: case insensitive filesystem */
public final class C59345JFx extends 0Yg implements 0sL {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59345JFx(Object obj, int i) {
        super(2);
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(2WE r1, Object obj, Object[] objArr, int i) {
        r1.A02(new C59345JFx(obj, i), objArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: X.3bF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: android.widget.ImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: X.GxS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v164, resolved type: X.3bF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v165, resolved type: X.3bF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v54, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v343, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v55, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v344, resolved type: java.lang.CharSequence} */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x061c: MOVE  (r8v19 com.instagram.newsfeed.fragment.NewsfeedFragment) = (r8v18 com.instagram.newsfeed.fragment.NewsfeedFragment)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r37, java.lang.Object r38) {
        /*
            r36 = this;
            r3 = r36
            r0 = r37
            r10 = r38
            int r1 = r3.A00
            switch(r1) {
                case 0: goto L_0x10a2;
                case 1: goto L_0x10b7;
                case 2: goto L_0x10cb;
                case 3: goto L_0x10f0;
                case 4: goto L_0x1103;
                case 5: goto L_0x111b;
                case 6: goto L_0x1139;
                case 7: goto L_0x1157;
                case 8: goto L_0x1166;
                case 9: goto L_0x117f;
                case 10: goto L_0x1196;
                case 11: goto L_0x11ac;
                case 12: goto L_0x11d0;
                case 13: goto L_0x11ea;
                case 14: goto L_0x1212;
                case 15: goto L_0x1223;
                case 16: goto L_0x1234;
                case 17: goto L_0x124e;
                case 18: goto L_0x126d;
                case 19: goto L_0x128a;
                case 20: goto L_0x12a5;
                case 21: goto L_0x12b7;
                case 22: goto L_0x0019;
                case 23: goto L_0x005b;
                case 24: goto L_0x0087;
                case 25: goto L_0x00c1;
                case 26: goto L_0x13a4;
                case 27: goto L_0x00f6;
                case 28: goto L_0x01a8;
                case 29: goto L_0x01f9;
                case 30: goto L_0x021c;
                case 31: goto L_0x02b4;
                case 32: goto L_0x08ca;
                case 33: goto L_0x0902;
                case 34: goto L_0x0a9a;
                case 35: goto L_0x12d1;
                case 36: goto L_0x0c0b;
                case 37: goto L_0x0c54;
                case 38: goto L_0x000b;
                case 39: goto L_0x000b;
                case 40: goto L_0x0d64;
                case 41: goto L_0x101c;
                case 42: goto L_0x0dd9;
                case 43: goto L_0x0e44;
                case 44: goto L_0x0e84;
                case 45: goto L_0x0ed9;
                case 46: goto L_0x0f11;
                case 47: goto L_0x0f48;
                case 48: goto L_0x0f80;
                case 49: goto L_0x1066;
                default: goto L_0x000b;
            }
        L_0x000b:
            float r1 = X.C51975G9x.A02(r0, r10)
            java.lang.Object r0 = r3.A01
            X.5Oz r0 = (X.C284945Oz) r0
            X.C51967G9n.A14(r0, r1)
        L_0x0016:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0019:
            int r1 = X.AnonymousClass7TE.A0M(r10)
            r0 = -1
            if (r1 != r0) goto L_0x0016
            java.lang.Object r0 = r3.A01
            X.A99 r0 = (X.A99) r0
            android.app.Activity r4 = r0.A00
            com.instagram.common.session.UserSession r3 = r0.A01
            X.E5r r2 = new X.E5r
            r2.<init>()
            X.7Pr r1 = X.DbS.A0W(r3)
            r1.A0T = r2
            r0 = 0
            X.DbS.A1S(r1, r0)
            X.DbU.A0y(r4, r2, r1)
            X.FA7 r1 = X.C48962En0.A00(r4, r3)
            boolean r0 = X.FA7.A00(r1)
            if (r0 == 0) goto L_0x0016
            X.0eM r0 = r1.A01
            java.lang.Object r1 = r0.getValue()
            X.0wc r1 = (X.0wc) r1
            java.lang.String r0 = "ig_lock_screen_shortcuts"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "onboarding_dialog_more_options_tapped"
            goto L_0x00bc
        L_0x005b:
            X.C51965G9l.A1U(r10)
            java.lang.Object r0 = r3.A01
            X.A99 r0 = (X.A99) r0
            android.app.Activity r1 = r0.A00
            com.instagram.common.session.UserSession r0 = r0.A01
            X.FA7 r1 = X.C48962En0.A00(r1, r0)
            boolean r0 = X.FA7.A00(r1)
            if (r0 == 0) goto L_0x0016
            X.0eM r0 = r1.A01
            java.lang.Object r1 = r0.getValue()
            X.0wc r1 = (X.0wc) r1
            java.lang.String r0 = "ig_lock_screen_shortcuts"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "onboarding_dialog_no_thanks_tapped"
            goto L_0x00bc
        L_0x0087:
            int r1 = X.AnonymousClass7TE.A0M(r10)
            r0 = -1
            if (r1 != r0) goto L_0x0016
            X.8g6 r4 = X.C361358g6.A00
            java.lang.Object r0 = r3.A01
            X.A99 r0 = (X.A99) r0
            android.app.Activity r2 = r0.A00
            com.instagram.common.session.UserSession r1 = r0.A01
            r0 = 0
            r4.A01(r1, r2, r0)
            X.FA7 r1 = X.C48962En0.A00(r2, r1)
            boolean r0 = X.FA7.A00(r1)
            if (r0 == 0) goto L_0x0016
            X.0eM r0 = r1.A01
            java.lang.Object r1 = r0.getValue()
            X.0wc r1 = (X.0wc) r1
            java.lang.String r0 = "ig_lock_screen_shortcuts"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "onboarding_dialog_try_it_tapped"
        L_0x00bc:
            X.DbS.A1J(r2, r0)
            goto L_0x0a81
        L_0x00c1:
            X.5Wy r0 = (X.C286575Wy) r0
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x00d0
            boolean r1 = r0.Bwn()
            if (r1 != 0) goto L_0x109d
        L_0x00d0:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x00de
            r2 = 876751727(0x34422b6f, float:1.8083459E-7)
            java.lang.String r1 = "com.instagram.ml.text2filter.Text2FilterStoryPromptViewController.<anonymous> (Text2FilterStoryPromptViewController.kt:25)"
            X.0fL.A01(r2, r1)
        L_0x00de:
            java.lang.Object r1 = r3.A01
            X.A6N r1 = (X.A6N) r1
            java.lang.String r3 = "ai_rewrite_loading_controller"
            com.instagram.common.session.UserSession r2 = r1.A01
            X.0sL r1 = X.C55345HgD.A00
            X.C286885Ye.A01(r0, r2, r3, r1)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0016
            r0 = 1632638045(0x6150145d, float:2.3989938E20)
            goto L_0x1098
        L_0x00f6:
            X.5Wy r0 = (X.C286575Wy) r0
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x0105
            boolean r1 = r0.Bwn()
            if (r1 != 0) goto L_0x109d
        L_0x0105:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0113
            r2 = -2136899842(0xffffffff80a17efe, float:-1.4831071E-38)
            java.lang.String r1 = "com.instagram.music.search.MusicBrowserHomeFragment.setupTabList.<anonymous>.<anonymous>.<anonymous> (MusicBrowserHomeFragment.kt:281)"
            X.0fL.A01(r2, r1)
        L_0x0113:
            com.google.common.collect.ImmutableList r1 = X.C60330JjZ.A0E
            java.lang.Object r7 = r3.A01
            X.K70 r7 = (X.K70) r7
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r5 = r1.iterator()
        L_0x0121:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0141
            java.lang.Object r4 = r5.next()
            X.Khg r4 = (X.C62550Khg) r4
            android.content.res.Resources r2 = X.DbV.A05(r7)
            int r1 = r4.A00
            java.lang.String r3 = X.AnonymousClass7TF.A0d(r2, r1)
            r2 = 1
            X.Gpn r1 = new X.Gpn
            r1.<init>(r4, r3, r2)
            r6.add(r1)
            goto L_0x0121
        L_0x0141:
            X.62P r14 = X.AnonymousClass62Q.A00(r6)
            X.0eM r1 = r7.A0P
            java.lang.Object r1 = r1.getValue()
            X.JjZ r1 = (X.C60330JjZ) r1
            X.0Ud r1 = r1.A0C
            r8 = 0
            r6 = 0
            java.lang.Object r3 = X.G9w.A0g(r0, r1, r6)
            X.Khg r3 = (X.C62550Khg) r3
            android.content.res.Resources r2 = X.DbV.A05(r7)
            int r1 = r3.A00
            java.lang.String r2 = X.AnonymousClass7TF.A0d(r2, r1)
            r1 = 1
            X.Gpn r5 = new X.Gpn
            r5.<init>(r3, r2, r1)
            X.5Qk r4 = androidx.compose.ui.Modifier.A00
            r3 = 1090519040(0x41000000, float:8.0)
            r2 = 1094713344(0x41400000, float:12.0)
            r1 = 0
            androidx.compose.ui.Modifier r10 = X.C287195Zj.A0B(r4, r1, r3, r1, r2)
            r1 = 1126798096(0x43299310, float:169.57446)
            boolean r2 = X.C51967G9n.A1Z(r0, r7, r1)
            java.lang.Object r1 = r0.ECw()
            if (r2 != 0) goto L_0x0183
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r1 != r2) goto L_0x018d
        L_0x0183:
            r2 = 35
            X.MP7 r1 = new X.MP7
            r1.<init>(r7, r2)
            r0.FLL(r1)
        L_0x018d:
            X.0sP r1 = (X.0sP) r1
            X.C51965G9l.A1X(r0, r6)
            r15 = 384(0x180, float:5.38E-43)
            r16 = 48
            r11 = r5
            r12 = r1
            r13 = r8
            r9 = r0
            X.C56633I5n.A01(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0016
            r0 = -1610644486(0xffffffff9fff83fa, float:-1.0821504E-19)
            goto L_0x1098
        L_0x01a8:
            X.5Wy r0 = (X.C286575Wy) r0
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x01b7
            boolean r1 = r0.Bwn()
            if (r1 != 0) goto L_0x109d
        L_0x01b7:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x01c5
            r2 = -2076749938(0xffffffff84374f8e, float:-2.1548076E-36)
            java.lang.String r1 = "com.instagram.music.search.MusicBrowserHomeFragment.setupTabList.<anonymous>.<anonymous> (MusicBrowserHomeFragment.kt:279)"
            X.0fL.A01(r2, r1)
        L_0x01c5:
            java.lang.Object r5 = r3.A01
            X.K70 r5 = (X.K70) r5
            java.lang.String r4 = r5.A0L
            X.0eM r1 = r5.A0R
            X.0lg r6 = X.DbT.A0X(r1)
            boolean r1 = r5.A09
            r11 = r1 ^ 1
            r12 = 0
            r3 = -190770517(0xfffffffff4a112ab, float:-1.0209209E32)
            r2 = 27
            X.JFx r1 = new X.JFx
            r1.<init>(r5, r2)
            X.5PJ r8 = X.AnonymousClass5PI.A01(r0, r1, r3)
            r9 = 196608(0x30000, float:2.75506E-40)
            r10 = 24
            r7 = r4
            r13 = r12
            r5 = r0
            X.C286885Ye.A03(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0016
            r0 = 668831878(0x27dd9086, float:6.1496515E-15)
            goto L_0x1098
        L_0x01f9:
            int r6 = X.G9t.A0j(r10, r0)
            java.lang.Object r5 = r3.A01
            X.4DH r5 = (X.AnonymousClass4DH) r5
            X.8ab r4 = X.DbW.A0U(r5)
            r3 = 2131960866(0x7f132422, float:1.9558413E38)
            r2 = 2
            X.FIS r1 = new X.FIS
            r1.<init>(r6, r2, r0, r5)
            r4.A0G(r1, r3)
            X.Dba.A1M(r4)
            r4.A0m(r5)
            X.DbT.A1V(r4)
            goto L_0x0016
        L_0x021c:
            X.5Wy r0 = (X.C286575Wy) r0
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x022b
            boolean r1 = r0.Bwn()
            if (r1 != 0) goto L_0x109d
        L_0x022b:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0239
            r2 = 700322459(0x29be129b, float:8.4409225E-14)
            java.lang.String r1 = "com.instagram.newsfeed.followrequests.ui.FollowRequestsComposeFragment.onCreateView.<anonymous> (FollowRequestsComposeFragment.kt:192)"
            X.0fL.A01(r2, r1)
        L_0x0239:
            X.5Qk r4 = androidx.compose.ui.Modifier.A00
            r1 = -821880157(0xffffffffcf031aa3, float:-2.19956096E9)
            r0.ExS(r1)
            java.lang.Object r5 = r3.A01
            boolean r2 = r0.AGw(r5)
            java.lang.Object r1 = r0.ECw()
            if (r2 != 0) goto L_0x0251
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r1 != r2) goto L_0x025a
        L_0x0251:
            r2 = 6
            X.G2b r1 = new X.G2b
            r1.<init>(r5, r2)
            r0.FLL(r1)
        L_0x025a:
            X.0sa r1 = (X.C62320sa) r1
            X.5Wx r2 = X.C51965G9l.A0G(r0)
            androidx.compose.ui.Modifier r6 = X.C288305bh.A00(r4, r1)
            r1 = -821877074(0xffffffffcf0326ae, float:-2.20035021E9)
            boolean r1 = X.C51967G9n.A1Z(r0, r5, r1)
            java.lang.Object r8 = r0.ECw()
            if (r1 != 0) goto L_0x0275
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r8 != r1) goto L_0x027f
        L_0x0275:
            r1 = 29
            X.JFx r8 = new X.JFx
            r8.<init>(r5, r1)
            r0.FLL(r8)
        L_0x027f:
            X.C286565Wx.A0I(r2)
            r1 = -821871660(0xffffffffcf033bd4, float:-2.20173619E9)
            boolean r1 = X.C51967G9n.A1Z(r0, r5, r1)
            java.lang.Object r7 = r0.ECw()
            if (r1 != 0) goto L_0x0293
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r7 != r1) goto L_0x029c
        L_0x0293:
            r1 = 7
            X.G2b r7 = new X.G2b
            r7.<init>(r5, r1)
            r0.FLL(r7)
        L_0x029c:
            X.C286565Wx.A0I(r2)
            r1 = 608701571(0x24480c83, float:4.3378685E-17)
            r4 = 20
            X.J7t r3 = new X.J7t
            r3.<init>(r4, r5, r6, r7, r8)
            boolean r0 = X.C51975G9x.A1T(r0, r3, r1)
            if (r0 == 0) goto L_0x0016
            r0 = 328140806(0x138f0806, float:3.6106187E-27)
            goto L_0x1098
        L_0x02b4:
            X.5Wy r0 = (X.C286575Wy) r0
            int r1 = X.C51968G9o.A0C(r10)
            r7 = 2
            if (r1 != r7) goto L_0x02c3
            boolean r1 = r0.Bwn()
            if (r1 != 0) goto L_0x109d
        L_0x02c3:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x02d1
            r2 = 1434137915(0x557b353b, float:1.72628776E13)
            java.lang.String r1 = "com.instagram.newsfeed.fragment.NewsfeedYouComposeFragment.onCreateView.<anonymous>.<anonymous> (NewsfeedYouComposeFragment.kt:347)"
            X.0fL.A01(r2, r1)
        L_0x02d1:
            X.0gF r6 = X.C60340gF.A00
            java.lang.Object r1 = r3.A01
            X.Dcv r1 = (X.C46352Dcv) r1
            r17 = 0
            r8 = 1
            X.Fy5 r3 = new X.Fy5
            r2 = r17
            r3.<init>(r1, r2, r8)
            X.C286645Xf.A04(r0, r6, r3)
            X.0eM r2 = r1.A0K
            java.lang.Object r2 = r2.getValue()
            java.lang.Object r4 = X.C51966G9m.A17(r2)
            X.0r6 r4 = (X.AnonymousClass0r6) r4
            r30 = 0
            r2 = 0
            X.JV1 r3 = new X.JV1
            r3.<init>()
            r15 = 8
            X.4gU r5 = X.AnonymousClass6FW.A01(r0, r3, r4, r15)
            java.lang.Object r3 = r5.getValue()
            X.JV1 r3 = (X.JV1) r3
            java.lang.Object r3 = r3.A03
            java.util.Set r3 = (java.util.Set) r3
            java.util.Iterator r14 = r3.iterator()
        L_0x030c:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x03a8
            java.lang.Object r4 = r14.next()
            X.G4z r4 = (X.C51865G4z) r4
            boolean r3 = r4 instanceof X.C46540Dgh
            if (r3 == 0) goto L_0x0326
            boolean r3 = r1.isVisible()
            if (r3 == 0) goto L_0x030c
            X.C46352Dcv.A04(r1)
            goto L_0x030c
        L_0x0326:
            boolean r3 = r4 instanceof X.Ff3
            if (r3 == 0) goto L_0x032e
            r1.A07(r8)
            goto L_0x030c
        L_0x032e:
            boolean r3 = r4 instanceof X.C53552GqN
            if (r3 == 0) goto L_0x138a
            X.0eM r3 = r1.A06
            java.lang.Object r12 = r3.getValue()
            X.DgR r12 = (X.C46524DgR) r12
            X.GqN r4 = (X.C53552GqN) r4
            X.3gp r10 = r4.A00
            X.0qQ.A0B(r10, r2)
            com.instagram.user.model.User r11 = r10.A08
            if (r11 == 0) goto L_0x030c
            r11.getId()
            r11.getUsername()
            r11.Bh3()
            com.instagram.pendingmedia.model.recipients.PendingRecipient r9 = new com.instagram.pendingmedia.model.recipients.PendingRecipient
            r9.<init>((com.instagram.user.model.User) r11)
            X.6ap r4 = X.DbS.A0a()
            r4.A06()
            android.app.Activity r13 = r12.A00
            r3 = 2131960309(0x7f1321f5, float:1.9557283E38)
            java.lang.String r3 = X.DbY.A0b(r13, r11, r3)
            r4.A0D = r3
            r3 = 2131952148(0x7f130214, float:1.954073E38)
            X.DbW.A0q(r13, r4, r3)
            X.6ar r3 = X.C310356ar.CIRCULAR
            r4.A0B(r3)
            com.instagram.common.typedurl.ImageUrl r3 = r11.Bh3()
            r4.A09 = r3
            X.IVZ r3 = new X.IVZ
            r18 = r3
            r19 = r2
            r20 = r12
            r21 = r9
            r22 = r11
            r23 = r10
            r18.<init>(r19, r20, r21, r22, r23)
            r4.A0A(r3)
            r4.A0L = r8
            X.DbY.A1N(r4)
            com.instagram.common.session.UserSession r9 = r12.A03
            X.0iw r4 = r12.A02
            java.lang.String r21 = r11.getId()
            java.lang.String r3 = r10.A0G
            java.lang.String r20 = "send_toast_impression"
            r18 = r4
            r19 = r9
            r22 = r3
            r23 = r17
            X.C3265677h.A0S(r18, r19, r20, r21, r22, r23)
            goto L_0x030c
        L_0x03a8:
            java.lang.Object r3 = r5.getValue()
            X.JV1 r3 = (X.JV1) r3
            java.lang.Object r3 = r3.A03
            java.util.Set r3 = (java.util.Set) r3
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x03fb
            com.instagram.newsfeed.viewmodel.ActivityFeedViewModel r4 = X.DbV.A0Z(r1)
            java.lang.Object r3 = r5.getValue()
            X.JV1 r3 = (X.JV1) r3
            java.lang.Object r11 = r3.A03
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            X.0qQ.A0B(r11, r2)
            X.05G r10 = r4.A0C
        L_0x03cd:
            java.lang.Object r12 = r10.getValue()
            r3 = r12
            java.util.LinkedHashSet r3 = (java.util.LinkedHashSet) r3
            java.util.ArrayList r9 = X.AnonymousClass7TF.A0q(r3, r2)
            java.util.Iterator r13 = r3.iterator()
        L_0x03dc:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x03f0
            java.lang.Object r4 = r13.next()
            boolean r3 = X.00k.A0u(r11, r4)
            if (r3 != 0) goto L_0x03dc
            r9.add(r4)
            goto L_0x03dc
        L_0x03f0:
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>(r9)
            boolean r3 = r10.AIY(r12, r3)
            if (r3 == 0) goto L_0x03cd
        L_0x03fb:
            r3 = 1999319850(0x772b332a, float:3.4723457E33)
            java.lang.Object r3 = X.C51967G9n.A0n(r0, r5, r3)
            X.JV1 r3 = (X.JV1) r3
            java.lang.Object r3 = r3.A04
            boolean r3 = r3 instanceof X.AnonymousClass5GQ
            if (r3 == 0) goto L_0x05ae
            X.C46352Dcv.A04(r1)
            java.lang.Object r3 = r5.getValue()
            X.JV1 r3 = (X.JV1) r3
            java.lang.Object r3 = r3.A04
            X.5GP r3 = (X.AnonymousClass5GP) r3
            java.lang.Object r6 = r3.A00()
            X.DdY r6 = (X.DdY) r6
            if (r6 == 0) goto L_0x05fe
            java.util.List r4 = r6.A0C
            com.instagram.common.session.UserSession r3 = r1.getSession()
            X.DdJ r3 = X.C46353Dcx.A00(r3)
            X.0qQ.A0B(r4, r2)
            r3.A01 = r4
            com.instagram.common.session.UserSession r3 = r1.getSession()
            X.2aV r3 = X.DbV.A0a(r3)
            X.2aD r14 = X.2aD.A09
            X.JV5 r4 = r6.A02
            java.lang.Object r11 = r4.A03
            X.9IM r11 = (X.AnonymousClass9IM) r11
            java.lang.Object r9 = r4.A00
            X.9IM r9 = (X.AnonymousClass9IM) r9
            boolean r12 = r4.A01
            X.0qQ.A0B(r11, r8)
            boolean r4 = r3.A05
            if (r4 == 0) goto L_0x05fe
            java.util.Map r13 = r3.A00
            r16 = 0
            r10 = 3
            X.9IP r4 = new X.9IP
            r4.<init>(r14)
            java.lang.Object r4 = r13.get(r4)
            X.0eP r4 = (X.0eP) r4
            if (r4 == 0) goto L_0x05fe
            java.lang.Object r6 = r4.A00
            X.2aX r6 = (X.2aX) r6
            java.lang.Object r7 = r4.A01
            X.3Jd r7 = (X.C239993Jd) r7
            X.9IP r4 = new X.9IP
            r4.<init>(r14)
            r13.remove(r4)
            X.2fx r14 = r7.A00
            int r4 = r14.ordinal()
            if (r4 == r8) goto L_0x053d
            if (r4 != r10) goto L_0x05fe
            java.util.List r4 = r6.A04
            if (r4 == 0) goto L_0x049c
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r12 = r4.iterator()
        L_0x0483:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x049e
            java.lang.Object r8 = r12.next()
            r4 = r8
            X.2aX r4 = (X.2aX) r4
            X.2aE r4 = r4.A03
            boolean r4 = r4.Akm()
            if (r4 == 0) goto L_0x0483
            r10.add(r8)
            goto L_0x0483
        L_0x049c:
            r10 = r17
        L_0x049e:
            X.2aE r8 = r6.A03
            int r4 = r6.A01
            int r12 = r6.A02
            X.0qQ.A0B(r8, r2)
            X.2aX r6 = new X.2aX
            r6.<init>(r8, r10, r4, r12)
            java.lang.Object r8 = r11.A01
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r8.iterator()
        L_0x04b8:
            boolean r8 = r13.hasNext()
            if (r8 == 0) goto L_0x04d9
            java.lang.Object r11 = r13.next()
            r12 = r11
            X.9Ir r12 = (X.C376619Ir) r12
            X.0eM r8 = r3.A04
            java.lang.Object r10 = r8.getValue()
            java.util.Set r10 = (java.util.Set) r10
            java.lang.String r8 = r12.A02
            boolean r8 = r10.contains(r8)
            if (r8 == 0) goto L_0x04b8
            r4.add(r11)
            goto L_0x04b8
        L_0x04d9:
            if (r9 == 0) goto L_0x050a
            java.lang.Object r8 = r9.A01
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L_0x050a
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r8.iterator()
        L_0x04e9:
            boolean r8 = r13.hasNext()
            if (r8 == 0) goto L_0x050c
            java.lang.Object r11 = r13.next()
            r12 = r11
            X.9Ir r12 = (X.C376619Ir) r12
            X.0eM r8 = r3.A04
            java.lang.Object r10 = r8.getValue()
            java.util.Set r10 = (java.util.Set) r10
            java.lang.String r8 = r12.A02
            boolean r8 = r10.contains(r8)
            if (r8 == 0) goto L_0x04e9
            r9.add(r11)
            goto L_0x04e9
        L_0x050a:
            X.0sn r9 = X.0sn.A00
        L_0x050c:
            int r8 = r6.A01
            int r10 = r6.A00
            int r8 = r8 + r10
            java.util.Iterator r11 = r4.iterator()
            r29 = 0
        L_0x0517:
            boolean r10 = r11.hasNext()
            if (r10 == 0) goto L_0x0528
            java.lang.Object r10 = r11.next()
            X.9Ir r10 = (X.C376619Ir) r10
            int r10 = r10.A01
            int r29 = r29 + r10
            goto L_0x0517
        L_0x0528:
            java.util.Iterator r11 = r9.iterator()
        L_0x052c:
            boolean r10 = r11.hasNext()
            if (r10 == 0) goto L_0x05c6
            java.lang.Object r10 = r11.next()
            X.9Ir r10 = (X.C376619Ir) r10
            int r10 = r10.A01
            int r16 = r16 + r10
            goto L_0x052c
        L_0x053d:
            java.lang.Object r4 = r11.A01
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.ArrayList r4 = X.00k.A0U(r4)
            if (r9 == 0) goto L_0x05a9
            java.lang.Object r10 = r9.A01
            java.util.Collection r10 = (java.util.Collection) r10
            if (r10 == 0) goto L_0x05a9
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1D(r10)
        L_0x0551:
            if (r12 == 0) goto L_0x0560
            java.lang.String r13 = "local_activity_feed_items"
            X.9Ir r12 = new X.9Ir
            r12.<init>(r13, r8, r2)
            r4.add(r12)
            r10.add(r12)
        L_0x0560:
            int r8 = r6.A01
            int r12 = r6.A00
            int r8 = r8 + r12
            int r12 = r11.A00
            java.lang.String r22 = X.AnonymousClass4EN.A03(r6)
            X.2g1 r7 = r7.A01
            java.lang.String r23 = X.AnonymousClass4EN.A02(r7)
            java.lang.String r24 = X.AnonymousClass4EN.A01(r14)
            r11 = 29
            X.9Lt r7 = new X.9Lt
            r7.<init>(r11, r6, r3)
            r11 = 30
            X.9Lt r6 = new X.9Lt
            r6.<init>(r11, r4, r3)
            r11 = 31
            X.9Lt r4 = new X.9Lt
            r4.<init>(r11, r10, r3)
            if (r9 == 0) goto L_0x05a6
            int r9 = r9.A00
            java.lang.Integer r20 = java.lang.Integer.valueOf(r9)
        L_0x0592:
            X.5m3 r18 = X.C294195m3.TAP
            r19 = r3
            r21 = r17
            r25 = r7
            r26 = r6
            r27 = r4
            r28 = r8
            r29 = r12
            X.2aV.A01(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x05fe
        L_0x05a6:
            r20 = r17
            goto L_0x0592
        L_0x05a9:
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            goto L_0x0551
        L_0x05ae:
            java.lang.Object r3 = r5.getValue()
            X.JV1 r3 = (X.JV1) r3
            java.lang.Object r3 = r3.A04
            boolean r3 = r3 instanceof X.KWO
            if (r3 == 0) goto L_0x0666
            X.Fy5 r4 = new X.Fy5
            r3 = r17
            r4.<init>(r1, r3, r7)
            X.C286645Xf.A04(r0, r6, r4)
            goto L_0x0666
        L_0x05c6:
            java.lang.String r22 = X.AnonymousClass4EN.A03(r6)
            X.2g1 r7 = r7.A01
            java.lang.String r23 = X.AnonymousClass4EN.A02(r7)
            java.lang.String r24 = X.AnonymousClass4EN.A01(r14)
            r10 = 32
            X.9Lt r7 = new X.9Lt
            r7.<init>(r10, r6, r3)
            r10 = 33
            X.9Lt r6 = new X.9Lt
            r6.<init>(r10, r4, r3)
            r10 = 34
            X.9Lt r4 = new X.9Lt
            r4.<init>(r10, r9, r3)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r16)
            X.5m3 r18 = X.C294195m3.TAP
            r19 = r3
            r21 = r17
            r25 = r7
            r26 = r6
            r27 = r4
            r28 = r8
            X.2aV.A01(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
        L_0x05fe:
            java.lang.Object r3 = r5.getValue()
            X.JV1 r3 = (X.JV1) r3
            java.lang.Object r4 = r3.A06
            X.62P r4 = (X.AnonymousClass62P) r4
            if (r4 == 0) goto L_0x0614
            com.instagram.common.session.UserSession r3 = r1.getSession()
            X.DdJ r3 = X.C46353Dcx.A00(r3)
            r3.A03 = r4
        L_0x0614:
            androidx.fragment.app.Fragment r8 = r1.requireParentFragment()
            boolean r3 = r8 instanceof com.instagram.newsfeed.fragment.NewsfeedFragment
            if (r3 == 0) goto L_0x0666
            com.instagram.newsfeed.fragment.NewsfeedFragment r8 = (com.instagram.newsfeed.fragment.NewsfeedFragment) r8
            if (r8 == 0) goto L_0x0666
            X.0eM r10 = r8.A0A
            X.0lg r6 = X.AnonymousClass7TF.A0L(r10, r2)
            X.0Tu r7 = X.0Tu.A05
            r3 = 36321980076533628(0x810aa60000277c, double:3.0335046850496855E-306)
            boolean r3 = X.182.A06(r7, r6, r3)
            if (r3 == 0) goto L_0x0666
            X.Dcv r3 = r8.A05
            if (r3 == 0) goto L_0x0666
            com.instagram.common.session.UserSession r3 = r3.getSession()
            X.DdJ r3 = X.C46353Dcx.A00(r3)
            if (r3 == 0) goto L_0x0666
            X.62P r12 = r3.A03
            boolean r3 = r12.isEmpty()
            if (r3 != 0) goto L_0x0666
            android.view.View r4 = r8.requireView()
            r3 = 2131427639(0x7f0b0137, float:1.84769E38)
            android.view.View r11 = X.AnonymousClass7TF.A0F(r4, r3)
            com.instagram.igds.components.segmentedpills.IgdsSegmentedPills r11 = (com.instagram.igds.components.segmentedpills.IgdsSegmentedPills) r11
            int r3 = r11.getVisibility()
            if (r3 != 0) goto L_0x084d
            java.lang.Object r3 = r11.getTag()
            boolean r3 = X.0qQ.A0K(r3, r12)
            if (r3 == 0) goto L_0x084d
        L_0x0666:
            r3 = r0
            X.5Wx r3 = (X.C286565Wx) r3
            java.lang.Object r4 = X.C51967G9n.A0o(r3, r5, r2)
            X.JV1 r4 = (X.JV1) r4
            java.lang.Object r4 = r4.A02
            java.util.List r4 = (java.util.List) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x079a
            r4 = 1850719476(0x6e4fbcf4, float:1.6072957E28)
            java.lang.Object r4 = X.C51967G9n.A0n(r0, r5, r4)
            X.JV1 r4 = (X.JV1) r4
            java.lang.Object r5 = r4.A04
            boolean r4 = r5 instanceof X.AnonymousClass5GO
            if (r4 != 0) goto L_0x078b
            boolean r4 = r5 instanceof X.AnonymousClass5GR
            if (r4 != 0) goto L_0x078b
            boolean r4 = r5 instanceof X.KWO
            if (r4 == 0) goto L_0x06d3
            r4 = 1850881668(0x6e523684, float:1.6264439E28)
            r0.ExS(r4)
            r4 = 7
            X.G2g r6 = new X.G2g
            r6.<init>(r1, r4)
            X.5Qk r5 = androidx.compose.ui.Modifier.A00
            X.G2g r4 = new X.G2g
            r4.<init>(r1, r15)
            androidx.compose.ui.Modifier r5 = X.C288305bh.A00(r5, r4)
            androidx.compose.foundation.layout.FillElement r4 = X.C287205Zk.A01
            androidx.compose.ui.Modifier r5 = r5.Ezh(r4)
            r9 = 0
            r8 = 4
            r4 = r0
            r7 = r2
            X.HXX.A00(r4, r5, r6, r7, r8, r9)
        L_0x06b5:
            X.C286565Wx.A0L(r3, r2)
        L_0x06b8:
            X.C286565Wx.A0L(r3, r2)
            android.app.Activity r0 = r1.getRootActivity()
            X.2dZ r0 = X.2dY.A00(r0)
            if (r0 == 0) goto L_0x06c8
            r0.A0T()
        L_0x06c8:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0016
            r0 = 1459609577(0x56ffdfe9, float:1.40668576E14)
            goto L_0x1098
        L_0x06d3:
            boolean r4 = r5 instanceof X.AnonymousClass5GQ
            if (r4 == 0) goto L_0x138f
            r4 = 1851259713(0x6e57fb41, float:1.6710756E28)
            r0.ExS(r4)
            com.instagram.common.session.UserSession r4 = r1.getSession()
            X.DdJ r4 = X.C46353Dcx.A00(r4)
            java.util.List r4 = r4.A01()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x071e
            X.0eM r4 = r1.A0D
            java.lang.Object r4 = r4.getValue()
            if (r4 != 0) goto L_0x071e
            r4 = 1851343382(0x6e594216, float:1.6809535E28)
            r0.ExS(r4)
            r5 = 2131231744(0x7f080400, float:1.8079578E38)
            r4 = 1119879168(0x42c00000, float:96.0)
            X.Gph r7 = new X.Gph
            r7.<init>(r4, r5)
            r4 = 2131968360(0x7f134168, float:1.9573612E38)
            java.lang.String r6 = X.C288035bG.A00(r0, r4)
            r4 = 2131968359(0x7f134167, float:1.957361E38)
            java.lang.String r5 = X.C288035bG.A00(r0, r4)
            r4 = 4066(0xfe2, float:5.698E-42)
            X.I7M.A07(r0, r7, r5, r6, r4)
        L_0x071a:
            X.C286565Wx.A0L(r3, r2)
            goto L_0x06b5
        L_0x071e:
            r4 = 1851781040(0x6e5fefb0, float:1.732623E28)
            r0.ExS(r4)
            X.HL5 r27 = X.HL5.EMPHASIZED
            r5 = 2131238603(0x7f081ecb, float:1.809349E38)
            r4 = 1119879168(0x42c00000, float:96.0)
            r7 = r17
            X.Gph r6 = new X.Gph
            r6.<init>(r4, r5)
            r4 = 2131968358(0x7f134166, float:1.9573608E38)
            java.lang.String r29 = X.C288035bG.A00(r0, r4)
            X.0eM r5 = r1.A0D
            java.lang.Object r4 = r5.getValue()
            com.instagram.newsfeed.model.PillsFilterCategory r4 = (com.instagram.newsfeed.model.PillsFilterCategory) r4
            if (r4 == 0) goto L_0x0788
            java.lang.String r7 = r4.A00
            r28 = r7
        L_0x0747:
            r4 = 1999411066(0x772c977a, float:3.5005757E33)
            r0.ExS(r4)
            if (r7 != 0) goto L_0x0756
            r4 = 2131968357(0x7f134165, float:1.9573606E38)
            java.lang.String r28 = X.C288035bG.A00(r0, r4)
        L_0x0756:
            X.C286565Wx.A0L(r3, r2)
            r4 = 1999418620(0x772cb4fc, float:3.5029135E33)
            r0.ExS(r4)
            java.lang.Object r4 = r5.getValue()
            if (r4 != 0) goto L_0x076c
            r4 = 2131968356(0x7f134164, float:1.9573604E38)
            java.lang.String r30 = X.C288035bG.A00(r0, r4)
        L_0x076c:
            X.C286565Wx.A0L(r3, r2)
            r34 = 0
            r5 = 9
            X.G2g r4 = new X.G2g
            r4.<init>(r1, r5)
            r32 = 384(0x180, float:5.38E-43)
            r33 = 1506(0x5e2, float:2.11E-42)
            r24 = r0
            r25 = r17
            r26 = r6
            r31 = r4
            X.I7M.A02(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x071a
        L_0x0788:
            r28 = r7
            goto L_0x0747
        L_0x078b:
            r4 = 1850762659(0x6e5065a3, float:1.6123938E28)
            r0.ExS(r4)
            androidx.compose.ui.Modifier r4 = X.C51968G9o.A0O()
            X.GQD.A01(r0, r4)
            goto L_0x06b5
        L_0x079a:
            r4 = 1852923669(0x6e715f15, float:1.8675209E28)
            X.5Qk r7 = X.C51965G9l.A0K(r0, r4)
            r6 = 10
            X.G2g r4 = new X.G2g
            r4.<init>(r1, r6)
            androidx.compose.ui.Modifier r6 = X.C288305bh.A00(r7, r4)
            java.lang.String r4 = "activity_feed_box"
            androidx.compose.ui.Modifier r16 = X.C51969G9p.A0Y(r6, r4)
            java.lang.Object r4 = r5.getValue()
            X.JV1 r4 = (X.JV1) r4
            java.lang.Object r4 = r4.A04
            boolean r4 = r4 instanceof X.AnonymousClass5GR
            if (r4 == 0) goto L_0x07de
            java.lang.Object r4 = r5.getValue()
            X.JV1 r4 = (X.JV1) r4
            java.lang.Object r4 = r4.A04
            X.5GP r4 = (X.AnonymousClass5GP) r4
            java.lang.Object r4 = r4.A00()
            if (r4 != 0) goto L_0x07de
            java.lang.Object r4 = r5.getValue()
            X.JV1 r4 = (X.JV1) r4
            java.lang.Object r4 = r4.A02
            boolean r4 = X.G9w.A1b(r4)
            r32 = 1
            if (r4 != 0) goto L_0x07e0
        L_0x07de:
            r32 = 0
        L_0x07e0:
            java.lang.Object r4 = r5.getValue()
            X.JV1 r4 = (X.JV1) r4
            java.lang.Object r12 = r4.A06
            X.62P r12 = (X.AnonymousClass62P) r12
            java.lang.Object r4 = r5.getValue()
            X.JV1 r4 = (X.JV1) r4
            java.lang.Object r11 = r4.A02
            X.62P r11 = (X.AnonymousClass62P) r11
            r4 = 19
            X.MJ7 r10 = new X.MJ7
            r10.<init>(r4, r5, r1)
            X.5Oz r4 = r1.A04
            java.lang.Object r13 = r4.getValue()
            X.4UC r13 = (X.AnonymousClass4UC) r13
            X.0eM r4 = r1.A0E
            java.lang.Object r9 = r4.getValue()
            X.2bu r9 = (X.2bu) r9
            X.5Oz r4 = r1.A03
            java.lang.Object r8 = r4.getValue()
            java.lang.Integer r8 = (java.lang.Integer) r8
            r4 = 5
            X.G2g r7 = new X.G2g
            r7.<init>(r1, r4)
            r4 = 6
            X.G2g r6 = new X.G2g
            r6.<init>(r1, r4)
            X.0sJ r4 = r1.A0O
            r25 = r4
            X.0sK r15 = r1.A0N
            X.0sJ r14 = r1.A0P
            X.0sJ r5 = r1.A0Q
            X.0sL r4 = r1.A0M
            r17 = r9
            r18 = r13
            r19 = r8
            r20 = r10
            r21 = r7
            r22 = r6
            r23 = r4
            r24 = r15
            r26 = r14
            r27 = r5
            r28 = r12
            r29 = r11
            r30 = r2
            r31 = r2
            r15 = r0
            X.GQS.A02(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x06b8
        L_0x084d:
            r11.setTag(r12)
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r16 = r12.iterator()
        L_0x085c:
            boolean r3 = r16.hasNext()
            if (r3 == 0) goto L_0x087a
            java.lang.Object r14 = r16.next()
            com.instagram.newsfeed.model.PillsFilterCategory r14 = (com.instagram.newsfeed.model.PillsFilterCategory) r14
            java.lang.String r13 = r14.A02
            r4 = 24
            X.BBV r3 = new X.BBV
            r3.<init>(r13, r4)
            r9.add(r3)
            java.lang.String r3 = r14.A01
            r6.add(r3)
            goto L_0x085c
        L_0x087a:
            boolean r3 = r9.isEmpty()
            if (r3 != 0) goto L_0x089e
            X.0hq r23 = r8.getChildFragmentManager()
            X.0qQ.A07(r23)
            int r4 = r8.A00
            r19 = 12
            X.IxF r3 = new X.IxF
            r18 = r3
            r20 = r6
            r21 = r8
            r22 = r12
            r18.<init>(r19, r20, r21, r22, r23)
            r11.setPills(r9, r4, r3)
            r11.setVisibility(r2)
        L_0x089e:
            X.0lg r6 = X.DbT.A0X(r10)
            r3 = 36321980076599165(0x810aa60001277d, double:3.0335046850911314E-306)
            boolean r3 = X.182.A06(r7, r6, r3)
            if (r3 != 0) goto L_0x0666
            android.view.View r4 = r8.requireView()
            r3 = 2131427640(0x7f0b0138, float:1.8476902E38)
            android.view.View r6 = X.AnonymousClass7TF.A0G(r4, r3)
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            java.lang.String r3 = "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams"
            X.0qQ.A0C(r4, r3)
            X.5sn r4 = (X.C298055sn) r4
            r4.A00 = r2
            r6.setLayoutParams(r4)
            goto L_0x0666
        L_0x08ca:
            X.5Wy r0 = (X.C286575Wy) r0
            int r2 = X.C51968G9o.A0C(r10)
            r1 = 2
            if (r2 != r1) goto L_0x08d9
            boolean r1 = r0.Bwn()
            if (r1 != 0) goto L_0x109d
        L_0x08d9:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x08e7
            r2 = -1285313944(0xffffffffb363aa68, float:-5.300754E-8)
            java.lang.String r1 = "com.instagram.newsfeed.fragment.NewsfeedYouComposeFragment.onCreateView.<anonymous> (NewsfeedYouComposeFragment.kt:346)"
            X.0fL.A01(r2, r1)
        L_0x08e7:
            long r4 = X.C51966G9m.A0A(r0)
            r6 = -820998498(0xffffffffcf108e9e, float:-2.42526566E9)
            java.lang.Object r3 = r3.A01
            r2 = 31
            X.JFx r1 = new X.JFx
            r1.<init>(r3, r2)
            boolean r0 = X.C51975G9x.A1U(r0, r1, r6, r4)
            if (r0 == 0) goto L_0x0016
            r0 = -1427385051(0xffffffffaaebd525, float:-4.1892284E-13)
            goto L_0x1098
        L_0x0902:
            X.GRC r0 = (X.GRC) r0
            X.0sa r10 = (X.C62320sa) r10
            r4 = 0
            boolean r2 = X.AnonymousClass7TF.A1U(r4, r0, r10)
            boolean r1 = r0 instanceof X.C52388GQn
            if (r1 == 0) goto L_0x092e
            java.lang.Object r1 = r3.A01
            X.Dcv r1 = (X.C46352Dcv) r1
            X.0eM r1 = r1.A0B
            java.lang.Object r3 = r1.getValue()
            X.Dd4 r3 = (X.Dd4) r3
            X.GQn r0 = (X.C52388GQn) r0
            X.GQo r1 = r0.A01
            X.5Gi r2 = r1.A01
            int r1 = r0.A00
            java.lang.Object r0 = r10.invoke()
            X.JV7 r0 = (X.JV7) r0
            r3.A0S(r0, r2, r1)
            goto L_0x0016
        L_0x092e:
            boolean r1 = r0 instanceof X.GST
            if (r1 == 0) goto L_0x09e2
            java.lang.Object r1 = r3.A01
            X.Dcv r1 = (X.C46352Dcv) r1
            X.0eM r1 = r1.A09
            java.lang.Object r8 = r1.getValue()
            X.Dev r8 = (X.C46433Dev) r8
            X.GWH r3 = X.GWH.A01
            X.GST r0 = (X.GST) r0
            X.GRr r9 = r0.A00
        L_0x0944:
            X.JQI r9 = (X.JQI) r9
            java.util.Set r1 = r8.A06
            java.lang.String r0 = r3.toString()
            boolean r0 = r1.add(r0)
            if (r0 == 0) goto L_0x0016
            int[] r1 = X.C55346HgE.A00
            int r0 = r3.ordinal()
            r0 = r1[r0]
            if (r0 == r2) goto L_0x0993
            X.2aD r7 = X.2aD.A0D
            if (r9 == 0) goto L_0x09e0
        L_0x0960:
            int r9 = r9.BbP()
        L_0x0964:
            com.instagram.common.session.UserSession r3 = r8.A05
            X.2aO r0 = X.2aN.A00(r3)
            X.2aT r2 = r0.A00()
            X.2aX r1 = new X.2aX
            r1.<init>(r7, r9)
            X.2g1 r0 = X.AnonymousClass2g1.ACTIVITY_FEED
            X.2fx r6 = X.C226252fx.LIST_ITEM
            r2.A02(r6, r0, r1)
            X.2aV r5 = X.DbV.A0a(r3)
            X.2aX r3 = new X.2aX
            r3.<init>(r7, r9)
            r2 = 0
            X.2g1 r1 = X.AnonymousClass2g1.PINNED_ROWS
            X.0qQ.A0B(r1, r4)
            X.3Jd r0 = new X.3Jd
            r0.<init>(r6, r1, r2, r2)
            r5.A02(r0, r3)
            goto L_0x0016
        L_0x0993:
            X.2aD r7 = X.2aD.A0C
            if (r9 == 0) goto L_0x09e0
            boolean r0 = r9.BB2()
            if (r0 == 0) goto L_0x0960
            r0 = r9
            X.GRr r0 = (X.C52414GRr) r0
            X.JwB r2 = r0.A02
            r2.getClass()
            com.instagram.common.session.UserSession r0 = r8.A05
            X.VwK r1 = X.VA1.A00(r0)
            java.lang.Object r0 = r2.A00
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.String r6 = X.VF9.A00(r0)
            java.lang.String r5 = r2.A03
            java.lang.String r3 = "sticky_activity_feed_notification"
            X.0wc r1 = r1.A00
            java.lang.String r0 = "payments_view_component"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "component"
            r2.AAJ(r0, r3)
            r0 = 13
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r2.AAJ(r0, r6)
            X.GkF r1 = new X.GkF
            r1.<init>()
            java.lang.String r0 = "landing_url"
            r1.A06(r0, r5)
            java.lang.String r0 = "configurations"
            r2.AAK(r1, r0)
            r2.Cgf()
            goto L_0x0960
        L_0x09e0:
            r9 = 0
            goto L_0x0964
        L_0x09e2:
            boolean r1 = r0 instanceof X.GSO
            if (r1 == 0) goto L_0x09fa
            java.lang.Object r1 = r3.A01
            X.Dcv r1 = (X.C46352Dcv) r1
            X.0eM r1 = r1.A09
            java.lang.Object r8 = r1.getValue()
            X.Dev r8 = (X.C46433Dev) r8
            X.GWH r3 = X.GWH.A02
            X.GSO r0 = (X.GSO) r0
            X.GSP r9 = r0.A00
            goto L_0x0944
        L_0x09fa:
            boolean r1 = r0 instanceof X.GS0
            if (r1 == 0) goto L_0x0a18
            X.GS0 r0 = (X.GS0) r0
            X.GRz r1 = r0.A01
            X.3UM r4 = r1.A01
            int r2 = r0.A00
            java.lang.Object r0 = r3.A01
            X.Dcv r0 = (X.C46352Dcv) r0
            X.0eM r0 = r0.A0F
            java.lang.Object r1 = r0.getValue()
            X.DdO r1 = (X.DdO) r1
            r0 = 0
            r1.DgN(r4, r0, r2)
            goto L_0x0016
        L_0x0a18:
            boolean r1 = r0 instanceof X.GS2
            if (r1 == 0) goto L_0x0a86
            java.lang.Object r1 = r3.A01
            X.Dcv r1 = (X.C46352Dcv) r1
            X.0eM r1 = r1.A0B
            java.lang.Object r1 = r1.getValue()
            X.Dd4 r1 = (X.Dd4) r1
            X.GS2 r0 = (X.GS2) r0
            int r8 = r0.A01
            java.lang.String r7 = r0.A03
            java.lang.Integer r6 = r0.A02
            int r4 = r0.A00
            com.instagram.common.session.UserSession r0 = r1.A0A
            X.Dd0 r5 = X.C46354Dcy.A01(r0)
            X.0iw r3 = r1.A08
            X.C51972G9s.A1C(r6, r3)
            java.lang.String r2 = "truncation_control"
            java.util.HashSet r1 = r5.A01
            boolean r0 = r1.contains(r2)
            if (r0 != 0) goto L_0x0016
            r1.add(r2)
            com.instagram.common.session.UserSession r0 = r5.A00
            X.0wc r1 = X.AnonymousClass0kN.A01(r3, r0)
            java.lang.String r0 = "newsfeed_show_more_impression"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0016
            java.lang.Long r1 = X.DbS.A0j(r8)
            java.lang.String r0 = "position"
            r2.A9F(r0, r1)
            X.Dd1 r1 = X.Dd0.A01(r7)
            java.lang.String r0 = "section"
            r2.A8M(r1, r0)
            java.lang.String r1 = X.Dd0.A08(r6)
            r0 = 412(0x19c, float:5.77E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.Long r1 = X.DbV.A0p(r2, r0, r1, r4)
            java.lang.String r0 = "num_hidden_stories_with_show_more"
            r2.A9F(r0, r1)
        L_0x0a81:
            r2.Cgf()
            goto L_0x0016
        L_0x0a86:
            X.0wj r4 = X.0wj.A01
            r3 = 817901067(0x30c02e0b, float:1.3982925E-9)
            java.lang.String r2 = "Unhandled row impression: ActivityFeedItem type ["
            java.lang.String r1 = r0.A00
            r0 = 93
            java.lang.String r0 = X.002.A0S(r2, r1, r0)
            r4.AEf(r0, r3)
            goto L_0x0016
        L_0x0a9a:
            X.5Wy r0 = (X.C286575Wy) r0
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x0aa9
            boolean r1 = r0.Bwn()
            if (r1 != 0) goto L_0x109d
        L_0x0aa9:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0ab7
            r2 = -1910692156(0xffffffff8e1d26c4, float:-1.9370409E-30)
            java.lang.String r1 = "com.instagram.nux.fragment.ReelsTuningFragment.onCreateView.<anonymous> (ReelsTuningFragment.kt:72)"
            X.0fL.A01(r2, r1)
        L_0x0ab7:
            java.lang.Object r8 = r3.A01
            X.E18 r8 = (X.E18) r8
            X.0eM r1 = r8.A03
            java.lang.Object r1 = r1.getValue()
            X.Dka r1 = (X.C46747Dka) r1
            X.0Ud r1 = r1.A02
            r6 = 0
            X.4gU r9 = X.AnonymousClass6FW.A02(r0, r1, r6)
            androidx.compose.ui.Modifier r3 = X.C51968G9o.A0O()
            X.5RD r2 = X.C51969G9p.A0Z(r0, r6)
            int r4 = X.C287425a7.A00(r0)
            r7 = r0
            X.5Wx r7 = (X.C286565Wx) r7
            X.5RM r1 = X.C286565Wx.A04(r7)
            androidx.compose.ui.Modifier r3 = X.C287435a8.A01(r0, r3)
            X.C51973G9u.A0y(r0, r7)
            X.C51971G9r.A12(r0, r2, r1)
            X.0sL r2 = X.C287485aD.A02
            boolean r1 = r7.A0K
            if (r1 != 0) goto L_0x0af3
            boolean r1 = X.C51972G9s.A1Q(r0, r4)
            if (r1 != 0) goto L_0x0af6
        L_0x0af3:
            X.C51971G9r.A13(r0, r2, r4)
        L_0x0af6:
            X.C51965G9l.A18(r0, r3)
            java.lang.Object r1 = r9.getValue()
            X.JwG r1 = (X.C61078JwG) r1
            java.lang.Object r1 = r1.A00
            X.N4R r1 = (X.N4R) r1
            java.lang.Object r5 = r1.A00
            X.JwG r5 = (X.C61078JwG) r5
            java.lang.Object r1 = r9.getValue()
            X.JwG r1 = (X.C61078JwG) r1
            java.lang.Object r1 = r1.A00
            X.N4R r1 = (X.N4R) r1
            java.lang.Object r4 = r1.A02
            X.HLr r4 = (X.C54634HLr) r4
            r1 = 129709945(0x7bb3779, float:2.8169237E-34)
            boolean r1 = X.C51967G9n.A1Z(r0, r8, r1)
            java.lang.Object r2 = r0.ECw()
            if (r1 != 0) goto L_0x0b26
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r2 != r1) goto L_0x0b2b
        L_0x0b26:
            r1 = 6
            X.In7 r2 = X.G9w.A0o(r0, r8, r1)
        L_0x0b2b:
            X.0sP r13 = X.C51968G9o.A1A(r7, r2)
            r1 = 129711478(0x7bb3d76, float:2.8172756E-34)
            boolean r1 = X.C51967G9n.A1Z(r0, r8, r1)
            java.lang.Object r2 = r0.ECw()
            if (r1 != 0) goto L_0x0b40
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r2 != r1) goto L_0x0b45
        L_0x0b40:
            r1 = 7
            X.In7 r2 = X.G9w.A0o(r0, r8, r1)
        L_0x0b45:
            X.0sP r14 = X.C51968G9o.A1A(r7, r2)
            r1 = 129713049(0x7bb4399, float:2.8176363E-34)
            boolean r1 = X.C51967G9n.A1Z(r0, r8, r1)
            java.lang.Object r2 = r0.ECw()
            if (r1 != 0) goto L_0x0b5a
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r2 != r1) goto L_0x0b60
        L_0x0b5a:
            r1 = 19
            X.Imz r2 = X.C51975G9x.A0u(r0, r8, r1)
        L_0x0b60:
            X.0sa r9 = X.C51968G9o.A19(r7, r2)
            r1 = 129714811(0x7bb4a7b, float:2.8180408E-34)
            boolean r1 = X.C51967G9n.A1Z(r0, r8, r1)
            java.lang.Object r2 = r0.ECw()
            if (r1 != 0) goto L_0x0b75
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r2 != r1) goto L_0x0b7b
        L_0x0b75:
            r1 = 17
            X.FyD r2 = X.C51969G9p.A0y(r0, r8, r1)
        L_0x0b7b:
            X.0sa r10 = X.C51968G9o.A19(r7, r2)
            r1 = 129716635(0x7bb519b, float:2.8184596E-34)
            boolean r1 = X.C51967G9n.A1Z(r0, r8, r1)
            java.lang.Object r2 = r0.ECw()
            if (r1 != 0) goto L_0x0b90
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r2 != r1) goto L_0x0b96
        L_0x0b90:
            r1 = 18
            X.FyD r2 = X.C51969G9p.A0y(r0, r8, r1)
        L_0x0b96:
            X.0sa r11 = X.C51968G9o.A19(r7, r2)
            r1 = 129718526(0x7bb58fe, float:2.8188938E-34)
            boolean r2 = X.C51967G9n.A1Z(r0, r8, r1)
            java.lang.Object r1 = r0.ECw()
            if (r2 != 0) goto L_0x0bab
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r1 != r2) goto L_0x0bb4
        L_0x0bab:
            r2 = 2
            X.FyG r1 = new X.FyG
            r1.<init>(r8, r2)
            r0.FLL(r1)
        L_0x0bb4:
            X.0sP r15 = X.C51968G9o.A1A(r7, r1)
            r1 = 129720498(0x7bb60b2, float:2.8193465E-34)
            boolean r1 = X.C51967G9n.A1Z(r0, r8, r1)
            java.lang.Object r2 = r0.ECw()
            if (r1 != 0) goto L_0x0bc9
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r2 != r1) goto L_0x0bcf
        L_0x0bc9:
            r1 = 20
            X.InR r2 = X.C51970G9q.A0q(r0, r8, r1)
        L_0x0bcf:
            X.0Ya r3 = X.C51965G9l.A12(r7, r2)
            X.0sL r3 = (X.0sL) r3
            r1 = 129721760(0x7bb65a0, float:2.8196363E-34)
            boolean r2 = X.C51967G9n.A1Z(r0, r8, r1)
            java.lang.Object r1 = r0.ECw()
            if (r2 != 0) goto L_0x0be6
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r1 != r2) goto L_0x0bf0
        L_0x0be6:
            r2 = 16
            X.AwU r1 = new X.AwU
            r1.<init>(r8, r2)
            r0.FLL(r1)
        L_0x0bf0:
            X.0sa r12 = X.C51965G9l.A0y(r7, r1, r6)
            r17 = 8
            r7 = r5
            r8 = r4
            r16 = r3
            r18 = r6
            r6 = r0
            X.C56656I6l.A02(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = X.C51967G9n.A1R(r0)
            if (r0 == 0) goto L_0x0016
            r0 = 298573058(0x11cbdd02, float:3.216396E-28)
            goto L_0x1098
        L_0x0c0b:
            X.5Wy r0 = (X.C286575Wy) r0
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x0c1a
            boolean r1 = r0.Bwn()
            if (r1 != 0) goto L_0x109d
        L_0x0c1a:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0c28
            r2 = 1610555816(0x5fff21a8, float:3.676832E19)
            java.lang.String r1 = "com.instagram.opal.impl.ui.OpalAudienceSelectorFragment.onCreateView.<anonymous> (OpalAudienceSelectorFragment.kt:111)"
            X.0fL.A01(r2, r1)
        L_0x0c28:
            java.lang.Object r6 = r3.A01
            X.EO0 r6 = (X.EO0) r6
            X.0eM r1 = r6.A01
            java.lang.Object r1 = r1.getValue()
            X.GgH r1 = (X.C52964GgH) r1
            X.0Ud r2 = r1.A03
            r1 = 0
            X.4gU r5 = X.AnonymousClass6FW.A02(r0, r2, r1)
            androidx.compose.ui.Modifier r4 = X.C51968G9o.A0O()
            r3 = -34187145(0xfffffffffdf65877, float:-4.0931178E37)
            r2 = 40
            X.JG2 r1 = new X.JG2
            r1.<init>(r2, r5, r6)
            boolean r0 = X.C51972G9s.A1U(r0, r4, r1, r3)
            if (r0 == 0) goto L_0x0016
            r0 = -1427837463(0xffffffffaae4ede9, float:-4.066602E-13)
            goto L_0x1098
        L_0x0c54:
            X.5Wy r0 = (X.C286575Wy) r0
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x0c63
            boolean r1 = r0.Bwn()
            if (r1 != 0) goto L_0x109d
        L_0x0c63:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0c71
            r2 = 1021387879(0x3ce12467, float:0.027483178)
            java.lang.String r1 = "com.instagram.opal.impl.ui.OpalEditFragment.onCreateView.<anonymous> (OpalEditFragment.kt:76)"
            X.0fL.A01(r2, r1)
        L_0x0c71:
            r1 = 517810662(0x1edd29e6, float:2.3416614E-20)
            r0.ExS(r1)
            java.lang.Object r5 = r3.A01
            X.EO1 r5 = (X.EO1) r5
            boolean r1 = r0.AGw(r5)
            java.lang.Object r4 = r0.ECw()
            if (r1 != 0) goto L_0x0c89
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r4 != r1) goto L_0x0c8f
        L_0x0c89:
            r1 = 16
            X.G2d r4 = X.G9w.A0s(r0, r5, r1)
        L_0x0c8f:
            X.0sa r4 = (X.C62320sa) r4
            r6 = r0
            X.5Wx r6 = (X.C286565Wx) r6
            r3 = 0
            X.C286565Wx.A0L(r6, r3)
            r1 = 517812933(0x1edd32c5, float:2.3420283E-20)
            boolean r1 = X.C51967G9n.A1Z(r0, r5, r1)
            java.lang.Object r2 = r0.ECw()
            if (r1 != 0) goto L_0x0ca9
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r2 != r1) goto L_0x0caf
        L_0x0ca9:
            r1 = 17
            X.G2d r2 = X.G9w.A0s(r0, r5, r1)
        L_0x0caf:
            X.0sa r10 = X.C51965G9l.A0y(r6, r2, r3)
            r1 = 517818275(0x1edd47a3, float:2.3428913E-20)
            boolean r1 = X.C51967G9n.A1Z(r0, r5, r1)
            java.lang.Object r2 = r0.ECw()
            if (r1 != 0) goto L_0x0cc4
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r2 != r1) goto L_0x0cca
        L_0x0cc4:
            r1 = 18
            X.G2d r2 = X.G9w.A0s(r0, r5, r1)
        L_0x0cca:
            X.0sa r11 = X.C51965G9l.A0y(r6, r2, r3)
            r1 = 517820480(0x1edd5040, float:2.3432476E-20)
            boolean r1 = X.C51967G9n.A1Z(r0, r5, r1)
            java.lang.Object r2 = r0.ECw()
            if (r1 != 0) goto L_0x0cdf
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r2 != r1) goto L_0x0ce5
        L_0x0cdf:
            r1 = 19
            X.G2d r2 = X.G9w.A0s(r0, r5, r1)
        L_0x0ce5:
            X.0sa r12 = X.C51965G9l.A0y(r6, r2, r3)
            r1 = 517822363(0x1edd579b, float:2.3435518E-20)
            boolean r1 = X.C51967G9n.A1Z(r0, r5, r1)
            java.lang.Object r2 = r0.ECw()
            if (r1 != 0) goto L_0x0cfa
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r2 != r1) goto L_0x0d00
        L_0x0cfa:
            r1 = 38
            X.G4U r2 = X.C51970G9q.A0t(r0, r5, r1)
        L_0x0d00:
            X.0sP r14 = X.C51965G9l.A0z(r6, r2)
            r1 = 517824058(0x1edd5e3a, float:2.3438256E-20)
            boolean r1 = X.C51967G9n.A1Z(r0, r5, r1)
            java.lang.Object r2 = r0.ECw()
            if (r1 != 0) goto L_0x0d15
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r2 != r1) goto L_0x0d1b
        L_0x0d15:
            r1 = 39
            X.G4U r2 = X.C51970G9q.A0t(r0, r5, r1)
        L_0x0d1b:
            X.0sP r15 = X.C51965G9l.A0z(r6, r2)
            r1 = 517825796(0x1edd6504, float:2.3441064E-20)
            boolean r1 = X.C51967G9n.A1Z(r0, r5, r1)
            java.lang.Object r2 = r0.ECw()
            if (r1 != 0) goto L_0x0d30
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r2 != r1) goto L_0x0d36
        L_0x0d30:
            r1 = 20
            X.G2d r2 = X.G9w.A0s(r0, r5, r1)
        L_0x0d36:
            X.0sa r13 = X.C51965G9l.A0y(r6, r2, r3)
            X.0eM r1 = r5.A02
            java.lang.Object r2 = r1.getValue()
            X.Dkj r2 = (X.C46756Dkj) r2
            androidx.compose.ui.Modifier r1 = X.C51968G9o.A0O()
            androidx.compose.ui.Modifier r6 = X.G9t.A0p(r0, r1)
            boolean r1 = r5.A01
            r7 = r5
            r8 = r2
            r9 = r4
            r16 = r3
            r17 = r3
            r18 = r1
            r5 = r0
            X.C56640I5v.A02(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0016
            r0 = -1739169739(0xffffffff98566035, float:-2.7707424E-24)
            goto L_0x1098
        L_0x0d64:
            X.HLJ r0 = (X.HLJ) r0
            java.lang.String r10 = (java.lang.String) r10
            r12 = 0
            boolean r1 = X.AnonymousClass7TF.A1U(r12, r0, r10)
            int r0 = r0.ordinal()
            if (r0 == r12) goto L_0x0da2
            if (r0 != r1) goto L_0x1397
            java.lang.Object r0 = r3.A01
            X.EO2 r0 = (X.EO2) r0
            X.DlJ r0 = X.EO2.A00(r0)
            X.05G r3 = r0.A05
        L_0x0d7f:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.Dry r1 = (X.C47183Dry) r1
            com.instagram.opal.impl.data.OpalProfileData r4 = r1.A05
            r5 = 0
            r13 = 8063(0x1f7f, float:1.1299E-41)
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r11 = r5
            r14 = r12
            r15 = r12
            com.instagram.opal.impl.data.OpalProfileData r0 = com.instagram.opal.impl.data.OpalProfileData.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.Dry r0 = X.C47183Dry.A00((X.C61052Jvq) null, r0, (com.instagram.opal.impl.data.OpalProfileData) null, (X.C62520KhB) null, r1, (java.lang.Integer) null, 0, 2046, false, false)
            boolean r0 = r3.AIY(r2, r0)
            if (r0 == 0) goto L_0x0d7f
            goto L_0x0016
        L_0x0da2:
            java.lang.Object r0 = r3.A01
            X.EO2 r0 = (X.EO2) r0
            X.DlJ r0 = X.EO2.A00(r0)
            X.05G r3 = r0.A05
        L_0x0dac:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.Dry r1 = (X.C47183Dry) r1
            com.instagram.opal.impl.data.OpalProfileData r13 = r1.A05
            r14 = 0
            r22 = 8183(0x1ff7, float:1.1467E-41)
            r15 = r14
            r16 = r14
            r17 = r10
            r18 = r14
            r19 = r14
            r20 = r14
            r21 = r12
            r23 = r12
            r24 = r12
            com.instagram.opal.impl.data.OpalProfileData r0 = com.instagram.opal.impl.data.OpalProfileData.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.Dry r0 = X.C47183Dry.A00((X.C61052Jvq) null, r0, (com.instagram.opal.impl.data.OpalProfileData) null, (X.C62520KhB) null, r1, (java.lang.Integer) null, 0, 2046, false, false)
            boolean r0 = r3.AIY(r2, r0)
            if (r0 == 0) goto L_0x0dac
            goto L_0x0016
        L_0x0dd9:
            X.5Wy r0 = (X.C286575Wy) r0
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x0de8
            boolean r1 = r0.Bwn()
            if (r1 != 0) goto L_0x109d
        L_0x0de8:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0df6
            r2 = 525309136(0x1f4f94d0, float:4.395705E-20)
            java.lang.String r1 = "com.instagram.opal.impl.ui.OpalNuxFragment.onCreateView.<anonymous>.<anonymous> (OpalNuxFragment.kt:79)"
            X.0fL.A01(r2, r1)
        L_0x0df6:
            java.lang.Object r4 = r3.A01
            X.ENy r4 = (X.C47947ENy) r4
            boolean r1 = r4.A01
            if (r1 == 0) goto L_0x0e37
            r1 = -937545865(0xffffffffc81e2f77, float:-161981.86)
            r0.ExS(r1)
            androidx.compose.ui.Modifier r3 = X.C51969G9p.A0U()
            r1 = -2108450370(0xffffffff825399be, float:-1.5545954E-37)
            boolean r1 = X.C51967G9n.A1Z(r0, r4, r1)
            java.lang.Object r2 = r0.ECw()
            if (r1 != 0) goto L_0x0e19
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r2 != r1) goto L_0x0e22
        L_0x0e19:
            r1 = 0
            X.G2a r2 = new X.G2a
            r2.<init>(r4, r1)
            r0.FLL(r2)
        L_0x0e22:
            X.0sa r2 = (X.C62320sa) r2
            X.C51965G9l.A1V(r0)
            r1 = 48
            X.C56330Hwh.A01(r0, r3, r2, r1)
        L_0x0e2c:
            boolean r0 = X.C51970G9q.A1Z(r0)
            if (r0 == 0) goto L_0x0016
            r0 = 1368385935(0x518fe98f, float:7.7262348E10)
            goto L_0x1098
        L_0x0e37:
            r1 = -937399948(0xffffffffc8206974, float:-164261.81)
            r0.ExS(r1)
            X.G7h r2 = r4.A00
            r1 = 0
            X.C55076Hbl.A00(r0, r2, r1)
            goto L_0x0e2c
        L_0x0e44:
            X.5Wy r0 = (X.C286575Wy) r0
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x0e53
            boolean r1 = r0.Bwn()
            if (r1 != 0) goto L_0x109d
        L_0x0e53:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0e61
            r2 = 720988660(0x2af969f4, float:4.4304805E-13)
            java.lang.String r1 = "com.instagram.opal.impl.ui.OpalNuxFragment.onCreateView.<anonymous> (OpalNuxFragment.kt:78)"
            X.0fL.A01(r2, r1)
        L_0x0e61:
            androidx.compose.ui.Modifier r4 = X.C51969G9p.A0U()
            long r1 = X.C51966G9m.A08(r0)
            androidx.compose.ui.Modifier r5 = X.C51966G9m.A0X(r4, r1)
            r4 = -883759101(0xffffffffcb52e803, float:-1.3821955E7)
            java.lang.Object r3 = r3.A01
            r2 = 42
            X.JFx r1 = new X.JFx
            r1.<init>(r3, r2)
            boolean r0 = X.C51972G9s.A1T(r0, r5, r1, r4)
            if (r0 == 0) goto L_0x0016
            r0 = 504453264(0x1e115890, float:7.69455E-21)
            goto L_0x1098
        L_0x0e84:
            X.5Wy r0 = (X.C286575Wy) r0
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x0e93
            boolean r1 = r0.Bwn()
            if (r1 != 0) goto L_0x109d
        L_0x0e93:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0ea1
            r2 = 157041256(0x95c4268, float:2.651276E-33)
            java.lang.String r1 = "com.instagram.opal.impl.ui.OpalSwitchIndicatorHelperImpl.addOpalFlipShimmer.<anonymous>.<anonymous> (OpalSwitchIndicatorHelperImpl.kt:87)"
            X.0fL.A01(r2, r1)
        L_0x0ea1:
            r1 = 1779682155(0x6a13cb6b, float:4.4668177E25)
            r0.ExS(r1)
            java.lang.Object r2 = r3.A01
            boolean r1 = r0.AGw(r2)
            java.lang.Object r3 = r0.ECw()
            if (r1 != 0) goto L_0x0eb7
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r3 != r1) goto L_0x0ec0
        L_0x0eb7:
            r1 = 6
            X.G2a r3 = new X.G2a
            r3.<init>(r2, r1)
            r0.FLL(r3)
        L_0x0ec0:
            X.0sa r3 = (X.C62320sa) r3
            X.C51965G9l.A1V(r0)
            androidx.compose.ui.Modifier r2 = X.C51968G9o.A0O()
            r1 = 48
            X.C55072Hbh.A00(r0, r2, r3, r1)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0016
            r0 = 906583864(0x36095f38, float:2.0470015E-6)
            goto L_0x1098
        L_0x0ed9:
            X.5Wy r0 = (X.C286575Wy) r0
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x0ee8
            boolean r1 = r0.Bwn()
            if (r1 != 0) goto L_0x109d
        L_0x0ee8:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0ef6
            r2 = -1838226464(0xffffffff926ee3e0, float:-7.5380436E-28)
            java.lang.String r1 = "com.instagram.opal.impl.ui.OpalSwitchIndicatorHelperImpl.addOpalFlipShimmer.<anonymous> (OpalSwitchIndicatorHelperImpl.kt:86)"
            X.0fL.A01(r2, r1)
        L_0x0ef6:
            androidx.compose.ui.Modifier r5 = X.C51968G9o.A0O()
            r4 = -808532015(0xffffffffcfcec7d1, float:-6.9384033E9)
            java.lang.Object r3 = r3.A01
            r2 = 44
            X.JFx r1 = new X.JFx
            r1.<init>(r3, r2)
            boolean r0 = X.C51972G9s.A1U(r0, r5, r1, r4)
            if (r0 == 0) goto L_0x0016
            r0 = 1846549058(0x6e101a42, float:1.1149396E28)
            goto L_0x1098
        L_0x0f11:
            X.5Wy r0 = (X.C286575Wy) r0
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x0f20
            boolean r1 = r0.Bwn()
            if (r1 != 0) goto L_0x109d
        L_0x0f20:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0f2e
            r2 = -709026521(0xffffffffd5bd1d27, float:-2.59916133E13)
            java.lang.String r1 = "com.instagram.opal.impl.ui.OpalSwitchIndicatorHelperImpl.addOpalSwitchIndicator.<anonymous>.<anonymous> (OpalSwitchIndicatorHelperImpl.kt:30)"
            X.0fL.A01(r2, r1)
        L_0x0f2e:
            java.lang.Object r1 = r3.A01
            X.IWD r1 = (X.IWD) r1
            X.GgW r3 = r1.A00
            androidx.compose.ui.Modifier r2 = X.C51969G9p.A0U()
            r1 = 48
            X.I53.A03(r0, r2, r3, r1)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0016
            r0 = -1168415265(0xffffffffba5b65df, float:-8.369367E-4)
            goto L_0x1098
        L_0x0f48:
            X.5Wy r0 = (X.C286575Wy) r0
            int r2 = X.C51968G9o.A0B(r10)
            r1 = 2
            if (r2 != r1) goto L_0x0f57
            boolean r1 = r0.Bwn()
            if (r1 != 0) goto L_0x109d
        L_0x0f57:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0f65
            r2 = 560845738(0x216dd3aa, float:8.057886E-19)
            java.lang.String r1 = "com.instagram.opal.impl.ui.OpalSwitchIndicatorHelperImpl.addOpalSwitchIndicator.<anonymous> (OpalSwitchIndicatorHelperImpl.kt:29)"
            X.0fL.A01(r2, r1)
        L_0x0f65:
            androidx.compose.ui.Modifier r5 = X.C51969G9p.A0U()
            r4 = 976566829(0x3a353a2d, float:6.913271E-4)
            java.lang.Object r3 = r3.A01
            r2 = 46
            X.JFx r1 = new X.JFx
            r1.<init>(r3, r2)
            boolean r0 = X.C51972G9s.A1U(r0, r5, r1, r4)
            if (r0 == 0) goto L_0x0016
            r0 = -1887898861(0xffffffff8f78f313, float:-1.22741584E-29)
            goto L_0x1098
        L_0x0f80:
            X.5Wy r0 = (X.C286575Wy) r0
            int r2 = X.C51968G9o.A0C(r10)
            r1 = 2
            if (r2 != r1) goto L_0x0f8f
            boolean r1 = r0.Bwn()
            if (r1 != 0) goto L_0x109d
        L_0x0f8f:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0f9d
            r2 = 1750709944(0x6859b6b8, float:4.1124964E24)
            java.lang.String r1 = "com.instagram.partnerprogram.fragment.PublisherControlBlockedCategoriesComposeFragment.onCreateView.<anonymous>.<anonymous> (PublisherControlBlockedCategoriesComposeFragment.kt:113)"
            X.0fL.A01(r2, r1)
        L_0x0f9d:
            java.lang.Object r4 = r3.A01
            X.E2Q r4 = (X.E2Q) r4
            X.0eM r6 = r4.A02
            java.lang.Object r1 = r6.getValue()
            X.Dl0 r1 = (X.C46773Dl0) r1
            X.05G r1 = r1.A08
            X.05F r1 = X.10b.A03(r1)
            r5 = 8
            X.4gU r3 = X.AnonymousClass6FW.A02(r0, r1, r5)
            java.lang.Object r2 = r3.getValue()
            boolean r1 = r2 instanceof X.C47961EOm
            if (r1 == 0) goto L_0x0fd2
            r1 = -1800208230(0xffffffff94b3009a, float:-1.8074618E-26)
            r0.ExS(r1)
            r1 = 0
            X.I54.A00(r0, r1)
        L_0x0fc7:
            boolean r0 = X.C51970G9q.A1Z(r0)
            if (r0 == 0) goto L_0x0016
            r0 = -1605306545(0xffffffffa050f74f, float:-1.7700113E-19)
            goto L_0x1098
        L_0x0fd2:
            boolean r1 = r2 instanceof X.C47960EOl
            if (r1 == 0) goto L_0x139c
            r1 = -1800111324(0xffffffff94b47b24, float:-1.8223926E-26)
            r0.ExS(r1)
            X.0eM r1 = r4.A00
            java.lang.Object r1 = r1.getValue()
            X.Dbx r1 = (X.C46329Dbx) r1
            X.34p r1 = r1.A00
            r1.A05()
            java.lang.Object r2 = r3.getValue()
            X.EaX r2 = (X.C48191EaX) r2
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.partnerprogram.viewmodel.BlockedCategoriesViewModel.BlockedCategoriesScreenState.BlockedCategoryDetails"
            X.0qQ.A0C(r2, r1)
            X.EOl r2 = (X.C47960EOl) r2
            java.util.List r4 = r2.A00
            java.lang.Object r1 = r6.getValue()
            X.Dl0 r1 = (X.C46773Dl0) r1
            int r3 = r1.A01
            java.lang.Object r1 = r6.getValue()
            X.FyG r2 = new X.FyG
            r2.<init>(r1, r5)
            java.lang.Object r1 = r6.getValue()
            X.Dl0 r1 = (X.C46773Dl0) r1
            com.instagram.api.schemas.IGRevShareProductType r1 = r1.A02
            r9 = 64
            r5 = r1
            r6 = r4
            r7 = r2
            r8 = r3
            r4 = r0
            X.I54.A01(r4, r5, r6, r7, r8, r9)
            goto L_0x0fc7
        L_0x101c:
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r10 = (com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView) r10
            X.AnonymousClass7TG.A1N(r0, r10)
            java.lang.Object r4 = r3.A01
            X.EO2 r4 = (X.EO2) r4
            r1 = 0
            r4.A09 = r1
            androidx.fragment.app.FragmentActivity r2 = r4.getActivity()
            r1 = 0
            X.Upq r3 = new X.Upq
            r3.<init>((android.app.Activity) r2, (android.view.View) r10, (X.C230222pE) r1)
            android.graphics.RectF r1 = X.0nA.A01
            android.graphics.RectF r2 = X.AnonymousClass7TE.A0Y()
            X.0nA.A0L(r2, r10)
            X.X4W r1 = r3.A00
            android.graphics.RectF r1 = r1.C4O()
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x1053
            android.graphics.RectF r1 = X.AnonymousClass7TE.A0Y()
            X.0nA.A0L(r1, r10)
            r3.A0D(r1)
        L_0x1053:
            X.32A r2 = r4.A03
            java.lang.String r1 = "reelViewerLauncher"
            if (r2 == 0) goto L_0x13cd
            r2.A05 = r3
            java.lang.String r1 = r4.A0H
            r2.A0C = r1
            X.3BQ r1 = X.AnonymousClass3BQ.OPAL
            r2.A08(r0, r1, r10)
            goto L_0x0016
        L_0x1066:
            X.5Wy r0 = (X.C286575Wy) r0
            int r2 = X.C51968G9o.A0C(r10)
            r1 = 2
            if (r2 != r1) goto L_0x1075
            boolean r1 = r0.Bwn()
            if (r1 != 0) goto L_0x109d
        L_0x1075:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x1083
            r2 = 1094399617(0x413b3681, float:11.700807)
            java.lang.String r1 = "com.instagram.partnerprogram.fragment.PublisherControlBlockedCategoriesComposeFragment.onCreateView.<anonymous> (PublisherControlBlockedCategoriesComposeFragment.kt:112)"
            X.0fL.A01(r2, r1)
        L_0x1083:
            r4 = -1185845861(0xffffffffb9516d9b, float:-1.9972624E-4)
            java.lang.Object r3 = r3.A01
            r2 = 48
            X.JFx r1 = new X.JFx
            r1.<init>(r3, r2)
            boolean r0 = X.C51975G9x.A1T(r0, r1, r4)
            if (r0 == 0) goto L_0x0016
            r0 = -860348580(0xffffffffccb81f5c, float:-9.6533216E7)
        L_0x1098:
            X.0fL.A00(r0)
            goto L_0x0016
        L_0x109d:
            r0.Evl()
            goto L_0x0016
        L_0x10a2:
            com.instagram.common.ui.widget.imageview.IgImageView r10 = (com.instagram.common.ui.widget.imageview.IgImageView) r10
            r0 = 1
            X.0qQ.A0B(r10, r0)
            java.lang.Object r0 = r3.A01
            X.GxS r0 = (X.C53984GxS) r0
            com.instagram.common.typedurl.ImageUrl r1 = r0.A05
            X.0iw r0 = r0.A04
            r10.setUrl(r1, r0)
            r0 = 21
            goto L_0x12c7
        L_0x10b7:
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r0 = 1
            X.0qQ.A0B(r10, r0)
            java.lang.Object r1 = r3.A01
            X.GxS r1 = (X.C53984GxS) r1
            android.widget.ImageView$ScaleType r0 = r1.A03
            if (r0 == 0) goto L_0x10c8
            r10.setScaleType(r0)
        L_0x10c8:
            r0 = 40
            goto L_0x1114
        L_0x10cb:
            android.view.View r1 = X.C51969G9p.A0P(r10)
            r0 = 2131437492(0x7f0b27b4, float:1.8496884E38)
            android.view.View r2 = r1.findViewById(r0)
            if (r2 == 0) goto L_0x10ee
            int r0 = r2.getVisibility()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 8
            r2.setVisibility(r0)
        L_0x10e5:
            r0 = 41
            X.Wvt r3 = new X.Wvt
            r3.<init>(r0, r1, r2)
            goto L_0x12cc
        L_0x10ee:
            r1 = 0
            goto L_0x10e5
        L_0x10f0:
            com.instagram.ui.widget.spinner.SpinnerImageView r10 = (com.instagram.ui.widget.spinner.SpinnerImageView) r10
            r0 = 1
            X.0qQ.A0B(r10, r0)
            java.lang.Object r0 = r3.A01
            X.Gwf r0 = (X.C53935Gwf) r0
            X.3uy r0 = r0.A00
            r10.setLoadingStatus(r0)
            X.Is6 r3 = X.C58449Is6.A00
            goto L_0x12cc
        L_0x1103:
            android.widget.TextView r10 = X.G9w.A0A(r10)
            java.lang.CharSequence r1 = r10.getText()
            java.lang.Object r0 = r3.A01
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.setText(r0)
            r0 = 42
        L_0x1114:
            X.Wvt r3 = new X.Wvt
            r3.<init>(r0, r10, r1)
            goto L_0x12cc
        L_0x111b:
            android.widget.TextView r5 = X.G9w.A0A(r10)
            float r4 = r5.getTextSize()
            java.lang.Object r2 = r3.A01
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x1131
            r1 = 0
            float r0 = r2.floatValue()
            r5.setTextSize(r1, r0)
        L_0x1131:
            r0 = 0
            X.GLP r3 = new X.GLP
            r3.<init>(r5, r2, r4, r0)
            goto L_0x12cc
        L_0x1139:
            android.widget.TextView r4 = X.G9w.A0A(r10)
            android.content.res.ColorStateList r2 = r4.getTextColors()
            java.lang.Object r1 = r3.A01
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x114e
            int r0 = r1.intValue()
            r4.setTextColor(r0)
        L_0x114e:
            r0 = 25
            X.Iw4 r3 = new X.Iw4
            r3.<init>((int) r0, (java.lang.Object) r4, (java.lang.Object) r1, (java.lang.Object) r2)
            goto L_0x12cc
        L_0x1157:
            android.widget.TextView r10 = X.G9w.A0A(r10)
            java.lang.Object r0 = r3.A01
            android.text.method.MovementMethod r0 = (android.text.method.MovementMethod) r0
            r10.setMovementMethod(r0)
            r0 = 25
            goto L_0x12c7
        L_0x1166:
            android.widget.TextView r5 = X.G9w.A0A(r10)
            boolean r4 = r5.getIncludeFontPadding()
            java.lang.Object r2 = r3.A01
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x117b
            boolean r0 = r2.booleanValue()
            r5.setIncludeFontPadding(r0)
        L_0x117b:
            r0 = 19
            goto L_0x120b
        L_0x117f:
            com.instagram.feed.ui.text.BulletAwareTextView r10 = (com.instagram.feed.ui.text.BulletAwareTextView) r10
            r0 = 1
            X.0qQ.A0B(r10, r0)
            java.lang.Object r0 = r3.A01
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x1192
            int r0 = r0.intValue()
            r10.setSpacingAdd(r0)
        L_0x1192:
            r0 = 26
            goto L_0x12c7
        L_0x1196:
            android.view.View r10 = X.C51969G9p.A0P(r10)
            java.lang.Object r0 = r3.A01
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x11a8
            int r1 = r0.intValue()
            r0 = 0
            r10.setPadding(r0, r0, r1, r0)
        L_0x11a8:
            r0 = 27
            goto L_0x12c7
        L_0x11ac:
            android.widget.TextView r10 = (android.widget.TextView) r10
            r5 = 1
            X.0qQ.A0B(r10, r5)
            float r4 = r10.getLineSpacingMultiplier()
            java.lang.Object r2 = r3.A01
            X.3bF r2 = (X.C244473bF) r2
            java.lang.Float r0 = r2.A07
            if (r0 == 0) goto L_0x11c9
            float r1 = r10.getLineSpacingExtra()
            float r0 = r0.floatValue()
            r10.setLineSpacing(r1, r0)
        L_0x11c9:
            X.GLP r3 = new X.GLP
            r3.<init>(r10, r2, r4, r5)
            goto L_0x12cc
        L_0x11d0:
            android.widget.TextView r4 = X.G9w.A0A(r10)
            int r2 = r4.getGravity()
            java.lang.Object r1 = r3.A01
            X.3bF r1 = (X.C244473bF) r1
            java.lang.Integer r0 = r1.A09
            if (r0 == 0) goto L_0x11e7
            int r0 = r0.intValue()
            r4.setGravity(r0)
        L_0x11e7:
            r0 = 13
            goto L_0x1267
        L_0x11ea:
            android.widget.TextView r5 = X.G9w.A0A(r10)
            android.text.TextPaint r0 = r5.getPaint()
            boolean r4 = r0.isFakeBoldText()
            java.lang.Object r2 = r3.A01
            X.3bF r2 = (X.C244473bF) r2
            java.lang.Boolean r0 = r2.A05
            if (r0 == 0) goto L_0x1209
            android.text.TextPaint r1 = r5.getPaint()
            boolean r0 = r0.booleanValue()
            r1.setFakeBoldText(r0)
        L_0x1209:
            r0 = 20
        L_0x120b:
            X.GL3 r3 = new X.GL3
            r3.<init>(r0, r5, r2, r4)
            goto L_0x12cc
        L_0x1212:
            android.widget.TextView r10 = X.G9w.A0A(r10)
            java.lang.Object r0 = r3.A01
            X.3bF r0 = (X.C244473bF) r0
            java.lang.CharSequence r0 = r0.A06
            r10.setText(r0)
            r0 = 29
            goto L_0x12c7
        L_0x1223:
            android.widget.TextView r10 = X.G9w.A0A(r10)
            java.lang.Object r0 = r3.A01
            X.3bF r0 = (X.C244473bF) r0
            android.text.method.MovementMethod r0 = r0.A01
            r10.setMovementMethod(r0)
            r0 = 30
            goto L_0x12c7
        L_0x1234:
            android.widget.TextView r4 = X.G9w.A0A(r10)
            android.content.res.ColorStateList r2 = r4.getTextColors()
            java.lang.Object r1 = r3.A01
            X.3bF r1 = (X.C244473bF) r1
            java.lang.Integer r0 = r1.A0B
            if (r0 == 0) goto L_0x124b
            int r0 = r0.intValue()
            r4.setTextColor(r0)
        L_0x124b:
            r0 = 26
            goto L_0x129f
        L_0x124e:
            android.widget.TextView r4 = X.G9w.A0A(r10)
            int r2 = r4.getMaxLines()
            java.lang.Object r1 = r3.A01
            X.3bF r1 = (X.C244473bF) r1
            java.lang.Integer r0 = r1.A0A
            if (r0 == 0) goto L_0x1265
            int r0 = r0.intValue()
            r4.setMaxLines(r0)
        L_0x1265:
            r0 = 14
        L_0x1267:
            X.GL8 r3 = new X.GL8
            r3.<init>(r2, r0, r1, r4)
            goto L_0x12cc
        L_0x126d:
            android.widget.TextView r5 = X.G9w.A0A(r10)
            float r4 = r5.getTextSize()
            java.lang.Object r2 = r3.A01
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x1283
            r1 = 0
            float r0 = r2.floatValue()
            r5.setTextSize(r1, r0)
        L_0x1283:
            r0 = 2
            X.GLP r3 = new X.GLP
            r3.<init>(r2, r5, r4, r0)
            goto L_0x12cc
        L_0x128a:
            android.widget.TextView r4 = X.G9w.A0A(r10)
            android.text.TextUtils$TruncateAt r2 = r4.getEllipsize()
            java.lang.Object r1 = r3.A01
            X.3bF r1 = (X.C244473bF) r1
            android.text.TextUtils$TruncateAt r0 = r1.A00
            if (r0 == 0) goto L_0x129d
            r4.setEllipsize(r0)
        L_0x129d:
            r0 = 27
        L_0x129f:
            X.Iw4 r3 = new X.Iw4
            r3.<init>((int) r0, (java.lang.Object) r2, (java.lang.Object) r1, (java.lang.Object) r4)
            goto L_0x12cc
        L_0x12a5:
            com.instagram.ui.widget.textview.IgTextLayoutView r10 = (com.instagram.ui.widget.textview.IgTextLayoutView) r10
            r0 = 1
            X.0qQ.A0B(r10, r0)
            java.lang.Object r0 = r3.A01
            X.4Fj r0 = (X.C262654Fj) r0
            android.text.Layout r0 = r0.A00
            r10.setTextLayout(r0)
            X.54U r3 = X.AnonymousClass54U.A00
            goto L_0x12cc
        L_0x12b7:
            com.instagram.ui.widget.textview.IgTextLayoutView r10 = (com.instagram.ui.widget.textview.IgTextLayoutView) r10
            r0 = 1
            X.0qQ.A0B(r10, r0)
            java.lang.Object r0 = r3.A01
            X.4Fj r0 = (X.C262654Fj) r0
            java.lang.Integer r0 = r0.A02
            r10.A01 = r0
            r0 = 31
        L_0x12c7:
            X.Ink r3 = new X.Ink
            r3.<init>(r10, r0)
        L_0x12cc:
            X.3eI r4 = X.C51965G9l.A0f(r3)
            return r4
        L_0x12d1:
            X.5Wy r2 = X.C51966G9m.A0R(r0, r10)
            r0 = -287361485(0xffffffffeedf3633, float:-3.454034E28)
            boolean r0 = X.C51967G9n.A1U(r2, r0)
            if (r0 == 0) goto L_0x12e6
            r1 = 1082300010(0x4082966a, float:4.080861)
            java.lang.String r0 = "com.instagram.nux.reelstuning.ui.ReelsTuningCardStack.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReelsTuningCardStack.kt:372)"
            X.0fL.A01(r1, r0)
        L_0x12e6:
            r7 = 0
            java.lang.Object r0 = r3.A01
            X.Hns r0 = (X.C55812Hns) r0
            com.instagram.user.model.User r5 = r0.A02
            r12 = 1
            if (r5 == 0) goto L_0x12f7
            boolean r1 = r5.A29()
            r0 = 1
            if (r1 == r12) goto L_0x12f8
        L_0x12f7:
            r0 = 0
        L_0x12f8:
            r4 = 0
            java.lang.String r3 = " @"
            if (r0 == 0) goto L_0x137c
            r0 = 1725243307(0x66d51fab, float:5.032241E23)
            r2.ExS(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            r0 = 2131975854(0x7f135eae, float:1.9588812E38)
        L_0x130a:
            java.lang.String r0 = X.C288035bG.A00(r2, r0)
            r1.append(r0)
            r1.append(r3)
            if (r5 == 0) goto L_0x131a
            java.lang.String r4 = r5.getUsername()
        L_0x131a:
            java.lang.String r6 = X.AnonymousClass7TF.A0l(r4, r1)
            X.5Wx r1 = X.C51965G9l.A0H(r2, r7)
            r4 = 0
            if (r5 == 0) goto L_0x1372
            boolean r0 = r5.A29()
            if (r0 != r12) goto L_0x1372
            r0 = 1725260263(0x66d561e7, float:5.0383502E23)
            r2.ExS(r0)
            r0 = 2131238960(0x7f082030, float:1.8094213E38)
        L_0x1334:
            X.2DO r5 = X.C287975bA.A00(r2, r0, r7)
            X.C286565Wx.A0L(r1, r7)
            X.Gln r3 = new X.Gln
            r8 = r7
            r9 = r7
            r10 = r7
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0 = 2131972171(0x7f13504b, float:1.9581342E38)
            java.lang.String r11 = X.C288035bG.A00(r2, r0)
            r0 = 2131238715(0x7f081f3b, float:1.8093717E38)
            X.2DO r10 = X.C287975bA.A00(r2, r0, r7)
            X.Gln r8 = new X.Gln
            r9 = r4
            r13 = r7
            r14 = r7
            r15 = r12
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            X.Gln[] r0 = new X.C53301Gln[]{r3, r8}
            X.62O r4 = X.AnonymousClass62Q.A04(r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x136e
            r0 = 1293498210(0x4d193762, float:1.60658976E8)
            X.0fL.A00(r0)
        L_0x136e:
            X.C286565Wx.A0L(r1, r7)
            return r4
        L_0x1372:
            r0 = 1725266149(0x66d578e5, float:5.040471E23)
            r2.ExS(r0)
            r0 = 2131238947(0x7f082023, float:1.8094187E38)
            goto L_0x1334
        L_0x137c:
            r0 = 1725250345(0x66d53b29, float:5.034777E23)
            r2.ExS(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            r0 = 2131962530(0x7f132aa2, float:1.9561788E38)
            goto L_0x130a
        L_0x138a:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x138f:
            r1 = 1999363700(0x772bde74, float:3.4859166E33)
            X.Wub r0 = X.C51972G9s.A0v(r0, r3, r1)
            throw r0
        L_0x1397:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x139c:
            r1 = 1327401411(0x4f1e89c3, float:2.65982848E9)
            X.Wub r0 = X.C51973G9u.A0o(r0, r1)
            throw r0
        L_0x13a4:
            X.3xP r0 = (X.C257443xP) r0
            X.3xP r10 = (X.C257443xP) r10
            X.0qQ.A0A(r0)
            X.0qQ.A0A(r10)
            boolean r2 = r0.A06()
            r1 = 0
            if (r2 == 0) goto L_0x1409
            java.lang.Object r0 = r0.A03()
            X.Duw r0 = (X.C47329Duw) r0
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x13eb
            java.lang.Object r0 = X.AnonymousClass7TE.A13(r0)
            X.EtM r0 = (X.EtM) r0
            if (r0 == 0) goto L_0x13d5
            java.util.List r3 = r0.A00
            if (r3 != 0) goto L_0x13d6
            java.lang.String r1 = "violationsData"
        L_0x13cd:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x13d5:
            r3 = r1
        L_0x13d6:
            boolean r0 = r10.A06()
            if (r0 == 0) goto L_0x1401
            java.lang.Object r0 = r10.A03()
            X.CFn r0 = (X.C43847CFn) r0
            if (r0 == 0) goto L_0x13ee
            java.lang.String r2 = r0.A00
            if (r2 != 0) goto L_0x13ef
            java.lang.String r1 = "appealButtonState"
            goto L_0x13cd
        L_0x13eb:
            java.lang.String r1 = "productViolations"
            goto L_0x13cd
        L_0x13ee:
            r2 = r1
        L_0x13ef:
            java.lang.Object r0 = r10.A03()
            X.CFn r0 = (X.C43847CFn) r0
            if (r0 == 0) goto L_0x13f9
            java.lang.String r1 = r0.A01
        L_0x13f9:
            r0 = 26
            X.JV7 r4 = new X.JV7
            r4.<init>((java.lang.Object) r3, (java.lang.String) r2, (java.lang.String) r1, (int) r0)
            return r4
        L_0x1401:
            r0 = 26
            X.JV7 r4 = new X.JV7
            r4.<init>((java.lang.Object) r3, (java.lang.String) r1, (java.lang.String) r1, (int) r0)
            return r4
        L_0x1409:
            r0 = 26
            X.JV7 r4 = new X.JV7
            r4.<init>((java.lang.Object) r1, (java.lang.String) r1, (java.lang.String) r1, (int) r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59345JFx.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
