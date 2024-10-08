package X;

public final class MMY extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMY(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public static MMY A00(Object obj, Object obj2, int i) {
        return new MMY(i, obj, obj2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a5, code lost:
        X.DbX.A10(r5.getActivity(), X.AnonymousClass37D.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f0, code lost:
        if (r0 != null) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01bb, code lost:
        if (r3 != null) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x024f, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0018;
                case 1: goto L_0x0018;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x0018;
                case 6: goto L_0x0005;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x0005;
                case 13: goto L_0x0005;
                case 14: goto L_0x0005;
                case 15: goto L_0x0005;
                case 16: goto L_0x0005;
                case 17: goto L_0x0005;
                case 18: goto L_0x00c7;
                case 19: goto L_0x0005;
                case 20: goto L_0x0005;
                case 21: goto L_0x0005;
                case 22: goto L_0x0005;
                case 23: goto L_0x0018;
                case 24: goto L_0x0037;
                case 25: goto L_0x0005;
                case 26: goto L_0x0005;
                case 27: goto L_0x00f4;
                case 28: goto L_0x0125;
                case 29: goto L_0x014e;
                case 30: goto L_0x016b;
                case 31: goto L_0x0186;
                case 32: goto L_0x0186;
                case 33: goto L_0x0005;
                case 34: goto L_0x0005;
                case 35: goto L_0x0018;
                case 36: goto L_0x0005;
                case 37: goto L_0x0018;
                case 38: goto L_0x01d6;
                case 39: goto L_0x01e3;
                case 40: goto L_0x0209;
                case 41: goto L_0x0054;
                case 42: goto L_0x0068;
                case 43: goto L_0x00b0;
                case 44: goto L_0x0018;
                case 45: goto L_0x0239;
                case 46: goto L_0x0018;
                case 47: goto L_0x0240;
                case 48: goto L_0x0018;
                case 49: goto L_0x0018;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = r0.invoke()
            if (r0 != 0) goto L_0x0017
        L_0x0011:
            java.lang.Object r0 = r7.A02
            X.2YQ r0 = X.JTU.A08(r0)
        L_0x0017:
            return r0
        L_0x0018:
            java.lang.Object r0 = r7.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = r0.invoke()
            if (r0 != 0) goto L_0x0017
        L_0x0024:
            java.lang.Object r0 = r7.A02
            X.07g r1 = X.C51969G9p.A0c(r0)
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x0250
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x0250
            X.2YQ r0 = r1.getDefaultViewModelCreationExtras()
            return r0
        L_0x0037:
            java.lang.Object r0 = r7.A01
            X.07g r1 = X.C51969G9p.A0c(r0)
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x004b
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x004b
            X.2YM r0 = r1.getDefaultViewModelProviderFactory()
            if (r0 != 0) goto L_0x0017
        L_0x004b:
            java.lang.Object r0 = r7.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.2YM r0 = r0.getDefaultViewModelProviderFactory()
            return r0
        L_0x0054:
            java.lang.Object r5 = r7.A02
            X.H0J r5 = (X.H0J) r5
            java.lang.Object r0 = r7.A01
            X.KmS r0 = (X.C62790KmS) r0
            X.KPq r0 = (X.C61877KPq) r0
            X.1Xj r2 = r0.A00
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r0.A02
            X.H0J.A00(r5, r2, r1, r0)
            goto L_0x00a5
        L_0x0068:
            X.1ZU r0 = X.C48794EkH.A00()
            X.HrP r4 = r0.A00()
            java.lang.Object r1 = r7.A01
            X.KmS r1 = (X.C62790KmS) r1
            X.KPp r1 = (X.C61876KPp) r1
            java.util.List r3 = r1.A00
            java.lang.Object r0 = X.00k.A0J(r3)
            com.instagram.creator.achievements.modules.models.Badge$AchievementBadge r0 = (com.instagram.creator.achievements.modules.models.Badge.AchievementBadge) r0
            if (r0 == 0) goto L_0x0086
            com.instagram.api.schemas.Achievement r0 = r0.A01
            java.lang.String r2 = r0.A08
            if (r2 != 0) goto L_0x0088
        L_0x0086:
            java.lang.String r2 = ""
        L_0x0088:
            java.util.List r1 = r1.A01
            java.lang.Object r5 = r7.A02
            X.H0J r5 = (X.H0J) r5
            X.0eM r0 = r5.A02
            java.lang.String r0 = X.DbS.A0t(r0)
            X.H0Z r2 = r4.A00(r2, r0, r3, r1)
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            X.0eM r0 = r5.A04
            X.6Yo r0 = X.DbX.A0N(r1, r0)
            X.Dba.A12(r2, r0)
        L_0x00a5:
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            X.DbX.A10(r0, r1)
            goto L_0x024d
        L_0x00b0:
            java.lang.Object r4 = r7.A02
            X.H0J r4 = (X.H0J) r4
            java.lang.Object r0 = r7.A01
            X.KmS r0 = (X.C62790KmS) r0
            X.KPr r0 = (X.C61878KPr) r0
            X.1Xj r3 = r0.A00
            java.lang.String r2 = r0.A03
            java.lang.String r1 = r0.A02
            java.lang.String r0 = r0.A01
            X.H0J.A01(r4, r3, r2, r1, r0)
            goto L_0x024d
        L_0x00c7:
            java.lang.Object r2 = r7.A02
            X.K66 r2 = (X.K66) r2
            java.lang.Object r0 = r7.A01
            X.0rm r0 = (X.0rm) r0
            java.lang.Object r1 = r0.A00
            android.content.Intent r1 = (android.content.Intent) r1
            r0 = 9685(0x25d5, float:1.3572E-41)
            X.K66.A0A(r1, r2, r0)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r2 = X.K66.A01(r2)
            r0 = 45
            X.MP5 r1 = X.MP5.A00(r2, r0)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r0 = r2.A07
            X.2Fj r0 = r0.A02
            java.lang.Object r0 = r0.A02()
            X.8fx r0 = (X.C361278fx) r0
            if (r0 == 0) goto L_0x024d
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L_0x024d
            goto L_0x024a
        L_0x00f4:
            java.lang.Object r6 = r7.A02
            X.LpR r6 = (X.C65221LpR) r6
            X.LSk r3 = r6.A06
            java.lang.String r2 = "user"
            java.lang.String r1 = "share_sheet"
            java.lang.String r0 = "tap_trial_settings"
            X.LSk.A03(r3, r2, r1, r0)
            X.4DH r0 = r6.A02
            androidx.fragment.app.FragmentActivity r5 = r0.requireActivity()
            com.instagram.common.session.UserSession r4 = r6.A03
            com.instagram.creation.sharesheet.update.trial.TrialUseCase r0 = r6.A05
            X.JwD r0 = r0.A06()
            java.lang.String r3 = r0.A0N
            java.lang.Object r0 = r7.A01
            X.JVq r0 = (X.C59732JVq) r0
            boolean r2 = r0.A00
            r1 = 12
            X.MP9 r0 = new X.MP9
            r0.<init>(r6, r1)
            X.C63212KtJ.A00(r5, r4, r3, r0, r2)
            goto L_0x024d
        L_0x0125:
            java.lang.Object r4 = r7.A02
            X.K6A r4 = (X.K6A) r4
            X.JiK r3 = X.JTT.A0Q(r4)
            android.content.Context r0 = r4.requireContext()
            X.82q r2 = X.JTU.A0L(r0)
            X.3Q2 r1 = X.JTT.A0f(r4)
            X.JWG r0 = r4.A08
            if (r0 == 0) goto L_0x0149
            r3.A01(r0, r2, r1)
            java.lang.Object r1 = r7.A01
            X.0r1 r1 = (X.0r1) r1
            r0 = 1
            r1.A00 = r0
            goto L_0x024d
        L_0x0149:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x014e:
            java.lang.Object r0 = r7.A01
            X.0r1 r0 = (X.0r1) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x024d
            java.lang.Object r2 = r7.A02
            X.K6A r2 = (X.K6A) r2
            r1 = 0
            r2.A0I = r1
            X.LFb r0 = r2.A0F
            if (r0 != 0) goto L_0x01ae
            java.lang.String r0 = "videoPreviewController"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x016b:
            java.lang.Object r0 = r7.A01
            X.0r1 r0 = (X.0r1) r0
            r2 = 1
            r0.A00 = r2
            java.lang.Object r0 = r7.A02
            X.K6A r0 = (X.K6A) r0
            X.JiK r0 = X.JTT.A0Q(r0)
            X.0V2 r1 = r0.A02
            X.KPk r0 = new X.KPk
            r0.<init>(r2)
            r1.FIA(r0)
            goto L_0x024d
        L_0x0186:
            java.lang.Object r0 = r7.A01
            X.0r1 r0 = (X.0r1) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x01a1
            java.lang.Object r0 = r7.A02
            X.K6A r0 = (X.K6A) r0
            X.JiK r0 = X.JTT.A0Q(r0)
            r2 = 0
            X.0V2 r1 = r0.A02
            X.KPk r0 = new X.KPk
            r0.<init>(r2)
            r1.FIA(r0)
        L_0x01a1:
            java.lang.Object r0 = r7.A02
            X.K6A r0 = (X.K6A) r0
            X.LOy r3 = r0.A0B
            if (r3 != 0) goto L_0x01bd
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x01ae:
            r0.A01(r1)
            X.9Pn r0 = r0.A03
            r0.A04()
            r0.A03()
            X.LOy r3 = r2.A0B
            if (r3 == 0) goto L_0x024d
        L_0x01bd:
            X.Lmf r2 = r3.A02
            if (r2 == 0) goto L_0x01d2
            X.0hq r0 = r2.A00
            if (r0 == 0) goto L_0x01d2
            X.0s1 r1 = new X.0s1
            r1.<init>(r0)
            X.4DH r0 = r2.A01
            r1.A03(r0)
            r1.A00()
        L_0x01d2:
            r0 = 0
            r3.A02 = r0
            goto L_0x024d
        L_0x01d6:
            java.lang.Object r1 = r7.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r7.A01
            com.instagram.api.schemas.AchievementButtonInfo r0 = (com.instagram.api.schemas.AchievementButtonInfo) r0
            java.lang.String r0 = r0.Avk()
            goto L_0x024a
        L_0x01e3:
            java.lang.Object r5 = r7.A01
            com.instagram.api.schemas.AchievementIntf r5 = (com.instagram.api.schemas.AchievementIntf) r5
            java.lang.String r4 = r5.Azq()
            if (r4 == 0) goto L_0x024d
            java.lang.Object r0 = r7.A02
            X.H0J r0 = (X.H0J) r0
            X.0eM r0 = r0.A00
            java.lang.Object r3 = r0.getValue()
            X.GhM r3 = (X.C53031GhM) r3
            java.lang.String r2 = r5.Azs()
            com.instagram.api.schemas.EarnedOnMediaState r1 = r5.Azr()
            java.lang.String r0 = r5.Azp()
            r3.A03(r1, r4, r2, r0)
            goto L_0x024d
        L_0x0209:
            java.lang.Object r0 = r7.A01
            X.GmD r0 = (X.C53327GmD) r0
            X.Gn5 r5 = r0.A03
            if (r5 == 0) goto L_0x024d
            java.lang.Object r0 = r7.A02
            X.H0J r0 = (X.H0J) r0
            X.0eM r0 = r0.A00
            java.lang.Object r4 = r0.getValue()
            X.GhM r4 = (X.C53031GhM) r4
            java.lang.String r3 = r5.A05
            java.lang.String r2 = r5.A06
            java.lang.Object r0 = r5.A01
            java.lang.String r1 = X.DbX.A0t(r0)
            java.util.Map r0 = com.instagram.api.schemas.EarnedOnMediaState.A01
            java.lang.Object r1 = r0.get(r1)
            com.instagram.api.schemas.EarnedOnMediaState r1 = (com.instagram.api.schemas.EarnedOnMediaState) r1
            if (r1 != 0) goto L_0x0233
            com.instagram.api.schemas.EarnedOnMediaState r1 = com.instagram.api.schemas.EarnedOnMediaState.UNRECOGNIZED
        L_0x0233:
            java.lang.String r0 = r5.A03
            r4.A03(r1, r3, r2, r0)
            goto L_0x024d
        L_0x0239:
            java.lang.Object r1 = r7.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r7.A01
            goto L_0x024a
        L_0x0240:
            java.lang.Object r1 = r7.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r7.A01
            X.Gmk r0 = (X.C53360Gmk) r0
            java.lang.Object r0 = r0.A01
        L_0x024a:
            r1.invoke(r0)
        L_0x024d:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0250:
            X.2YP r0 = X.AnonymousClass2YP.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MMY.invoke():java.lang.Object");
    }
}
