package X;

import android.content.DialogInterface;

/* renamed from: X.FJh  reason: case insensitive filesystem */
public final class C50022FJh implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C50022FJh(EEM eem, String str, int i) {
        this.A00 = i;
        if (13 - i != 0) {
            this.A01 = eem;
            this.A02 = str;
            return;
        }
        this.A01 = eem;
        this.A02 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03ae, code lost:
        r0 = "threadKey";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03b1, code lost:
        r0 = "threadId";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03b4, code lost:
        r0 = "dailyPromptsLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03b7, code lost:
        r0 = "userType";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03b9, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03c0, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x013b, code lost:
        X.AnonymousClass7TE.A1Z(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x013e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003c, code lost:
        r4 = new X.MFW(r3, r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0284, code lost:
        if (r1 == null) goto L_0x0286;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0310, code lost:
        r3.AAJ(r0, r4);
        r3.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0316, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r17, int r18) {
        /*
            r16 = this;
            r4 = r16
            int r0 = r4.A00
            r3 = r17
            switch(r0) {
                case 0: goto L_0x037a;
                case 1: goto L_0x0009;
                case 2: goto L_0x0009;
                case 3: goto L_0x00e6;
                case 4: goto L_0x0332;
                case 5: goto L_0x0317;
                case 6: goto L_0x02f8;
                case 7: goto L_0x002f;
                case 8: goto L_0x0021;
                case 9: goto L_0x02cb;
                case 10: goto L_0x00d2;
                case 11: goto L_0x02bd;
                case 12: goto L_0x022b;
                case 13: goto L_0x0211;
                case 14: goto L_0x01ff;
                case 15: goto L_0x00b3;
                case 16: goto L_0x01e2;
                case 17: goto L_0x0043;
                case 18: goto L_0x01c5;
                case 19: goto L_0x019f;
                case 20: goto L_0x018b;
                case 21: goto L_0x0142;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r5 = r4.A01
            com.instagram.business.fragment.SupportServiceEditUrlFragment r5 = (com.instagram.business.fragment.SupportServiceEditUrlFragment) r5
            java.lang.String r4 = r4.A02
            com.instagram.common.session.UserSession r3 = r5.A03
            com.instagram.api.schemas.SMBPartnerType r0 = r5.A01
            java.lang.String r2 = r0.toString()
            r1 = 2
            X.ECz r0 = new X.ECz
            r0.<init>(r4, r5, r1)
            X.C48757Ejg.A00(r0, r3, r5, r2)
        L_0x0020:
            return
        L_0x0021:
            java.lang.Object r3 = r4.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r4.A02
            X.0xx r5 = X.AnonymousClass07a.A00(r3)
            r1 = 0
            r0 = 45
            goto L_0x003c
        L_0x002f:
            java.lang.Object r3 = r4.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r2 = r4.A02
            X.0xx r5 = X.AnonymousClass07a.A00(r3)
            r1 = 0
            r0 = 44
        L_0x003c:
            X.MFW r4 = new X.MFW
            r4.<init>(r3, r2, r1, r0)
            goto L_0x013b
        L_0x0043:
            java.lang.Object r5 = r4.A01
            X.EEM r5 = (X.EEM) r5
            X.1Q0 r1 = X.1Q0.A0d
            java.lang.String r0 = r4.A02
            X.EEM.A05(r5, r1, r0)
            r3.dismiss()
            X.0Tu r2 = X.0Tu.A05
            r0 = 2324141373780919549(0x20410244000004fd, double:2.537155989485241E-153)
            boolean r0 = X.1AW.A06(r2, r0)
            java.lang.String r4 = "FacebookLoginHelper"
            if (r0 == 0) goto L_0x0089
            X.FV8 r0 = X.FV8.A00()
            X.0aP r3 = r5.A08
            java.lang.String r2 = "ig_android_growth_FX_access_fbig_create_cp_claiming"
            boolean r0 = r0.A04(r3, r2, r4)
            if (r0 == 0) goto L_0x0089
            X.FV8 r0 = X.FV8.A00()
            java.lang.String r1 = r0.A02(r3, r2, r4)
            X.FV8 r0 = X.FV8.A00()
            java.lang.String r0 = r0.A01(r3, r2, r4)
            android.os.Handler r3 = r5.A05
            X.Fui r2 = new X.Fui
            r2.<init>(r5, r1, r0)
        L_0x0085:
            r3.post(r2)
            return
        L_0x0089:
            X.FXk r0 = X.C50305FXk.A03
            X.0aP r2 = r5.A08
            boolean r0 = r0.A00(r2, r4)
            if (r0 == 0) goto L_0x0384
            boolean r0 = X.Dbc.A12(r2, r4)
            if (r0 == 0) goto L_0x00b0
            r1 = 0
        L_0x009a:
            boolean r0 = X.Dbc.A12(r2, r4)
            if (r0 == 0) goto L_0x00ad
            r0 = 0
        L_0x00a1:
            if (r1 == 0) goto L_0x0020
            if (r0 == 0) goto L_0x0020
            android.os.Handler r3 = r5.A05
            X.Fui r2 = new X.Fui
            r2.<init>(r5, r0, r1)
            goto L_0x0085
        L_0x00ad:
            java.lang.String r0 = X.C50305FXk.A02
            goto L_0x00a1
        L_0x00b0:
            java.lang.String r1 = X.C50305FXk.A00
            goto L_0x009a
        L_0x00b3:
            java.lang.String r1 = r4.A02
            if (r1 == 0) goto L_0x0020
            java.lang.String r0 = "sso_disabled"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            java.lang.Object r1 = r4.A01
            X.EEM r1 = (X.EEM) r1
            com.facebook.common.callercontext.CallerContext r0 = X.EEM.A0B
            X.0aP r2 = r1.A08
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.String r1 = "sso_disabled_ok_click"
            r0 = 0
            X.C48921EmL.A00(r2, r1, r0, r0)
            return
        L_0x00d2:
            java.lang.Object r3 = r4.A01
            X.E3Y r3 = (X.E3Y) r3
            java.lang.String r2 = r4.A02
            android.widget.AutoCompleteTextView r0 = r3.A01
            if (r0 == 0) goto L_0x0020
            android.app.Activity r0 = r3.getRootActivity()
            com.facebook.phonenumbers.PhoneNumberUtil r1 = com.facebook.phonenumbers.PhoneNumberUtil.A01(r0)
            goto L_0x0388
        L_0x00e6:
            java.lang.String r3 = r4.A02
            if (r3 == 0) goto L_0x0020
            java.lang.Object r2 = r4.A01
            X.NKp r2 = (X.C68496NKp) r2
            X.MfP r5 = r2.A02
            if (r5 == 0) goto L_0x03b4
            java.lang.String r6 = r2.A0C
            if (r6 == 0) goto L_0x03b1
            com.instagram.model.direct.DirectThreadKey r0 = r2.A08
            if (r0 == 0) goto L_0x03ae
            java.lang.String r7 = r0.A01
            int r13 = r2.A00
            java.lang.String r4 = r2.A0D
            if (r4 == 0) goto L_0x03b7
            boolean r1 = r2.A0H
            java.lang.String r0 = "user_type"
            X.0eP r4 = X.AnonymousClass7TE.A1L(r0, r4)
            if (r1 == 0) goto L_0x013f
            java.lang.String r1 = "ACTIVE"
        L_0x010e:
            java.lang.String r0 = "daily_prompt_status"
            X.0eP r1 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r0 = "daily_prompt_submission_id"
            java.util.LinkedHashMap r12 = X.DbY.A0q(r0, r3, r4, r1)
            java.lang.String r8 = "delete_daily_prompt_response"
            java.lang.String r9 = "tap"
            r0 = 290(0x122, float:4.06E-43)
            java.lang.String r10 = X.C66579MXk.A00(r0)
            java.lang.String r11 = "delete_daily_prompt_response_dialog"
            X.C66930MfP.A02(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.0eM r0 = r2.A0K
            X.2YL r2 = X.DbS.A0H(r0)
            X.6oS r5 = X.C318116oQ.A00(r2)
            r1 = 0
            r0 = 32
            X.MFW r4 = new X.MFW
            r4.<init>(r2, r3, r1, r0)
        L_0x013b:
            X.AnonymousClass7TE.A1Z(r4, r5)
            return
        L_0x013f:
            java.lang.String r1 = "ENDED"
            goto L_0x010e
        L_0x0142:
            java.lang.Object r0 = r4.A01
            X.GCh r0 = (X.C52035GCh) r0
            com.instagram.common.session.UserSession r0 = r0.A03
            X.1vn r2 = X.1vm.A01(r0)
            r0 = 2
            X.0qQ.A0B(r2, r0)
            java.lang.String r5 = r4.A02
            r12 = 0
            r11 = 0
            X.2IS r4 = X.C41845B3m.A04()
            X.2IS r3 = X.C41845B3m.A04()
            X.0K0 r1 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r0 = "clips_spin_id"
            X.0Df r1 = X.C41845B3m.A03(r1, r5, r0)
            java.lang.String r0 = "input"
            X.1vR r5 = X.C41847B3o.A04(r1, r4, r0)
            java.util.Map r7 = r4.getParamsCopy()
            java.util.Map r8 = r3.getParamsCopy()
            java.lang.Class<X.C78> r9 = X.C78.class
            java.util.ArrayList r15 = X.AnonymousClass7TE.A1C()
            java.lang.String r6 = "DeleteClipsSpin"
            r10 = 1
            java.lang.String r14 = "xdt_delete_clips_spin"
            com.facebook.pando.PandoGraphQLRequest r4 = new com.facebook.pando.PandoGraphQLRequest
            r13 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.FSa r1 = X.C50168FSa.A00
            X.FS5 r0 = X.FS5.A00
            r2.ATL(r0, r1, r4)
            return
        L_0x018b:
            java.lang.Object r5 = r4.A01
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.String r0 = r4.A02
            X.EWJ r3 = X.FG5.A01(r0)
            long r1 = X.Dba.A01(r5)
            java.lang.Integer r0 = X.AnonymousClass05K.A0J
            X.Dbb.A1P(r5, r3, r0, r1)
            return
        L_0x019f:
            java.lang.Object r1 = r4.A01
            X.0wc r1 = (X.0wc) r1
            java.lang.String r4 = r4.A02
            java.lang.String r2 = "dialog_ok_button"
            r0 = 3378(0xd32, float:4.734E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            r0 = 268(0x10c, float:3.76E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "visual_style"
            r3.AAJ(r0, r1)
            java.lang.String r0 = "from"
            r3.AAJ(r0, r2)
            java.lang.String r0 = "shopping_session_id"
            goto L_0x0310
        L_0x01c5:
            X.FEe r5 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            java.lang.Object r3 = r4.A01
            android.content.Context r3 = (android.content.Context) r3
            X.08y r0 = X.09i.A0A
            com.instagram.common.session.UserSession r2 = r0.A08(r3)
            java.lang.String r0 = "https://help.instagram.com/227486307449481"
            java.lang.String r0 = X.SQU.A01(r3, r0)
            X.SFz r1 = new X.SFz
            r1.<init>((java.lang.String) r0)
            java.lang.String r0 = r4.A02
            X.C49906FEe.A01(r3, r2, r5, r1, r0)
            return
        L_0x01e2:
            java.lang.Object r3 = r4.A01
            X.EEM r3 = (X.EEM) r3
            com.facebook.common.callercontext.CallerContext r0 = X.EEM.A0B
            X.0aP r1 = r3.A08
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.String r0 = "sso_disabled_forgot_click"
            r2 = 0
            X.C48921EmL.A00(r1, r0, r2, r2)
            r3.A08()
            X.F23 r1 = r3.A01
            java.lang.String r0 = r4.A02
            r1.A00(r2, r0)
            return
        L_0x01ff:
            java.lang.Object r2 = r4.A01
            X.EEM r2 = (X.EEM) r2
            X.1Q0 r1 = X.1Q0.A0d
            java.lang.String r0 = r4.A02
            X.EEM.A05(r2, r1, r0)
            r3.dismiss()
            X.EEM.A03(r2)
            return
        L_0x0211:
            java.lang.Object r1 = r4.A01
            X.EEM r1 = (X.EEM) r1
            java.lang.String r0 = r4.A02
            android.app.Activity r3 = r1.A04
            X.0aP r2 = r1.A08
            X.SFz r1 = new X.SFz
            r1.<init>((java.lang.String) r0)
            r0 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r0 = r3.getString(r0)
            X.Dba.A0q(r3, r2, r1, r0)
            return
        L_0x022b:
            java.lang.Object r2 = r4.A01
            com.instagram.nux.fragment.OneTapLoginLandingFragment r2 = (com.instagram.nux.fragment.OneTapLoginLandingFragment) r2
            X.0aP r1 = r2.A00
            X.DiE r0 = X.C46634DiE.ONE_TAP
            java.lang.String r4 = r4.A02
            X.C49900FCd.A01(r1, r0, r4)
            X.0aP r0 = r2.A00
            X.6qt r3 = X.C319606qt.A01(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.0aP r0 = r2.A00
            r3.A0A(r2, r0, r1, r4)
            java.util.ArrayList r1 = com.instagram.nux.fragment.OneTapLoginLandingFragment.A00(r2)
            boolean r0 = r1.isEmpty()
            r4 = 1
            if (r0 == 0) goto L_0x02ad
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            if (r0 == 0) goto L_0x0262
            X.0hq r1 = r0.getSupportFragmentManager()
            if (r1 == 0) goto L_0x0262
            android.os.Bundle r0 = r2.mArguments
            X.C49958FGq.A04(r0, r1)
            return
        L_0x0262:
            java.lang.String r0 = "ig_android_onetap_remove_crash_scenario"
            X.0xI r3 = X.0xI.A00(r2, r0)
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "has_activity"
            r3.A09(r0, r1)
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            if (r0 == 0) goto L_0x0286
            X.0hq r1 = r0.getSupportFragmentManager()
            r0 = 1
            if (r1 != 0) goto L_0x0287
        L_0x0286:
            r0 = 0
        L_0x0287:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "has_fragment_manager"
            r3.A09(r0, r1)
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            if (r0 == 0) goto L_0x02ab
            boolean r0 = r0.isFinishing()
            if (r0 == 0) goto L_0x02ab
        L_0x029c:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            java.lang.String r0 = "is_finishing"
            r3.A09(r0, r1)
            X.0aP r0 = r2.A00
            X.DbU.A1R(r3, r0)
            return
        L_0x02ab:
            r4 = 0
            goto L_0x029c
        L_0x02ad:
            int r0 = r1.size()
            if (r0 != r4) goto L_0x02b7
            com.instagram.nux.fragment.OneTapLoginLandingFragment.A01(r2, r1)
            return
        L_0x02b7:
            X.E8l r0 = r2.A02
            r0.A0C(r1)
            return
        L_0x02bd:
            java.lang.Object r0 = r4.A01
            com.instagram.nux.fragment.OneTapLoginLandingFragment r0 = (com.instagram.nux.fragment.OneTapLoginLandingFragment) r0
            X.0aP r2 = r0.A00
            X.DiE r1 = X.C46634DiE.ONE_TAP
            java.lang.String r0 = r4.A02
            X.C49900FCd.A00(r2, r1, r0)
            return
        L_0x02cb:
            X.1Q0 r0 = X.1Q0.A1c
            java.lang.Object r2 = r4.A01
            X.E3Y r2 = (X.E3Y) r2
            X.0xI r1 = X.FGI.A00(r2, r0)
            X.0aP r0 = r2.A05
            X.DbU.A1R(r1, r0)
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            X.0aP r0 = r2.A05
            X.6Yo r3 = X.DbY.A0J(r1, r0)
            java.lang.String r2 = r4.A02
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "com.instagram.android.login.fragment.ARGUMENT_OMNISTRING"
            r1.putString(r0, r2)
            X.E54 r0 = new X.E54
            r0.<init>()
            X.DbX.A18(r1, r0, r3)
            return
        L_0x02f8:
            java.lang.Object r2 = r4.A01
            X.FEU r2 = (X.FEU) r2
            java.lang.String r1 = r4.A02
            X.0Aj r3 = X.FEU.A00(r2)
            X.EZg r0 = X.C48138EZg.SYSTEM_DIALOG
            X.Dbb.A19(r0, r3)
            java.lang.String r0 = "target_user_id"
            r3.AAJ(r0, r1)
            java.lang.String r4 = r2.A01
            java.lang.String r0 = "module"
        L_0x0310:
            r3.AAJ(r0, r4)
            r3.Cgf()
            return
        L_0x0317:
            java.lang.Object r2 = r4.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r1 = r4.A02
            r0 = 3080(0xc08, float:4.316E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0nC.A01(r2, r1, r0)
            r1 = 2131956743(0x7f131407, float:1.955005E38)
            r0 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r1, r0)
            r0.show()
            return
        L_0x0332:
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.Object r1 = r4.A01
            X.NKp r1 = (X.C68496NKp) r1
            X.MfP r5 = r1.A02
            if (r5 == 0) goto L_0x03b4
            java.lang.String r6 = r1.A0C
            if (r6 == 0) goto L_0x03b1
            com.instagram.model.direct.DirectThreadKey r0 = r1.A08
            if (r0 == 0) goto L_0x03ae
            java.lang.String r7 = r0.A01
            java.lang.String r4 = r4.A02
            int r13 = r1.A00
            java.lang.String r2 = r1.A0D
            if (r2 == 0) goto L_0x03b7
            boolean r1 = r1.A0H
            java.lang.String r0 = "user_type"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r2)
            if (r1 == 0) goto L_0x0377
            java.lang.String r1 = "ACTIVE"
        L_0x035c:
            java.lang.String r0 = "daily_prompt_status"
            X.0eP r1 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r0 = "daily_prompt_submission_id"
            java.util.LinkedHashMap r12 = X.DbY.A0q(r0, r4, r2, r1)
            java.lang.String r8 = "delete_daily_prompt_response_cancel"
            java.lang.String r9 = "tap"
            java.lang.String r10 = "cancel_button"
            java.lang.String r11 = "delete_daily_prompt_response_dialog"
            X.C66930MfP.A02(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r3.dismiss()
            return
        L_0x0377:
            java.lang.String r1 = "ENDED"
            goto L_0x035c
        L_0x037a:
            java.lang.Object r1 = r4.A01
            com.instagram.business.fragment.SupportServiceEditUrlFragment r1 = (com.instagram.business.fragment.SupportServiceEditUrlFragment) r1
            java.lang.String r0 = r4.A02
            com.instagram.business.fragment.SupportServiceEditUrlFragment.A02(r1, r0)
            return
        L_0x0384:
            X.EEM.A03(r5)
            return
        L_0x0388:
            com.instagram.phonenumber.model.CountryCodeData r0 = r3.A0I     // Catch:{ 2sh -> 0x03a6 }
            java.lang.String r0 = r0.A01     // Catch:{ 2sh -> 0x03a6 }
            X.74u r0 = r1.A0F(r2, r0)     // Catch:{ 2sh -> 0x03a6 }
            android.widget.AutoCompleteTextView r3 = r3.A01     // Catch:{ 2sh -> 0x03a6 }
            java.lang.String r2 = "%d"
            long r0 = r0.A02     // Catch:{ 2sh -> 0x03a6 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ 2sh -> 0x03a6 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ 2sh -> 0x03a6 }
            java.lang.String r0 = X.0mp.A06(r2, r0)     // Catch:{ 2sh -> 0x03a6 }
            r3.setText(r0)     // Catch:{ 2sh -> 0x03a6 }
            return
        L_0x03a6:
            java.lang.String r1 = "ContactPointTriageFragment"
            java.lang.String r0 = "Error parsing suggested phone number."
            X.0wb.A03(r1, r0)
            return
        L_0x03ae:
            java.lang.String r0 = "threadKey"
            goto L_0x03b9
        L_0x03b1:
            java.lang.String r0 = "threadId"
            goto L_0x03b9
        L_0x03b4:
            java.lang.String r0 = "dailyPromptsLogger"
            goto L_0x03b9
        L_0x03b7:
            java.lang.String r0 = "userType"
        L_0x03b9:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50022FJh.onClick(android.content.DialogInterface, int):void");
    }

    public C50022FJh(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public C50022FJh(C68496NKp nKp, String str, int i) {
        this.A00 = i;
        if (3 - i != 0) {
            this.A01 = nKp;
            this.A02 = str;
        } else {
            this.A02 = str;
            this.A01 = nKp;
        }
    }
}
