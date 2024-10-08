package X;

import android.view.View;

public final class FP2 implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public FP2(C49602EzL ezL, int i) {
        this.A00 = i;
        this.A01 = ezL;
    }

    public static void A00(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new FP2(obj, i), view);
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [X.G5C, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v11, types: [android.widget.ListAdapter, X.NKx] */
    /* JADX WARNING: type inference failed for: r0v461, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity] */
    /* JADX WARNING: type inference failed for: r0v519, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity] */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0675, code lost:
        r0 = "buildUpdater";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0700, code lost:
        if (r2.A1n(X.AnonymousClass7TE.A0l(r13.A0G)) != true) goto L_0x0702;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0945, code lost:
        r0 = 72425023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0a2a, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0a31, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x01d9, code lost:
        X.AnonymousClass0fD.A0C(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x01dc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0e7a, code lost:
        X.AnonymousClass0fD.A0C(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0e7d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0e85, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0e88, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0220, code lost:
        X.AnonymousClass0fD.A0C(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0223, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0052, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r23) {
        /*
            r22 = this;
            r2 = r22
            int r0 = r2.A00
            r4 = r23
            switch(r0) {
                case 0: goto L_0x0e3b;
                case 1: goto L_0x0e06;
                case 2: goto L_0x0daf;
                case 3: goto L_0x0d92;
                case 4: goto L_0x0d79;
                case 5: goto L_0x0d49;
                case 6: goto L_0x0d2c;
                case 7: goto L_0x0d13;
                case 8: goto L_0x0ce1;
                case 9: goto L_0x0cb1;
                case 10: goto L_0x0ca0;
                case 11: goto L_0x0c8d;
                case 12: goto L_0x0c7a;
                case 13: goto L_0x0c67;
                case 14: goto L_0x0bdd;
                case 15: goto L_0x0b89;
                case 16: goto L_0x0b2c;
                case 17: goto L_0x0af6;
                case 18: goto L_0x0a98;
                case 19: goto L_0x0a42;
                case 20: goto L_0x09eb;
                case 21: goto L_0x09d7;
                case 22: goto L_0x09c4;
                case 23: goto L_0x098b;
                case 24: goto L_0x0959;
                case 25: goto L_0x0102;
                case 26: goto L_0x085b;
                case 27: goto L_0x07c1;
                case 28: goto L_0x06ce;
                case 29: goto L_0x06c8;
                case 30: goto L_0x06b5;
                case 31: goto L_0x06a2;
                case 32: goto L_0x068d;
                case 33: goto L_0x0679;
                case 34: goto L_0x065a;
                case 35: goto L_0x0631;
                case 36: goto L_0x0607;
                case 37: goto L_0x05ce;
                case 38: goto L_0x05af;
                case 39: goto L_0x058a;
                case 40: goto L_0x0568;
                case 41: goto L_0x0547;
                case 42: goto L_0x0526;
                case 43: goto L_0x0511;
                case 44: goto L_0x04b7;
                case 45: goto L_0x048d;
                case 46: goto L_0x0479;
                case 47: goto L_0x045c;
                case 48: goto L_0x043a;
                case 49: goto L_0x03f9;
                case 50: goto L_0x03b8;
                case 51: goto L_0x038c;
                case 52: goto L_0x035e;
                case 53: goto L_0x030f;
                case 54: goto L_0x02d4;
                case 55: goto L_0x00b8;
                case 56: goto L_0x02bc;
                case 57: goto L_0x02b0;
                case 58: goto L_0x029e;
                case 59: goto L_0x027e;
                case 60: goto L_0x024b;
                case 61: goto L_0x022f;
                case 62: goto L_0x0085;
                case 63: goto L_0x0056;
                case 64: goto L_0x0203;
                case 65: goto L_0x01e8;
                case 66: goto L_0x0194;
                case 67: goto L_0x0160;
                case 68: goto L_0x013c;
                case 69: goto L_0x0117;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 1393578256(0x53105110, float:6.1983529E11)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            r0 = 2824(0xb08, float:3.957E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.DiU r6 = X.C46649DiU.A04(r0, r1)
            java.lang.Object r5 = r2.A01
            X.FRY r5 = (X.FRY) r5
            java.lang.String r0 = X.FRY.A09
            com.instagram.common.session.UserSession r3 = r5.A02
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.DbS.A0N(r3)
            com.instagram.base.activity.BaseFragmentActivity r0 = r5.A00
            if (r0 == 0) goto L_0x010e
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131957171(0x7f1315b3, float:1.9550918E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A0U = r0
            X.3M3 r1 = X.C49891FBs.A02(r2, r6)
            X.2jx r0 = r5.A01
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            X.6Yo r0 = X.DbU.A0Q(r0, r3)
            r0.A0D(r1)
            X.DbZ.A1Q(r0)
            r0 = 428505120(0x198a7820, float:1.4317384E-23)
        L_0x0052:
            X.AnonymousClass0fD.A0C(r0, r4)
        L_0x0055:
            return
        L_0x0056:
            r0 = 1665240913(0x63418f51, float:3.5705486E21)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A01
            X.FRY r1 = (X.FRY) r1
            java.lang.String r0 = X.FRY.A09
            X.2jx r0 = r1.A01
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            com.instagram.common.session.UserSession r6 = r1.A02
            X.6Yo r5 = X.DbU.A0Q(r0, r6)
            com.instagram.monetization.impl.MonetizationFragmentFactoryImpl r3 = X.F6R.A00()
            com.instagram.api.schemas.UserMonetizationProductType r2 = com.instagram.api.schemas.UserMonetizationProductType.UNRECOGNIZED
            r1 = 0
            r0 = 0
            androidx.fragment.app.Fragment r0 = r3.A00(r2, r6, r1, r0)
            r5.A0B(r1, r0)
            r5.A04()
            r0 = -1090465207(0xffffffffbf00d249, float:-0.5032087)
            goto L_0x0052
        L_0x0085:
            r0 = -1180872147(0xffffffffb99d522d, float:-3.00066E-4)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A01
            X.FRY r1 = (X.FRY) r1
            java.lang.String r0 = X.FRY.A09
            com.instagram.base.activity.BaseFragmentActivity r0 = r1.A00
            if (r0 == 0) goto L_0x0e7e
            com.instagram.common.session.UserSession r3 = r1.A02
            X.6Yo r2 = X.DbU.A0Q(r0, r3)
            java.lang.String r1 = "com.instagram.shopping.screens.shop_linking_creator"
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            X.DiU r1 = X.C46649DiU.A04(r1, r0)
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = X.DbS.A0N(r3)
            X.3M3 r0 = X.C49891FBs.A02(r0, r1)
            r2.A0D(r0)
            X.DbZ.A1Q(r2)
            r0 = -1761572305(0xffffffff97008a2f, float:-4.1533443E-25)
            goto L_0x0052
        L_0x00b8:
            java.lang.Object r6 = r2.A01
            X.EzL r6 = (X.C49602EzL) r6
            com.instagram.common.session.UserSession r7 = r6.A02
            java.lang.String r2 = "ads"
            java.lang.String r0 = "ad_topics_entered"
            r1 = 0
            X.FCT.A02(r7, r2, r0)
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x0055
            r0 = 1
            r6.A00 = r0
            X.ES8 r5 = r6.A03
            X.2nI r4 = X.C229382nI.A03(r5, r7, r1)
            java.lang.String r1 = "referer"
            java.lang.String r0 = "settings_ad_options"
            java.util.Map r3 = java.util.Collections.singletonMap(r1, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36311474586583578(0x8101180001021a, double:3.026860970903061E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x00ff
            X.Wuz r3 = X.FHB.A01()
            r0 = 138(0x8a, float:1.93E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x00f2:
            X.8ey r1 = X.C359988do.A04(r7, r0, r3)
            r0 = 15
            X.E86.A01(r1, r6, r4, r0)
            r5.schedule(r1)
            return
        L_0x00ff:
            java.lang.String r0 = "com.instagram.sensitive_topics.sensitive_topics.ad_topic_preferences_view"
            goto L_0x00f2
        L_0x0102:
            r0 = 919390021(0x36ccc745, float:6.102872E-6)
            int r4 = X.AnonymousClass0fD.A05(r0)
            r0 = -79935452(0xfffffffffb3c4824, float:-9.77615E35)
            goto L_0x0052
        L_0x010e:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            r0 = 847637818(0x3285ed3a, float:1.5591116E-8)
            goto L_0x0e85
        L_0x0117:
            r0 = 2147078936(0x7ff9d318, float:NaN)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.6Yo r5 = X.Dbc.A06(r0)
            X.F1W r4 = X.FCL.A00()
            com.instagram.api.schemas.IGRevShareProductType r2 = com.instagram.api.schemas.IGRevShareProductType.PROFILE_ADS
            java.lang.String r0 = "SETTINGS"
            r1 = 0
            X.EN1 r0 = r4.A00(r2, r0, r1)
            r5.A0B(r1, r0)
            X.DbZ.A1Q(r5)
            r0 = 672055174(0x280ebf86, float:7.9241135E-15)
            goto L_0x01d9
        L_0x013c:
            r0 = 1612318541(0x601a074d, float:4.43957E19)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.6Yo r5 = X.Dbc.A06(r0)
            X.F1W r4 = X.FCL.A00()
            com.instagram.api.schemas.IGRevShareProductType r2 = com.instagram.api.schemas.IGRevShareProductType.REELS_OVERLAY_ADS
            java.lang.String r0 = "SETTINGS"
            r1 = 0
            X.EN1 r0 = r4.A00(r2, r0, r1)
            r5.A0B(r1, r0)
            X.DbZ.A1Q(r5)
            r0 = -1932840624(0xffffffff8ccb3150, float:-3.1306781E-31)
            goto L_0x01d9
        L_0x0160:
            r0 = -691425071(0xffffffffd6c9b0d1, float:-1.10880629E14)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A01
            X.FRY r1 = (X.FRY) r1
            java.lang.String r0 = X.FRY.A09
            X.2jx r0 = r1.A01
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            com.instagram.common.session.UserSession r5 = r1.A02
            X.6Yo r1 = X.DbU.A0Q(r0, r5)
            X.1Z0 r0 = X.AnonymousClass2BF.A00()
            X.LBX r4 = r0.A02()
            java.lang.String r6 = "SETTINGS"
            r7 = 0
            r9 = 0
            r8 = r7
            X.KUZ r0 = r4.A00(r5, r6, r7, r8, r9)
            r1.A0B(r7, r0)
            X.DbZ.A1Q(r1)
            r0 = 1830264377(0x6d179e39, float:2.9327197E27)
            goto L_0x01d9
        L_0x0194:
            r0 = 900065789(0x35a5e9fd, float:1.2361558E-6)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "com.bloks.www.payments.igp2m.chat_payments"
            X.DiU r6 = X.C46649DiU.A04(r0, r1)
            java.lang.Object r5 = r2.A01
            X.FRY r5 = (X.FRY) r5
            java.lang.String r0 = X.FRY.A09
            com.instagram.common.session.UserSession r4 = r5.A02
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.DbS.A0N(r4)
            com.instagram.base.activity.BaseFragmentActivity r0 = r5.A00
            if (r0 == 0) goto L_0x01dd
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131955064(0x7f130d78, float:1.9546645E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A0U = r0
            X.3M3 r1 = X.C49891FBs.A02(r2, r6)
            X.2jx r0 = r5.A01
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            X.6Yo r0 = X.DbU.A0Q(r0, r4)
            r0.A0D(r1)
            X.DbZ.A1Q(r0)
            r0 = -58302064(0xfffffffffc866190, float:-5.5819727E36)
        L_0x01d9:
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        L_0x01dd:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            r0 = 2124422587(0x7ea01dbb, float:1.0641542E38)
            X.AnonymousClass0fD.A0C(r0, r3)
            throw r2
        L_0x01e8:
            r0 = -1703336317(0xffffffff9a792683, float:-5.1523103E-23)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A01
            X.FRY r1 = (X.FRY) r1
            java.lang.String r0 = X.FRY.A09
            android.content.Context r2 = X.DbS.A08(r1)
            com.instagram.common.session.UserSession r1 = r1.A02
            r0 = 0
            X.OP2.A01(r1, r2, r0)
            r0 = -63502933(0xfffffffffc3705ab, float:-3.801221E36)
            goto L_0x0220
        L_0x0203:
            r0 = 940159037(0x3809b03d, float:3.282748E-5)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r2.A01
            X.FRY r1 = (X.FRY) r1
            java.lang.String r0 = X.FRY.A09
            com.instagram.base.activity.BaseFragmentActivity r4 = r1.A00
            if (r4 == 0) goto L_0x0224
            com.instagram.common.session.UserSession r3 = r1.A02
            java.lang.String r2 = "settings_business_options"
            r1 = 0
            r0 = 1
            X.C49950FGf.A07(r4, r3, r2, r1, r0)
            r0 = 1605869662(0x5fb7a05e, float:2.6463358E19)
        L_0x0220:
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        L_0x0224:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            r0 = 40803906(0x26e9e42, float:1.7530896E-37)
            X.AnonymousClass0fD.A0C(r0, r5)
            throw r2
        L_0x022f:
            r0 = 1294114758(0x4d229fc6, float:1.70523744E8)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.6Yo r2 = X.Dbc.A06(r0)
            X.E47 r0 = X.C49892FBu.A01()
            r2.A0D(r0)
            X.DbZ.A1Q(r2)
            r0 = -488392681(0xffffffffe2e3b817, float:-2.100338E21)
            goto L_0x0e7a
        L_0x024b:
            r0 = 1004923057(0x3be5e8b1, float:0.0070162644)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r2.A01
            X.FRY r4 = (X.FRY) r4
            java.lang.String r0 = X.FRY.A09
            com.instagram.common.session.UserSession r3 = r4.A02
            java.lang.String r0 = r3.A06
            java.lang.Long r0 = X.DbV.A0q(r0)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "merchant_id"
            java.util.HashMap r2 = X.DbY.A0m(r0, r2)
            java.lang.String r0 = "com.bloks.www.services.ig.appointment.booking.opt_out.setting"
            X.DiU r2 = X.C46649DiU.A04(r0, r2)
            X.2jx r0 = r4.A01
            android.content.Context r0 = r0.getContext()
            X.C46649DiU.A09(r0, r2, r3)
            r0 = -274622775(0xffffffffefa196c9, float:-1.0001875E29)
            goto L_0x0e7a
        L_0x027e:
            java.lang.Object r4 = r2.A01
            X.EzL r4 = (X.C49602EzL) r4
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "com.instagram.ads.ads_interests.ads_interests_screen"
            X.DiU r3 = X.C46649DiU.A04(r0, r1)
            androidx.fragment.app.FragmentActivity r2 = r4.A01
            com.instagram.common.session.UserSession r0 = r4.A02
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.DbS.A0N(r0)
            r0 = 2131952242(0x7f130272, float:1.9540921E38)
            X.DbS.A18(r2, r1, r0)
            r3.A0D(r2, r1)
            return
        L_0x029e:
            java.lang.Object r0 = r2.A01
            X.EzL r0 = (X.C49602EzL) r0
            androidx.fragment.app.FragmentActivity r2 = r0.A01
            com.instagram.common.session.UserSession r1 = r0.A02
            java.lang.String r0 = "https://help.instagram.com/1079023176238541"
            com.instagram.simplewebview.SimpleWebViewConfig r0 = X.Dba.A0N(r0)
            com.instagram.simplewebview.SimpleWebViewActivity.A00(r2, r1, r0)
            return
        L_0x02b0:
            java.lang.Object r0 = r2.A01
            X.EzL r0 = (X.C49602EzL) r0
            androidx.fragment.app.FragmentActivity r1 = r0.A01
            com.instagram.common.session.UserSession r0 = r0.A02
            X.C270804hK.A01(r1, r0)
            return
        L_0x02bc:
            java.lang.Object r0 = r2.A01
            X.EzL r0 = (X.C49602EzL) r0
            androidx.fragment.app.FragmentActivity r1 = r0.A01
            com.instagram.common.session.UserSession r0 = r0.A02
            X.6Yo r1 = X.DbU.A0Q(r1, r0)
            com.instagram.adshistory.fragment.RecentAdActivityFragment r0 = new com.instagram.adshistory.fragment.RecentAdActivityFragment
            r0.<init>()
            r1.A0E(r0)
            r1.A04()
            return
        L_0x02d4:
            r0 = 1606532117(0x5fc1bc15, float:2.7920112E19)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r2.A01
            X.E1Z r3 = (X.E1Z) r3
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            X.0eM r0 = r3.A06
            X.6Yo r2 = X.DbX.A0N(r2, r0)
            r8 = 1
            r2.A0F = r8
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r5 = "privacy_switch_bottom_sheet"
            r6 = 0
            r7 = r6
            r9 = r8
            r10 = r6
            androidx.fragment.app.Fragment r0 = X.C46354Dcy.A00(r4, r5, r6, r7, r8, r9, r10)
            r2.A0D(r0)
            r2.A04()
            X.Euw r0 = r3.A00
            if (r0 == 0) goto L_0x030a
            X.7Pu r2 = r0.A00
            r0 = 0
            r2.A0L(r0)
        L_0x030a:
            r0 = 411291834(0x1883d0ba, float:3.4073466E-24)
            goto L_0x0e7a
        L_0x030f:
            r0 = 2123780098(0x7e965002, float:9.989981E37)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r2.A01
            X.E1Z r3 = (X.E1Z) r3
            X.0eM r0 = r3.A07
            java.lang.Object r2 = r0.getValue()
            X.0wc r2 = (X.0wc) r2
            java.lang.String r0 = "follow_request_entrypoint_tapped"
            X.0Aj r0 = X.AnonymousClass7TE.A0e(r2, r0)
            java.lang.String r5 = "privacy_switch_bottom_sheet"
            X.DbS.A1O(r0, r5)
            r0.Cgf()
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            X.0eM r0 = r3.A06
            X.6Yo r2 = X.DbX.A0N(r2, r0)
            r8 = 1
            r2.A0F = r8
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            r6 = 0
            r7 = r6
            r9 = r8
            r10 = r8
            androidx.fragment.app.Fragment r0 = X.C46354Dcy.A00(r4, r5, r6, r7, r8, r9, r10)
            r2.A0D(r0)
            r2.A04()
            X.Euw r0 = r3.A00
            if (r0 == 0) goto L_0x0359
            X.7Pu r2 = r0.A00
            r0 = 0
            r2.A0L(r0)
        L_0x0359:
            r0 = 134421121(0x8031a81, float:3.9452534E-34)
            goto L_0x0e7a
        L_0x035e:
            r0 = 1684495416(0x64675c38, float:1.7071372E22)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r2.A01
            X.EyE r2 = (X.EyE) r2
            java.lang.String r4 = "accessibility"
            com.instagram.common.session.UserSession r3 = r2.A01
            java.lang.String r0 = "translation_settings_entered"
            r5 = 0
            X.FCT.A01(r5, r3, r4, r0, r5)
            androidx.fragment.app.FragmentActivity r0 = r2.A00
            X.6Yo r2 = X.DbU.A0Q(r0, r3)
            r6 = 0
            r7 = r6
            r8 = r6
            r9 = r6
            X.ES2 r0 = X.C48765Ejo.A00(r3, r4, r5, r6, r7, r8, r9)
            r2.A0B(r5, r0)
            r2.A04()
            r0 = 377204169(0x167badc9, float:2.0330455E-25)
            goto L_0x0e7a
        L_0x038c:
            r0 = 731538719(0x2b9a651f, float:1.0970425E-12)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r2.A01
            X.EyE r5 = (X.EyE) r5
            java.lang.String r3 = "accessibility"
            com.instagram.common.session.UserSession r4 = r5.A01
            java.lang.String r2 = "color_filter_settings_entered"
            r0 = 0
            X.FCT.A01(r0, r4, r3, r2, r0)
            androidx.fragment.app.FragmentActivity r0 = r5.A00
            X.6Yo r3 = X.DbU.A0Q(r0, r4)
            X.ERc r2 = new X.ERc
            r2.<init>()
            android.os.Bundle r0 = X.DbV.A0A(r4)
            X.DbW.A0y(r0, r2, r3)
            r0 = 2017438123(0x783fa9ab, float:1.5549531E34)
            goto L_0x0e7a
        L_0x03b8:
            r0 = 1193413520(0x47220b90, float:41483.562)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r2.A01
            X.EyE r2 = (X.EyE) r2
            java.lang.String r4 = "accessibility"
            com.instagram.common.session.UserSession r3 = r2.A01
            r0 = 56
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5 = 0
            X.FCT.A01(r5, r3, r4, r0, r5)
            androidx.fragment.app.FragmentActivity r0 = r2.A00
            X.6Yo r2 = X.DbU.A0Q(r0, r3)
            boolean r0 = X.AnonymousClass3WP.A05(r3)
            r6 = 1
            if (r0 == 0) goto L_0x03f0
            X.E2R r0 = X.C48763Ejm.A00(r6)
        L_0x03e2:
            X.0qQ.A0A(r0)
            r2.A0B(r5, r0)
            r2.A04()
            r0 = -1310019590(0xffffffffb1eaaffa, float:-6.8303025E-9)
            goto L_0x0e7a
        L_0x03f0:
            r7 = 0
            r8 = r7
            r9 = r7
            r10 = r7
            X.ES1 r0 = X.C48762Ejl.A00(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x03e2
        L_0x03f9:
            r0 = 2055635479(0x7a868217, float:3.4920316E35)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r2.A01
            X.E5j r3 = (X.C47504E5j) r3
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            if (r0 == 0) goto L_0x0435
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            X.0aP r0 = r3.A00
            X.6Yo r4 = X.DbS.A0M(r2, r0)
            X.DbW.A0X()
            com.instagram.registration.model.RegFlowExtras r3 = r3.A01
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "RegFlowExtras.EXTRA_KEY"
            r2.putParcelable(r0, r3)
            java.lang.String r0 = "IgSessionManager.LOGGED_OUT_TOKEN"
            X.DbS.A1A(r2, r0)
            X.E3Y r0 = new X.E3Y
            r0.<init>()
            r0.setArguments(r2)
            r4.A0E(r0)
            r4.A04()
        L_0x0435:
            r0 = 1487771878(0x58ad98e6, float:1.52697764E15)
            goto L_0x0e7a
        L_0x043a:
            java.lang.Object r1 = r2.A01
            X.E59 r1 = (X.E59) r1
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r1.A0B
            r0.A03()
            com.instagram.registration.ui.NotificationBar r0 = r1.A06
            r0.A02()
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r0 = r1.A09
            r0.A03()
            X.EzK r0 = r1.A08
            android.view.View r0 = r0.A00
            X.AnonymousClass7TH.A0R(r0)
            android.widget.ImageView r1 = r1.A01
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x045c:
            r0 = -1538264086(0xffffffffa44ff3ea, float:-4.5092573E-17)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.FAf r0 = (X.C49863FAf) r0
            X.F3J r2 = r0.A08
            com.instagram.user.model.User r4 = r0.A09
            X.G7P r3 = r0.A07
            java.lang.String r5 = "school"
            r6 = 1
            r7 = 0
            r2.A01(r3, r4, r5, r6, r7)
            r0 = -57153284(0xfffffffffc97e8fc, float:-6.3100985E36)
            goto L_0x0e7a
        L_0x0479:
            r0 = -1930919572(0xffffffff8ce8816c, float:-3.5823153E-31)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r2.A01
            X.FAf r2 = (X.C49863FAf) r2
            r0 = 0
            X.C49863FAf.A00(r2, r0)
            r0 = 1458235314(0x56eae7b2, float:1.29140422E14)
            goto L_0x0e7a
        L_0x048d:
            r0 = 1101633886(0x41a9995e, float:21.199886)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r2.A01
            X.FAf r2 = (X.C49863FAf) r2
            X.1Z4 r3 = X.1Z4.A00
            android.content.Context r4 = r2.A00
            com.instagram.common.session.UserSession r6 = r2.A06
            androidx.fragment.app.FragmentActivity r5 = r2.A02
            X.0iw r0 = r2.A04
            java.lang.String r9 = r0.getModuleName()
            com.instagram.user.model.User r7 = r2.A09
            X.G8B r8 = r2.A0A
            java.lang.String r11 = r7.getUsername()
            r10 = 0
            r3.A00(r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = 1174211958(0x45fd0d76, float:8097.6826)
            goto L_0x0e7a
        L_0x04b7:
            r0 = 1422497891(0x54c99863, float:6.9267604E12)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.FAf r0 = (X.C49863FAf) r0
            com.instagram.user.model.User r9 = r0.A09
            java.lang.String r8 = r9.getId()
            boolean r2 = r9.isRestricted()
            X.1YZ r3 = X.1YZ.A02
            if (r3 == 0) goto L_0x04e7
            if (r2 == 0) goto L_0x04ec
            androidx.fragment.app.FragmentActivity r4 = r0.A02
            X.07i r5 = r0.A03
            com.instagram.common.session.UserSession r6 = r0.A06
            X.0iw r2 = r0.A04
            java.lang.String r9 = r2.getModuleName()
            r2 = 3
            X.FoH r7 = new X.FoH
            r7.<init>(r0, r2)
            r3.A02(r4, r5, r6, r7, r8, r9)
        L_0x04e7:
            r0 = -740953411(0xffffffffd3d5f2bd, float:-1.83780101E12)
            goto L_0x0e7a
        L_0x04ec:
            X.I0s r3 = r3.A00()
            com.instagram.common.session.UserSession r8 = r0.A06
            android.content.Context r4 = r0.A00
            X.0wc r7 = r0.A05
            X.0iw r2 = r0.A04
            java.lang.String r13 = r2.getModuleName()
            X.EVg r11 = X.C48088EVg.PROFILE_OVERFLOW
            r5 = 0
            r2 = 1
            X.FoT r12 = new X.FoT
            r12.<init>(r0, r2)
            r0 = 2
            X.FoP r10 = new X.FoP
            r10.<init>(r0)
            r6 = r5
            r14 = r5
            r3.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x04e7
        L_0x0511:
            r0 = -1768923539(0xffffffff96905e6d, float:-2.3324046E-25)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.E0b r0 = (X.E0b) r0
            X.0sa r0 = r0.A01
            r0.invoke()
            r0 = -1892644612(0xffffffff8f3088fc, float:-8.703852E-30)
            goto L_0x0e7a
        L_0x0526:
            r0 = 1141119884(0x44041b8c, float:528.4304)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r2.A01
            X.Doo r2 = (X.C46996Doo) r2
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.FYG r0 = r2.A00
            if (r0 == 0) goto L_0x0542
            X.0sP r2 = r2.A03
            int r0 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.invoke(r0)
        L_0x0542:
            r0 = -1147601523(0xffffffffbb98fd8d, float:-0.0046688975)
            goto L_0x0e7a
        L_0x0547:
            r0 = -1904283222(0xffffffff8e7ef1aa, float:-3.1424274E-30)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r2.A01
            X.Doo r2 = (X.C46996Doo) r2
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.FYG r0 = r2.A00
            if (r0 == 0) goto L_0x0563
            X.0sP r2 = r2.A03
            int r0 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.invoke(r0)
        L_0x0563:
            r0 = -686382304(0xffffffffd716a320, float:-1.65627361E14)
            goto L_0x0e7a
        L_0x0568:
            r0 = -1711698734(0xffffffff99f98cd2, float:-2.5802873E-23)
            int r1 = X.DbX.A03(r4, r0)
            java.lang.Object r3 = r2.A01
            X.ERb r3 = (X.C48014ERb) r3
            X.F1n r2 = r3.A05
            if (r2 == 0) goto L_0x0586
            java.lang.String r0 = "report_anyway"
            r2.A00(r0)
            android.view.View$OnClickListener r0 = r3.A0D
            r0.onClick(r4)
            r0 = -877152003(0xffffffffcbb7b8fd, float:-2.408089E7)
            goto L_0x0e7a
        L_0x0586:
            java.lang.String r0 = "dogfoodingRageshakeLogger"
            goto L_0x0a2a
        L_0x058a:
            r0 = -53561744(0xfffffffffcceb670, float:-8.5865074E36)
            int r1 = X.AnonymousClass0fD.A05(r0)
            X.0b6 r0 = X.0b6.A00()
            X.0Qv r4 = r0.A0A()
            java.lang.Object r3 = r2.A01
            X.ESC r3 = (X.ESC) r3
            java.lang.String r0 = r3.A02
            android.content.Intent r2 = X.DbX.A09(r0)
            android.content.Context r0 = r3.requireContext()
            r4.A0G(r0, r2)
            r0 = 1443621160(0x560be928, float:3.8458379E13)
            goto L_0x0e7a
        L_0x05af:
            r0 = 738239219(0x2c00a2f3, float:1.828035E-12)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.ESC r0 = (X.ESC) r0
            X.9FM r3 = r0.A00
            if (r3 == 0) goto L_0x0675
            android.content.Context r2 = r0.requireContext()
            boolean r0 = X.0oI.A09(r2)
            r3.A01(r2, r0)
            r0 = -1152472672(0xffffffffbb4ea9a0, float:-0.003153421)
            goto L_0x0e7a
        L_0x05ce:
            r0 = 1002005808(0x3bb96530, float:0.0056578144)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.ESC r0 = (X.ESC) r0
            android.content.Context r2 = r0.requireContext()
            X.0eM r0 = r0.A03
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.38k r0 = X.C2375838h.A00(r2, r0)
            r2 = 0
            r0.A00(r2)
            X.0xa r0 = r0.A04
            X.0xY r4 = r0.AR4()
            long r2 = java.lang.System.currentTimeMillis()
            r0 = 1285(0x505, float:1.8E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.E5c(r0, r2)
            r4.apply()
            r0 = -1867483019(0xffffffff90b07875, float:-6.9605353E-29)
            goto L_0x0e7a
        L_0x0607:
            r0 = 1136884212(0x43c379f4, float:390.95276)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.ESC r0 = (X.ESC) r0
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.0eM r0 = r0.A03
            X.6Yo r4 = X.DbX.A0N(r2, r0)
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            r2 = 0
            r0 = 1
            X.H0l r0 = X.C55101HcA.A00(r3, r2, r0)
            r4.A0D(r0)
            r4.A04()
            r0 = 1971655335(0x758512a7, float:3.373798E32)
            goto L_0x0e7a
        L_0x0631:
            r0 = -2105022291(0xffffffff8287e8ad, float:-1.9970017E-37)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.ESC r0 = (X.ESC) r0
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            X.0eM r0 = r0.A03
            X.6Yo r3 = X.DbX.A0N(r2, r0)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            r0 = 0
            X.H0l r0 = X.C55101HcA.A00(r2, r0, r0)
            r3.A0D(r0)
            r3.A04()
            r0 = 316823756(0x12e258cc, float:1.4284495E-27)
            goto L_0x0e7a
        L_0x065a:
            r0 = 866094237(0x339f8c9d, float:7.429592E-8)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.ESC r0 = (X.ESC) r0
            X.9FM r2 = r0.A00
            if (r2 == 0) goto L_0x0675
            android.content.Context r0 = r0.requireContext()
            r2.A00(r0)
            r0 = 850694456(0x32b49138, float:2.1020796E-8)
            goto L_0x0e7a
        L_0x0675:
            java.lang.String r0 = "buildUpdater"
            goto L_0x0a2a
        L_0x0679:
            r0 = -1921317707(0xffffffff8d7b04b5, float:-7.7351012E-31)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r2.A01
            X.EEK r2 = (X.EEK) r2
            r0 = 0
            r2.A03(r0)
            r0 = -421242991(0xffffffffe6e45791, float:-5.3915744E23)
            goto L_0x0e7a
        L_0x068d:
            r0 = -1127361408(0xffffffffbccdd480, float:-0.025125742)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.E5R r0 = (X.E5R) r0
            android.view.View$OnClickListener r0 = r0.A00
            r0.onClick(r4)
            r0 = 1758311585(0x68cdb4a1, float:7.771337E24)
            goto L_0x0e7a
        L_0x06a2:
            r0 = 831302541(0x318cab8d, float:4.0940393E-9)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.6mk r0 = (X.C317116mk) r0
            r0.CuP()
            r0 = -1668385919(0xffffffff9c8e7381, float:-9.426629E-22)
            goto L_0x0e7a
        L_0x06b5:
            r0 = -920569843(0xffffffffc921380d, float:-660352.8)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.6mk r0 = (X.C317116mk) r0
            r0.CuP()
            r0 = -2119342658(0xffffffff81ad65be, float:-6.3696156E-38)
            goto L_0x0e7a
        L_0x06c8:
            java.lang.Object r0 = r2.A01
            X.Dbb.A1S(r0)
            return
        L_0x06ce:
            r0 = -512748392(0xffffffffe1701498, float:-2.767939E20)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r13 = r2.A01
            X.K7b r13 = (X.K7b) r13
            X.8ab r11 = X.DbW.A0U(r13)
            r9 = 1
            r11.A0s(r9)
            r3 = 2131974282(0x7f13588a, float:1.9585624E38)
            r2 = 12
            X.MMd r0 = new X.MMd
            r0.<init>(r13, r2)
            X.Exk r6 = new X.Exk
            r6.<init>(r0, r3, r9)
            X.3uh r2 = r13.A02
            r10 = 0
            if (r2 == 0) goto L_0x0702
            X.0eM r0 = r13.A0G
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            boolean r2 = r2.A1n(r0)
            r0 = 1
            if (r2 == r9) goto L_0x0703
        L_0x0702:
            r0 = 0
        L_0x0703:
            r5 = 0
            if (r0 != 0) goto L_0x0707
            r6 = r5
        L_0x0707:
            X.JuR r8 = r13.A03
            java.lang.String r0 = "response"
            if (r8 == 0) goto L_0x0a2a
            com.instagram.api.schemas.MediaPromptPrefType r7 = r8.A00
            com.instagram.api.schemas.MediaPromptPrefType r14 = com.instagram.api.schemas.MediaPromptPrefType.ON
            r3 = 2131970892(0x7f134b4c, float:1.9578748E38)
            if (r7 != r14) goto L_0x0719
            r3 = 2131970891(0x7f134b4b, float:1.9578746E38)
        L_0x0719:
            r2 = 13
            X.MMd r0 = new X.MMd
            r0.<init>(r13, r2)
            X.Exk r4 = new X.Exk
            r4.<init>(r0, r3, r10)
            com.instagram.api.schemas.MediaPromptPrefType r12 = com.instagram.api.schemas.MediaPromptPrefType.NOT_APPLICABLE
            if (r7 != r12) goto L_0x072a
            r4 = r5
        L_0x072a:
            com.instagram.api.schemas.MediaPromptPrefType r8 = r8.A01
            r7 = 2131970890(0x7f134b4a, float:1.9578744E38)
            if (r8 != r14) goto L_0x0734
            r7 = 2131970889(0x7f134b49, float:1.9578742E38)
        L_0x0734:
            r2 = 14
            X.MMd r0 = new X.MMd
            r0.<init>(r13, r2)
            X.Exk r3 = new X.Exk
            r3.<init>(r0, r7, r10)
            if (r8 == r12) goto L_0x0753
            X.3uh r2 = r13.A02
            if (r2 == 0) goto L_0x0753
            X.0eM r0 = r13.A0G
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            boolean r0 = r2.A1n(r0)
            if (r0 != r9) goto L_0x0753
            r5 = r3
        L_0x0753:
            r3 = 2131954722(0x7f130c22, float:1.9545951E38)
            X.G1u r2 = X.C51785G1u.A00
            X.Exk r0 = new X.Exk
            r0.<init>(r2, r3, r10)
            X.Exk[] r0 = new X.C49549Exk[]{r6, r4, r5, r0}
            X.0qQ.A0B(r0, r10)
            java.util.List r2 = X.03t.A0I(r0)
            X.Exk[] r0 = new X.C49549Exk[r10]
            java.lang.Object[] r12 = r2.toArray(r0)
            X.Exk[] r12 = (X.C49549Exk[]) r12
            X.0qQ.A0B(r12, r10)
            android.content.Context r9 = r11.A0Q
            X.0lg r2 = r11.A04
            X.0iw r0 = X.C358248ab.A0d
            X.NKx r8 = new X.NKx
            r8.<init>(r9, r2, r0)
            boolean r0 = r11.A06
            r8.shouldCenterText = r0
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            int r6 = r12.length
            r5 = 0
        L_0x0788:
            if (r5 >= r6) goto L_0x07ae
            r13 = r12[r5]
            int r4 = r13.A00
            boolean r2 = r13.A02
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
            if (r2 == 0) goto L_0x0798
            r0 = 2130970215(0x7f040667, float:1.7549134E38)
        L_0x0798:
            int r3 = X.2Yu.A0H(r9, r0)
            r0 = 45
            X.FPF r2 = new X.FPF
            r2.<init>((int) r0, (java.lang.Object) r13, (java.lang.Object) r11)
            X.Fmc r0 = new X.Fmc
            r0.<init>(r9, r2, r4, r3)
            r7.add(r0)
            int r5 = r5 + 1
            goto L_0x0788
        L_0x07ae:
            r8.addDialogMenuItems(r7)
            android.widget.ListView r0 = r11.A0Y
            r0.setAdapter(r8)
            r0.setVisibility(r10)
            X.DbT.A1V(r11)
            r0 = 1482978699(0x5864758b, float:1.00477398E15)
            goto L_0x0e7a
        L_0x07c1:
            r0 = -1835798250(0xffffffff9293f116, float:-9.3364365E-28)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r2.A01
            X.E5n r5 = (X.C47505E5n) r5
            java.util.HashSet r2 = r5.A0M
            boolean r0 = X.DbT.A1b(r2)
            if (r0 == 0) goto L_0x0856
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1D(r2)
            X.0eM r0 = r5.A0N
            X.0lg r6 = X.DbT.A0X(r0)
            java.util.ArrayList r9 = X.AnonymousClass7TF.A0p(r4)
            java.util.Iterator r2 = r4.iterator()
        L_0x07e6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x07f0
            X.DbY.A1W(r9, r2)
            goto L_0x07e6
        L_0x07f0:
            java.lang.String r8 = r5.A0B
            X.EW0 r0 = r5.A06
            java.lang.String r3 = r0.A00
            r7 = 0
            X.AnonymousClass7TG.A0w(r7, r6, r8, r3)
            X.0wc r2 = X.AnonymousClass0kN.A01(r5, r6)
            java.lang.String r0 = "direct_share_media"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r0)
            r0 = 147(0x93, float:2.06E-43)
            X.1Ln r6 = new X.1Ln
            r6.<init>(r2, r0)
            boolean r0 = X.DbT.A1Y(r6)
            if (r0 == 0) goto L_0x083f
            java.lang.String r0 = "entry_point"
            r6.A0R(r0, r3)
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r9)
            java.util.Iterator r2 = r9.iterator()
        L_0x081e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0832
            java.lang.String r0 = X.AnonymousClass7TE.A18(r2)
            X.4Ny r0 = X.C263944Ny.A00(r0)
            java.lang.Long r0 = r0.A00
            r3.add(r0)
            goto L_0x081e
        L_0x0832:
            java.lang.String r0 = "recipient_ids"
            r6.A0S(r0, r3)
            java.lang.String r0 = "share_sheet_session_id"
            r6.A0R(r0, r8)
            r6.Cgf()
        L_0x083f:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r5.A05
            if (r0 != 0) goto L_0x0847
            java.lang.String r0 = "actionButton"
            goto L_0x0a2a
        L_0x0847:
            r0.setEnabled(r7)
            X.G6J r2 = r5.A07
            if (r2 == 0) goto L_0x0853
            boolean r0 = r5.A0C
            r2.Dwj(r4, r0)
        L_0x0853:
            X.DbT.A1J(r5)
        L_0x0856:
            r0 = -1052782071(0xffffffffc13fd209, float:-11.988778)
            goto L_0x0e7a
        L_0x085b:
            r0 = 1679017886(0x6413c79e, float:1.0904221E22)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r2.A01
            X.E6J r4 = (X.E6J) r4
            X.17i r2 = r4.A05
            r8 = 0
            if (r2 != 0) goto L_0x086f
            java.lang.String r0 = "userCache"
            goto L_0x0a2a
        L_0x086f:
            com.instagram.reels.groupmention.fragment.GroupMentionQuickReplySheetContent r0 = r4.A03
            if (r0 == 0) goto L_0x0955
            java.lang.String r0 = r0.A01
            com.instagram.user.model.User r3 = r2.A02(r0)
            com.instagram.model.reels.Reel r2 = r4.A02
            if (r2 != 0) goto L_0x0881
            java.lang.String r0 = "baseReel"
            goto L_0x0a2a
        L_0x0881:
            X.0eM r5 = r4.A0D
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            java.util.List r0 = r2.A0O(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x088f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0945
            java.lang.Object r7 = r6.next()
            X.3uh r7 = (X.C255773uh) r7
            java.lang.String r2 = r7.A0j
            java.lang.String r0 = r4.A06
            if (r0 != 0) goto L_0x08a5
            java.lang.String r0 = "baseReelItemId"
            goto L_0x0a2a
        L_0x08a5:
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x088f
            X.0lg r6 = X.DbT.A0X(r5)
            java.lang.String r12 = r7.A0k
            X.0qQ.A07(r12)
            X.1Xj r10 = r7.A0b
            if (r10 == 0) goto L_0x08d5
            X.1iA r0 = r10.BR7()
        L_0x08bc:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            if (r2 != 0) goto L_0x08c4
            java.lang.String r2 = ""
        L_0x08c4:
            r0 = 396(0x18c, float:5.55E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.C3265677h.A0L(r4, r6, r0, r12, r2)
            com.instagram.common.ui.base.IgEditText r0 = r4.A00
            if (r0 != 0) goto L_0x08d7
            java.lang.String r0 = "replyMessage"
            goto L_0x0a2a
        L_0x08d5:
            r0 = r8
            goto L_0x08bc
        L_0x08d7:
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            java.lang.String r14 = X.DbV.A12(r0)
            int r0 = r14.length()
            if (r0 <= 0) goto L_0x0945
            if (r3 == 0) goto L_0x0945
            X.1pG r2 = X.AnonymousClass1pH.A00()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            X.Mew r2 = r2.E52(r0)
            com.instagram.model.direct.DirectShareTarget r0 = new com.instagram.model.direct.DirectShareTarget
            r0.<init>((com.instagram.user.model.User) r3)
            X.7Z7 r7 = r2.A00(r0)
            com.instagram.model.direct.DirectShareTarget r11 = new com.instagram.model.direct.DirectShareTarget
            r11.<init>((com.instagram.user.model.User) r3)
            java.lang.String r13 = "ig_group_mention_user_list"
            if (r10 == 0) goto L_0x094a
            r3 = 0
            java.lang.String r0 = ""
            X.9cP r9 = new X.9cP
            r9.<init>(r13, r0, r3, r3)
            java.lang.String r15 = "reel_group_mention"
            r16 = r3
            r17 = r3
            r7.EMn(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.0lg r2 = X.AnonymousClass7TF.A0L(r5, r3)
            X.0Tu r0 = X.0Tu.A05
            r5 = 36321503335556553(0x810a37000625c9, double:3.0332031921361015E-306)
            boolean r0 = X.182.A06(r0, r2, r5)
            if (r0 == 0) goto L_0x0942
            android.content.Context r5 = r4.getContext()
            r2 = 0
            if (r5 == 0) goto L_0x093b
            r2 = 2131966143(0x7f1338bf, float:1.9569116E38)
            com.instagram.reels.groupmention.fragment.GroupMentionQuickReplySheetContent r0 = r4.A03
            if (r0 == 0) goto L_0x0955
            java.lang.String r0 = r0.A02
            java.lang.String r2 = X.DbW.A0h(r5, r0, r2)
        L_0x093b:
            android.content.Context r0 = r4.getContext()
            X.C59689JTv.A03(r0, r2, r8, r3)
        L_0x0942:
            X.DbX.A1J(r4)
        L_0x0945:
            r0 = 72425023(0x4511e3f, float:2.458172E-36)
            goto L_0x0e7a
        L_0x094a:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            r0 = -620283981(0xffffffffdb0737b3, float:-3.8060364E16)
            X.AnonymousClass0fD.A0C(r0, r1)
            throw r2
        L_0x0955:
            java.lang.String r0 = "content"
            goto L_0x0a2a
        L_0x0959:
            r0 = -1693879704(0xffffffff9b097268, float:-1.1369341E-22)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r2.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r4 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r4
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()
            com.instagram.common.session.UserSession r2 = r4.A06
            java.lang.String r0 = "reel_viewer_dashboard"
            X.1pE r2 = X.1pE.A01(r3, r4, r2, r0)
            X.3mM r0 = r4.A08
            if (r0 == 0) goto L_0x0989
            com.instagram.model.reels.Reel r0 = r0.A0H
            X.1Ns r0 = r0.A0W
            if (r0 == 0) goto L_0x0989
            java.lang.String r0 = r0.getId()
        L_0x097e:
            r2.A0A(r0)
            r2.A06()
            r0 = 1170365287(0x45c25b67, float:6219.4253)
            goto L_0x0e7a
        L_0x0989:
            r0 = 0
            goto L_0x097e
        L_0x098b:
            java.lang.Object r0 = r2.A01
            X.EAk r0 = (X.C47624EAk) r0
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r4 = r0.A00
            X.E0s r3 = new X.E0s
            r3.<init>()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            com.instagram.common.session.UserSession r0 = r4.A06
            X.DbU.A1D(r1, r0)
            r3.setArguments(r1)
            com.instagram.common.session.UserSession r0 = r4.A06
            X.7Pr r2 = X.DbS.A0W(r0)
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            r2.A0a = r0
            android.content.Context r1 = r4.requireContext()
            r0 = 2131962829(0x7f132bcd, float:1.9562394E38)
            X.DbZ.A0z(r1, r2, r0)
            X.7Pu r1 = r2.A00()
            android.content.Context r0 = r4.requireContext()
            r1.A03(r0, r3)
            return
        L_0x09c4:
            r0 = 939724560(0x38030f10, float:3.1246862E-5)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            android.app.Activity r0 = (android.app.Activity) r0
            r0.onBackPressed()
            r0 = -682731901(0xffffffffd74e5683, float:-2.2687096E14)
            goto L_0x0e7a
        L_0x09d7:
            r0 = 1772446421(0x69a562d5, float:2.4992435E25)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r2.A01
            X.7Pu r2 = (X.C331157Pu) r2
            r0 = 0
            r2.A0L(r0)
            r0 = -1843020850(0xffffffff9225bbce, float:-5.2296307E-28)
            goto L_0x0e7a
        L_0x09eb:
            r0 = -1853451676(0xffffffff91869264, float:-2.1231692E-28)
            int r1 = X.AnonymousClass0fD.A05(r0)
            android.os.Bundle r6 = X.AnonymousClass7TE.A0a()
            X.28D r3 = X.28D.A26
            java.lang.String r0 = "camera_entry_point"
            r6.putSerializable(r0, r3)
            java.lang.Object r7 = r2.A01
            X.E5a r7 = (X.C47495E5a) r7
            X.0eM r5 = r7.A02
            X.0lg r4 = X.DbT.A0X(r5)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r3 = com.instagram.modal.TransparentModalActivity.class
            androidx.fragment.app.FragmentActivity r2 = r7.getActivity()
            java.lang.String r0 = "attribution_quick_camera_fragment"
            X.6W8 r2 = X.AnonymousClass6W8.A02(r2, r6, r4, r3, r0)
            X.Dbc.A0y(r2)
            r0 = 60571(0xec9b, float:8.4878E-41)
            r2.A0D(r7, r0)
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r5)
            java.lang.String r10 = r7.getModuleName()
            java.lang.String r12 = r7.A00
            if (r12 != 0) goto L_0x0a32
            java.lang.String r0 = "sourceMediaId"
        L_0x0a2a:
            X.0qQ.A0F(r0)
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            throw r2
        L_0x0a32:
            r9 = 0
            r0 = 2752(0xac0, float:3.856E-42)
            java.lang.String r11 = X.AnonymousClass000.A00(r0)
            r13 = r9
            X.C63978LGs.A01(r7, r8, r9, r10, r11, r12, r13)
            r0 = 1963688285(0x750b815d, float:1.76844E32)
            goto L_0x0e7a
        L_0x0a42:
            r0 = 1667009887(0x635c8d5f, float:4.0684706E21)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r2.A01
            X.K7D r6 = (X.K7D) r6
            java.lang.String r4 = r6.getModuleName()
            java.lang.String r3 = X.AnonymousClass7TG.A0j()
            r2 = 1
            r0 = 0
            X.K3R r5 = X.C63127Krv.A00(r4, r3, r0, r2, r2)
            X.37D r0 = X.DbX.A0i(r6)
            X.7Pu r4 = X.C48943Emh.A00(r0)
            if (r4 == 0) goto L_0x0a87
            X.0eM r0 = r6.A0F
            X.7Pr r3 = X.DbX.A0f(r0)
            android.content.Context r2 = r6.requireContext()
            r0 = 2131100286(0x7f06027e, float:1.781295E38)
            int r0 = r2.getColor(r0)
            r3.A06 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.A03 = r0
            r2 = 7
            X.Lys r0 = new X.Lys
            r0.<init>(r5, r2)
            r3.A0T = r0
            r4.A0F(r5, r3)
        L_0x0a87:
            X.0eM r0 = r6.A0F
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            r2 = 0
            java.lang.String r0 = "share_your_avatar"
            X.LHS.A01(r3, r0, r2)
            r0 = -373728619(0xffffffffe9b95a95, float:-2.800988E25)
            goto L_0x0e7a
        L_0x0a98:
            r0 = 1543466161(0x5bff6cb1, float:1.43791253E17)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.NJv r0 = (X.C68478NJv) r0
            X.36N r4 = X.C68478NJv.A03(r0)
            X.0Ud r0 = r4.A0A
            java.lang.Object r0 = r0.getValue()
            X.Jw7 r0 = (X.C61069Jw7) r0
            java.lang.Object r12 = r0.A01
            com.instagram.user.model.User r12 = (com.instagram.user.model.User) r12
            if (r12 == 0) goto L_0x0af1
            r0 = 20
            X.EDf r6 = new X.EDf
            r6.<init>(r4, r0)
            com.instagram.common.session.UserSession r0 = r4.A02
            X.5mt r10 = X.C294695ms.A00(r0)
            com.instagram.user.model.FollowStatus r2 = r12.B6o()
            X.EWA r11 = X.EWA.UserActionUnfollow
            r0 = 1
            r10.A0D(r2, r12, r0)
            android.content.Context r5 = r10.A01
            r7 = 0
            r8 = r7
            r9 = r7
            r13 = r7
            r14 = r7
            r15 = r7
            r16 = r7
            r17 = r7
            r18 = r7
            r19 = r7
            r20 = r7
            r21 = r0
            X.C294705mt.A01(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.6oS r3 = X.C318116oQ.A00(r4)
            r2 = 11
            X.MGw r0 = new X.MGw
            r0.<init>(r4, r12, r7, r2)
            X.AnonymousClass7TE.A1Z(r0, r3)
        L_0x0af1:
            r0 = 1739707922(0x67b1d612, float:1.6796155E24)
            goto L_0x0e7a
        L_0x0af6:
            r0 = 1186838305(0x46bdb721, float:24283.564)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.NJv r0 = (X.C68478NJv) r0
            X.36N r4 = X.C68478NJv.A03(r0)
            X.0Ud r0 = r4.A0A
            java.lang.Object r0 = r0.getValue()
            X.Jw7 r0 = (X.C61069Jw7) r0
            java.lang.Object r3 = r0.A01
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            if (r3 == 0) goto L_0x0b27
            java.lang.String r5 = X.AnonymousClass3ZA.A00(r3)
            if (r5 == 0) goto L_0x0b27
            X.6oS r0 = X.C318116oQ.A00(r4)
            r6 = 0
            r7 = 7
            X.MGk r2 = new X.MGk
            r2.<init>(r3, r4, r5, r6, r7)
            X.AnonymousClass7TE.A1Z(r2, r0)
        L_0x0b27:
            r0 = -2120267847(0xffffffff819f47b9, float:-5.851029E-38)
            goto L_0x0e7a
        L_0x0b2c:
            r0 = -1800004974(0xffffffff94b61a92, float:-1.8387784E-26)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r2.A01
            X.NJv r4 = (X.C68478NJv) r4
            X.36N r0 = X.C68478NJv.A03(r4)
            X.0Ud r0 = r0.A0A
            java.lang.Object r0 = r0.getValue()
            X.Jw7 r0 = (X.C61069Jw7) r0
            java.lang.Object r2 = r0.A00
            X.GnY r2 = (X.C53401GnY) r2
            X.36N r0 = X.C68478NJv.A03(r4)
            X.0Ud r0 = r0.A0A
            java.lang.Object r0 = r0.getValue()
            X.Jw7 r0 = (X.C61069Jw7) r0
            java.lang.Object r0 = r0.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r2 == 0) goto L_0x0b7e
            java.lang.String r8 = r2.A04
            X.TpH r6 = X.C14068TpH.POST
            X.UzD r7 = X.C16677UzD.MEDIA
        L_0x0b5f:
            X.0eM r0 = r4.A0L
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()
            X.OcF r3 = X.ORV.A01(r3, r4, r5, r6, r7, r8)
            r2 = 7
            X.EUb r0 = new X.EUb
            r0.<init>(r4, r2)
            r3.A07(r0)
            r3.A06()
        L_0x0b79:
            r0 = -1596695670(0xffffffffa0d45b8a, float:-3.5974772E-19)
            goto L_0x0e7a
        L_0x0b7e:
            if (r0 == 0) goto L_0x0b79
            java.lang.String r8 = r0.getId()
            X.TpH r6 = X.C14068TpH.PROFILE
            X.UzD r7 = X.C16677UzD.USER
            goto L_0x0b5f
        L_0x0b89:
            r0 = 1551316539(0x5c77363b, float:2.78335785E17)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r2.A01
            X.NJv r5 = (X.C68478NJv) r5
            android.content.Context r2 = r5.requireContext()
            X.0eM r0 = r5.A0L
            X.Dg1 r4 = X.C46498Dg1.A00(r2, r0)
            r3 = 2131972171(0x7f13504b, float:1.9581342E38)
            r2 = 16
            X.FP2 r0 = new X.FP2
            r0.<init>((java.lang.Object) r5, (int) r2)
            r4.A02(r0, r3)
            r3 = 2131967919(0x7f133faf, float:1.9572718E38)
            r2 = 17
            X.FP2 r0 = new X.FP2
            r0.<init>((java.lang.Object) r5, (int) r2)
            r4.A04(r0, r3)
            r3 = 2131975854(0x7f135eae, float:1.9588812E38)
            r2 = 18
            X.FP2 r0 = new X.FP2
            r0.<init>((java.lang.Object) r5, (int) r2)
            r4.A04(r0, r3)
            r3 = 0
            r2 = 4
            X.IVE r0 = new X.IVE
            r0.<init>(r5, r2)
            r4.A03 = r0
            X.C49945FFy.A00(r5, r4)
            X.36N r0 = X.C68478NJv.A03(r5)
            r0.A03(r3)
            r0 = -1194374314(0xffffffffb8cf4b56, float:-9.8845616E-5)
            goto L_0x0e7a
        L_0x0bdd:
            r0 = 737291528(0x2bf22d08, float:1.7207633E-12)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.F0k r0 = (X.C49653F0k) r0
            X.NJv r2 = r0.A06
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r5 = r0.A07
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r5)
            java.lang.String r10 = X.DbV.A12(r0)
            r0 = 0
            X.0qQ.A0B(r10, r0)
            X.36N r7 = X.C68478NJv.A03(r2)
            X.0Ud r0 = r7.A0A
            java.lang.Object r0 = r0.getValue()
            X.Jw7 r0 = (X.C61069Jw7) r0
            java.lang.Object r6 = r0.A00
            X.GnY r6 = (X.C53401GnY) r6
            if (r6 == 0) goto L_0x0c5c
            java.lang.Object r4 = r6.A01
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = new com.instagram.pendingmedia.model.recipients.PendingRecipient
            r0.<init>((com.instagram.user.model.User) r4)
            java.util.List r3 = X.AnonymousClass7TE.A1I(r0)
            X.5gg r2 = new X.5gg
            r2.<init>(r3)
            java.lang.String r0 = r4.getUsername()
            r4 = 1
            com.instagram.model.direct.DirectShareTarget r8 = new com.instagram.model.direct.DirectShareTarget
            r8.<init>(r2, r0, r3, r4)
            com.instagram.common.session.UserSession r7 = r7.A02
            java.lang.String r9 = r6.A04
            r0 = 182(0xb6, float:2.55E-43)
            java.lang.String r11 = X.C273654mx.A00(r0)
            r0 = 3
            X.0qQ.A0B(r9, r0)
            X.3t2 r0 = X.DbS.A0c(r8)
            boolean r0 = r0 instanceof X.C254773t1
            if (r0 == 0) goto L_0x0c5c
            X.7VU r3 = X.AnonymousClass7VT.A00(r7)
            X.3t2 r2 = X.DbS.A0c(r8)
            r0 = 30
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r2, r0)
            X.3t1 r2 = (X.C254773t1) r2
            java.util.List r0 = X.DbW.A0m(r8)
            r12 = 4
            X.J6b r6 = new X.J6b
            r6.<init>((com.instagram.common.session.UserSession) r7, (com.instagram.model.direct.DirectShareTarget) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (int) r12)
            r3.A02(r2, r0, r6, r4)
        L_0x0c5c:
            X.DbS.A1C(r5)
            X.0nA.A0N(r5)
            r0 = 1825582380(0x6cd02d2c, float:2.0133591E27)
            goto L_0x0e7a
        L_0x0c67:
            r0 = 1553993714(0x5ca00ff2, float:3.60428227E17)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.E5P r0 = (X.E5P) r0
            X.E5P.A00(r0)
            r0 = -1443405174(0xffffffffa9f7628a, float:-1.0986097E-13)
            goto L_0x0e7a
        L_0x0c7a:
            r0 = 163657143(0x9c135b7, float:4.6513573E-33)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.E5P r0 = (X.E5P) r0
            X.E5P.A00(r0)
            r0 = -526322301(0xffffffffe0a0f583, float:-9.278656E19)
            goto L_0x0e7a
        L_0x0c8d:
            r0 = 1796634084(0x6b1675e4, float:1.818956E26)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.DbX.A1I(r0)
            r0 = 1477911245(0x581722cd, float:6.647029E14)
            goto L_0x0e7a
        L_0x0ca0:
            r0 = 955190118(0x38ef0b66, float:1.1398531E-4)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.Dba.A1Q(r0)
            r0 = 464588189(0x1bb10d9d, float:2.929099E-22)
            goto L_0x0e7a
        L_0x0cb1:
            r0 = -140365478(0xfffffffff7a2315a, float:-6.579321E33)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.LSq r0 = (X.C64183LSq) r0
            X.4DH r6 = r0.A02
            com.instagram.common.session.UserSession r5 = r0.A03
            r0 = 0
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r4 = com.instagram.modal.TransparentModalActivity.class
            android.os.Bundle r3 = X.DbS.A0A(r0)
            androidx.fragment.app.FragmentActivity r2 = r6.getActivity()
            r0 = 907(0x38b, float:1.271E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r2 = X.Dba.A0K(r2, r3, r5, r4, r0)
            android.content.Context r0 = r6.getContext()
            r2.A0C(r0)
            r0 = -881167692(0xffffffffcb7a72b4, float:-1.6413364E7)
            goto L_0x0e7a
        L_0x0ce1:
            r0 = -593089079(0xffffffffdca62dc9, float:-3.742015E17)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.LSq r0 = (X.C64183LSq) r0
            X.8Fe r0 = r0.A08
            X.0eM r0 = r0.A0F
            java.lang.Object r3 = r0.getValue()
            X.8Ff r3 = (X.C352838Ff) r3
            r2 = 1
            r3.A04 = r2
            X.G3p r0 = X.C51831G3p.A00
            X.C352838Ff.A04(r3, r0)
            X.FkD r0 = new X.FkD
            r0.<init>(r2)
            X.C352838Ff.A03(r0, r3)
            X.8c0 r3 = r3.A0A
            X.9tI r2 = X.C391569tI.ADD_CAPTION
            r0 = 0
            X.C359098c0.A01(r2, r3, r0)
            r0 = -1951095582(0xffffffff8bb4a4e2, float:-6.9581566E-32)
            goto L_0x0e7a
        L_0x0d13:
            r0 = 623179651(0x2524f783, float:1.4308593E-16)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.LSq r0 = (X.C64183LSq) r0
            X.8Fe r0 = r0.A08
            X.8W6 r0 = r0.A01
            if (r0 == 0) goto L_0x0d27
            r0.A02()
        L_0x0d27:
            r0 = 59682415(0x38eae6f, float:8.386058E-37)
            goto L_0x0e7a
        L_0x0d2c:
            r0 = -53559067(0xfffffffffccec0e5, float:-8.588204E36)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.LSq r0 = (X.C64183LSq) r0
            X.8Fe r0 = r0.A08
            X.0eM r0 = r0.A0F
            java.lang.Object r0 = r0.getValue()
            X.8Ff r0 = (X.C352838Ff) r0
            r0.A07()
            r0 = -2080268852(0xffffffff84019dcc, float:-1.5236334E-36)
            goto L_0x0e7a
        L_0x0d49:
            r0 = -559357574(0xffffffffdea8e17a, float:-6.0845709E18)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.LSq r0 = (X.C64183LSq) r0
            X.4DH r6 = r0.A02
            com.instagram.common.session.UserSession r5 = r0.A03
            r0 = 0
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r4 = com.instagram.modal.TransparentModalActivity.class
            android.os.Bundle r3 = X.DbS.A0A(r0)
            androidx.fragment.app.FragmentActivity r2 = r6.getActivity()
            r0 = 907(0x38b, float:1.271E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r2 = X.Dba.A0K(r2, r3, r5, r4, r0)
            android.content.Context r0 = r6.getContext()
            r2.A0C(r0)
            r0 = -542446828(0xffffffffdfaaeb14, float:-2.463192E19)
            goto L_0x0e7a
        L_0x0d79:
            r0 = -798606653(0xffffffffd0663ac3, float:-1.54504428E10)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.LSq r0 = (X.C64183LSq) r0
            X.8Fe r0 = r0.A08
            X.8W6 r0 = r0.A01
            if (r0 == 0) goto L_0x0d8d
            r0.A02()
        L_0x0d8d:
            r0 = 384075730(0x16e487d2, float:3.6921101E-25)
            goto L_0x0e7a
        L_0x0d92:
            r0 = -1622655322(0xffffffff9f483ea6, float:-4.240347E-20)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.LSq r0 = (X.C64183LSq) r0
            X.8Fe r0 = r0.A08
            X.0eM r0 = r0.A0F
            java.lang.Object r0 = r0.getValue()
            X.8Ff r0 = (X.C352838Ff) r0
            r0.A07()
            r0 = -422928092(0xffffffffe6caa124, float:-4.7844527E23)
            goto L_0x0e7a
        L_0x0daf:
            r0 = 48507391(0x2e429ff, float:3.3525694E-37)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r2.A01
            X.E5Y r2 = (X.E5Y) r2
            X.0eM r0 = r2.A0J
            java.lang.Object r5 = r0.getValue()
            X.JiV r5 = (X.C60274JiV) r5
            X.0eM r0 = r2.A08
            int r8 = X.DbX.A07(r0)
            X.8c0 r4 = r5.A01
            X.0Ud r3 = r5.A09
            java.lang.Object r0 = r3.getValue()
            X.JwG r0 = (X.C61078JwG) r0
            java.lang.Object r0 = r0.A00
            X.F0l r0 = (X.C49654F0l) r0
            r7 = 0
            if (r0 == 0) goto L_0x0e04
            X.1Xj r0 = r0.A01
            java.lang.String r2 = r0.A30()
        L_0x0ddf:
            X.9tH r0 = X.C391559tH.SAVE
            X.C359098c0.A00(r0, r4, r2)
            java.lang.Object r0 = r3.getValue()
            X.JwG r0 = (X.C61078JwG) r0
            java.lang.Object r0 = r0.A00
            X.F0l r0 = (X.C49654F0l) r0
            if (r0 == 0) goto L_0x0e00
            X.1Xj r6 = r0.A01
            X.6oS r0 = X.C318116oQ.A00(r5)
            r9 = 19
            X.JTZ r4 = new X.JTZ
            r4.<init>(r5, r6, r7, r8, r9)
            X.AnonymousClass7TE.A1Z(r4, r0)
        L_0x0e00:
            r0 = -1882502017(0xffffffff8fcb4c7f, float:-2.004681E-29)
            goto L_0x0e7a
        L_0x0e04:
            r2 = r7
            goto L_0x0ddf
        L_0x0e06:
            r0 = -566117658(0xffffffffde41bae6, float:-3.48993072E18)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r2.A01
            X.E5Y r4 = (X.E5Y) r4
            android.content.Context r0 = r4.requireContext()
            X.6ST r3 = X.DbV.A0h(r0)
            android.content.Context r2 = r4.requireContext()
            r0 = 2131971096(0x7f134c18, float:1.9579162E38)
            X.DbU.A18(r2, r3, r0)
            X.AnonymousClass0fN.A00(r3)
            r4.A00 = r3
            X.0eM r0 = r4.A0J
            X.2YL r3 = X.DbS.A0H(r0)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r0 = 15
            X.DbX.A1X(r3, r2, r0)
            r0 = -489087791(0xffffffffe2d91cd1, float:-2.00251E21)
            goto L_0x0e7a
        L_0x0e3b:
            r0 = -823730801(0xffffffffcee6dd8f, float:-1.93663987E9)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r2.A01
            X.E5Y r0 = (X.E5Y) r0
            X.0eM r0 = r0.A0J
            java.lang.Object r4 = r0.getValue()
            X.JiV r4 = (X.C60274JiV) r4
            X.05G r0 = r4.A08
            java.lang.Object r0 = r0.getValue()
            X.JwG r0 = (X.C61078JwG) r0
            java.lang.Object r2 = r0.A00
            X.F0l r2 = (X.C49654F0l) r2
            if (r2 == 0) goto L_0x0e6f
            java.util.List r0 = r2.A05
            java.lang.Object r3 = X.00k.A0J(r0)
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            if (r3 == 0) goto L_0x0e6f
            X.3QO r2 = r2.A02
            X.3QO r0 = X.AnonymousClass3QO.DEFAULT
            if (r2 != r0) goto L_0x0e6f
            r3.getId()
        L_0x0e6f:
            X.Fk6 r0 = new X.Fk6
            r0.<init>()
            X.C60274JiV.A00(r0, r4)
            r0 = 987995456(0x3ae39d40, float:0.001736559)
        L_0x0e7a:
            X.AnonymousClass0fD.A0C(r0, r1)
            return
        L_0x0e7e:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            r0 = -1124921597(0xffffffffbcf30f03, float:-0.029670244)
        L_0x0e85:
            X.AnonymousClass0fD.A0C(r0, r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FP2.onClick(android.view.View):void");
    }

    public FP2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
