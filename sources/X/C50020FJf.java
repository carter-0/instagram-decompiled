package X;

import android.content.DialogInterface;

/* renamed from: X.FJf  reason: case insensitive filesystem */
public final class C50020FJf implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;

    public C50020FJf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C50020FJf A00(Object obj, int i) {
        return new C50020FJf(obj, i);
    }

    public static void A01(C358248ab r1, Object obj, int i, int i2) {
        r1.A0I(new C50020FJf(obj, i), i2);
    }

    /* JADX WARNING: type inference failed for: r4v8, types: [androidx.fragment.app.Fragment, X.E4i, X.4DH] */
    /* JADX WARNING: type inference failed for: r4v11, types: [X.ESP, androidx.fragment.app.Fragment, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v13, types: [X.ESP, androidx.fragment.app.Fragment, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v15, types: [androidx.fragment.app.Fragment, java.lang.Object, X.ESD] */
    /* JADX WARNING: type inference failed for: r4v17, types: [X.ES3, androidx.fragment.app.Fragment, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0446, code lost:
        r0 = X.AnonymousClass7TE.A0l(r0);
        X.0qQ.A0B(r0, 1);
        r5 = X.AnonymousClass7TG.A0a(r0);
        X.DbX.A1M(r5, X.C49930FFj.A01(71, 9, 62), X.DbT.A0t(r3, r5, X.C49930FFj.A01(0, 33, 106)));
        r1 = X.DbT.A0U(r5, true);
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x04d7, code lost:
        r3.A00 = r1;
        X.1ES.A03(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x04dc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x055d, code lost:
        r1.A00 = r6;
        r4.schedule(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0562, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0568, code lost:
        X.ESN.A07(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x056b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x058c, code lost:
        r4.A02.A0D = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0591, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x05af, code lost:
        r11.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x05b2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        r2 = X.AnonymousClass7TE.A0e(r3.A01, "batch_follow_requests_popup_tapped");
        r2.AAJ("action_type", r4);
        X.DbW.A15(r2, r3.A00);
        r2.A9F("num_requests", X.DbZ.A0c(r5));
        r2.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0373, code lost:
        X.FCF.A00(r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0376, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x03d9, code lost:
        ((X.C68504NKx) r0).updateListView();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x03de, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x03df, code lost:
        X.0qQ.A0F("authenticatorAppSwitch");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x03e8, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r11, int r12) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x056c;
                case 1: goto L_0x0563;
                case 2: goto L_0x0540;
                case 3: goto L_0x053a;
                case 4: goto L_0x0522;
                case 5: goto L_0x053a;
                case 6: goto L_0x0517;
                case 7: goto L_0x050f;
                case 8: goto L_0x0504;
                case 9: goto L_0x04dd;
                case 10: goto L_0x0036;
                case 11: goto L_0x0036;
                case 12: goto L_0x04be;
                case 13: goto L_0x04ae;
                case 14: goto L_0x049c;
                case 15: goto L_0x0486;
                case 16: goto L_0x0472;
                case 17: goto L_0x0435;
                case 18: goto L_0x0429;
                case 19: goto L_0x03fe;
                case 20: goto L_0x0429;
                case 21: goto L_0x03e9;
                case 22: goto L_0x03bc;
                case 23: goto L_0x039f;
                case 24: goto L_0x0377;
                case 25: goto L_0x0429;
                case 26: goto L_0x0369;
                case 27: goto L_0x035e;
                case 28: goto L_0x0356;
                case 29: goto L_0x034b;
                case 30: goto L_0x033a;
                case 31: goto L_0x032f;
                case 32: goto L_0x0319;
                case 33: goto L_0x02dd;
                case 34: goto L_0x02bb;
                case 35: goto L_0x00fd;
                case 36: goto L_0x0005;
                case 37: goto L_0x00e7;
                case 38: goto L_0x0005;
                case 39: goto L_0x00d1;
                case 40: goto L_0x0005;
                case 41: goto L_0x00bb;
                case 42: goto L_0x0005;
                case 43: goto L_0x00a5;
                case 44: goto L_0x0005;
                case 45: goto L_0x02b5;
                case 46: goto L_0x02b5;
                case 47: goto L_0x028b;
                case 48: goto L_0x0280;
                case 49: goto L_0x0274;
                case 50: goto L_0x0274;
                case 51: goto L_0x0592;
                case 52: goto L_0x022b;
                case 53: goto L_0x01fa;
                case 54: goto L_0x0082;
                case 55: goto L_0x01cc;
                case 56: goto L_0x01b7;
                case 57: goto L_0x0065;
                case 58: goto L_0x019e;
                case 59: goto L_0x0196;
                case 60: goto L_0x018e;
                case 61: goto L_0x017a;
                case 62: goto L_0x05af;
                case 63: goto L_0x0170;
                case 64: goto L_0x0160;
                case 65: goto L_0x0170;
                case 66: goto L_0x014e;
                case 67: goto L_0x0037;
                case 68: goto L_0x013b;
                case 69: goto L_0x0125;
                case 70: goto L_0x0113;
                default: goto L_0x0005;
            }
        L_0x0005:
            r11.dismiss()
            java.lang.Object r0 = r10.A01
            X.E6g r0 = (X.C47520E6g) r0
            X.F2F r3 = r0.A05()
            int r0 = r0.A00
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = "cancel"
        L_0x0018:
            X.0wc r1 = r3.A01
            java.lang.String r0 = "batch_follow_requests_popup_tapped"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "action_type"
            r2.AAJ(r0, r4)
            X.0iw r0 = r3.A00
            X.DbW.A15(r2, r0)
            java.lang.Long r1 = X.DbZ.A0c(r5)
            java.lang.String r0 = "num_requests"
            r2.A9F(r0, r1)
            r2.Cgf()
        L_0x0036:
            return
        L_0x0037:
            java.lang.Object r0 = r10.A01
            X.G7h r0 = (X.C51913G7h) r0
            X.0qQ.A0A(r11)
            X.Ffw r0 = (X.C50637Ffw) r0
            r8 = 0
            X.0qQ.A0B(r11, r8)
            X.EO2 r0 = r0.A00
            androidx.fragment.app.FragmentActivity r3 = r0.getActivity()
            if (r3 == 0) goto L_0x0036
            X.FBp r2 = X.DbU.A0d()
            X.0eM r1 = r0.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r6 = r0.A06
            r5 = 0
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r7 = "opal_nux"
            r9 = r8
            r2.A04(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x05af
        L_0x0065:
            java.lang.Object r2 = r10.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            androidx.fragment.app.FragmentActivity r1 = r2.getActivity()
            boolean r0 = r1 instanceof X.G8D
            if (r0 == 0) goto L_0x0077
            X.G8D r1 = (X.G8D) r1
            r1.CHx()
            return
        L_0x0077:
            X.0hq r2 = r2.mFragmentManager
            if (r2 == 0) goto L_0x0036
            r1 = 1
            java.lang.String r0 = "reg_gdpr_entrance"
            r2.A19(r0, r1)
            return
        L_0x0082:
            java.lang.Object r1 = r10.A01
            X.ED2 r1 = (X.ED2) r1
            com.instagram.common.session.UserSession r0 = r1.A02
            com.instagram.user.model.User r0 = X.DbT.A0j(r0)
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            r0.A0q(r3)
            X.EbW r2 = r1.A00
            if (r2 == 0) goto L_0x0036
            boolean r0 = r2 instanceof X.C47934ENl
            if (r0 == 0) goto L_0x0036
            X.ENl r2 = (X.C47934ENl) r2
            r1 = 0
            X.0qQ.A0B(r3, r1)
            X.ESI r0 = r2.A00
            X.ESI.A0A(r0, r1)
            return
        L_0x00a5:
            java.lang.Object r1 = r10.A01
            X.E6g r1 = (X.C47520E6g) r1
            r0 = 0
            X.C47520E6g.A02(r1, r0)
            X.F2F r3 = r1.A05()
            int r0 = r1.A00
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = "remove"
            goto L_0x0018
        L_0x00bb:
            java.lang.Object r1 = r10.A01
            X.E6g r1 = (X.C47520E6g) r1
            r0 = 1
            X.C47520E6g.A02(r1, r0)
            X.F2F r3 = r1.A05()
            int r0 = r1.A00
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = "follow"
            goto L_0x0018
        L_0x00d1:
            java.lang.Object r1 = r10.A01
            X.E6g r1 = (X.C47520E6g) r1
            r0 = 0
            X.C47520E6g.A02(r1, r0)
            X.F2F r3 = r1.A05()
            int r0 = r1.A00
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = "delete"
            goto L_0x0018
        L_0x00e7:
            java.lang.Object r1 = r10.A01
            X.E6g r1 = (X.C47520E6g) r1
            r0 = 1
            X.C47520E6g.A02(r1, r0)
            X.F2F r3 = r1.A05()
            int r0 = r1.A00
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = "confirm"
            goto L_0x0018
        L_0x00fd:
            java.lang.Object r1 = r10.A01
            X.E6g r1 = (X.C47520E6g) r1
            r0 = 0
            X.C47520E6g.A02(r1, r0)
            X.F2F r3 = r1.A05()
            int r0 = r1.A00
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = "unfollow"
            goto L_0x0018
        L_0x0113:
            java.lang.Object r0 = r10.A01
            X.EN1 r0 = (X.EN1) r0
            X.Dl2 r2 = X.DbV.A0b(r0)
            r1 = 0
            X.EOT r0 = new X.EOT
            r0.<init>(r1, r1)
            r2.A00(r0)
            return
        L_0x0125:
            java.lang.Object r0 = r10.A01
            X.E3x r0 = (X.C47473E3x) r0
            X.0eM r0 = r0.A02
            java.lang.Object r2 = r0.getValue()
            X.Dl9 r2 = (X.C46781Dl9) r2
            X.05G r1 = r2.A06
            r0 = 1
            X.AnonymousClass7TF.A1O(r1, r0)
            X.C46781Dl9.A00(r2)
            return
        L_0x013b:
            java.lang.Object r0 = r10.A01
            X.E3x r0 = (X.C47473E3x) r0
            X.0eM r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.Dl9 r0 = (X.C46781Dl9) r0
            X.05G r1 = r0.A06
            r0 = 0
            X.AnonymousClass7TF.A1O(r1, r0)
            return
        L_0x014e:
            java.lang.Object r0 = r10.A01
            X.G7h r0 = (X.C51913G7h) r0
            X.0qQ.A0A(r11)
            X.Ffw r0 = (X.C50637Ffw) r0
            X.DbW.A0r(r11)
            X.EO2 r0 = r0.A00
            X.EO2.A02(r0)
            return
        L_0x0160:
            java.lang.String r0 = "http://bit.ly/igfilesystem"
            android.net.Uri r1 = X.0cp.A03(r0)
            java.lang.Object r0 = r10.A01
            X.EEE r0 = (X.EEE) r0
            androidx.fragment.app.FragmentActivity r0 = r0.A04
            X.0kR.A0F(r0, r1)
            return
        L_0x0170:
            java.lang.Object r0 = r10.A01
            X.EEE r0 = (X.EEE) r0
            androidx.fragment.app.FragmentActivity r0 = r0.A04
            r0.finish()
            return
        L_0x017a:
            r11.dismiss()
            java.lang.Object r2 = r10.A01
            X.EEM r2 = (X.EEM) r2
            com.facebook.common.callercontext.CallerContext r0 = X.EEM.A0B
            android.os.Handler r1 = r2.A05
            X.Fqv r0 = new X.Fqv
            r0.<init>(r2)
            r1.post(r0)
            return
        L_0x018e:
            java.lang.Object r1 = r10.A01
            com.instagram.registration.model.RegFlowExtras r1 = (com.instagram.registration.model.RegFlowExtras) r1
            r0 = 1
            r1.A0l = r0
            return
        L_0x0196:
            java.lang.Object r1 = r10.A01
            X.E3Y r1 = (X.E3Y) r1
            r0 = 0
            r1.A0V = r0
            return
        L_0x019e:
            X.1Q0 r0 = X.1Q0.A1d
            java.lang.Object r2 = r10.A01
            X.E3Y r2 = (X.E3Y) r2
            X.0xI r1 = X.FGI.A00(r2, r0)
            X.0aP r0 = r2.A05
            X.DbU.A1R(r1, r0)
            android.widget.AutoCompleteTextView r0 = r2.A00
            java.lang.String r0 = X.0nA.A0I(r0)
            X.E3Y.A05(r2, r0)
            return
        L_0x01b7:
            java.lang.Object r1 = r10.A01
            X.ENo r1 = (X.C47937ENo) r1
            android.widget.TextView r0 = r1.A04
            X.AnonymousClass7TF.A16(r0)
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x01c8
            r0 = 1
            r1.A07 = r0
            return
        L_0x01c8:
            X.C47937ENo.A00(r1)
            return
        L_0x01cc:
            java.lang.Object r5 = r10.A01
            X.ED2 r5 = (X.ED2) r5
            com.instagram.common.session.UserSession r4 = r5.A02
            X.1NY r2 = X.DbU.A0N(r4)
            java.lang.String r0 = "accounts/set_private/"
            r2.A0A(r0)
            java.lang.String r1 = "bypass_rate_limit_dialog"
            java.lang.String r0 = "1"
            r2.A9m(r1, r0)
            r1 = 0
            X.FVE r0 = new X.FVE
            r0.<init>(r1)
            X.Dbb.A1K(r2, r0, r4)
            X.1OC r3 = X.DbW.A0K(r2)
            android.content.Context r2 = r5.A01
            X.EbW r0 = r5.A00
            X.ED2 r1 = new X.ED2
            r1.<init>(r2, r4, r0)
            goto L_0x04d7
        L_0x01fa:
            java.lang.Object r0 = r10.A01
            X.ED9 r0 = (X.ED9) r0
            androidx.fragment.app.FragmentActivity r1 = r0.A05
            X.0aP r0 = r0.A01
            X.6Yo r3 = X.DbS.A0M(r1, r0)
            X.DbW.A0X()
            com.instagram.registration.model.RegFlowExtras r2 = new com.instagram.registration.model.RegFlowExtras
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "RegFlowExtras.EXTRA_KEY"
            r1.putParcelable(r0, r2)
            java.lang.String r0 = "IgSessionManager.LOGGED_OUT_TOKEN"
            X.DbS.A1A(r1, r0)
            X.E3Y r0 = new X.E3Y
            r0.<init>()
            r0.setArguments(r1)
            r3.A0E(r0)
            r3.A04()
            return
        L_0x022b:
            java.lang.Object r5 = r10.A01
            X.ED8 r5 = (X.ED8) r5
            X.0aP r7 = r5.A02
            r6 = 1
            X.1Q0 r0 = X.1Q0.A0s
            X.FGI r0 = r0.A02(r7)
            X.0xI r2 = r0.A04()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.String r0 = "has_resent"
            r2.A09(r0, r1)
            X.DbU.A1R(r2, r7)
            androidx.fragment.app.FragmentActivity r4 = r5.A00
            X.0gy r3 = X.AnonymousClass07i.A00(r4)
            java.lang.String r1 = r5.A06
            X.1NY r2 = X.DbU.A0N(r7)
            java.lang.String r0 = "accounts/sign_in_help/"
            r2.A0A(r0)
            java.lang.String r0 = "uid"
            X.DbY.A1J(r2, r0, r1)
            java.lang.Class<X.Dve> r1 = X.C47344Dve.class
            java.lang.Class<X.F6J> r0 = X.F6J.class
            r2.A0R(r1, r0)
            X.1OC r1 = X.DbT.A0U(r2, r6)
            X.EBS r0 = new X.EBS
            r0.<init>(r5)
            r1.A00 = r0
            X.1ES.A00(r4, r3, r1)
            return
        L_0x0274:
            r11.dismiss()
            java.lang.Object r1 = r10.A01
            X.E20 r1 = (X.E20) r1
            r0 = 0
            X.E20.A01(r1, r0)
            return
        L_0x0280:
            r11.dismiss()
            java.lang.Object r0 = r10.A01
            X.E20 r0 = (X.E20) r0
            X.E20.A00(r0)
            return
        L_0x028b:
            java.lang.Object r1 = r10.A01
            X.FfK r1 = (X.C50604FfK) r1
            X.1Q0 r0 = X.1Q0.A1a
            X.E3Y r3 = r1.A01
            X.0xI r2 = X.FGI.A00(r3, r0)
            X.G8G r0 = r1.A00
            java.lang.String r1 = r0.AXz()
            r0 = 262(0x106, float:3.67E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r2.A0C(r0, r1)
            X.0aP r0 = r3.A05
            X.DbU.A1R(r2, r0)
            android.widget.AutoCompleteTextView r0 = r3.A00
            java.lang.String r0 = X.0nA.A0I(r0)
            X.E3Y.A05(r3, r0)
            return
        L_0x02b5:
            java.lang.Object r0 = r10.A01
            X.DbS.A1U(r0)
            return
        L_0x02bb:
            java.lang.Object r0 = r10.A01
            X.E6k r0 = (X.C47524E6k) r0
            X.0eM r0 = r0.A09
            java.lang.Object r0 = r0.getValue()
            X.E7c r0 = (X.C47539E7c) r0
            X.E7Z r0 = r0.A03
            X.0eM r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            X.EuJ r0 = (X.C49355EuJ) r0
            X.E7Z r2 = r0.A00
            X.4Cq r1 = r2.A03()
            r0 = 33
            X.C51645Fy4.A01(r2, r1, r0)
            return
        L_0x02dd:
            java.lang.Object r5 = r10.A01
            X.Ezm r5 = (X.C49629Ezm) r5
            X.6jB r0 = r5.A03
            r2 = 1
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "has_seen_auto_save_to_exclusive_highlight_dialog"
            r1.E5T(r0, r2)
            r1.apply()
            X.4lm r0 = r5.A02
            com.instagram.common.session.UserSession r4 = r5.A01
            java.lang.String r2 = r4.A06
            X.0wc r1 = r0.A00
            java.lang.String r0 = "ig_fan_club_creator_auto_add_highlights_alert_settings_button_tapped"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "profile"
            X.DbS.A1O(r1, r0)
            X.DbY.A1G(r1, r2)
            r1.Cgf()
            X.1Yy r3 = X.FC8.A01()
            android.app.Activity r2 = r5.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            X.G3O r0 = X.G3O.A00
            r3.A01(r2, r4, r1, r0)
            return
        L_0x0319:
            java.lang.Object r0 = r10.A01
            X.Ezm r0 = (X.C49629Ezm) r0
            X.6jB r0 = r0.A03
            r2 = 1
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "has_seen_auto_save_to_exclusive_highlight_dialog"
            r1.E5T(r0, r2)
            r1.apply()
            return
        L_0x032f:
            java.lang.Object r0 = r10.A01
            X.FH4 r0 = (X.FH4) r0
            com.instagram.common.session.UserSession r2 = r0.A04
            X.0iw r1 = r0.A03
            java.lang.String r0 = "logout_d2_cancel_tapped"
            goto L_0x0373
        L_0x033a:
            java.lang.Object r3 = r10.A01
            X.FH4 r3 = (X.FH4) r3
            com.instagram.common.session.UserSession r2 = r3.A04
            X.0iw r1 = r3.A03
            java.lang.String r0 = "logout_d4_logout_tapped"
            X.FCF.A00(r1, r2, r0)
            r3.A0B()
            return
        L_0x034b:
            java.lang.Object r0 = r10.A01
            X.FH4 r0 = (X.FH4) r0
            com.instagram.common.session.UserSession r2 = r0.A04
            X.0iw r1 = r0.A03
            java.lang.String r0 = "logout_d4_cancel_tapped"
            goto L_0x0373
        L_0x0356:
            java.lang.Object r0 = r10.A01
            X.FH4 r0 = (X.FH4) r0
            X.FH4.A07(r0)
            return
        L_0x035e:
            java.lang.Object r2 = r10.A01
            X.FH4 r2 = (X.FH4) r2
            X.EVP r1 = X.EVP.LINKED_ACCOUNTS
            r0 = 0
            r2.A0D(r1, r0)
            return
        L_0x0369:
            java.lang.Object r0 = r10.A01
            X.FH4 r0 = (X.FH4) r0
            com.instagram.common.session.UserSession r2 = r0.A04
            X.0iw r1 = r0.A03
            java.lang.String r0 = "logout_d1_cancel_tapped"
        L_0x0373:
            X.FCF.A00(r1, r2, r0)
            return
        L_0x0377:
            java.lang.Object r4 = r10.A01
            X.ES3 r4 = (X.ES3) r4
            X.0hq r1 = r4.getParentFragmentManager()
            r0 = 8
            X.EQk r6 = new X.EQk
            r6.<init>(r1, r4, r0)
            X.0eM r0 = r4.A00
            X.0lg r0 = X.DbT.A0X(r0)
            X.1NY r2 = X.DbU.A0N(r0)
            java.lang.String r0 = "accounts/disable_sms_two_factor/"
            r2.A0A(r0)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            X.1OC r1 = X.DbY.A0N(r2, r1, r0)
            goto L_0x055d
        L_0x039f:
            r11.dismiss()
            java.lang.Object r2 = r10.A01
            X.ESD r2 = (X.ESD) r2
            X.PR9 r1 = r2.A01
            if (r1 == 0) goto L_0x03df
            r0 = 1
            r1.A0D = r0
            X.3Ar r0 = r2.getScrollingViewProxy()
            X.2rL r0 = r0.AZK()
            if (r0 != 0) goto L_0x03d9
            java.lang.IllegalArgumentException r0 = X.DbU.A0h()
            throw r0
        L_0x03bc:
            r11.dismiss()
            java.lang.Object r2 = r10.A01
            X.ESD r2 = (X.ESD) r2
            X.PR9 r1 = r2.A01
            if (r1 == 0) goto L_0x03df
            r0 = 1
            r1.A0D = r0
            X.3Ar r0 = r2.getScrollingViewProxy()
            X.2rL r0 = r0.AZK()
            if (r0 != 0) goto L_0x03d9
            java.lang.IllegalArgumentException r0 = X.DbU.A0h()
            throw r0
        L_0x03d9:
            X.NKx r0 = (X.C68504NKx) r0
            r0.updateListView()
            return
        L_0x03df:
            java.lang.String r0 = "authenticatorAppSwitch"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x03e9:
            java.lang.Object r4 = r10.A01
            X.ESD r4 = (X.ESD) r4
            X.0hq r1 = r4.getParentFragmentManager()
            r0 = 5
            X.EQk r6 = new X.EQk
            r6.<init>(r1, r4, r0)
            android.content.Context r3 = r4.requireContext()
            X.0eM r0 = r4.A02
            goto L_0x0446
        L_0x03fe:
            java.lang.Object r4 = r10.A01
            X.ESP r4 = (X.ESP) r4
            X.0eM r0 = r4.A05
            X.0lg r0 = X.DbT.A0X(r0)
            X.1NY r3 = X.DbZ.A0L(r0)
            r2 = 622(0x26e, float:8.72E-43)
            r1 = 39
            r0 = 123(0x7b, float:1.72E-43)
            java.lang.String r0 = X.Dbq.A05(r2, r1, r0)
            X.Dba.A1H(r3, r0)
            X.1OC r1 = r3.A0M()
            X.0hq r2 = r4.getParentFragmentManager()
            r0 = 3
            X.EQk r6 = new X.EQk
            r6.<init>(r2, r4, r0)
            goto L_0x055d
        L_0x0429:
            r11.dismiss()
            java.lang.Object r1 = r10.A01
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            r0 = 1
            r1.setChecked(r0)
            return
        L_0x0435:
            java.lang.Object r4 = r10.A01
            X.ESP r4 = (X.ESP) r4
            r0 = 22
            X.EDi r6 = new X.EDi
            r6.<init>(r4, r0)
            android.content.Context r3 = r4.requireContext()
            X.0eM r0 = r4.A05
        L_0x0446:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            r7 = 1
            X.0qQ.A0B(r0, r7)
            X.1NY r5 = X.AnonymousClass7TG.A0a(r0)
            r2 = 0
            r1 = 33
            r0 = 106(0x6a, float:1.49E-43)
            java.lang.String r0 = X.C49930FFj.A01(r2, r1, r0)
            java.lang.String r3 = X.DbT.A0t(r3, r5, r0)
            r2 = 71
            r1 = 9
            r0 = 62
            java.lang.String r0 = X.C49930FFj.A01(r2, r1, r0)
            X.DbX.A1M(r5, r0, r3)
            X.1OC r1 = X.DbT.A0U(r5, r7)
            goto L_0x055d
        L_0x0472:
            java.lang.Object r2 = r10.A01
            X.E3u r2 = (X.C47470E3u) r2
            X.0eM r0 = r2.A03
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            r0.getValue()
            r0 = 2131975702(0x7f135e16, float:1.9588504E38)
            X.FGN.A04(r2, r1, r0)
            return
        L_0x0486:
            java.lang.Object r0 = r10.A01
            android.content.Context r3 = X.DbT.A08(r0)
            r2 = 159(0x9f, float:2.23E-43)
            r1 = 38
            r0 = 122(0x7a, float:1.71E-43)
            java.lang.String r1 = X.Dbq.A05(r2, r1, r0)
            java.lang.String r0 = "ig_two_fac_authenticator_app_setup"
            X.0oI.A07(r3, r1, r0)
            return
        L_0x049c:
            java.lang.Object r2 = r10.A01
            X.E4L r2 = (X.E4L) r2
            X.0eM r0 = r2.A01
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r0 = r2.requireActivity()
            X.FGN.A05(r1, r0)
            return
        L_0x04ae:
            java.lang.Object r0 = r10.A01
            X.EDi r0 = (X.C47699EDi) r0
            java.lang.Object r0 = r0.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.0hq r1 = r0.mFragmentManager
            android.os.Bundle r0 = r0.mArguments
            X.C49958FGq.A04(r0, r1)
            return
        L_0x04be:
            java.lang.Object r0 = r10.A01
            X.ESO r0 = (X.ESO) r0
            android.content.Context r2 = r0.requireContext()
            com.instagram.common.session.UserSession r1 = r0.A00
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            X.1OC r3 = X.FHA.A08(r2, r1, r0)
            r0 = 8
            X.EDi r1 = new X.EDi
            r1.<init>(r10, r0)
        L_0x04d7:
            r3.A00 = r1
            X.1ES.A03(r3)
            return
        L_0x04dd:
            java.lang.Object r0 = r10.A01
            X.EDD r0 = (X.EDD) r0
            X.E4i r4 = r0.A09
            android.content.Context r3 = r4.requireContext()
            X.0aP r2 = r4.A07
            com.instagram.ui.text.FreeAutoCompleteTextView r0 = r4.A0E
            android.text.Editable r0 = r0.getEditableText()
            r0.getClass()
            java.lang.String r1 = r0.toString()
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            X.1OC r1 = X.FHA.A01(r3, r2, r0, r1)
            X.0aP r0 = r4.A07
            X.EQR r6 = new X.EQR
            r6.<init>(r4, r0)
            goto L_0x055d
        L_0x0504:
            java.lang.Object r0 = r10.A01
            X.E75 r0 = (X.E75) r0
            X.DbT.A1I(r0)
            r0.onBackPressed()
            return
        L_0x050f:
            java.lang.Object r0 = r10.A01
            X.ESR r0 = (X.ESR) r0
            X.ESR.A07(r0)
            return
        L_0x0517:
            r11.dismiss()
            java.lang.Object r1 = r10.A01
            X.ESR r1 = (X.ESR) r1
            r0 = 1
            r1.A05 = r0
            return
        L_0x0522:
            java.lang.Object r4 = r10.A01
            X.ESN r4 = (X.ESN) r4
            android.content.Context r2 = r4.getContext()
            com.instagram.common.session.UserSession r1 = r4.A01
            java.lang.String r0 = r4.A05
            X.1OC r1 = X.FFP.A02(r2, r1, r0)
            X.1P0 r0 = r4.A09
            r1.A00 = r0
            r4.schedule(r1)
            goto L_0x058c
        L_0x053a:
            java.lang.Object r1 = r10.A01
            X.ESN r1 = (X.ESN) r1
            r0 = 0
            goto L_0x0568
        L_0x0540:
            java.lang.Object r4 = r10.A01
            X.ESN r4 = (X.ESN) r4
            com.instagram.common.session.UserSession r0 = r4.A01
            X.1NY r2 = X.DbU.A0N(r0)
            java.lang.String r0 = "accounts/disable_sms_two_factor/"
            r2.A0A(r0)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            X.1OC r1 = X.DbY.A0N(r2, r1, r0)
            r0 = 3
            X.EDi r6 = new X.EDi
            r6.<init>(r4, r0)
        L_0x055d:
            r1.A00 = r6
            r4.schedule(r1)
            return
        L_0x0563:
            java.lang.Object r1 = r10.A01
            X.ESN r1 = (X.ESN) r1
            r0 = 1
        L_0x0568:
            X.ESN.A07(r1, r0)
            return
        L_0x056c:
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            X.EVZ r0 = X.EVZ.ARGUMENT_TWOFAC_FLOW
            X.C48975EnD.A00(r3, r0)
            X.F3j r1 = X.DbW.A0X()
            java.lang.Object r4 = r10.A01
            X.ESN r4 = (X.ESN) r4
            com.instagram.common.session.UserSession r0 = r4.A01
            X.E5C r2 = r1.A01(r0)
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            com.instagram.common.session.UserSession r0 = r4.A01
            X.Dbb.A0o(r3, r2, r1, r0)
        L_0x058c:
            X.PR9 r1 = r4.A02
            r0 = 0
            r1.A0D = r0
            return
        L_0x0592:
            java.lang.Object r0 = r10.A01
            X.ED8 r0 = (X.ED8) r0
            X.0aP r3 = r0.A02
            r1 = 0
            X.1Q0 r0 = X.1Q0.A0s
            X.FGI r0 = r0.A02(r3)
            X.0xI r2 = r0.A04()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r0 = "has_resent"
            r2.A09(r0, r1)
            X.DbU.A1R(r2, r3)
        L_0x05af:
            r11.dismiss()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50020FJf.onClick(android.content.DialogInterface, int):void");
    }
}
