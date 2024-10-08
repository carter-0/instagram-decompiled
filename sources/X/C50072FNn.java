package X;

import android.view.View;

/* renamed from: X.FNn  reason: case insensitive filesystem */
public final class C50072FNn implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C50072FNn(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0038, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x003b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x03b8, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x03bb, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x03bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r16) {
        /*
            r15 = this;
            int r0 = r15.A00
            r1 = r16
            switch(r0) {
                case 0: goto L_0x01c3;
                case 1: goto L_0x0330;
                case 2: goto L_0x02e7;
                case 3: goto L_0x01aa;
                case 4: goto L_0x016d;
                case 5: goto L_0x02d9;
                case 6: goto L_0x0152;
                case 7: goto L_0x00dd;
                case 8: goto L_0x0073;
                case 9: goto L_0x0263;
                case 10: goto L_0x01ec;
                case 11: goto L_0x003c;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = 1766263555(0x69470b03, float:1.5039265E25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.0eE r1 = X.AnonymousClass0t1.A01
            java.lang.Object r6 = r15.A02
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            r1.A01(r6)
            X.3FW r3 = new X.3FW
            r3.<init>(r6)
            java.lang.String r1 = r15.A03
            X.Fo6 r5 = new X.Fo6
            r5.<init>(r6, r3, r1)
            java.lang.Object r4 = r15.A01
            androidx.core.app.ComponentActivity r4 = (androidx.core.app.ComponentActivity) r4
            X.0xx r1 = X.AnonymousClass07a.A00(r4)
            r7 = 0
            r8 = 0
            X.MGL r2 = new X.MGL
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.AnonymousClass7TE.A1Z(r2, r1)
            r1 = -1782336985(0xffffffff95c3b227, float:-7.904095E-26)
        L_0x0038:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x003c:
            r0 = 550957263(0x20d6f0cf, float:3.6412364E-19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.0eE r1 = X.AnonymousClass0t1.A01
            java.lang.Object r5 = r15.A02
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            com.instagram.user.model.User r2 = r1.A01(r5)
            X.3FW r3 = new X.3FW
            r3.<init>(r5)
            java.lang.String r1 = r15.A03
            X.Fo7 r4 = new X.Fo7
            r4.<init>(r5, r2, r3, r1)
            boolean r9 = X.C46359DdX.A08(r5)
            java.lang.Object r6 = r15.A01
            androidx.core.app.ComponentActivity r6 = (androidx.core.app.ComponentActivity) r6
            X.0xx r1 = X.AnonymousClass07a.A00(r6)
            r7 = 0
            r8 = 5
            X.JTY r2 = new X.JTY
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            X.AnonymousClass7TE.A1Z(r2, r1)
            r1 = 847183168(0x327efd40, float:1.4842328E-8)
            goto L_0x0038
        L_0x0073:
            r0 = 529468758(0x1f8f0d56, float:6.058492E-20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.FnK r2 = (X.C51028FnK) r2
            java.lang.Object r6 = r15.A02
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            java.lang.String r4 = r15.A03
            r12 = 0
            X.70K r5 = r2.A07
            X.EVg r8 = X.C48088EVg.PROFILE_FOLLOWING_SHEET
            java.lang.String r3 = "click"
            java.lang.String r1 = "following_sheet_restrict_option"
            r5.Ck8(r6, r8, r3, r1)
            X.1YZ r1 = X.1YZ.A02
            if (r1 == 0) goto L_0x00d3
            X.0eM r1 = r1.A00
            java.lang.Object r5 = r1.getValue()
            X.F30 r5 = (X.F30) r5
            if (r5 == 0) goto L_0x00d3
            com.instagram.common.session.UserSession r6 = r2.A02
            com.instagram.user.model.User r1 = r2.A05
            java.lang.String r9 = r1.getId()
            java.lang.String r10 = r1.getUsername()
            com.instagram.common.typedurl.ImageUrl r7 = r1.Bh3()
            if (r4 != 0) goto L_0x00d8
            r11 = 0
        L_0x00b1:
            r13 = r12
            X.E66 r5 = r5.A01(r6, r7, r8, r9, r10, r11, r12, r13)
            X.FoT r1 = new X.FoT
            r1.<init>(r2, r12)
            r5.A03 = r1
            X.7Pu r4 = r2.A03
            X.7Pr r3 = X.DbS.A0W(r6)
            android.content.Context r2 = r2.A01
            r1 = 2131972302(0x7f1350ce, float:1.9581608E38)
            X.DbZ.A0z(r2, r3, r1)
            X.DbS.A1S(r3, r12)
            r3.A0T = r5
            r4.A0F(r5, r3)
        L_0x00d3:
            r1 = 840260887(0x32155d17, float:8.694108E-9)
            goto L_0x0038
        L_0x00d8:
            org.json.JSONObject r11 = X.C49069Eon.A00(r4)
            goto L_0x00b1
        L_0x00dd:
            r0 = 1609194014(0x5fea5a1e, float:3.3773685E19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A01
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            boolean r1 = r1.isChecked()
            if (r1 == 0) goto L_0x012f
            com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting r1 = com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting.TOGGLED_ON
        L_0x00f0:
            java.lang.String r8 = r1.A00
            java.lang.Object r5 = r15.A02
            X.E4N r5 = (X.E4N) r5
            X.DlI r6 = r5.A00
            if (r6 != 0) goto L_0x0104
            java.lang.String r0 = "productOnboardingViewModel"
        L_0x00fc:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0104:
            X.0eM r1 = r5.A03
            java.lang.Object r1 = r1.getValue()
            com.instagram.api.schemas.IGRevShareProductType r1 = (com.instagram.api.schemas.IGRevShareProductType) r1
            java.lang.String r7 = r1.A00
            r1 = 0
            X.0qQ.A0B(r8, r1)
            X.2Fj r3 = r6.A02
            java.lang.Object r2 = r3.A02()
            X.Dr0 r2 = (X.Dr0) r2
            if (r2 == 0) goto L_0x011f
            r1 = 1
            r2.A05 = r1
        L_0x011f:
            java.lang.Object r1 = r3.A02()
            r3.A0A(r1)
            X.1a8 r4 = r6.A03
            X.FAE r1 = r6.A01
            if (r1 != 0) goto L_0x0132
            java.lang.String r0 = "partnerProgramEligibilityRepository"
            goto L_0x00fc
        L_0x012f:
            com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting r1 = com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting.TOGGLED_OFF
            goto L_0x00f0
        L_0x0132:
            X.LCC r1 = r1.A00
            X.1OC r1 = r1.A00(r8, r7)
            X.1aU r3 = X.C69818Nsf.A00(r1)
            r2 = 11
            X.M1T r1 = new X.M1T
            r1.<init>((java.lang.Object) r6, (int) r2)
            r4.A02(r3, r1)
            java.lang.String r2 = r15.A03
            java.lang.String r1 = "primary_button_clicked"
            X.E4N.A00(r5, r1, r2)
            r1 = 1902309963(0x7162f24b, float:1.1237844E30)
            goto L_0x0038
        L_0x0152:
            r0 = 1056228385(0x3ef4c421, float:0.47805884)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A02
            X.DmQ r1 = (X.C46848DmQ) r1
            X.E23 r3 = r1.A0A
            java.lang.Object r2 = r15.A01
            X.1Xj r2 = (X.1Xj) r2
            java.lang.String r1 = r15.A03
            r3.A02(r2, r1)
            r1 = -1905981809(0xffffffff8e65068f, float:-2.8229587E-30)
            goto L_0x0038
        L_0x016d:
            r0 = 1891309948(0x70bb197c, float:4.6323604E29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r15.A02
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            X.8ab r4 = X.DbW.A0U(r5)
            r1 = 2131976309(0x7f136075, float:1.9589735E38)
            r4.A09(r1)
            r2 = 2131976307(0x7f136073, float:1.958973E38)
            java.lang.String r1 = r15.A03
            java.lang.String r1 = X.DbV.A0z(r5, r1, r2)
            r4.A0q(r1)
            r3 = 2131971974(0x7f134f86, float:1.9580942E38)
            java.lang.Object r2 = r15.A01
            r1 = 20
            X.FJk r2 = X.C50025FJk.A00(r2, r5, r1)
            X.8ae r1 = X.C358278ae.RED
            r4.A0O(r2, r1, r3)
            r1 = 0
            r4.A0D(r1)
            X.DbT.A1V(r4)
            r1 = 357646622(0x1551411e, float:4.2258582E-26)
            goto L_0x0038
        L_0x01aa:
            r0 = 224535474(0xd6223b2, float:6.9684593E-31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r15.A02
            X.G5j r3 = (X.C51872G5j) r3
            java.lang.Object r2 = r15.A01
            com.instagram.api.schemas.FanClubCategoryType r2 = (com.instagram.api.schemas.FanClubCategoryType) r2
            java.lang.String r1 = r15.A03
            r3.D1J(r2, r1)
            r1 = 752546419(0x2cdaf273, float:6.22285E-12)
            goto L_0x0038
        L_0x01c3:
            r0 = -1099296386(0xffffffffbe7a117e, float:-0.24420735)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.FEe r4 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            java.lang.Object r3 = r15.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r1 = r15.A02
            X.E24 r1 = (X.E24) r1
            X.0eM r1 = r1.A09
            X.0lg r2 = X.DbT.A0X(r1)
            java.lang.String r1 = r15.A03
            java.lang.String r1 = X.SQU.A01(r3, r1)
            com.instagram.simplewebview.SimpleWebViewConfig r1 = X.Dba.A0N(r1)
            r4.A02(r3, r2, r1)
            r1 = -1451622077(0xffffffffa97a0143, float:-5.5512246E-14)
            goto L_0x0038
        L_0x01ec:
            java.lang.Object r6 = r15.A01
            X.EzL r6 = (X.C49602EzL) r6
            java.lang.String r9 = r15.A03
            java.lang.Object r7 = r15.A02
            java.util.AbstractMap r7 = (java.util.AbstractMap) r7
            com.instagram.common.session.UserSession r5 = r6.A02
            java.lang.String r2 = "ads"
            java.lang.String r0 = "ads_personalization_entered"
            X.FCT.A02(r5, r2, r0)
            java.lang.String r8 = "CLOSE"
            r0 = 3615(0xe1f, float:5.066E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            java.lang.String r3 = "app_settings"
            java.lang.String r2 = "entrypoint"
            if (r9 == 0) goto L_0x0246
            java.lang.String r0 = "detailed_version_group"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0235
            r7.put(r2, r3)
            r7.put(r4, r8)
            java.lang.String r0 = "com.bloks.www.fxcal.settings.ads.data_from_partners_user_grain_detailed_version_introduction"
        L_0x021d:
            X.DiU r4 = X.C46649DiU.A04(r0, r7)
            android.content.Context r3 = r1.getContext()
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.DbS.A0N(r5)
            androidx.fragment.app.FragmentActivity r1 = r6.A01
            r0 = 2131957396(0x7f131694, float:1.9551375E38)
            X.DbS.A18(r1, r2, r0)
            r4.A0F(r3, r2)
            return
        L_0x0235:
            java.lang.String r0 = "concise_version_group"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0246
            r7.put(r2, r3)
            r7.put(r4, r8)
            java.lang.String r0 = "com.bloks.www.fxcal.settings.ads.data_from_partners_user_grain_concise_version_introduction"
            goto L_0x021d
        L_0x0246:
            java.lang.String r1 = "entry_point"
            java.lang.String r0 = "ig_settings_ads_android"
            r7.put(r1, r0)
            java.lang.String r0 = "com.instagram.ads.ads_personalization"
            X.DiU r3 = X.C46649DiU.A04(r0, r7)
            androidx.fragment.app.FragmentActivity r2 = r6.A01
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.DbS.A0N(r5)
            r0 = 2131957396(0x7f131694, float:1.9551375E38)
            X.DbS.A18(r2, r1, r0)
            r3.A0D(r2, r1)
            return
        L_0x0263:
            r0 = 361178584(0x158725d8, float:5.458577E-26)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r15.A02
            X.E5Y r0 = (X.E5Y) r0
            androidx.fragment.app.FragmentActivity r6 = r0.requireActivity()
            X.0eM r0 = r0.A0G
            X.0lg r8 = X.DbT.A0X(r0)
            java.lang.Object r3 = r15.A01
            X.F0l r3 = (X.C49654F0l) r3
            java.lang.String r2 = r3.A03
            if (r2 == 0) goto L_0x028a
            java.lang.String r1 = r15.A03
            r0 = 32
            java.lang.String r7 = X.002.A0T(r2, r1, r0)
            if (r7 != 0) goto L_0x028c
        L_0x028a:
            java.lang.String r7 = r15.A03
        L_0x028c:
            java.util.List r0 = r3.A05
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0296:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02a0
            X.DbY.A1W(r5, r1)
            goto L_0x0296
        L_0x02a0:
            r2 = 1
            X.0qQ.A0B(r8, r2)
            X.7Pr r1 = X.DbS.A0W(r8)
            r1.A0d = r7
            X.DbS.A1S(r1, r2)
            r0 = 1061158912(0x3f400000, float:0.75)
            r1.A03 = r0
            r1.A04 = r0
            r1.A1R = r2
            X.7Pu r3 = r1.A00()
            X.E5x r2 = new X.E5x
            r2.<init>()
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r5)
            java.lang.String r0 = "ARG_AUDIENCE_LIST"
            X.0eP r1 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r0 = "ARG_LIST_NAME"
            android.os.Bundle r0 = X.AnonymousClass7TG.A0P(r0, r7, r1)
            r2.setArguments(r0)
            r3.A02(r6, r2)
            r0 = -31624192(0xfffffffffe1d7400, float:-5.2322775E37)
            goto L_0x03b8
        L_0x02d9:
            java.lang.Object r2 = r15.A01
            X.G9f r2 = (X.C51959G9f) r2
            java.lang.Object r1 = r15.A02
            X.5Gi r1 = (X.C283155Gi) r1
            java.lang.String r0 = r15.A03
            r2.DZS(r1, r0)
            return
        L_0x02e7:
            r0 = 1060237087(0x3f31ef1f, float:0.69505495)
            int r4 = X.DbX.A03(r1, r0)
            java.lang.Object r6 = r15.A01
            X.5nB r6 = (X.C294875nB) r6
            java.lang.Object r5 = r15.A02
            com.instagram.model.direct.DirectShareTarget r5 = (com.instagram.model.direct.DirectShareTarget) r5
            android.graphics.RectF r0 = X.0nA.A01
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            X.0nA.A0L(r3, r1)
            java.lang.String r2 = r15.A03
            int r1 = r2.hashCode()
            r0 = 41029958(0x2721146, float:1.7784309E-37)
            if (r1 == r0) goto L_0x032d
            r0 = 216169857(0xce27d81, float:3.4896348E-31)
            if (r1 == r0) goto L_0x032a
            r0 = 643452253(0x265a4d5d, float:7.573879E-16)
            if (r1 != r0) goto L_0x0327
            java.lang.String r0 = "inbox_suggestion"
        L_0x0317:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0327
            X.28D r0 = X.28D.A2J
        L_0x031f:
            r6.DpC(r3, r0, r5)
            r0 = -925543532(0xffffffffc8d55394, float:-436892.62)
            goto L_0x03b8
        L_0x0327:
            X.28D r0 = X.28D.A5J
            goto L_0x031f
        L_0x032a:
            java.lang.String r0 = "inbox_search"
            goto L_0x0317
        L_0x032d:
            java.lang.String r0 = "direct_user_search"
            goto L_0x0317
        L_0x0330:
            r0 = 899930386(0x35a3d912, float:1.2207622E-6)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r15.A01
            com.instagram.business.fragment.SupportLinksFragment r0 = (com.instagram.business.fragment.SupportLinksFragment) r0
            java.lang.Object r3 = r15.A02
            X.4os r3 = (X.C274674os) r3
            java.lang.String r2 = r15.A03
            boolean r1 = com.instagram.business.fragment.SupportLinksFragment.A01(r3, r2)
            if (r1 == 0) goto L_0x03c2
            if (r3 == 0) goto L_0x03c0
            java.lang.String r1 = r3.Ain()
            if (r1 == 0) goto L_0x03c0
            java.lang.String r5 = r3.Ain()
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r5 = r5.toUpperCase(r1)
            java.util.Map r1 = com.instagram.api.schemas.XIGIGBoostCallToAction.A02
            java.lang.Object r9 = r1.get(r5)
            com.instagram.api.schemas.XIGIGBoostCallToAction r9 = (com.instagram.api.schemas.XIGIGBoostCallToAction) r9
            if (r9 != 0) goto L_0x0365
            com.instagram.api.schemas.XIGIGBoostCallToAction r9 = com.instagram.api.schemas.XIGIGBoostCallToAction.UNRECOGNIZED
        L_0x0365:
            X.6Yo r1 = X.Dbb.A0H(r0)
            X.F3v r7 = X.DbU.A0R()
            com.instagram.common.session.UserSession r6 = r0.A02
            r10 = 0
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
            r14 = 0
            java.lang.String r12 = ""
            com.instagram.leadgen.core.model.LeadGenBaseFormList r8 = new com.instagram.leadgen.core.model.LeadGenBaseFormList
            r11 = r10
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r5 = 169(0xa9, float:2.37E-43)
            java.lang.String r5 = X.AnonymousClass000.A00(r5)
            androidx.fragment.app.Fragment r5 = r7.A03(r6, r8, r5)
        L_0x0387:
            r1.A0E(r5)
            java.lang.String r5 = com.instagram.business.fragment.SupportLinksFragment.A06
            r1.A0A = r5
        L_0x038e:
            r1.A04()
        L_0x0391:
            X.FFo r6 = r0.A01
            if (r3 == 0) goto L_0x03bc
            r5 = 1
            java.lang.String r3 = r3.Ain()
        L_0x039a:
            X.0Aj r1 = X.C49935FFo.A00(r6)
            java.lang.String r0 = "home_page"
            X.DbS.A1H(r1, r0)
            java.lang.String r0 = "tap"
            X.C49935FFo.A02(r1, r6, r0, r5)
            java.lang.String r0 = "service_type"
            r1.AAJ(r0, r2)
            java.lang.String r0 = "button_label"
            r1.AAJ(r0, r3)
            r1.Cgf()
            r0 = 1431488142(0x5552c68e, float:1.44843892E13)
        L_0x03b8:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x03bc:
            r5 = 0
            java.lang.String r3 = ""
            goto L_0x039a
        L_0x03c0:
            r9 = 0
            goto L_0x0365
        L_0x03c2:
            java.lang.String r6 = "waterfall_id"
            r1 = 1252(0x4e4, float:1.754E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r1)
            java.lang.String r8 = "entrypoint"
            java.lang.String r10 = "back_stack_tag"
            if (r3 == 0) goto L_0x041d
            com.instagram.api.schemas.ActionButtonPartnerType r5 = com.instagram.api.schemas.ActionButtonPartnerType.FBE
            com.instagram.api.schemas.ActionButtonPartnerType r1 = r3.Bap()
            if (r5 != r1) goto L_0x0487
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            java.lang.String r7 = com.instagram.business.fragment.SupportLinksFragment.A06
            r5.put(r10, r7)
            java.lang.String r1 = r3.AmM()
            r5.put(r9, r1)
            java.lang.String r1 = r0.A03
            r5.put(r8, r1)
            java.lang.String r1 = r0.A04
            r5.put(r6, r1)
            r1 = 2131961426(0x7f132652, float:1.9559549E38)
            java.lang.String r6 = r0.getString(r1)
            r1 = 2878(0xb3e, float:4.033E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.DiU r5 = X.C46649DiU.A04(r1, r5)
            com.instagram.common.session.UserSession r1 = r0.A02
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.DbS.A0N(r1)
            r1.A0U = r6
            X.3M3 r6 = X.C49891FBs.A02(r1, r5)
            X.6Yo r1 = X.Dbb.A0H(r0)
            r1.A0A = r7
            r5 = 1
            r1.A0F = r5
        L_0x0418:
            r1.A0E(r6)
            goto L_0x038e
        L_0x041d:
            com.instagram.api.schemas.SMBPartnerType r5 = com.instagram.api.schemas.SMBPartnerType.DONATION
            java.lang.String r1 = r5.toString()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x044d
            if (r2 == 0) goto L_0x0448
            r1 = r2
        L_0x042c:
            X.EBn r7 = new X.EBn
            r7.<init>(r0, r1, r2)
            com.instagram.common.session.UserSession r1 = r0.A02
            X.1NY r6 = X.DbZ.A0M(r1)
            java.lang.String r1 = "business/instant_experience/get_donation_button_partners_bundle/"
            r6.A0A(r1)
            java.lang.Class<X.Dv1> r5 = X.C47334Dv1.class
            java.lang.Class<X.F58> r1 = X.F58.class
            X.DbV.A1N(r6, r5, r1)
            X.DbW.A1E(r6, r7, r0)
            goto L_0x0391
        L_0x0448:
            java.lang.String r1 = r5.toString()
            goto L_0x042c
        L_0x044d:
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            java.lang.String r7 = com.instagram.business.fragment.SupportLinksFragment.A06
            r5.put(r10, r7)
            java.lang.String r1 = r0.A03
            r5.put(r8, r1)
            r5.put(r9, r2)
            java.lang.String r1 = r0.A04
            r5.put(r6, r1)
            r1 = 2131973040(0x7f1353b0, float:1.9583105E38)
            java.lang.String r6 = r0.getString(r1)
            r1 = 1192(0x4a8, float:1.67E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.DiU r5 = X.C46649DiU.A04(r1, r5)
            com.instagram.common.session.UserSession r1 = r0.A02
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.DbS.A0N(r1)
            r1.A0U = r6
            X.3M3 r6 = X.C49891FBs.A02(r1, r5)
            X.6Yo r1 = X.Dbb.A0H(r0)
            r1.A0A = r7
            goto L_0x0418
        L_0x0487:
            com.instagram.api.schemas.ActionButtonPartnerType r5 = com.instagram.api.schemas.ActionButtonPartnerType.SMB
            com.instagram.api.schemas.ActionButtonPartnerType r1 = r3.Bap()
            if (r5 != r1) goto L_0x0391
            X.6Yo r1 = X.Dbb.A0H(r0)
            X.F3v r5 = X.DbU.A0R()
            java.lang.String r6 = r0.A04
            java.lang.String r7 = r3.Ac5()
            java.lang.String r8 = r3.Bao()
            java.lang.String r9 = r3.getUrl()
            java.lang.String r10 = r3.getUrl()
            java.lang.String r11 = r0.A03
            java.lang.String r12 = r3.AmM()
            com.instagram.business.fragment.SupportServiceEditUrlFragment r5 = r5.A07(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0387
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50072FNn.onClick(android.view.View):void");
    }
}
