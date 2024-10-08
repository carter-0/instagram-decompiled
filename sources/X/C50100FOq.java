package X;

import android.view.View;

/* renamed from: X.FOq  reason: case insensitive filesystem */
public final class C50100FOq implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C50100FOq(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    /* JADX WARNING: type inference failed for: r5v8, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0484, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0487, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01cd, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01d0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0225, code lost:
        if (r2 != r1.intValue()) goto L_0x0227;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r15) {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x046d;
                case 1: goto L_0x03eb;
                case 2: goto L_0x03cf;
                case 3: goto L_0x03a4;
                case 4: goto L_0x0368;
                case 5: goto L_0x02e8;
                case 6: goto L_0x0236;
                case 7: goto L_0x01e2;
                case 8: goto L_0x0199;
                case 9: goto L_0x001f;
                case 10: goto L_0x0146;
                case 11: goto L_0x0109;
                case 12: goto L_0x00d4;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r14.A01
            X.EyH r1 = (X.EyH) r1
            boolean r0 = r14.A02
            if (r0 == 0) goto L_0x00a6
            X.E6c r0 = r1.A02
            android.content.Context r2 = r0.requireContext()
            com.instagram.common.session.UserSession r1 = r1.A00
            r0 = 4077(0xfed, float:5.713E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.FFO.A02(r2, r1, r0)
        L_0x001e:
            return
        L_0x001f:
            java.lang.Object r4 = r14.A01
            X.FEp r4 = (X.C49915FEp) r4
            boolean r1 = r14.A02
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x001e
            if (r1 == 0) goto L_0x0035
            java.lang.String r2 = "professional_switch_account"
            androidx.fragment.app.FragmentActivity r1 = r4.A01
            com.instagram.common.session.UserSession r0 = r4.A07
            X.FFO.A02(r1, r0, r2)
            return
        L_0x0035:
            java.lang.String r0 = "business_conversion_flow"
            X.1Q9 r0 = X.1Q9.A01(r0)
            r0.A08()
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r4.A03
            java.lang.String r6 = "switch_back"
            r9 = 0
            java.lang.String r7 = "setting"
            java.lang.String r8 = "switch_back_button"
            X.Xtl r5 = new X.Xtl
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0.Ckp(r5)
            com.instagram.common.session.UserSession r6 = r4.A07
            com.instagram.user.model.User r0 = X.DbT.A0j(r6)
            r0.A0J()
            com.facebook.common.callercontext.CallerContext r0 = X.FRZ.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330896428647242(0x8112c20000434a, double:3.039143422029603E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            X.8ae r5 = X.C358278ae.RED_BOLD
            r3 = 2131974853(0x7f135ac5, float:1.9586782E38)
            if (r0 == 0) goto L_0x0073
            r3 = 2131974848(0x7f135ac0, float:1.9586772E38)
        L_0x0073:
            r0 = 36317427412571260(0x8106820015147c, double:3.0306255620277777E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x048b
            X.1NY r2 = X.DbU.A0O(r6)
            java.lang.Class<X.Dug> r1 = X.C47313Dug.class
            java.lang.Class<X.F4Z> r0 = X.F4Z.class
            r2.A0R(r1, r0)
            java.lang.String r0 = "business/account/get_meta_verified_for_business_info/"
            r2.A0A(r0)
            X.1OC r2 = X.DbW.A0K(r2)
            r1 = 3
            X.H4o r0 = new X.H4o
            r0.<init>(r3, r1, r5, r4)
            r2.A00 = r0
            X.4DH r1 = r4.A02
            android.content.Context r0 = r1.getContext()
            if (r0 == 0) goto L_0x001e
            X.Dbb.A15(r1, r2)
            return
        L_0x00a6:
            X.E6c r4 = r1.A02
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            com.instagram.common.session.UserSession r5 = r1.A00
            r0 = 2
            X.0qQ.A0B(r5, r0)
            java.lang.String r0 = r4.getModuleName()
            java.util.Map r12 = X.C49234Erd.A00(r0)
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            r0 = 129(0x81, float:1.81E-43)
            java.lang.String r10 = X.C273654mx.A00(r0)
            r3 = 0
            X.EUa r7 = new X.EUa
            r7.<init>()
            X.Mqm r1 = new X.Mqm
            r6 = r3
            r8 = r3
            r11 = r3
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1.A04()
            return
        L_0x00d4:
            r0 = 2036507148(0x7962a20c, float:7.354661E34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            boolean r1 = r14.A02
            java.lang.Object r2 = r14.A01
            X.FF7 r2 = (X.FF7) r2
            if (r1 == 0) goto L_0x00ed
            java.lang.String r1 = "follow_contacts"
            X.FF7.A01(r2, r1)
            r1 = 366640476(0x15da7d5c, float:8.824728E-26)
            goto L_0x0484
        L_0x00ed:
            com.instagram.common.session.UserSession r6 = r2.A04
            X.0iw r5 = r2.A03
            androidx.fragment.app.Fragment r4 = r2.A02
            r7 = 0
            X.FGL r3 = new X.FGL
            r8 = r7
            r3.<init>(r4, r5, r6, r7, r8)
            X.EX9 r1 = X.EX9.ACCOUNT_SETTINGS
            r3.A07(r1)
            java.lang.String r1 = "follow_contacts"
            X.FF7.A00(r2, r7, r1)
            r1 = 1865099364(0x6f2b2864, float:5.2970766E28)
            goto L_0x0484
        L_0x0109:
            r0 = 1507865250(0x59e032a2, float:7.8882583E15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            boolean r2 = r14.A02
            java.lang.Object r6 = r14.A01
            X.FRY r6 = (X.FRY) r6
            java.lang.String r1 = X.FRY.A09
            if (r2 == 0) goto L_0x012a
            android.content.Context r3 = X.DbS.A08(r6)
            com.instagram.common.session.UserSession r2 = r6.A02
            java.lang.String r1 = "minimum_age"
            X.FFO.A02(r3, r2, r1)
            r1 = -42514423(0xfffffffffd774809, float:-2.0543334E37)
            goto L_0x0484
        L_0x012a:
            com.instagram.common.session.UserSession r5 = r6.A02
            X.2jx r4 = r6.A01
            r2 = 0
            X.2nI r3 = X.C229382nI.A03(r4, r5, r2)
            java.lang.String r1 = "com.instagram.shopping.screens.age_gate_selection_load_screen"
            X.8ey r2 = X.C359988do.A02(r2, r5, r1, r2)
            r1 = 16
            X.E86.A01(r2, r3, r6, r1)
            r4.schedule(r2)
            r1 = -599490549(0xffffffffdc44800b, float:-2.21239521E17)
            goto L_0x0484
        L_0x0146:
            r0 = -1243056436(0xffffffffb5e876cc, float:-1.7319921E-6)
            int r4 = X.AnonymousClass0fD.A05(r0)
            boolean r0 = r14.A02
            if (r0 == 0) goto L_0x0166
            java.lang.Object r1 = r14.A01
            X.FRY r1 = (X.FRY) r1
            java.lang.String r0 = X.FRY.A09
            android.content.Context r2 = X.DbS.A08(r1)
            com.instagram.common.session.UserSession r1 = r1.A02
            java.lang.String r0 = "ad_payments"
            X.FFO.A02(r2, r1, r0)
        L_0x0162:
            r0 = -577208081(0xffffffffdd9880ef, float:-1.37363073E18)
            goto L_0x01cd
        L_0x0166:
            java.lang.String r2 = "business"
            java.lang.Object r5 = r14.A01
            X.FRY r5 = (X.FRY) r5
            java.lang.String r0 = X.FRY.A09
            com.instagram.common.session.UserSession r1 = r5.A02
            r3 = 0
            java.lang.String r0 = "promotion_payments_entered_from_business_settings"
            X.FCT.A01(r3, r1, r2, r0, r3)
            X.UsI r2 = new X.UsI
            r2.<init>()
            com.instagram.base.activity.BaseFragmentActivity r0 = r5.A00
            if (r0 == 0) goto L_0x018e
            X.6Yo r1 = X.DbU.A0Q(r0, r1)
            r1.A0B(r3, r2)
            java.lang.String r0 = "PromotePaymentsInterstitialFragment.BACK_STACK_NAME"
            r1.A0A = r0
            r1.A04()
            goto L_0x0162
        L_0x018e:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 1452960107(0x569a696b, float:8.4888779E13)
            X.AnonymousClass0fD.A0C(r0, r4)
            throw r1
        L_0x0199:
            r0 = 234256157(0xdf6771d, float:1.5189596E-30)
            int r4 = X.AnonymousClass0fD.A05(r0)
            X.GUi r5 = X.C63556Kz5.A01
            java.lang.Object r0 = r14.A01
            X.K7D r0 = (X.K7D) r0
            X.0eM r2 = r0.A0F
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r2)
            androidx.fragment.app.FragmentActivity r6 = r0.requireActivity()
            java.lang.String r9 = r0.A08
            if (r9 == 0) goto L_0x01d8
            X.4bv r7 = r0.A0E
            java.lang.String r10 = "ig_stories_consumption_avatar_mentions_bottom_sheet"
            r1 = 0
            r5.A01(r6, r7, r8, r9, r10)
            boolean r0 = r14.A02
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r2)
            if (r0 == 0) goto L_0x01d1
            r1 = 1
            java.lang.String r0 = "edit_your_avatar"
        L_0x01c7:
            X.LHS.A01(r2, r0, r1)
            r0 = -319702649(0xffffffffecf1b987, float:-2.337818E27)
        L_0x01cd:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x01d1:
            r0 = 2938(0xb7a, float:4.117E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x01c7
        L_0x01d8:
            java.lang.String r0 = "editorLoggingSurface"
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x01e2:
            r0 = 1580755759(0x5e386b2f, float:3.3221917E18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r14.A01
            X.E2Z r4 = (X.E2Z) r4
            X.0eM r1 = r4.A05
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r1)
            boolean r2 = r14.A02
            r1 = 0
            X.0qQ.A0B(r5, r1)
            if (r2 == 0) goto L_0x0206
            java.lang.String r6 = "subscriber"
            java.lang.String r7 = "click"
            java.lang.String r8 = "ig_profile_reorder_link_list_page"
            java.lang.String r9 = "cancel_button"
            X.AnonymousClass736.A07(r4, r5, r6, r7, r8, r9)
        L_0x0206:
            X.0eM r1 = r4.A06
            java.lang.Object r4 = r1.getValue()
            X.DkM r4 = (X.C46733DkM) r4
            X.05G r1 = r4.A03
            java.lang.Object r1 = r1.getValue()
            X.EzG r1 = (X.C49597EzG) r1
            java.util.List r1 = r1.A01
            int r2 = r1.hashCode()
            java.lang.Integer r1 = r4.A00
            if (r1 == 0) goto L_0x0227
            int r1 = r1.intValue()
            r3 = 0
            if (r2 == r1) goto L_0x0228
        L_0x0227:
            r3 = 1
        L_0x0228:
            X.6oS r2 = X.C318116oQ.A00(r4)
            r1 = 40
            X.Dba.A1S(r4, r2, r1, r3)
            r1 = -1692229219(0xffffffff9b22a19d, float:-1.3452546E-22)
            goto L_0x0484
        L_0x0236:
            r0 = -979544189(0xffffffffc59d5783, float:-5034.939)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r14.A01
            X.E2Z r5 = (X.E2Z) r5
            X.0eM r1 = r5.A05
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r1)
            boolean r4 = r14.A02
            X.0wc r2 = X.DbX.A0O(r5, r6)
            java.lang.String r1 = "reorder_links_done_clicked"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r3.isSampled()
            if (r1 == 0) goto L_0x026d
            java.lang.String r1 = "multiple_links_reordering"
            X.DbS.A1O(r3, r1)
            X.DbY.A1C(r3)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            java.lang.String r1 = "is_enhanced"
            r3.A7p(r1, r2)
            r3.Cgf()
        L_0x026d:
            if (r4 == 0) goto L_0x027a
            java.lang.String r7 = "subscriber"
            java.lang.String r8 = "click"
            java.lang.String r9 = "ig_profile_reorder_link_list_page"
            java.lang.String r10 = "done_button"
            X.AnonymousClass736.A07(r5, r6, r7, r8, r9, r10)
        L_0x027a:
            X.0eM r1 = r5.A06
            java.lang.Object r6 = r1.getValue()
            X.DkM r6 = (X.C46733DkM) r6
            X.0rm r5 = new X.0rm
            r5.<init>()
            X.05G r4 = r6.A03
            java.lang.Object r1 = r4.getValue()
            X.EzG r1 = (X.C49597EzG) r1
            java.util.List r1 = r1.A01
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x0299:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x02ad
            java.lang.Object r1 = r2.next()
            X.Eae r1 = (X.C48198Eae) r1
            X.EPF r1 = (X.EPF) r1
            java.lang.String r1 = r1.A01
            r3.add(r1)
            goto L_0x0299
        L_0x02ad:
            r5.A00 = r3
            java.lang.Object r1 = r4.getValue()
            X.EzG r1 = (X.C49597EzG) r1
            X.EPF r1 = r1.A00
            if (r1 == 0) goto L_0x02d4
            java.lang.Object r1 = r4.getValue()
            X.EzG r1 = (X.C49597EzG) r1
            X.EPF r1 = r1.A00
            X.0qQ.A0A(r1)
            java.lang.String r1 = r1.A01
            java.util.List r2 = X.AnonymousClass7TE.A1I(r1)
            java.lang.Object r1 = r5.A00
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r1 = X.00k.A0S(r1, r2)
            r5.A00 = r1
        L_0x02d4:
            X.6oS r4 = X.C318116oQ.A00(r6)
            r3 = 0
            r2 = 17
            X.MGd r1 = new X.MGd
            r1.<init>(r6, r5, r3, r2)
            X.AnonymousClass7TE.A1Z(r1, r4)
            r1 = 459718923(0x1b66c10b, float:1.908753E-22)
            goto L_0x0484
        L_0x02e8:
            r0 = -341625262(0xffffffffeba33652, float:-3.9462286E26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r14.A01
            com.instagram.profile.edit.controller.EditProfileFieldsController r5 = (com.instagram.profile.edit.controller.EditProfileFieldsController) r5
            com.instagram.common.session.UserSession r4 = r5.A0A
            X.FYs r6 = X.C49071Eop.A00(r4)
            boolean r7 = r14.A02
            X.0wc r2 = r6.A02
            r1 = 28
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r3.isSampled()
            if (r7 == 0) goto L_0x034f
            if (r1 == 0) goto L_0x0337
            java.lang.String r1 = X.AnonymousClass7TF.A0b()
            r6.A00 = r1
            X.Dbb.A1C(r3)
            r1 = 2783(0xadf, float:3.9E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            java.lang.String r1 = "source"
            X.Dba.A1B(r3, r1, r2)
            java.lang.String r1 = "profile_channels_settings_rendered"
        L_0x0325:
            X.C50336FYs.A00(r3, r6, r1)
            X.Dba.A18(r3)
            java.lang.String r2 = r6.A00
            java.lang.String r1 = X.Dbm.A00()
            r3.AAJ(r1, r2)
            r3.Cgf()
        L_0x0337:
            androidx.fragment.app.FragmentActivity r1 = r5.A06()
            X.6Yo r2 = X.C46447Df9.A01(r1, r4)
            X.E2V r1 = new X.E2V
            r1.<init>()
            r2.A0D(r1)
            r2.A04()
            r1 = -1305309547(0xffffffffb2328e95, float:-1.0393383E-8)
            goto L_0x0484
        L_0x034f:
            if (r1 == 0) goto L_0x0337
            java.lang.String r1 = X.AnonymousClass7TF.A0b()
            r6.A00 = r1
            X.Dbb.A1C(r3)
            r1 = 2783(0xadf, float:3.9E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            java.lang.String r1 = "source"
            X.Dba.A1B(r3, r1, r2)
            java.lang.String r1 = "edit_pinned_channels_null_state_start"
            goto L_0x0325
        L_0x0368:
            r0 = 330019102(0x13abb11e, float:4.334112E-27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            boolean r1 = r14.A02
            if (r1 == 0) goto L_0x0395
            java.lang.Object r4 = r14.A01
            X.ESD r4 = (X.ESD) r4
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            X.0eM r1 = r4.A02
            X.6Yo r3 = X.DbX.A0N(r2, r1)
            X.FFR.A03()
            android.os.Bundle r2 = r4.requireArguments()
            X.E4Y r1 = new X.E4Y
            r1.<init>()
            X.DbW.A0x(r2, r1, r3)
        L_0x0390:
            r1 = 1078116847(0x4042c1ef, float:3.0430868)
            goto L_0x0484
        L_0x0395:
            java.lang.Object r3 = r14.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            android.content.Context r2 = r3.requireContext()
            r1 = 2131975722(0x7f135e2a, float:1.9588544E38)
            X.DbZ.A0w(r2, r3, r1)
            goto L_0x0390
        L_0x03a4:
            r0 = 1189762831(0x46ea570f, float:29995.53)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r14.A01
            X.E1p r2 = (X.C47421E1p) r2
            X.Dba.A11(r2)
            X.DbZ.A15(r2)
            boolean r1 = r14.A02
            if (r1 != 0) goto L_0x03ca
            X.0eM r1 = r2.A03
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.ENZ r1 = X.FEb.A00(r1)
            X.G7f r1 = r1.A00
            if (r1 == 0) goto L_0x03ca
            r1.DZM()
        L_0x03ca:
            r1 = 1430406634(0x554245ea, float:1.33503459E13)
            goto L_0x0484
        L_0x03cf:
            r0 = 452959824(0x1aff9e50, float:1.05721296E-22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r14.A01
            X.NJ1 r2 = (X.NJ1) r2
            boolean r1 = r14.A02
            if (r1 == 0) goto L_0x03e8
            java.lang.String r1 = "https://takeitdown.ncmec.org/"
        L_0x03e0:
            X.NJ1.A00(r2, r1)
            r1 = -424340074(0xffffffffe6b51596, float:-4.2757326E23)
            goto L_0x0484
        L_0x03e8:
            java.lang.String r1 = "https://stopncii.org/"
            goto L_0x03e0
        L_0x03eb:
            r0 = 988759346(0x3aef4532, float:0.0018254875)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r14.A01
            X.E78 r1 = (X.E78) r1
            X.DkW r5 = r1.A02
            boolean r4 = r14.A02
            if (r4 == 0) goto L_0x046a
            java.lang.String r3 = "professional"
        L_0x03fe:
            java.util.HashMap r12 = X.AnonymousClass7TE.A1E()
            java.lang.String r2 = "selected_account_type"
            r12.put(r2, r3)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r2 = r5.A00
            java.lang.String r6 = "personal_or_professional_account_selection"
            r9 = 0
            java.lang.String r7 = r5.A01
            java.lang.String r8 = "continue"
            X.Xtl r5 = new X.Xtl
            r10 = r9
            r11 = r9
            r13 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r2.Ckp(r5)
            if (r4 == 0) goto L_0x0444
            X.G8D r2 = r1.A01
            X.FRU r3 = X.Dba.A0C(r2)
            r2 = 1
            r3.A06 = r2
            X.G8D r2 = r1.A01
            com.instagram.business.activity.BusinessConversionActivity r2 = (com.instagram.business.activity.BusinessConversionActivity) r2
            r2.Clz(r9)
            X.DkW r2 = r1.A02
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r1 = r2.A00
            java.lang.String r4 = r2.A01
            X.Xtl r2 = new X.Xtl
            r3 = r6
            r5 = r9
            r6 = r9
            r7 = r9
            r8 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.Ci7(r2)
        L_0x0440:
            r1 = -516312222(0xffffffffe139b362, float:-2.1409835E20)
            goto L_0x0484
        L_0x0444:
            com.instagram.common.session.UserSession r2 = r1.getSession()
            X.0BQ r7 = X.AnonymousClass0BO.A00(r2)
            android.app.Activity r8 = r1.A00
            com.instagram.common.session.UserSession r10 = r1.getSession()
            r12 = 1
            java.lang.String r11 = "settings"
            X.0B7 r2 = r7.AEO(r8, r9, r10, r11, r12)
            android.os.Bundle r5 = r2.A00
            X.1WK r4 = X.FFQ.A00()
            android.app.Activity r3 = r1.A00
            com.instagram.common.session.UserSession r2 = r1.getSession()
            r1 = 0
            r4.A01(r3, r5, r2, r1)
            goto L_0x0440
        L_0x046a:
            java.lang.String r3 = "personal"
            goto L_0x03fe
        L_0x046d:
            r0 = 2056837365(0x7a98d8f5, float:3.9681477E35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r14.A01
            X.Jj4 r2 = (X.C60305Jj4) r2
            boolean r1 = r14.A02
            if (r1 == 0) goto L_0x0488
            X.E8I r1 = X.E8I.A00
        L_0x047e:
            X.C60305Jj4.A01(r1, r2)
            r1 = -23759405(0xfffffffffe9575d3, float:-9.933337E37)
        L_0x0484:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x0488:
            X.E8J r1 = X.E8J.A00
            goto L_0x047e
        L_0x048b:
            X.C49915FEp.A00(r5, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50100FOq.onClick(android.view.View):void");
    }

    public C50100FOq(FRY fry, int i, boolean z) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = fry;
    }
}
