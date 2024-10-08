package X;

public final class GL3 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GL3(int i, Object obj, Object obj2, boolean z) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = z;
        this.A02 = obj2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        if (r3.CRs(r4) != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0527, code lost:
        if (X.182.A06(X.0Tu.A05, r4.A1D, 36321550579934724L) != false) goto L_0x0529;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x060e, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x062e, code lost:
        return java.lang.Boolean.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x032b, code lost:
        r1.Epw(java.lang.Boolean.valueOf(r0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r36 = this;
            r1 = r36
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0612;
                case 1: goto L_0x05e3;
                case 2: goto L_0x0007;
                case 3: goto L_0x05cb;
                case 4: goto L_0x0568;
                case 5: goto L_0x04f0;
                case 6: goto L_0x04d5;
                case 7: goto L_0x04a9;
                case 8: goto L_0x0478;
                case 9: goto L_0x044c;
                case 10: goto L_0x03e9;
                case 11: goto L_0x03d3;
                case 12: goto L_0x0007;
                case 13: goto L_0x0007;
                case 14: goto L_0x03c3;
                case 15: goto L_0x03c3;
                case 16: goto L_0x03a3;
                case 17: goto L_0x035a;
                case 18: goto L_0x035a;
                case 19: goto L_0x034b;
                case 20: goto L_0x0334;
                case 21: goto L_0x0311;
                case 22: goto L_0x02c1;
                case 23: goto L_0x027d;
                case 24: goto L_0x0258;
                case 25: goto L_0x0244;
                case 26: goto L_0x0223;
                case 27: goto L_0x017e;
                case 28: goto L_0x016d;
                case 29: goto L_0x013c;
                case 30: goto L_0x0124;
                case 31: goto L_0x0102;
                case 32: goto L_0x00e6;
                case 33: goto L_0x00e6;
                case 34: goto L_0x00c9;
                case 35: goto L_0x00a5;
                case 36: goto L_0x008a;
                case 37: goto L_0x0069;
                case 38: goto L_0x0059;
                case 39: goto L_0x002c;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.HzL r0 = X.C59656JRy.A00
            java.lang.Object r3 = r1.A02
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r2 = r1.A01
            X.1L5 r2 = (X.1L5) r2
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0029
            java.util.List r0 = X.C56489HzL.A01
        L_0x0017:
            java.util.Set r1 = X.00k.A0k(r0)
            r0 = 0
            X.0qQ.A0B(r3, r0)
            r0 = 1
            X.0qQ.A0B(r2, r0)
            X.GOn r5 = new X.GOn
            r5.<init>(r3, r2, r1)
            return r5
        L_0x0029:
            java.util.List r0 = X.C56489HzL.A00
            goto L_0x0017
        L_0x002c:
            java.lang.Object r0 = r1.A02
            X.GFJ r0 = (X.GFJ) r0
            X.4bN r4 = r0.A06
            X.JTB r3 = r0.A0H
            boolean r2 = r1.A03
            java.lang.Object r0 = r1.A01
            X.2Wa r0 = (X.2Wa) r0
            java.lang.Object r0 = r0.A03
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r2 != 0) goto L_0x0053
            if (r0 != 0) goto L_0x0053
            boolean r0 = r3.CRr(r4)
            if (r0 != 0) goto L_0x0053
            boolean r1 = r3.CRs(r4)
            r0 = 0
            if (r1 == 0) goto L_0x0054
        L_0x0053:
            r0 = 1
        L_0x0054:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x0059:
            boolean r3 = r1.A03
            java.lang.Object r2 = r1.A01
            X.1Xj r2 = (X.1Xj) r2
            java.lang.Object r0 = r1.A02
            X.GFJ r0 = (X.GFJ) r0
            X.GFu r5 = new X.GFu
            r5.<init>(r2, r0, r3)
            return r5
        L_0x0069:
            java.lang.Object r3 = r1.A01
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r2 = 2131442850(0x7f0b3ca2, float:1.8507751E38)
            android.view.View r0 = r3.requireViewById(r2)
            X.0qQ.A07(r0)
            android.view.View r2 = r0.requireViewById(r2)
            X.0qQ.A07(r2)
            r0 = 0
            r2.setVisibility(r0)
            boolean r1 = r1.A03
            r0 = 0
            X.C52222GJn.A04(r3, r0, r0, r1)
            goto L_0x060c
        L_0x008a:
            java.lang.Object r0 = r1.A02
            X.GHU r0 = (X.GHU) r0
            com.instagram.common.session.UserSession r3 = r0.A04
            X.4DU r5 = r0.A06
            java.lang.Object r4 = r1.A01
            X.1Xj r4 = (X.1Xj) r4
            X.GKd r2 = X.C52236GKd.A1Q
            boolean r0 = r1.A03
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            java.lang.String r7 = "dubbed_with_ai"
            X.C52086GEg.A0C(r2, r3, r4, r5, r6, r7)
            goto L_0x060c
        L_0x00a5:
            boolean r2 = r1.A03
            java.lang.Object r0 = r1.A02
            X.GGs r0 = (X.C52150GGs) r0
            if (r2 == 0) goto L_0x00b3
            X.GEa r0 = r0.A08
            boolean r2 = r0.A0I
            goto L_0x062a
        L_0x00b3:
            com.instagram.common.session.UserSession r0 = r0.A01
            X.2f1 r2 = X.AnonymousClass2f1.A00(r0)
            java.lang.Object r0 = r1.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            com.instagram.user.model.FollowStatus r1 = r2.A0N(r0)
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A06
            r2 = 0
            if (r1 != r0) goto L_0x062a
            r2 = 1
            goto L_0x062a
        L_0x00c9:
            java.lang.Object r4 = r1.A01
            X.4bN r4 = (X.C267324bN) r4
            java.lang.Object r0 = r1.A02
            X.GIt r0 = (X.C52202GIt) r0
            com.instagram.common.session.UserSession r3 = r0.A03
            boolean r2 = r1.A03
            r1 = 0
            X.0qQ.A0B(r4, r1)
            r0 = 2
            X.0qQ.A0B(r3, r0)
            boolean r0 = X.B58.A00(r4, r4, r3, r1, r2)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x00e6:
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x060c
            java.lang.Object r2 = r1.A02
            X.3Zt r2 = (X.C243673Zt) r2
            java.lang.Object r1 = r1.A01
            X.2V5 r1 = (X.2V5) r1
            X.AnonymousClass7TG.A1N(r2, r1)
            X.C51973G9u.A18(r2)
            r0 = 0
            r2.A00(r0)
            r0 = 0
            X.C51967G9n.A19(r1, r0)
            goto L_0x060c
        L_0x0102:
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0113
            java.lang.Object r0 = r1.A02
            X.GG8 r0 = (X.GG8) r0
            X.JQX r2 = r0.A04
            java.lang.Object r0 = r1.A01
            X.GHJ r0 = (X.GHJ) r0
            r2.A94(r0)
        L_0x0113:
            java.lang.Object r3 = r1.A02
            java.lang.Object r2 = r1.A01
            r1 = 41
            X.Iw2 r0 = new X.Iw2
            r0.<init>(r1, r3, r2)
            X.3dj r5 = new X.3dj
            r5.<init>(r0)
            return r5
        L_0x0124:
            java.lang.Object r0 = r1.A02
            X.GGt r0 = (X.C52151GGt) r0
            com.instagram.common.session.UserSession r2 = r0.A04
            java.lang.Object r3 = r1.A01
            X.1Xj r3 = (X.1Xj) r3
            boolean r8 = r1.A03
            com.instagram.clips.intf.ClipsViewerConfig r0 = r0.A01
            com.instagram.search.common.analytics.SearchContext r6 = r0.A0S
            r4 = 0
            r5 = r4
            r7 = r4
            X.C52183GHz.A02(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x060c
        L_0x013c:
            java.lang.Object r5 = r1.A02
            X.GwN r5 = (X.C53917GwN) r5
            X.HK1 r0 = r5.A08
            X.0eM r0 = r0.A06
            java.lang.Object r4 = r0.getValue()
            X.7cD r4 = (X.C334997cD) r4
            java.lang.Object r3 = r1.A01
            boolean r1 = r1.A03
            r0 = 27
            X.GN2 r2 = new X.GN2
            r2.<init>(r0, r5, r3, r1)
            X.7go r1 = r4.A01
            if (r1 == 0) goto L_0x0160
            X.Hhg r0 = new X.Hhg
            r0.<init>(r2)
            r1.A02 = r0
        L_0x0160:
            r1 = 41
            X.IwE r0 = new X.IwE
            r0.<init>(r3, r1)
            X.3dj r5 = new X.3dj
            r5.<init>(r0)
            return r5
        L_0x016d:
            java.lang.Object r3 = r1.A01
            X.0sL r3 = (X.0sL) r3
            java.lang.Object r2 = r1.A02
            boolean r0 = r1.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.invoke(r2, r0)
            goto L_0x060c
        L_0x017e:
            java.lang.Object r0 = r1.A01
            X.F3q r0 = (X.C49726F3q) r0
            androidx.fragment.app.Fragment r9 = r0.A00()
            java.lang.Object r4 = r1.A02
            X.Gu2 r4 = (X.C53773Gu2) r4
            com.meta.foa.session.FoaUserSession r7 = r4.A00
            r5 = 0
            X.0qQ.A0B(r7, r5)
            r6 = 1
            X.0qQ.A0B(r9, r6)
            com.instagram.common.session.UserSession r8 = X.C56316HwT.A00(r7)
            com.facebook.common.callercontext.CallerContext r0 = X.C46399DeM.A00
            X.2Ly r0 = X.2Lv.A00(r8)
            com.facebook.common.callercontext.CallerContext r3 = X.C46399DeM.A00
            java.lang.String r2 = "INSTAGRAM"
            X.1wM r0 = r0.A00
            java.util.List r0 = r0.A02(r3, r2)
            int r2 = r0.size()
            r0 = 1
            if (r2 > r6) goto L_0x01b0
            r0 = 0
        L_0x01b0:
            boolean r0 = X.AnonymousClass3EM.A08(r8, r0)
            if (r0 == 0) goto L_0x01e5
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            X.1CU r0 = X.AnonymousClass1CT.A00(r8)
            java.lang.String r2 = r0.A04
            java.lang.String r0 = "cached_ig_access_token"
            r3.putString(r0, r2)
            java.lang.String r2 = r8.A06
            java.lang.String r0 = "current_user_id"
            r3.putString(r0, r2)
            androidx.fragment.app.FragmentActivity r0 = r9.requireActivity()
            X.2YN r2 = new X.2YN
            r2.<init>(r0)
            java.lang.Class<com.instagram.fx.access.sso.FxSsoViewModel> r0 = com.instagram.fx.access.sso.FxSsoViewModel.class
            X.2YL r2 = r2.A00(r0)
            com.instagram.fx.access.sso.FxSsoViewModel r2 = (com.instagram.fx.access.sso.FxSsoViewModel) r2
            androidx.fragment.app.FragmentActivity r0 = r9.requireActivity()
            r2.A03(r0, r3, r8)
        L_0x01e5:
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x0218
            java.lang.String r4 = r4.A01
            java.lang.String r3 = "xav_cds_switcher"
            X.0qQ.A0B(r4, r6)
            com.instagram.common.session.UserSession r1 = X.C56316HwT.A00(r7)
            X.0qQ.A0B(r1, r5)
            boolean r0 = X.C46400DeN.A04
            X.0wc r2 = X.AnonymousClass0kN.A02(r1)
            java.lang.String r1 = "account_switcher_max_limit_reached"
            X.0kJ r0 = r2.A00
            X.0Aj r1 = r2.A00(r0, r1)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0218
            java.lang.String r0 = "entry_point"
            r1.AAJ(r0, r4)
            java.lang.String r0 = "containermodule"
            r1.AAJ(r0, r3)
            r1.Cgf()
        L_0x0218:
            X.Iom r0 = new X.Iom
            r0.<init>(r5)
            X.3dj r5 = new X.3dj
            r5.<init>(r0)
            return r5
        L_0x0223:
            java.lang.Object r3 = r1.A01
            X.0sP r3 = (X.0sP) r3
            boolean r0 = r1.A03
            r2 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r3.invoke(r0)
            java.lang.Object r0 = r1.A02
            X.HqJ r0 = (X.C55955HqJ) r0
            r0.A00 = r2
            X.H7y r1 = r0.A01
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x023f
            r0 = 0
        L_0x023f:
            r1.setVolume(r0)
            goto L_0x060c
        L_0x0244:
            java.lang.Object r4 = r1.A02
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r3 = r1.A01
            X.4DH r3 = (X.AnonymousClass4DH) r3
            android.content.Context r2 = r3.requireContext()
            boolean r0 = r1.A03
            X.KE3 r5 = new X.KE3
            r5.<init>(r2, r3, r4, r0)
            return r5
        L_0x0258:
            java.lang.Object r3 = r1.A02
            X.HEK r3 = (X.HEK) r3
            boolean r0 = r1.A03
            java.lang.Object r2 = r1.A01
            X.HjA r2 = (X.C55528HjA) r2
            r3.A07()
            if (r0 == 0) goto L_0x0278
            X.GhR r0 = r3.A05()
            X.HM6 r1 = r0.A02()
            X.HM6 r0 = X.HM6.VALID
            if (r1 != r0) goto L_0x060c
            r0 = 1
            X.5Oz r1 = r2.A00
            goto L_0x032b
        L_0x0278:
            X.HEK.A02(r3)
            goto L_0x060c
        L_0x027d:
            java.lang.Object r3 = r1.A02
            X.OVd r3 = (X.C70989OVd) r3
            X.OHZ r0 = r3.A0O
            X.26t r0 = r0.A00
            r4 = 1
            X.0xa r0 = r0.A00
            X.0xY r2 = r0.AR4()
            java.lang.String r0 = "has_used_avatar_in_video_call"
            r2.E5T(r0, r4)
            r2.apply()
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x029d
            X.Odx r0 = r3.A0Z
            r0.A0B(r4)
        L_0x029d:
            java.lang.Object r0 = r1.A01
            com.instagram.camera.effect.models.CameraAREffect r0 = (com.instagram.camera.effect.models.CameraAREffect) r0
            java.util.Map r1 = r0.A0Z
            r0 = 553(0x229, float:7.75E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.Object r1 = r1.get(r0)
            r0 = 0
            if (r1 == 0) goto L_0x02b1
            r0 = 1
        L_0x02b1:
            if (r0 != 0) goto L_0x060c
            X.Odx r2 = r3.A0Z
            r1 = 33
            X.Pm5 r0 = new X.Pm5
            r0.<init>(r3, r1)
            r2.A0A(r0)
            goto L_0x060c
        L_0x02c1:
            java.lang.Object r3 = r1.A02
            X.8Ff r3 = (X.C352838Ff) r3
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x060c
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x02e1
            r3.A07()
            r1 = 45
            X.G0h r0 = new X.G0h
            r0.<init>(r3, r1)
            X.Lvs r1 = new X.Lvs
            r1.<init>(r0)
        L_0x02dc:
            X.C352838Ff.A03(r1, r3)
            goto L_0x060c
        L_0x02e1:
            r2 = 1
            X.Lvw r0 = new X.Lvw
            r0.<init>(r2)
            X.C352838Ff.A03(r0, r3)
            java.lang.Object r2 = r1.A01
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            X.8br r0 = r3.A0B
            android.content.Context r1 = r0.A00
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            int r1 = X.I7E.A00(r1, r0)
            r0 = 0
            X.0qQ.A0B(r2, r0)
            android.graphics.Bitmap r2 = X.1MF.A09(r2, r1, r1, r0, r0)
            X.0qQ.A07(r2)
            r1 = 46
            X.G0h r0 = new X.G0h
            r0.<init>(r3, r1)
            X.Lvu r1 = new X.Lvu
            r1.<init>(r2, r0)
            goto L_0x02dc
        L_0x0311:
            java.lang.Object r3 = r1.A02
            X.6D9 r3 = (X.AnonymousClass6D9) r3
            boolean r2 = r1.A03
            r0 = 0
            r3.A02(r0, r2)
            java.lang.Object r1 = r1.A01
            X.5Oz r1 = (X.C284945Oz) r1
            java.lang.Object r0 = r1.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r0 = r0 ^ 1
        L_0x032b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.Epw(r0)
            goto L_0x060c
        L_0x0334:
            java.lang.Object r0 = r1.A02
            X.3bF r0 = (X.C244473bF) r0
            java.lang.Boolean r0 = r0.A05
            if (r0 == 0) goto L_0x060c
            java.lang.Object r0 = r1.A01
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.text.TextPaint r2 = r0.getPaint()
            boolean r0 = r1.A03
            r2.setFakeBoldText(r0)
            goto L_0x060c
        L_0x034b:
            java.lang.Object r0 = r1.A02
            if (r0 == 0) goto L_0x060c
            java.lang.Object r2 = r1.A01
            android.widget.TextView r2 = (android.widget.TextView) r2
            boolean r0 = r1.A03
            r2.setIncludeFontPadding(r0)
            goto L_0x060c
        L_0x035a:
            java.lang.Object r4 = r1.A02
            X.Ody r4 = (X.C71144Ody) r4
            boolean r0 = r1.A03
            java.lang.Object r1 = r1.A01
            X.NmU r1 = (X.C69486NmU) r1
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r0)
            X.Nlz r3 = X.C69455Nlz.NEVER_ASK_AGAIN
            java.lang.String r25 = "LOCATION_SHARE_PERMISSION"
            java.lang.String r26 = "IMPRESSION"
            r0 = 0
            r2 = r0
            r5 = r0
            r6 = r0
            r7 = r0
            r8 = r0
            r9 = r0
            r10 = r0
            r12 = r0
            r13 = r0
            r14 = r0
            r15 = r0
            r16 = r0
            r17 = r0
            r18 = r0
            r19 = r0
            r20 = r0
            r21 = r0
            r22 = r0
            r23 = r0
            r24 = r0
            r27 = r0
            r28 = r0
            r29 = r0
            r30 = r0
            r31 = r0
            r32 = r0
            r33 = r0
            r34 = r0
            r35 = r0
            X.C71144Ody.A00(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x060c
        L_0x03a3:
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x060c
            java.lang.Object r0 = r1.A02
            X.GuK r0 = (X.C53791GuK) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.5ji r2 = X.C292885jg.A00(r0)
            java.lang.Object r0 = r1.A01
            X.5Ev r0 = (X.C282815Ev) r0
            X.3W1 r1 = r0.A04
            r2.A01(r1)
            X.5FA r0 = X.AnonymousClass5F9.A00()
            r0.A00(r1)
            goto L_0x060c
        L_0x03c3:
            java.lang.Object r3 = r1.A02
            X.3W1 r3 = (X.AnonymousClass3W1) r3
            java.lang.Object r2 = r1.A01
            X.2xU r2 = (X.AnonymousClass2xU) r2
            boolean r1 = r1.A03
            r0 = 0
            r3.A0M(r2, r0, r1)
            goto L_0x060c
        L_0x03d3:
            java.lang.Object r2 = r1.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            boolean r0 = r1.A03
            java.lang.Object r1 = r1.A01
            X.1L5 r1 = (X.1L5) r1
            if (r0 == 0) goto L_0x03e6
            r0 = 1
            X.IXy r5 = new X.IXy
            r5.<init>(r2, r1, r0)
            return r5
        L_0x03e6:
            X.4LQ r5 = X.AnonymousClass4LQ.A00
            return r5
        L_0x03e9:
            boolean r6 = r1.A03
            if (r6 == 0) goto L_0x0417
            java.lang.Object r4 = r1.A02
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r0 = r1.A01
            X.61K r0 = (X.AnonymousClass61K) r0
            X.1aD r6 = X.1aD.A00(r4, r0)
            X.0qQ.A07(r6)
            X.1aS r3 = r6.A02
            r2 = 26
            X.Owd r0 = new X.Owd
            r0.<init>(r2)
            X.1aU r5 = r3.A0L(r0)
            X.68G r3 = r6.A04
        L_0x040b:
            r2 = 0
            java.lang.Object r0 = r1.A01
            X.61K r0 = (X.AnonymousClass61K) r0
            java.lang.String r0 = r0.A00
            X.6AO r5 = X.AnonymousClass6AN.A01(r5, r4, r3, r2, r0)
            return r5
        L_0x0417:
            X.OIt r5 = X.OVM.A05
            java.lang.Object r4 = r1.A02
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            monitor-enter(r5)
            r0 = 0
            X.0qQ.A0B(r4, r0)     // Catch:{ all -> 0x0449 }
            com.instagram.direct.msys.activesession.msysactivesession.MsysActiveUserSession r2 = X.1y0.A01(r4)     // Catch:{ all -> 0x0449 }
            java.lang.Class<X.OVM> r0 = X.OVM.class
            java.lang.Object r3 = r2.A00(r0)     // Catch:{ all -> 0x0449 }
            X.OVM r3 = (X.OVM) r3     // Catch:{ all -> 0x0449 }
            if (r3 == 0) goto L_0x0441
            monitor-exit(r5)
            com.facebook.msys.mci.AccountSession r2 = X.C300345wy.A02(r4, r6)
            X.62u r0 = new X.62u
            r0.<init>(r2)
            X.1aU r5 = X.1aU.A09(r0)
            X.68G r3 = r3.A02
            goto L_0x040b
        L_0x0441:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0449 }
            r0.<init>(r1)     // Catch:{ all -> 0x0449 }
            throw r0     // Catch:{ all -> 0x0449 }
        L_0x0449:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x044c:
            java.lang.Object r6 = r1.A02
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            java.lang.Object r9 = r1.A01
            X.0sa r9 = (X.C62320sa) r9
            X.3HH r7 = X.AnonymousClass3HG.A00(r6)
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.02m r2 = X.02m.A0p
            X.0qQ.A07(r2)
            X.0BQ r1 = X.AnonymousClass0BO.A00(r6)
            X.65E r0 = X.AnonymousClass65D.A00(r6)
            X.NUT r8 = new X.NUT
            r8.<init>(r2, r0, r1)
            X.TVR r10 = X.TVR.A00
            X.PjT r11 = X.C73768PjT.A00
            X.ONh r5 = new X.ONh
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        L_0x0478:
            r4 = 1
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>(r4)
            java.lang.Object r3 = r1.A01
            android.content.Context r3 = (android.content.Context) r3
            boolean r2 = r1.A03
            java.lang.Object r1 = r1.A02
            X.Jbq r1 = (X.C59927Jbq) r1
            r0 = 2130970240(0x7f040680, float:1.7549185E38)
            if (r2 == 0) goto L_0x0490
            r0 = 2130970392(0x7f040718, float:1.7549493E38)
        L_0x0490:
            int r0 = X.2Yu.A0H(r3, r0)
            int r0 = r3.getColor(r0)
            r5.setColor(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r5.setStyle(r0)
            float r0 = r1.A03
            r5.setStrokeWidth(r0)
            r5.setAntiAlias(r4)
            return r5
        L_0x04a9:
            r0 = 1
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>(r0)
            java.lang.Object r2 = r1.A01
            android.content.Context r2 = (android.content.Context) r2
            boolean r0 = r1.A03
            java.lang.Object r1 = r1.A02
            X.Jbq r1 = (X.C59927Jbq) r1
            if (r0 == 0) goto L_0x04d1
            int r0 = X.2Yu.A0C(r2)
        L_0x04bf:
            int r0 = r2.getColor(r0)
            r5.setColor(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r5.setStyle(r0)
            float r0 = r1.A03
            r5.setStrokeWidth(r0)
            return r5
        L_0x04d1:
            r0 = 2131099778(0x7f060082, float:1.7811919E38)
            goto L_0x04bf
        L_0x04d5:
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r2 < r0) goto L_0x04e7
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x04e7
            java.lang.Object r2 = r1.A02
            android.view.View r2 = (android.view.View) r2
            r0 = 1
            r2.performHapticFeedback(r0)
        L_0x04e7:
            java.lang.Object r0 = r1.A01
            X.0sa r0 = (X.C62320sa) r0
            r0.invoke()
            goto L_0x060c
        L_0x04f0:
            java.lang.Object r4 = r1.A02
            X.8Hw r4 = (X.C353498Hw) r4
            X.85M r3 = r4.A1d
            android.widget.FrameLayout r0 = r3.A00
            if (r0 == 0) goto L_0x050f
            android.view.ViewParent r2 = r0.getParent()
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0509
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.widget.FrameLayout r0 = r3.A00
            r2.removeView(r0)
        L_0x0509:
            r0 = 0
            r3.A00 = r0
            X.C353498Hw.A0m(r4)
        L_0x050f:
            android.app.Dialog r0 = r4.A05
            if (r0 == 0) goto L_0x0516
            r0.hide()
        L_0x0516:
            boolean r6 = r1.A03
            if (r6 != 0) goto L_0x0529
            com.instagram.common.session.UserSession r5 = r4.A1D
            X.0Tu r0 = X.0Tu.A05
            r2 = 36321550579934724(0x810a4200022604, double:3.0332330696710946E-306)
            boolean r0 = X.182.A06(r0, r5, r2)
            if (r0 == 0) goto L_0x0531
        L_0x0529:
            androidx.fragment.app.FragmentActivity r2 = r4.A15
            r0 = 2131961036(0x7f1324cc, float:1.9558758E38)
            X.C59689JTv.A06(r2, r0)
        L_0x0531:
            if (r6 == 0) goto L_0x053d
            X.M2s r0 = new X.M2s
            r0.<init>(r4)
            r2 = 300(0x12c, double:1.48E-321)
            X.11Z.A04(r0, r2)
        L_0x053d:
            java.lang.Object r0 = r1.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto L_0x0546
            r0.run()
        L_0x0546:
            boolean r0 = r4.CTi()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0561
            java.lang.String r0 = "on_draft_saved_callback"
            X.C353498Hw.A1A(r4, r0)
            X.8WX r0 = r4.A0B
            if (r0 == 0) goto L_0x0561
            X.8XA r1 = r0.A00()
            if (r1 == 0) goto L_0x0561
            r0 = 0
            r1.A0O(r0)
        L_0x0561:
            X.4MS r0 = r4.A18
            r0.A01()
            goto L_0x060c
        L_0x0568:
            java.lang.Object r3 = r1.A02
            X.8XA r3 = (X.AnonymousClass8XA) r3
            java.lang.Object r2 = r1.A01
            com.instagram.common.gallery.Medium r2 = (com.instagram.common.gallery.Medium) r2
            boolean r1 = r1.A03
            r4 = 2
            r0 = 1
            X.AnonymousClass8XA.A02(r2, r3, r4, r0, r1)
            com.instagram.common.session.UserSession r0 = r3.A0F
            X.27r r0 = X.27p.A01(r0)
            X.29R r3 = r0.A09
            X.0wc r0 = r3.A02
            X.1Ln r2 = X.1Ln.A08(r0)
            X.4yP r1 = r3.A0J()
            X.0Aj r0 = r2.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x060c
            if (r1 == 0) goto L_0x060c
            java.lang.String r0 = "IG_CAMERA_ENTITY_TAP"
            r2.A0t(r0)
            java.lang.String r0 = "TIMELINE_SWAP_SHORTER_CANCEL_TAP"
            r2.A0r(r0)
            X.29R.A00(r2, r3)
            r2.A0a(r1)
            X.283 r1 = r3.A04
            X.28D r0 = r1.A09
            r2.A0b(r0)
            r2.A0W(r4)
            r2.A0U()
            X.0iw r0 = X.27x.A09
            java.lang.String r0 = r0.getModuleName()
            r2.A0n(r0)
            X.28t r0 = r1.A0A
            r2.A0c(r0)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r0 = r0.A00
            r2.A0u(r0)
            r2.Cgf()
            goto L_0x060c
        L_0x05cb:
            java.lang.Object r0 = r1.A02
            X.4jz r0 = (X.C272034jz) r0
            java.lang.String r3 = r0.getPollId()
            if (r3 == 0) goto L_0x060c
            java.lang.Object r2 = r1.A01
            X.0sL r2 = (X.0sL) r2
            boolean r0 = r1.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.invoke(r3, r0)
            goto L_0x060c
        L_0x05e3:
            java.lang.Object r0 = r1.A02
            X.Qf0 r0 = (X.C8013Qf0) r0
            X.0sJ r5 = r0.A08
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x060f
            r0 = 857(0x359, float:1.201E-42)
        L_0x05ef:
            java.lang.String r4 = X.Pxd.A00(r0)
            java.lang.Object r3 = r1.A01
            com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem r3 = (com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem) r3
            java.lang.String r0 = r3.A0F
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            X.XRm r1 = r3.A09
            r0 = 923(0x39b, float:1.293E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            r5.invoke(r0, r4, r2, r1)
        L_0x060c:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x060f:
            r0 = 853(0x355, float:1.195E-42)
            goto L_0x05ef
        L_0x0612:
            java.lang.Object r4 = r1.A02
            X.Gc7 r4 = (X.C52754Gc7) r4
            java.lang.Object r3 = r1.A01
            X.I1b r3 = (X.C56547I1b) r3
            boolean r0 = r1.A03
            r2 = 1
            r1 = r0 ^ 1
            X.5Oz r0 = r4.A0A
            boolean r0 = X.C51971G9r.A1W(r0)
            if (r0 != 0) goto L_0x062f
            r3.A01()
        L_0x062a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        L_0x062f:
            if (r1 == 0) goto L_0x062a
            X.5Uk r0 = r4.A0L
            if (r0 == 0) goto L_0x062a
            r0.show()
            goto L_0x062a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GL3.invoke():java.lang.Object");
    }
}
