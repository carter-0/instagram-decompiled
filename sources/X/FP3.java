package X;

import android.view.View;

public final class FP3 implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public FP3(E75 e75, int i) {
        this.A00 = i;
        switch (i) {
            case 2:
            case 3:
                this.A01 = e75;
                return;
            default:
                this.A01 = e75;
                return;
        }
    }

    public static void A00(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new FP3(obj, i), view);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, X.0Js] */
    /* JADX WARNING: type inference failed for: r1v36, types: [X.5Gs, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v15, types: [X.KHC, X.11X] */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x05b1, code lost:
        r14 = "twoFacResponseBundle";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0618, code lost:
        X.0qQ.A0F(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x061f, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x119b, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x119e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0072, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r19) {
        /*
            r18 = this;
            r3 = r18
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0f52;
                case 1: goto L_0x0eb9;
                case 2: goto L_0x11f2;
                case 3: goto L_0x11c7;
                case 4: goto L_0x0e86;
                case 5: goto L_0x11b2;
                case 6: goto L_0x0e73;
                case 7: goto L_0x0dda;
                case 8: goto L_0x0cc9;
                case 9: goto L_0x119f;
                case 10: goto L_0x0cad;
                case 11: goto L_0x0c90;
                case 12: goto L_0x0c7d;
                case 13: goto L_0x0c60;
                case 14: goto L_0x0c4d;
                case 15: goto L_0x0c3c;
                case 16: goto L_0x0a68;
                case 17: goto L_0x0a44;
                case 18: goto L_0x0a1e;
                case 19: goto L_0x098b;
                case 20: goto L_0x08e0;
                case 21: goto L_0x0872;
                case 22: goto L_0x080f;
                case 23: goto L_0x07fc;
                case 24: goto L_0x07d1;
                case 25: goto L_0x07af;
                case 26: goto L_0x0745;
                case 27: goto L_0x0728;
                case 28: goto L_0x06ec;
                case 29: goto L_0x06cf;
                case 30: goto L_0x0654;
                case 31: goto L_0x0637;
                case 32: goto L_0x0601;
                case 33: goto L_0x05c7;
                case 34: goto L_0x05b4;
                case 35: goto L_0x058c;
                case 36: goto L_0x0567;
                case 37: goto L_0x052f;
                case 38: goto L_0x0509;
                case 39: goto L_0x04e6;
                case 40: goto L_0x04c1;
                case 41: goto L_0x04ae;
                case 42: goto L_0x049b;
                case 43: goto L_0x047c;
                case 44: goto L_0x0469;
                case 45: goto L_0x044a;
                case 46: goto L_0x0400;
                case 47: goto L_0x03ef;
                case 48: goto L_0x03dc;
                case 49: goto L_0x027f;
                case 50: goto L_0x021c;
                case 51: goto L_0x03c9;
                case 52: goto L_0x0399;
                case 53: goto L_0x01d8;
                case 54: goto L_0x0365;
                case 55: goto L_0x031f;
                case 56: goto L_0x030c;
                case 57: goto L_0x02f9;
                case 58: goto L_0x0162;
                case 59: goto L_0x0076;
                case 60: goto L_0x1129;
                case 61: goto L_0x0f65;
                case 62: goto L_0x1117;
                case 63: goto L_0x10e8;
                case 64: goto L_0x10d1;
                case 65: goto L_0x109e;
                case 66: goto L_0x106d;
                case 67: goto L_0x02a9;
                case 68: goto L_0x1026;
                case 69: goto L_0x0fdf;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = 2133642334(0x7f2ccc5e, float:2.2968835E38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            X.E6g r4 = (X.C47520E6g) r4
            X.8ab r5 = X.DbW.A0U(r4)
            android.content.res.Resources r3 = X.DbV.A05(r4)
            r2 = 2131820635(0x7f11005b, float:1.927399E38)
            int r1 = r4.A00
            java.lang.String r1 = X.DbY.A0d(r3, r1, r2)
            r5.A05 = r1
            r2 = 2131957531(0x7f13171b, float:1.9551649E38)
            r1 = 39
            X.FJf r1 = X.C50020FJf.A00(r4, r1)
            r5.A0L(r1, r2)
            r1 = 40
            X.FJf r1 = X.C50020FJf.A00(r4, r1)
            r5.A0C(r1)
            boolean r1 = r4.A0A
            if (r1 == 0) goto L_0x005d
            android.content.res.Resources r3 = X.DbV.A05(r4)
            r2 = 2131820637(0x7f11005d, float:1.9273995E38)
            int r1 = r4.A00
            java.lang.String r1 = r3.getQuantityString(r2, r1)
            r5.A05 = r1
            android.content.res.Resources r3 = X.DbV.A05(r4)
            r2 = 2131820636(0x7f11005c, float:1.9273993E38)
            int r1 = r4.A00
            java.lang.String r1 = r3.getQuantityString(r2, r1)
            r5.A0q(r1)
        L_0x005d:
            X.DbT.A1V(r5)
            X.F2F r3 = r4.A05()
            int r1 = r4.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "delete"
            r3.A00(r1, r2)
            r1 = -1516640308(0xffffffffa599e7cc, float:-2.669834E-16)
        L_0x0072:
            X.AnonymousClass0fD.A0C(r1, r0)
        L_0x0075:
            return
        L_0x0076:
            r0 = 769233216(0x2dd99140, float:2.4734548E-11)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Dp9 r1 = (X.C47017Dp9) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.E2Y r3 = r1.A01
            X.0eM r0 = r3.A03
            java.lang.Object r8 = r0.getValue()
            X.DlE r8 = (X.C46786DlE) r8
            com.instagram.api.schemas.UserMonetizationProductType r2 = r3.A00
            java.lang.String r14 = "productType"
            if (r2 == 0) goto L_0x0618
            X.2Fj r1 = r8.A03
            java.lang.Object r7 = r1.A02()
            X.Drd r7 = (X.C47162Drd) r7
            if (r7 == 0) goto L_0x00a1
            java.lang.String r0 = "disabled"
            r7.A00 = r0
        L_0x00a1:
            r1.A0B(r7)
            X.1a8 r6 = r8.A05
            com.instagram.monetization.repository.MonetizationRepository r1 = r8.A07
            int r0 = r2.ordinal()
            switch(r0) {
                case 1: goto L_0x00be;
                case 2: goto L_0x00c1;
                case 9: goto L_0x00c1;
                case 10: goto L_0x00c4;
                case 11: goto L_0x00c7;
                case 15: goto L_0x00c1;
                default: goto L_0x00af;
            }
        L_0x00af:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x00b1:
            r5 = 0
            X.EB6 r10 = new X.EB6
            r10.<init>(r5)
            X.0qQ.A0B(r0, r5)
            com.instagram.monetization.api.MonetizationApi r2 = r1.A08
            r11 = 0
            goto L_0x00ca
        L_0x00be:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x00b1
        L_0x00c1:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x00b1
        L_0x00c4:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x00b1
        L_0x00c7:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            goto L_0x00b1
        L_0x00ca:
            int r0 = r0.intValue()     // Catch:{ IOException -> 0x0106 }
            switch(r0) {
                case 0: goto L_0x0103;
                case 1: goto L_0x00fa;
                case 2: goto L_0x00fd;
                case 3: goto L_0x0100;
                default: goto L_0x00d1;
            }     // Catch:{ IOException -> 0x0106 }
        L_0x00d1:
            java.lang.String r13 = "IG_CREATOR_FUND_ONGOING"
        L_0x00d3:
            com.instagram.common.session.UserSession r0 = r2.A00     // Catch:{ IOException -> 0x0106 }
            java.lang.String r12 = r0.A06     // Catch:{ IOException -> 0x0106 }
            java.io.StringWriter r9 = new java.io.StringWriter     // Catch:{ IOException -> 0x0106 }
            r9.<init>()     // Catch:{ IOException -> 0x0106 }
            X.17W r1 = X.AnonymousClass7TF.A0K(r9)     // Catch:{ IOException -> 0x0106 }
            java.lang.String r0 = "input"
            r1.A0q(r0)     // Catch:{ IOException -> 0x0106 }
            r1.A0c()     // Catch:{ IOException -> 0x0106 }
            java.lang.String r0 = "appeal_source"
            r1.A0R(r0, r13)     // Catch:{ IOException -> 0x0106 }
            java.lang.String r0 = "client_mutation_id"
            r1.A0R(r0, r12)     // Catch:{ IOException -> 0x0106 }
            r1.A0Z()     // Catch:{ IOException -> 0x0106 }
            java.lang.String r11 = X.AnonymousClass7TG.A0k(r1, r9)     // Catch:{ IOException -> 0x0106 }
            goto L_0x0111
        L_0x00fa:
            java.lang.String r13 = "IG_BRANDED_CONTENT"
            goto L_0x00d3
        L_0x00fd:
            java.lang.String r13 = "IGTV_BRAND_SAFETY"
            goto L_0x00d3
        L_0x0100:
            java.lang.String r13 = "IG_AFFILIATE"
            goto L_0x00d3
        L_0x0103:
            java.lang.String r13 = "INSTAGRAM_MONETIZATION_HUB"
            goto L_0x00d3
        L_0x0106:
            java.lang.String r1 = "MonetizationApi"
            r0 = 444(0x1bc, float:6.22E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0wb.A03(r1, r0)
        L_0x0111:
            com.instagram.common.session.UserSession r0 = r2.A00
            X.3Fb r9 = X.C46479Dfi.A01(r0)
            if (r11 != 0) goto L_0x011d
            java.lang.String r14 = "queryParamsString"
            goto L_0x0618
        L_0x011d:
            java.lang.Class<X.VnS> r2 = X.C18202VnS.class
            java.lang.String r1 = "IGMonetizationEligibilityAppeal"
            X.ELf r0 = new X.ELf
            r0.<init>(r2, r1, r11, r5)
            r9.A09(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r0 = 65
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.A08 = r0
            X.1OC r0 = r9.A07(r1)
            r0.A00 = r10
            X.1aU r2 = X.C69818Nsf.A00(r0)
            r1 = 1
            X.Fp9 r0 = new X.Fp9
            r0.<init>(r1, r8, r7)
            r6.A02(r2, r0)
            com.instagram.api.schemas.UserMonetizationProductType r1 = r3.A00
            if (r1 == 0) goto L_0x0618
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.BRANDED_CONTENT
            if (r1 != r0) goto L_0x015d
            X.0eM r0 = r3.A04
            X.0lg r0 = X.AnonymousClass7TF.A0L(r0, r5)
            X.0wc r1 = X.AnonymousClass0kN.A01(r3, r0)
            java.lang.String r0 = "ig_monetization_hub_appeal_request_sent"
            X.Dba.A1I(r1, r0)
        L_0x015d:
            r0 = -1409345498(0xffffffffabff1826, float:-1.8125542E-12)
            goto L_0x119b
        L_0x0162:
            r0 = 642030961(0x26449d71, float:6.8214533E-16)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r3.A01
            X.E0z r6 = (X.C47407E0z) r6
            X.0hq r1 = r6.getParentFragmentManager()
            r0 = 9
            X.EQk r5 = new X.EQk
            r5.<init>(r1, r6, r0)
            com.instagram.login.twofac.model.TrustedDevice r0 = r6.A00
            java.lang.String r14 = "trustedDevice"
            if (r0 == 0) goto L_0x0618
            java.lang.String r1 = r0.A06
            java.lang.String r0 = "computer"
            boolean r7 = X.0qQ.A0K(r1, r0)
            com.instagram.login.twofac.model.TrustedDevice r0 = r6.A00
            if (r7 == 0) goto L_0x01d3
            if (r0 == 0) goto L_0x0618
            java.lang.String r8 = r0.A08
        L_0x018e:
            X.0qQ.A0A(r8)
            X.0eM r0 = r6.A01
            X.0lg r0 = X.DbT.A0X(r0)
            X.DbY.A1S(r0, r8)
            X.1NY r3 = X.AnonymousClass7TG.A0a(r0)
            r2 = 103(0x67, float:1.44E-43)
            r1 = 31
            r0 = 119(0x77, float:1.67E-43)
            java.lang.String r0 = X.Dbq.A05(r2, r1, r0)
            X.Dba.A1H(r3, r0)
            r2 = 197(0xc5, float:2.76E-43)
            r1 = 11
            r0 = 14
            java.lang.String r0 = X.Dbq.A05(r2, r1, r0)
            r3.A9m(r0, r8)
            r2 = 341(0x155, float:4.78E-43)
            r1 = 13
            r0 = 32
            java.lang.String r0 = X.Dbq.A05(r2, r1, r0)
            r3.A0H(r0, r7)
            X.1OC r0 = X.DbW.A0K(r3)
            r0.A00 = r5
            r6.schedule(r0)
            r0 = -2050631321(0xffffffff85c5d967, float:-1.8605652E-35)
            goto L_0x119b
        L_0x01d3:
            if (r0 == 0) goto L_0x0618
            java.lang.String r8 = r0.A04
            goto L_0x018e
        L_0x01d8:
            r0 = -1470596844(0xffffffffa8587914, float:-1.2016663E-14)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.E2T r5 = (X.E2T) r5
            X.0eM r0 = r5.A03
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.FCE.A00(r1, r0)
            android.content.Context r0 = r5.requireContext()
            java.lang.Object r3 = X.DbZ.A0e(r0)
            if (r3 == 0) goto L_0x0fad
            android.content.ClipboardManager r3 = (android.content.ClipboardManager) r3
            java.lang.String r2 = "backup_codes"
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            android.widget.TextView r0 = r5.A00
            if (r0 != 0) goto L_0x0208
            java.lang.String r14 = "igKeyLineOne"
            goto L_0x0618
        L_0x0208:
            java.lang.CharSequence r0 = r0.getText()
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            android.widget.TextView r0 = r5.A01
            if (r0 != 0) goto L_0x0f94
            java.lang.String r14 = "igKeyLineTwo"
            goto L_0x0618
        L_0x021c:
            r0 = 165107856(0x9d75890, float:5.184265E-33)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.E25 r5 = (X.E25) r5
            com.instagram.ui.widget.edittext.ConfirmationCodeEditText r0 = r5.A0A
            if (r0 != 0) goto L_0x022f
            java.lang.String r14 = "confirmationCodeEditText"
            goto L_0x0618
        L_0x022f:
            X.0nA.A0N(r0)
            X.37D r4 = X.DbX.A0i(r5)
            if (r4 == 0) goto L_0x0fca
            X.4Go r0 = r5.A0T
            r4.A0Q(r0)
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            X.EW8 r0 = r5.A07
            if (r0 != 0) goto L_0x0249
            java.lang.String r14 = "twoFacClearMethod"
            goto L_0x0618
        L_0x0249:
            int r1 = r0.A00
            java.lang.String r0 = "arg_two_fac_clear_method"
            r3.putInt(r0, r1)
            android.os.Bundle r0 = r5.requireArguments()
            java.lang.String r1 = "argument_sms_two_factor_on"
            boolean r0 = r0.getBoolean(r1)
            r3.putBoolean(r1, r0)
            android.os.Bundle r0 = r5.requireArguments()
            java.lang.String r1 = "argument_whatsapp_two_factor_on"
            boolean r0 = r0.getBoolean(r1)
            r3.putBoolean(r1, r0)
            android.os.Bundle r0 = r5.requireArguments()
            java.lang.String r1 = "argument_totp_two_factor_on"
            boolean r0 = r0.getBoolean(r1)
            r3.putBoolean(r1, r0)
            java.lang.String r0 = r5.A0F
            if (r0 != 0) goto L_0x0fb2
            java.lang.String r14 = "smsNotAllowedReason"
            goto L_0x0618
        L_0x027f:
            r0 = -482802670(0xffffffffe3390412, float:-3.412941E21)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r3.A01
            X.E25 r3 = (X.E25) r3
            com.facebook.quicklog.QuickPerformanceLogger r2 = r3.A05
            if (r2 != 0) goto L_0x0292
            java.lang.String r14 = "qplLogger"
            goto L_0x0618
        L_0x0292:
            r1 = 203167632(0xc1c1790, float:1.2024893E-31)
            r0 = 4
            r2.markerEnd(r1, r0)
            X.0aP r2 = r3.A06
            if (r2 != 0) goto L_0x02a1
            java.lang.String r14 = "loggedOutSession"
            goto L_0x0618
        L_0x02a1:
            X.DiE r0 = r3.A0C
            if (r0 != 0) goto L_0x0fd1
            java.lang.String r14 = "twoFacStage"
            goto L_0x0618
        L_0x02a9:
            r0 = 361870380(0x1591b42c, float:5.8849295E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.E6g r5 = (X.C47520E6g) r5
            X.E9I r3 = r5.A05
            if (r3 == 0) goto L_0x02f5
            r4 = 1
            X.EAd r1 = r3.A00
            r1.A00 = r4
            java.util.ArrayList r1 = r5.A08
            if (r1 == 0) goto L_0x02f1
            int r2 = r1.size()
            r1 = 0
            r3.notifyItemRangeChanged(r1, r2)
            r5.A00 = r1
            java.util.ArrayList r1 = r5.A08
            if (r1 == 0) goto L_0x02f1
            java.util.Iterator r3 = X.AnonymousClass7TE.A1G(r1)
        L_0x02d3:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x02e9
            java.lang.Object r2 = X.AnonymousClass7TF.A0a(r3)
            java.util.HashMap r1 = r5.A09
            X.DbU.A1Y(r2, r1, r4)
            int r1 = r5.A00
            int r1 = r1 + 1
            r5.A00 = r1
            goto L_0x02d3
        L_0x02e9:
            X.C47520E6g.A01(r5)
            r1 = -5211323(0xffffffffffb07b45, float:NaN)
            goto L_0x0072
        L_0x02f1:
            java.lang.String r14 = "users"
            goto L_0x0618
        L_0x02f5:
            java.lang.String r14 = "selectableUserListAdapter"
            goto L_0x0618
        L_0x02f9:
            r0 = 1487014182(0x58a20926, float:1.42528141E15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E4Y r1 = (X.E4Y) r1
            X.E4Y.A01(r1)
            r1 = 1351088854(0x5087fad6, float:1.82509036E10)
            goto L_0x0072
        L_0x030c:
            r0 = -2053019988(0xffffffff85a166ac, float:-1.5178083E-35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E4Y r1 = (X.E4Y) r1
            X.E4Y.A02(r1)
            r1 = -1806910555(0xffffffff944cbba5, float:-1.0336374E-26)
            goto L_0x0072
        L_0x031f:
            r0 = -711002543(0xffffffffd59ef651, float:-2.18475948E13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.FFR.A03()
            java.lang.Object r5 = r3.A01
            X.ES3 r5 = (X.ES3) r5
            android.os.Bundle r4 = r5.requireArguments()
            r3 = 0
            r2 = 33
            r1 = 94
            java.lang.String r2 = X.Dbq.A05(r3, r2, r1)
            r1 = 1
            r4.putBoolean(r2, r1)
            java.lang.String r1 = "ARG_IS_ENABLING_WHATSAPP"
            r4.putBoolean(r1, r3)
            X.E3L r3 = new X.E3L
            r3.<init>()
            androidx.fragment.app.FragmentActivity r2 = X.DbU.A0I(r4, r3, r5)
            X.0eM r1 = r5.A00
            X.6Yo r2 = X.DbX.A0N(r2, r1)
            r1 = 116(0x74, float:1.63E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r2.A0A = r1
            r2.A0D(r3)
            r2.A04()
            r1 = -1183330610(0xffffffffb977cece, float:-2.3632796E-4)
            goto L_0x0072
        L_0x0365:
            r0 = -54132538(0xfffffffffcc600c6, float:-8.224724E36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            X.E2T r4 = (X.E2T) r4
            X.0eM r3 = r4.A03
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r3)
            java.lang.Integer r1 = X.AnonymousClass05K.A0u
            X.FCE.A00(r2, r1)
            X.F3Y r5 = X.FFR.A00()
            android.os.Bundle r6 = r4.requireArguments()
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            java.lang.String r9 = ""
            r10 = 0
            r8 = r7
            X.E2r r2 = r5.A01(r6, r7, r8, r9, r10)
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            X.Dbc.A0S(r2, r1, r3)
            r1 = -2096084169(0xffffffff83104b37, float:-4.240414E-37)
            goto L_0x0072
        L_0x0399:
            r0 = -1496178281(0xffffffffa6d22197, float:-1.4580782E-15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            X.E4M r4 = (X.E4M) r4
            X.F3Y r5 = X.FFR.A00()
            android.os.Bundle r6 = r4.requireArguments()
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            java.lang.Integer r8 = X.AnonymousClass05K.A0C
            java.lang.String r9 = ""
            r10 = 0
            X.E2r r3 = r5.A01(r6, r7, r8, r9, r10)
            android.os.Bundle r1 = r4.A00
            if (r1 == 0) goto L_0x05b1
            androidx.fragment.app.FragmentActivity r2 = X.DbU.A0I(r1, r3, r4)
            X.0eM r1 = r4.A04
            X.Dbc.A0S(r3, r2, r1)
            r1 = 963970461(0x3975059d, float:2.3367112E-4)
            goto L_0x0072
        L_0x03c9:
            r0 = 1629855370(0x61259e8a, float:1.9094604E20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E4M r1 = (X.E4M) r1
            X.E4M.A00(r1)
            r1 = 556673711(0x212e2aaf, float:5.9009984E-19)
            goto L_0x0072
        L_0x03dc:
            r0 = 178896196(0xaa9bd44, float:1.6345302E-32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E25 r1 = (X.E25) r1
            X.E25.A00(r1)
            r1 = -1439006463(0xffffffffaa3a8101, float:-1.6564876E-13)
            goto L_0x0072
        L_0x03ef:
            r0 = 1032928246(0x3d913bf6, float:0.07091515)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Dba.A1Q(r1)
            r1 = 1606340522(0x5fbecfaa, float:2.749879E19)
            goto L_0x0072
        L_0x0400:
            r0 = -99019444(0xfffffffffa19154c, float:-1.9871334E35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.E2h r5 = (X.C47435E2h) r5
            X.0eM r4 = r5.A06
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r4)
            java.lang.Integer r1 = X.AnonymousClass05K.A0u
            X.FCE.A00(r2, r1)
            android.os.Bundle r3 = r5.A00
            if (r3 == 0) goto L_0x0445
            X.FFR.A03()
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r2 = "direct_launch_backup_codes"
            boolean r1 = r1.getBoolean(r2)
            r3.putBoolean(r2, r1)
            X.ESP r1 = new X.ESP
            r1.<init>()
            r1.setArguments(r3)
            X.6Yo r2 = X.DbZ.A0P(r5, r4)
            r2.A0D(r1)
            r1 = 1
            r2.A0F = r1
            java.lang.String r1 = X.Dbb.A0X()
            r2.A0A = r1
            r2.A04()
        L_0x0445:
            r1 = -1418096771(0xffffffffab798f7d, float:-8.86617E-13)
            goto L_0x0072
        L_0x044a:
            r0 = -1892412336(0xffffffff8f341450, float:-8.878597E-30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r3.A01
            X.E2h r3 = (X.C47435E2h) r3
            X.0eM r1 = r3.A06
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r1)
            r1.getValue()
            r1 = 2131975702(0x7f135e16, float:1.9588504E38)
            X.FGN.A04(r3, r2, r1)
            r1 = -1248975547(0xffffffffb58e2545, float:-1.0590671E-6)
            goto L_0x0072
        L_0x0469:
            r0 = 1264369332(0x4b5cbeb4, float:1.446674E7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E4K r1 = (X.E4K) r1
            X.E4K.A00(r1)
            r1 = 508787145(0x1e5379c9, float:1.11954316E-20)
            goto L_0x0072
        L_0x047c:
            r0 = 1648262477(0x623e7d4d, float:8.7847756E20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r3.A01
            X.E4K r3 = (X.E4K) r3
            X.0eM r1 = r3.A09
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r1)
            r1.getValue()
            r1 = 2131975702(0x7f135e16, float:1.9588504E38)
            X.FGN.A04(r3, r2, r1)
            r1 = 2102148197(0x7d4c3c65, float:1.6967256E37)
            goto L_0x0072
        L_0x049b:
            r0 = 1651130292(0x626a3fb4, float:1.0802821E21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E3L r1 = (X.E3L) r1
            X.E3L.A00(r1)
            r1 = 1845858926(0x6e05926e, float:1.0334632E28)
            goto L_0x0072
        L_0x04ae:
            r0 = -179722945(0xfffffffff549a53f, float:-2.5561603E32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E2r r1 = (X.C47445E2r) r1
            X.C47445E2r.A00(r1)
            r1 = 2079815512(0x7bf77758, float:2.5698358E36)
            goto L_0x0072
        L_0x04c1:
            r0 = 1134229448(0x439af7c8, float:309.9358)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.FFR.A03()
            java.lang.Object r4 = r3.A01
            X.ESP r4 = (X.ESP) r4
            android.os.Bundle r1 = r4.A00
            if (r1 == 0) goto L_0x05b1
            X.E2M r3 = new X.E2M
            r3.<init>()
            androidx.fragment.app.FragmentActivity r2 = X.DbU.A0I(r1, r3, r4)
            X.0eM r1 = r4.A05
            X.Dbc.A0S(r3, r2, r1)
            r1 = 1602889097(0x5f8a2589, float:1.9909026E19)
            goto L_0x0072
        L_0x04e6:
            r0 = -1386317031(0xffffffffad5e7b19, float:-1.2646572E-11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r3.A01
            X.ESP r3 = (X.ESP) r3
            X.0eM r1 = r3.A04
            java.lang.Object r2 = r1.getValue()
            android.os.Handler r2 = (android.os.Handler) r2
            X.0eM r1 = r3.A07
            java.lang.Object r1 = r1.getValue()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r2.post(r1)
            r1 = 1184023613(0x4692c43d, float:18786.12)
            goto L_0x0072
        L_0x0509:
            r0 = -194118546(0xfffffffff46dfc6e, float:-7.542079E31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r3.A01
            X.ESP r3 = (X.ESP) r3
            r1 = 0
            r3.A01 = r1
            X.0eM r1 = r3.A04
            java.lang.Object r2 = r1.getValue()
            android.os.Handler r2 = (android.os.Handler) r2
            X.0eM r1 = r3.A06
            java.lang.Object r1 = r1.getValue()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r2.post(r1)
            r1 = -2042392305(0xffffffff8643910f, float:-3.6781996E-35)
            goto L_0x0072
        L_0x052f:
            r0 = 1581564914(0x5e44c3f2, float:3.54461053E18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.FFR.A03()
            java.lang.Object r3 = r3.A01
            X.ESP r3 = (X.ESP) r3
            android.os.Bundle r1 = r3.A00
            if (r1 == 0) goto L_0x05b1
            X.ESD r5 = new X.ESD
            r5.<init>()
            androidx.fragment.app.FragmentActivity r2 = X.DbU.A0I(r1, r5, r3)
            X.0eM r1 = r3.A05
            X.6Yo r4 = X.DbX.A0N(r2, r1)
            r3 = 487(0x1e7, float:6.82E-43)
            r2 = 38
            r1 = 21
            java.lang.String r1 = X.Dbq.A05(r3, r2, r1)
            r4.A0A = r1
            r4.A0D(r5)
            r4.A04()
            r1 = -404298444(0xffffffffe7e6e534, float:-2.1807447E24)
            goto L_0x0072
        L_0x0567:
            r0 = 482463972(0x1cc1d0e4, float:1.2825666E-21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.FFR.A03()
            java.lang.Object r4 = r3.A01
            X.ESP r4 = (X.ESP) r4
            android.os.Bundle r1 = r4.A00
            if (r1 == 0) goto L_0x05b1
            X.ES3 r3 = new X.ES3
            r3.<init>()
            androidx.fragment.app.FragmentActivity r2 = X.DbU.A0I(r1, r3, r4)
            X.0eM r1 = r4.A05
            X.Dbc.A0S(r3, r2, r1)
            r1 = -661112658(0xffffffffd89838ae, float:-1.33895364E15)
            goto L_0x0072
        L_0x058c:
            r0 = 182461012(0xae02254, float:2.1583328E-32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.FFR.A03()
            java.lang.Object r4 = r3.A01
            X.ESP r4 = (X.ESP) r4
            android.os.Bundle r1 = r4.A00
            if (r1 == 0) goto L_0x05b1
            X.ES6 r3 = new X.ES6
            r3.<init>()
            androidx.fragment.app.FragmentActivity r2 = X.DbU.A0I(r1, r3, r4)
            X.0eM r1 = r4.A05
            X.Dbc.A0S(r3, r2, r1)
            r1 = 167406334(0x9fa6afe, float:6.0285926E-33)
            goto L_0x0072
        L_0x05b1:
            java.lang.String r14 = "twoFacResponseBundle"
            goto L_0x0618
        L_0x05b4:
            r0 = -1375179614(0xffffffffae086ca2, float:-3.1019305E-11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.ESP r1 = (X.ESP) r1
            r1.onBackPressed()
            r1 = -1621273413(0xffffffff9f5d54bb, float:-4.6868658E-20)
            goto L_0x0072
        L_0x05c7:
            r0 = -940469680(0xffffffffc7f19250, float:-123684.625)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            X.8ab r3 = X.DbW.A0U(r4)
            r1 = 2131975652(0x7f135de4, float:1.9588402E38)
            r3.A09(r1)
            r1 = 2131975649(0x7f135de1, float:1.9588396E38)
            r3.A08(r1)
            r1 = 1
            r3.A0r(r1)
            r2 = 2131975651(0x7f135de3, float:1.95884E38)
            r1 = 0
            r3.A0I(r1, r2)
            r2 = 2131975650(0x7f135de2, float:1.9588398E38)
            r1 = 16
            X.FJf r1 = X.C50020FJf.A00(r4, r1)
            r3.A0G(r1, r2)
            X.DbT.A1V(r3)
            r1 = -192803561(0xfffffffff4820d17, float:-8.24297E31)
            goto L_0x0072
        L_0x0601:
            r0 = 1932922930(0x73361032, float:1.4424538E31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            X.E3u r4 = (X.C47470E3u) r4
            X.0eM r1 = r4.A03
            X.0lg r3 = X.DbT.A0X(r1)
            java.lang.String r2 = r4.A01
            if (r2 != 0) goto L_0x0620
            java.lang.String r14 = "currPhoneNumber"
        L_0x0618:
            X.0qQ.A0F(r14)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0620:
            java.lang.String r1 = X.DbZ.A0i(r4)
            X.0qQ.A07(r1)
            X.1OC r2 = X.C49930FFj.A00(r3, r2, r1)
            X.1P0 r1 = r4.A02
            r2.A00 = r1
            r4.schedule(r2)
            r1 = -230193237(0xfffffffff24787ab, float:-3.952098E30)
            goto L_0x0072
        L_0x0637:
            r0 = 1462680993(0x572ebda1, float:1.92129473E14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r3.A01
            X.E3w r3 = (X.C47472E3w) r3
            X.0eM r1 = r3.A00
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            X.FGN.A05(r2, r1)
            r1 = 1200895617(0x47943681, float:75885.01)
            goto L_0x0072
        L_0x0654:
            r0 = 1445453601(0x5627df21, float:4.6144193E13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.E3w r5 = (X.C47472E3w) r5
            X.0eM r6 = r5.A00
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r6)
            java.lang.Integer r1 = X.AnonymousClass05K.A0u
            X.FCE.A00(r2, r1)
            java.lang.String r3 = "Duo Mobile"
            android.os.Bundle r2 = r5.requireArguments()
            java.lang.String r1 = "arg_two_fac_app_name"
            java.lang.String r1 = r2.getString(r1)
            boolean r4 = r3.equals(r1)
            r3 = 159(0x9f, float:2.23E-43)
            r2 = 38
            r1 = 122(0x7a, float:1.71E-43)
            if (r4 == 0) goto L_0x0688
            r3 = 134(0x86, float:1.88E-43)
            r2 = 25
            r1 = 105(0x69, float:1.47E-43)
        L_0x0688:
            java.lang.String r2 = X.Dbq.A05(r3, r2, r1)
            android.content.Context r1 = r5.requireContext()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            boolean r1 = X.0oI.A0I(r1, r2)
            if (r1 == 0) goto L_0x06b1
            X.0lg r4 = X.DbT.A0X(r6)
            android.content.Context r3 = r5.requireContext()
            r2 = 20
            X.EDi r1 = new X.EDi
            r1.<init>(r5, r2)
            X.C49930FFj.A02(r3, r1, r4)
        L_0x06ac:
            r1 = 302633788(0x1209d33c, float:4.3489944E-28)
            goto L_0x0072
        L_0x06b1:
            X.8ab r3 = X.DbW.A0U(r5)
            r1 = 2131975637(0x7f135dd5, float:1.9588372E38)
            r3.A09(r1)
            r1 = 2131975635(0x7f135dd3, float:1.9588368E38)
            r3.A08(r1)
            r2 = 2131968921(0x7f134399, float:1.957475E38)
            r1 = 15
            X.C50020FJf.A01(r3, r5, r1, r2)
            X.FJG r1 = X.FJG.A00
            X.DbX.A16(r1, r3)
            goto L_0x06ac
        L_0x06cf:
            r0 = 1199516998(0x477f2d46, float:65325.273)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r3.A01
            X.E3v r3 = (X.C47471E3v) r3
            X.0eM r1 = r3.A00
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            X.FGN.A05(r2, r1)
            r1 = 1017063976(0x3c9f2a28, float:0.019429281)
            goto L_0x0072
        L_0x06ec:
            r0 = 940156239(0x3809a54f, float:3.28173E-5)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.E3v r5 = (X.C47471E3v) r5
            X.0eM r1 = r5.A00
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r1)
            java.lang.Integer r1 = X.AnonymousClass05K.A0u
            X.FCE.A00(r2, r1)
            android.content.Context r4 = r5.requireContext()
            X.8ab r3 = X.DbS.A0Y(r4)
            r1 = 2131975637(0x7f135dd5, float:1.9588372E38)
            r3.A09(r1)
            r1 = 2131975636(0x7f135dd4, float:1.958837E38)
            X.DbU.A17(r4, r3, r1)
            r2 = 2131968921(0x7f134399, float:1.957475E38)
            r1 = 27
            X.C50025FJk.A01(r3, r4, r5, r1, r2)
            X.FJF r1 = X.FJF.A00
            X.DbX.A16(r1, r3)
            r1 = 408308359(0x18564a87, float:2.7696478E-24)
            goto L_0x0072
        L_0x0728:
            r0 = -2099145135(0xffffffff82e19651, float:-3.3147056E-37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r3.A01
            X.E4L r3 = (X.E4L) r3
            X.0eM r1 = r3.A01
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            X.FGN.A05(r2, r1)
            r1 = -2030689978(0xffffffff86f62146, float:-9.2583806E-35)
            goto L_0x0072
        L_0x0745:
            r0 = 1376572630(0x520cd4d6, float:1.51216554E11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.E4L r5 = (X.E4L) r5
            X.0eM r3 = r5.A01
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r3)
            java.lang.Integer r2 = X.AnonymousClass05K.A0u
            X.FCE.A00(r1, r2)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r3)
            X.FCE.A00(r1, r2)
            android.content.Context r4 = r5.requireContext()
            X.0qQ.A0A(r4)
            android.content.pm.PackageManager r2 = r4.getPackageManager()
            java.lang.String r1 = X.Dbb.A0U()
            boolean r2 = X.0oI.A0I(r2, r1)
            boolean r1 = X.Dbc.A11(r4)
            if (r2 != 0) goto L_0x07ab
            if (r1 != 0) goto L_0x07ab
            X.8ab r3 = X.DbS.A0Y(r4)
            r1 = 2131975631(0x7f135dcf, float:1.958836E38)
            r3.A09(r1)
            r1 = 2131975628(0x7f135dcc, float:1.9588354E38)
            r3.A08(r1)
            r2 = 2131975629(0x7f135dcd, float:1.9588356E38)
            r1 = 26
            X.C50025FJk.A01(r3, r4, r5, r1, r2)
            r2 = 2131975630(0x7f135dce, float:1.9588358E38)
            r1 = 14
            X.FJf r1 = X.C50020FJf.A00(r5, r1)
            r3.A0G(r1, r2)
            X.FJE r1 = X.FJE.A00
            X.DbX.A16(r1, r3)
        L_0x07a6:
            r1 = 281402208(0x10c5db60, float:7.80408E-29)
            goto L_0x0072
        L_0x07ab:
            X.E4L.A00(r5)
            goto L_0x07a6
        L_0x07af:
            r0 = -1007823486(0xffffffffc3edd582, float:-475.66803)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E2M r1 = (X.E2M) r1
            androidx.fragment.app.FragmentActivity r2 = r1.requireActivity()
            X.0eM r1 = r1.A05
            X.6Yo r3 = X.DbX.A0N(r2, r1)
            java.lang.String r2 = X.Dbb.A0X()
            r1 = 0
            r3.A0G(r2, r1)
            r1 = 1059773223(0x3f2adb27, float:0.6674065)
            goto L_0x0072
        L_0x07d1:
            r0 = 266432721(0xfe170d1, float:2.2230168E-29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.E4T r5 = (X.E4T) r5
            android.os.Bundle r4 = r5.A00
            if (r4 == 0) goto L_0x07f7
            r2 = 1
            java.lang.String r1 = "KEY_SHOULD_SHOW_SKIP_BUTTON"
            r4.putBoolean(r1, r2)
            X.FFR.A03()
            X.E2M r3 = new X.E2M
            r3.<init>()
            androidx.fragment.app.FragmentActivity r2 = X.DbU.A0I(r4, r3, r5)
            X.0eM r1 = r5.A08
            X.Dbc.A0S(r3, r2, r1)
        L_0x07f7:
            r1 = -1962932811(0xffffffff8b0005b5, float:-2.4656197E-32)
            goto L_0x0072
        L_0x07fc:
            r0 = 1518377852(0x5a809b7c, float:1.80998769E16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E4T r1 = (X.E4T) r1
            r1.onBackPressed()
            r1 = -255103150(0xfffffffff0cb6f52, float:-5.0368028E29)
            goto L_0x0072
        L_0x080f:
            r0 = -1497509029(0xffffffffa6bdd35b, float:-1.3171797E-15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.E4a r5 = (X.C47476E4a) r5
            long r3 = java.lang.System.currentTimeMillis()
            long r6 = X.1Q0.A00()
            X.0aP r1 = r5.A05
            X.0wc r2 = X.AnonymousClass0kN.A02(r1)
            java.lang.String r1 = "no_access_tapped"
            X.0Aj r8 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r8.isSampled()
            if (r1 == 0) goto L_0x0853
            X.DbY.A1E(r8, r3, r6)
            X.DbT.A1P(r8)
            java.lang.String r1 = "recovery_page"
            X.DbS.A1H(r8, r1)
            double r1 = (double) r6
            X.DbZ.A1F(r8, r1)
            double r1 = (double) r3
            X.DbW.A13(r8, r1)
            X.DbY.A1A(r8)
            X.0aP r1 = r5.A05
            java.lang.String r1 = X.DbZ.A0m(r1)
            X.DbV.A1H(r8, r1)
        L_0x0853:
            android.content.Context r4 = r5.requireContext()
            X.0aP r3 = r5.A05
            java.lang.String r2 = r5.A08
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.1OC r3 = X.FHA.A01(r4, r3, r1, r2)
            X.0aP r2 = r5.A05
            X.EQR r1 = new X.EQR
            r1.<init>(r5, r2)
            r3.A00 = r1
            r5.schedule(r3)
            r1 = 1836967281(0x6d7de571, float:4.9110678E27)
            goto L_0x0072
        L_0x0872:
            r0 = 1340199310(0x4fe1d18e, float:7.577214E9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.E4a r5 = (X.C47476E4a) r5
            java.lang.String r1 = "client_check_non_sms_code"
            X.C47476E4a.A01(r5, r1)
            X.1Q0 r2 = X.1Q0.A1A
            X.0aP r1 = r5.A05
            X.FGI r1 = r2.A02(r1)
            X.DiE r4 = X.C46634DiE.A1J
            r9 = 0
            X.0xI r8 = r1.A05(r9, r4)
            android.os.Bundle r1 = r5.mArguments
            X.FEx r7 = X.C49922FEx.A00(r1)
            java.util.List r1 = r5.A0A
            int r2 = r1.size()
            android.os.Bundle r6 = r7.A00
            X.EUp r1 = X.C48071EUp.A03
            java.lang.String r1 = X.DbX.A0s(r1)
            r6.putInt(r1, r2)
            java.util.List r3 = r5.A0A
            X.EUp r1 = X.C48071EUp.A05
            java.lang.String r2 = X.DbX.A0s(r1)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r3)
            r6.putStringArrayList(r2, r1)
            r7.A03(r8)
            X.0aP r1 = r5.A05
            X.DbU.A1R(r8, r1)
            android.content.Context r7 = r5.requireContext()
            X.0aP r8 = r5.A05
            java.lang.String r11 = r5.A08
            r13 = 0
            r14 = 1
            r10 = r9
            r12 = r9
            X.1OC r3 = X.FHA.A00(r7, r8, r9, r10, r11, r12, r13, r14)
            X.0aP r2 = r5.A05
            X.EML r1 = new X.EML
            r1.<init>(r5, r2, r5, r4)
            r3.A00 = r1
            r5.schedule(r3)
            r1 = -1711589541(0xffffffff99fb375b, float:-2.597515E-23)
            goto L_0x0072
        L_0x08e0:
            r0 = 1301653189(0x4d95a6c5, float:3.13841824E8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            X.E4a r4 = (X.C47476E4a) r4
            java.lang.String r1 = "client_check_non_sms_code"
            X.C47476E4a.A01(r4, r1)
            long r7 = java.lang.System.currentTimeMillis()
            long r5 = X.1Q0.A00()
            X.0aP r1 = r4.A05
            X.0wc r2 = X.AnonymousClass0kN.A02(r1)
            java.lang.String r1 = "recovery_email"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r3.isSampled()
            if (r1 == 0) goto L_0x0970
            X.DbY.A1E(r3, r7, r5)
            X.DbW.A11(r3)
            java.lang.Boolean r2 = X.AnonymousClass7TE.A0v()
            java.lang.String r1 = "one_click"
            r3.A7p(r1, r2)
            X.DbT.A1O(r3)
            double r1 = (double) r5
            X.DbW.A12(r3, r1)
            X.DbW.A14(r3, r7)
            java.lang.String r1 = "recovery_page"
            X.DbS.A1H(r3, r1)
            X.DbY.A1A(r3)
            X.C49922FEx.A01(r3, r4)
            X.FEx r1 = r4.A06
            android.os.Bundle r2 = r1.A00
            X.EUp r1 = X.C48071EUp.A08
            java.lang.String r1 = X.DbX.A0s(r1)
            java.lang.Boolean r2 = X.DbU.A0g(r2, r1)
            java.lang.String r1 = "prefill_given_match"
            r3.A7p(r1, r2)
            X.FEx r1 = r4.A06
            android.os.Bundle r2 = r1.A00
            X.EUp r1 = X.C48071EUp.A0C
            java.lang.String r1 = X.DbX.A0s(r1)
            java.lang.Boolean r2 = X.DbU.A0g(r2, r1)
            java.lang.String r1 = "was_from_recovery_flow"
            r3.A7p(r1, r2)
            X.FEx r1 = r4.A06
            android.os.Bundle r2 = r1.A00
            X.EUp r1 = X.C48071EUp.A04
            java.lang.String r1 = X.DbX.A0s(r1)
            java.lang.String r2 = r2.getString(r1)
            java.lang.String r1 = "cp_prefill_type"
            r3.AAJ(r1, r2)
            X.0aP r1 = r4.A05
            java.lang.String r1 = X.DbZ.A0m(r1)
            X.DbV.A1H(r3, r1)
        L_0x0970:
            android.content.Context r3 = r4.requireContext()
            X.0aP r2 = r4.A05
            java.lang.String r1 = r4.A08
            X.1OC r2 = X.FHA.A02(r3, r2, r1)
            X.ENf r1 = new X.ENf
            r1.<init>(r4)
            r2.A00 = r1
            r4.schedule(r2)
            r1 = -567088786(0xffffffffde32e96e, float:-3.22298909E18)
            goto L_0x0072
        L_0x098b:
            r0 = -1685527556(0xffffffff9b88e3fc, float:-2.2646644E-22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r3.A01
            X.E4a r7 = (X.C47476E4a) r7
            X.02m r1 = X.02m.A0p
            r4 = 725096125(0x2b3816bd, float:6.540149E-13)
            r1.markerStart(r4)
            java.lang.String r1 = "client_check_send_sms_code"
            X.C47476E4a.A01(r7, r1)
            boolean r1 = r7.A0E
            java.lang.String r3 = "recovery_type"
            X.02m r2 = X.02m.A0p
            if (r1 == 0) goto L_0x0a10
            java.lang.String r1 = "sms_autoconf"
            r2.markerAnnotate(r4, r3, r1)
            java.lang.String r1 = "client_check_initiate_view_showed_test_group"
            X.C47476E4a.A01(r7, r1)
            X.S6k r1 = X.LQc.A07
            android.content.Context r1 = r7.requireContext()
            X.LQc r11 = new X.LQc
            r11.<init>(r1)
            X.0aP r9 = r7.A05
            java.lang.String r14 = r7.A08
            X.DiE r12 = X.C46634DiE.A1J
            X.EMM r8 = new X.EMM
            r8.<init>(r7, r9, r7, r12)
            android.view.View r6 = r7.A02
            r5 = 0
            X.EMS r10 = new X.EMS
            r10.<init>(r7, r5)
            java.lang.String r3 = "recovery_page"
            X.FFx r2 = X.C49944FFx.A00
            r1 = 1172(0x494, float:1.642E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r2.A02(r9, r3, r1)
            X.SGz r1 = r11.A01
            int r4 = r1.A00()
            r1 = 1
            if (r4 < r1) goto L_0x0a03
            r1 = 1168(0x490, float:1.637E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r2.A02(r9, r3, r1)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r5)
            X.KHC r5 = new X.KHC
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.1ES.A03(r5)
        L_0x09fe:
            r1 = -1545260938(0xffffffffa3e53076, float:-2.4848754E-17)
            goto L_0x0072
        L_0x0a03:
            r1 = 1169(0x491, float:1.638E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r2.A02(r9, r3, r1)
            r10.A01()
            goto L_0x09fe
        L_0x0a10:
            java.lang.String r1 = "sms_phone"
            r2.markerAnnotate(r4, r3, r1)
            java.lang.String r1 = "client_check_initiate_view_showed_control_group"
            X.C47476E4a.A01(r7, r1)
            X.C47476E4a.A00(r7)
            goto L_0x09fe
        L_0x0a1e:
            java.lang.Object r4 = r3.A01
            X.E2J r4 = (X.E2J) r4
            java.lang.String r1 = r4.A01
            if (r1 == 0) goto L_0x0075
            android.content.Context r0 = r4.getContext()
            java.lang.String r0 = X.SQU.A01(r0, r1)
            android.content.Context r3 = r4.getContext()
            X.0aP r2 = r4.A00
            X.SFz r1 = new X.SFz
            r1.<init>((java.lang.String) r0)
            r0 = 2131963313(0x7f132db1, float:1.9563376E38)
            java.lang.String r0 = r4.getString(r0)
            X.Dba.A0q(r3, r2, r1, r0)
            return
        L_0x0a44:
            r0 = -237454414(0xfffffffff1d8bbb2, float:-2.1464215E30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r3.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            android.view.View r1 = r1.getCurrentFocus()
            if (r1 == 0) goto L_0x0a5c
            X.0nA.A0N(r1)
        L_0x0a5c:
            X.0hq r2 = r3.mFragmentManager
            android.os.Bundle r1 = r3.mArguments
            X.C49958FGq.A04(r1, r2)
            r1 = -1733227971(0xffffffff98b10a3d, float:-4.5763766E-24)
            goto L_0x0072
        L_0x0a68:
            r0 = -1002893101(0xffffffffc43910d3, float:-740.2629)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.E1v r5 = (X.C47427E1v) r5
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r5.A07
            android.text.Editable r1 = r1.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0a93
            android.widget.CheckBox r1 = r5.A00
            boolean r1 = r1.isChecked()
            if (r1 != 0) goto L_0x0a9e
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r5.A06
            android.text.Editable r1 = r1.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0a9e
        L_0x0a93:
            r1 = 2131974792(0x7f135a88, float:1.9586658E38)
            X.DbZ.A0s(r1)
            r1 = 1744311061(0x67f81315, float:2.3429978E24)
            goto L_0x0072
        L_0x0a9e:
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r5.A07
            android.text.Editable r1 = r1.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0adb
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r5.A07
            android.text.Editable r1 = r1.getText()
            boolean r1 = X.0mp.A0C(r1)
            if (r1 == 0) goto L_0x0adb
        L_0x0ab6:
            android.widget.RadioGroup r1 = r5.A02
            int r1 = r1.getCheckedRadioButtonId()
            r4 = -1
            if (r1 == r4) goto L_0x0c26
            android.widget.EditText r1 = r5.A01
            android.text.Editable r1 = r1.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0af4
            r1 = 2131974791(0x7f135a87, float:1.9586656E38)
            X.DbZ.A0s(r1)
            android.widget.EditText r1 = r5.A01
            r1.requestFocus()
            r1 = -334240821(0xffffffffec13e3cb, float:-7.151513E26)
            goto L_0x0072
        L_0x0adb:
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r5.A06
            android.text.Editable r1 = r1.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0c31
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r5.A06
            android.text.Editable r1 = r1.getText()
            boolean r1 = X.0mp.A0C(r1)
            if (r1 == 0) goto L_0x0c31
            goto L_0x0ab6
        L_0x0af4:
            android.os.Bundle r3 = r5.requireArguments()
            X.EVZ[] r2 = X.EVZ.values()
            java.lang.String r1 = "flow_key"
            int r1 = r3.getInt(r1)
            r3 = r2[r1]
            X.EVZ r1 = X.EVZ.ARGUMENT_TWO_FAC_LOGIN_SUPPORT_FLOW
            java.lang.String r2 = "ARGUMENT_OMNISTRING"
            if (r3 != r1) goto L_0x0b87
            android.content.Context r11 = r5.getContext()
            X.0aP r4 = r5.A04
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r3 = r1.getString(r2)
            android.os.Bundle r2 = r5.requireArguments()
            java.lang.String r1 = "ARGUMENT_TWOFAC_IDENTIFIER"
            java.lang.String r8 = r2.getString(r1)
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r5.A07
            java.lang.String r7 = X.AnonymousClass7TF.A0f(r1)
            android.widget.CheckBox r1 = r5.A00
            boolean r1 = r1.isChecked()
            if (r1 == 0) goto L_0x0b84
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r5.A07
        L_0x0b32:
            java.lang.String r6 = X.AnonymousClass7TF.A0f(r1)
            java.lang.String r2 = X.C47427E1v.A00(r5)
            android.widget.EditText r1 = r5.A01
            java.lang.String r10 = X.AnonymousClass7TF.A0f(r1)
            X.1NY r9 = X.DbU.A0N(r4)
            java.lang.String r1 = "accounts/two_factor_login_report/"
            r9.A0A(r1)
            X.DbW.A1D(r9)
            java.lang.String r1 = X.DcV.A01()
            r9.A9m(r1, r3)
            r4 = 124(0x7c, float:1.74E-43)
            r3 = 21
            r1 = 30
            java.lang.String r1 = X.DcV.A02(r4, r3, r1)
            X.DbZ.A0x(r11, r9, r1, r8)
            java.lang.String r1 = "signup_email"
            r9.A9m(r1, r7)
            java.lang.String r1 = "contact_email"
            r9.A9m(r1, r6)
            java.lang.String r1 = "account_type"
        L_0x0b6c:
            r9.A9m(r1, r2)
            java.lang.String r1 = "additional_info"
            r9.A9m(r1, r10)
            X.1OC r2 = X.DbW.A0K(r9)
            X.1P0 r1 = r5.A09
            r2.A00 = r1
            r5.schedule(r2)
        L_0x0b7f:
            r1 = -1892204684(0xffffffff8f373f74, float:-9.034817E-30)
            goto L_0x0072
        L_0x0b84:
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r5.A06
            goto L_0x0b32
        L_0x0b87:
            android.widget.RadioGroup r1 = r5.A03
            int r1 = r1.getCheckedRadioButtonId()
            if (r1 == r4) goto L_0x0c1e
            android.content.Context r8 = r5.getContext()
            X.0aP r9 = r5.A04
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r7 = r1.getString(r2)
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r5.A07
            java.lang.String r6 = X.AnonymousClass7TF.A0f(r1)
            android.widget.CheckBox r1 = r5.A00
            boolean r1 = r1.isChecked()
            if (r1 == 0) goto L_0x0c1b
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r5.A07
        L_0x0bad:
            java.lang.String r4 = X.AnonymousClass7TF.A0f(r1)
            java.lang.String r3 = X.C47427E1v.A00(r5)
            android.widget.RadioGroup r1 = r5.A03
            int r2 = r1.getCheckedRadioButtonId()
            r1 = 2131432607(0x7f0b149f, float:1.8486976E38)
            if (r2 != r1) goto L_0x0c00
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x0bc2:
            int r1 = r1.intValue()
            switch(r1) {
                case 0: goto L_0x0bf7;
                case 1: goto L_0x0bfd;
                case 2: goto L_0x0bfa;
                default: goto L_0x0bc9;
            }
        L_0x0bc9:
            java.lang.String r2 = "OTHER"
        L_0x0bcb:
            android.widget.EditText r1 = r5.A01
            java.lang.String r10 = X.AnonymousClass7TF.A0f(r1)
            X.1NY r9 = X.DbU.A0N(r9)
            java.lang.String r1 = "users/vetted_device_login_support/"
            r9.A0A(r1)
            X.DbW.A1D(r9)
            java.lang.String r1 = X.DcV.A01()
            X.DbZ.A0x(r8, r9, r1, r7)
            java.lang.String r1 = "signup_email"
            r9.A9m(r1, r6)
            java.lang.String r1 = "contact_email"
            r9.A9m(r1, r4)
            java.lang.String r1 = "account_type"
            r9.A9m(r1, r3)
            java.lang.String r1 = "reason_failed"
            goto L_0x0b6c
        L_0x0bf7:
            java.lang.String r2 = "FORGOT_EMAIL"
            goto L_0x0bcb
        L_0x0bfa:
            java.lang.String r2 = "ACCOUNT_HACKED"
            goto L_0x0bcb
        L_0x0bfd:
            java.lang.String r2 = "CANNOT_LOGIN_WITH_EMAIL"
            goto L_0x0bcb
        L_0x0c00:
            r1 = 2131432610(0x7f0b14a2, float:1.8486982E38)
            if (r2 != r1) goto L_0x0c08
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x0bc2
        L_0x0c08:
            r1 = 2131432606(0x7f0b149e, float:1.8486974E38)
            if (r2 != r1) goto L_0x0c10
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x0bc2
        L_0x0c10:
            r1 = 2131432608(0x7f0b14a0, float:1.8486978E38)
            if (r2 != r1) goto L_0x0c18
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            goto L_0x0bc2
        L_0x0c18:
            java.lang.String r2 = ""
            goto L_0x0bcb
        L_0x0c1b:
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r5.A06
            goto L_0x0bad
        L_0x0c1e:
            r1 = 2131961057(0x7f1324e1, float:1.95588E38)
            X.DbZ.A0s(r1)
            goto L_0x0b7f
        L_0x0c26:
            r1 = 2131974790(0x7f135a86, float:1.9586654E38)
            X.DbZ.A0s(r1)
            r1 = -954387586(0xffffffffc71d337e, float:-40243.492)
            goto L_0x0072
        L_0x0c31:
            r1 = 2131975676(0x7f135dfc, float:1.9588451E38)
            X.DbZ.A0s(r1)
            r1 = 780777914(0x2e89b9ba, float:6.2630304E-11)
            goto L_0x0072
        L_0x0c3c:
            r0 = -725974862(0xffffffffd4ba80b2, float:-6.4081845E12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Dba.A1Q(r1)
            r1 = -1492138441(0xffffffffa70fc637, float:-1.995269E-15)
            goto L_0x0072
        L_0x0c4d:
            r0 = -1573813645(0xffffffffa2318273, float:-2.4057032E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E2u r1 = (X.C47448E2u) r1
            X.C47448E2u.A00(r1)
            r1 = 1871514325(0x6f8d0ad5, float:8.730096E28)
            goto L_0x0072
        L_0x0c60:
            r0 = -822848713(0xffffffffcef45337, float:-2.04954714E9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            X.E2u r2 = (X.C47448E2u) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A0F
            if (r1 == 0) goto L_0x0c78
            boolean r1 = r1.isEnabled()
            if (r1 == 0) goto L_0x0c78
            X.C47448E2u.A00(r2)
        L_0x0c78:
            r1 = 6250458(0x5f5fda, float:8.758757E-39)
            goto L_0x0072
        L_0x0c7d:
            r0 = 1722221615(0x66a7042f, float:3.943562E23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E5C r1 = (X.E5C) r1
            X.E5C.A02(r1)
            r1 = 1470976831(0x57ad533f, float:3.81146102E14)
            goto L_0x0072
        L_0x0c90:
            r0 = -2099814345(0xffffffff82d76037, float:-3.1646635E-37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r3.A01
            X.E5C r2 = (X.E5C) r2
            java.lang.String r1 = X.E5C.__redex_internal_original_name
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r2.A08
            boolean r1 = r1.isEnabled()
            if (r1 == 0) goto L_0x0ca8
            X.E5C.A02(r2)
        L_0x0ca8:
            r1 = 1794111455(0x6aeff7df, float:1.450519E26)
            goto L_0x0072
        L_0x0cad:
            r0 = -861284450(0xffffffffcca9d79e, float:-8.9046256E7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.FBf r4 = X.C49881FBf.A00
            java.lang.Object r3 = r3.A01
            X.E4d r3 = (X.C47478E4d) r3
            X.0aP r2 = r3.A05
            java.lang.String r1 = "password_reset"
            r4.A02(r2, r1)
            X.C47478E4d.A02(r3)
            r1 = 1114369861(0x426bef45, float:58.98366)
            goto L_0x0072
        L_0x0cc9:
            r0 = -1736296107(0xffffffff98823955, float:-3.3662103E-24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Object r3 = r3.A01
            X.E4i r3 = (X.C47483E4i) r3
            X.0aP r4 = r3.A07
            r13 = 0
            X.0wc r5 = X.AnonymousClass0kN.A01(r13, r4)
            java.lang.String r4 = "forgot_facebook"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r5, r4)
            double r4 = (double) r1
            double r1 = X.DbS.A00()
            X.DbY.A1D(r6, r4, r1)
            X.DbW.A11(r6)
            X.DbW.A13(r6, r4)
            java.lang.Boolean r2 = X.AnonymousClass7TE.A0u()
            java.lang.String r1 = "no_reset"
            r6.A7p(r1, r2)
            X.DiE r7 = X.C46634DiE.A1j
            java.lang.String r1 = "user_lookup"
            X.DbS.A1H(r6, r1)
            r6.Cgf()
            X.FV8 r2 = X.FV8.A00()
            X.0aP r1 = r3.A07
            java.lang.String r5 = "ig_recovery_account_flow"
            java.lang.String r4 = "LookupFragment"
            boolean r2 = r2.A04(r1, r5, r4)
            X.1Q0 r6 = X.1Q0.A0a
            X.0aP r1 = r3.A07
            X.FGI r6 = r6.A02(r1)
            X.EXD r1 = X.EXD.A04
            X.FBm r6 = r6.A06(r1, r7)
            java.lang.String r1 = "has_facebook_session"
            r6.A05(r1, r2)
            boolean r1 = r3.A0J
            X.C49886FBm.A01(r6, r1)
            com.instagram.fx.access.sso.FxSsoViewModel r1 = r3.A08
            X.0eM r1 = r1.A02
            java.lang.Object r1 = X.Dba.A0W(r1)
            r14 = 1
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r14)
            if (r1 == 0) goto L_0x0d64
            com.instagram.fx.access.sso.FxSsoViewModel r1 = r3.A08
            X.0eM r1 = r1.A02
            java.lang.Object r1 = X.Dba.A0W(r1)
            int r1 = X.DbS.A05(r1)
            if (r1 <= r14) goto L_0x0d64
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            X.0aP r1 = r3.A07
            X.6Yo r4 = X.DbY.A0J(r2, r1)
            android.os.Bundle r2 = r3.requireArguments()
            X.E3I r1 = new X.E3I
            r1.<init>()
            X.DbX.A18(r2, r1, r4)
        L_0x0d5f:
            r1 = -311556399(0xffffffffed6e06d1, float:-4.6041046E27)
            goto L_0x0072
        L_0x0d64:
            java.lang.String r6 = "account_recovery_continue_button"
            if (r2 == 0) goto L_0x0da9
            X.FV8 r2 = X.FV8.A00()
            X.0aP r1 = r3.A07
            java.lang.String r1 = r2.A01(r1, r5, r4)
            if (r1 == 0) goto L_0x0da9
            X.FV8 r2 = X.FV8.A00()
            X.0aP r1 = r3.A07
            java.lang.String r1 = r2.A02(r1, r5, r4)
            if (r1 == 0) goto L_0x0da9
            X.EEM r8 = r3.A0C
            X.0aP r7 = r3.A07
            X.FV8 r2 = X.FV8.A00()
            X.0aP r1 = r3.A07
            java.lang.String r10 = r2.A01(r1, r5, r4)
            X.FV8 r2 = X.FV8.A00()
            X.0aP r1 = r3.A07
            java.lang.String r11 = r2.A02(r1, r5, r4)
        L_0x0d98:
            com.instagram.fx.access.sso.FxSsoViewModel r1 = r3.A08
            java.lang.String r12 = r1.A02()
            X.48z r4 = X.C2612848z.A00
            X.3xQ r6 = X.C257443xP.A01(r6)
            r5 = r4
            X.EEM.A02(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0d5f
        L_0x0da9:
            X.FXk r2 = X.C50305FXk.A03
            X.0aP r1 = r3.A07
            boolean r1 = r2.A00(r1, r4)
            if (r1 == 0) goto L_0x0dd4
            X.0aP r1 = r3.A07
            boolean r1 = X.Dbc.A12(r1, r4)
            if (r1 == 0) goto L_0x0dd1
            r10 = 0
        L_0x0dbc:
            X.0aP r1 = r3.A07
            boolean r1 = X.Dbc.A12(r1, r4)
            if (r1 == 0) goto L_0x0dce
            r11 = 0
        L_0x0dc5:
            if (r10 == 0) goto L_0x0d5f
            if (r11 == 0) goto L_0x0d5f
            X.EEM r8 = r3.A0C
            X.0aP r7 = r3.A07
            goto L_0x0d98
        L_0x0dce:
            java.lang.String r11 = X.C50305FXk.A02
            goto L_0x0dc5
        L_0x0dd1:
            java.lang.String r10 = X.C50305FXk.A00
            goto L_0x0dbc
        L_0x0dd4:
            X.EEM r1 = r3.A0C
            r1.A07()
            goto L_0x0d5f
        L_0x0dda:
            r0 = 1652019513(0x6277d139, float:1.1428555E21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.1Q0 r2 = X.1Q0.A0o
            java.lang.Object r6 = r3.A01
            X.E4i r6 = (X.C47483E4i) r6
            X.0aP r1 = r6.A07
            X.FGI r3 = r2.A02(r1)
            X.DiE r2 = X.C46634DiE.A1j
            r1 = 0
            X.0xI r2 = r3.A05(r1, r2)
            X.0aP r1 = r6.A07
            X.DbU.A1R(r2, r1)
            com.instagram.ui.text.FreeAutoCompleteTextView r1 = r6.A0E
            android.text.Editable r1 = r1.getEditableText()
            if (r1 == 0) goto L_0x0e4d
            com.instagram.ui.text.FreeAutoCompleteTextView r1 = r6.A0E
            android.text.Editable r1 = r1.getEditableText()
            java.lang.String r1 = r1.toString()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0e4d
            X.0Tu r3 = X.0Tu.A05
            r1 = 18303501348116105(0x4106f000001689, double:1.894327711353205E-307)
            boolean r1 = X.1AW.A06(r3, r1)
            if (r1 == 0) goto L_0x0e4d
            android.content.Context r5 = r6.requireContext()
            X.0aP r4 = r6.A07
            X.8ab r3 = X.DbS.A0Y(r5)
            r1 = 2131951960(0x7f130158, float:1.954035E38)
            r3.A09(r1)
            r1 = 2131951959(0x7f130157, float:1.9540347E38)
            r3.A08(r1)
            X.FJY r1 = X.FJY.A00
            r3.A0E(r1)
            r2 = 2131963110(0x7f132ce6, float:1.9562964E38)
            r1 = 60
            X.FJk r1 = X.C50025FJk.A00(r5, r4, r1)
            r3.A0G(r1, r2)
            X.DbT.A1V(r3)
        L_0x0e48:
            r1 = 1842190948(0x6dcd9a64, float:7.953884E27)
            goto L_0x0072
        L_0x0e4d:
            android.content.Context r4 = r6.requireContext()
            X.0aP r3 = r6.A07
            com.instagram.ui.text.FreeAutoCompleteTextView r1 = r6.A0E
            android.text.Editable r1 = r1.getEditableText()
            r1.getClass()
            java.lang.String r2 = r1.toString()
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.1OC r3 = X.FHA.A01(r4, r3, r1, r2)
            X.0aP r2 = r6.A07
            X.EQR r1 = new X.EQR
            r1.<init>(r6, r2)
            r3.A00 = r1
            r6.schedule(r3)
            goto L_0x0e48
        L_0x0e73:
            r0 = 552829613(0x20f382ad, float:4.1252275E-19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.E4i r1 = (X.C47483E4i) r1
            r1.A05()
            r1 = -698210537(0xffffffffd6622717, float:-6.2164379E13)
            goto L_0x0072
        L_0x0e86:
            r0 = -184752931(0xfffffffff4fce4dd, float:-1.6029061E32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            X.4mT r4 = (X.C273374mT) r4
            com.instagram.common.session.UserSession r1 = r4.getSession()
            X.1NY r3 = X.DbU.A0N(r1)
            java.lang.String r1 = "accounts/send_password_reset_link/"
            r3.A0A(r1)
            java.lang.Class<X.DwE> r2 = X.DwE.class
            java.lang.Class<X.F6D> r1 = X.F6D.class
            X.1OC r3 = X.DbY.A0N(r3, r2, r1)
            android.content.Context r2 = r4.requireContext()
            X.EDF r1 = new X.EDF
            r1.<init>(r2)
            r3.A00 = r1
            X.1ES.A03(r3)
            r1 = -1929714108(0xffffffff8cfae644, float:-3.8657185E-31)
            goto L_0x0072
        L_0x0eb9:
            r0 = 761493736(0x2d6378e8, float:1.2930303E-11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            X.E2u r4 = (X.C47448E2u) r4
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r1 = r4.A00
            long r6 = r6 - r1
            X.FBN r5 = r4.A08
            int r1 = r5.A02
            int r1 = r1 * 1000
            long r2 = (long) r1
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0ee6
            android.content.Context r2 = r4.getContext()
            X.FBN r1 = r4.A08
            int r1 = r1.A02
            X.C48982EnK.A00(r2, r1)
            r1 = -1770813384(0xffffffff96738838, float:-1.9672367E-25)
            goto L_0x0072
        L_0x0ee6:
            int r1 = r5.A00
            if (r1 <= 0) goto L_0x0f1c
            com.instagram.common.session.UserSession r5 = r4.A07
            java.lang.String r1 = "createSendTwoFactorEnableSMSRequest() and createSendSMSCodeTask() additionally include checkNotNulls in IgApi.Builder to assert that the user session is not null"
            X.0JA.A03(r5, r1)
            java.lang.String r3 = r4.A0H
            if (r3 == 0) goto L_0x0f0c
            X.EVZ r2 = r4.A0E
            X.EVZ r1 = X.EVZ.ARGUMENT_TWOFAC_FLOW
            if (r2 != r1) goto L_0x0f17
            android.content.Context r2 = r4.requireContext()
            com.instagram.common.session.UserSession r1 = r4.A07
            X.1OC r2 = X.FFP.A02(r2, r1, r3)
        L_0x0f05:
            X.1P0 r1 = r4.A0M
            r2.A00 = r1
            r4.schedule(r2)
        L_0x0f0c:
            long r1 = android.os.SystemClock.elapsedRealtime()
            r4.A00 = r1
            r1 = 1581273945(0x5e405359, float:3.46462958E18)
            goto L_0x0072
        L_0x0f17:
            X.1OC r2 = X.C318486p2.A04(r5, r3)
            goto L_0x0f05
        L_0x0f1c:
            boolean r1 = r5.A03
            if (r1 == 0) goto L_0x0f34
            android.os.CountDownTimer r1 = r4.A01
            if (r1 != 0) goto L_0x0f0c
            int r1 = r5.A01
            int r1 = r1 * 1000
            long r2 = (long) r1
            X.Diz r1 = new X.Diz
            r1.<init>(r4, r2)
            r4.A01 = r1
            r1.start()
            goto L_0x0f0c
        L_0x0f34:
            android.content.Context r3 = r4.getContext()
            r1 = 0
            X.0qQ.A0B(r3, r1)
            r1 = 2131974068(0x7f1357b4, float:1.958519E38)
            java.lang.String r2 = r3.getString(r1)
            r1 = 2131974067(0x7f1357b3, float:1.9585188E38)
            java.lang.String r1 = r3.getString(r1)
            X.C49952FGh.A05(r3, r1, r2)
            r1 = 1977375311(0x75dc5a4f, float:5.5866064E32)
            goto L_0x0072
        L_0x0f52:
            r0 = -348126868(0xffffffffeb40016c, float:-2.3212047E26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.ESR r1 = (X.ESR) r1
            X.ESR.A07(r1)
            r1 = 87672752(0x539c7b0, float:8.735335E-36)
            goto L_0x0072
        L_0x0f65:
            r0 = 1484433520(0x587aa870, float:1.10240536E15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            r4 = r19
            android.content.Context r3 = r4.getContext()
            android.app.Activity r3 = (android.app.Activity) r3
            X.ELt r1 = new X.ELt
            r1.<init>()
            X.5Gt r2 = new X.5Gt
            r2.<init>(r3, r1)
            r2.A03(r4)
            r2.A02()
            r1 = 0
            r2.A0B = r1
            X.5Gu r1 = X.C283255Gu.A06
            r2.A07(r1)
            X.DbU.A1T(r2)
            r1 = -750597675(0xffffffffd342c9d5, float:-8.3660984E11)
            goto L_0x0072
        L_0x0f94:
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = X.AnonymousClass7TF.A0i(r0, r1)
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r2, r0)
            r3.setPrimaryClip(r0)
            android.content.Context r1 = r5.requireContext()
            r0 = 2131956742(0x7f131406, float:1.9550048E38)
            X.DbZ.A0w(r1, r5, r0)
        L_0x0fad:
            r0 = -1181681990(0xffffffffb990f6ba, float:-2.7649646E-4)
            goto L_0x119b
        L_0x0fb2:
            int r0 = r0.length()
            boolean r1 = X.AnonymousClass7TF.A1R(r0)
            java.lang.String r0 = "argument_sms_not_allowed"
            r3.putBoolean(r0, r1)
            X.E0a r0 = new X.E0a
            r0.<init>()
            r0.setArguments(r3)
            r4.A0J(r0)
        L_0x0fca:
            r0 = -1528183425(0xffffffffa4e9c57f, float:-1.01382214E-16)
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x0fd1:
            java.lang.String r1 = r0.A01
            r0 = 0
            X.C49920FEv.A00(r2, r0, r0, r0, r1)
            X.DbT.A1I(r3)
            r0 = -1463467707(0xffffffffa8c54145, float:-2.18997E-14)
            goto L_0x119b
        L_0x0fdf:
            r0 = 1582809123(0x5e57c023, float:3.8866161E18)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.E6g r5 = (X.C47520E6g) r5
            X.8ab r3 = X.DbW.A0U(r5)
            android.content.res.Resources r2 = X.DbV.A05(r5)
            r1 = 2131820623(0x7f11004f, float:1.9273966E38)
            int r0 = r5.A00
            java.lang.String r0 = X.DbY.A0d(r2, r0, r1)
            r3.A05 = r0
            r1 = 2131956481(0x7f131301, float:1.9549519E38)
            r0 = 37
            X.FJf r0 = X.C50020FJf.A00(r5, r0)
            r3.A0G(r0, r1)
            r0 = 38
            X.FJf r0 = X.C50020FJf.A00(r5, r0)
            X.DbX.A16(r0, r3)
            X.F2F r2 = r5.A05()
            int r0 = r5.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "confirm"
            r2.A00(r0, r1)
            r0 = 216692447(0xcea76df, float:3.6124951E-31)
            goto L_0x119b
        L_0x1026:
            r0 = 1075318938(0x4018109a, float:2.3760133)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.E6g r5 = (X.C47520E6g) r5
            X.8ab r3 = X.DbW.A0U(r5)
            android.content.res.Resources r2 = X.DbV.A05(r5)
            r1 = 2131820984(0x7f1101b8, float:1.9274698E38)
            int r0 = r5.A00
            java.lang.String r0 = X.DbY.A0d(r2, r0, r1)
            r3.A05 = r0
            r1 = 2131975854(0x7f135eae, float:1.9588812E38)
            r0 = 35
            X.FJf r0 = X.C50020FJf.A00(r5, r0)
            r3.A0L(r0, r1)
            r0 = 36
            X.FJf r0 = X.C50020FJf.A00(r5, r0)
            X.DbX.A16(r0, r3)
            X.F2F r2 = r5.A05()
            int r0 = r5.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "unfollow"
            r2.A00(r0, r1)
            r0 = 60148338(0x395ca72, float:8.803912E-37)
            goto L_0x119b
        L_0x106d:
            r0 = -1452850142(0xffffffffa9674422, float:-5.13514E-14)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r3.A01
            X.E6l r0 = (X.C47525E6l) r0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0eM r0 = r0.A0C
            X.6Yo r3 = X.DbX.A0N(r1, r0)
            r0 = 1
            r3.A0F = r0
            X.E6k r2 = new X.E6k
            r2.<init>()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "ARG_SPAM_FOLLOWER_SETTING_ENABLED"
            X.DbZ.A1B(r2, r0, r1)
            r3.A0D(r2)
            r3.A04()
            r0 = 90675625(0x56799a9, float:1.0889791E-35)
            goto L_0x119b
        L_0x109e:
            r0 = 1024542867(0x3d114893, float:0.035469603)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r3.A01
            X.E6l r0 = (X.C47525E6l) r0
            X.0eM r0 = r0.A0H
            java.lang.Object r3 = r0.getValue()
            X.E7c r3 = (X.C47539E7c) r3
            X.F2F r2 = r3.A05
            X.0wc r1 = r2.A01
            java.lang.String r0 = "follow_requests_manage_tapped"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            X.0iw r0 = r2.A00
            X.DbW.A15(r1, r0)
            r1.Cgf()
            X.6oS r1 = X.C318116oQ.A00(r3)
            r0 = 31
            X.C51645Fy4.A01(r3, r1, r0)
            r0 = -1246299114(0xffffffffb5b6fc16, float:-1.3633423E-6)
            goto L_0x119b
        L_0x10d1:
            r0 = 674871200(0x2839b7a0, float:1.030938E-14)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r3.A01
            X.MQp r0 = (X.C66409MQp) r0
            X.Ff1 r0 = (X.Ff1) r0
            X.0sa r0 = r0.A00
            r0.invoke()
            r0 = -984429578(0xffffffffc552cbf6, float:-3372.7476)
            goto L_0x119b
        L_0x10e8:
            r0 = -1147374168(0xffffffffbb9c75a8, float:-0.004774768)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r3.A01
            X.E2q r0 = (X.C47444E2q) r0
            X.E7c r3 = X.C47444E2q.A00(r0)
            X.F2F r2 = r3.A05
            X.0wc r1 = r2.A01
            java.lang.String r0 = "follow_requests_manage_tapped"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            X.0iw r0 = r2.A00
            X.DbW.A15(r1, r0)
            r1.Cgf()
            X.6oS r1 = X.C318116oQ.A00(r3)
            r0 = 31
            X.C51645Fy4.A01(r3, r1, r0)
            r0 = 1886091252(0x706b77f4, float:2.9149597E29)
            goto L_0x119b
        L_0x1117:
            r0 = -1536358274(0xffffffffa46d087e, float:-5.1398376E-17)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r3.A01
            X.2eb r0 = (X.C71662eb) r0
            r0.A02()
            r0 = 1317252062(0x4e83abde, float:1.10453939E9)
            goto L_0x119b
        L_0x1129:
            r0 = 163758805(0x9c2c2d5, float:4.688702E-33)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r3.A01
            X.E1c r3 = (X.C47410E1c) r3
            X.E8k r0 = r3.A02
            java.util.ArrayList r1 = r0.A0C()
            android.content.Context r10 = r3.requireContext()
            com.instagram.user.model.User r0 = r3.A05
            if (r0 == 0) goto L_0x1198
            java.util.Iterator r8 = r1.iterator()
        L_0x1146:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x1198
            com.instagram.user.model.User r0 = X.DbT.A0k(r8)
            java.lang.String r5 = r0.getId()
            java.util.Map r6 = r3.A0A
            X.EVQ r0 = X.EVQ.PENDING
            r6.put(r5, r0)
            com.instagram.user.model.User r14 = r3.A05
            X.1Xj r11 = r3.A01
            java.lang.String r2 = "follow_from_other_accounts_fragment"
            com.instagram.ui.widget.progressbutton.ProgressButton r13 = r3.A04
            r13.getClass()
            java.lang.String r15 = r3.A06
            java.lang.String r1 = r3.A08
            java.lang.String r0 = r3.A07
            com.instagram.profile.intf.UserDetailEntryInfo r12 = r3.A03
            X.F0i r9 = new X.F0i
            r16 = r1
            r17 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            X.FlD r7 = new X.FlD
            r7.<init>()
            X.FlI r1 = new X.FlI
            r1.<init>(r10, r3, r5)
            X.08y r0 = X.09i.A0A
            boolean r0 = r0.A0A(r7, r1, r9, r5)
            if (r0 != 0) goto L_0x1146
            X.EVQ r0 = X.EVQ.FAILED
            r6.put(r5, r0)
            java.lang.String r0 = "Failed to add follow from other account configuration operation for user id: "
            java.lang.String r0 = X.002.A0R(r0, r5)
            X.0wb.A03(r2, r0)
            goto L_0x1146
        L_0x1198:
            r0 = 1269083982(0x4ba4af4e, float:2.1585564E7)
        L_0x119b:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x119f:
            java.lang.Object r3 = r3.A01
            X.E57 r3 = (X.E57) r3
            com.instagram.common.session.UserSession r2 = r3.A01
            java.lang.String r1 = "one_click_pwd_reset"
            X.AnonymousClass7TG.A1N(r2, r1)
            r0 = 0
            X.FEK.A00(r2, r0, r1)
            X.E57.A00(r3)
            return
        L_0x11b2:
            java.lang.Object r2 = r3.A01
            X.E3Q r2 = (X.E3Q) r2
            com.instagram.common.session.UserSession r1 = r2.A02
            android.widget.EditText r0 = r2.A01
            java.lang.String r0 = X.0nA.A0I(r0)
            X.1OC r1 = X.FHA.A0F(r1, r0)
            r0 = 6
            X.C47699EDi.A00(r2, r1, r0)
            return
        L_0x11c7:
            java.lang.Object r3 = r3.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            X.8ab r2 = X.DbW.A0U(r3)
            r0 = 2131954988(0x7f130d2c, float:1.954649E38)
            r2.A09(r0)
            r0 = 2131954985(0x7f130d29, float:1.9546485E38)
            r2.A08(r0)
            r1 = 2131954987(0x7f130d2b, float:1.9546489E38)
            r0 = 0
            r2.A0I(r0, r1)
            r1 = 2131954986(0x7f130d2a, float:1.9546487E38)
            r0 = 8
            X.FJf r0 = X.C50020FJf.A00(r3, r0)
            r2.A0G(r0, r1)
            X.DbT.A1V(r2)
            return
        L_0x11f2:
            java.lang.Object r4 = r3.A01
            X.E75 r4 = (X.E75) r4
            com.instagram.common.session.UserSession r0 = r4.getSession()
            X.0wc r1 = X.AnonymousClass0kN.A02(r0)
            java.lang.String r0 = "instagram_change_password_attempt"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x121a
            java.lang.Integer r1 = r4.A05
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x1295
            java.lang.String r1 = "inauthentic_engagement"
        L_0x1212:
            java.lang.String r0 = "type"
            r2.AAJ(r0, r1)
            r2.Cgf()
        L_0x121a:
            X.F2a r1 = r4.A03
            com.instagram.igds.components.form.IgFormField r0 = r1.A04
            java.lang.String r3 = X.DbU.A0o(r0)
            com.instagram.igds.components.form.IgFormField r0 = r1.A03
            java.lang.String r2 = X.DbU.A0o(r0)
            java.util.regex.Pattern r0 = X.0mp.A01
            if (r3 == 0) goto L_0x1298
            int r1 = r3.length()
            r0 = 6
            if (r1 < r0) goto L_0x1298
            boolean r0 = X.0qQ.A0K(r2, r3)
            if (r0 == 0) goto L_0x1298
            X.FBX r2 = r4.A04
            java.lang.String r1 = "password_change"
            java.lang.String r0 = "change_password"
            r2.A02(r1, r0)
            com.instagram.common.session.UserSession r6 = r4.getSession()
            com.instagram.igds.components.form.IgFormField r0 = r4.A00
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r1 = r0.toString()
            com.instagram.igds.components.form.IgFormField r0 = r4.A02
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r5 = r0.toString()
            com.instagram.igds.components.form.IgFormField r0 = r4.A01
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r3 = r0.toString()
            X.1NY r2 = X.DbU.A0N(r6)
            java.lang.String r0 = "accounts/change_password/"
            r2.A0A(r0)
            java.lang.String r1 = X.Dba.A0b(r6, r1)
            java.lang.String r0 = "enc_old_password"
            r2.A9m(r0, r1)
            java.lang.String r1 = X.Dba.A0b(r6, r5)
            java.lang.String r0 = "enc_new_password1"
            r2.A9m(r0, r1)
            java.lang.String r1 = X.Dba.A0b(r6, r3)
            java.lang.String r0 = "enc_new_password2"
            r2.A9m(r0, r1)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            X.1OC r1 = X.DbY.A0N(r2, r1, r0)
            r0 = 5
            X.C47699EDi.A00(r4, r1, r0)
            return
        L_0x1295:
            r1 = 0
            goto L_0x1212
        L_0x1298:
            X.F2a r0 = r4.A03
            java.lang.String r0 = r0.A00()
            X.E75.A02(r4, r0)
            X.F2a r0 = r4.A03
            java.lang.String r0 = r0.A00()
            X.C59689JTv.A0G(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FP3.onClick(android.view.View):void");
    }

    public FP3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
