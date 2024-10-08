package X;

import android.view.View;

/* renamed from: X.SbJ  reason: case insensitive filesystem */
public final class C11496SbJ implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public C11496SbJ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C11496SbJ A00(Object obj, int i) {
        return new C11496SbJ(obj, i);
    }

    public static void A01(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new C11496SbJ(obj, i), view);
    }

    /* JADX WARNING: type inference failed for: r5v32, types: [X.07Z, X.QCE, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0ca3, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0ca6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0d36, code lost:
        r9 = "viewContext";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0d6d, code lost:
        r10 = "loggingContext";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0d9c, code lost:
        X.0qQ.A0F(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0dda, code lost:
        X.0qQ.A0F(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0de1, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x1008, code lost:
        X.C51965G9l.A15();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x100f, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x10b6, code lost:
        X.AnonymousClass0fD.A0C(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x10b9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x1155, code lost:
        X.AnonymousClass0fD.A0C(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x1158, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x11aa, code lost:
        X.0qQ.A0F(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x11b1, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x11e1, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x11e4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0041, code lost:
        X.AnonymousClass0fD.A0C(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0044, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r27) {
        /*
            r26 = this;
            r1 = r26
            int r0 = r1.A00
            r2 = r27
            switch(r0) {
                case 0: goto L_0x0f53;
                case 1: goto L_0x0f34;
                case 2: goto L_0x0f15;
                case 3: goto L_0x10bf;
                case 4: goto L_0x0edc;
                case 5: goto L_0x0ec2;
                case 6: goto L_0x0e97;
                case 7: goto L_0x0e82;
                case 8: goto L_0x0e6d;
                case 9: goto L_0x0e5a;
                case 10: goto L_0x0e35;
                case 11: goto L_0x1159;
                case 12: goto L_0x1068;
                case 13: goto L_0x0e1a;
                case 14: goto L_0x0dff;
                case 15: goto L_0x1010;
                case 16: goto L_0x0dba;
                case 17: goto L_0x0d70;
                case 18: goto L_0x0d3a;
                case 19: goto L_0x0d14;
                case 20: goto L_0x0d01;
                case 21: goto L_0x0837;
                case 22: goto L_0x0cbc;
                case 23: goto L_0x0ca7;
                case 24: goto L_0x0c71;
                case 25: goto L_0x0c5c;
                case 26: goto L_0x0bf5;
                case 27: goto L_0x0be4;
                case 28: goto L_0x0bd3;
                case 29: goto L_0x0bc2;
                case 30: goto L_0x0bb1;
                case 31: goto L_0x0ba0;
                case 32: goto L_0x0b8f;
                case 33: goto L_0x0b4b;
                case 34: goto L_0x0b38;
                case 35: goto L_0x0a8a;
                case 36: goto L_0x07fe;
                case 37: goto L_0x0722;
                case 38: goto L_0x0296;
                case 39: goto L_0x0faf;
                case 40: goto L_0x0261;
                case 41: goto L_0x06f7;
                case 42: goto L_0x06e2;
                case 43: goto L_0x06b1;
                case 44: goto L_0x01b9;
                case 45: goto L_0x0679;
                case 46: goto L_0x0665;
                case 47: goto L_0x0628;
                case 48: goto L_0x05f7;
                case 49: goto L_0x0175;
                case 50: goto L_0x0f78;
                case 51: goto L_0x05e4;
                case 52: goto L_0x05d0;
                case 53: goto L_0x0592;
                case 54: goto L_0x055c;
                case 55: goto L_0x051a;
                case 56: goto L_0x04dd;
                case 57: goto L_0x04a6;
                case 58: goto L_0x044d;
                case 59: goto L_0x0430;
                case 60: goto L_0x00fd;
                case 61: goto L_0x03e8;
                case 62: goto L_0x009b;
                case 63: goto L_0x03c2;
                case 64: goto L_0x0380;
                case 65: goto L_0x0345;
                case 66: goto L_0x0332;
                case 67: goto L_0x0316;
                case 68: goto L_0x02d5;
                case 69: goto L_0x0045;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 201081954(0xbfc4462, float:9.716976E-32)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.R8Z r0 = (X.R8Z) r0
            androidx.fragment.app.FragmentActivity r5 = r0.getActivity()
            X.0wW r4 = r0.A02
            com.instagram.common.analytics.intf.AnalyticsEventDebugInfo r1 = r0.A01
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "EventInfoFragment.EventInfo"
            r2.putParcelable(r0, r1)
            X.R8J r0 = new X.R8J
            r0.<init>()
            r0.setArguments(r2)
            if (r5 == 0) goto L_0x0f73
            X.6Yo r1 = X.DbS.A0M(r5, r4)
            X.R8J r0 = new X.R8J
            r0.<init>()
            r1.A0B(r2, r0)
            r1.A04()
            r0 = -1967886428(0xffffffff8ab46fa4, float:-1.7375364E-32)
        L_0x0041:
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        L_0x0045:
            r0 = 134926967(0x80ad277, float:4.1775265E-34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.QCH r7 = (X.QCH) r7
            java.lang.Integer r3 = r7.A08
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r3 != r2) goto L_0x0071
            r7.A08 = r1
            r3 = 8
            r2 = 0
            android.view.View r1 = r7.A01
            r1.setVisibility(r3)
            android.view.View r1 = r7.A00
            r1.setVisibility(r2)
            com.google.android.material.datepicker.Month r1 = r7.A07
            r7.A00(r1)
        L_0x006c:
            r1 = -445778941(0xffffffffe56df403, float:-7.023138E22)
            goto L_0x0ca3
        L_0x0071:
            if (r3 != r1) goto L_0x006c
            r7.A08 = r2
            r6 = 8
            r5 = 0
            androidx.recyclerview.widget.RecyclerView r1 = r7.A03
            X.3pI r4 = r1.A0D
            X.2Rw r3 = r1.A0A
            X.QEX r3 = (X.QEX) r3
            com.google.android.material.datepicker.Month r1 = r7.A07
            int r2 = r1.A04
            X.QCH r1 = r3.A00
            com.google.android.material.datepicker.CalendarConstraints r1 = r1.A04
            com.google.android.material.datepicker.Month r1 = r1.A05
            int r1 = r1.A04
            int r2 = r2 - r1
            r4.A1O(r2)
            android.view.View r1 = r7.A01
            r1.setVisibility(r5)
            android.view.View r1 = r7.A00
            r1.setVisibility(r6)
            goto L_0x006c
        L_0x009b:
            r0 = -257080402(0xfffffffff0ad43ae, float:-4.289818E29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.QnF r5 = (X.C8273QnF) r5
            com.facebookpay.logging.FBPayLoggerData r2 = r5.A01
            java.util.LinkedHashMap r4 = X.C2818159r.A06(r2)
            java.lang.String r3 = "target_name"
            java.lang.String r2 = "remove_shoppay"
            r4.put(r3, r2)
            X.C8273QnF.A01(r5, r4)
            X.2FO r3 = r5.A06
            java.lang.String r2 = "user_remove_credential_enter"
            r3.Cgl(r2, r4)
            X.2Fj r3 = r5.A04
            r6 = 0
            boolean r2 = X.C11431STx.A03()
            r13 = 2131962649(0x7f132b19, float:1.956203E38)
            if (r2 == 0) goto L_0x00cf
            r13 = 2131966448(0x7f1339f0, float:1.9569734E38)
        L_0x00cf:
            r2 = 37
            X.SVE r7 = X.SVE.A00(r1, r2)
            r2 = 36
            X.SVE r5 = X.SVE.A00(r1, r2)
            r17 = 1
            r15 = 0
            r14 = 2131962653(0x7f132b1d, float:1.9562037E38)
            r18 = 2131962650(0x7f132b1a, float:1.9562031E38)
            r19 = 2131962644(0x7f132b14, float:1.9562019E38)
            X.SOk r4 = new X.SOk
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r16 = r15
            r20 = r17
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.SR4.A01(r3, r4)
            r1 = 45226192(0x2b218d0, float:2.616899E-37)
            goto L_0x0ca3
        L_0x00fd:
            r0 = -1571960935(0xffffffffa24dc799, float:-2.7888347E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.QnA r6 = (X.C8268QnA) r6
            com.facebookpay.logging.FBPayLoggerData r2 = r6.A01
            java.util.LinkedHashMap r3 = X.C2818159r.A06(r2)
            com.fbpay.hub.paymentmethods.api.FbPayPayPal r2 = r6.A02
            java.lang.String r2 = r2.A00
            java.lang.Long r2 = X.DbV.A0q(r2)
            java.lang.String r5 = "id"
            r3.put(r5, r2)
            X.2FO r4 = r6.A04
            java.lang.String r2 = "fbpay_remove_paypal_display"
            r4.Cgl(r2, r3)
            com.facebookpay.logging.FBPayLoggerData r2 = r6.A01
            java.util.LinkedHashMap r3 = X.C2818159r.A06(r2)
            com.fbpay.hub.paymentmethods.api.FbPayPayPal r2 = r6.A02
            java.lang.String r2 = r2.A00
            java.lang.Long r2 = X.DbV.A0q(r2)
            r3.put(r5, r2)
            java.lang.String r2 = "fbpay_remove_paypal_click"
            r4.Cgl(r2, r3)
            X.2Fj r3 = r6.A04
            r6 = 0
            boolean r2 = X.C11431STx.A03()
            r13 = 2131962649(0x7f132b19, float:1.956203E38)
            if (r2 == 0) goto L_0x0147
            r13 = 2131966448(0x7f1339f0, float:1.9569734E38)
        L_0x0147:
            r2 = 35
            X.SVE r7 = X.SVE.A00(r1, r2)
            r2 = 34
            X.SVE r5 = X.SVE.A00(r1, r2)
            r17 = 1
            r15 = 0
            r14 = 2131962653(0x7f132b1d, float:1.9562037E38)
            r18 = 2131962650(0x7f132b1a, float:1.9562031E38)
            r19 = 2131962644(0x7f132b14, float:1.9562019E38)
            X.SOk r4 = new X.SOk
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r16 = r15
            r20 = r17
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.SR4.A01(r3, r4)
            r1 = -453465359(0xffffffffe4f8aaf1, float:-3.6696881E22)
            goto L_0x0ca3
        L_0x0175:
            r0 = -1539514111(0xffffffffa43ce101, float:-4.0956587E-17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.QCS r1 = (X.QCS) r1
            X.QDC r3 = r1.A08
            X.2gB r2 = r3.A04
            java.lang.Object r1 = r2.A02()
            if (r1 == 0) goto L_0x0194
            java.lang.Object r1 = r2.A02()
            boolean r1 = X.AnonymousClass7TE.A1a(r1)
            if (r1 != 0) goto L_0x01b4
        L_0x0194:
            X.QD8 r1 = r3.A00
            boolean r1 = r1.A04()
            if (r1 == 0) goto L_0x01b4
            com.fbpay.hub.form.params.FormParams r2 = r3.A01
            com.facebookpay.logging.FBPayLoggerData r1 = r2.A00
            if (r1 == 0) goto L_0x01ab
            com.fbpay.hub.form.params.FormLogEvents r1 = r2.A02
            if (r1 == 0) goto L_0x01ab
            java.lang.String r1 = r1.A09
            X.Pxj.A1I(r3, r1)
        L_0x01ab:
            X.2Fj r2 = r3.A08
            java.lang.Integer r1 = X.C51967G9n.A0k()
            r2.A0B(r1)
        L_0x01b4:
            r1 = -2013412626(0xffffffff87fdc2ee, float:-3.8181778E-34)
            goto L_0x0ca3
        L_0x01b9:
            r0 = 742645343(0x2c43de5f, float:2.7834607E-12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.QCG r5 = (X.QCG) r5
            X.QDA r6 = r5.A01
            android.os.Bundle r2 = r5.requireArguments()
            X.2Fk r4 = r6.A01
            java.lang.Object r1 = r4.A02()
            if (r1 == 0) goto L_0x020a
            X.SUj r1 = X.Pxe.A0W(r4)
            java.lang.Object r1 = r1.A01
            if (r1 == 0) goto L_0x020a
            com.facebookpay.logging.FBPayLoggerData r1 = X.Pxi.A0J(r2)
            java.util.LinkedHashMap r3 = X.C2818159r.A06(r1)
            X.RIj r2 = X.RIj.PIN
            java.lang.String r1 = "auth_factor_type"
            r3.put(r1, r2)
            X.SUj r1 = X.Pxe.A0W(r4)
            java.lang.Object r1 = r1.A01
            X.RpH r1 = (X.C10257RpH) r1
            java.lang.String r2 = r1.A00
            java.lang.String r1 = "LOCKED"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x025e
            X.RIw r2 = X.C8957RIw.RESET_PIN
        L_0x01fd:
            java.lang.String r1 = "target_name"
            X.2FO r2 = X.SRV.A02(r1, r2, r3)
            java.lang.String r1 = "user_click_auth_atomic"
            r2.Cgl(r1, r3)
        L_0x020a:
            X.SUj r4 = X.Pxe.A0W(r4)
            boolean r1 = X.SUj.A0V(r4)
            if (r1 == 0) goto L_0x0243
            java.lang.String r2 = X.QDA.A00(r6)
            android.os.Bundle r1 = r6.A00
            com.facebookpay.logging.FBPayLoggerData r1 = X.Pxi.A0J(r1)
            X.RsH r3 = X.C11301SKl.A01(r1, r2)
            java.lang.Object r1 = X.SUj.A0D(r4)
            X.RpH r1 = (X.C10257RpH) r1
            java.lang.String r2 = r1.A00
            java.lang.String r1 = "LOCKED"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x025b
            java.lang.String r1 = "LOCKED_PIN_RECOVER_WITH_PASSWORD_HUB"
        L_0x0234:
            android.os.Bundle r2 = r3.A01
            X.SQ8.A02(r1, r2)
            java.lang.String r1 = "RESET_FBPAY_PIN"
            X.Pxi.A0w(r2, r1)
            X.2Fj r1 = r6.A04
            X.SR4.A02(r1, r3)
        L_0x0243:
            android.os.Bundle r4 = r5.requireArguments()
            java.lang.String r3 = "fbpay_change_pin_click"
            X.S7M r1 = X.AnonymousClass2E0.A03()
            X.2FO r2 = r1.A01
            java.util.Map r1 = X.S9s.A01(r4)
            r2.Cgl(r3, r1)
            r1 = 313135202(0x12aa1062, float:1.0732547E-27)
            goto L_0x0ca3
        L_0x025b:
            java.lang.String r1 = "CHANGE_PIN_USING_OLD_PIN"
            goto L_0x0234
        L_0x025e:
            X.RIw r2 = X.C8957RIw.CHANGE_PIN
            goto L_0x01fd
        L_0x0261:
            r0 = 1638572518(0x61aaa1e6, float:3.9345156E20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.QCI r2 = (X.QCI) r2
            X.QDI r1 = r2.A01
            boolean r1 = r1.A05()
            if (r1 == 0) goto L_0x0279
            java.lang.String r1 = "fbpay_verify_pin_cancel"
            X.QCI.A00(r2, r1)
        L_0x0279:
            X.Ryv r1 = r2.A00
            android.widget.EditText r1 = r1.A02
            X.C9667Rel.A00(r1)
            X.TQY r4 = new X.TQY
            r4.<init>()
            r3 = 0
            androidx.fragment.app.Fragment r2 = r2.mParentFragment
            boolean r1 = r2 instanceof X.C13734Tg6
            if (r1 == 0) goto L_0x0291
            X.Tg6 r2 = (X.C13734Tg6) r2
            r2.AVU(r3, r3, r4)
        L_0x0291:
            r1 = 168356543(0xa08eabf, float:6.592313E-33)
            goto L_0x0ca3
        L_0x0296:
            r0 = 1960056731(0x74d4179b, float:1.3442941E32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.QCU r2 = (X.QCU) r2
            X.QDF r1 = r2.A01
            boolean r1 = r1.A03()
            if (r1 == 0) goto L_0x02b6
            java.lang.String r1 = "fbpay_verify_paypal_confirm"
            X.QCU.A02(r2, r1)
            X.QCU.A01(r2)
        L_0x02b1:
            r1 = -174897651(0xfffffffff593460d, float:-3.7338303E32)
            goto L_0x0ca3
        L_0x02b6:
            java.lang.String r1 = "fbpay_verify_cvv_confirm"
            X.QCU.A02(r2, r1)
            X.QDF r3 = r2.A01
            java.lang.String r1 = r3.A02
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x02b1
            java.lang.String r1 = r3.A02
            int r2 = r1.length()
            int r1 = r3.A01()
            if (r2 != r1) goto L_0x02b1
            X.QDF.A00(r3)
            goto L_0x02b1
        L_0x02d5:
            r0 = -424676008(0xffffffffe6aff558, float:-4.1546996E23)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.QAL r5 = (X.QAL) r5
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0311
            boolean r0 = r5.isShowing()
            if (r0 == 0) goto L_0x0311
            boolean r0 = r5.A06
            if (r0 != 0) goto L_0x030a
            android.content.Context r1 = r5.getContext()
            r4 = 1
            r0 = 16843611(0x101035b, float:2.3695965E-38)
            r2 = 0
            int[] r0 = new int[]{r0}
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r0)
            boolean r0 = r1.getBoolean(r2, r4)
            r5.A05 = r0
            r1.recycle()
            r5.A06 = r4
        L_0x030a:
            boolean r0 = r5.A05
            if (r0 == 0) goto L_0x0311
            r5.cancel()
        L_0x0311:
            r0 = 1023873509(0x3d0711e5, float:0.03297605)
            goto L_0x0041
        L_0x0316:
            r0 = -1996279836(0xffffffff89032fe4, float:-1.579107E-33)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.QCL r0 = (X.QCL) r0
            X.QCk r0 = r0.A08
            if (r0 != 0) goto L_0x032a
            java.lang.String r10 = "viewModel"
            goto L_0x0dda
        L_0x032a:
            r0.A0E()
            r0 = -1488450451(0xffffffffa7480c6d, float:-2.7762312E-15)
            goto L_0x0041
        L_0x0332:
            r0 = -1319702099(0xffffffffb156f1ad, float:-3.1278475E-9)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.QnC r0 = (X.C8270QnC) r0
            X.C8270QnC.A00(r0)
            r0 = 1619242878(0x6083af7e, float:7.591153E19)
            goto L_0x0041
        L_0x0345:
            r0 = 1794606882(0x6af78722, float:1.4962141E26)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.QnC r4 = (X.C8270QnC) r4
            r0 = 1
            r4.A03 = r0
            com.facebookpay.logging.FBPayLoggerData r0 = r4.A00
            java.util.LinkedHashMap r2 = X.C2818159r.A06(r0)
            X.Pxh.A1R(r2)
            java.lang.String r1 = "target_name"
            java.lang.String r0 = "add_shoppay_save"
            r2.put(r1, r0)
            java.lang.String r1 = r4.A02
            java.lang.String r0 = "product"
            r2.put(r0, r1)
            X.2FO r1 = r4.A06
            java.lang.String r0 = "user_add_credential_submit"
            r1.Cgl(r0, r2)
            X.TgB r0 = r4.A01
            if (r0 == 0) goto L_0x037b
            r0.D6J()
        L_0x037b:
            r0 = 55316672(0x34c10c0, float:5.996944E-37)
            goto L_0x0041
        L_0x0380:
            r0 = 156007738(0x94c7d3a, float:2.4614488E-33)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.QnD r4 = (X.C8271QnD) r4
            X.2FO r2 = r4.A08
            com.facebookpay.logging.FBPayLoggerData r0 = r4.A01
            java.util.LinkedHashMap r1 = X.C2818159r.A06(r0)
            java.lang.String r0 = "fbpay_payment_history_see_all_click"
            android.os.Bundle r5 = X.Pxi.A0E(r2, r0, r1)
            com.facebookpay.logging.FBPayLoggerData r1 = r4.A01
            java.lang.String r0 = "logger_data"
            r5.putParcelable(r0, r1)
            boolean r1 = r4.A05
            java.lang.String r0 = "use_transactions_v1"
            r5.putBoolean(r0, r1)
            X.2Fj r4 = r4.A06
            X.SRV r0 = X.AnonymousClass2E0.A0E()
            r0.A06()
            r2 = 0
            java.lang.String r1 = "transactions_list"
            X.SFA r0 = new X.SFA
            r0.<init>(r2, r1, r5)
            X.SR4.A01(r4, r0)
            r0 = -1174025279(0xffffffffba05cbc1, float:-5.103909E-4)
            goto L_0x0041
        L_0x03c2:
            r0 = -268900532(0xffffffffeff8e74c, float:-1.5406381E29)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.QnB r4 = (X.C8269QnB) r4
            X.2FO r2 = r4.A0E
            com.facebookpay.logging.FBPayLoggerData r0 = r4.A04
            java.util.LinkedHashMap r1 = X.C2818159r.A06(r0)
            java.lang.String r0 = "fbpay_add_payment_method_click"
            r2.Cgl(r0, r1)
            X.2Fj r1 = r4.A0A
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            X.SR4.A01(r1, r0)
            r0 = 308082956(0x125cf90c, float:6.9726734E-28)
            goto L_0x0041
        L_0x03e8:
            r0 = -465794262(0xffffffffe43c8b2a, float:-1.3912063E22)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.QnF r4 = (X.C8273QnF) r4
            X.2Fk r0 = r4.A00
            if (r0 != 0) goto L_0x03fd
            X.S2S r0 = r4.A08
            X.2gB r0 = r0.A01
            r4.A00 = r0
        L_0x03fd:
            X.S2S r1 = r4.A08
            com.facebookpay.logging.FBPayLoggerData r0 = r4.A01
            java.lang.String r0 = r0.A00()
            r0.getClass()
            r1.A00(r0)
            X.2Fk r1 = r4.A00
            X.2gO r0 = r4.A05
            r1.A09(r0)
            com.facebookpay.logging.FBPayLoggerData r0 = r4.A01
            java.util.LinkedHashMap r2 = X.C2818159r.A06(r0)
            java.lang.String r1 = "target_name"
            java.lang.String r0 = "edit_shoppay_save"
            r2.put(r1, r0)
            X.C8273QnF.A01(r4, r2)
            X.2FO r1 = r4.A06
            java.lang.String r0 = "user_edit_credential_submit"
            r1.Cgl(r0, r2)
            r0 = -2025952098(0xffffffff873e6c9e, float:-1.4325931E-34)
            goto L_0x0041
        L_0x0430:
            r0 = 528970794(0x1f87742a, float:5.73669E-20)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Qn3 r1 = (X.Qn3) r1
            android.util.SparseArray r0 = X.QCW.A06
            X.QnB r0 = r1.A01
            X.2Fj r1 = r0.A0B
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            X.SR4.A01(r1, r0)
            r0 = -352238680(0xffffffffeb0143a8, float:-1.5627093E26)
            goto L_0x0041
        L_0x044d:
            r0 = -1205031872(0xffffffffb82cac40, float:-4.1168416E-5)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Qn3 r1 = (X.Qn3) r1
            android.util.SparseArray r0 = X.QCW.A06
            X.QnB r5 = r1.A01
            java.lang.String r0 = r5.A08
            if (r0 == 0) goto L_0x04a1
            X.2FO r2 = r5.A0E
            com.facebookpay.logging.FBPayLoggerData r0 = r5.A04
            java.util.LinkedHashMap r1 = X.C2818159r.A06(r0)
            java.lang.String r0 = "fbpay_add_paypal_click"
            android.os.Bundle r4 = X.Pxi.A0E(r2, r0, r1)
            java.lang.String r1 = "title"
            java.lang.String r0 = ""
            r4.putString(r1, r0)
            r2 = 1
            java.lang.String r0 = "https://www.instagram.com/payments/paypal_close/"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            java.lang.String r0 = "web_fragment_intercept_urls"
            r4.putStringArray(r0, r1)
            java.lang.String r1 = r5.A08
            java.lang.String r0 = "web_fragment_load_url"
            r4.putString(r0, r1)
            com.facebookpay.logging.FBPayLoggerData r1 = r5.A04
            java.lang.String r0 = "logger_data"
            r4.putParcelable(r0, r1)
            java.lang.String r0 = "web_view"
            X.SFA r1 = new X.SFA
            r1.<init>(r0, r4)
            r1.A00 = r2
            X.2Fj r0 = r5.A06
            X.SR4.A01(r0, r1)
        L_0x04a1:
            r0 = 853734439(0x32e2f427, float:2.642089E-8)
            goto L_0x0041
        L_0x04a6:
            r0 = 2032077752(0x791f0bb8, float:5.1613305E34)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.Qn6 r4 = (X.C8264Qn6) r4
            X.2FO r2 = r4.A02
            com.facebookpay.logging.FBPayLoggerData r0 = r4.A00
            java.util.LinkedHashMap r1 = X.C2818159r.A06(r0)
            java.lang.String r0 = "fbpay_see_more_orders_click"
            android.os.Bundle r2 = X.Pxi.A0E(r2, r0, r1)
            com.facebookpay.logging.FBPayLoggerData r0 = r4.A00
            java.lang.String r1 = r0.A00()
            java.lang.String r0 = "sessionId"
            r2.putString(r0, r1)
            java.lang.String r0 = "order_list"
            X.SFA r1 = new X.SFA
            r1.<init>(r0, r2)
            X.2Fj r0 = r4.A06
            X.SR4.A01(r0, r1)
            r0 = 231944652(0xdd331cc, float:1.3015867E-30)
            goto L_0x0041
        L_0x04dd:
            r0 = -337307943(0xffffffffebe516d9, float:-5.539038E26)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.Qn9 r4 = (X.C8267Qn9) r4
            X.2FO r2 = r4.A03
            com.facebookpay.logging.FBPayLoggerData r0 = r4.A00
            java.util.LinkedHashMap r1 = X.C2818159r.A06(r0)
            java.lang.String r0 = "fbpay_manage_fbpay_info_button_click"
            r2.Cgl(r0, r1)
            com.facebookpay.logging.FBPayLoggerData r0 = r4.A00
            java.util.LinkedHashMap r1 = X.C2818159r.A06(r0)
            java.lang.String r0 = "user_click_accountlinking_atomic"
            android.os.Bundle r2 = X.Pxi.A0E(r2, r0, r1)
            com.facebookpay.logging.FBPayLoggerData r1 = r4.A00
            java.lang.String r0 = "logger_data"
            r2.putParcelable(r0, r1)
            java.lang.String r0 = "connect_fbpay"
            X.SFA r1 = new X.SFA
            r1.<init>(r0, r2)
            X.2Fj r0 = r4.A06
            X.SR4.A01(r0, r1)
            r0 = -644038785(0xffffffffd99cbf7f, float:-5.5150811E15)
            goto L_0x0041
        L_0x051a:
            r0 = -911392836(0xffffffffc9ad3fbc, float:-1419255.5)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.Qn9 r5 = (X.C8267Qn9) r5
            com.facebookpay.logging.FBPayLoggerData r0 = r5.A00
            java.util.LinkedHashMap r2 = X.C2818159r.A06(r0)
            java.lang.String r4 = "https://help.instagram.com/357872324807367"
            java.lang.String r0 = "target_url"
            r2.put(r0, r4)
            X.2FO r1 = r5.A03
            java.lang.String r0 = "fbpay_support_and_help_click"
            android.os.Bundle r2 = X.Pxi.A0E(r1, r0, r2)
            r1 = 2131962197(0x7f132955, float:1.9561112E38)
            java.lang.String r0 = "title_res"
            r2.putInt(r0, r1)
            java.lang.String r0 = "web_fragment_load_url"
            r2.putString(r0, r4)
            java.lang.String r0 = "web_view"
            X.SFA r1 = new X.SFA
            r1.<init>(r0, r2)
            X.2Fj r0 = r5.A06
            X.SR4.A01(r0, r1)
            r0 = -1584947549(0xffffffffa1879ea3, float:-9.189947E-19)
            goto L_0x0041
        L_0x055c:
            r0 = -704488850(0xffffffffd6025a6e, float:-3.5831226E13)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.Qn9 r6 = (X.C8267Qn9) r6
            X.2FO r2 = r6.A03
            com.facebookpay.logging.FBPayLoggerData r0 = r6.A00
            java.util.LinkedHashMap r1 = X.C2818159r.A06(r0)
            java.lang.String r0 = "fbpay_security_click"
            r2.Cgl(r0, r1)
            android.os.Bundle r0 = r6.A00
            android.os.Bundle r5 = X.Pxe.A0J(r0)
            java.lang.String r0 = "should_log_view_load_success"
            r4 = 1
            r5.putBoolean(r0, r4)
            X.2Fj r2 = r6.A06
            java.lang.String r1 = "PIN_BIO_SETTINGS"
            X.SFA r0 = new X.SFA
            r0.<init>(r4, r1, r5)
            X.SR4.A01(r2, r0)
            r0 = -1126488170(0xffffffffbcdb2796, float:-0.026752274)
            goto L_0x0041
        L_0x0592:
            r0 = -1561238368(0xffffffffa2f164a0, float:-6.542972E-18)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.Qn9 r5 = (X.C8267Qn9) r5
            X.2FO r2 = r5.A03
            com.facebookpay.logging.FBPayLoggerData r0 = r5.A00
            java.util.LinkedHashMap r1 = X.C2818159r.A06(r0)
            java.lang.String r0 = "fbpay_payment_settings_click"
            r2.Cgl(r0, r1)
            com.facebookpay.logging.FBPayLoggerData r0 = r5.A00
            java.util.LinkedHashMap r1 = X.C2818159r.A06(r0)
            java.lang.String r0 = "user_click_paymentsettings_atomic"
            android.os.Bundle r4 = X.Pxi.A0E(r2, r0, r1)
            com.facebookpay.logging.FBPayLoggerData r1 = r5.A00
            java.lang.String r0 = "logger_data"
            r4.putParcelable(r0, r1)
            X.2Fj r2 = r5.A06
            java.lang.String r1 = "settings"
            X.SFA r0 = new X.SFA
            r0.<init>(r1, r4)
            X.SR4.A01(r2, r0)
            r0 = 375602024(0x16633b68, float:1.8355659E-25)
            goto L_0x0041
        L_0x05d0:
            r0 = -1260895616(0xffffffffb4d84280, float:-4.028152E-7)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.QCT r1 = (X.QCT) r1
            r0 = 0
            X.QCT.A01(r1, r0)
            r0 = -1272824894(0xffffffffb4223bc2, float:-1.5109165E-7)
            goto L_0x0041
        L_0x05e4:
            r0 = -1739615357(0xffffffff984f9383, float:-2.6828597E-24)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.QCT r0 = (X.QCT) r0
            X.QCT.A00(r0)
            r0 = -609828239(0xffffffffdba6c271, float:-9.3877273E16)
            goto L_0x0041
        L_0x05f7:
            r0 = 542599629(0x205769cd, float:1.8246215E-19)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.Qn7 r5 = (X.C8265Qn7) r5
            X.2FO r2 = r5.A02
            com.facebookpay.logging.FBPayLoggerData r0 = r5.A00
            java.util.LinkedHashMap r1 = X.C2818159r.A06(r0)
            java.lang.String r0 = "fbpay_contact_click"
            android.os.Bundle r4 = X.Pxi.A0E(r2, r0, r1)
            com.facebookpay.logging.FBPayLoggerData r1 = r5.A00
            java.lang.String r0 = "logger_data"
            r4.putParcelable(r0, r1)
            X.2Fj r2 = r5.A06
            java.lang.String r1 = "contact_info"
            X.SFA r0 = new X.SFA
            r0.<init>(r1, r4)
            X.SR4.A01(r2, r0)
            r0 = -1789782456(0xffffffff95521648, float:-4.242674E-26)
            goto L_0x0041
        L_0x0628:
            r0 = 1977931525(0x75e4d705, float:5.8017812E32)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.Qn7 r5 = (X.C8265Qn7) r5
            X.2FO r2 = r5.A02
            com.facebookpay.logging.FBPayLoggerData r0 = r5.A00
            java.util.LinkedHashMap r1 = X.C2818159r.A06(r0)
            java.lang.String r0 = "fbpay_shipping_address_click"
            r2.Cgl(r0, r1)
            com.facebookpay.logging.FBPayLoggerData r0 = r5.A00
            java.util.LinkedHashMap r1 = X.C2818159r.A06(r0)
            java.lang.String r0 = "user_click_shippingaddress_atomic"
            android.os.Bundle r4 = X.Pxi.A0E(r2, r0, r1)
            com.facebookpay.logging.FBPayLoggerData r1 = r5.A00
            java.lang.String r0 = "logger_data"
            r4.putParcelable(r0, r1)
            X.2Fj r2 = r5.A06
            java.lang.String r1 = "address"
            X.SFA r0 = new X.SFA
            r0.<init>(r1, r4)
            X.SR4.A01(r2, r0)
            r0 = 134285488(0x80108b0, float:3.8829738E-34)
            goto L_0x0041
        L_0x0665:
            r0 = -1876850898(0xffffffff9021872e, float:-3.185579E-29)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.QnE r1 = (X.C8272QnE) r1
            r0 = 0
            r1.A05(r0)
            r0 = -1409799680(0xffffffffabf82a00, float:-1.7633117E-12)
            goto L_0x0041
        L_0x0679:
            r0 = 114851814(0x6d87fe6, float:8.14381E-35)
            int r3 = X.AnonymousClass0fD.A05(r0)
            android.content.Context r2 = r2.getContext()
            java.lang.Object r0 = r1.A01
            X.Qmp r0 = (X.Qmp) r0
            com.google.common.collect.ImmutableList r0 = r0.A00
            java.lang.Object r0 = X.AnonymousClass7TE.A13(r0)
            com.fbpay.hub.common.link.LinkParams r0 = (com.fbpay.hub.common.link.LinkParams) r0
            java.lang.String r0 = r0.A04
            android.content.Intent r1 = X.Pxe.A0E()
            r0.getClass()
            android.net.Uri r0 = X.0cp.A03(r0)
            android.content.Intent r1 = r1.setData(r0)
            X.0b6 r0 = X.0b6.A00()
            X.0R8 r0 = r0.A04()
            r0.A0G(r2, r1)
            r0 = -865726142(0xffffffffcc661142, float:-6.0310792E7)
            goto L_0x0041
        L_0x06b1:
            r0 = 1557114132(0x5ccfad14, float:4.67644973E17)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.QCI r4 = (X.QCI) r4
            java.lang.String r0 = "forget_fb_password_click"
            X.QCI.A00(r4, r0)
            android.content.Intent r1 = X.Pxe.A0E()
            java.lang.String r0 = "https://www.instagram.com/accounts/password/reset/"
            android.net.Uri r0 = X.0cp.A03(r0)
            android.content.Intent r2 = r1.setData(r0)
            X.0qQ.A07(r2)
            X.0R3 r1 = X.Pxf.A0O()
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            r1.A0G(r0, r2)
            r0 = 2049376127(0x7a26ff7f, float:2.1677584E35)
            goto L_0x0041
        L_0x06e2:
            r0 = 1324301348(0x4eef3c24, float:2.006848E9)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.QCI r0 = (X.QCI) r0
            X.QDI r0 = r0.A01
            r0.A01()
            r0 = 1578492537(0x5e15e279, float:2.70008197E18)
            goto L_0x0041
        L_0x06f7:
            r0 = 280097465(0x10b1f2b9, float:7.0188164E-29)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.QCI r5 = (X.QCI) r5
            java.lang.String r0 = "forget_pin_click"
            X.QCI.A00(r5, r0)
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "AUTH_FLOW_UTIL_PIN_FORGOT"
            r0 = 1
            r4.putBoolean(r1, r0)
            r2 = 0
            androidx.fragment.app.Fragment r1 = r5.mParentFragment
            boolean r0 = r1 instanceof X.C13783Tgy
            if (r0 == 0) goto L_0x071d
            X.Tgy r1 = (X.C13783Tgy) r1
            r1.DG8(r4, r2)
        L_0x071d:
            r0 = 1431720491(0x5556522b, float:1.47280248E13)
            goto L_0x0041
        L_0x0722:
            r0 = -1719371556(0xffffffff998478dc, float:-1.3697295E-23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.Sto r6 = X.C51965G9l.A0g()
            java.lang.Object r5 = r1.A01
            X.QCE r5 = (X.QCE) r5
            com.facebookpay.logging.LoggingContext r4 = r5.A05
            if (r4 == 0) goto L_0x07fa
            com.facebookpay.paypal.model.PaypalConsentLaunchParams r1 = r5.A06
            if (r1 != 0) goto L_0x073d
            java.lang.String r9 = "launchParams"
            goto L_0x0d9c
        L_0x073d:
            java.lang.String r1 = r1.A05
            long r2 = java.lang.Long.parseLong(r1)
            r14 = 0
            java.lang.String r1 = "confirm_conversion"
            r6.A0O(r4, r1, r2)
            java.lang.String r9 = "progressIcon"
            java.lang.String r10 = "primaryButton"
            android.widget.ProgressBar r1 = r5.A01
            if (r1 == 0) goto L_0x0d9c
            r2 = 0
            r1.setVisibility(r2)
            com.facebookpay.widget.button.FBPayButton r1 = r5.A07
            if (r1 == 0) goto L_0x0dda
            r1.setEnabled(r2)
            com.facebookpay.widget.button.FBPayButton r1 = r5.A07
            if (r1 == 0) goto L_0x0dda
            r1.setText(r14)
            X.Sto r2 = X.C51965G9l.A0g()
            com.facebookpay.logging.LoggingContext r13 = r5.A05
            if (r13 == 0) goto L_0x07fa
            com.facebookpay.paypal.model.PaypalConsentLaunchParams r1 = r5.A06
            java.lang.String r9 = "launchParams"
            if (r1 == 0) goto L_0x0d9c
            java.lang.String r1 = r1.A05
            long r11 = java.lang.Long.parseLong(r1)
            X.0Ae r2 = r2.A00
            java.lang.String r1 = "client_submit_ecppaypalconversion_init"
            X.0Aj r2 = X.C51969G9p.A0d(r2, r1)
            r1 = 125(0x7d, float:1.75E-43)
            X.1Ln r1 = X.C51965G9l.A0U(r2, r1)
            r15 = 3
            X.Iww r10 = new X.Iww
            r10.<init>(r11, r13, r14, r15)
            X.C12411Sto.A03(r1, r13, r10)
            X.SOm r1 = X.AnonymousClass2E0.A01()
            X.0eK r1 = r1.A0I
            java.lang.Object r7 = X.C66580MXl.A0s(r1)
            X.QNI r3 = new X.QNI
            r3.<init>()
            java.lang.String r2 = X.Pxi.A0Y()
            java.lang.String r1 = "client_mutation_id"
            r3.A07(r2, r1)
            com.facebookpay.paypal.model.PaypalConsentLaunchParams r1 = r5.A06
            if (r1 == 0) goto L_0x0d9c
            java.lang.String r2 = r1.A09
            java.lang.String r1 = "logging_id"
            r3.A07(r2, r1)
            com.facebookpay.paypal.model.PaypalConsentLaunchParams r1 = r5.A06
            if (r1 == 0) goto L_0x0d9c
            java.lang.String r2 = r1.A07
            java.lang.String r1 = "product_id"
            r3.A07(r2, r1)
            java.lang.String r2 = "ECP"
            java.lang.String r1 = "payment_type"
            r3.A07(r2, r1)
            com.facebookpay.paypal.model.PaypalConsentLaunchParams r1 = r5.A06
            if (r1 == 0) goto L_0x0d9c
            java.lang.String r2 = r1.A05
            java.lang.String r1 = "paypal_ba_id"
            r3.A07(r2, r1)
            X.5A3 r6 = X.AnonymousClass2E0.A06()
            r1 = 9
            X.Sc3 r4 = new X.Sc3
            r4.<init>(r1, r3, r7)
            X.DEk r3 = X.C45905DEk.A00
            r2 = 1
            X.QnH r1 = new X.QnH
            r1.<init>(r6, r3, r4, r2)
            X.QCn r2 = X.SSC.A03(r1)
            X.0qQ.A07(r2)
            r1 = 2
            X.Sdu r1 = X.C11652Sdu.A00(r5, r1)
            X.SQB.A01(r5, r2, r1)
            r1 = -1736859487(0xffffffff9879a0a1, float:-3.2263593E-24)
            goto L_0x0ca3
        L_0x07fa:
            java.lang.String r9 = "loggingContext"
            goto L_0x0d9c
        L_0x07fe:
            r0 = 126845835(0x78f838b, float:2.1593563E-34)
            int r3 = X.AnonymousClass0fD.A05(r0)
            X.Sto r7 = X.C51965G9l.A0g()
            java.lang.Object r6 = r1.A01
            X.QCE r6 = (X.QCE) r6
            com.facebookpay.logging.LoggingContext r5 = r6.A05
            r4 = 0
            if (r5 == 0) goto L_0x0d6d
            com.facebookpay.paypal.model.PaypalConsentLaunchParams r0 = r6.A06
            if (r0 != 0) goto L_0x081a
            java.lang.String r10 = "launchParams"
            goto L_0x0dda
        L_0x081a:
            java.lang.String r0 = r0.A05
            long r1 = java.lang.Long.parseLong(r0)
            java.lang.String r0 = "cancel"
            r7.A0O(r5, r0, r1)
            X.2gB r1 = r6.A09
            X.TQV r0 = new X.TQV
            r0.<init>()
            X.SUj.A0M(r1, r4, r0)
            X.STG.A01(r6)
            r0 = -1493712618(0xffffffffa6f7c116, float:-1.7191404E-15)
            goto L_0x0041
        L_0x0837:
            r0 = 1546929632(0x5c3445e0, float:2.02969297E17)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.QhQ r3 = (X.C8132QhQ) r3
            X.QDN r7 = r3.A0B
            java.lang.String r10 = "ecpViewModel"
            if (r7 == 0) goto L_0x0dda
            X.QDT r6 = r7.A1R
            X.2gB r0 = r6.A08
            X.SUj r0 = X.Pxe.A0W(r0)
            if (r0 == 0) goto L_0x08f3
            java.lang.Object r0 = r0.A01
            X.RuU r0 = (X.C10575RuU) r0
            if (r0 == 0) goto L_0x08f3
            java.lang.Object r9 = r0.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r9 = (com.facebookpay.paymentmethod.model.PaymentMethod) r9
            if (r9 == 0) goto L_0x08f3
            boolean r0 = r7.A0w()
            r8 = 0
            if (r0 == 0) goto L_0x0a87
            java.lang.Boolean r5 = r6.A0I()
            r4 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            boolean r0 = X.0qQ.A0K(r5, r1)
            if (r0 != 0) goto L_0x087f
            java.lang.Boolean r0 = r6.A0H()
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x087f
            r4 = 0
        L_0x087f:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
        L_0x0883:
            X.Sto r4 = X.C51965G9l.A0g()
            com.facebookpay.logging.LoggingContext r6 = r7.A1P
            X.XRm r15 = r9.Asn()
            X.QDL r0 = r7.A1O
            java.util.List r16 = r0.A06()
            java.lang.String r0 = r9.Asm()
            java.lang.Long r14 = X.DbV.A0q(r0)
            java.util.LinkedHashMap r13 = X.C66584MXp.A0f(r7)
            if (r5 == 0) goto L_0x08af
            boolean r0 = r5.booleanValue()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "shipping_as_billing"
            r13.put(r0, r1)
        L_0x08af:
            if (r8 == 0) goto L_0x08be
            boolean r0 = r8.booleanValue()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_billing_form_ready_to_save"
            r13.put(r0, r1)
        L_0x08be:
            X.0Ae r1 = X.C12411Sto.A00(r4, r15)
            java.lang.String r0 = "user_click_ecppayment_atomic"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 399(0x18f, float:5.59E-43)
            X.1Ln r0 = X.C51965G9l.A0U(r1, r0)
            r12 = 6
            X.Ixb r11 = new X.Ixb
            r17 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17)
            X.C12411Sto.A03(r0, r6, r11)
            com.facebook.quicklog.QuickPerformanceLogger r5 = r4.A01
            r4 = 223884226(0xd5833c2, float:6.662244E-31)
            java.lang.String r1 = "PLATFORM"
            java.lang.String r0 = "ANDROID"
            r5.markerStart(r4, r1, r0)
            X.SOm r0 = X.AnonymousClass2E0.A01()
            X.S1J r4 = r0.A05
            java.lang.String r1 = r6.A02
            java.lang.String r0 = "PAY_BUTTON_CLICKED"
            r4.A00(r1, r0)
        L_0x08f3:
            boolean r0 = X.C8132QhQ.A09(r3)
            if (r0 == 0) goto L_0x0963
            X.QDN r1 = r3.A0B
            if (r1 == 0) goto L_0x0dda
            X.SUj r0 = r1.A0Q
            boolean r0 = X.SUj.A0S(r0)
            java.lang.String r9 = "viewContext"
            if (r0 == 0) goto L_0x091e
            android.view.ContextThemeWrapper r4 = r3.A01
            if (r4 == 0) goto L_0x0d9c
            r3 = 2131961416(0x7f132648, float:1.9559528E38)
            r1 = 2131961415(0x7f132647, float:1.9559526E38)
            X.TV6 r0 = X.TV6.A00
            X.C11394SRm.A01(r4, r0, r3, r1)
            r0 = 503359279(0x1e00a72f, float:6.810836E-21)
        L_0x091a:
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x091e:
            X.SUj r0 = r1.A0N
            boolean r0 = X.SUj.A0S(r0)
            if (r0 == 0) goto L_0x093f
            boolean r0 = r1.A0w()
            if (r0 != 0) goto L_0x093f
            android.view.ContextThemeWrapper r4 = r3.A01
            if (r4 == 0) goto L_0x0d9c
            r3 = 2131961193(0x7f132569, float:1.9559076E38)
            r1 = 2131961192(0x7f132568, float:1.9559074E38)
            X.TV6 r0 = X.TV6.A00
            X.C11394SRm.A01(r4, r0, r3, r1)
            r0 = 1965736322(0x752ac182, float:2.164588E32)
            goto L_0x091a
        L_0x093f:
            X.QDN r0 = r3.A0B
            if (r0 == 0) goto L_0x0dda
            X.QDT r0 = r0.A1R
            java.lang.Boolean r0 = r0.A0I()
            r8 = 1
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r8)
            X.QDN r4 = r3.A0B
            if (r0 == 0) goto L_0x0980
            if (r4 == 0) goto L_0x0dda
            X.QDT r0 = r4.A1R
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x0963
            X.QDN r0 = r3.A0B
            if (r0 == 0) goto L_0x0dda
            r0.A0n()
        L_0x0963:
            X.QDN r4 = r3.A0B
            if (r4 == 0) goto L_0x0dda
            X.S7M r0 = X.AnonymousClass2E0.A03()
            X.SSY r1 = r0.A01(r3)
            java.lang.String r0 = X.Pxi.A0Y()
            X.2gB r4 = r4.A0k(r3, r1, r0)
            X.2gO r5 = r3.A0N
        L_0x0979:
            r4.A06(r3, r5)
            r0 = 1014683189(0x3c7ad635, float:0.01530986)
            goto L_0x091a
        L_0x0980:
            if (r4 == 0) goto L_0x0dda
            X.QDT r1 = r4.A1R
            java.lang.Boolean r0 = r1.A0H()
            if (r0 == 0) goto L_0x0a6b
            java.lang.Boolean r0 = r1.A0H()
            r7 = 0
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r7)
            if (r0 == 0) goto L_0x09a9
            android.view.ContextThemeWrapper r4 = r3.A01
            if (r4 == 0) goto L_0x0d9c
            r3 = 2131961193(0x7f132569, float:1.9559076E38)
            r1 = 2131961192(0x7f132568, float:1.9559074E38)
            X.TV6 r0 = X.TV6.A00
            X.C11394SRm.A01(r4, r0, r3, r1)
            r0 = 1632052052(0x61472354, float:2.2959048E20)
            goto L_0x091a
        L_0x09a9:
            X.QDN r0 = r3.A0B
            if (r0 == 0) goto L_0x0dda
            X.QDT r1 = r0.A1R
            X.2gB r0 = r1.A08
            X.SUj r0 = X.Pxe.A0W(r0)
            r5 = 0
            if (r0 == 0) goto L_0x09c2
            java.lang.Object r0 = r0.A01
            X.RuU r0 = (X.C10575RuU) r0
            if (r0 == 0) goto L_0x09c2
            java.lang.Object r5 = r0.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r5 = (com.facebookpay.paymentmethod.model.PaymentMethod) r5
        L_0x09c2:
            boolean r0 = r5 instanceof com.facebookpay.paymentmethod.model.CreditCard
            if (r0 == 0) goto L_0x0963
            com.facebookpay.paymentmethod.model.CreditCard r5 = (com.facebookpay.paymentmethod.model.CreditCard) r5
            if (r5 == 0) goto L_0x0963
            android.util.SparseArray r0 = r1.A00
            android.util.SparseArray r12 = r0.clone()
            X.0qQ.A07(r12)
            r1 = 12
            java.lang.String r0 = r5.Asm()
            r12.put(r1, r0)
            r4 = 13
            java.lang.String r1 = "••• "
            java.lang.String r0 = X.Pxj.A0q(r5)
            java.lang.String r0 = X.002.A0R(r1, r0)
            r12.put(r4, r0)
            r1 = 14
            java.lang.String r0 = r5.A02()
            r12.put(r1, r0)
            r1 = 39
            X.RGo r0 = r5.A01()
            r12.put(r1, r0)
            X.QDN r4 = r3.A0B
            if (r4 == 0) goto L_0x0dda
            X.SUj r0 = r4.A0M
            java.lang.Object r0 = r0.A01
            X.SUj r1 = X.SUj.A08(r0)
            r4.A0M = r1
            X.5tb r0 = X.C298525tb.PAY_BUTTON
            X.QDN.A0N(r4, r0, r1)
            X.5tb r6 = X.C298525tb.PAYMENT_METHOD
            r19 = 3
            X.SOm r0 = X.AnonymousClass2E0.A01()
            X.Rzk r11 = r0.A09
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r3.A0A
            java.lang.String r9 = "ecpPaymentRequest"
            if (r0 == 0) goto L_0x11aa
            java.lang.String r5 = r0.A0A
            java.lang.String r4 = r0.A08
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r0.A05
            if (r0 == 0) goto L_0x0fe7
            java.lang.String r1 = r0.A00
            if (r1 != 0) goto L_0x0a31
            java.lang.String r1 = r0.A02
            if (r1 == 0) goto L_0x0fe7
        L_0x0a31:
            com.facebookpay.logging.LoggingContext r13 = r3.A0C
            if (r13 != 0) goto L_0x0a39
            java.lang.String r9 = "loggingContext"
            goto L_0x11aa
        L_0x0a39:
            X.QDN r0 = r3.A0B
            r9 = r10
            if (r0 == 0) goto L_0x11aa
            X.QDH r0 = r0.A1Q
            com.facebookpay.otc.models.OtcInput r14 = r0.A02(r6, r7)
            X.QDN r0 = r3.A0B
            if (r0 == 0) goto L_0x11aa
            X.QDH r0 = r0.A1Q
            com.facebookpay.otc.models.OtcInput r15 = r0.A02(r6, r8)
            r16 = r5
            r17 = r4
            r18 = r1
            r20 = r7
            X.2Fk r4 = r11.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r4 == 0) goto L_0x0963
            r0 = 14
            X.TY2 r1 = X.TY2.A00(r3, r0)
            r0 = 27
            X.LZu r5 = new X.LZu
            r5.<init>(r0, r1)
            goto L_0x0979
        L_0x0a6b:
            X.SUj r0 = r4.A0N
            boolean r0 = X.SUj.A0S(r0)
            if (r0 == 0) goto L_0x0963
            android.view.ContextThemeWrapper r4 = r3.A01
            if (r4 == 0) goto L_0x0d9c
            r3 = 2131961193(0x7f132569, float:1.9559076E38)
            r1 = 2131961192(0x7f132568, float:1.9559074E38)
            X.TV6 r0 = X.TV6.A00
            X.C11394SRm.A01(r4, r0, r3, r1)
            r0 = -1551847678(0xffffffffa380af02, float:-1.3951906E-17)
            goto L_0x091a
        L_0x0a87:
            r5 = r8
            goto L_0x0883
        L_0x0a8a:
            r0 = 276774406(0x107f3e06, float:5.0337664E-29)
            int r3 = X.AnonymousClass0fD.A05(r0)
            X.Sto r7 = X.C51965G9l.A0g()
            java.lang.Object r6 = r1.A01
            X.QhP r6 = (X.C8131QhP) r6
            com.facebookpay.logging.LoggingContext r5 = r6.A0A()
            X.QDH r0 = X.QDM.A02(r6)
            X.SEB r0 = r0.A03()
            r8 = 0
            java.util.LinkedHashMap r4 = X.SUU.A07(r0)
            java.lang.String r2 = "nux_continue"
            X.0Ae r1 = r7.A00
            java.lang.String r0 = "user_click_ecpcheckout_atomic"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 393(0x189, float:5.51E-43)
            X.1Ln r1 = X.C51965G9l.A0U(r1, r0)
            r0 = 8
            X.TY3.A00(r1, r5, r4, r2, r0)
            X.SOm r0 = X.AnonymousClass2E0.A01()
            X.S1J r2 = r0.A05
            com.facebookpay.logging.LoggingContext r0 = r6.A0A()
            java.lang.String r1 = r0.A02
            java.lang.String r0 = "CONTINUE_BUTTON_CLICKED"
            r2.A00(r1, r0)
            X.QD8 r0 = r6.A0N
            java.lang.String r9 = "formViewModel"
            if (r0 == 0) goto L_0x11aa
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x0aea
            X.QD8 r0 = r6.A0N
            if (r0 == 0) goto L_0x11aa
            r0.A02()
        L_0x0ae5:
            r0 = 943302251(0x3839a66b, float:4.4262426E-5)
            goto L_0x0041
        L_0x0aea:
            X.QDM r7 = r6.A09()
            androidx.fragment.app.Fragment r5 = r6.mParentFragment
            if (r5 == 0) goto L_0x0fec
            r4 = 1
            X.2Fj r2 = r7.A0I
            boolean r0 = X.SUj.A0R(r2)
            if (r0 != 0) goto L_0x0b17
            r2.A0B(r8)
            X.2Fj r0 = r7.A0F
            java.lang.Object r0 = r0.A02()
            X.QXj r0 = (X.C7798QXj) r0
            if (r0 == 0) goto L_0x0b36
            X.QTz r0 = r0.A0F()
        L_0x0b0c:
            r1 = 1
            if (r0 == 0) goto L_0x0b1f
            X.QDH r0 = r7.A0S
            r0.A07(r4)
            r7.A06(r5)
        L_0x0b17:
            X.Sdu r0 = X.C11652Sdu.A00(r6, r4)
            X.SUj.A0G(r6, r2, r0)
            goto L_0x0ae5
        L_0x0b1f:
            boolean r0 = r7.A0C()
            if (r0 == 0) goto L_0x0b34
            X.QDH r0 = r7.A0S
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0b34
        L_0x0b2b:
            X.QDH r0 = r7.A0S
            r0.A07(r1)
            r7.A08(r8, r5)
            goto L_0x0b17
        L_0x0b34:
            r1 = 0
            goto L_0x0b2b
        L_0x0b36:
            r0 = r8
            goto L_0x0b0c
        L_0x0b38:
            r0 = 1315965233(0x4e700931, float:1.00678355E9)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.QhP r0 = (X.C8131QhP) r0
            X.C8131QhP.A07(r0)
            r0 = 1652312934(0x627c4b66, float:1.1635031E21)
            goto L_0x0041
        L_0x0b4b:
            r0 = -238812621(0xfffffffff1c40233, float:-1.941175E30)
            int r3 = X.AnonymousClass0fD.A05(r0)
            X.Sto r0 = X.C51965G9l.A0g()
            java.lang.Object r6 = r1.A01
            X.QhP r6 = (X.C8131QhP) r6
            com.facebookpay.logging.LoggingContext r5 = r6.A0A()
            java.lang.String r4 = "nux_checkout"
            r2 = 0
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "user_click_ecpcheckoutoptionality_atomic"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 395(0x18b, float:5.54E-43)
            X.1Ln r1 = X.C51965G9l.A0U(r1, r0)
            r0 = 12
            X.TY3.A00(r1, r5, r2, r4, r0)
            android.view.ContextThemeWrapper r2 = r6.A00
            if (r2 != 0) goto L_0x0b7f
            java.lang.String r9 = "wrapperContext"
            goto L_0x0d9c
        L_0x0b7f:
            r0 = 3
            X.TVt r1 = new X.TVt
            r1.<init>(r6, r0)
            X.TV8 r0 = X.TV8.A00
            X.C11394SRm.A03(r2, r1, r0)
            r0 = -1317482708(0xffffffffb178cf2c, float:-3.6206513E-9)
            goto L_0x0041
        L_0x0b8f:
            r0 = -1434351906(0xffffffffaa8186de, float:-2.3008586E-13)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.DbS.A1U(r0)
            r0 = 1581077741(0x5e3d54ed, float:3.41069744E18)
            goto L_0x0041
        L_0x0ba0:
            r0 = -936609537(0xffffffffc82c78ff, float:-176611.98)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.DbS.A1U(r0)
            r0 = 1103491602(0x41c5f212, float:24.743198)
            goto L_0x0041
        L_0x0bb1:
            r0 = -1530201389(0xffffffffa4cafad3, float:-8.802845E-17)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.DbS.A1U(r0)
            r0 = -1579024976(0xffffffffa1e1fdb0, float:-1.5313744E-18)
            goto L_0x0041
        L_0x0bc2:
            r0 = 599433621(0x23baa195, float:2.0234593E-17)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.DbS.A1U(r0)
            r0 = 1158666028(0x450fd72c, float:2301.4482)
            goto L_0x0041
        L_0x0bd3:
            r0 = 1477903960(0x58170658, float:6.6421401E14)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.DbS.A1U(r0)
            r0 = -2011287569(0xffffffff881e2fef, float:-4.760274E-34)
            goto L_0x0041
        L_0x0be4:
            r0 = -2027927580(0xffffffff872047e4, float:-1.2058189E-34)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.DbS.A1U(r0)
            r0 = -92653859(0xfffffffffa7a36dd, float:-3.2479674E35)
            goto L_0x0041
        L_0x0bf5:
            r0 = 627226003(0x2562b593, float:1.9663895E-16)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.QhL r7 = (X.C8127QhL) r7
            X.QDK r8 = r7.A0C
            if (r8 != 0) goto L_0x0c08
            java.lang.String r10 = "formFragmentViewModel"
            goto L_0x0dda
        L_0x0c08:
            com.facebookpay.form.fragment.model.FormParams r0 = r8.A01
            java.lang.String r10 = "formParams"
            r11 = 0
            if (r0 == 0) goto L_0x0dda
            com.facebookpay.form.fragment.model.FormLoggingEvents r0 = r0.A09
            if (r0 == 0) goto L_0x0c5a
            com.facebookpay.form.fragment.model.FormClickEvent r0 = r0.A01
        L_0x0c15:
            X.QDK.A02(r0, r8)
            X.2Fj r6 = r8.A09
            com.facebookpay.form.fragment.model.FormParams r1 = r8.A01
            if (r1 == 0) goto L_0x0dda
            int r4 = r1.A03
            int r3 = r1.A00
            int r2 = r1.A02
            r0 = 10
            X.SVE r12 = X.SVE.A00(r8, r0)
            int r1 = r1.A01
            r0 = 11
            X.SVE r10 = X.SVE.A00(r8, r0)
            r25 = 1
            r20 = 0
            r21 = 2131961175(0x7f132557, float:1.955904E38)
            X.SOk r9 = new X.SOk
            r13 = r11
            r14 = r11
            r15 = r11
            r16 = r11
            r17 = r11
            r18 = r3
            r19 = r1
            r22 = r20
            r23 = r2
            r24 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            X.SR4.A01(r6, r9)
            X.C8127QhL.A02(r7)
            r0 = -886933665(0xffffffffcb22775f, float:-1.0647391E7)
            goto L_0x1155
        L_0x0c5a:
            r0 = r11
            goto L_0x0c15
        L_0x0c5c:
            r0 = 1924507283(0x72b5a693, float:7.195925E30)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.QhL r0 = (X.C8127QhL) r0
            X.0sa r0 = r0.A0M
            r0.invoke()
            r0 = -1042837426(0xffffffffc1d7904e, float:-26.945461)
            goto L_0x0041
        L_0x0c71:
            r0 = -478267125(0xffffffffe37e390b, float:-4.6895834E21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.QhN r4 = (X.C8129QhN) r4
            X.QD4 r1 = r4.A04
            if (r1 != 0) goto L_0x0c84
            java.lang.String r10 = "confirmationViewModel"
            goto L_0x0dda
        L_0x0c84:
            X.2Fk r1 = r1.A02
            X.SUj r1 = X.Pxe.A0W(r1)
            if (r1 == 0) goto L_0x0c92
            java.lang.Object r3 = r1.A01
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x0c95
        L_0x0c92:
            java.lang.String r3 = "unknown"
        L_0x0c95:
            com.facebookpay.logging.LoggingContext r2 = r4.A06
            if (r2 == 0) goto L_0x0d6d
            r1 = 0
            X.C8129QhN.A02(r2, r4, r3, r1)
            X.STG.A01(r4)
            r1 = 101682370(0x60f8cc2, float:2.6998723E-35)
        L_0x0ca3:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x0ca7:
            r0 = 1404302779(0x53b3f5bb, float:1.54584364E12)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.QhS r0 = (X.C8134QhS) r0
            X.0sa r0 = r0.A0A
            r0.invoke()
            r0 = -1837368334(0xffffffff927bfbf2, float:-7.951218E-28)
            goto L_0x0041
        L_0x0cbc:
            r0 = 684053612(0x28c5d46c, float:2.1963517E-14)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.QhQ r1 = (X.C8132QhQ) r1
            android.view.ContextThemeWrapper r5 = r1.A01
            if (r5 == 0) goto L_0x0d36
            r0 = 38
            X.TVy r4 = new X.TVy
            r4.<init>(r1, r0)
            X.TV9 r2 = X.TV9.A00
            r12 = 0
            r13 = 2
            X.0qQ.A0B(r2, r13)
            X.SIG r1 = X.AnonymousClass2E0.A0H()
            r8 = 2131961424(0x7f132650, float:1.9559545E38)
            r9 = 2131961423(0x7f13264f, float:1.9559542E38)
            r10 = 2131961422(0x7f13264e, float:1.955954E38)
            r11 = 2131961303(0x7f1325d7, float:1.95593E38)
            r0 = 28
            X.SVE r6 = X.SVE.A00(r4, r0)
            r0 = 29
            X.SVE r7 = X.SVE.A00(r2, r0)
            X.SOk r0 = X.SA0.A00(r6, r7, r8, r9, r10, r11, r12, r13)
            X.SIG.A00(r5, r0, r1)
            r0 = -757520682(0xffffffffd2d926d6, float:-4.66329731E11)
            goto L_0x0041
        L_0x0d01:
            r0 = -1742498045(0xffffffff98239703, float:-2.1143498E-24)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.QhQ r0 = (X.C8132QhQ) r0
            X.C8132QhQ.A06(r0)
            r0 = -715602052(0xffffffffd558c77c, float:-1.48969557E13)
            goto L_0x0041
        L_0x0d14:
            r0 = 1728789060(0x670b3a44, float:6.5748375E23)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.QhQ r5 = (X.C8132QhQ) r5
            android.view.ContextThemeWrapper r4 = r5.A01
            if (r4 == 0) goto L_0x0d36
            boolean r2 = X.C8132QhQ.A0A(r5)
            r1 = 31
            X.TVy r0 = new X.TVy
            r0.<init>(r5, r1)
            X.C11394SRm.A04(r4, r0, r2)
            r0 = 836158651(0x31d6c4bb, float:6.2505854E-9)
            goto L_0x0041
        L_0x0d36:
            java.lang.String r9 = "viewContext"
            goto L_0x0d9c
        L_0x0d3a:
            r0 = 1174806569(0x46062029, float:8584.04)
            int r5 = X.AnonymousClass0fD.A05(r0)
            X.Sto r0 = X.C51965G9l.A0g()
            java.lang.Object r6 = r1.A01
            X.QhQ r6 = (X.C8132QhQ) r6
            com.facebookpay.logging.LoggingContext r4 = r6.A0C
            if (r4 == 0) goto L_0x0d6d
            java.lang.String r3 = "pux_checkout"
            r2 = 0
            X.0Ae r1 = r0.A00
            java.lang.String r0 = "user_click_ecpcheckoutoptionality_atomic"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 395(0x18b, float:5.54E-43)
            X.1Ln r1 = X.C51965G9l.A0U(r1, r0)
            r0 = 12
            X.TY3.A00(r1, r4, r2, r3, r0)
            android.view.ContextThemeWrapper r2 = r6.A01
            if (r2 != 0) goto L_0x0ff7
            java.lang.String r10 = "viewContext"
            goto L_0x0dda
        L_0x0d6d:
            java.lang.String r10 = "loggingContext"
            goto L_0x0dda
        L_0x0d70:
            r0 = -487028543(0xffffffffe2f888c1, float:-2.2923233E21)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            com.facebookpay.widget.accordion.AccordionView r4 = (com.facebookpay.widget.accordion.AccordionView) r4
            android.widget.LinearLayout r3 = r4.A01
            java.lang.String r9 = "expandedContainer"
            if (r3 == 0) goto L_0x0d9c
            int r0 = r3.getChildCount()
            if (r0 <= 0) goto L_0x0db5
            X.RH6 r2 = r4.A04
            java.lang.String r9 = "itemViewType"
            if (r2 == 0) goto L_0x0d9c
            X.RH6 r1 = X.RH6.A0Q
            r0 = 1
            if (r2 != r1) goto L_0x0d95
            r4.setExpansionState(r0)
        L_0x0d95:
            X.0sL r2 = r4.A08
            if (r2 != 0) goto L_0x0da0
            java.lang.String r9 = "onExpansionStateChanged"
        L_0x0d9c:
            X.0qQ.A0F(r9)
            goto L_0x0ddd
        L_0x0da0:
            X.RH6 r1 = r4.A04
            if (r1 == 0) goto L_0x0d9c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.invoke(r1, r0)
            r0 = 0
            android.view.View r1 = r3.getChildAt(r0)
            r0 = 8
            r1.sendAccessibilityEvent(r0)
        L_0x0db5:
            r0 = 1693514977(0x64f0fce1, float:3.5563523E22)
            goto L_0x10b6
        L_0x0dba:
            r0 = -1979667876(0xffffffff8a00aa5c, float:-6.195017E-33)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            com.facebookpay.widget.accordion.AccordionView r4 = (com.facebookpay.widget.accordion.AccordionView) r4
            X.RH6 r2 = r4.A04
            java.lang.String r10 = "itemViewType"
            if (r2 == 0) goto L_0x0dda
            X.RH6 r1 = X.RH6.A0Q
            r0 = 0
            if (r2 != r1) goto L_0x0dd3
            r4.setExpansionState(r0)
        L_0x0dd3:
            X.0sL r2 = r4.A08
            if (r2 != 0) goto L_0x0de2
            java.lang.String r10 = "onExpansionStateChanged"
        L_0x0dda:
            X.0qQ.A0F(r10)
        L_0x0ddd:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0de2:
            X.RH6 r1 = r4.A04
            if (r1 == 0) goto L_0x0dda
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.invoke(r1, r0)
            X.3kE r0 = r4.A03
            if (r0 == 0) goto L_0x0dfa
            android.view.View r1 = r0.itemView
            if (r1 == 0) goto L_0x0dfa
            r0 = 8
            r1.sendAccessibilityEvent(r0)
        L_0x0dfa:
            r0 = -1916274727(0xffffffff8dc7f7d9, float:-1.2323989E-30)
            goto L_0x0041
        L_0x0dff:
            r0 = -1174405332(0xffffffffb9ffff2c, float:-4.8827508E-4)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.QDP r0 = (X.QDP) r0
            X.2gB r2 = r0.A03
            r1 = 0
            X.Sty r0 = new X.Sty
            r0.<init>(r1)
            X.SR4.A01(r2, r0)
            r0 = 709914432(0x2a506f40, float:1.8512709E-13)
            goto L_0x0041
        L_0x0e1a:
            r0 = 1312485960(0x4e3af248, float:7.8411008E8)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.QDP r0 = (X.QDP) r0
            X.2gB r2 = r0.A03
            r1 = 0
            X.Sty r0 = new X.Sty
            r0.<init>(r1)
            X.SR4.A01(r2, r0)
            r0 = -1630190615(0xffffffff9ed543e9, float:-2.258034E-20)
            goto L_0x0041
        L_0x0e35:
            r0 = -2039204712(0xffffffff86743498, float:-4.592994E-35)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.Qh6 r4 = (X.C8114Qh6) r4
            java.lang.String r2 = "user_click_payouthub_atomic"
            java.lang.String r1 = "payouthub_earnings_detail_view_close_click"
            r0 = 0
            X.C8114Qh6.A02(r4, r2, r1, r0)
            X.2gB r2 = r4.A03
            r1 = 0
            X.Sty r0 = new X.Sty
            r0.<init>(r1)
            X.SR4.A01(r2, r0)
            r0 = -156089962(0xfffffffff6b24196, float:-1.8077326E33)
            goto L_0x0041
        L_0x0e5a:
            r0 = 1914872957(0x7222a47d, float:3.2214672E30)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.0sP r0 = (X.0sP) r0
            r0.invoke(r2)
            r0 = 580555341(0x229a924d, float:4.1896686E-18)
            goto L_0x0041
        L_0x0e6d:
            r0 = -1375756557(0xffffffffadff9ef3, float:-2.9060731E-11)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.ONB r0 = (X.ONB) r0
            X.0sa r0 = r0.A00
            r0.invoke()
            r0 = -32498963(0xfffffffffe101aed, float:-4.788716E37)
            goto L_0x0041
        L_0x0e82:
            r0 = -245610286(0xfffffffff15c48d2, float:-1.0907958E30)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.ONB r0 = (X.ONB) r0
            X.0sa r0 = r0.A00
            r0.invoke()
            r0 = -568098972(0xffffffffde237f64, float:-2.94531128E18)
            goto L_0x0041
        L_0x0e97:
            r0 = -882801572(0xffffffffcb61845c, float:-1.4779484E7)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.QgI r0 = (X.C8066QgI) r0
            X.Qfl r2 = r0.A04
            if (r2 == 0) goto L_0x1008
            boolean r0 = r2 instanceof X.C8048Qfv
            if (r0 == 0) goto L_0x0ebd
            X.Qfv r2 = (X.C8048Qfv) r2
            X.2Fj r1 = r2.A01
            r0 = 0
            X.JTP.A1B(r1, r0)
            X.2Fj r1 = r2.A06
            java.lang.String r0 = "fbpay.intent.action.CARD_SCANNER_LAUNCH"
            android.content.Intent r0 = X.Pxe.A0G(r0)
            X.SR4.A01(r1, r0)
        L_0x0ebd:
            r0 = -1235271732(0xffffffffb65f3fcc, float:-3.3266724E-6)
            goto L_0x0041
        L_0x0ec2:
            r0 = 1788032900(0x6a933784, float:8.898713E25)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.QgI r1 = (X.C8066QgI) r1
            com.facebookpay.form.view.BaseAutoCompleteTextView r0 = r1.getInputText()
            r0.performClick()
            X.C8066QgI.A04(r1)
            r0 = -747978277(0xffffffffd36ac1db, float:-1.0082747E12)
            goto L_0x0041
        L_0x0edc:
            r0 = -430440057(0xffffffffe6580187, float:-2.5501483E23)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.QgG r5 = (X.C8064QgG) r5
            android.content.Context r0 = r5.getContext()
            X.Vl9 r4 = new X.Vl9
            r4.<init>(r0)
            java.lang.String[] r2 = r5.getOptions()
            r0 = 9
            X.SVE r1 = X.SVE.A00(r5, r0)
            X.VdB r0 = r4.A01
            r0.A0J = r2
            r0.A03 = r1
            X.Qff r0 = r5.A00
            if (r0 == 0) goto L_0x1008
            int r0 = r0.A01
            r4.A02(r0)
            X.U5o r0 = r4.A00()
            X.AnonymousClass0fN.A00(r0)
            r0 = 2138638038(0x7f7906d6, float:3.3101327E38)
            goto L_0x0041
        L_0x0f15:
            r0 = 1955780918(0x7492d936, float:9.307628E31)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Q9x r0 = (X.Q9x) r0
            X.Qfa r0 = r0.A00
            if (r0 == 0) goto L_0x1008
            X.2Fj r1 = r0.A06
            java.lang.String r0 = "fbpay.intent.action.CARD_SCANNER_LAUNCH"
            android.content.Intent r0 = X.Pxe.A0G(r0)
            X.SR4.A01(r1, r0)
            r0 = -2058669330(0xffffffff854b32ee, float:-9.5543684E-36)
            goto L_0x0041
        L_0x0f34:
            r0 = -649385695(0xffffffffd94b2921, float:-3.57404012E15)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Q9h r2 = (X.C7374Q9h) r2
            boolean r0 = r2.A05
            r1 = r0 ^ 1
            r2.A05 = r1
            X.Qfh r0 = r2.A04
            if (r0 == 0) goto L_0x1008
            X.2gB r0 = r0.A05
            X.JTP.A1B(r0, r1)
            r0 = 2137906173(0x7f6ddbfd, float:3.1616928E38)
            goto L_0x0041
        L_0x0f53:
            r0 = 1845949492(0x6e06f434, float:1.0441554E28)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.QAP r1 = (X.QAP) r1
            r1.toggle()
            X.Qfh r0 = r1.A00
            if (r0 == 0) goto L_0x1008
            boolean r1 = r1.isChecked()
            X.2gB r0 = r0.A05
            X.JTP.A1B(r0, r1)
            r0 = -2056791260(0xffffffff8567db24, float:-1.09018176E-35)
            goto L_0x0041
        L_0x0f73:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x0f78:
            r0 = 174142768(0xa613530, float:1.08433594E-32)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.QCS r0 = (X.QCS) r0
            X.QDC r3 = r0.A08
            com.fbpay.hub.form.params.FormParams r1 = r3.A01
            com.facebookpay.logging.FBPayLoggerData r0 = r1.A00
            if (r0 == 0) goto L_0x0f94
            com.fbpay.hub.form.params.FormLogEvents r0 = r1.A02
            if (r0 == 0) goto L_0x0f94
            java.lang.String r0 = r0.A05
            X.Pxj.A1I(r3, r0)
        L_0x0f94:
            X.SOk r2 = r3.A02
            if (r2 != 0) goto L_0x0fa7
            X.2Fj r1 = r3.A06
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0f9f:
            r1.A0B(r0)
            r0 = -1362801595(0xffffffffaec54c45, float:-8.972071E-11)
            goto L_0x11e1
        L_0x0fa7:
            X.2Fj r1 = r3.A07
            X.SR4 r0 = new X.SR4
            r0.<init>(r2)
            goto L_0x0f9f
        L_0x0faf:
            r0 = 1891616165(0x70bfc5a5, float:4.748046E29)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.QCU r1 = (X.QCU) r1
            X.QDF r0 = r1.A01
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0fe4
            java.lang.String r0 = "fbpay_verify_paypal_cancel"
        L_0x0fc4:
            X.QCU.A02(r1, r0)
            X.Ryu r0 = r1.A00
            android.widget.EditText r0 = r0.A03
            X.C9667Rel.A00(r0)
            X.TQY r3 = new X.TQY
            r3.<init>()
            r2 = 0
            androidx.fragment.app.Fragment r1 = r1.mParentFragment
            boolean r0 = r1 instanceof X.C13734Tg6
            if (r0 == 0) goto L_0x0fdf
            X.Tg6 r1 = (X.C13734Tg6) r1
            r1.AVU(r2, r2, r3)
        L_0x0fdf:
            r0 = -278674106(0xffffffffef63c546, float:-7.0491586E28)
            goto L_0x11e1
        L_0x0fe4:
            java.lang.String r0 = "fbpay_verify_cvv_cancel"
            goto L_0x0fc4
        L_0x0fe7:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x0fec:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 191174430(0xb65171e, float:4.4121187E-32)
            X.AnonymousClass0fD.A0C(r0, r3)
            throw r1
        L_0x0ff7:
            r0 = 27
            X.TVy r1 = new X.TVy
            r1.<init>(r6, r0)
            X.TV8 r0 = X.TV8.A00
            X.C11394SRm.A03(r2, r1, r0)
            r0 = 1113991121(0x426627d1, float:57.538883)
            goto L_0x1155
        L_0x1008:
            X.C51965G9l.A15()
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x1010:
            r0 = 1443245760(0x56062ec0, float:3.6883837E13)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.QgR r6 = (X.C8073QgR) r6
            java.lang.String r8 = "user_click_payouthub_atomic"
            java.lang.String r9 = "payouthub_transactions_filter_icon_click"
            r7 = 0
            r10 = r7
            r11 = r7
            r12 = r7
            r13 = r7
            r14 = r7
            r15 = r7
            r16 = r7
            r17 = r7
            r18 = r7
            X.C8073QgR.A05(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.2Fj r3 = r6.A08
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            X.C8115Qh7.A0A(r2, r6)
            java.lang.String r1 = "fe_selector_view_model_class_id"
            r0 = 8
            r2.putInt(r1, r0)
            java.lang.String r1 = r6.A03
            java.lang.String r0 = "filter_transaction_type"
            r2.putString(r0, r1)
            X.3lr r0 = X.C8115Qh7.A09(r6)
            if (r0 == 0) goto L_0x1066
            java.lang.String r1 = X.Pxh.A0j(r0)
        L_0x1052:
            java.lang.String r0 = "financial_entity_id"
            r2.putString(r0, r1)
            java.lang.String r1 = "filter_fragment"
            X.Su0 r0 = new X.Su0
            r0.<init>(r1, r2)
            X.SR4.A01(r3, r0)
            r0 = -1311205763(0xffffffffb1d8967d, float:-6.303536E-9)
            goto L_0x1155
        L_0x1066:
            r1 = 0
            goto L_0x1052
        L_0x1068:
            r0 = -734166079(0xffffffffd43d83c1, float:-3.25583713E12)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.Qh9 r5 = (X.C8117Qh9) r5
            X.2Fj r4 = r5.A04
            java.lang.Object r1 = r4.A02()
            if (r1 == 0) goto L_0x10ba
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "payouthub_transactions_filter_apply_click"
            X.C8117Qh9.A04(r5, r0, r1)
            X.Qh7 r3 = r5.A01
            if (r3 == 0) goto L_0x10a8
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.Object r1 = r4.A02()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "filter_transaction_type"
            r2.putString(r0, r1)
            com.facebookpay.msc.logging.LoggingData r1 = r5.A02
            if (r1 != 0) goto L_0x109e
            java.lang.String r9 = "loggingData"
            goto L_0x11aa
        L_0x109e:
            java.lang.String r0 = "logging_data"
            r2.putParcelable(r0, r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r3.A0F(r2, r0)
        L_0x10a8:
            X.2gB r2 = r5.A03
            r1 = 0
            X.Sty r0 = new X.Sty
            r0.<init>(r1)
            X.SR4.A01(r2, r0)
            r0 = -1018838858(0xffffffffc345c0b6, float:-197.75278)
        L_0x10b6:
            X.AnonymousClass0fD.A0C(r0, r6)
            return
        L_0x10ba:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x10bf:
            r0 = 1155513282(0x44dfbbc2, float:1789.8674)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.QgH r2 = (X.C8065QgH) r2
            X.5tS r1 = r2.A00
            java.lang.String r9 = "viewModel"
            if (r1 == 0) goto L_0x11aa
            r0 = 1
            r1.A0L(r0)
            X.SRV r3 = X.AnonymousClass2E0.A0E()
            X.SIG r0 = r3.A05
            if (r0 != 0) goto L_0x10e6
            com.instagram.common.session.UserSession r1 = r3.A09
            X.SIG r0 = new X.SIG
            r0.<init>(r1)
            r3.A05 = r0
        L_0x10e6:
            android.content.Context r8 = X.AnonymousClass7TE.A0S(r2)
            java.lang.String r7 = r2.getExistingLabel()
            X.5tS r0 = r2.A00
            if (r0 == 0) goto L_0x11aa
            com.google.common.collect.ImmutableList r6 = r0.A02
            int r0 = r6.size()
            java.lang.String[] r4 = new java.lang.String[r0]
            int r3 = r6.size()
            r1 = 0
        L_0x10ff:
            if (r1 >= r3) goto L_0x1116
            java.lang.Object r0 = r6.get(r1)
            com.facebookpay.form.model.FormCountry r0 = (com.facebookpay.form.model.FormCountry) r0
            if (r0 == 0) goto L_0x1113
            com.facebook.common.locale.Country r0 = r0.A00
            java.util.Locale r0 = r0.A00
            java.lang.String r0 = r0.getDisplayCountry()
            r4[r1] = r0
        L_0x1113:
            int r1 = r1 + 1
            goto L_0x10ff
        L_0x1116:
            java.util.List r0 = X.03t.A0J(r4)
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1D(r0)
            r0 = 8
            X.SVE r4 = X.SVE.A00(r2, r0)
            X.SV9 r3 = X.SV9.A00
            r1 = 2
            X.SVF r0 = new X.SVF
            r0.<init>(r2, r1)
            r1 = 0
            r0 = 2131962653(0x7f132b1d, float:1.9562037E38)
            X.Vl9 r2 = new X.Vl9
            r2.<init>(r8)
            if (r7 == 0) goto L_0x113a
            r2.A08(r7)
        L_0x113a:
            r2.A03(r3, r0)
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[r1]
            java.lang.Object[] r1 = r6.toArray(r0)
            java.lang.CharSequence[] r1 = (java.lang.CharSequence[]) r1
            X.VdB r0 = r2.A01
            r0.A0J = r1
            r0.A03 = r4
            X.U5o r0 = r2.A00()
            X.AnonymousClass0fN.A00(r0)
            r0 = -788251041(0xffffffffd1043e5f, float:-3.5498881E10)
        L_0x1155:
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        L_0x1159:
            r0 = -557342087(0xffffffffdec7a279, float:-7.1925966E18)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.Qh7 r5 = (X.C8115Qh7) r5
            X.2FO r3 = X.C11426STk.A00()
            com.facebookpay.msc.logging.LoggingData r0 = r5.A0E()
            java.util.HashMap r2 = X.C9634ReE.A00(r0)
            X.2gB r6 = r5.A03
            java.lang.Object r0 = r6.A02()
            X.3lr r0 = (X.C250663lr) r0
            if (r0 == 0) goto L_0x11e5
            java.lang.String r1 = X.Pxh.A0j(r0)
            if (r1 == 0) goto L_0x11e5
            java.lang.String r0 = "financial_entity_id"
            r2.put(r0, r1)
            java.lang.String r1 = "target_name"
            java.lang.String r0 = "payouthub_fe_selector_click"
            r2.put(r1, r0)
            java.lang.String r1 = r5.A0B()
            java.lang.String r0 = "view_name"
            r2.put(r0, r1)
            java.lang.String r0 = "user_click_payouthub_atomic"
            r3.Cgl(r0, r2)
            X.2Fj r3 = r5.A08
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.util.List r0 = r5.A02
            if (r0 != 0) goto L_0x11b2
            java.lang.String r9 = "financialEntities"
        L_0x11aa:
            X.0qQ.A0F(r9)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x11b2:
            X.C11405SSc.A04(r0, r2)
            java.lang.Object r1 = r6.A02()
            X.3ls r1 = (X.C250673ls) r1
            java.lang.String r0 = "financial_entity"
            X.C11405SSc.A03(r2, r1, r0)
            X.C8115Qh7.A0A(r2, r5)
            int r1 = r5.A00
            java.lang.String r0 = "fe_selector_view_model_class_id"
            r2.putInt(r0, r1)
            java.lang.String r1 = r5.A0B()
            java.lang.String r0 = "parent_view_name"
            r2.putString(r0, r1)
            java.lang.String r1 = "fe_selector_fragment"
            X.Su0 r0 = new X.Su0
            r0.<init>(r1, r2)
            X.SR4.A01(r3, r0)
            r0 = -1995286124(0xffffffff89125994, float:-1.761623E-33)
        L_0x11e1:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x11e5:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11496SbJ.onClick(android.view.View):void");
    }
}
