package X;

import android.view.View;

public final class FP0 implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public FP0(E54 e54, int i) {
        this.A00 = i;
        if (62 - i != 0) {
            this.A01 = e54;
        } else {
            this.A01 = e54;
        }
    }

    public static void A00(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new FP0(obj, i), view);
    }

    /* JADX WARNING: type inference failed for: r4v36, types: [java.lang.Object, X.F1R] */
    /* JADX WARNING: type inference failed for: r6v3, types: [java.lang.Object, X.F1R] */
    /* JADX WARNING: type inference failed for: r3v127, types: [com.instagram.nux.cal.activity.CalActivity, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r4v114, types: [X.KHD, X.11X] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0b40, code lost:
        X.0qQ.A0F(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0b47, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        X.AnonymousClass0fD.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0f15, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0f18, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x14b0, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x14b3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0241, code lost:
        r8 = "aymhViewModel";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r31) {
        /*
            r30 = this;
            r3 = r30
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x146b;
                case 1: goto L_0x1425;
                case 2: goto L_0x1402;
                case 3: goto L_0x13e9;
                case 4: goto L_0x13cc;
                case 5: goto L_0x0207;
                case 6: goto L_0x01cd;
                case 7: goto L_0x01b0;
                case 8: goto L_0x0e3b;
                case 9: goto L_0x0d62;
                case 10: goto L_0x0ed1;
                case 11: goto L_0x139a;
                case 12: goto L_0x1387;
                case 13: goto L_0x1364;
                case 14: goto L_0x12f6;
                case 15: goto L_0x00f7;
                case 16: goto L_0x12e3;
                case 17: goto L_0x0ce9;
                case 18: goto L_0x129e;
                case 19: goto L_0x1281;
                case 20: goto L_0x126c;
                case 21: goto L_0x1251;
                case 22: goto L_0x00e2;
                case 23: goto L_0x123c;
                case 24: goto L_0x1227;
                case 25: goto L_0x1212;
                case 26: goto L_0x00cd;
                case 27: goto L_0x11fd;
                case 28: goto L_0x11e8;
                case 29: goto L_0x11d2;
                case 30: goto L_0x0c87;
                case 31: goto L_0x11b4;
                case 32: goto L_0x1174;
                case 33: goto L_0x0021;
                case 34: goto L_0x0080;
                case 35: goto L_0x1134;
                case 36: goto L_0x110a;
                case 37: goto L_0x10e2;
                case 38: goto L_0x0c22;
                case 39: goto L_0x0bbd;
                case 40: goto L_0x10cf;
                case 41: goto L_0x0b61;
                case 42: goto L_0x10bc;
                case 43: goto L_0x0a77;
                case 44: goto L_0x0a23;
                case 45: goto L_0x093f;
                case 46: goto L_0x1097;
                case 47: goto L_0x0755;
                case 48: goto L_0x1076;
                case 49: goto L_0x1055;
                case 50: goto L_0x0734;
                case 51: goto L_0x1000;
                case 52: goto L_0x0718;
                case 53: goto L_0x06e8;
                case 54: goto L_0x060a;
                case 55: goto L_0x0fef;
                case 56: goto L_0x0fde;
                case 57: goto L_0x0fcd;
                case 58: goto L_0x0f9f;
                case 59: goto L_0x0f6a;
                case 60: goto L_0x0f49;
                case 61: goto L_0x059e;
                case 62: goto L_0x0f19;
                case 63: goto L_0x04d1;
                case 64: goto L_0x03b9;
                case 65: goto L_0x03a5;
                case 66: goto L_0x0371;
                case 67: goto L_0x0354;
                case 68: goto L_0x0274;
                case 69: goto L_0x0245;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = -1624570811(0xffffffff9f2b0445, float:-3.621419E-20)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r3.A01
            X.E3V r0 = (X.E3V) r0
            r1 = 0
            r0.A0G = r1
            X.EEK r0 = r0.A09
            r0.A03(r1)
            r0 = 484924242(0x1ce75b52, float:1.5309903E-21)
        L_0x001d:
            X.AnonymousClass0fD.A0C(r0, r2)
        L_0x0020:
            return
        L_0x0021:
            r0 = 1473104343(0x57cdc9d7, float:4.52533558E14)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r3.A01
            X.E2O r7 = (X.E2O) r7
            X.0eM r5 = r7.A08
            X.0lg r6 = X.DbT.A0X(r5)
            X.DiE r17 = X.C46634DiE.A0D
            java.lang.String r11 = "auto_conf_consent"
            java.lang.String r4 = "registration_flow"
            java.lang.String r2 = "ar_code_sms"
            java.lang.String r0 = "client_reg_user_allow_consent"
            r3 = 0
            X.C49944FFx.A01(r6, r11, r0, r4, r2)
            X.S6k r0 = X.LQc.A07
            android.content.Context r0 = r7.requireContext()
            X.LQc r10 = new X.LQc
            r10.<init>(r0)
            android.app.Activity r13 = X.DbT.A03(r7)
            com.instagram.common.session.UserSession r15 = X.AnonymousClass7TE.A0l(r5)
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r7.A02
            if (r0 != 0) goto L_0x005b
            java.lang.String r8 = "saveButton"
            goto L_0x0b40
        L_0x005b:
            X.ECb r9 = new X.ECb
            r12 = r9
            r14 = r7
            r16 = r0
            r12.<init>(r13, r14, r15, r16, r17)
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r5)
            android.app.Activity r5 = X.DbT.A03(r7)
            java.lang.String r2 = r7.A04
            if (r2 != 0) goto L_0x0074
            java.lang.String r8 = "registerStartMessage"
            goto L_0x0b40
        L_0x0074:
            java.lang.String r13 = r7.A03
            if (r13 == 0) goto L_0x00c9
            java.lang.String r12 = r7.A05
            if (r12 != 0) goto L_0x0e91
            java.lang.String r8 = "smsFlowType"
            goto L_0x0b40
        L_0x0080:
            r0 = -2111415474(0xffffffff82265b4e, float:-1.2221957E-37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r3.A01
            X.E2O r6 = (X.E2O) r6
            X.0eM r7 = r6.A08
            X.0lg r5 = X.DbT.A0X(r7)
            java.lang.String r4 = "auto_conf_consent"
            java.lang.String r3 = "registration_flow"
            java.lang.String r2 = r6.A05
            java.lang.String r8 = "smsFlowType"
            r11 = 0
            if (r2 == 0) goto L_0x0b40
            java.lang.String r1 = "client_reg_user_deny_consent"
            r14 = 0
            X.C49944FFx.A01(r5, r4, r1, r3, r2)
            android.content.Context r9 = r6.requireContext()
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r7)
            java.lang.String r12 = r6.A03
            if (r12 == 0) goto L_0x00c9
            java.lang.String r13 = r6.A05
            if (r13 == 0) goto L_0x0b40
            X.1OC r1 = X.FHA.A09(r9, r10, r11, r12, r13, r14)
            X.1ES.A03(r1)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r7)
            androidx.fragment.app.FragmentActivity r1 = r6.getActivity()
            X.C46413Dea.A06(r1, r11, r6, r2)
            r1 = -1491315101(0xffffffffa71c5663, float:-2.169618E-15)
            goto L_0x14b0
        L_0x00c9:
            java.lang.String r8 = "nonce"
            goto L_0x0b40
        L_0x00cd:
            r0 = 720429239(0x2af0e0b7, float:4.2788491E-13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Ffg r1 = (X.C50625Ffg) r1
            X.F3a r2 = r1.A0D
            com.instagram.igds.components.switchbutton.IgdsSwitch r1 = r1.A0A
            if (r1 != 0) goto L_0x0eb9
            java.lang.String r8 = "sharePhotoToFeedSwitch"
            goto L_0x0b40
        L_0x00e2:
            r0 = 651343119(0x26d2b50f, float:1.4620753E-15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Ffh r1 = (X.C50626Ffh) r1
            X.F3a r2 = r1.A0I
            com.instagram.igds.components.switchbutton.IgdsSwitch r1 = r1.A0D
            if (r1 != 0) goto L_0x0ec5
            java.lang.String r8 = "shareSwitch"
            goto L_0x0b40
        L_0x00f7:
            java.lang.Object r4 = r3.A01
            X.E4O r4 = (X.E4O) r4
            X.F3G r3 = r4.A03
            boolean r2 = r4.A0C
            boolean r0 = r3 instanceof X.C47926ENd
            if (r0 != 0) goto L_0x0113
            boolean r0 = r3 instanceof X.C47924ENb
            X.0lg r1 = r3.A00
            if (r0 == 0) goto L_0x0142
            java.lang.String r0 = r3.A02
            X.AnonymousClass7TG.A1N(r1, r0)
            java.lang.String r2 = "disclosures_v2_screen_agreed"
        L_0x0110:
            X.FG9.A00(r1, r2, r0)
        L_0x0113:
            X.FBf r2 = X.C49881FBf.A00
            X.0wW r1 = r4.getSession()
            X.DiE r0 = r4.A01()
            java.lang.String r0 = r0.A01
            r2.A02(r1, r0)
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            X.G65 r2 = (X.G65) r2
            java.lang.String r1 = r4.A09
            java.lang.String r0 = r4.A0A
            com.instagram.nux.cal.activity.CalActivity r2 = (com.instagram.nux.cal.activity.CalActivity) r2
            r2.A04 = r1
            r2.A05 = r0
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()
            X.G65 r3 = (X.G65) r3
            com.instagram.nux.cal.activity.CalActivity r3 = (com.instagram.nux.cal.activity.CalActivity) r3
            X.0wW r4 = r3.A02
            if (r4 != 0) goto L_0x0153
            java.lang.String r8 = "_session"
            goto L_0x0b40
        L_0x0142:
            if (r2 == 0) goto L_0x0150
            X.EVV r0 = X.EVV.IG_SAC_SIGN_UP
            java.lang.String r0 = r0.toString()
        L_0x014a:
            X.AnonymousClass7TG.A1N(r1, r0)
            java.lang.String r2 = "disclosures_agreed_button_pressed"
            goto L_0x0110
        L_0x0150:
            java.lang.String r0 = r3.A02
            goto L_0x014a
        L_0x0153:
            android.os.Bundle r1 = r3.A01
            java.lang.String r8 = "clientBundle"
            if (r1 == 0) goto L_0x0b40
            java.lang.String r0 = "extra_cal_registration_source"
            java.lang.String r2 = r1.getString(r0)
            android.os.Bundle r1 = r3.A01
            if (r1 == 0) goto L_0x0b40
            java.lang.String r0 = "extra_cal_force_signup_with_fb_after_cp_claiming"
            java.lang.Boolean r1 = X.DbU.A0g(r1, r0)
            java.lang.String r0 = "upsell_primary_click"
            X.FFL.A03(r4, r1, r0, r2)
            android.content.Intent r2 = X.DbS.A09()
            r1 = 1
            java.lang.String r0 = "result_action_positive"
            r2.putExtra(r0, r1)
            int r1 = r3.A00
            java.lang.String r0 = "argument_requested_code"
            r2.putExtra(r0, r1)
            java.lang.String r1 = r3.A03
            if (r1 != 0) goto L_0x0187
            java.lang.String r8 = "accessToken"
            goto L_0x0b40
        L_0x0187:
            java.lang.String r0 = "argument_access_token"
            r2.putExtra(r0, r1)
            android.os.Bundle r1 = r3.A01
            if (r1 == 0) goto L_0x0b40
            java.lang.String r0 = "argument_client_extras_bundle"
            r2.putExtra(r0, r1)
            java.lang.String r1 = r3.A04
            java.lang.String r0 = "argument_selected_age_account_id"
            r2.putExtra(r0, r1)
            java.lang.String r1 = r3.A05
            java.lang.String r0 = "argument_selected_age_account_type"
            r2.putExtra(r0, r1)
            X.Dba.A0k(r3, r2)
            r1 = 2130772104(0x7f010088, float:1.7147317E38)
            r0 = 2130772107(0x7f01008b, float:1.7147323E38)
            r3.overridePendingTransition(r1, r0)
            return
        L_0x01b0:
            r0 = -1253857499(0xffffffffb543a725, float:-7.288639E-7)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r3.A01
            X.E4P r0 = (X.E4P) r0
            X.F23 r2 = r0.A04
            if (r2 != 0) goto L_0x01c3
            java.lang.String r8 = "forgotPasswordHelper"
            goto L_0x0b40
        L_0x01c3:
            java.lang.String r1 = r0.A07
            if (r1 != 0) goto L_0x0f0e
            java.lang.String r8 = X.Dbj.A03()
            goto L_0x0b40
        L_0x01cd:
            r0 = 1603004090(0x5f8be6ba, float:2.0161899E19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            X.E5W r4 = (X.E5W) r4
            X.0eM r3 = r4.A03
            X.0lg r2 = X.DbT.A0X(r3)
            java.lang.String r1 = "aymh"
            X.C49228ErX.A00(r2, r1)
            com.instagram.nux.aymh.viewmodel.AymhViewModel r5 = r4.A01
            if (r5 == 0) goto L_0x0241
            android.os.Bundle r4 = r4.requireArguments()
            java.lang.Object r3 = r3.getValue()
            r1 = 1
            X.0qQ.A0B(r3, r1)
            X.6oS r1 = X.C318116oQ.A00(r5)
            r6 = 0
            r7 = 41
            X.MGh r2 = new X.MGh
            r2.<init>(r3, r4, r5, r6, r7)
            X.AnonymousClass7TE.A1Z(r2, r1)
            r1 = 781795031(0x2e993ed7, float:6.968797E-11)
            goto L_0x14b0
        L_0x0207:
            r0 = 830349741(0x317e21ad, float:3.6981007E-9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            X.E5W r4 = (X.E5W) r4
            X.0eM r3 = r4.A03
            X.0lg r2 = X.DbT.A0X(r3)
            java.lang.String r1 = "aymh"
            r6 = 0
            X.C49227ErW.A00(r2, r6, r1)
            com.instagram.nux.aymh.viewmodel.AymhViewModel r5 = r4.A01
            if (r5 == 0) goto L_0x0241
            android.os.Bundle r4 = r4.requireArguments()
            java.lang.Object r3 = r3.getValue()
            r1 = 1
            X.0qQ.A0B(r3, r1)
            X.6oS r1 = X.C318116oQ.A00(r5)
            r7 = 40
            X.MGh r2 = new X.MGh
            r2.<init>(r3, r4, r5, r6, r7)
            X.AnonymousClass7TE.A1Z(r2, r1)
            r1 = -661825892(0xffffffffd88d569c, float:-1.24322499E15)
            goto L_0x14b0
        L_0x0241:
            java.lang.String r8 = "aymhViewModel"
            goto L_0x0b40
        L_0x0245:
            r0 = -291068306(0xffffffffeea6a66e, float:-2.5787856E28)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.E3V r5 = (X.E3V) r5
            android.content.Context r1 = r5.getContext()
            java.lang.String r0 = "https://help.instagram.com/227486307449481"
            java.lang.String r0 = X.SQU.A01(r1, r0)
            android.content.Context r4 = r5.getContext()
            X.0aP r3 = r5.A01
            X.SFz r1 = new X.SFz
            r1.<init>((java.lang.String) r0)
            r0 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r0 = r5.getString(r0)
            X.Dba.A0q(r4, r3, r1, r0)
            r0 = 2043580060(0x79ce8e9c, float:1.340632E35)
            goto L_0x001d
        L_0x0274:
            r0 = -1924635783(0xffffffff8d486379, float:-6.1749494E-31)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r3.A01
            X.E36 r7 = (X.E36) r7
            X.E8r r5 = r7.A02
            r5.getClass()
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.List r0 = r5.A07
            java.util.Iterator r3 = r0.iterator()
        L_0x028e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02a4
            java.lang.Object r1 = r3.next()
            java.util.Set r0 = r5.A03
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x028e
            r4.add(r1)
            goto L_0x028e
        L_0x02a4:
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r4.iterator()
        L_0x02ac:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02b6
            X.DbY.A1W(r13, r1)
            goto L_0x02ac
        L_0x02b6:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x02d2
            X.E8r r0 = r7.A02
            java.util.List r0 = r0.A06
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            java.lang.Object r0 = X.AnonymousClass7TE.A13(r0)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r7.A03(r0)
        L_0x02cd:
            r0 = 2054631852(0x7a7731ac, float:3.208762E35)
            goto L_0x001d
        L_0x02d2:
            int r3 = r4.size()
            r5 = 1
            X.0aP r0 = r7.A00
            X.0wc r1 = X.AnonymousClass0kN.A01(r7, r0)
            if (r3 <= r5) goto L_0x0351
            java.lang.String r0 = "click_multiple_account_log_in"
        L_0x02e1:
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "log_in"
            X.1Q9 r0 = X.1Q9.A01(r0)
            java.lang.String r1 = r0.A05()
            java.lang.String r0 = "waterfall_id"
            r3.AAJ(r0, r1)
            X.DiE r12 = X.C46634DiE.A0v
            java.lang.String r0 = "multiple_users_recover"
            X.DbS.A1H(r3, r0)
            java.lang.String r1 = X.FH8.A00()
            java.lang.String r0 = "app_device_id"
            r3.AAJ(r0, r1)
            X.0aP r0 = r7.A00
            X.FH8.A0A(r3, r0)
            r3.Cgf()
            android.content.Context r6 = r7.requireContext()
            X.0aP r0 = r7.A00
            java.lang.String r1 = r7.A03
            java.lang.String r4 = r7.A04
            X.1NY r3 = X.DbU.A0N(r0)
            java.lang.String r0 = "accounts/account_recovery_nonce_login/"
            java.lang.String r0 = X.DbT.A0t(r6, r3, r0)
            X.DbU.A1O(r3, r0)
            java.lang.String r0 = "login_nonce"
            r3.A9m(r0, r1)
            java.lang.String r0 = ","
            java.lang.String r1 = android.text.TextUtils.join(r0, r13)
            java.lang.String r0 = "user_ids"
            r3.A9m(r0, r1)
            java.lang.String r0 = "recovery_handle_type"
            r3.A9m(r0, r4)
            X.DbW.A1D(r3)
            X.1OC r0 = X.DbT.A0U(r3, r5)
            X.0aP r9 = r7.A00
            X.Fdb r10 = r7.A01
            X.EM8 r6 = new X.EM8
            r8 = r7
            r11 = r7
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r0.A00 = r6
            r7.schedule(r0)
            goto L_0x02cd
        L_0x0351:
            java.lang.String r0 = "click_single_account_log_in"
            goto L_0x02e1
        L_0x0354:
            r0 = 516300343(0x1ec61e37, float:2.0976562E-20)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r3.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            java.lang.String r0 = "https://help.instagram.com/"
            android.net.Uri r0 = X.DbV.A07(r1, r0)
            X.0kR.A04(r0, r3)
            r0 = -1627503609(0xffffffff9efe4407, float:-2.6921432E-20)
            goto L_0x001d
        L_0x0371:
            r0 = -1692082067(0xffffffff9b24e06d, float:-1.3638278E-22)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.E54 r5 = (X.E54) r5
            java.lang.String r0 = X.E54.A0X
            X.EEM r0 = r5.A0A
            r0.A08()
            X.02m r0 = X.02m.A0p
            r4 = 725105460(0x2b383b34, float:6.545209E-13)
            r0.markerStart(r4)
            X.02m r3 = X.02m.A0p
            java.lang.String r1 = "flow"
            java.lang.String r0 = "prod"
            r3.markerAnnotate(r4, r1, r0)
            X.F23 r3 = r5.A0B
            android.widget.TextView r0 = r5.A05
            java.lang.String r1 = X.0nA.A0I(r0)
            r0 = 0
            r3.A00(r0, r1)
            r0 = 498520171(0x1db6d06b, float:4.83905E-21)
            goto L_0x001d
        L_0x03a5:
            r0 = 722777323(0x2b14b4eb, float:5.2831237E-13)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E54 r1 = (X.E54) r1
            r0 = 0
            X.E54.A02(r1, r0)
            r0 = 691752458(0x293b4e0a, float:4.159003E-14)
            goto L_0x001d
        L_0x03b9:
            r0 = 1023879710(0x3d072a1e, float:0.03299915)
            int r2 = X.AnonymousClass0fD.A05(r0)
            X.FV8 r6 = X.FV8.A00()
            java.lang.Object r1 = r3.A01
            X.E54 r1 = (X.E54) r1
            X.0aP r0 = r1.A06
            java.lang.String r5 = "ig_android_growth_fx_access_fb_ig_sso"
            java.lang.String r4 = "LoginLandingFragment"
            boolean r7 = r6.A04(r0, r5, r4)
            X.1Q0 r3 = X.1Q0.A0a
            X.0aP r0 = r1.A06
            X.FGI r6 = r3.A02(r0)
            X.DiE r3 = X.C46634DiE.A0t
            X.EXD r0 = X.EXD.A04
            X.FBm r3 = r6.A06(r0, r3)
            java.lang.String r0 = "has_facebook_session"
            r3.A05(r0, r7)
            boolean r0 = r1.A0I
            X.C49886FBm.A01(r3, r0)
            X.FBC r6 = X.FBC.A00
            X.0aP r3 = r1.A06
            java.lang.String r0 = "login"
            r6.A00(r3, r0)
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r1.A07
            X.0eM r0 = r0.A02
            java.lang.Object r0 = X.Dba.A0W(r0)
            r3 = 1
            if (r0 == 0) goto L_0x0429
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r1.A07
            X.0eM r0 = r0.A02
            java.lang.Object r0 = X.Dba.A0W(r0)
            int r0 = X.DbS.A05(r0)
            if (r0 <= r3) goto L_0x0429
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            X.0aP r0 = r1.A06
            X.6Yo r3 = X.DbY.A0J(r3, r0)
            android.os.Bundle r1 = r1.requireArguments()
            X.E3I r0 = new X.E3I
            r0.<init>()
            X.DbX.A18(r1, r0, r3)
        L_0x0424:
            r0 = -924486319(0xffffffffc8e57551, float:-469930.53)
            goto L_0x001d
        L_0x0429:
            java.lang.String r6 = "login_continue_button"
            if (r7 == 0) goto L_0x0473
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r1.A07
            java.lang.String r0 = r0.A02()
            if (r0 != 0) goto L_0x0446
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            X.F1U r0 = X.C49290EsZ.A00
            boolean r0 = r0.A00(r3)
            if (r0 == 0) goto L_0x0446
            r0 = -1227189222(0xffffffffb6da941a, float:-6.5141476E-6)
            goto L_0x001d
        L_0x0446:
            X.EEM r7 = r1.A0A
            X.0aP r10 = r1.A06
            X.FV8 r3 = X.FV8.A00()
            X.0aP r0 = r1.A06
            java.lang.String r11 = r3.A01(r0, r5, r4)
            X.FV8 r3 = X.FV8.A00()
            X.0aP r0 = r1.A06
            java.lang.String r12 = r3.A02(r0, r5, r4)
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r1.A07
            java.lang.String r13 = r0.A02()
            android.widget.TextView r0 = r1.A05
            X.3xQ r8 = X.C257443xP.A01(r0)
            X.3xQ r9 = X.C257443xP.A01(r6)
            r14 = 0
            r7.A0A(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0424
        L_0x0473:
            X.FXk r3 = X.C50305FXk.A03
            X.0aP r0 = r1.A06
            boolean r0 = r3.A00(r0, r4)
            if (r0 == 0) goto L_0x04ca
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r1.A07
            java.lang.String r0 = r0.A02()
            if (r0 != 0) goto L_0x0496
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            X.F1U r0 = X.C49290EsZ.A00
            boolean r0 = r0.A00(r3)
            if (r0 == 0) goto L_0x0496
            r0 = 1197163778(0x475b4502, float:56133.008)
            goto L_0x001d
        L_0x0496:
            X.0aP r0 = r1.A06
            boolean r0 = X.Dbc.A12(r0, r4)
            if (r0 == 0) goto L_0x04c7
            r9 = 0
        L_0x049f:
            X.0aP r0 = r1.A06
            boolean r0 = X.Dbc.A12(r0, r4)
            if (r0 != 0) goto L_0x0424
            java.lang.String r8 = X.C50305FXk.A00
            if (r8 == 0) goto L_0x0424
            if (r9 == 0) goto L_0x0424
            X.EEM r4 = r1.A0A
            X.0aP r7 = r1.A06
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r1.A07
            java.lang.String r10 = r0.A02()
            android.widget.TextView r0 = r1.A05
            X.3xQ r5 = X.C257443xP.A01(r0)
            X.3xQ r6 = X.C257443xP.A01(r6)
            r11 = 0
            r4.A0A(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0424
        L_0x04c7:
            java.lang.String r9 = X.C50305FXk.A02
            goto L_0x049f
        L_0x04ca:
            X.EEM r0 = r1.A0A
            r0.A07()
            goto L_0x0424
        L_0x04d1:
            r0 = 813608145(0x307eacd1, float:9.265025E-10)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            X.E54 r4 = (X.E54) r4
            X.0aP r1 = r4.A06
            java.lang.String r0 = "login"
            X.C49228ErX.A00(r1, r0)
            androidx.fragment.app.FragmentActivity r3 = r4.getActivity()
            if (r3 == 0) goto L_0x04f5
            android.view.Window r1 = r3.getWindow()
            r1.getClass()
            r0 = 8192(0x2000, float:1.14794E-41)
            r1.clearFlags(r0)
        L_0x04f5:
            android.app.Activity r1 = r4.getRootActivity()
            X.F1U r0 = X.C49290EsZ.A00
            boolean r0 = r0.A00(r1)
            if (r0 == 0) goto L_0x0506
            r0 = -519244291(0xffffffffe10cf5fd, float:-1.6251684E20)
            goto L_0x001d
        L_0x0506:
            boolean r0 = r3 instanceof X.G8D
            if (r0 == 0) goto L_0x0533
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            X.0aP r0 = r4.A06
            X.6Yo r3 = X.DbS.A0M(r1, r0)
            X.DbW.A0X()
            android.os.Bundle r1 = r4.requireArguments()
            java.lang.String r0 = "IgSessionManager.LOGGED_OUT_TOKEN"
            X.DbS.A1A(r1, r0)
            X.E3Y r0 = new X.E3Y
            r0.<init>()
            r0.setArguments(r1)
        L_0x0528:
            r3.A0E(r0)
            r3.A04()
        L_0x052e:
            r0 = 308907052(0x12698c2c, float:7.369461E-28)
            goto L_0x001d
        L_0x0533:
            X.0aP r0 = r4.A06
            boolean r0 = X.FCQ.A02(r0)
            if (r0 == 0) goto L_0x0579
            X.FEr r0 = X.C49917FEr.A00()
            java.lang.Integer r0 = r0.A05
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            if (r0 == r1) goto L_0x0560
            X.FEw r0 = X.C49921FEw.A00()
            java.lang.Integer r0 = r0.A01()
            if (r0 == r1) goto L_0x0560
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            X.0aP r0 = r4.A06
            X.6Yo r3 = X.DbS.A0M(r1, r0)
            android.os.Bundle r0 = r4.mArguments
            X.E59 r0 = X.C49793F7b.A01(r0)
            goto L_0x0528
        L_0x0560:
            X.DbT.A15()
            android.os.Bundle r0 = r4.mArguments
            X.DbU.A1C(r0)
            X.E3n r1 = new X.E3n
            r1.<init>()
            r1.setArguments(r0)
            X.0hq r0 = r4.mFragmentManager
            r0.getClass()
            X.Dbc.A0T(r1, r0)
            goto L_0x052e
        L_0x0579:
            boolean r0 = X.AnonymousClass1G3.A03()
            if (r0 == 0) goto L_0x0598
            boolean r0 = r4.A0L
            if (r0 == 0) goto L_0x0598
            X.0hq r3 = r4.mFragmentManager
            X.DbT.A15()
            android.os.Bundle r0 = r4.mArguments
            X.E3s r1 = new X.E3s
            r1.<init>()
            r1.setArguments(r0)
            java.lang.String r0 = "android.nux.FacebookLandingFragment"
            X.C49958FGq.A07(r1, r3, r0)
            goto L_0x052e
        L_0x0598:
            X.F3M r0 = r4.A09
            r0.A01()
            goto L_0x052e
        L_0x059e:
            r0 = -1666979664(0xffffffff9ca3e8b0, float:-1.0846583E-21)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r3.A01
            X.E2t r7 = (X.C47447E2t) r7
            X.FBf r4 = X.C49881FBf.A00
            X.0eM r0 = r7.A0E
            X.0lg r3 = X.DbT.A0X(r0)
            java.lang.String r1 = "nux_interest_picker"
            r0 = 0
            r4.A00(r3, r0, r1)
            r0 = 1
            r7.A06 = r0
            java.util.HashMap r0 = r7.A0B
            java.util.Iterator r6 = X.AnonymousClass7TF.A0s(r0)
        L_0x05c0:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x05f8
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r6)
            java.lang.Object r0 = r1.getKey()
            long r3 = X.AnonymousClass7TE.A0R(r0)
            java.lang.Object r0 = r1.getValue()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            X.C47447E2t.A00(r7, r3, r0)
            if (r0 == 0) goto L_0x05f5
            java.lang.String r5 = "select"
        L_0x05e1:
            java.util.HashMap r1 = r7.A0C
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.String r1 = X.DbS.A0r(r0, r1)
            if (r1 == 0) goto L_0x05c0
            java.lang.String r0 = java.lang.String.valueOf(r3)
            r7.A01(r5, r1, r0)
            goto L_0x05c0
        L_0x05f5:
            java.lang.String r5 = "unselect"
            goto L_0x05e1
        L_0x05f8:
            X.G8t r1 = r7.A03
            if (r1 == 0) goto L_0x0605
            int r0 = r7.A00
            boolean r0 = X.AnonymousClass7TF.A1R(r0)
            r1.Cm0(r0)
        L_0x0605:
            r0 = -88421970(0xfffffffffabac9ae, float:-4.849289E35)
            goto L_0x001d
        L_0x060a:
            r0 = -237440549(0xfffffffff1d8f1db, float:-2.1485167E30)
            int r2 = X.AnonymousClass0fD.A05(r0)
            X.FV8 r5 = X.FV8.A00()
            java.lang.Object r1 = r3.A01
            X.E3s r1 = (X.E3s) r1
            X.0aP r0 = r1.A05
            java.lang.String r6 = "ig_android_growth_fx_access_fb_ig_sso"
            java.lang.String r4 = "FacebookLandingFragment"
            boolean r7 = r5.A04(r0, r6, r4)
            X.1Q0 r3 = X.1Q0.A0a
            X.0aP r0 = r1.A05
            X.FGI r5 = r3.A02(r0)
            X.DiE r3 = X.C46634DiE.A0r
            X.EXD r0 = X.EXD.A04
            X.FBm r3 = r5.A06(r0, r3)
            java.lang.String r0 = "has_facebook_session"
            r3.A05(r0, r7)
            boolean r0 = r1.A09
            X.C49886FBm.A01(r3, r0)
            X.FBC r5 = X.FBC.A00
            X.0aP r3 = r1.A05
            java.lang.String r0 = "landing"
            r5.A00(r3, r0)
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r1.A06
            X.0eM r0 = r0.A02
            java.lang.Object r0 = X.Dba.A0W(r0)
            if (r0 == 0) goto L_0x067a
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r1.A06
            X.0eM r0 = r0.A02
            java.lang.Object r0 = X.Dba.A0W(r0)
            int r3 = X.DbS.A05(r0)
            r0 = 1
            if (r3 <= r0) goto L_0x067a
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            X.0aP r0 = r1.A05
            X.6Yo r3 = X.DbY.A0J(r3, r0)
            android.os.Bundle r1 = r1.requireArguments()
            X.E3I r0 = new X.E3I
            r0.<init>()
            X.DbX.A18(r1, r0, r3)
        L_0x0675:
            r0 = -1531340161(0xffffffffa4b99a7f, float:-8.049269E-17)
            goto L_0x001d
        L_0x067a:
            java.lang.String r5 = "sign_up_continue_button"
            if (r7 == 0) goto L_0x06a7
            X.EEM r7 = r1.A08
            X.0aP r10 = r1.A05
            X.FV8 r3 = X.FV8.A00()
            X.0aP r0 = r1.A05
            java.lang.String r11 = r3.A01(r0, r6, r4)
            X.FV8 r3 = X.FV8.A00()
            X.0aP r0 = r1.A05
            java.lang.String r12 = r3.A02(r0, r6, r4)
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r1.A06
            java.lang.String r13 = r0.A02()
            X.48z r8 = X.C2612848z.A00
            X.3xQ r9 = X.C257443xP.A01(r5)
            r14 = 0
            r7.A0A(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0675
        L_0x06a7:
            X.FXk r3 = X.C50305FXk.A03
            X.0aP r0 = r1.A05
            boolean r0 = r3.A00(r0, r4)
            if (r0 == 0) goto L_0x06e2
            X.0aP r0 = r1.A05
            boolean r0 = X.Dbc.A12(r0, r4)
            if (r0 == 0) goto L_0x06df
            r7 = 0
        L_0x06ba:
            X.0aP r0 = r1.A05
            boolean r0 = X.Dbc.A12(r0, r4)
            if (r0 == 0) goto L_0x06dc
            r8 = 0
        L_0x06c3:
            if (r7 == 0) goto L_0x0675
            if (r8 == 0) goto L_0x0675
            X.EEM r3 = r1.A08
            X.0aP r6 = r1.A05
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r1.A06
            java.lang.String r9 = r0.A02()
            X.48z r4 = X.C2612848z.A00
            X.3xQ r5 = X.C257443xP.A01(r5)
            r10 = 0
            r3.A0A(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0675
        L_0x06dc:
            java.lang.String r8 = X.C50305FXk.A02
            goto L_0x06c3
        L_0x06df:
            java.lang.String r7 = X.C50305FXk.A00
            goto L_0x06ba
        L_0x06e2:
            X.EEM r0 = r1.A08
            r0.A07()
            goto L_0x0675
        L_0x06e8:
            r0 = 1059562785(0x3f27a521, float:0.6548634)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            X.E3s r4 = (X.E3s) r4
            X.0aP r3 = r4.A05
            java.lang.String r1 = "landing"
            r0 = 0
            X.0qQ.A0B(r3, r0)
            r0 = 0
            X.C49227ErW.A00(r3, r0, r1)
            X.0hq r3 = r4.mFragmentManager
            X.DbT.A15()
            android.os.Bundle r0 = r4.mArguments
            X.E54 r1 = new X.E54
            r1.<init>()
            r1.setArguments(r0)
            java.lang.String r0 = "android.nux.LoginLandingFragment"
            X.C49958FGq.A07(r1, r3, r0)
            r0 = -915068854(0xffffffffc975284a, float:-1004164.6)
            goto L_0x001d
        L_0x0718:
            r0 = -1650011285(0xffffffff9da6d36b, float:-4.4158435E-21)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r3.A01
            X.E3s r3 = (X.E3s) r3
            X.0aP r1 = r3.A05
            java.lang.String r0 = "landing"
            X.C49207ErC.A00(r1, r0)
            X.F3M r0 = r3.A07
            r0.A01()
            r0 = -1826610032(0xffffffff93202490, float:-2.0212866E-27)
            goto L_0x001d
        L_0x0734:
            java.lang.Object r3 = r3.A01
            X.E0R r3 = (X.E0R) r3
            X.1Q0 r1 = X.1Q0.A09
            X.0aP r0 = r3.A00
            X.FGI r2 = r1.A02(r0)
            X.DiE r1 = X.C46634DiE.A09
            X.EXD r0 = r3.A02
            X.FGI.A02(r2, r0, r1)
            X.0hq r1 = r3.mFragmentManager
            if (r1 == 0) goto L_0x0020
            int r0 = r1.A0M()
            if (r0 <= 0) goto L_0x0020
            r1.A13()
            return
        L_0x0755:
            r0 = 1424782620(0x54ec751c, float:8.1246164E12)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.lang.Object r0 = r3.A01
            X.E7Q r0 = (X.E7Q) r0
            java.util.LinkedHashSet r9 = r0.A0Q
            r1.addAll(r9)
            java.util.HashSet r6 = r0.A0O
            r1.addAll(r6)
            X.FGz r3 = X.C49966FGz.A00
            X.0eM r4 = r0.A0R
            r29 = r4
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r29)
            boolean r16 = r3.A09(r4, r1)
            r13 = r16 ^ 1
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r6)
            java.util.Iterator r5 = r6.iterator()
        L_0x0786:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x0790
            X.DbY.A1W(r8, r5)
            goto L_0x0786
        L_0x0790:
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r9)
            java.util.Iterator r5 = r9.iterator()
        L_0x0798:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x07a2
            X.DbY.A1W(r7, r5)
            goto L_0x0798
        L_0x07a2:
            java.util.ArrayList r8 = X.00k.A0S(r7, r8)
            boolean r4 = r8.isEmpty()
            r7 = 1
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x0899
            X.1vn r5 = X.Dba.A0G(r29)
            X.2IV r12 = new X.2IV
            r12.<init>()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r7)
            java.lang.String r4 = "request_from_nux"
            r12.A08(r4, r10)
            java.lang.String r4 = "user_ids"
            r12.A05(r4, r8)
            java.lang.String r10 = X.DbS.A0k()
            if (r10 == 0) goto L_0x07d1
            java.lang.String r4 = "nav_chain"
            r12.A09(r10, r4)
        L_0x07d1:
            r24 = 0
            X.2IS r11 = X.C41845B3m.A04()
            X.2IS r10 = X.C41845B3m.A04()
            java.lang.String r4 = "data"
            r11.A00(r12, r4)
            X.1vR r18 = X.C41845B3m.A05()
            java.util.Map r20 = r11.getParamsCopy()
            java.util.Map r21 = r10.getParamsCopy()
            java.lang.Class<X.Bxq> r22 = X.C43414Bxq.class
            java.util.ArrayList r28 = X.AnonymousClass7TE.A1C()
            java.lang.String r19 = "FriendshipBulkFollowRequest"
            r25 = 0
            java.lang.String r27 = "xdt_create_many"
            com.facebook.pando.PandoGraphQLRequest r4 = new com.facebook.pando.PandoGraphQLRequest
            r17 = r4
            r23 = r7
            r26 = r24
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.FSY r11 = X.FSY.A00
            X.FS1 r10 = X.FS1.A00
            r5.ATL(r10, r11, r4)
            if (r13 == 0) goto L_0x0828
            r4 = 2131961021(0x7f1324bd, float:1.9558727E38)
            java.lang.String r5 = X.DbU.A0m(r0, r4)
            r4 = 2131961022(0x7f1324be, float:1.955873E38)
            java.lang.String r4 = X.DbU.A0m(r0, r4)
            android.os.Handler r11 = X.AnonymousClass7TF.A0D()
            X.FtC r10 = new X.FtC
            r10.<init>(r5, r4)
            r4 = 100
            r11.postDelayed(r10, r4)
        L_0x0828:
            java.util.HashSet r4 = r0.A0D
            java.util.Set r4 = X.00k.A0l(r4, r6)
            int r4 = r4.size()
            int r12 = r6.size()
            int r12 = r12 - r4
            X.0lg r10 = X.DbT.A0X(r29)
            X.0iw r5 = r0.A04
            if (r5 == 0) goto L_0x093b
            X.0wc r13 = X.AnonymousClass0kN.A01(r5, r10)
            java.lang.String r10 = "batch_follow_button_tapped"
            X.0kJ r5 = r13.A00
            X.0Aj r14 = r13.A00(r5, r10)
            java.lang.String r11 = "discover_people_nux_quick_friending"
            java.lang.String r10 = "module"
            r14.AAJ(r10, r11)
            int r8 = r8.size()
            java.lang.Long r15 = X.DbS.A0j(r8)
            java.lang.String r8 = "num_requests"
            r14.A9F(r8, r15)
            r14.Cgf()
            java.lang.String r14 = "batch_follow_button_tapped_search_selection_count"
            X.0Aj r14 = r13.A00(r5, r14)
            r14.AAJ(r10, r11)
            int r9 = r9.size()
            java.lang.Long r9 = X.DbS.A0j(r9)
            r14.A9F(r8, r9)
            r14.Cgf()
            java.lang.String r9 = "batch_follow_button_tapped_preselected_count"
            X.0Aj r9 = r13.A00(r5, r9)
            java.lang.Long r4 = X.DbV.A0p(r9, r10, r11, r4)
            r9.A9F(r8, r4)
            r9.Cgf()
            java.lang.String r4 = "batch_follow_button_tapped_nonpreselected_count"
            X.0Aj r5 = r13.A00(r5, r4)
            java.lang.Long r4 = X.DbV.A0p(r5, r10, r11, r12)
            r5.A9F(r8, r4)
            r5.Cgf()
        L_0x0899:
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r6)
            java.util.Iterator r5 = r6.iterator()
        L_0x08a1:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x08b3
            com.instagram.user.model.User r4 = X.DbT.A0k(r5)
            java.lang.String r4 = r4.getUsername()
            r8.add(r4)
            goto L_0x08a1
        L_0x08b3:
            boolean r4 = X.AnonymousClass7TE.A1b(r8)
            if (r4 == 0) goto L_0x08f6
            java.util.Iterator r8 = r8.iterator()
        L_0x08bd:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x08f6
            java.lang.Object r6 = r8.next()
            java.util.HashMap r4 = r0.A0N
            java.lang.Object r5 = r4.get(r6)
            X.Dt4 r5 = (X.C47217Dt4) r5
            java.util.HashMap r4 = r0.A0M
            java.lang.Object r4 = r4.get(r6)
            java.lang.Number r4 = (java.lang.Number) r4
            if (r5 == 0) goto L_0x08bd
            if (r4 == 0) goto L_0x08bd
            int r4 = r4.intValue()
            X.6KM r6 = X.E7Q.A00(r5, r4)
            if (r6 == 0) goto L_0x08bd
            X.2om r5 = r0.A0C
            if (r5 != 0) goto L_0x08ed
            java.lang.String r8 = "recommendedUserLogger"
            goto L_0x0b40
        L_0x08ed:
            X.6KN r4 = new X.6KN
            r4.<init>(r6)
            r5.A08(r4)
            goto L_0x08bd
        L_0x08f6:
            X.FBf r8 = X.C49881FBf.A00
            X.0lg r6 = X.DbT.A0X(r29)
            java.lang.String r5 = r0.A0K
            r4 = 0
            r8.A00(r6, r4, r5)
            if (r16 == 0) goto L_0x0933
            X.Fc5 r9 = new X.Fc5
            r9.<init>(r0)
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r29)
            X.0iw r7 = r0.A04
            if (r7 == 0) goto L_0x093b
            androidx.fragment.app.FragmentActivity r5 = r0.requireActivity()
            android.content.Context r6 = r0.requireContext()
            r4 = 0
            X.0qQ.A0B(r8, r4)
            boolean r3 = r3.A09(r8, r1)
            if (r3 == 0) goto L_0x0927
            r10 = r1
            X.C49966FGz.A01(r5, r6, r7, r8, r9, r10)
        L_0x0927:
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r0.A0A
            if (r0 == 0) goto L_0x092e
            r0.setEnabled(r4)
        L_0x092e:
            r0 = 1606619702(0x5fc31236, float:2.8112714E19)
            goto L_0x001d
        L_0x0933:
            X.G8t r0 = r0.A06
            if (r0 == 0) goto L_0x092e
            r0.Cm0(r7)
            goto L_0x092e
        L_0x093b:
            java.lang.String r8 = "analyticsModule"
            goto L_0x0b40
        L_0x093f:
            r0 = 1058639519(0x3f198e9f, float:0.5998325)
            int r2 = X.AnonymousClass0fD.A05(r0)
            X.FV8 r5 = X.FV8.A00()
            java.lang.Object r1 = r3.A01
            X.E3Y r1 = (X.E3Y) r1
            X.0aP r0 = r1.A05
            java.lang.String r6 = "ig_android_growth_fx_access_fb_ig_sso"
            java.lang.String r4 = "ContactPointTriageFragment"
            boolean r7 = r5.A04(r0, r6, r4)
            X.1Q0 r3 = X.1Q0.A0a
            X.0aP r0 = r1.A05
            X.FGI r5 = r3.A02(r0)
            X.DiE r3 = r1.BzS()
            X.EXD r0 = r1.B6Y()
            X.FBm r3 = r5.A06(r0, r3)
            java.lang.String r0 = "has_facebook_session"
            r3.A05(r0, r7)
            boolean r0 = r1.A0U
            X.C49886FBm.A01(r3, r0)
            X.FBC r5 = X.FBC.A00
            X.0aP r3 = r1.A05
            X.DiE r0 = r1.BzS()
            java.lang.String r0 = r0.A01
            r5.A00(r3, r0)
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r1.A07
            X.0eM r0 = r0.A02
            java.lang.Object r0 = X.Dba.A0W(r0)
            if (r0 == 0) goto L_0x09b7
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r1.A07
            X.0eM r0 = r0.A02
            java.lang.Object r0 = X.Dba.A0W(r0)
            int r3 = X.DbS.A05(r0)
            r0 = 1
            if (r3 <= r0) goto L_0x09b7
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            X.0aP r0 = r1.A05
            X.6Yo r3 = X.DbY.A0J(r3, r0)
            android.os.Bundle r1 = r1.requireArguments()
            X.E3I r0 = new X.E3I
            r0.<init>()
            X.DbX.A18(r1, r0, r3)
        L_0x09b2:
            r0 = -1757000934(0xffffffff97464b1a, float:-6.407204E-25)
            goto L_0x001d
        L_0x09b7:
            java.lang.String r5 = "sign_up_with_cp_continue_button"
            if (r7 == 0) goto L_0x09e4
            X.EEM r7 = r1.A0B
            X.0aP r10 = r1.A05
            X.FV8 r3 = X.FV8.A00()
            X.0aP r0 = r1.A05
            java.lang.String r11 = r3.A01(r0, r6, r4)
            X.FV8 r3 = X.FV8.A00()
            X.0aP r0 = r1.A05
            java.lang.String r12 = r3.A02(r0, r6, r4)
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r1.A07
            java.lang.String r13 = r0.A02()
            X.48z r8 = X.C2612848z.A00
            X.3xQ r9 = X.C257443xP.A01(r5)
            r14 = 0
            r7.A0A(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x09b2
        L_0x09e4:
            X.FXk r3 = X.C50305FXk.A03
            X.0aP r0 = r1.A05
            boolean r0 = r3.A00(r0, r4)
            if (r0 == 0) goto L_0x0a1d
            X.0aP r0 = r1.A05
            boolean r0 = X.Dbc.A12(r0, r4)
            if (r0 == 0) goto L_0x0a1a
            r8 = 0
        L_0x09f7:
            X.0aP r0 = r1.A05
            boolean r0 = X.Dbc.A12(r0, r4)
            if (r0 != 0) goto L_0x09b2
            java.lang.String r7 = X.C50305FXk.A00
            if (r7 == 0) goto L_0x09b2
            if (r8 == 0) goto L_0x09b2
            X.EEM r3 = r1.A0B
            X.0aP r6 = r1.A05
            com.instagram.fx.access.sso.FxSsoViewModel r0 = r1.A07
            java.lang.String r9 = r0.A02()
            X.48z r4 = X.C2612848z.A00
            X.3xQ r5 = X.C257443xP.A01(r5)
            r10 = 0
            r3.A0A(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x09b2
        L_0x0a1a:
            java.lang.String r8 = X.C50305FXk.A02
            goto L_0x09f7
        L_0x0a1d:
            X.EEM r0 = r1.A0B
            r0.A07()
            goto L_0x09b2
        L_0x0a23:
            r0 = -925138180(0xffffffffc8db82fc, float:-449559.88)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r3.A01
            X.E5h r3 = (X.C47502E5h) r3
            long r6 = java.lang.System.currentTimeMillis()
            long r0 = r3.A00
            long r6 = r6 - r0
            r4 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0a70
            X.0eM r0 = r3.A08
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            android.os.Bundle r1 = r3.mArguments
            if (r1 == 0) goto L_0x0a6e
            java.lang.String r0 = "nux_contact_point"
            java.lang.String r6 = r1.getString(r0)
        L_0x0a4c:
            r9 = 0
            java.lang.String r7 = X.Dbb.A0a(r3)
            X.0qv r1 = X.0qv.A02
            android.content.Context r0 = r3.requireContext()
            java.lang.String r8 = r1.A05(r0)
            X.Ff8 r5 = new X.Ff8
            r5.<init>(r3)
            X.C49024Eo0.A00(r4, r5, r6, r7, r8, r9)
            long r0 = java.lang.System.currentTimeMillis()
            r3.A00 = r0
        L_0x0a69:
            r0 = 694695287(0x29683577, float:5.1560722E-14)
            goto L_0x001d
        L_0x0a6e:
            r6 = 0
            goto L_0x0a4c
        L_0x0a70:
            r0 = 2131976736(0x7f136220, float:1.95906E38)
            X.C47502E5h.A00(r3, r0)
            goto L_0x0a69
        L_0x0a77:
            r0 = -1318024262(0xffffffffb1708bba, float:-3.5004022E-9)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            X.E2z r4 = (X.C47453E2z) r4
            X.Dkv r0 = r4.A02
            java.lang.String r8 = "suggestionsViewModel"
            r10 = 0
            if (r0 == 0) goto L_0x0b40
            X.05G r0 = r0.A01
            boolean r0 = X.DbX.A1b(r0)
            r6 = 1
            if (r0 == 0) goto L_0x0afd
            X.0eM r0 = r4.A0B
            X.0lg r3 = X.DbT.A0X(r0)
            r0 = 36323096768228182(0x810baa00032b56, double:3.034210885373878E-306)
            X.1AA r5 = X.182.A02(r3, r0)
            if (r5 == 0) goto L_0x0afd
            X.0Tu r3 = X.0Tu.A04
            boolean r0 = r5.Ah0(r3, r0)
            if (r0 != r6) goto L_0x0afd
        L_0x0aab:
            X.Ewd r7 = r4.A04
            if (r7 == 0) goto L_0x0aff
            X.0eM r0 = r4.A0B
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            if (r6 == 0) goto L_0x0ac4
            X.Dkv r1 = r4.A02
            if (r1 == 0) goto L_0x0b40
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.EBd r10 = new X.EBd
            r10.<init>(r0, r1)
        L_0x0ac4:
            r0 = 2
            X.0qQ.A0B(r5, r0)
            X.6cm r3 = new X.6cm
            r3.<init>(r4, r5)
            X.EVs r0 = r7.A01
            java.lang.String r1 = r0.A00
            r11 = 0
            r15 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)
            r3.A02(r0, r11, r1, r11)
            X.FGL r9 = new X.FGL
            r16 = r9
            r17 = r4
            r18 = r4
            r19 = r5
            r20 = r11
            r21 = r7
            r16.<init>(r17, r18, r19, r20, r21)
            X.EX9 r0 = r7.A00
            java.lang.String r13 = r0.toString()
            r12 = r11
            r14 = r11
            r16 = r15
            r9.A04(r10, r11, r12, r13, r14, r15, r16)
        L_0x0af8:
            r0 = 104694891(0x63d846b, float:3.5644235E-35)
            goto L_0x001d
        L_0x0afd:
            r6 = 0
            goto L_0x0aab
        L_0x0aff:
            X.G8t r7 = r4.A03
            if (r7 == 0) goto L_0x0af8
            X.0eM r5 = r4.A0B
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            X.6cm r3 = new X.6cm
            r3.<init>(r4, r0)
            java.lang.String r1 = r4.A06
            if (r1 != 0) goto L_0x0b18
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x0b5e
            java.lang.String r1 = "no_skip"
        L_0x0b18:
            r11 = 0
            r15 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)
            r3.A02(r0, r10, r1, r10)
            com.instagram.common.session.UserSession r19 = X.AnonymousClass7TE.A0l(r5)
            X.FGL r9 = new X.FGL
            r16 = r9
            r17 = r4
            r18 = r4
            r20 = r7
            r21 = r10
            r16.<init>(r17, r18, r19, r20, r21)
            X.EX9 r0 = X.EX9.CI_NUX_STEP
            java.lang.String r13 = r0.toString()
            java.lang.String r14 = r4.A07
            if (r14 != 0) goto L_0x0b48
            java.lang.String r8 = "registrationFlow"
        L_0x0b40:
            X.0qQ.A0F(r8)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0b48:
            if (r6 == 0) goto L_0x0b57
            X.Dkv r1 = r4.A02
            if (r1 == 0) goto L_0x0b40
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            X.EBd r10 = new X.EBd
            r10.<init>(r0, r1)
        L_0x0b57:
            r12 = r11
            r16 = r15
            r9.A04(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0af8
        L_0x0b5e:
            java.lang.String r1 = "legacy"
            goto L_0x0b18
        L_0x0b61:
            r0 = 386945117(0x1710505d, float:4.663034E-25)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r10 = r3.A01
            X.E2z r10 = (X.C47453E2z) r10
            X.0eM r0 = r10.A0B
            X.0lg r9 = X.DbT.A0X(r0)
            java.lang.String r8 = "find_friends_addressbook"
            double r5 = X.Dbb.A00(r9)
            double r3 = X.DbS.A00()
            X.0wc r1 = X.AnonymousClass0kN.A02(r9)
            java.lang.String r0 = "close_button_tapped"
            X.0Aj r7 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r7.isSampled()
            if (r0 == 0) goto L_0x0bb1
            X.DbY.A1D(r7, r5, r3)
            r0 = 0
            X.0qQ.A0B(r9, r0)
            java.lang.String r0 = X.DbZ.A0m(r9)
            if (r0 != 0) goto L_0x0b9b
            java.lang.String r0 = ""
        L_0x0b9b:
            X.DbS.A1L(r7, r0)
            X.DbZ.A1J(r7, r8)
            X.DbW.A13(r7, r5)
            java.lang.String r1 = "waterfall_log_in"
            java.lang.String r0 = "module"
            X.DbY.A1I(r7, r0, r1, r3)
            X.FH8.A05(r7)
            r7.Cgf()
        L_0x0bb1:
            X.G8t r0 = r10.A03
            if (r0 == 0) goto L_0x0bb8
            r0.ATY()
        L_0x0bb8:
            r0 = -543279126(0xffffffffdf9e37ea, float:-2.2801677E19)
            goto L_0x001d
        L_0x0bbd:
            r0 = 1990890210(0x76aa92e2, float:1.7298234E33)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r3.A01
            X.E6s r8 = (X.C47531E6s) r8
            com.instagram.common.session.UserSession r11 = r8.getSession()
            java.lang.String r10 = "nux_account_privacy"
            r7 = 0
            X.0qQ.A0B(r11, r7)
            r6 = 1
            double r3 = X.DbS.A01()
            double r0 = X.DbS.A00()
            X.0wc r9 = X.AnonymousClass0kN.A02(r11)
            java.lang.String r5 = "public_account_tapped"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r9, r5)
            X.DbZ.A1E(r5)
            X.Dbc.A0X(r5, r3, r0)
            X.DbS.A1H(r5, r10)
            X.FH8.A08(r5, r11)
            com.instagram.common.session.UserSession r5 = r8.getSession()
            com.instagram.common.session.UserSession r0 = r8.getSession()
            java.lang.String r4 = r0.A06
            X.0qQ.A0B(r5, r7)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)
            java.lang.String r1 = "android_pbd_nux_select_option"
            r0 = 0
            X.C49214ErJ.A00(r5, r3, r0, r4, r1)
            android.widget.RadioButton r0 = r8.A01
            if (r0 == 0) goto L_0x0c0f
            r0.setChecked(r6)
        L_0x0c0f:
            android.widget.RadioButton r0 = r8.A00
            if (r0 == 0) goto L_0x0c16
            r0.setChecked(r7)
        L_0x0c16:
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r8.A02
            if (r0 == 0) goto L_0x0c1d
            r0.setEnabled(r6)
        L_0x0c1d:
            r0 = -1935961187(0xffffffff8c9b939d, float:-2.3970373E-31)
            goto L_0x001d
        L_0x0c22:
            r0 = 71012924(0x43b923c, float:2.2048892E-36)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r3.A01
            X.E6s r8 = (X.C47531E6s) r8
            com.instagram.common.session.UserSession r11 = r8.getSession()
            java.lang.String r10 = "nux_account_privacy"
            r7 = 0
            X.0qQ.A0B(r11, r7)
            r6 = 1
            double r3 = X.DbS.A01()
            double r0 = X.DbS.A00()
            X.0wc r9 = X.AnonymousClass0kN.A02(r11)
            java.lang.String r5 = "private_account_tapped"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r9, r5)
            X.DbZ.A1E(r5)
            X.Dbc.A0X(r5, r3, r0)
            X.DbS.A1H(r5, r10)
            X.FH8.A08(r5, r11)
            com.instagram.common.session.UserSession r5 = r8.getSession()
            com.instagram.common.session.UserSession r0 = r8.getSession()
            java.lang.String r4 = r0.A06
            X.0qQ.A0B(r5, r7)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
            java.lang.String r1 = "android_pbd_nux_select_option"
            r0 = 0
            X.C49214ErJ.A00(r5, r3, r0, r4, r1)
            android.widget.RadioButton r0 = r8.A00
            if (r0 == 0) goto L_0x0c74
            r0.setChecked(r6)
        L_0x0c74:
            android.widget.RadioButton r0 = r8.A01
            if (r0 == 0) goto L_0x0c7b
            r0.setChecked(r7)
        L_0x0c7b:
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r8.A02
            if (r0 == 0) goto L_0x0c82
            r0.setEnabled(r6)
        L_0x0c82:
            r0 = -1171620536(0xffffffffba2a7d48, float:-6.503654E-4)
            goto L_0x001d
        L_0x0c87:
            r0 = 2085917459(0x7c549313, float:4.4149998E36)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.E3c r5 = (X.E3c) r5
            com.instagram.registration.model.RegFlowExtras r0 = r5.A02
            java.util.List r0 = r0.A0e
            if (r0 == 0) goto L_0x0c9e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0cd2
        L_0x0c9e:
            com.instagram.registration.model.RegFlowExtras r0 = r5.A02
            java.util.List r0 = X.Dbb.A0g(r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0cd2
            X.DbT.A15()
            com.instagram.registration.model.RegFlowExtras r1 = r5.A02
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "RegFlowExtras.EXTRA_KEY"
            r4.putParcelable(r0, r1)
            X.DbU.A1C(r4)
            X.E3a r3 = new X.E3a
            r3.<init>()
        L_0x0cc0:
            androidx.fragment.app.FragmentActivity r1 = X.DbU.A0I(r4, r3, r5)
            X.0aP r0 = r5.A00
            X.6Yo r0 = X.DbS.A0M(r1, r0)
            X.Dba.A13(r3, r0)
            r0 = 239840269(0xe4bac0d, float:2.5104521E-30)
            goto L_0x001d
        L_0x0cd2:
            X.DbT.A15()
            com.instagram.registration.model.RegFlowExtras r1 = r5.A02
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "RegFlowExtras.EXTRA_KEY"
            r4.putParcelable(r0, r1)
            X.DbU.A1C(r4)
            X.E3W r3 = new X.E3W
            r3.<init>()
            goto L_0x0cc0
        L_0x0ce9:
            r0 = 1901083840(0x71503cc0, float:1.0311412E30)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            X.ENo r4 = (X.C47937ENo) r4
            int r3 = r4.A02
            int r1 = r4.A01
            int r0 = r4.A00
            int r1 = X.FFM.A00(r3, r1, r0)
            r0 = 4
            if (r1 <= r0) goto L_0x0d13
            int r5 = r4.A02
            int r0 = r4.A01
            int r3 = r0 + 1
            int r1 = r4.A00
            X.1P0 r0 = r4.A0B
            r4.A02(r0, r5, r3, r1)
        L_0x0d0e:
            r0 = 1876740380(0x6fdcc91c, float:1.3665966E29)
            goto L_0x001d
        L_0x0d13:
            java.lang.String r0 = "dob_invalid_age_submitted"
            X.0xI r6 = X.0xI.A00(r4, r0)
            java.util.Calendar r5 = java.util.Calendar.getInstance()
            int r3 = r4.A02
            int r1 = r4.A01
            int r0 = r4.A00
            r5.set(r3, r1, r0)
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r0 = "yyyy-MM-dd"
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r0, r3)
            java.util.Date r0 = r5.getTime()
            java.lang.String r1 = r1.format(r0)
            java.lang.String r0 = "date"
            r6.A0C(r0, r1)
            X.0aP r0 = r4.A00
            X.DbU.A1R(r6, r0)
            X.8ab r1 = X.Dba.A0H(r4)
            r0 = 2131952273(0x7f130291, float:1.9540984E38)
            r1.A09(r0)
            r0 = 2131952274(0x7f130292, float:1.9540986E38)
            r1.A08(r0)
            r0 = 0
            r1.A0r(r0)
            r0 = 56
            X.FJf r0 = X.C50020FJf.A00(r4, r0)
            r1.A0E(r0)
            X.DbT.A1V(r1)
            goto L_0x0d0e
        L_0x0d62:
            r0 = -32937400(0xfffffffffe096a48, float:-4.566402E37)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r3.A01
            X.E3o r3 = (X.C47466E3o) r3
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x0d81
            X.0wW r4 = r3.A00
            X.EVV r0 = X.EVV.IG_SAC_SIGN_UP
            java.lang.String r1 = r0.toString()
            X.AnonymousClass7TG.A1N(r4, r1)
            java.lang.String r0 = "link_accounts_button_pressed"
            X.FG9.A00(r4, r0, r1)
        L_0x0d81:
            X.FBf r4 = X.C49881FBf.A00
            X.0wW r1 = r3.getSession()
            X.DiE r0 = r3.A02()
            java.lang.String r0 = r0.A01
            r4.A02(r1, r0)
            com.instagram.nux.cal.model.ConnectContent r0 = r3.A02
            com.instagram.nux.cal.model.FXCalAgeRestrictionScreenContent r1 = r0.A01
            if (r1 == 0) goto L_0x0e19
            com.instagram.nux.cal.model.FXCalAgeInfo r4 = r1.A01
            if (r4 == 0) goto L_0x0e19
            java.lang.String r0 = r1.A04
            if (r0 == 0) goto L_0x0e19
            java.lang.String r0 = r1.A02
            if (r0 == 0) goto L_0x0e19
            java.lang.String r0 = r1.A03
            if (r0 == 0) goto L_0x0e19
            com.instagram.nux.cal.model.FXCalAgeInfo r1 = r1.A00
            if (r1 == 0) goto L_0x0e19
            java.lang.Boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0e19
            java.lang.String r0 = r4.A02
            if (r0 == 0) goto L_0x0e19
            java.lang.String r0 = r4.A03
            if (r0 == 0) goto L_0x0e19
            java.lang.String r0 = r4.A04
            if (r0 == 0) goto L_0x0e19
            java.lang.String r0 = r4.A06
            if (r0 == 0) goto L_0x0e19
            java.lang.String r0 = r4.A05
            if (r0 == 0) goto L_0x0e19
            java.lang.Boolean r0 = r1.A01
            if (r0 == 0) goto L_0x0e19
            java.lang.String r0 = r1.A02
            if (r0 == 0) goto L_0x0e19
            java.lang.String r0 = r1.A03
            if (r0 == 0) goto L_0x0e19
            java.lang.String r0 = r1.A04
            if (r0 == 0) goto L_0x0e19
            java.lang.String r0 = r1.A06
            if (r0 == 0) goto L_0x0e19
            java.lang.String r0 = r1.A05
            if (r0 == 0) goto L_0x0e19
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            X.0wW r0 = r3.A00
            X.6Yo r5 = X.DbS.A0M(r1, r0)
            com.instagram.nux.cal.model.ConnectContent r6 = r3.A02
            X.0wW r0 = r3.A00
            java.lang.Integer r1 = r3.A03
            X.EVV r4 = r3.A01
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            X.DbW.A0w(r3, r0)
            java.lang.String r0 = "argument_content"
            r3.putParcelable(r0, r6)
            java.lang.String r1 = X.C49778F6l.A00(r1)
            java.lang.String r0 = "argument_flow"
            r3.putString(r0, r1)
            java.lang.String r0 = "argument_entry_point"
            r3.putSerializable(r0, r4)
            X.E1F r0 = new X.E1F
            r0.<init>()
            r0.setArguments(r3)
        L_0x0e0e:
            r5.A0E(r0)
            r5.A04()
            r0 = 94982598(0x5a951c6, float:1.5922722E-35)
            goto L_0x001d
        L_0x0e19:
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            X.0wW r0 = r3.A00
            X.6Yo r5 = X.DbS.A0M(r1, r0)
            X.F1R r6 = new X.F1R
            r6.<init>()
            com.instagram.nux.cal.model.ConnectContent r0 = r3.A02
            com.instagram.nux.cal.model.SignupContent r7 = r0.A00()
            X.0wW r8 = r3.A00
            java.lang.Integer r10 = r3.A03
            X.EVV r9 = r3.A01
            r11 = 0
            r12 = r11
            X.E4O r0 = r6.A00(r7, r8, r9, r10, r11, r12)
            goto L_0x0e0e
        L_0x0e3b:
            r0 = -804688906(0xffffffffd0096bf6, float:-9.2222157E9)
            int r2 = X.AnonymousClass0fD.A05(r0)
            X.FBf r5 = X.C49881FBf.A00
            java.lang.Object r3 = r3.A01
            X.E1F r3 = (X.E1F) r3
            X.0wW r4 = r3.A00
            X.EVV r0 = r3.A01
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0e8e
            r0 = 2
            if (r1 == r0) goto L_0x0e8b
            X.DiE r0 = X.C46634DiE.A0z
        L_0x0e58:
            java.lang.String r0 = r0.A01
            r5.A02(r4, r0)
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            X.0wW r0 = r3.A00
            X.6Yo r1 = X.DbS.A0M(r1, r0)
            X.F1R r4 = new X.F1R
            r4.<init>()
            com.instagram.nux.cal.model.ConnectContent r0 = r3.A02
            com.instagram.nux.cal.model.SignupContent r5 = r0.A00()
            X.0wW r6 = r3.A00
            java.lang.Integer r8 = r3.A06
            X.EVV r7 = r3.A01
            java.lang.String r9 = r3.A07
            java.lang.String r10 = r3.A08
            X.E4O r0 = r4.A00(r5, r6, r7, r8, r9, r10)
            r1.A0E(r0)
            r1.A04()
            r0 = -1582048141(0xffffffffa1b3dc73, float:-1.2187864E-18)
            goto L_0x001d
        L_0x0e8b:
            X.DiE r0 = X.C46634DiE.A0M
            goto L_0x0e58
        L_0x0e8e:
            X.DiE r0 = X.C46634DiE.A0P
            goto L_0x0e58
        L_0x0e91:
            X.Et7 r6 = new X.Et7
            r6.<init>()
            X.S6k r0 = X.LQc.A07
            byte[] r4 = r0.A03(r2)
            android.os.Bundle r2 = r6.A00
            java.lang.String r0 = "requestMessage"
            r2.putByteArray(r0, r4)
            android.os.Bundle r2 = r6.A00
            java.lang.String r0 = "useDebugKey"
            r2.putBoolean(r0, r3)
            X.KHD r4 = new X.KHD
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.1ES.A03(r4)
            r0 = -1084618515(0xffffffffbf5a08ed, float:-0.8516987)
            X.AnonymousClass0fD.A0C(r0, r1)
            return
        L_0x0eb9:
            boolean r1 = r1.isChecked()
            r2.A02(r1)
            r1 = -2073880288(0xffffffff84631920, float:-2.6695259E-36)
            goto L_0x14b0
        L_0x0ec5:
            boolean r1 = r1.isChecked()
            r2.A02(r1)
            r1 = 1639360993(0x61b6a9e1, float:4.2119356E20)
            goto L_0x14b0
        L_0x0ed1:
            r0 = -234290430(0xfffffffff2090302, float:-2.7137973E30)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r3.A01
            X.E3o r3 = (X.C47466E3o) r3
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x0ef0
            X.0wW r2 = r3.A00
            X.EVV r0 = X.EVV.IG_SAC_SIGN_UP
            java.lang.String r1 = r0.toString()
            X.AnonymousClass7TG.A1N(r2, r1)
            java.lang.String r0 = "link_accounts_screen_closed"
            X.FG9.A00(r2, r0, r1)
        L_0x0ef0:
            X.0wW r2 = r3.getSession()
            X.DiE r0 = r3.A02()
            java.lang.String r1 = r0.A01
            X.AnonymousClass7TG.A1N(r2, r1)
            r0 = 0
            X.FEK.A00(r2, r0, r1)
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            X.G65 r0 = (X.G65) r0
            r0.DTh()
            r0 = 1284595520(0x4c915f40, float:7.6216832E7)
            goto L_0x0f15
        L_0x0f0e:
            r0 = 0
            r2.A00(r0, r1)
            r0 = 1247274239(0x4a57e4ff, float:3537215.8)
        L_0x0f15:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x0f19:
            java.lang.Object r4 = r3.A01
            X.E54 r4 = (X.E54) r4
            X.0aP r0 = r4.A06
            X.1NY r2 = X.DbZ.A0M(r0)
            java.lang.String r0 = "trusted_friend/get_recovery_request_challenge/"
            r2.A0A(r0)
            java.lang.Class<X.DwD> r1 = X.DwD.class
            java.lang.Class<X.F8g> r0 = X.F8g.class
            X.1OC r3 = X.DbU.A0S(r2, r1, r0)
            X.0hq r2 = r4.getParentFragmentManager()
            X.0aP r1 = r4.A06
            r0 = 3
            X.0qQ.A0B(r1, r0)
            X.EQO r0 = new X.EQO
            r0.<init>(r2)
            r0.A00 = r4
            r0.A01 = r1
            r3.A00 = r0
            r4.schedule(r3)
            return
        L_0x0f49:
            r0 = -1064937804(0xffffffffc08656b4, float:-4.198084)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            X.E2t r4 = (X.C47447E2t) r4
            X.0eM r1 = r4.A0E
            X.0lg r3 = X.DbT.A0X(r1)
            java.lang.String r2 = "nux_interest_picker"
            r1 = 0
            X.FEK.A00(r3, r1, r2)
            X.G8t r1 = r4.A03
            X.Dba.A1N(r1)
            r1 = -1939332579(0xffffffff8c68221d, float:-1.7882895E-31)
            goto L_0x14b0
        L_0x0f6a:
            r0 = 497251443(0x1da37473, float:4.3266146E-21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            X.E6T r4 = (X.E6T) r4
            androidx.fragment.app.FragmentActivity r2 = r4.getActivity()
            if (r2 == 0) goto L_0x0f98
            boolean r1 = r2 instanceof X.C51950G8t
            if (r1 == 0) goto L_0x0f9d
            X.G8t r2 = (X.C51950G8t) r2
        L_0x0f81:
            X.Dba.A1O(r2)
            X.1Q0 r1 = X.1Q0.A1R
            X.FBm r3 = X.FGI.A01(r4, r1)
            java.util.Set r1 = r4.A0H
            int r2 = r1.size()
            java.lang.String r1 = "follow_users_count"
            r3.A03(r1, r2)
            r3.A02()
        L_0x0f98:
            r1 = 785116453(0x2ecbed25, float:9.2734966E-11)
            goto L_0x14b0
        L_0x0f9d:
            r2 = 0
            goto L_0x0f81
        L_0x0f9f:
            r0 = 2023686853(0x789f02c5, float:2.580098E34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r3.A01
            X.E6T r3 = (X.E6T) r3
            androidx.fragment.app.FragmentActivity r2 = r3.getActivity()
            if (r2 == 0) goto L_0x0fc6
            boolean r1 = r2 instanceof X.C51950G8t
            if (r1 == 0) goto L_0x0fcb
            X.G8t r2 = (X.C51950G8t) r2
        L_0x0fb6:
            X.Dba.A1N(r2)
            X.1Q0 r2 = X.1Q0.A1T
            com.instagram.common.session.UserSession r1 = r3.A05
            X.FGI r2 = r2.A02(r1)
            X.DiE r1 = X.C46634DiE.A1O
            X.FGI.A03(r2, r1)
        L_0x0fc6:
            r1 = 1503945522(0x59a46332, float:5.7838703E15)
            goto L_0x14b0
        L_0x0fcb:
            r2 = 0
            goto L_0x0fb6
        L_0x0fcd:
            r0 = 2144181423(0x7fcd9caf, float:NaN)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Dbb.A1S(r1)
            r1 = 367843970(0x15ecda82, float:9.5664385E-26)
            goto L_0x14b0
        L_0x0fde:
            r0 = 1146051783(0x444f5cc7, float:829.44965)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Dbb.A1S(r1)
            r1 = -1272177892(0xffffffffb42c1b1c, float:-1.602861E-7)
            goto L_0x14b0
        L_0x0fef:
            r0 = 1067577766(0x3fa1f1a6, float:1.265187)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Dbb.A1S(r1)
            r1 = 1282933818(0x4c78043a, float:6.501604E7)
            goto L_0x14b0
        L_0x1000:
            java.lang.Object r4 = r3.A01
            X.ENn r4 = (X.C47936ENn) r4
            android.widget.EditText r0 = r4.A00
            if (r0 == 0) goto L_0x1036
            java.lang.String r1 = X.AnonymousClass7TF.A0f(r0)
        L_0x100c:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x1038
            int r2 = java.lang.Integer.parseInt(r1)
            r0 = 4
            if (r2 <= r0) goto L_0x1038
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r0 = 1
            int r3 = r1.get(r0)
            int r3 = r3 - r2
            int r0 = X.DbZ.A06(r1)
            int r2 = r0 + 1
            int r1 = X.DbU.A03(r1)
            X.ED4 r0 = new X.ED4
            r0.<init>(r4, r3, r2, r1)
            r4.A02(r0, r3, r2, r1)
            return
        L_0x1036:
            r1 = 0
            goto L_0x100c
        L_0x1038:
            android.widget.TextView r1 = r4.A01
            r1.getClass()
            r0 = 2131952525(0x7f13038d, float:1.9541495E38)
            r1.setText(r0)
            android.widget.TextView r2 = r4.A01
            android.app.Activity r1 = r4.getRootActivity()
            android.app.Activity r0 = r4.getRootActivity()
            int r0 = X.2Yu.A03(r0)
            X.DbT.A17(r1, r2, r0)
            return
        L_0x1055:
            r0 = 420708657(0x19138131, float:7.625812E-24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            X.E5i r4 = (X.C47503E5i) r4
            X.0eM r1 = r4.A06
            X.0lg r3 = X.DbT.A0X(r1)
            java.lang.String r2 = "cp_acquisition_email"
            r1 = 0
            X.FEK.A00(r3, r1, r2)
            X.G8t r1 = r4.A01
            X.Dba.A1N(r1)
            r1 = -526305259(0xffffffffe0a13815, float:-9.293647E19)
            goto L_0x14b0
        L_0x1076:
            r0 = -1998975397(0xffffffff88da0e5b, float:-1.3123773E-33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            X.E7Q r2 = (X.E7Q) r2
            X.G8t r1 = r2.A06
            X.Dba.A1N(r1)
            X.0eM r1 = r2.A0R
            X.0lg r3 = X.DbT.A0X(r1)
            java.lang.String r2 = r2.A0K
            r1 = 0
            X.FEK.A00(r3, r1, r2)
            r1 = 432011286(0x19bff816, float:1.9849138E-23)
            goto L_0x14b0
        L_0x1097:
            r0 = -888318612(0xffffffffcb0d556c, float:-9262444.0)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.E23 r5 = (X.E23) r5
            X.FBf r4 = X.C49881FBf.A00
            X.0eM r1 = r5.A09
            X.0lg r3 = X.DbT.A0X(r1)
            java.lang.String r2 = "nux_discover_accounts"
            r1 = 0
            r4.A00(r3, r1, r2)
            X.G8t r1 = X.C49047EoR.A00(r5)
            X.Dba.A1O(r1)
            r1 = 526267305(0x1f5e33a9, float:4.705306E-20)
            goto L_0x14b0
        L_0x10bc:
            r0 = -1409245100(0xffffffffac00a054, float:-1.8278894E-12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E2z r1 = (X.C47453E2z) r1
            X.C47453E2z.A01(r1)
            r1 = 2135156657(0x7f43e7b1, float:2.6040247E38)
            goto L_0x14b0
        L_0x10cf:
            r0 = -126695187(0xfffffffff872c8ed, float:-1.9697048E34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E2z r1 = (X.C47453E2z) r1
            X.C47453E2z.A01(r1)
            r1 = -1789692460(0xffffffff955375d4, float:-4.270406E-26)
            goto L_0x14b0
        L_0x10e2:
            r0 = -321535286(0xffffffffecd5c2ca, float:-2.0673685E27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.E2D r5 = (X.E2D) r5
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            if (r1 == 0) goto L_0x1105
            X.FEv r4 = X.C49920FEv.A00
            X.0aP r3 = r5.A00
            java.lang.String r2 = "birthday_additional_info"
            X.EXD r1 = r5.A01
            r4.A01(r3, r1, r2)
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            r1.onBackPressed()
        L_0x1105:
            r1 = -110848432(0xfffffffff9649650, float:-7.4180774E34)
            goto L_0x14b0
        L_0x110a:
            r0 = -56486879(0xfffffffffca21421, float:-6.732483E36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.1Q0 r2 = X.1Q0.A0I
            java.lang.Object r4 = r3.A01
            X.E2D r4 = (X.E2D) r4
            X.0aP r1 = r4.A00
            X.FGI r3 = r2.A02(r1)
            X.DiE r2 = X.C46634DiE.A0I
            X.EXD r1 = r4.A01
            X.FGI.A02(r3, r1, r2)
            android.content.Context r3 = r4.requireContext()
            X.0aP r2 = r4.A00
            java.lang.String r1 = "https://help.instagram.com/519522125107875"
            X.C49040EoK.A00(r3, r2, r1)
            r1 = 343204474(0x1474e27a, float:1.23635165E-26)
            goto L_0x14b0
        L_0x1134:
            r0 = 1473484911(0x57d3986f, float:4.65303302E14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.DbT.A15()
            java.lang.String r4 = "CONSENT"
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "AUTO_CONF_SCREEN_TYPE"
            r2.putString(r1, r4)
            X.E14 r4 = new X.E14
            r4.<init>()
            r4.setArguments(r2)
            java.lang.Object r3 = r3.A01
            X.E2O r3 = (X.E2O) r3
            X.0eM r1 = r3.A08
            X.7Pr r2 = X.DbX.A0f(r1)
            r1 = 2131953318(0x7f1306a6, float:1.9543104E38)
            java.lang.String r1 = r3.getString(r1)
            r2.A0d = r1
            X.7Pu r2 = r2.A00()
            android.app.Activity r1 = X.DbT.A03(r3)
            r2.A02(r1, r4)
            r1 = -603601929(0xffffffffdc05c3f7, float:-1.5060655E17)
            goto L_0x14b0
        L_0x1174:
            r0 = 187947202(0xb33d8c2, float:3.4637216E-32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.DbT.A15()
            java.lang.String r4 = "CONFIRMATION"
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "AUTO_CONF_SCREEN_TYPE"
            r2.putString(r1, r4)
            X.E14 r4 = new X.E14
            r4.<init>()
            r4.setArguments(r2)
            java.lang.Object r3 = r3.A01
            X.E2H r3 = (X.E2H) r3
            X.0eM r1 = r3.A02
            X.7Pr r2 = X.DbX.A0f(r1)
            r1 = 2131953318(0x7f1306a6, float:1.9543104E38)
            java.lang.String r1 = r3.getString(r1)
            r2.A0d = r1
            X.7Pu r2 = r2.A00()
            android.app.Activity r1 = X.DbT.A03(r3)
            r2.A02(r1, r4)
            r1 = -1710943260(0xffffffff9a0513e4, float:-2.7519823E-23)
            goto L_0x14b0
        L_0x11b4:
            r0 = 524908064(0x1f497620, float:4.2661116E-20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            X.E2H r4 = (X.E2H) r4
            X.0eM r1 = r4.A02
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r2 = r4.getActivity()
            r1 = 0
            X.C46413Dea.A06(r2, r1, r4, r3)
            r1 = -825150047(0xffffffffced135a1, float:-1.75497638E9)
            goto L_0x14b0
        L_0x11d2:
            java.lang.Object r3 = r3.A01
            X.E77 r3 = (X.E77) r3
            com.instagram.common.session.UserSession r2 = r3.getSession()
            java.lang.String r1 = "additional_contact"
            X.AnonymousClass7TG.A1N(r2, r1)
            r0 = 0
            X.FEK.A00(r2, r0, r1)
            r0 = 0
            X.E77.A00(r3, r0)
            return
        L_0x11e8:
            r0 = 1153854794(0x44c66d4a, float:1587.4153)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Ffg r1 = (X.C50625Ffg) r1
            X.F3a r1 = r1.A0D
            r1.A01()
            r1 = 507270559(0x1e3c559f, float:9.970343E-21)
            goto L_0x14b0
        L_0x11fd:
            r0 = 1165595940(0x45799524, float:3993.3213)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Ffg r1 = (X.C50625Ffg) r1
            X.F3a r1 = r1.A0D
            r1.A01()
            r1 = 412139465(0x1890bfc9, float:3.741678E-24)
            goto L_0x14b0
        L_0x1212:
            r0 = -663570958(0xffffffffd872b5f2, float:-1.06745305E15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Ffg r1 = (X.C50625Ffg) r1
            X.F3a r1 = r1.A0D
            r1.A00()
            r1 = -1334225471(0xffffffffb07955c1, float:-9.0707536E-10)
            goto L_0x14b0
        L_0x1227:
            r0 = 49817760(0x2f828a0, float:3.6463642E-37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Ffh r1 = (X.C50626Ffh) r1
            X.F3a r1 = r1.A0I
            r1.A01()
            r1 = -2095094542(0xffffffff831f64f2, float:-4.684178E-37)
            goto L_0x14b0
        L_0x123c:
            r0 = -297756687(0xffffffffee4097f1, float:-1.4901202E28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Ffh r1 = (X.C50626Ffh) r1
            X.F3a r1 = r1.A0I
            r1.A01()
            r1 = 661257328(0x2769fc70, float:3.2472092E-15)
            goto L_0x14b0
        L_0x1251:
            r0 = 1317959651(0x4e8e77e3, float:1.19511078E9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Ffh r1 = (X.C50626Ffh) r1
            X.F3a r1 = r1.A0I
            X.E4u r2 = r1.A00
            r2.A02()
            X.G66 r1 = r2.A0C
            r2.A04 = r1
            r1 = 1813634279(0x6c19dce7, float:7.440353E26)
            goto L_0x14b0
        L_0x126c:
            r0 = 457817212(0x1b49bc7c, float:1.6687233E-22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Ffh r1 = (X.C50626Ffh) r1
            X.F3a r1 = r1.A0I
            r1.A00()
            r1 = -1760123898(0xffffffff9716a406, float:-4.867464E-25)
            goto L_0x14b0
        L_0x1281:
            r0 = -626560635(0xffffffffdaa77185, float:-2.35655686E16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Ffh r1 = (X.C50626Ffh) r1
            X.F3a r1 = r1.A0I
            X.E4u r2 = r1.A00
            X.FZg r1 = r2.A01
            r1.A02()
            X.G66 r1 = r2.A0D
            r2.A04 = r1
            r1 = 1176696083(0x4622f513, float:10429.269)
            goto L_0x14b0
        L_0x129e:
            r0 = -481358823(0xffffffffe34f0c19, float:-3.8193478E21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.1Q0 r2 = X.1Q0.A08
            java.lang.Object r4 = r3.A01
            X.E0R r4 = (X.E0R) r4
            X.0aP r1 = r4.A00
            X.FGI r3 = r2.A02(r1)
            X.DiE r2 = X.C46634DiE.A0e
            X.EXD r1 = r4.A02
            X.FGI.A02(r3, r1, r2)
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            X.0aP r1 = r4.A00
            X.6Yo r5 = X.DbY.A0J(r2, r1)
            X.EXD r1 = r4.A02
            java.lang.String r4 = "IgSessionManager.LOGGED_OUT_TOKEN"
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.String r2 = r1.name()
            java.lang.String r1 = "RegistrationFlowExtra"
            r3.putString(r1, r2)
            X.DbS.A1A(r3, r4)
            X.E2D r1 = new X.E2D
            r1.<init>()
            X.DbX.A18(r3, r1, r5)
            r1 = -332947528(0xffffffffec279fb8, float:-8.1057945E26)
            goto L_0x14b0
        L_0x12e3:
            r0 = 368722991(0x15fa442f, float:1.0108177E-25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.ENo r1 = (X.C47937ENo) r1
            X.C47937ENo.A00(r1)
            r1 = -1042373882(0xffffffffc1dea306, float:-27.829601)
            goto L_0x14b0
        L_0x12f6:
            java.lang.Object r6 = r3.A01
            X.E4O r6 = (X.E4O) r6
            X.F3G r2 = r6.A03
            boolean r1 = r6.A0C
            boolean r0 = r2 instanceof X.C47926ENd
            if (r0 == 0) goto L_0x1340
            X.EuW r5 = r2.A01
            X.0lg r4 = r2.A00
            java.lang.String r3 = r2.A02
            boolean r2 = X.AnonymousClass7TG.A1Z(r4, r3)
            java.lang.String r0 = "disclosures_v2_screen_pt1_closed"
            X.FG9.A00(r4, r0, r3)
            r1 = 0
            java.util.List r0 = r5.A00
            int r0 = X.DbT.A02(r0, r2)
            if (r1 != r0) goto L_0x1325
            X.0qQ.A0B(r4, r1)
            X.0qQ.A0B(r3, r2)
            java.lang.String r0 = "disclosures_v2_screen_pt2_closed"
        L_0x1322:
            X.FG9.A00(r4, r0, r3)
        L_0x1325:
            X.0wW r2 = r6.getSession()
            X.DiE r0 = r6.A01()
            java.lang.String r1 = r0.A01
            X.AnonymousClass7TG.A1N(r2, r1)
            r0 = 0
            X.FEK.A00(r2, r0, r1)
            androidx.fragment.app.FragmentActivity r0 = r6.requireActivity()
            X.G65 r0 = (X.G65) r0
            r0.DTh()
            return
        L_0x1340:
            boolean r0 = r2 instanceof X.C47924ENb
            X.0lg r4 = r2.A00
            if (r0 == 0) goto L_0x134e
            java.lang.String r3 = r2.A02
            X.AnonymousClass7TG.A1N(r4, r3)
            java.lang.String r0 = "disclosures_v2_screen_closed"
            goto L_0x1322
        L_0x134e:
            if (r1 == 0) goto L_0x135c
            X.EVV r0 = X.EVV.IG_SAC_SIGN_UP
            java.lang.String r3 = r0.toString()
            X.AnonymousClass7TG.A1N(r4, r3)
            java.lang.String r0 = "disclosures_screen_closed"
            goto L_0x1322
        L_0x135c:
            java.lang.String r3 = r2.A02
            X.AnonymousClass7TG.A1N(r4, r3)
            java.lang.String r0 = "disclosures_v2_screen_closed"
            goto L_0x1322
        L_0x1364:
            r0 = -954972895(0xffffffffc7144521, float:-37957.13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.E20 r5 = (X.E20) r5
            X.0wW r4 = r5.A01
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.String r3 = r5.A03
            X.AnonymousClass7TG.A1N(r4, r3)
            java.lang.String r2 = "cp_upsell_screen_cancel"
            r1 = 0
            X.FGS.A03(r4, r2, r3, r1)
            r1 = 0
            X.E20.A01(r5, r1)
            r1 = -1953703317(0xffffffff8b8cda6b, float:-5.425468E-32)
            goto L_0x14b0
        L_0x1387:
            r0 = 187353059(0xb2ac7e3, float:3.2891187E-32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E20 r1 = (X.E20) r1
            X.E20.A00(r1)
            r1 = -1038316196(0xffffffffc21c8d5c, float:-39.138046)
            goto L_0x14b0
        L_0x139a:
            r0 = 783792164(0x2eb7b824, float:8.3545865E-11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            X.E3o r4 = (X.C47466E3o) r4
            com.instagram.nux.cal.model.ConnectContent r3 = r4.A02
            X.0wW r1 = r4.A00
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            X.DbW.A0w(r2, r1)
            java.lang.String r1 = "argument_content"
            r2.putParcelable(r1, r3)
            X.E6M r3 = new X.E6M
            r3.<init>()
            androidx.fragment.app.FragmentActivity r2 = X.DbU.A0I(r2, r3, r4)
            X.0wW r1 = r4.A00
            X.7Pr r1 = X.DbS.A0W(r1)
            X.DbU.A0y(r2, r3, r1)
            r1 = -1677042998(0xffffffff9c0a5aca, float:-4.577771E-22)
            goto L_0x14b0
        L_0x13cc:
            r0 = 1662252837(0x6313f725, float:2.72948E21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.F3A r1 = (X.F3A) r1
            java.lang.String r1 = r1.A01
            android.content.Context r2 = r31.getContext()
            android.net.Uri r1 = X.DbV.A07(r2, r1)
            X.0kR.A0F(r2, r1)
            r1 = 1713834731(0x66270aeb, float:1.9720915E23)
            goto L_0x14b0
        L_0x13e9:
            r0 = -919240347(0xffffffffc9358165, float:-743446.3)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.FZW r1 = (X.FZW) r1
            X.E23 r3 = r1.A06
            X.1Xj r2 = r1.A05
            java.lang.String r1 = r1.A07
            r3.A02(r2, r1)
            r1 = 1229599817(0x494a3449, float:828228.56)
            goto L_0x14b0
        L_0x1402:
            r0 = -421269190(0xffffffffe6e3f13a, float:-5.3821352E23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.1Z6 r4 = X.AnonymousClass2MF.A00()
            java.lang.Object r1 = r3.A01
            com.instagram.newsfeed.fragment.NewsfeedFragment r1 = (com.instagram.newsfeed.fragment.NewsfeedFragment) r1
            android.content.Context r3 = r1.requireContext()
            X.0eM r1 = r1.A0A
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r1 = ""
            r4.A03(r3, r2, r1)
            r1 = -220094666(0xfffffffff2e19f36, float:-8.937805E30)
            goto L_0x14b0
        L_0x1425:
            r0 = -1032264790(0xffffffffc278e3aa, float:-62.22233)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.E6g r5 = (X.C47520E6g) r5
            X.8ab r4 = X.DbW.A0U(r5)
            android.content.res.Resources r3 = X.DbV.A05(r5)
            r2 = 2131820918(0x7f110176, float:1.9274565E38)
            int r1 = r5.A00
            java.lang.String r1 = X.DbY.A0d(r3, r1, r2)
            r4.A05 = r1
            r2 = 2131971974(0x7f134f86, float:1.9580942E38)
            r1 = 43
            X.FJf r1 = X.C50020FJf.A00(r5, r1)
            r4.A0L(r1, r2)
            r1 = 44
            X.FJf r1 = X.C50020FJf.A00(r5, r1)
            X.DbX.A16(r1, r4)
            X.F2F r3 = r5.A05()
            int r1 = r5.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "remove"
            r3.A00(r1, r2)
            r1 = -1424957654(0xffffffffab10df2a, float:-5.146878E-13)
            goto L_0x14b0
        L_0x146b:
            r0 = 730986321(0x2b91f751, float:1.0371514E-12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.E6g r5 = (X.C47520E6g) r5
            X.8ab r4 = X.DbW.A0U(r5)
            android.content.res.Resources r3 = X.DbV.A05(r5)
            r2 = 2131820713(0x7f1100a9, float:1.9274149E38)
            int r1 = r5.A00
            java.lang.String r1 = X.DbY.A0d(r3, r1, r2)
            r4.A05 = r1
            r2 = 2131962613(0x7f132af5, float:1.9561956E38)
            r1 = 41
            X.FJf r1 = X.C50020FJf.A00(r5, r1)
            r4.A0G(r1, r2)
            r1 = 42
            X.FJf r1 = X.C50020FJf.A00(r5, r1)
            X.DbX.A16(r1, r4)
            X.F2F r3 = r5.A05()
            int r1 = r5.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "follow"
            r3.A00(r1, r2)
            r1 = -28600924(0xfffffffffe4b95a4, float:-6.7652565E37)
        L_0x14b0:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FP0.onClick(android.view.View):void");
    }

    public FP0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
