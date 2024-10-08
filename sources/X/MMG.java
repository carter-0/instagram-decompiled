package X;

public final class MMG extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMG(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static MMG A00(Object obj, int i) {
        return new MMG(obj, i);
    }

    /* JADX WARNING: type inference failed for: r5v24, types: [X.6RW, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e5, code lost:
        if (r2.getBoolean(r0, r1) != r3) goto L_0x00e9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x0022;
                case 1: goto L_0x002c;
                case 2: goto L_0x0036;
                case 3: goto L_0x0040;
                case 4: goto L_0x0040;
                case 5: goto L_0x004f;
                case 6: goto L_0x000c;
                case 7: goto L_0x001f;
                case 8: goto L_0x006a;
                case 9: goto L_0x0005;
                case 10: goto L_0x0071;
                case 11: goto L_0x0081;
                case 12: goto L_0x001f;
                case 13: goto L_0x006a;
                case 14: goto L_0x0005;
                case 15: goto L_0x0090;
                case 16: goto L_0x00a6;
                case 17: goto L_0x001f;
                case 18: goto L_0x006a;
                case 19: goto L_0x0005;
                case 20: goto L_0x00b8;
                case 21: goto L_0x00c8;
                case 22: goto L_0x00d5;
                case 23: goto L_0x001f;
                case 24: goto L_0x006a;
                case 25: goto L_0x0005;
                case 26: goto L_0x00ec;
                case 27: goto L_0x00fc;
                case 28: goto L_0x001f;
                case 29: goto L_0x006a;
                case 30: goto L_0x0005;
                case 31: goto L_0x010c;
                case 32: goto L_0x0117;
                case 33: goto L_0x012b;
                case 34: goto L_0x01a8;
                case 35: goto L_0x01c1;
                case 36: goto L_0x01d2;
                case 37: goto L_0x01ea;
                case 38: goto L_0x001f;
                case 39: goto L_0x006a;
                case 40: goto L_0x0005;
                case 41: goto L_0x0202;
                case 42: goto L_0x0212;
                case 43: goto L_0x001f;
                case 44: goto L_0x006a;
                case 45: goto L_0x0005;
                case 46: goto L_0x0220;
                case 47: goto L_0x0230;
                case 48: goto L_0x024a;
                case 49: goto L_0x027c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A01
            X.07f r5 = X.DbY.A0I(r0)
        L_0x000b:
            return r5
        L_0x000c:
            java.lang.Object r0 = r12.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "media_type"
            java.io.Serializable r5 = r1.getSerializable(r0)
            if (r5 != 0) goto L_0x000b
            java.lang.IllegalArgumentException r0 = X.DbU.A0h()
            throw r0
        L_0x001f:
            java.lang.Object r5 = r12.A01
            return r5
        L_0x0022:
            java.lang.Object r0 = r12.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.T7P r5 = new X.T7P
            r5.<init>(r0)
            return r5
        L_0x002c:
            java.lang.Object r0 = r12.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.FYa r5 = new X.FYa
            r5.<init>(r0)
            return r5
        L_0x0036:
            java.lang.Object r0 = r12.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.FYd r5 = new X.FYd
            r5.<init>(r0)
            return r5
        L_0x0040:
            X.6Tl r1 = new X.6Tl
            r1.<init>()
            java.lang.Object r0 = r12.A01
            r1.A01(r0)
            X.6Tm r5 = r1.A00()
            return r5
        L_0x004f:
            java.lang.Object r1 = r12.A01
            X.0lg r1 = (X.0lg) r1
            X.6RX r0 = new X.6RX
            r0.<init>(r1)
            X.4ta r1 = new X.4ta
            r1.<init>(r0)
            X.6RW r5 = new X.6RW
            r5.<init>()
            X.6RY r0 = new X.6RY
            r0.<init>(r1)
            r5.A00 = r0
            return r5
        L_0x006a:
            java.lang.Object r0 = r12.A01
            java.lang.Object r5 = X.DbT.A0r(r0)
            return r5
        L_0x0071:
            java.lang.Object r0 = r12.A01
            X.K87 r0 = (X.K87) r0
            X.0eM r0 = r0.A03
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KBT r5 = new X.KBT
            r5.<init>(r0)
            return r5
        L_0x0081:
            java.lang.Object r0 = r12.A01
            android.os.Bundle r2 = X.DbS.A0B(r0)
            java.lang.Class<com.instagram.brandedcontent.disclosure.BrandedContentDisclosureArgs> r1 = com.instagram.brandedcontent.disclosure.BrandedContentDisclosureArgs.class
            java.lang.String r0 = "bc_disclosure_args"
            android.os.Parcelable r5 = X.C320236s2.A00(r2, r1, r0)
            return r5
        L_0x0090:
            java.lang.Object r2 = r12.A01
            X.K8Z r2 = (X.K8Z) r2
            com.instagram.common.session.UserSession r1 = r2.A06()
            X.0eM r0 = r2.A04
            java.lang.Object r0 = r0.getValue()
            com.instagram.brandedcontent.disclosure.BrandedContentDisclosureArgs r0 = (com.instagram.brandedcontent.disclosure.BrandedContentDisclosureArgs) r0
            X.KDG r5 = new X.KDG
            r5.<init>(r0, r2, r1)
            return r5
        L_0x00a6:
            java.lang.Object r0 = r12.A01
            X.JjM r0 = (X.C60318JjM) r0
            com.instagram.common.session.UserSession r3 = r0.A04
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316126037151728(0x81055300100ff0, double:3.0298025669722474E-306)
            java.lang.Boolean r5 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r5
        L_0x00b8:
            java.lang.Object r0 = r12.A01
            X.K82 r0 = (X.K82) r0
            X.0eM r0 = r0.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KBV r5 = new X.KBV
            r5.<init>(r0)
            return r5
        L_0x00c8:
            java.lang.Object r0 = r12.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r2 = r0.mArguments
            r3 = 1
            r1 = 0
            if (r2 == 0) goto L_0x00e9
            java.lang.String r0 = "is_from_consolidated"
            goto L_0x00e1
        L_0x00d5:
            java.lang.Object r0 = r12.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r2 = r0.mArguments
            r3 = 1
            r1 = 0
            if (r2 == 0) goto L_0x00e9
            java.lang.String r0 = "is_from_ppl_and_ads_entrypoint"
        L_0x00e1:
            boolean r0 = r2.getBoolean(r0, r1)
            if (r0 != r3) goto L_0x00e9
            goto L_0x01fd
        L_0x00e9:
            r3 = 0
            goto L_0x01fd
        L_0x00ec:
            java.lang.Object r0 = r12.A01
            X.K82 r0 = (X.K82) r0
            X.0eM r0 = r0.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KBU r5 = new X.KBU
            r5.<init>(r0)
            return r5
        L_0x00fc:
            java.lang.Object r0 = r12.A01
            X.E47 r0 = (X.E47) r0
            X.0eM r0 = r0.A03
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.JlH r5 = new X.JlH
            r5.<init>(r0)
            return r5
        L_0x010c:
            java.lang.Object r0 = r12.A01
            X.E47 r0 = (X.E47) r0
            X.0sa r0 = r0.A01
            java.lang.Object r5 = r0.invoke()
            return r5
        L_0x0117:
            java.lang.Object r2 = r12.A01
            X.E47 r2 = (X.E47) r2
            android.content.Context r1 = r2.requireContext()
            X.0eM r0 = r2.A03
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KDH r5 = new X.KDH
            r5.<init>(r1, r2, r0)
            return r5
        L_0x012b:
            X.0eE r0 = X.AnonymousClass0t1.A01
            java.lang.Object r5 = r12.A01
            X.K5c r5 = (X.C61384K5c) r5
            X.0eM r2 = r5.A02
            com.instagram.user.model.User r0 = X.DbX.A0l(r0, r2)
            boolean r0 = r0.A2L()
            if (r0 != 0) goto L_0x01a4
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x01a4
            r0 = 1
            r5.A00 = r0
            r0 = 2740(0xab4, float:3.84E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.1Q9 r0 = X.1Q9.A01(r0)
            r0.A08()
            X.C322576w3.A00()
            android.content.Context r1 = r5.requireContext()
            java.lang.Class<com.instagram.business.activity.BusinessConversionActivity> r0 = com.instagram.business.activity.BusinessConversionActivity.class
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r1, r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r1 = r0.A05
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            X.0eP r6 = X.AnonymousClass7TE.A1L(r0, r1)
            r2 = 0
            java.lang.String r1 = "entry_point"
            r0 = 1143(0x477, float:1.602E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0eP r3 = X.AnonymousClass7TE.A1L(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0 = 312(0x138, float:4.37E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r1)
            r0 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 532(0x214, float:7.45E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0eP[] r0 = X.AnonymousClass7TH.A0h(r0, r1, r6, r3, r2)
            android.os.Bundle r0 = X.Q21.A00(r0)
            r4.putExtras(r0)
            r0 = 16
            X.0kR.A05(r5, r4, r0)
        L_0x01a1:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x01a4:
            X.DbT.A1I(r5)
            goto L_0x01a1
        L_0x01a8:
            java.lang.Object r0 = r12.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r3 = r0.mArguments
            r2 = 1
            r1 = 0
            if (r3 == 0) goto L_0x01bf
            java.lang.String r0 = "argument_create_ad_code"
            boolean r0 = r3.getBoolean(r0, r1)
            if (r0 != r2) goto L_0x01bf
        L_0x01ba:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        L_0x01bf:
            r2 = 0
            goto L_0x01ba
        L_0x01c1:
            java.lang.Object r0 = r12.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x01d0
            java.lang.String r0 = "media_id"
            java.lang.String r5 = r1.getString(r0)
            return r5
        L_0x01d0:
            r5 = 0
            return r5
        L_0x01d2:
            java.lang.Object r0 = r12.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x01e3
            java.lang.String r0 = "argument_media_type"
            java.lang.String r5 = r1.getString(r0)
            if (r5 == 0) goto L_0x01e3
            return r5
        L_0x01e3:
            java.lang.String r0 = "No string passed in as asset value"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x01ea:
            java.lang.Object r0 = r12.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r2 = r0.mArguments
            r3 = 0
            r1 = 1
            if (r2 == 0) goto L_0x01fd
            java.lang.String r0 = "argument_show_action_bar"
            boolean r0 = r2.getBoolean(r0, r1)
            if (r0 != r1) goto L_0x01fd
            r3 = 1
        L_0x01fd:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L_0x0202:
            java.lang.Object r0 = r12.A01
            X.K5F r0 = (X.K5F) r0
            X.0eM r0 = r0.A07
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KBW r5 = new X.KBW
            r5.<init>(r0)
            return r5
        L_0x0212:
            java.lang.Object r1 = r12.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.1vn r0 = X.1vm.A01(r1)
            com.instagram.brandedcontent.project.BrandedContentProjectRepository r5 = new com.instagram.brandedcontent.project.BrandedContentProjectRepository
            r5.<init>(r1, r0)
            return r5
        L_0x0220:
            java.lang.Object r0 = r12.A01
            X.K84 r0 = (X.K84) r0
            X.0eM r0 = r0.A02
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KBX r5 = new X.KBX
            r5.<init>(r0)
            return r5
        L_0x0230:
            java.lang.Object r4 = r12.A01
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            X.1vn r3 = X.1vm.A01(r4)
            X.1Am r2 = X.1Al.A01(r4)
            X.1An r1 = X.1An.A0Y
            X.ACk r0 = X.C39864ACk.A00
            X.0xa r0 = X.C51969G9p.A0n(r2, r1, r0)
            X.LeO r5 = new X.LeO
            r5.<init>(r4, r3, r0)
            return r5
        L_0x024a:
            java.lang.Object r2 = r12.A01
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            com.instagram.monetization.api.MonetizationApi r11 = new com.instagram.monetization.api.MonetizationApi
            r11.<init>(r2)
            com.instagram.brandedcontent.repository.BrandedContentApi r8 = new com.instagram.brandedcontent.repository.BrandedContentApi
            r8.<init>(r2)
            X.2Dm r9 = X.1bJ.A00(r2)
            com.instagram.brandedcontent.project.BrandedContentProjectRepository r6 = X.C63090KrJ.A00(r2)
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r0 = 47
            X.MMG r1 = A00(r2, r0)
            java.lang.Class<X.LeO> r0 = X.C64582LeO.class
            java.lang.Object r7 = r2.A01(r0, r1)
            X.LeO r7 = (X.C64582LeO) r7
            X.1vn r10 = X.1vm.A01(r2)
            com.instagram.brandedcontent.repository.BrandedContentSettingsRepository r5 = new com.instagram.brandedcontent.repository.BrandedContentSettingsRepository
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        L_0x027c:
            java.lang.Object r0 = r12.A01
            com.instagram.brandedcontent.ui.BrandedContentFeedDisclosureController r0 = (com.instagram.brandedcontent.ui.BrandedContentFeedDisclosureController) r0
            com.instagram.common.session.UserSession r0 = r0.A02
            com.instagram.brandedcontent.project.BrandedContentProjectRepository r5 = X.C63090KrJ.A00(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MMG.invoke():java.lang.Object");
    }
}
