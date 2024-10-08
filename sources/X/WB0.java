package X;

import android.view.View;

public final class WB0 implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public WB0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new WB0(obj, i), view);
    }

    /* JADX WARNING: type inference failed for: r0v40, types: [X.07Z, X.UZF] */
    /* JADX WARNING: type inference failed for: r0v350, types: [java.lang.Object, X.VTv] */
    /* JADX WARNING: type inference failed for: r1v311, types: [java.lang.Object, X.VTv] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x066f, code lost:
        X.0qQ.A0F(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x08d6, code lost:
        X.0qQ.A0F(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x08dd, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0be1, code lost:
        if (r2 != false) goto L_0x0be3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0f42, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0f45, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        X.AnonymousClass0fD.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r30) {
        /*
            r29 = this;
            r1 = r29
            r3 = r30
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0923;
                case 1: goto L_0x0912;
                case 2: goto L_0x08fe;
                case 3: goto L_0x08ea;
                case 4: goto L_0x08c5;
                case 5: goto L_0x08b2;
                case 6: goto L_0x0886;
                case 7: goto L_0x0871;
                case 8: goto L_0x085a;
                case 9: goto L_0x0849;
                case 10: goto L_0x0838;
                case 11: goto L_0x081e;
                case 12: goto L_0x0807;
                case 13: goto L_0x07f0;
                case 14: goto L_0x0f16;
                case 15: goto L_0x0ec7;
                case 16: goto L_0x0e8d;
                case 17: goto L_0x07d2;
                case 18: goto L_0x0b19;
                case 19: goto L_0x07b7;
                case 20: goto L_0x00a0;
                case 21: goto L_0x05a5;
                case 22: goto L_0x0592;
                case 23: goto L_0x001e;
                case 24: goto L_0x065a;
                case 25: goto L_0x051d;
                case 26: goto L_0x0509;
                case 27: goto L_0x0934;
                case 28: goto L_0x0b0a;
                case 29: goto L_0x04f6;
                case 30: goto L_0x04ab;
                case 31: goto L_0x0496;
                case 32: goto L_0x0481;
                case 33: goto L_0x046c;
                case 34: goto L_0x0457;
                case 35: goto L_0x0442;
                case 36: goto L_0x042b;
                case 37: goto L_0x041a;
                case 38: goto L_0x03f7;
                case 39: goto L_0x03e2;
                case 40: goto L_0x03cd;
                case 41: goto L_0x03ba;
                case 42: goto L_0x03a7;
                case 43: goto L_0x0394;
                case 44: goto L_0x0a69;
                case 45: goto L_0x037e;
                case 46: goto L_0x0368;
                case 47: goto L_0x034a;
                case 48: goto L_0x09fa;
                case 49: goto L_0x032f;
                case 50: goto L_0x0314;
                case 51: goto L_0x09bf;
                case 52: goto L_0x02f9;
                case 53: goto L_0x02da;
                case 54: goto L_0x028c;
                case 55: goto L_0x0263;
                case 56: goto L_0x0238;
                case 57: goto L_0x020f;
                case 58: goto L_0x01cc;
                case 59: goto L_0x0196;
                case 60: goto L_0x017b;
                case 61: goto L_0x0160;
                case 62: goto L_0x014d;
                case 63: goto L_0x0132;
                case 64: goto L_0x0070;
                case 65: goto L_0x0103;
                case 66: goto L_0x00dd;
                case 67: goto L_0x00bf;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 350811231(0x14e8f45f, float:2.3522401E-26)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r0 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r0
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment.A0A(r0)
            r0 = 285202217(0x10ffd729, float:1.0091127E-28)
        L_0x001a:
            X.AnonymousClass0fD.A0C(r0, r2)
        L_0x001d:
            return
        L_0x001e:
            r0 = 131962188(0x7dd954c, float:3.3340133E-34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.UaO r4 = (X.C15316UaO) r4
            android.content.Context r3 = r4.requireContext()
            java.lang.String r2 = r4.A0A
            java.lang.String r8 = "surveyId"
            if (r2 == 0) goto L_0x066f
            java.lang.String r1 = r4.A09
            java.lang.String r9 = "sessionBlob"
            if (r1 == 0) goto L_0x08d6
            X.C15316UaO.A02(r3, r4, r2, r1)
            java.lang.String r10 = r4.A07
            if (r10 == 0) goto L_0x07b3
            java.lang.String r11 = r4.A0A
            if (r11 == 0) goto L_0x066f
            java.lang.String r12 = r4.A09
            if (r12 == 0) goto L_0x08d6
            X.0eM r1 = r4.A0K
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r1)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.lang.String r3 = "action"
            java.lang.String r2 = "dismiss_survey"
            X.VTv r1 = new X.VTv
            r1.<init>()
            r1.A00 = r3
            r1.A01 = r2
            r13.add(r1)
            java.lang.Integer r9 = X.AnonymousClass05K.A0j
            X.VI3.A00(r8, r9, r10, r11, r12, r13)
            r4.onBackPressed()
            r1 = -68784212(0xfffffffffbe66fac, float:-2.3929865E36)
            goto L_0x0f42
        L_0x0070:
            r0 = -2135624192(0xffffffff80b4f600, float:-1.6618637E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            instagram.features.clips.viewer.recommend.ClipsViewerRecommendClipsFragment r5 = (instagram.features.clips.viewer.recommend.ClipsViewerRecommendClipsFragment) r5
            X.37E r2 = X.AnonymousClass37D.A00
            android.content.Context r1 = r5.getContext()
            X.DbX.A14(r1, r2)
            android.content.Context r2 = r5.getContext()
            r1 = 2131971413(0x7f134d55, float:1.9579805E38)
            X.C59689JTv.A07(r2, r1)
            X.0eM r1 = r5.A03
            X.0lg r3 = X.DbT.A0X(r1)
            java.lang.String r6 = r5.A02
            java.lang.String r4 = r5.A01
            X.U9s r1 = r5.A00
            if (r1 != 0) goto L_0x094c
            java.lang.String r9 = "recommendClipsAdapter"
            goto L_0x08d6
        L_0x00a0:
            r0 = 1335480741(0x4f99d1a5, float:5.1613066E9)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UYb r3 = (X.C15261UYb) r3
            java.lang.String r7 = r3.A02
            if (r7 == 0) goto L_0x07b3
            java.lang.String r8 = r3.A07
            if (r8 != 0) goto L_0x00b7
            java.lang.String r9 = "surveyId"
            goto L_0x08d6
        L_0x00b7:
            java.lang.String r9 = r3.A06
            if (r9 != 0) goto L_0x0986
            java.lang.String r9 = "sessionBlob"
            goto L_0x08d6
        L_0x00bf:
            r0 = 1421143584(0x54b4ee20, float:6.2167135E12)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r0 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r0
            X.6Yo r1 = X.C13991Tnr.A0M(r0)
            X.Kai r0 = X.C250563lf.A0E()
            r1.A0E(r0)
            r1.A04()
            r0 = -2070472452(0xffffffff849718fc, float:-3.5522874E-36)
            goto L_0x001a
        L_0x00dd:
            r0 = -1041778984(0xffffffffc1e7b6d8, float:-28.96428)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r4 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r4
            X.3uh r1 = r4.A0F()
            if (r1 == 0) goto L_0x00fb
            com.instagram.common.session.UserSession r0 = r4.A06
            X.W0E r3 = X.C14639Tzl.A00(r0)
            java.lang.String r1 = r1.A0j
            java.lang.String r0 = "close"
            r3.A04(r1, r0)
        L_0x00fb:
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment.A0B(r4)
            r0 = 2126420954(0x7ebe9bda, float:1.2668127E38)
            goto L_0x001a
        L_0x0103:
            r0 = 1728703326(0x6709eb5e, float:6.51306E23)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.String r0 = "com.instagram.privacy.activity_center.tag_media_screen"
            X.DiU r5 = X.C46649DiU.A03(r0)
            java.lang.Object r0 = r1.A01
            X.ToW r0 = (X.C14030ToW) r0
            androidx.fragment.app.Fragment r4 = r0.A03
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()
            com.instagram.common.session.UserSession r0 = r0.A04
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r1.<init>((X.0lg) r0)
            r0 = 2131952192(0x7f130240, float:1.954082E38)
            java.lang.String r0 = r4.getString(r0)
            r1.A0U = r0
            r5.A0D(r3, r1)
            r0 = 1175547865(0x46116fd9, float:9307.962)
            goto L_0x001a
        L_0x0132:
            r0 = -1732481(0xffffffffffe5907f, float:NaN)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.UYn r0 = (X.UYn) r0
            X.0eM r0 = r0.A07
            java.lang.Object r0 = r0.getValue()
            X.JiH r0 = (X.C60260JiH) r0
            r0.A00()
            r0 = 804079435(0x2fed474b, float:4.3160706E-10)
            goto L_0x001a
        L_0x014d:
            r0 = -1065978556(0xffffffffc0767544, float:-3.8509073)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.UZ4 r0 = (X.UZ4) r0
            X.UZ4.A00(r0)
            r0 = -133261287(0xfffffffff80e9819, float:-1.156861E34)
            goto L_0x001a
        L_0x0160:
            r0 = 2109432928(0x7dbb6460, float:3.1135852E37)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.UYl r0 = (X.C15271UYl) r0
            X.0eM r0 = r0.A05
            java.lang.Object r0 = r0.getValue()
            X.JiH r0 = (X.C60260JiH) r0
            r0.A00()
            r0 = 267958089(0xff8b749, float:2.4525287E-29)
            goto L_0x001a
        L_0x017b:
            r0 = 299578595(0x11db34e3, float:3.4584702E-28)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.UYj r0 = (X.C15269UYj) r0
            X.0eM r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            X.JiH r0 = (X.C60260JiH) r0
            r0.A00()
            r0 = 914221878(0x367deb36, float:3.7836849E-6)
            goto L_0x001a
        L_0x0196:
            r0 = 525059176(0x1f4bc468, float:4.3149386E-20)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.W1B r3 = (X.W1B) r3
            r0 = 1704(0x6a8, float:2.388E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.W1B.A02(r3, r0)
            X.W1B.A00(r3)
            X.E6c r0 = r3.A04
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            com.instagram.common.session.UserSession r0 = r3.A00
            X.6Yo r3 = new X.6Yo
            r3.<init>(r1, r0)
            X.XQw r0 = X.C21251XQw.MAIN_SETTINGS_SCREEN
            r1 = 0
            X.JaK r0 = X.Eq6.A00(r0, r1)
            r3.A0B(r1, r0)
            r3.A04()
            r0 = 1925030284(0x72bda18c, float:7.5120595E30)
            goto L_0x001a
        L_0x01cc:
            r0 = -1500818136(0xffffffffa68b5528, float:-9.668144E-16)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.W1B r6 = (X.W1B) r6
            java.lang.String r0 = "comment_audience_controls"
            X.W1B.A02(r6, r0)
            X.W1B.A00(r6)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0 = 74
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.DiU r5 = X.C46649DiU.A04(r0, r1)
            X.E6c r4 = r6.A04
            android.content.Context r3 = r4.requireContext()
            com.instagram.common.session.UserSession r0 = r6.A00
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r1.<init>((X.0lg) r0)
            r0 = 2131976116(0x7f135fb4, float:1.9589343E38)
            java.lang.String r0 = r4.getString(r0)
            r1.A0U = r0
            r0 = 1
            r1.A0i = r0
            r5.A0D(r3, r1)
            r0 = -543284715(0xffffffffdf9e2215, float:-2.2789386E19)
            goto L_0x001a
        L_0x020f:
            r0 = 865266409(0x3392eae9, float:6.841385E-8)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.W1B r4 = (X.W1B) r4
            r0 = 1903(0x76f, float:2.667E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.W1B.A02(r4, r0)
            X.W1B.A00(r4)
            X.E6c r0 = r4.A04
            android.content.Context r3 = r0.requireContext()
            com.instagram.common.session.UserSession r1 = r4.A00
            X.1Xj r0 = r4.A01
            X.C56304HwH.A00(r3, r1, r0)
            r0 = 1158756788(0x451139b4, float:2323.6064)
            goto L_0x001a
        L_0x0238:
            r0 = 332346641(0x13cf3511, float:5.2306474E-27)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.W1B r5 = (X.W1B) r5
            r0 = 4133(0x1025, float:5.792E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.W1B.A02(r5, r0)
            X.E6c r0 = r5.A04
            android.content.Context r4 = r0.requireContext()
            com.instagram.common.session.UserSession r3 = r5.A00
            X.1Xj r1 = r5.A01
            X.3W1 r0 = r5.A03
            X.C56304HwH.A01(r4, r3, r1, r0)
            X.W1B.A00(r5)
            r0 = -2056792308(0xffffffff8567d70c, float:-1.0901066E-35)
            goto L_0x001a
        L_0x0263:
            r0 = -2119925819(0xffffffff81a47fc5, float:-6.0427426E-38)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.W1B r4 = (X.W1B) r4
            r0 = 1903(0x76f, float:2.667E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.W1B.A02(r4, r0)
            X.E6c r0 = r4.A04
            android.content.Context r3 = r0.requireContext()
            com.instagram.common.session.UserSession r1 = r4.A00
            X.1Xj r0 = r4.A01
            X.C56304HwH.A00(r3, r1, r0)
            X.W1B.A00(r4)
            r0 = -1518154908(0xffffffffa582cb64, float:-2.2689228E-16)
            goto L_0x001a
        L_0x028c:
            r0 = 1363699246(0x5148662e, float:5.3794234E10)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.W1B r3 = (X.W1B) r3
            r0 = 691(0x2b3, float:9.68E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.W1B.A02(r3, r0)
            X.W1B.A00(r3)
            X.E6c r0 = r3.A04
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            com.instagram.common.session.UserSession r0 = r3.A00
            X.6Yo r6 = new X.6Yo
            r6.<init>(r1, r0)
            X.1ZG r0 = X.AnonymousClass1ZG.A01
            if (r0 != 0) goto L_0x02b8
            java.lang.String r9 = "plugin"
            goto L_0x08d6
        L_0x02b8:
            X.1ZH r5 = r0.A00
            X.1Xj r0 = r3.A01
            java.lang.String r4 = r0.getId()
            X.4DU r0 = r3.A02
            boolean r3 = r0.isOrganicEligible()
            boolean r1 = r0.isSponsoredEligible()
            r0 = 0
            com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment r0 = r5.A00(r4, r3, r1, r0)
            r6.A0D(r0)
            r6.A04()
            r0 = 886547480(0x34d7a418, float:4.0166265E-7)
            goto L_0x001a
        L_0x02da:
            r0 = 181486497(0xad143a1, float:2.0151407E-32)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.W1B r1 = (X.W1B) r1
            r0 = 4846(0x12ee, float:6.79E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.W1B.A02(r1, r0)
            X.W1B.A00(r1)
            X.W1B.A01(r1)
            r0 = 1841959453(0x6dca121d, float:7.8172337E27)
            goto L_0x001a
        L_0x02f9:
            r0 = -281817255(0xffffffffef33cf59, float:-5.5648485E28)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.W1B r1 = (X.W1B) r1
            java.lang.String r0 = "manual_filter"
            X.W1B.A02(r1, r0)
            X.W1B.A00(r1)
            X.W1B.A01(r1)
            r0 = 1926022161(0x72ccc411, float:8.1116124E30)
            goto L_0x001a
        L_0x0314:
            r0 = 1840179339(0x6daee88b, float:6.76644E27)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.UYm r0 = (X.UYm) r0
            X.0eM r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            X.JiH r0 = (X.C60260JiH) r0
            r0.A00()
            r0 = 383460902(0x16db2626, float:3.5405433E-25)
            goto L_0x001a
        L_0x032f:
            r0 = 1059862459(0x3f2c37bb, float:0.6727254)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.UYk r0 = (X.C15270UYk) r0
            X.0eM r0 = r0.A05
            java.lang.Object r0 = r0.getValue()
            X.JiH r0 = (X.C60260JiH) r0
            r0.A00()
            r0 = -972603394(0xffffffffc6073ffe, float:-8655.998)
            goto L_0x001a
        L_0x034a:
            r0 = 1263099071(0x4b495cbf, float:1.3196479E7)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment r1 = (com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment) r1
            X.Udf r0 = r1.A03
            X.VsW r0 = r0.A06
            X.Wv0 r0 = r0.A00
            r0.clear()
            X.Udf r0 = r1.A03
            r0.A00()
            r0 = -359056452(0xffffffffea993bbc, float:-9.262387E25)
            goto L_0x001a
        L_0x0368:
            r0 = -113749120(0xfffffffff9385380, float:-5.9817263E34)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment r0 = (com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment) r0
            X.Vzr r1 = r0.A05
            r0 = 0
            r1.A01(r0)
            r0 = -84796994(0xfffffffffaf219be, float:-6.2852898E35)
            goto L_0x001a
        L_0x037e:
            r0 = 1147627256(0x446766f8, float:925.6089)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment r0 = (com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment) r0
            X.WYK r1 = r0.A06
            r0 = 0
            r1.A00(r0)
            r0 = 282940465(0x10dd5431, float:8.729885E-29)
            goto L_0x001a
        L_0x0394:
            r0 = 1686429558(0x6484df76, float:1.9608578E22)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.U4j r0 = (X.C14721U4j) r0
            X.C14721U4j.A01(r0)
            r0 = 244913180(0xe99141c, float:3.7736777E-30)
            goto L_0x001a
        L_0x03a7:
            r0 = 1986915148(0x766deb4c, float:1.2063933E33)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.U4j r0 = (X.C14721U4j) r0
            X.C14721U4j.A00(r0)
            r0 = 278245941(0x1095b235, float:5.904471E-29)
            goto L_0x001a
        L_0x03ba:
            r0 = 1941416000(0x73b7a840, float:2.910165E31)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.U4j r0 = (X.C14721U4j) r0
            X.C14721U4j.A02(r0)
            r0 = 130347365(0x7c4f165, float:2.9632681E-34)
            goto L_0x001a
        L_0x03cd:
            r0 = 545614523(0x20856abb, float:2.2601705E-19)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.X84 r0 = (X.X84) r0
            if (r0 == 0) goto L_0x03dd
            r0.CtD()
        L_0x03dd:
            r0 = -1309569727(0xffffffffb1f18d41, float:-7.030082E-9)
            goto L_0x001a
        L_0x03e2:
            r0 = -1315960013(0xffffffffb1900b33, float:-4.192225E-9)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.X84 r0 = (X.X84) r0
            if (r0 == 0) goto L_0x03f2
            r0.D4i()
        L_0x03f2:
            r0 = -784193830(0xffffffffd14226da, float:-5.2117217E10)
            goto L_0x001a
        L_0x03f7:
            r0 = 1707888282(0x65cc4e9a, float:1.2060159E23)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.U4R r0 = (X.U4R) r0
            X.X1r r0 = r0.A00
            if (r0 == 0) goto L_0x0415
            X.WgE r0 = (X.C19833WgE) r0
            X.Vhg r0 = r0.A00
            X.L2h r0 = r0.A00
            if (r0 == 0) goto L_0x0415
            X.LdG r0 = r0.A00
            X.MXE r0 = r0.A00
            r0.remove()
        L_0x0415:
            r0 = -1940348428(0xffffffff8c58a1f4, float:-1.6688771E-31)
            goto L_0x001a
        L_0x041a:
            r0 = 24770985(0x179f9a9, float:4.59132E-38)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.DbS.A1U(r0)
            r0 = 1672348148(0x63ae01f4, float:6.4197484E21)
            goto L_0x001a
        L_0x042b:
            r0 = 405362726(0x18295826, float:2.1887242E-24)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.WSG r0 = (X.WSG) r0
            X.VPm r0 = r0.A00
            X.UbS r0 = r0.A00
            r0.A07()
            r0 = 1340105697(0x4fe063e1, float:7.5292841E9)
            goto L_0x001a
        L_0x0442:
            r0 = 2032615703(0x79274117, float:5.427711E34)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.VPo r0 = (X.C17287VPo) r0
            X.UbS r0 = r0.A00
            r0.A06()
            r0 = 122041386(0x746342a, float:1.4911194E-34)
            goto L_0x001a
        L_0x0457:
            r0 = -127533076(0xfffffffff865ffec, float:-1.8659792E34)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.VPo r0 = (X.C17287VPo) r0
            X.UbS r0 = r0.A00
            r0.A06()
            r0 = -2123294348(0xffffffff81711974, float:-4.428297E-38)
            goto L_0x001a
        L_0x046c:
            r0 = -492463683(0xffffffffe2a599bd, float:-1.5273954E21)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.VPn r0 = (X.C17286VPn) r0
            X.UbS r0 = r0.A00
            r0.A07()
            r0 = 1676938133(0x63f40b95, float:9.00368E21)
            goto L_0x001a
        L_0x0481:
            r0 = -325000317(0xffffffffeca0e383, float:-1.5560202E27)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.VPn r0 = (X.C17286VPn) r0
            X.UbS r0 = r0.A00
            r0.A06()
            r0 = 1439438988(0x55cc188c, float:2.8050725E13)
            goto L_0x001a
        L_0x0496:
            r0 = 432369137(0x19c56df1, float:2.0413728E-23)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.VPn r0 = (X.C17286VPn) r0
            X.UbS r0 = r0.A00
            r0.A06()
            r0 = 146673026(0x8be0d82, float:1.1438385E-33)
            goto L_0x001a
        L_0x04ab:
            r0 = -963473469(0xffffffffc6928fc3, float:-18759.88)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.X1o r1 = (X.C20862X1o) r1
            X.WfT r1 = (X.C19786WfT) r1
            int r0 = r1.A00
            java.lang.Object r5 = r1.A01
            X.UbS r5 = (X.C15374UbS) r5
            switch(r0) {
                case 0: goto L_0x04da;
                case 1: goto L_0x04c1;
                case 2: goto L_0x04de;
                default: goto L_0x04c1;
            }
        L_0x04c1:
            X.0eM r0 = r5.A0J
            java.lang.Object r4 = r0.getValue()
            androidx.fragment.app.FragmentActivity r3 = r5.requireActivity()
            r1 = 13
            X.J6T r0 = new X.J6T
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r5)
            X.C17113VIj.A00(r3, r0)
        L_0x04d5:
            r0 = -1488257989(0xffffffffa74afc3b, float:-2.8169866E-15)
            goto L_0x001a
        L_0x04da:
            r5.A07()
            goto L_0x04d5
        L_0x04de:
            X.0eM r0 = r5.A0J
            java.lang.Object r1 = r0.getValue()
            X.V2e r1 = (X.C16701V2e) r1
            boolean r0 = r1 instanceof X.C16346UtL
            if (r0 == 0) goto L_0x04d5
            X.1Xj r0 = X.C15374UbS.A00(r5)
            if (r0 == 0) goto L_0x04d5
            X.UtL r1 = (X.C16346UtL) r1
            r1.A00(r0)
            goto L_0x04d5
        L_0x04f6:
            r0 = 101631942(0x60ec7c6, float:2.6854002E-35)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.WJp r0 = (X.WJp) r0
            r0.A01()
            r0 = 1652126102(0x62797196, float:1.150356E21)
            goto L_0x001a
        L_0x0509:
            r0 = -1017847226(0xffffffffc354e246, float:-212.88388)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            com.instagram.survey.structuredsurvey.views.SurveyWriteInListItemView r1 = (com.instagram.survey.structuredsurvey.views.SurveyWriteInListItemView) r1
            r0 = 1
            r1.setChecked(r0)
            r0 = 1905524168(0x7193fdc8, float:1.4656352E30)
            goto L_0x001a
        L_0x051d:
            java.lang.Object r6 = r1.A01
            X.U46 r6 = (X.U46) r6
            java.lang.Object r0 = X.DbT.A0o(r3)
            X.UwT r0 = (X.C16524UwT) r0
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0eec
            r0 = 2
            if (r1 == r0) goto L_0x053a
            r0 = 8
            if (r1 == r0) goto L_0x0f05
            r0 = 9
            if (r1 == r0) goto L_0x0553
            return
        L_0x053a:
            android.view.View r0 = r3.getRootView()
            X.0nA.A0N(r0)
            android.app.Activity r1 = r6.A00
            if (r1 == 0) goto L_0x0553
            android.view.Window r0 = r1.getWindow()
            if (r0 == 0) goto L_0x0553
            android.view.Window r1 = r1.getWindow()
            r0 = 3
            r1.setSoftInputMode(r0)
        L_0x0553:
            r1 = r3
            android.widget.Checkable r1 = (android.widget.Checkable) r1
            r1.toggle()
            X.U5Y r3 = (X.U5Y) r3
            X.Vrk r0 = r3.A00
            if (r0 == 0) goto L_0x001d
            java.lang.String r5 = r0.A01
            java.util.HashMap r4 = r6.A03
            java.lang.Number r3 = X.JTO.A0z(r5, r4)
            boolean r0 = r1.isChecked()
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0588
            if (r3 != 0) goto L_0x0581
            r0 = 1
        L_0x0572:
            X.C66581MXm.A1S(r5, r4, r0)
            X.UaO r1 = r6.A02
            r1.getClass()
            if (r0 <= 0) goto L_0x057d
            r2 = 1
        L_0x057d:
            r1.A05(r5, r2)
            return
        L_0x0581:
            int r0 = r3.intValue()
            int r0 = r0 + 1
            goto L_0x0572
        L_0x0588:
            if (r3 != 0) goto L_0x058c
            r0 = 0
            goto L_0x0572
        L_0x058c:
            int r0 = r3.intValue()
            int r0 = r0 - r1
            goto L_0x0572
        L_0x0592:
            r0 = -28597407(0xfffffffffe4ba361, float:-6.76704E37)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            com.instagram.survey.fragment.RapidFeedbackOutroFragment r0 = (com.instagram.survey.fragment.RapidFeedbackOutroFragment) r0
            X.DbT.A1K(r0)
            r0 = 1961225308(0x74e5ec5c, float:1.4573119E32)
            goto L_0x001a
        L_0x05a5:
            r0 = 1479128425(0x5829b569, float:7.4638646E14)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.UYb r5 = (X.C15261UYb) r5
            java.lang.String r12 = r5.A02
            java.lang.String r1 = "integrationPointId"
            r15 = 0
            if (r12 != 0) goto L_0x05bc
            X.0qQ.A0F(r1)
            goto L_0x08d9
        L_0x05bc:
            java.lang.String r13 = r5.A07
            java.lang.String r8 = "surveyId"
            if (r13 == 0) goto L_0x066f
            java.lang.String r14 = r5.A06
            java.lang.String r9 = "sessionBlob"
            if (r14 == 0) goto L_0x08d6
            X.0eM r4 = r5.A08
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r4)
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            X.VI3.A00(r10, r11, r12, r13, r14, r15)
            r5.A07()
            X.VVv r0 = r5.A00     // Catch:{ IOException -> 0x0f09 }
            if (r0 != 0) goto L_0x05e4
            java.lang.String r0 = "model"
            X.0qQ.A0F(r0)     // Catch:{ IOException -> 0x0f09 }
        L_0x05df:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ IOException -> 0x0f09 }
            throw r0     // Catch:{ IOException -> 0x0f09 }
        L_0x05e4:
            java.lang.String r7 = X.C18207VnX.A00(r0)     // Catch:{ IOException -> 0x0f09 }
            X.0qQ.A0A(r7)     // Catch:{ IOException -> 0x0f09 }
            java.lang.String r6 = r5.A05     // Catch:{ IOException -> 0x0f09 }
            if (r6 != 0) goto L_0x05f5
            java.lang.String r0 = "outroToast"
            X.0qQ.A0F(r0)     // Catch:{ IOException -> 0x0f09 }
            goto L_0x05df
        L_0x05f5:
            java.lang.String r3 = r5.A02     // Catch:{ IOException -> 0x0f09 }
            if (r3 != 0) goto L_0x05fd
            X.0qQ.A0F(r1)     // Catch:{ IOException -> 0x0f09 }
            goto L_0x05df
        L_0x05fd:
            java.lang.String r1 = r5.A07     // Catch:{ IOException -> 0x0f09 }
            if (r1 != 0) goto L_0x0605
            X.0qQ.A0F(r8)     // Catch:{ IOException -> 0x0f09 }
            goto L_0x05df
        L_0x0605:
            java.lang.String r10 = r5.A06     // Catch:{ IOException -> 0x0f09 }
            if (r10 != 0) goto L_0x060d
            X.0qQ.A0F(r9)     // Catch:{ IOException -> 0x0f09 }
            goto L_0x05df
        L_0x060d:
            X.0lg r9 = X.DbT.A0X(r4)     // Catch:{ IOException -> 0x0f09 }
            r0 = 0
            X.DbW.A1N(r7, r0, r9)     // Catch:{ IOException -> 0x0f09 }
            java.lang.String r0 = "ARG_SERIALIZED_MODEL_DATA"
            X.0eP r8 = new X.0eP     // Catch:{ IOException -> 0x0f09 }
            r8.<init>(r0, r7)     // Catch:{ IOException -> 0x0f09 }
            java.lang.String r0 = "ARG_OUTRO_TOAST_TEXT"
            X.0eP r7 = new X.0eP     // Catch:{ IOException -> 0x0f09 }
            r7.<init>(r0, r6)     // Catch:{ IOException -> 0x0f09 }
            java.lang.String r0 = "ARG_INTEGRATION_POINT_ID"
            X.0eP r6 = new X.0eP     // Catch:{ IOException -> 0x0f09 }
            r6.<init>(r0, r3)     // Catch:{ IOException -> 0x0f09 }
            java.lang.String r0 = "ARG_SURVEY_ID"
            X.0eP r3 = new X.0eP     // Catch:{ IOException -> 0x0f09 }
            r3.<init>(r0, r1)     // Catch:{ IOException -> 0x0f09 }
            java.lang.String r1 = "ARG_SESSION_BLOB"
            X.0eP r0 = new X.0eP     // Catch:{ IOException -> 0x0f09 }
            r0.<init>(r1, r10)     // Catch:{ IOException -> 0x0f09 }
            X.0eP[] r0 = new X.0eP[]{r8, r7, r6, r3, r0}     // Catch:{ IOException -> 0x0f09 }
            android.os.Bundle r0 = X.Q21.A00(r0)     // Catch:{ IOException -> 0x0f09 }
            X.AnonymousClass0Dg.A00(r0, r9)     // Catch:{ IOException -> 0x0f09 }
            X.UaO r1 = new X.UaO     // Catch:{ IOException -> 0x0f09 }
            r1.<init>()     // Catch:{ IOException -> 0x0f09 }
            r1.setArguments(r0)     // Catch:{ IOException -> 0x0f09 }
            X.6Yo r0 = X.DbZ.A0P(r5, r4)     // Catch:{ IOException -> 0x0f09 }
            r0.A0B(r15, r1)     // Catch:{ IOException -> 0x0f09 }
            r0.A04()     // Catch:{ IOException -> 0x0f09 }
            r0 = 231568770(0xdcd7582, float:1.2662389E-30)
            goto L_0x001a
        L_0x065a:
            r0 = -986953039(0xffffffffc52c4ab1, float:-2756.6682)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.UaO r2 = (X.C15316UaO) r2
            int r1 = r2.A00
            if (r1 != 0) goto L_0x068e
            java.lang.String r5 = r2.A07
            if (r5 != 0) goto L_0x0674
            java.lang.String r8 = "integrationPointId"
        L_0x066f:
            X.0qQ.A0F(r8)
            goto L_0x08d9
        L_0x0674:
            java.lang.String r6 = r2.A0A
            if (r6 != 0) goto L_0x067b
            java.lang.String r8 = "surveyId"
            goto L_0x066f
        L_0x067b:
            java.lang.String r7 = r2.A09
            if (r7 != 0) goto L_0x0682
            java.lang.String r8 = "sessionBlob"
            goto L_0x066f
        L_0x0682:
            X.0eM r1 = r2.A0K
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
            r8 = 0
            X.VI3.A00(r3, r4, r5, r6, r7, r8)
        L_0x068e:
            long r3 = java.lang.System.currentTimeMillis()
            r2.A01 = r3
            X.DbS.A1D(r2)
            android.app.Activity r1 = r2.getRootActivity()
            if (r1 == 0) goto L_0x06a7
            android.view.Window r3 = r1.getWindow()
            if (r3 == 0) goto L_0x06a7
            r1 = 3
            r3.setSoftInputMode(r1)
        L_0x06a7:
            java.lang.String r6 = "Page Answer Record Failed"
            java.util.List r7 = r2.A0B     // Catch:{ IllegalArgumentException | NullPointerException -> 0x070d }
            if (r7 == 0) goto L_0x0713
            X.0eM r1 = r2.A0J     // Catch:{ IllegalArgumentException | NullPointerException -> 0x070d }
            java.util.List r1 = X.JTO.A15(r1)     // Catch:{ IllegalArgumentException | NullPointerException -> 0x070d }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IllegalArgumentException | NullPointerException -> 0x070d }
            r5.<init>()     // Catch:{ IllegalArgumentException | NullPointerException -> 0x070d }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ IllegalArgumentException | NullPointerException -> 0x070d }
        L_0x06bc:
            boolean r1 = r4.hasNext()     // Catch:{ IllegalArgumentException | NullPointerException -> 0x070d }
            if (r1 == 0) goto L_0x06d0
            java.lang.String r3 = X.AnonymousClass7TE.A18(r4)     // Catch:{ IllegalArgumentException | NullPointerException -> 0x070d }
            java.util.ArrayList r1 = X.VI5.A00(r3, r7)     // Catch:{ IllegalArgumentException | NullPointerException -> 0x070d }
            if (r1 == 0) goto L_0x06bc
            X.AnonymousClass7TF.A1I(r3, r1, r5)     // Catch:{ IllegalArgumentException | NullPointerException -> 0x070d }
            goto L_0x06bc
        L_0x06d0:
            java.util.Iterator r8 = r5.iterator()     // Catch:{ IllegalArgumentException | NullPointerException -> 0x070d }
        L_0x06d4:
            boolean r1 = r8.hasNext()     // Catch:{ IllegalArgumentException | NullPointerException -> 0x070d }
            if (r1 == 0) goto L_0x06fc
            X.0eP r1 = X.JTO.A1A(r8)     // Catch:{ IllegalArgumentException | NullPointerException -> 0x070d }
            java.lang.Object r5 = r1.A00     // Catch:{ IllegalArgumentException | NullPointerException -> 0x070d }
            java.lang.Object r1 = r1.A01     // Catch:{ IllegalArgumentException | NullPointerException -> 0x070d }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ IllegalArgumentException | NullPointerException -> 0x070d }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IllegalArgumentException | NullPointerException -> 0x070d }
            r4.<init>(r1)     // Catch:{ IllegalArgumentException | NullPointerException -> 0x070d }
            r1 = 0
            X.0qQ.A0B(r5, r1)     // Catch:{ IllegalArgumentException | NullPointerException -> 0x070d }
            X.VXA r3 = r2.A0F     // Catch:{ IllegalArgumentException | NullPointerException -> 0x070d }
            boolean r1 = X.DbT.A1b(r4)     // Catch:{ IllegalArgumentException | NullPointerException -> 0x070d }
            X.17k.A0E(r1)     // Catch:{ IllegalArgumentException | NullPointerException -> 0x070d }
            java.util.HashMap r1 = r3.A00     // Catch:{ IllegalArgumentException | NullPointerException -> 0x070d }
            r1.put(r5, r4)     // Catch:{ IllegalArgumentException | NullPointerException -> 0x070d }
            goto L_0x06d4
        L_0x06fc:
            X.0eM r1 = r2.A0K     // Catch:{ IllegalArgumentException | NullPointerException -> 0x070d }
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)     // Catch:{ IllegalArgumentException | NullPointerException -> 0x070d }
            boolean r1 = X.1NM.A02(r1)     // Catch:{ IllegalArgumentException | NullPointerException -> 0x070d }
            if (r1 == 0) goto L_0x0713
            r1 = 0
            X.C15316UaO.A04(r2, r7, r1)     // Catch:{ IllegalArgumentException | NullPointerException -> 0x070d }
            goto L_0x0713
        L_0x070d:
            r3 = move-exception
            java.lang.String r1 = "RapidFeedbackSurveyFragment"
            X.0KC.A0F(r1, r6, r3)
        L_0x0713:
            com.instagram.survey.structuredsurvey.views.SurveyListView r1 = r2.A05
            java.lang.String r9 = "surveyListView"
            r13 = 0
            if (r1 == 0) goto L_0x08d6
            r1.setAdapter(r13)
            android.content.Context r1 = r2.requireContext()
            X.U46 r3 = X.C15316UaO.A01(r1, r2)
            r2.A04 = r3
            if (r3 == 0) goto L_0x0740
            com.instagram.survey.structuredsurvey.views.SurveyListView r1 = r2.A05
            if (r1 == 0) goto L_0x08d6
            r1.setAdapter(r3)
            java.lang.Object r1 = r2.getHost()
            android.app.Activity r1 = (android.app.Activity) r1
            r3.A00 = r1
            X.C15316UaO.A03(r2)
        L_0x073b:
            r1 = -1838876687(0xffffffff9264f7f1, float:-7.2249726E-28)
            goto L_0x0f42
        L_0x0740:
            android.content.Context r4 = r2.requireContext()
            java.lang.String r3 = r2.A0A
            java.lang.String r8 = "surveyId"
            if (r3 == 0) goto L_0x066f
            java.lang.String r1 = r2.A09
            java.lang.String r9 = "sessionBlob"
            if (r1 == 0) goto L_0x08d6
            X.C15316UaO.A02(r4, r2, r3, r1)
            java.lang.String r10 = r2.A07
            if (r10 == 0) goto L_0x07b3
            java.lang.String r11 = r2.A0A
            if (r11 == 0) goto L_0x066f
            java.lang.String r12 = r2.A09
            if (r12 == 0) goto L_0x08d6
            X.0eM r3 = r2.A0K
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r3)
            java.lang.Integer r9 = X.AnonymousClass05K.A0Y
            X.VI3.A00(r8, r9, r10, r11, r12, r13)
            X.0hq r1 = r2.mFragmentManager
            if (r1 == 0) goto L_0x0771
            r1.A0c()
        L_0x0771:
            X.6Yo r10 = X.DbZ.A0P(r2, r3)
            java.lang.String r3 = r2.A08
            if (r3 != 0) goto L_0x077d
            java.lang.String r9 = "outroToast"
            goto L_0x08d6
        L_0x077d:
            long r7 = r2.A0E
            X.VVv r1 = r2.A02
            if (r1 != 0) goto L_0x0787
            java.lang.String r9 = "model"
            goto L_0x08d6
        L_0x0787:
            java.util.List r1 = r1.A02
            int r1 = r1.size()
            long r5 = (long) r1
            com.instagram.survey.fragment.RapidFeedbackOutroFragment r9 = new com.instagram.survey.fragment.RapidFeedbackOutroFragment
            r9.<init>()
            java.lang.String r1 = "ARG_TOAST_TEXT"
            X.0eP r4 = new X.0eP
            r4.<init>(r1, r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            java.lang.String r1 = "ARG_SURVEY_START_TIME"
            X.0eP r3 = new X.0eP
            r3.<init>(r1, r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.String r1 = "ARG_PAGE_ID"
            android.os.Bundle r1 = X.DbY.A0C(r1, r2, r4, r3)
            X.DbW.A0y(r1, r9, r10)
            goto L_0x073b
        L_0x07b3:
            java.lang.String r9 = "integrationPointId"
            goto L_0x08d6
        L_0x07b7:
            r0 = 281485151(0x10c71f5f, float:7.8539995E-29)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.VYp r0 = (X.C17511VYp) r0
            X.0eM r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.U91 r0 = (X.U91) r0
            X.U91.A02(r0)
            r0 = -1092049033(0xffffffffbee8a777, float:-0.45440266)
            goto L_0x001a
        L_0x07d2:
            r0 = 1793134845(0x6ae110fd, float:1.3604427E26)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.VtD r0 = (X.C18514VtD) r0
            X.U91 r3 = X.C18514VtD.A00(r0)
            r1 = 1
            X.VgI r0 = r3.A0B
            boolean r0 = r0.A00()
            X.U91.A05(r3, r1, r0)
            r0 = 779061687(0x2e6f89b7, float:5.4464624E-11)
            goto L_0x001a
        L_0x07f0:
            r0 = 163677642(0x9c185ca, float:4.6588875E-33)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.WSR r0 = (X.WSR) r0
            X.VX5 r0 = r0.A01
            X.0sa r0 = r0.A02
            r0.invoke()
            r0 = -547870935(0xffffffffdf582729, float:-1.5575463E19)
            goto L_0x001a
        L_0x0807:
            r0 = -2000421036(0xffffffff88c3ff54, float:-1.1796163E-33)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.WSR r0 = (X.WSR) r0
            X.VX5 r0 = r0.A01
            X.0sa r0 = r0.A01
            r0.invoke()
            r0 = -1385944229(0xffffffffad642b5b, float:-1.2969926E-11)
            goto L_0x001a
        L_0x081e:
            r0 = -1784935994(0xffffffff959c09c6, float:-6.302332E-26)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.WSj r0 = (X.C19276WSj) r0
            X.VcX r0 = r0.A01
            X.0sP r0 = r0.A05
            X.0qQ.A0A(r3)
            r0.invoke(r3)
            r0 = 380751739(0x16b1cf7b, float:2.872683E-25)
            goto L_0x001a
        L_0x0838:
            r0 = -191460851(0xfffffffff4968a0d, float:-9.541559E31)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.C51965G9l.A1W(r0, r3)
            r0 = -1378566525(0xffffffffadd4be83, float:-2.4186214E-11)
            goto L_0x001a
        L_0x0849:
            r0 = 1740398776(0x67bc60b8, float:1.7791781E24)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.C51965G9l.A1W(r0, r3)
            r0 = 1109308084(0x421eb2b4, float:39.674515)
            goto L_0x001a
        L_0x085a:
            r0 = 1607466288(0x5fcffd30, float:2.9974376E19)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.WSC r0 = (X.WSC) r0
            X.VWy r0 = r0.A01
            X.0sa r0 = r0.A01
            r0.invoke()
            r0 = 230380084(0xdbb5234, float:1.1544554E-30)
            goto L_0x001a
        L_0x0871:
            r0 = 1365396263(0x51624b27, float:6.0745216E10)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.VhN r0 = (X.C17870VhN) r0
            X.X51 r0 = r0.A01
            r0.DZu()
            r0 = 1996625217(0x77021541, float:2.6383972E33)
            goto L_0x001a
        L_0x0886:
            r0 = 398152197(0x17bb5205, float:1.2105296E-24)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.Uqv r5 = (X.C16232Uqv) r5
            X.X9C r4 = r5.A01
            X.Vuf r0 = r4.Bz5()
            X.W2j r3 = new X.W2j
            r3.<init>(r0)
            X.Vsx r1 = r0.A02
            boolean r0 = r1.A06
            X.W2j.A02(r1, r3, r0)
            X.C18588Vuf.A00(r4, r3)
            com.instagram.shopping.fragment.pdp.AdsProductPageFragment r1 = r5.A00
            r0 = r0 ^ 1
            r1.A03(r0)
            r0 = -23412808(0xfffffffffe9abfb8, float:-1.0284829E38)
            goto L_0x001a
        L_0x08b2:
            r0 = -2053133000(0xffffffff859fad38, float:-1.5015919E-35)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.WNN r0 = (X.WNN) r0
            X.WNN.A00(r0)
            r0 = -478952946(0xffffffffe373c20e, float:-4.496542E21)
            goto L_0x001a
        L_0x08c5:
            r0 = 517694618(0x1edb649a, float:2.3229135E-20)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.UZF r0 = (X.UZF) r0
            X.VhL r1 = r0.A04
            if (r1 != 0) goto L_0x08de
            java.lang.String r9 = "controller"
        L_0x08d6:
            X.0qQ.A0F(r9)
        L_0x08d9:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x08de:
            X.0gy r0 = X.AnonymousClass07i.A00(r0)
            r1.A00(r0)
            r0 = -60224042(0xfffffffffc690dd6, float:-4.8403432E36)
            goto L_0x001a
        L_0x08ea:
            r0 = -862749400(0xffffffffcc937d28, float:-7.7326656E7)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Uam r1 = (X.C15337Uam) r1
            r0 = 0
            X.C15337Uam.A05(r1, r0)
            r0 = 147024901(0x8c36c05, float:1.1761531E-33)
            goto L_0x001a
        L_0x08fe:
            r0 = -258156189(0xfffffffff09cd963, float:-3.8833973E29)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Uam r1 = (X.C15337Uam) r1
            r0 = 0
            X.C15337Uam.A05(r1, r0)
            r0 = 687001700(0x28f2d064, float:2.6957772E-14)
            goto L_0x001a
        L_0x0912:
            r0 = 1903965981(0x717c371d, float:1.2489096E30)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dba.A1Q(r0)
            r0 = -1660226893(0xffffffff9d0af2b3, float:-1.838962E-21)
            goto L_0x001a
        L_0x0923:
            r0 = 1246467949(0x4a4b976d, float:3335643.2)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dba.A1Q(r0)
            r0 = 893413661(0x3540691d, float:7.1678534E-7)
            goto L_0x001a
        L_0x0934:
            r0 = 1659757441(0x62ede381, float:2.1941359E21)
            int r2 = X.AnonymousClass0fD.A05(r0)
            android.view.ViewParent r0 = r3.getParent()
            r0.getClass()
            android.view.View r0 = (android.view.View) r0
            r0.performClick()
            r0 = -505682298(0xffffffffe1dbe686, float:-5.07056E20)
            goto L_0x001a
        L_0x094c:
            java.util.List r1 = r1.A01
            java.util.List r2 = X.C51966G9m.A1J(r1)
            X.1NY r3 = X.DbZ.A0L(r3)
            r1 = 2795(0xaeb, float:3.917E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r3.A0A(r1)
            r1 = 547(0x223, float:7.67E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r3.A9m(r1, r6)
            r1 = 2675(0xa73, float:3.748E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r3.A9m(r1, r4)
            java.lang.String r2 = X.C51970G9q.A0k(r2)
            java.lang.String r1 = "labeling_categories"
            X.DbX.A1M(r3, r1, r2)
            X.1OC r1 = r3.A0M()
            r5.schedule(r1)
            r1 = -1788472966(0xffffffff9566117a, float:-4.6461917E-26)
            goto L_0x0f42
        L_0x0986:
            X.0eM r0 = r3.A08
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.String r2 = "action"
            java.lang.String r1 = "dismiss_intro"
            X.VTv r0 = new X.VTv
            r0.<init>()
            r0.A00 = r2
            r0.A01 = r1
            r10.add(r0)
            java.lang.Integer r6 = X.AnonymousClass05K.A0j
            X.VI3.A00(r5, r6, r7, r8, r9, r10)
            r3.A07()
            androidx.fragment.app.FragmentActivity r1 = r3.getActivity()
            if (r1 == 0) goto L_0x09b8
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L_0x09b8
            r1.finish()
        L_0x09b8:
            r0 = -1987232440(0xffffffff898d3d48, float:-3.4002144E-33)
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x09bf:
            r0 = -1497825061(0xffffffffa6b900db, float:-1.2837186E-15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.W1B r4 = (X.W1B) r4
            X.E6c r1 = r4.A04
            android.content.Context r3 = r1.getContext()
            r2 = 0
            if (r3 == 0) goto L_0x09df
            X.37E r1 = X.AnonymousClass37D.A00
            X.37D r1 = r1.A02(r3)
            if (r1 == 0) goto L_0x09df
            androidx.fragment.app.Fragment r2 = r1.A09()
        L_0x09df:
            boolean r1 = r2 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r1 == 0) goto L_0x09ea
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r2 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r2
            if (r2 == 0) goto L_0x09ea
            r2.onBackPressed()
        L_0x09ea:
            com.instagram.common.session.UserSession r1 = r4.A00
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r1)
            X.7ak r1 = X.C334147ak.A00
            r2.A00(r1)
            r1 = 408292299(0x18560bcb, float:2.7664806E-24)
            goto L_0x0f42
        L_0x09fa:
            r0 = 59732862(0x38f737e, float:8.4313E-37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r1.A01
            X.UZC r8 = (X.UZC) r8
            X.VVK r1 = r8.A02
            if (r1 == 0) goto L_0x0a44
            long r5 = r8.A01
            X.6Rx r7 = r1.A01
            X.4uI r4 = r1.A02
            java.lang.Long r9 = java.lang.Long.valueOf(r5)
            android.content.Context r10 = r1.A00
            long r1 = X.JTU.A04()
            long r1 = X.AnonymousClass7TE.A0P(r1)
            long r5 = r5 - r1
            r1 = 604800(0x93a80, double:2.98811E-318)
            long r1 = r5 / r1
            float r3 = (float) r1
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0a4c
            android.content.res.Resources r6 = r10.getResources()
            r5 = 2131820776(0x7f1100e8, float:1.9274276E38)
            double r1 = (double) r3
            double r1 = java.lang.Math.ceil(r1)
            int r3 = (int) r1
            java.lang.String r1 = X.DbY.A0d(r6, r3, r5)
            X.0qQ.A0A(r1)
        L_0x0a3d:
            java.lang.Object[] r1 = new java.lang.Object[]{r9, r1}
            X.C308206Td.A0E(r7, r4, r1)
        L_0x0a44:
            X.DbZ.A15(r8)
            r1 = 674670980(0x2836a984, float:1.0139787E-14)
            goto L_0x0f42
        L_0x0a4c:
            r1 = 86400(0x15180, double:4.26873E-319)
            long r5 = r5 / r1
            int r3 = (int) r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            if (r3 <= 0) goto L_0x0a59
            if (r1 != 0) goto L_0x0a5a
        L_0x0a59:
            r3 = 0
        L_0x0a5a:
            android.content.res.Resources r2 = r10.getResources()
            r1 = 2131820775(0x7f1100e7, float:1.9274274E38)
            java.lang.String r1 = X.DbY.A0d(r2, r3, r1)
            X.0qQ.A07(r1)
            goto L_0x0a3d
        L_0x0a69:
            r0 = 1381185641(0x52533869, float:2.26796126E11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment r6 = (com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment) r6
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            X.Udf r1 = r6.A03
            X.VsW r1 = r1.A06
            X.Wv0 r1 = r1.A00
            com.google.common.collect.ImmutableSet r1 = X.C13990Tnq.A0L(r1)
            X.3kO r4 = r1.iterator()
        L_0x0a87:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0aad
            java.lang.Object r3 = r4.next()
            X.3gp r3 = (X.C247733gp) r3
            com.instagram.user.model.User r2 = r3.A08
            if (r2 == 0) goto L_0x0a87
            com.instagram.common.session.UserSession r1 = r6.A00
            com.instagram.user.model.User r1 = X.DbT.A0j(r1)
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0a87
            com.instagram.user.model.User r1 = r3.A08
            java.lang.String r1 = r1.getId()
            r5.add(r1)
            goto L_0x0a87
        L_0x0aad:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r5)
            int r10 = r9.size()
            android.content.res.Resources r4 = X.DbV.A05(r6)
            r1 = 2131820587(0x7f11002b, float:1.9273893E38)
            r8 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            java.lang.String r7 = X.DbV.A0v(r4, r3, r1, r10)
            r1 = 2131820585(0x7f110029, float:1.927389E38)
            java.lang.String r5 = X.DbV.A0v(r4, r3, r1, r10)
            r2 = 2131820586(0x7f11002a, float:1.9273891E38)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r3}
            java.lang.String r3 = r4.getQuantityString(r2, r10, r1)
            X.8ab r4 = X.DbW.A0U(r6)
            r4.A05 = r7
            r4.A0q(r5)
            r1 = 24
            X.W4v r2 = new X.W4v
            r2.<init>(r1, r6, r9)
            X.8ae r1 = X.C358278ae.BLUE
            r4.A0Y(r2, r1, r3, r8)
            android.content.Context r2 = r6.requireContext()
            r1 = 2131954722(0x7f130c22, float:1.9545951E38)
            java.lang.String r3 = r2.getString(r1)
            r2 = 51
            X.W5U r1 = new X.W5U
            r1.<init>(r6, r2)
            r4.A0a(r1, r3)
            X.DbT.A1V(r4)
            r1 = -1936782507(0xffffffff8c8f0b55, float:-2.2039459E-31)
            goto L_0x0f42
        L_0x0b0a:
            java.lang.Object r0 = r1.A01
            com.instagram.ui.widget.nametagresultcard.impl.NametagResultCardView r0 = (com.instagram.ui.widget.nametagresultcard.impl.NametagResultCardView) r0
            X.X5D r0 = r0.A08
            r0.getClass()
            X.WJp r0 = (X.WJp) r0
            r0.A01()
            return
        L_0x0b19:
            r0 = 941327567(0x381b84cf, float:3.7078567E-5)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.VtD r1 = (X.C18514VtD) r1
            X.U91 r9 = X.C18514VtD.A00(r1)
            X.VX8 r1 = r9.A04
            X.0Ud r1 = r1.A02
            java.lang.Object r3 = r1.getValue()
            X.X1d r3 = (X.C20851X1d) r3
            boolean r1 = r3 instanceof X.UOF
            r10 = 0
            if (r1 == 0) goto L_0x0e89
            X.UOF r3 = (X.UOF) r3
            if (r3 == 0) goto L_0x0e89
            X.0Ud r1 = r9.A0G
            java.lang.Object r2 = r1.getValue()
            boolean r1 = r2 instanceof X.UOK
            if (r1 == 0) goto L_0x0e85
            X.UOK r2 = (X.UOK) r2
            if (r2 == 0) goto L_0x0e85
            X.3uh r1 = r3.A01
            r28 = r1
            com.instagram.user.model.User r8 = r1.A0i
            if (r8 != 0) goto L_0x0b65
            com.instagram.model.reels.Reel r1 = r3.A00
            com.instagram.user.model.User r1 = r1.A0D()
            if (r1 != 0) goto L_0x0b65
            java.lang.String r2 = "Current item has no user"
        L_0x0b5b:
            java.lang.String r1 = "StoriesMessageComposerViewModel"
            X.0wb.A03(r1, r2)
        L_0x0b60:
            r1 = -963708997(0xffffffffc68ef7bb, float:-18299.865)
            goto L_0x0f42
        L_0x0b65:
            java.lang.String r1 = r2.A03
            r27 = r1
            boolean r1 = X.00l.A0W(r27)
            if (r1 != 0) goto L_0x0b60
            X.Vbe r7 = r9.A08
            com.instagram.model.reels.Reel r6 = r3.A00
            X.UKa r2 = r3.A02
            int r1 = r2.A01
            r16 = r1
            int r1 = r2.A02
            r26 = r1
            boolean r1 = r2.A06
            r25 = r1
            int r1 = r2.A03
            r24 = r1
            int r1 = r2.A04
            r23 = r1
            int r1 = r2.A05
            r22 = r1
            float r13 = r2.A00
            X.L8S r1 = r9.A05
            X.0Ud r1 = r1.A03
            java.lang.Object r1 = r1.getValue()
            X.Gmb r1 = (X.C53351Gmb) r1
            float r12 = r1.A00
            r20 = 0
            r5 = 1
            X.0qQ.A0B(r6, r5)
            com.instagram.common.session.UserSession r11 = r7.A02
            X.0iw r1 = r7.A00
            r21 = r1
            X.0wc r2 = X.AnonymousClass0kN.A01(r1, r11)
            r1 = 3239(0xca7, float:4.539E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            r1 = 368(0x170, float:5.16E-43)
            X.1Ln r4 = new X.1Ln
            r4.<init>(r2, r1)
            boolean r1 = X.DbT.A1Y(r4)
            if (r1 == 0) goto L_0x0da9
            r1 = r28
            X.1Xj r3 = r1.A0b
            if (r3 == 0) goto L_0x0da9
            java.lang.String r19 = X.JTP.A0r(r6)
            java.lang.String r14 = r6.A0H(r11)
            java.util.List r1 = r6.A0O(r11)
            int r18 = r1.size()
            java.util.List r1 = r6.A17
            if (r1 == 0) goto L_0x0be3
            boolean r2 = r1.isEmpty()
            r1 = 0
            if (r2 == 0) goto L_0x0be4
        L_0x0be3:
            r1 = 1
        L_0x0be4:
            r17 = r1 ^ 1
            X.0Tu r15 = X.0Tu.A05
            r1 = 36324161919987546(0x810ca200012f5a, double:3.0348844916355217E-306)
            boolean r1 = X.182.A06(r15, r11, r1)
            if (r1 == 0) goto L_0x0e7a
            java.lang.String r1 = ""
        L_0x0bf5:
            r4.A0m(r1)
            X.1iA r1 = r3.BR7()
            int r1 = r1.A00
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "m_t"
            r4.A0Q(r1, r2)
            java.lang.String r2 = r7.A05
            java.lang.String r1 = "tray_session_id"
            r4.A0R(r1, r2)
            java.lang.String r2 = r7.A06
            java.lang.String r1 = "viewer_session_id"
            r4.A0R(r1, r2)
            r1 = r16
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            r1 = 379(0x17b, float:5.31E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r4.A0Q(r1, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r20)
            r1 = 2938(0xb7a, float:4.117E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r4.A0O(r1, r2)
            r1 = 2902(0xb56, float:4.067E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r4.A0O(r1, r2)
            r1 = 679(0x2a7, float:9.51E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r4.A0O(r1, r2)
            java.lang.String r1 = "reel_type"
            r4.A0R(r1, r14)
            r1 = 2912(0xb60, float:4.08E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r4.A0O(r1, r2)
            X.1Xy r1 = r3.A0C
            java.lang.String r2 = r1.BIl()
            r1 = 665(0x299, float:9.32E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r4.A0R(r1, r2)
            float r1 = r12 * r13
            double r1 = (double) r1
            r15 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r1 = r1 / r15
            java.lang.Double r2 = java.lang.Double.valueOf(r1)
            r1 = 96
            java.lang.String r1 = X.C273654mx.A00(r1)
            r4.A0P(r1, r2)
            r1 = r18
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "reel_size"
            r4.A0Q(r1, r2)
            r14 = 1065353216(0x3f800000, float:1.0)
            float r14 = r14 - r12
            r2 = 0
            int r1 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r1 >= 0) goto L_0x0c8d
            r2 = r14
        L_0x0c8d:
            float r2 = r2 * r13
            double r1 = (double) r2
            double r1 = r1 / r15
            java.lang.Double r2 = java.lang.Double.valueOf(r1)
            r1 = 413(0x19d, float:5.79E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r4.A0P(r1, r2)
            r1 = r26
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            r1 = 3315(0xcf3, float:4.645E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r4.A0Q(r1, r2)
            android.os.Parcelable$Creator r1 = com.instagram.user.model.User.CREATOR
            com.instagram.user.model.User r1 = r3.A2A(r11)
            if (r1 == 0) goto L_0x0e77
            com.instagram.user.model.FollowStatus r1 = r1.B6o()
        L_0x0cb9:
            java.lang.String r2 = X.1aC.A06(r1)
            java.lang.String r1 = "follow_status"
            r4.A0R(r1, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r25)
            java.lang.String r1 = "first_view"
            r4.A0O(r1, r2)
            r1 = r24
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "tray_position"
            r4.A0Q(r1, r2)
            java.lang.String r2 = r3.C9L()
            java.lang.String r1 = "tracking_token"
            r4.A0R(r1, r2)
            com.instagram.user.model.User r1 = r3.A2A(r11)
            if (r1 == 0) goto L_0x0e74
            java.lang.Long r2 = X.C51972G9s.A0h(r1)
        L_0x0cea:
            java.lang.String r1 = "media_owner_id"
            r4.A0Q(r1, r2)
            java.lang.String r2 = r21.getModuleName()
            java.lang.String r1 = "source_of_action"
            r4.A0R(r1, r2)
            java.lang.String r2 = "reel_id"
            r1 = r19
            r4.A0R(r2, r1)
            java.lang.String r2 = r7.A04
            r1 = 1853(0x73d, float:2.597E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r4.A0R(r1, r2)
            r1 = r22
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            r1 = 3243(0xcab, float:4.544E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r4.A0Q(r1, r2)
            r1 = r23
            long r1 = (long) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            r1 = 3249(0xcb1, float:4.553E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r4.A0Q(r1, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r17)
            r1 = 2950(0xb86, float:4.134E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r4.A0O(r1, r2)
            r1 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.Double r2 = java.lang.Double.valueOf(r1)
            r1 = 678(0x2a6, float:9.5E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r4.A0P(r1, r2)
            com.instagram.model.reels.ReelType r2 = r6.A0P
            com.instagram.model.reels.ReelType r1 = com.instagram.model.reels.ReelType.A05
            boolean r1 = X.AnonymousClass7TF.A1W(r2, r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r1 = 779(0x30b, float:1.092E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r4.A0O(r1, r2)
            java.util.List r1 = r3.A0e
            java.lang.String r2 = X.C243413Yr.A00(r1)
            java.lang.String r1 = "delivery_flags"
            r4.A0R(r1, r2)
            boolean r1 = r28.CcK()
            if (r1 == 0) goto L_0x0e70
            java.lang.String r2 = "ad"
        L_0x0d6e:
            r1 = 76
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r4.A0R(r1, r2)
            X.1Xy r1 = r3.A0C
            com.instagram.model.hashtag.Hashtag r2 = r1.B6n()
            if (r2 == 0) goto L_0x0d91
            java.lang.String r1 = r2.getId()
            if (r1 == 0) goto L_0x0d89
            java.lang.Long r10 = X.AnonymousClass7TE.A10(r1)
        L_0x0d89:
            java.lang.String r1 = "hashtag_id"
            r4.A0Q(r1, r10)
            X.C13990Tnq.A13(r4, r2)
        L_0x0d91:
            X.1Ns r3 = r6.A0W
            boolean r1 = r3 instanceof X.1Nr
            if (r1 == 0) goto L_0x0e50
            X.1Nr r3 = (X.1Nr) r3
            java.lang.String r1 = r3.getId()
            java.lang.Long r2 = X.AnonymousClass7TE.A10(r1)
            java.lang.String r1 = "a_pk"
            r4.A0Q(r1, r2)
        L_0x0da6:
            r4.Cgf()
        L_0x0da9:
            X.VtC r12 = r9.A09
            boolean r10 = X.C51970G9q.A1Y(r27)
            r11 = r8
            if (r8 != 0) goto L_0x0ded
            com.instagram.user.model.User r11 = r6.A0D()
            if (r11 != 0) goto L_0x0ded
        L_0x0db8:
            java.lang.String r2 = X.U91.A01(r9)
            if (r2 == 0) goto L_0x0dc5
            X.6W7 r1 = r12.A04
            java.util.Map r1 = r1.A00
            r1.remove(r2)
        L_0x0dc5:
            X.U91.A05(r9, r5, r10)
            X.Vgm r1 = r7.A03
            X.1QP r6 = r1.A01
            long r1 = r1.A00
            r3 = 3259(0xcbb, float:4.567E-42)
            java.lang.String r4 = X.C273654mx.A00(r3)
            java.lang.String r3 = ""
            r6.flowMarkPoint(r1, r4, r3)
            X.Vj6 r1 = r9.A06
            X.05G r1 = r1.A00
            r8 = 8
            r9 = 5
            X.Tnz r7 = new X.Tnz
            r11 = r5
            r12 = r10
            r13 = r10
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r1.Epw(r7)
            goto L_0x0b60
        L_0x0ded:
            com.instagram.model.direct.DirectShareTarget r13 = X.AnonymousClass6UD.A00(r11, r10)
            X.Vbe r1 = r12.A05
            com.instagram.common.session.UserSession r3 = r1.A02
            if (r8 == 0) goto L_0x0e3f
            java.lang.String r2 = r8.getId()
        L_0x0dfb:
            r1 = 766842320(0x2db515d0, float:2.0587004E-11)
            X.AnonymousClass59S.A01(r3, r2, r1)
            X.3t2 r1 = r13.A01()
            boolean r1 = r1 instanceof X.C254773t1
            if (r1 == 0) goto L_0x0e42
            X.VPe r1 = r12.A06
            X.0eM r1 = r1.A00
            boolean r1 = X.G9t.A1b(r1)
            if (r1 == 0) goto L_0x0e42
            com.instagram.pendingmedia.model.recipients.PendingRecipient r1 = new com.instagram.pendingmedia.model.recipients.PendingRecipient
            r1.<init>((com.instagram.user.model.User) r11)
            java.util.List r6 = X.AnonymousClass7TE.A1I(r1)
            java.lang.String r4 = r1.A0C
            X.7VU r3 = r12.A02
            X.5gg r2 = new X.5gg
            r2.<init>(r6)
            r20 = 4
            X.Ixx r1 = new X.Ixx
            r13 = r1
            r14 = r28
            r15 = r11
            r16 = r6
            r17 = r12
            r18 = r27
            r19 = r4
            r21 = r10
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r3.A02(r2, r6, r1, r5)
            goto L_0x0db8
        L_0x0e3f:
            java.lang.String r2 = ""
            goto L_0x0dfb
        L_0x0e42:
            r14 = r28
            r15 = r12
            r16 = r11
            r17 = r27
            r18 = r10
            X.C18513VtC.A00(r13, r14, r15, r16, r17, r18)
            goto L_0x0db8
        L_0x0e50:
            boolean r1 = r3 instanceof X.AnonymousClass6YJ
            if (r1 == 0) goto L_0x0da6
            X.6YJ r3 = (X.AnonymousClass6YJ) r3
            X.3I7 r1 = r3.A00
            java.lang.String r2 = r1.A07
            r1 = r20
            java.lang.Long r2 = X.C51971G9r.A0n(r1, r2)
            java.lang.String r1 = "o_pk"
            r4.A0Q(r1, r2)
            java.lang.String r2 = r3.A00()
            java.lang.String r1 = "o_t"
            r4.A0R(r1, r2)
            goto L_0x0da6
        L_0x0e70:
            java.lang.String r2 = "organic"
            goto L_0x0d6e
        L_0x0e74:
            r2 = r10
            goto L_0x0cea
        L_0x0e77:
            r1 = r10
            goto L_0x0cb9
        L_0x0e7a:
            java.lang.String r1 = r3.getId()
            if (r1 != 0) goto L_0x0bf5
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0e85:
            java.lang.String r2 = "Trying to send a message without composer being active"
            goto L_0x0b5b
        L_0x0e89:
            java.lang.String r2 = "Current item not Organic Media"
            goto L_0x0b5b
        L_0x0e8d:
            r0 = -1814611041(0xffffffff93d73b9f, float:-5.433242E-27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.VvI r4 = (X.C18625VvI) r4
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.TextView"
            X.0qQ.A0C(r3, r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4.A02 = r3
            android.widget.TextView r1 = r4.A04
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0eaa
            r1.setTypeface(r3, r2)
        L_0x0eaa:
            android.widget.TextView r1 = r4.A05
            if (r1 == 0) goto L_0x0eb1
            r1.setTypeface(r3, r2)
        L_0x0eb1:
            android.widget.TextView r1 = r4.A01
            if (r1 == 0) goto L_0x0eb8
            r1.setTypeface(r3, r2)
        L_0x0eb8:
            android.widget.TextView r2 = r4.A02
            if (r2 == 0) goto L_0x0ec0
            r1 = 1
            r2.setTypeface(r3, r1)
        L_0x0ec0:
            r4.A01()
            r1 = 1847463609(0x6e1e0eb9, float:1.2229108E28)
            goto L_0x0f42
        L_0x0ec7:
            r0 = -1251256986(0xffffffffb56b5566, float:-8.7668593E-7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            int r3 = r3.getId()
            r2 = 2131431346(0x7f0b0fb2, float:1.8484419E38)
            java.lang.Object r1 = r1.A01
            X.VvI r1 = (X.C18625VvI) r1
            if (r3 != r2) goto L_0x0ee6
            X.2vk r2 = r1.A0B
            android.content.Context r1 = r1.A09
            r2.AV2(r1)
        L_0x0ee2:
            r1 = -1993316774(0xffffffff8930665a, float:-2.1233355E-33)
            goto L_0x0f42
        L_0x0ee6:
            X.2vk r1 = r1.A0B
            r1.AHQ()
            goto L_0x0ee2
        L_0x0eec:
            android.view.View r0 = r3.getRootView()
            X.0nA.A0N(r0)
            android.app.Activity r1 = r6.A00
            if (r1 == 0) goto L_0x0f05
            android.view.Window r0 = r1.getWindow()
            if (r0 == 0) goto L_0x0f05
            android.view.Window r1 = r1.getWindow()
            r0 = 3
            r1.setSoftInputMode(r0)
        L_0x0f05:
            X.U46.A01(r3, r6)
            return
        L_0x0f09:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            r0 = 568595846(0x21e41586, float:1.5455578E-18)
            X.AnonymousClass0fD.A0C(r0, r2)
            throw r1
        L_0x0f16:
            r0 = 703945309(0x29f55a5d, float:1.0895861E-13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.VvI r4 = (X.C18625VvI) r4
            android.widget.ImageButton r3 = r4.A00
            if (r3 == 0) goto L_0x0f32
            boolean r2 = r4.A06
            r1 = 2131237492(0x7f081a74, float:1.8091236E38)
            if (r2 == 0) goto L_0x0f2f
            r1 = 2131237491(0x7f081a73, float:1.8091234E38)
        L_0x0f2f:
            r3.setBackgroundResource(r1)
        L_0x0f32:
            X.2vT r2 = r4.A0A
            boolean r1 = r4.A06
            r2.FHG(r1)
            boolean r1 = r4.A06
            r1 = r1 ^ 1
            r4.A06 = r1
            r1 = 1399290441(0x53677a49, float:9.9418905E11)
        L_0x0f42:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WB0.onClick(android.view.View):void");
    }
}
