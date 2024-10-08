package X;

import android.text.TextUtils;

/* renamed from: X.Sdu  reason: case insensitive filesystem */
public final class C11652Sdu implements AnonymousClass2gO {
    public final int A00;
    public final Object A01;

    public C11652Sdu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C11652Sdu A00(Object obj, int i) {
        return new C11652Sdu(obj, i);
    }

    public static void A02(AnonymousClass07Z r1, 2Fk r2, int i) {
        r2.A06(r1, new C11652Sdu(r1, i));
    }

    public static void A03(2Fk r1, AnonymousClass2gB r2, Object obj, int i) {
        r2.A0E(r1, new C11652Sdu(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v408, resolved type: X.Suo} */
    /* JADX WARNING: type inference failed for: r1v16, types: [X.Tg6, java.lang.Object, X.Sum] */
    /* JADX WARNING: type inference failed for: r0v38, types: [X.Tg7] */
    /* JADX WARNING: type inference failed for: r3v10, types: [java.lang.Object, X.SGZ] */
    /* JADX WARNING: type inference failed for: r1v44, types: [X.Tg7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v16, types: [X.Qxj, X.QAL, android.app.Dialog] */
    /* JADX WARNING: type inference failed for: r0v407 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0506, code lost:
        X.AnonymousClass0fN.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0509, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x05b6, code lost:
        r1 = ((X.SOC) r1.A01).A01.A01;
        X.SSC.A04(r1.A03.A00, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x05c5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x072b, code lost:
        X.QCI.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x072e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x075b, code lost:
        r1.A0A(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x075e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0849, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x084b, code lost:
        r1 = r3.getContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x084f, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0851, code lost:
        r2 = X.Pxf.A0G(r1);
        r1 = r1.getSystemService("input_method");
        X.0qQ.A0C(r1, X.AnonymousClass000.A00(11));
        r1 = (android.view.inputmethod.InputMethodManager) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0868, code lost:
        if (r2.keyboard == r4) goto L_0x086e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x086c, code lost:
        if (r2.hardKeyboardHidden == r4) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x086e, code lost:
        r1.showSoftInput(r3, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0872, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0931, code lost:
        X.SR4.A02(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0934, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e3, code lost:
        r0 = X.SUj.A09(new X.AnonymousClass34S(r0, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0aa6, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0ad8, code lost:
        X.0qQ.A0F(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f6, code lost:
        r0 = java.lang.Boolean.valueOf(X.SUj.A0T(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0b56, code lost:
        if (X.SUj.A0T(r0) == false) goto L_0x0c31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r3 = (X.QD7) r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0cc0, code lost:
        r3.A02(r2, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0cc3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0db3, code lost:
        if (r1.A00.A04() != false) goto L_0x0dd6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r1 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0dd4, code lost:
        if (X.AnonymousClass7TE.A1a(r1.A02()) != false) goto L_0x0ddb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0dd6, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0dd7, code lost:
        X.JTP.A1B(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0dda, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0ddb, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0e76, code lost:
        if (r7 == null) goto L_0x0e82;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x0e78, code lost:
        r6 = r4.A09;
        r2 = X.QDC.A00(r4, (java.lang.Object) null, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0e7f, code lost:
        r6.Cgl(r7, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x0e82, code lost:
        X.SR4.A01(((X.QDC) r1.A01).A03, java.lang.Boolean.valueOf(X.SUj.A0V(r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0e93, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x0f0e, code lost:
        if (r7 == null) goto L_0x0e82;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x0f10, code lost:
        r6 = r5.A09;
        r2 = X.QDC.A00(r5, (java.lang.Object) null, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        X.JTP.A1B(r1, X.SUj.A0T(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:611:0x107d, code lost:
        r0 = (X.QCm) r1.A01;
        r0.A00 = r5;
        X.QCm.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:612:0x1086, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:617:0x10c6, code lost:
        r1.setEnabled(!r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:618:0x10cb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:642:0x1190, code lost:
        r1.A0B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:643:0x1193, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:649:0x11b7, code lost:
        r0.setVisibility(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:650:0x11ba, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:660:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:684:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:685:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:686:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0255, code lost:
        r3.Cgl(r2, r4);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onChanged(java.lang.Object r25) {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
            int r2 = r1.A00
            switch(r2) {
                case 0: goto L_0x09b9;
                case 1: goto L_0x0aa7;
                case 2: goto L_0x0a35;
                case 3: goto L_0x0935;
                case 4: goto L_0x1186;
                case 5: goto L_0x117c;
                case 6: goto L_0x0908;
                case 7: goto L_0x110a;
                case 8: goto L_0x10ff;
                case 9: goto L_0x10f5;
                case 10: goto L_0x10cc;
                case 11: goto L_0x08c1;
                case 12: goto L_0x10ad;
                case 13: goto L_0x0884;
                case 14: goto L_0x075f;
                case 15: goto L_0x00ee;
                case 16: goto L_0x00d0;
                case 17: goto L_0x072f;
                case 18: goto L_0x1093;
                case 19: goto L_0x06fa;
                case 20: goto L_0x06e9;
                case 21: goto L_0x061a;
                case 22: goto L_0x00c7;
                case 23: goto L_0x00bf;
                case 24: goto L_0x05c6;
                case 25: goto L_0x1087;
                case 26: goto L_0x103d;
                case 27: goto L_0x1000;
                case 28: goto L_0x0f85;
                case 29: goto L_0x0f7d;
                case 30: goto L_0x0f7d;
                case 31: goto L_0x004e;
                case 32: goto L_0x05b6;
                case 33: goto L_0x05a8;
                case 34: goto L_0x0f66;
                case 35: goto L_0x10f5;
                case 36: goto L_0x0019;
                case 37: goto L_0x0f57;
                case 38: goto L_0x0f31;
                case 39: goto L_0x0575;
                case 40: goto L_0x0f29;
                case 41: goto L_0x0009;
                case 42: goto L_0x0f21;
                case 43: goto L_0x0f19;
                case 44: goto L_0x0009;
                case 45: goto L_0x0541;
                case 46: goto L_0x0531;
                case 47: goto L_0x0516;
                case 48: goto L_0x04d9;
                case 49: goto L_0x119d;
                case 50: goto L_0x04cf;
                case 51: goto L_0x0e5e;
                case 52: goto L_0x0ddd;
                case 53: goto L_0x0db6;
                case 54: goto L_0x0d9f;
                case 55: goto L_0x0d8b;
                case 56: goto L_0x0445;
                case 57: goto L_0x0ccc;
                case 58: goto L_0x0436;
                case 59: goto L_0x0436;
                case 60: goto L_0x0cc4;
                case 61: goto L_0x0cb5;
                case 62: goto L_0x02c2;
                case 63: goto L_0x025a;
                case 64: goto L_0x0ca9;
                case 65: goto L_0x0208;
                case 66: goto L_0x01e7;
                case 67: goto L_0x0009;
                case 68: goto L_0x018d;
                case 69: goto L_0x0144;
                case 70: goto L_0x0100;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.SUj r0 = (X.SUj) r0
        L_0x000b:
            java.lang.Object r3 = r1.A01
            X.QD7 r3 = (X.QD7) r3
        L_0x000f:
            X.2gB r1 = r3.A03
        L_0x0011:
            boolean r0 = X.SUj.A0T(r0)
            X.JTP.A1B(r1, r0)
        L_0x0018:
            return
        L_0x0019:
            X.SOk r0 = (X.C11351SOk) r0
            java.lang.Object r5 = r1.A01
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            X.Vl9 r4 = new X.Vl9
            r4.<init>(r1)
            int r1 = r0.A06
            r4.A02(r1)
            int r1 = r0.A00
            r4.A01(r1)
            int r3 = r0.A05
            r2 = 2
            X.SV1 r1 = new X.SV1
            r1.<init>(r2, r0, r5)
            r4.A04(r1, r3)
            int r3 = r0.A01
            r2 = 1
            X.SV1 r1 = new X.SV1
            r1.<init>(r2, r0, r5)
            r4.A03(r1, r3)
            X.U5o r0 = r4.A00()
            goto L_0x0506
        L_0x004e:
            X.SUj r0 = (X.SUj) r0
            r5 = 0
            X.0qQ.A0B(r0, r5)
            java.lang.Object r4 = r1.A01
            X.Sus r4 = (X.C12460Sus) r4
            java.lang.Throwable r7 = r0.A02
            boolean r1 = r7 instanceof X.C13215TQg
            if (r1 == 0) goto L_0x0ca3
            X.TQg r7 = (X.C13215TQg) r7
            java.lang.Throwable r1 = r7.getCause()
            boolean r1 = r1 instanceof X.TQW
            if (r1 != 0) goto L_0x0081
            java.lang.Throwable r2 = r7.getCause()
            if (r2 == 0) goto L_0x0ca3
            boolean r1 = r2 instanceof android.security.keystore.UserNotAuthenticatedException
            if (r1 != 0) goto L_0x0081
            java.lang.String r3 = r2.getMessage()
            r2 = 1
            if (r3 == 0) goto L_0x0ca3
            java.lang.String r1 = "Key user not authenticated"
            boolean r1 = X.00l.A0d(r3, r1, r5)
            if (r1 != r2) goto L_0x0ca3
        L_0x0081:
            java.util.Map r6 = r4.A07
            java.util.Iterator r5 = X.DbV.A16(r6)
        L_0x0087:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0ca3
            java.lang.Object r3 = r5.next()
            r1 = r3
            X.S6f r1 = (X.C11027S6f) r1
            java.lang.String r2 = r1.A00
            X.SNj r1 = r7.A00
            java.lang.String r1 = r1.A03
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0087
            if (r3 == 0) goto L_0x0ca3
            r0 = 0
            r6.put(r3, r0)
            X.SSY r2 = r4.A03
            r0 = 1
            java.util.ArrayDeque r7 = new java.util.ArrayDeque
            r7.<init>(r0)
            r7.add(r3)
            X.2Fj r3 = r4.A02
            java.lang.String r6 = r4.A06
            java.lang.Object r5 = r4.A05
            X.RsH r4 = r4.A00
            if (r4 != 0) goto L_0x0c9f
            java.lang.String r11 = "inProgressAuthObject"
            goto L_0x0ad8
        L_0x00bf:
            java.lang.Object r1 = r1.A01
            X.QDI r1 = (X.QDI) r1
            X.2gB r2 = r1.A06
            r4 = 0
            goto L_0x00e3
        L_0x00c7:
            X.SUj r0 = (X.SUj) r0
            java.lang.Object r1 = r1.A01
            X.QDI r1 = (X.QDI) r1
            X.2gB r1 = r1.A05
            goto L_0x00f6
        L_0x00d0:
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            java.lang.Object r3 = r1.A01
            X.QDF r3 = (X.QDF) r3
            java.lang.String r2 = r3.A02
            if (r2 == 0) goto L_0x00e1
            java.lang.String r1 = "AUTH_FLOW_UTIL_CVV_CREDENTIAL_ENTERED"
            r4.putString(r1, r2)
        L_0x00e1:
            X.2gB r2 = r3.A05
        L_0x00e3:
            X.34S r1 = new X.34S
            r1.<init>(r0, r4)
            X.SUj r0 = X.SUj.A09(r1)
            goto L_0x0931
        L_0x00ee:
            X.SUj r0 = (X.SUj) r0
            java.lang.Object r1 = r1.A01
            X.QDF r1 = (X.QDF) r1
            X.2gB r1 = r1.A04
        L_0x00f6:
            boolean r0 = X.SUj.A0T(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x075b
        L_0x0100:
            X.SUj r0 = (X.SUj) r0
            boolean r2 = X.SUj.A0V(r0)
            if (r2 == 0) goto L_0x012c
            java.lang.Object r5 = r1.A01
            X.QnB r5 = (X.C8269QnB) r5
            java.lang.Object r3 = r0.A01
            r3.getClass()
            com.fbpay.hub.paymentmethods.api.FbPayPayPal r3 = (com.fbpay.hub.paymentmethods.api.FbPayPayPal) r3
            com.facebookpay.logging.FBPayLoggerData r2 = r5.A04
            java.util.LinkedHashMap r4 = X.C2818159r.A06(r2)
            java.lang.String r2 = r3.A00
            X.Pxj.A1N(r2, r4)
            X.2FO r3 = r5.A0E
            java.lang.String r2 = "fbpay_add_paypal_succeed"
            r3.Cgl(r2, r4)
            X.S2Q r3 = r5.A06
            java.util.Set r2 = r5.A0G
            r3.A00(r2)
        L_0x012c:
            boolean r0 = X.SUj.A0S(r0)
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r1.A01
            X.QnB r0 = (X.C8269QnB) r0
            X.2FO r2 = r0.A0E
            com.facebookpay.logging.FBPayLoggerData r0 = r0.A04
            java.util.LinkedHashMap r1 = X.C2818159r.A06(r0)
            java.lang.String r0 = "fbpay_add_paypal_fail"
            r2.Cgl(r0, r1)
            return
        L_0x0144:
            X.SUj r0 = (X.SUj) r0
            boolean r2 = X.SUj.A0V(r0)
            if (r2 == 0) goto L_0x0174
            java.lang.Object r5 = r1.A01
            X.QnF r5 = (X.C8273QnF) r5
            com.facebookpay.logging.FBPayLoggerData r2 = r5.A01
            java.util.LinkedHashMap r4 = X.C2818159r.A06(r2)
            X.C8273QnF.A01(r5, r4)
            X.2FO r3 = r5.A06
            java.lang.String r2 = "client_remove_credential_success"
            r3.Cgl(r2, r4)
            X.2Fj r3 = r5.A09
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            r3.A0B(r2)
            X.2Fj r3 = r5.A07
            java.lang.Boolean r2 = X.AnonymousClass7TE.A0v()
            X.SR4.A01(r3, r2)
            goto L_0x000b
        L_0x0174:
            boolean r2 = X.SUj.A0S(r0)
            if (r2 == 0) goto L_0x000b
            java.lang.Object r3 = r1.A01
            X.QnF r3 = (X.C8273QnF) r3
            com.facebookpay.logging.FBPayLoggerData r2 = r3.A01
            java.util.LinkedHashMap r4 = X.C2818159r.A06(r2)
            X.C8273QnF.A01(r3, r4)
            X.2FO r3 = r3.A06
            java.lang.String r2 = "client_remove_credential_fail"
            goto L_0x0255
        L_0x018d:
            X.SUj r0 = (X.SUj) r0
            boolean r2 = X.SUj.A0V(r0)
            if (r2 == 0) goto L_0x0018
            java.lang.Object r0 = r0.A01
            r0.getClass()
            X.Cwm r0 = (X.C45455Cwm) r0
            com.google.common.collect.ImmutableList r0 = r0.A04
            X.3kO r5 = r0.iterator()
        L_0x01a2:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x01ce
            java.lang.Object r0 = r5.next()
            com.fbpay.hub.paymentmethods.api.FbPayPaymentMethod r0 = (com.fbpay.hub.paymentmethods.api.FbPayPaymentMethod) r0
            com.fbpay.hub.paymentmethods.api.FbPayShopPay r4 = r0.A05
            if (r4 == 0) goto L_0x01a2
            java.lang.String r2 = r4.A00
            java.lang.Object r3 = r1.A01
            X.QnF r3 = (X.C8273QnF) r3
            com.fbpay.hub.paymentmethods.api.FbPayShopPay r0 = r3.A02
            java.lang.String r0 = r0.A00
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01a2
            r3.A02 = r4
            X.2gB r2 = r3.A03
            com.google.common.collect.ImmutableList r1 = X.C8273QnF.A00(r3)
        L_0x01ca:
            r2.A0B(r1)
            return
        L_0x01ce:
            java.lang.Object r2 = r1.A01
            X.QD7 r2 = (X.QD7) r2
            X.2Fj r1 = r2.A09
            android.os.Bundle r0 = X.AnonymousClass7TE.A0a()
            r1.A0B(r0)
            X.2Fj r2 = r2.A07
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            X.SR4 r1 = new X.SR4
            r1.<init>(r0)
            goto L_0x01ca
        L_0x01e7:
            X.SUj r0 = (X.SUj) r0
            boolean r2 = X.SUj.A0V(r0)
            if (r2 == 0) goto L_0x000b
            java.lang.Object r4 = r1.A01
            X.QnF r4 = (X.C8273QnF) r4
            X.2Fj r3 = r4.A04
            java.lang.Object r2 = X.SUj.A0D(r0)
            X.SR4.A01(r3, r2)
            X.2Fk r3 = r4.A00
            r3.getClass()
            X.2gO r2 = r4.A05
            r3.A08(r2)
            goto L_0x000b
        L_0x0208:
            X.SUj r0 = (X.SUj) r0
            boolean r2 = X.SUj.A0V(r0)
            if (r2 == 0) goto L_0x023a
            java.lang.Object r5 = r1.A01
            X.QnA r5 = (X.C8268QnA) r5
            com.facebookpay.logging.FBPayLoggerData r2 = r5.A01
            java.util.LinkedHashMap r4 = X.C2818159r.A06(r2)
            com.fbpay.hub.paymentmethods.api.FbPayPayPal r2 = r5.A02
            java.lang.String r2 = r2.A00
            X.Pxj.A1N(r2, r4)
            X.2FO r3 = r5.A04
            java.lang.String r2 = "fbpay_remove_paypal_succeed"
            r3.Cgl(r2, r4)
            X.2Fj r3 = r5.A09
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            r3.A0B(r2)
            X.2Fj r3 = r5.A07
            java.lang.Boolean r2 = X.AnonymousClass7TE.A0v()
            X.SR4.A01(r3, r2)
        L_0x023a:
            boolean r2 = X.SUj.A0S(r0)
            if (r2 == 0) goto L_0x000b
            java.lang.Object r3 = r1.A01
            X.QnA r3 = (X.C8268QnA) r3
            com.facebookpay.logging.FBPayLoggerData r2 = r3.A01
            java.util.LinkedHashMap r4 = X.C2818159r.A06(r2)
            com.fbpay.hub.paymentmethods.api.FbPayPayPal r2 = r3.A02
            java.lang.String r2 = r2.A00
            X.Pxj.A1N(r2, r4)
            X.2FO r3 = r3.A04
            java.lang.String r2 = "fbpay_remove_paypal_fail"
        L_0x0255:
            r3.Cgl(r2, r4)
            goto L_0x000b
        L_0x025a:
            java.lang.Object r0 = X.SR4.A00(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0018
            java.lang.Object r4 = r1.A01
            X.Qn3 r4 = (X.Qn3) r4
            android.util.SparseArray r0 = X.QCW.A06
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            X.AnonymousClass2E0.A0E()
            r1 = 2132017771(0x7f14026b, float:1.967383E38)
            java.lang.String r0 = "STYLE_RES"
            r5.putInt(r0, r1)
            X.QnB r3 = r4.A01
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.Class<X.QnC> r1 = X.C8270QnC.class
            java.lang.String r0 = "viewmodel_class"
            r2.putSerializable(r0, r1)
            com.facebookpay.logging.FBPayLoggerData r1 = r3.A04
            r1.getClass()
            java.lang.String r0 = "logger_data"
            r2.putParcelable(r0, r1)
            java.lang.String r1 = "paymentType"
            java.lang.String r0 = "FBPAY_HUB"
            r2.putString(r1, r0)
            X.Qn2 r3 = new X.Qn2
            r3.<init>()
            r3.setArguments(r2)
            X.Qxp r2 = new X.Qxp
            r2.<init>()
            r2.setArguments(r5)
            X.0hq r1 = r4.getParentFragmentManager()
            r0 = 0
            X.AnonymousClass7TG.A1N(r1, r3)
            r2.A06 = r3
            r2.A0B(r1, r0)
            X.SvU r0 = new X.SvU
            r0.<init>(r2, r4)
            r3.A00 = r0
            return
        L_0x02c2:
            java.lang.Object r0 = X.SR4.A00(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0018
            java.lang.Object r5 = r1.A01
            X.Qn3 r5 = (X.Qn3) r5
            android.util.SparseArray r0 = X.QCW.A06
            X.Qxj r0 = r5.A00
            if (r0 != 0) goto L_0x0402
            android.os.Bundle r2 = r5.requireArguments()
            java.lang.String r1 = "paymentType"
            java.lang.String r0 = "FBPAY_HUB"
            java.lang.String r7 = r2.getString(r1, r0)
            android.content.Context r1 = r5.A01
            X.AnonymousClass2E0.A0E()
            r0 = 2132017776(0x7f140270, float:1.967384E38)
            X.Qxj r8 = new X.Qxj
            r8.<init>(r1, r0)
            android.content.Context r2 = r8.getContext()
            r1 = 2131625989(0x7f0e0805, float:1.8879202E38)
            r0 = 0
            android.view.View r1 = android.view.View.inflate(r2, r1, r0)
            r8.setContentView(r1)
            android.widget.TextView r0 = X.Dba.A06(r1)
            r8.A02 = r0
            r0 = 2131430679(0x7f0b0d17, float:1.8483066E38)
            android.view.View r3 = r1.requireViewById(r0)
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            android.content.Context r0 = r8.getContext()
            r8.A00 = r0
            X.AnonymousClass2E0.A0E()
            android.content.Context r2 = r8.getContext()
            X.AnonymousClass2E0.A0E()
            r1 = 2132017770(0x7f14026a, float:1.9673828E38)
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            r0.<init>(r2, r1)
            r8.A00 = r0
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r3.setLayoutInflater(r0)
            r0 = 2131625987(0x7f0e0803, float:1.8879197E38)
            android.view.View r1 = X.JTP.A0H(r3, r0)
            r8.A01 = r1
            r0 = 2131427690(0x7f0b016a, float:1.8477003E38)
            android.view.View r4 = r1.requireViewById(r0)
            android.view.View r1 = r8.A01
            r0 = 2131427731(0x7f0b0193, float:1.8477087E38)
            android.view.View r10 = r1.requireViewById(r0)
            android.view.View r1 = r8.A01
            r0 = 2131427747(0x7f0b01a3, float:1.8477119E38)
            android.view.View r9 = r1.requireViewById(r0)
            r3 = 2131969218(0x7f1344c2, float:1.9575353E38)
            r2 = 2131239448(0x7f082218, float:1.8095203E38)
            android.widget.TextView r1 = X.Dba.A06(r4)
            r6 = 2131434047(0x7f0b1a3f, float:1.8489897E38)
            android.widget.ImageView r0 = X.DbU.A0F(r4, r6)
            r1.setText(r3)
            r0.setImageResource(r2)
            r3 = 2131969220(0x7f1344c4, float:1.9575357E38)
            r2 = 2131239444(0x7f082214, float:1.8095195E38)
            android.widget.TextView r1 = X.Dba.A06(r10)
            android.widget.ImageView r0 = X.DbU.A0F(r10, r6)
            r1.setText(r3)
            r0.setImageResource(r2)
            android.content.Context r2 = r8.A00
            r1 = 2130969523(0x7f0403b3, float:1.754773E38)
            r0 = 0
            X.0qQ.A0B(r2, r0)
            android.util.TypedValue r0 = X.Pxj.A0J(r2, r1)
            int r3 = r0.resourceId
            r2 = 2131969221(0x7f1344c5, float:1.9575359E38)
            android.widget.TextView r1 = X.Dba.A06(r9)
            android.widget.ImageView r0 = X.DbU.A0F(r9, r6)
            r1.setText(r2)
            r0.setImageResource(r3)
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r8.A03 = r0
            X.REG r6 = X.REG.CREDIT_CARD
            r0.put(r6, r4)
            java.util.Map r0 = r8.A03
            X.REG r4 = X.REG.PAYPAL
            r0.put(r4, r10)
            java.util.Map r0 = r8.A03
            X.REG r3 = X.REG.SHOP_PAY
            r0.put(r3, r9)
            r5.A00 = r8
            r1 = 2131969225(0x7f1344c9, float:1.9575367E38)
            android.widget.TextView r0 = r8.A02
            r0.setText(r1)
            X.Qxj r2 = r5.A00
            r0 = 4
            X.Sb7 r1 = new X.Sb7
            r1.<init>(r7, r5, r0)
            java.util.Map r0 = r2.A03
            java.lang.Object r0 = r0.get(r6)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x03d8
            X.AnonymousClass0fU.A00(r1, r0)
        L_0x03d8:
            X.Qxj r2 = r5.A00
            r0 = 58
            X.SbJ r1 = X.C11496SbJ.A00(r5, r0)
            java.util.Map r0 = r2.A03
            java.lang.Object r0 = r0.get(r4)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x03ed
            X.AnonymousClass0fU.A00(r1, r0)
        L_0x03ed:
            X.Qxj r2 = r5.A00
            r0 = 59
            X.SbJ r1 = X.C11496SbJ.A00(r5, r0)
            java.util.Map r0 = r2.A03
            java.lang.Object r0 = r0.get(r3)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x0402
            X.AnonymousClass0fU.A00(r1, r0)
        L_0x0402:
            X.Qxj r4 = r5.A00
            X.QnB r0 = r5.A01
            java.util.Set r0 = r0.A0F
            r4.A04 = r0
            java.util.Map r0 = r4.A03
            java.util.Iterator r3 = X.AnonymousClass7TF.A0u(r0)
        L_0x0410:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0432
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r3)
            java.lang.Object r2 = r0.getValue()
            android.view.View r2 = (android.view.View) r2
            java.util.Set r1 = r4.A04
            java.lang.Object r0 = r0.getKey()
            boolean r0 = r1.contains(r0)
            int r0 = X.DbW.A01(r0)
            r2.setVisibility(r0)
            goto L_0x0410
        L_0x0432:
            X.Qxj r0 = r5.A00
            goto L_0x0506
        L_0x0436:
            X.SUj r0 = (X.SUj) r0
            java.lang.Object r3 = r1.A01
            X.QD7 r3 = (X.QD7) r3
            X.2Fj r2 = r3.A08
            X.RDz r1 = r0.A00
            r2.A0B(r1)
            goto L_0x000f
        L_0x0445:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0018
            java.lang.Object r7 = r1.A01
            X.QCT r7 = (X.QCT) r7
            X.0hq r1 = r7.getChildFragmentManager()
            r9 = 2131437369(0x7f0b2739, float:1.8496635E38)
            androidx.fragment.app.Fragment r1 = r1.A0P(r9)
            if (r1 != 0) goto L_0x0495
            X.0s1 r8 = X.DbW.A0C(r7)
            X.SRV r6 = X.AnonymousClass2E0.A0E()
            boolean r5 = r0.booleanValue()
            if (r5 == 0) goto L_0x04cb
            java.lang.String r4 = "transactions_list"
        L_0x046b:
            X.QD5 r1 = r7.A02
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "has_container_fragment"
            r2 = 1
            r3.putBoolean(r0, r2)
            com.facebookpay.logging.FBPayLoggerData r1 = r1.A00
            java.lang.String r0 = "logger_data"
            r3.putParcelable(r0, r1)
            java.lang.String r0 = "is_short_version"
            r3.putBoolean(r0, r2)
            if (r5 == 0) goto L_0x048b
            java.lang.String r0 = "use_transactions_v1"
            r3.putBoolean(r0, r2)
        L_0x048b:
            androidx.fragment.app.Fragment r0 = r6.A04(r3, r4)
            r8.A0A(r0, r9)
            r8.A00()
        L_0x0495:
            X.0hq r0 = r7.getChildFragmentManager()
            r6 = 2131436127(0x7f0b225f, float:1.8494116E38)
            androidx.fragment.app.Fragment r0 = r0.A0P(r6)
            if (r0 != 0) goto L_0x0018
            X.0s1 r5 = X.DbW.A0C(r7)
            X.SRV r4 = X.AnonymousClass2E0.A0E()
            X.QD5 r3 = r7.A02
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "has_container_fragment"
            r0 = 1
            r2.putBoolean(r1, r0)
            com.facebookpay.logging.FBPayLoggerData r1 = r3.A00
            java.lang.String r0 = "logger_data"
            r2.putParcelable(r0, r1)
            java.lang.String r0 = "menu"
            androidx.fragment.app.Fragment r0 = r4.A04(r2, r0)
            r5.A0A(r0, r6)
            r5.A00()
            return
        L_0x04cb:
            java.lang.String r4 = "orders"
            goto L_0x046b
        L_0x04cf:
            X.SUj r0 = (X.SUj) r0
            java.lang.Object r1 = r1.A01
            X.QDC r1 = (X.QDC) r1
            X.2gB r1 = r1.A04
            goto L_0x0011
        L_0x04d9:
            java.lang.Object r4 = X.SR4.A00(r0)
            X.SOk r4 = (X.C11351SOk) r4
            if (r4 == 0) goto L_0x050a
            java.lang.Object r3 = r1.A01
            X.QCS r3 = (X.QCS) r3
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L_0x050a
            X.SRV r2 = X.AnonymousClass2E0.A0E()
            X.SIG r1 = r2.A05
            if (r1 != 0) goto L_0x04fc
            com.instagram.common.session.UserSession r0 = r2.A09
            X.SIG r1 = new X.SIG
            r1.<init>(r0)
            r2.A05 = r1
        L_0x04fc:
            android.content.Context r0 = r3.getContext()
            android.app.Dialog r0 = r1.A01(r0, r4)
            r3.A00 = r0
        L_0x0506:
            X.AnonymousClass0fN.A00(r0)
            return
        L_0x050a:
            java.lang.Object r0 = r1.A01
            X.QCS r0 = (X.QCS) r0
            android.app.Dialog r0 = r0.A00
            if (r0 == 0) goto L_0x0018
            r0.dismiss()
            return
        L_0x0516:
            java.lang.Object r0 = X.SR4.A00(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0018
            java.lang.Object r2 = r1.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            r0 = 1
            X.C11093S9u.A00(r1, r2, r0)
            return
        L_0x0531:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.Fragment r1 = r0.mParentFragment
            boolean r0 = r1 instanceof X.C8810RAm
            if (r0 == 0) goto L_0x0018
            X.RAm r1 = (X.C8810RAm) r1
            r1.A00()
            return
        L_0x0541:
            java.lang.Object r4 = X.SR4.A00(r0)
            android.content.Intent r4 = (android.content.Intent) r4
            if (r4 == 0) goto L_0x0018
            java.lang.Object r3 = r1.A01
            X.QCS r3 = (X.QCS) r3
            com.fbpay.hub.form.params.FormParams r0 = r3.A07
            com.facebookpay.logging.FBPayLoggerData r0 = r0.A00
            if (r0 == 0) goto L_0x056d
            java.util.LinkedHashMap r2 = X.C2818159r.A06(r0)
            java.lang.String r1 = "target_name"
            java.lang.String r0 = "card_scanner"
            r2.put(r1, r0)
            java.lang.String r1 = "credit_card"
            java.lang.String r0 = "credential_type"
            X.2FO r1 = X.SRV.A02(r0, r1, r2)
            java.lang.String r0 = "user_add_credential_enter"
            r1.Cgl(r0, r2)
        L_0x056d:
            X.AnonymousClass2E0.A07()
            r0 = 0
            X.0kR.A05(r3, r4, r0)
            return
        L_0x0575:
            java.lang.Object r2 = r1.A01
            X.1K2 r2 = (X.1K2) r2
            X.SUj r0 = (X.SUj) r0
            boolean r1 = X.SUj.A0V(r0)
            if (r1 == 0) goto L_0x058e
            java.lang.Object r0 = r0.A01
            r0.getClass()
            X.S21 r0 = (X.S21) r0
            java.lang.Object r0 = r0.A01
            r2.set(r0)
            return
        L_0x058e:
            boolean r1 = X.SUj.A0S(r0)
            if (r1 == 0) goto L_0x0018
            if (r0 != 0) goto L_0x059f
            java.lang.String r1 = "fbpayResourceWrapper in PTT validation is null"
            java.lang.NullPointerException r1 = X.AnonymousClass7TE.A11(r1)
            r2.setException(r1)
        L_0x059f:
            java.lang.Throwable r0 = r0.A02
            r0.getClass()
            r2.setException(r0)
            return
        L_0x05a8:
            X.SUj r0 = (X.SUj) r0
            java.lang.Throwable r2 = r0.A02
            boolean r0 = r2 instanceof X.C13224TQp
            if (r0 == 0) goto L_0x0018
            X.TQp r2 = (X.C13224TQp) r2
            int r0 = r2.A00
            if (r0 != 0) goto L_0x0018
        L_0x05b6:
            java.lang.Object r0 = r1.A01
            X.SOC r0 = (X.SOC) r0
            X.SSZ r0 = r0.A01
            X.QnG r1 = r0.A01
            X.QCn r0 = r1.A03
            X.2Fk r0 = r0.A00
            X.SSC.A04(r0, r1)
            return
        L_0x05c6:
            X.SUj r0 = (X.SUj) r0
            boolean r2 = X.SUj.A0S(r0)
            if (r2 == 0) goto L_0x0018
            java.lang.Object r5 = r1.A01
            X.QDI r5 = (X.QDI) r5
            X.SNj r1 = r5.A01
            if (r1 == 0) goto L_0x05eb
            X.SSZ r2 = X.SOC.A01()
            X.SNj r1 = r5.A01
            java.lang.String r1 = r1.A02
            java.lang.Exception r3 = r2.A07(r1)
            if (r3 == 0) goto L_0x05eb
            java.lang.String r2 = "DefaultAuthTicketManager"
            java.lang.String r1 = "Delete AT from ATM func"
            X.0KC.A0F(r2, r1, r3)
        L_0x05eb:
            java.lang.Throwable r4 = r0.A02
            boolean r0 = r4 instanceof X.C13224TQp
            if (r0 == 0) goto L_0x0611
            r0 = r4
            X.TQp r0 = (X.C13224TQp) r0
            int r0 = r0.A00
            if (r0 != 0) goto L_0x0611
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "AUTH_FLOW_UTIL_PIN_LOCKED"
            r0 = 1
            r3.putBoolean(r1, r0)
            X.2gB r2 = r5.A06
            r1 = 0
            X.34S r0 = new X.34S
            r0.<init>(r1, r3)
            X.SUj r0 = X.SUj.A09(r0)
            X.SR4.A02(r2, r0)
        L_0x0611:
            X.2gB r0 = r5.A07
            r4.getClass()
            r0.A0A(r4)
            return
        L_0x061a:
            X.Rye r0 = (X.C10818Rye) r0
            java.lang.Object r3 = r1.A01
            X.QCI r3 = (X.QCI) r3
            X.Ryv r2 = r3.A00
            android.view.View r2 = r2.A00
            r4 = 8
            r2.setVisibility(r4)
            X.Ryv r2 = r3.A00
            androidx.appcompat.widget.Toolbar r7 = r2.A0A
            java.lang.String r2 = r0.A06
            java.lang.String r6 = A01(r2, r2)
            r6.getClass()
            boolean r5 = X.C11431STx.A03()
            android.os.Bundle r2 = r3.requireArguments()
            X.C9665Rej.A00(r2, r7, r6, r5)
            X.Ryv r2 = r3.A00
            android.widget.TextView r5 = r2.A09
            java.lang.String r2 = r0.A05
            java.lang.String r2 = A01(r2, r2)
            r5.setText(r2)
            X.Ryv r2 = r3.A00
            android.widget.TextView r7 = r2.A04
            X.SGr r6 = r0.A00
            r5 = 13
            X.Sv0 r2 = new X.Sv0
            r2.<init>(r1, r5)
            X.C11232SGr.A00(r7, r2, r6)
            X.Ryv r1 = r3.A00
            android.widget.TextView r1 = r1.A04
            X.DbT.A1H(r1)
            java.lang.String r1 = r0.A01
            java.lang.String r1 = A01(r1, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x067e
            X.Ryv r1 = r3.A00
            android.widget.TextView r2 = r1.A08
            java.lang.String r1 = r0.A01
            java.lang.String r1 = A01(r1, r1)
            r2.setText(r1)
        L_0x067e:
            X.Ryv r1 = r3.A00
            android.widget.TextView r2 = r1.A05
            java.lang.String r1 = r0.A02
            java.lang.String r1 = A01(r1, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x068f
            r4 = 0
        L_0x068f:
            r2.setVisibility(r4)
            X.Ryv r1 = r3.A00
            android.widget.TextView r2 = r1.A05
            java.lang.String r1 = r0.A02
            java.lang.String r1 = A01(r1, r1)
            r2.setText(r1)
            X.QDI r1 = r3.A01
            boolean r2 = r1.A04()
            X.Ryv r1 = r3.A00
            if (r2 == 0) goto L_0x06e4
            android.widget.Button r2 = r1.A01
            java.lang.String r1 = r0.A07
            java.lang.String r1 = A01(r1, r1)
            r2.setText(r1)
            X.Ryv r1 = r3.A00
            android.widget.TextView r1 = r1.A07
            java.lang.String r0 = r0.A03
        L_0x06ba:
            java.lang.String r0 = A01(r0, r0)
            r1.setText(r0)
            X.Ryv r0 = r3.A00
            android.widget.EditText r0 = r0.A02
            r0.requestFocus()
            X.Ryv r0 = r3.A00
            android.widget.EditText r0 = r0.A02
            r4 = 1
            r0.setFocusable(r4)
            X.Ryv r0 = r3.A00
            android.widget.EditText r2 = r0.A02
            int r1 = r2.getImeOptions()
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 | r0
            r2.setImeOptions(r1)
            X.Ryv r0 = r3.A00
            android.widget.EditText r3 = r0.A02
            goto L_0x0849
        L_0x06e4:
            android.widget.TextView r1 = r1.A06
            java.lang.String r0 = r0.A04
            goto L_0x06ba
        L_0x06e9:
            java.lang.Object r5 = r1.A01
            X.QCI r5 = (X.QCI) r5
            X.QDI r1 = r5.A01
            boolean r1 = r1.A05()
            if (r1 == 0) goto L_0x0018
            if (r25 == 0) goto L_0x0018
            java.lang.String r0 = "fbpay_verify_pin_fail"
            goto L_0x072b
        L_0x06fa:
            X.SUj r0 = (X.SUj) r0
            boolean r2 = X.SUj.A0V(r0)
            if (r2 == 0) goto L_0x0018
            java.lang.Object r5 = r1.A01
            X.QCI r5 = (X.QCI) r5
            X.Ryv r1 = r5.A00
            android.widget.EditText r1 = r1.A02
            X.C9667Rel.A00(r1)
            java.lang.Object r0 = X.SUj.A0D(r0)
            X.34S r0 = (X.AnonymousClass34S) r0
            java.lang.Object r4 = r0.A00
            r3 = r4
            X.SNj r3 = (X.C11330SNj) r3
            java.lang.Object r2 = r0.A01
            android.os.Bundle r2 = (android.os.Bundle) r2
            androidx.fragment.app.Fragment r1 = r5.mParentFragment
            boolean r0 = r1 instanceof X.C13783Tgy
            if (r0 == 0) goto L_0x0727
            X.Tgy r1 = (X.C13783Tgy) r1
            r1.DG8(r2, r3)
        L_0x0727:
            if (r4 == 0) goto L_0x0018
            java.lang.String r0 = "fbpay_verify_pin_success"
        L_0x072b:
            X.QCI.A00(r5, r0)
            return
        L_0x072f:
            X.SUj r0 = (X.SUj) r0
            boolean r2 = X.SUj.A0S(r0)
            if (r2 == 0) goto L_0x0018
            java.lang.Object r4 = r1.A01
            X.QDF r4 = (X.QDF) r4
            X.SNj r1 = r4.A01
            if (r1 == 0) goto L_0x0754
            X.SSZ r2 = X.SOC.A01()
            X.SNj r1 = r4.A01
            java.lang.String r1 = r1.A02
            java.lang.Exception r3 = r2.A07(r1)
            if (r3 == 0) goto L_0x0754
            java.lang.String r2 = "DefaultAuthTicketManager"
            java.lang.String r1 = "Delete AT from ATM func"
            X.0KC.A0F(r2, r1, r3)
        L_0x0754:
            X.2gB r1 = r4.A06
            java.lang.Throwable r0 = r0.A02
            r0.getClass()
        L_0x075b:
            r1.A0A(r0)
            return
        L_0x075f:
            X.34S r0 = (X.AnonymousClass34S) r0
            java.lang.Object r8 = r0.A00
            X.RQp r8 = (X.C9140RQp) r8
            if (r8 == 0) goto L_0x0018
            java.lang.Object r5 = r1.A01
            X.QCU r5 = (X.QCU) r5
            X.Ryu r2 = r5.A00
            androidx.appcompat.widget.Toolbar r6 = r2.A09
            java.lang.String r4 = r8.A06
            r4.getClass()
            boolean r3 = X.C11431STx.A03()
            android.os.Bundle r2 = r5.requireArguments()
            X.C9665Rej.A00(r2, r6, r4, r3)
            X.Ryu r2 = r5.A00
            android.widget.TextView r7 = r2.A08
            java.lang.String r4 = r8.A04
            r4.getClass()
            X.QDF r2 = r5.A01
            boolean r2 = r2.A03()
            java.lang.String r6 = ""
            android.os.Bundle r3 = r5.requireArguments()
            if (r2 == 0) goto L_0x0880
            java.lang.String r2 = "PAYPAL_HIDDEN_EMAIL"
        L_0x0798:
            java.lang.String r2 = r3.getString(r2, r6)
            java.lang.String r2 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r4, r2)
            r7.setText(r2)
            X.Ryu r2 = r5.A00
            android.widget.TextView r4 = r2.A04
            java.lang.String r3 = r8.A02
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L_0x07b2
            r4.setText(r3)
        L_0x07b2:
            X.Ryu r2 = r5.A00
            android.widget.Button r4 = r2.A02
            java.lang.String r3 = r8.A01
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L_0x07c1
            r4.setText(r3)
        L_0x07c1:
            X.Ryu r2 = r5.A00
            android.widget.TextView r4 = r2.A07
            java.lang.String r3 = r8.A03
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L_0x07d0
            r4.setText(r3)
        L_0x07d0:
            X.SGr r9 = r8.A00
            r7 = 0
            if (r9 != 0) goto L_0x07eb
            java.lang.String r4 = r8.A05
            java.lang.String r3 = "https://www.facebook.com/help/pay?ref=learn_more"
            X.SF9 r2 = new X.SF9
            r2.<init>(r7, r7, r3)
            java.util.List r3 = java.util.Collections.singletonList(r2)
            r2 = 1
            X.0qQ.A0B(r3, r2)
            X.SGr r9 = new X.SGr
            r9.<init>(r4, r3)
        L_0x07eb:
            X.Ryu r2 = r5.A00
            android.widget.TextView r4 = r2.A06
            r3 = 12
            X.Sv0 r2 = new X.Sv0
            r2.<init>(r1, r3)
            X.C11232SGr.A00(r4, r2, r9)
            X.Ryu r1 = r5.A00
            android.widget.TextView r1 = r1.A06
            X.DbT.A1H(r1)
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L_0x0876
            java.util.List r1 = r8.A07
            if (r1 == 0) goto L_0x0876
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0876
            X.Ryu r0 = r5.A00
            android.widget.TextView r0 = r0.A05
            r0.setVisibility(r7)
            X.Ryu r0 = r5.A00
            android.widget.TextView r3 = r0.A05
            java.lang.String r2 = X.AnonymousClass7TE.A19(r1, r7)
            X.QDF r0 = r5.A01
            boolean r0 = r0.A03()
            android.os.Bundle r1 = r5.requireArguments()
            if (r0 == 0) goto L_0x0873
            java.lang.String r0 = "PAYPAL_HIDDEN_EMAIL"
        L_0x082b:
            java.lang.String r0 = r1.getString(r0, r6)
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r2, r0)
            r3.setText(r0)
        L_0x0836:
            X.Ryu r0 = r5.A00
            android.widget.EditText r0 = r0.A03
            r0.requestFocus()
            X.Ryu r0 = r5.A00
            android.widget.EditText r0 = r0.A03
            r4 = 1
            r0.setFocusable(r4)
            X.Ryu r0 = r5.A00
            android.widget.EditText r3 = r0.A03
        L_0x0849:
            if (r3 == 0) goto L_0x0018
            android.content.Context r1 = r3.getContext()
            if (r1 == 0) goto L_0x0018
            android.content.res.Configuration r2 = X.Pxf.A0G(r1)
            java.lang.String r0 = "input_method"
            java.lang.Object r1 = r1.getSystemService(r0)
            r0 = 11
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            int r0 = r2.keyboard
            if (r0 == r4) goto L_0x086e
            int r0 = r2.hardKeyboardHidden
            if (r0 == r4) goto L_0x0018
        L_0x086e:
            r0 = 2
            r1.showSoftInput(r3, r0)
            return
        L_0x0873:
            java.lang.String r0 = "CARD_INFO"
            goto L_0x082b
        L_0x0876:
            X.Ryu r0 = r5.A00
            android.widget.TextView r1 = r0.A05
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0836
        L_0x0880:
            java.lang.String r2 = "CARD_INFO"
            goto L_0x0798
        L_0x0884:
            X.SUj r0 = (X.SUj) r0
            boolean r2 = X.SUj.A0V(r0)
            if (r2 == 0) goto L_0x0018
            java.lang.Object r4 = r1.A01
            X.QCU r4 = (X.QCU) r4
            X.QDF r1 = r4.A01
            boolean r1 = r1.A03()
            if (r1 == 0) goto L_0x08be
            java.lang.String r1 = "fbpay_verify_paypal_success"
        L_0x089a:
            X.QCU.A02(r4, r1)
            X.Ryu r1 = r4.A00
            android.widget.EditText r1 = r1.A03
            X.C9667Rel.A00(r1)
            java.lang.Object r0 = X.SUj.A0D(r0)
            X.34S r0 = (X.AnonymousClass34S) r0
            java.lang.Object r3 = r0.A00
            X.SNj r3 = (X.C11330SNj) r3
            java.lang.Object r2 = r0.A01
            android.os.Bundle r2 = (android.os.Bundle) r2
            androidx.fragment.app.Fragment r1 = r4.mParentFragment
            boolean r0 = r1 instanceof X.C13783Tgy
            if (r0 == 0) goto L_0x0018
            X.Tgy r1 = (X.C13783Tgy) r1
            r1.DG8(r2, r3)
            return
        L_0x08be:
            java.lang.String r1 = "fbpay_verify_cvv_success"
            goto L_0x089a
        L_0x08c1:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L_0x08d6
            java.lang.Object r3 = r1.A01
            X.QCU r3 = (X.QCU) r3
            X.QDF r2 = r3.A01
            boolean r2 = r2.A03()
            if (r2 == 0) goto L_0x0905
            java.lang.String r2 = "fbpay_verify_paypa_fail"
        L_0x08d3:
            X.QCU.A02(r3, r2)
        L_0x08d6:
            boolean r2 = r0 instanceof X.C13224TQp
            if (r2 == 0) goto L_0x08f1
            r2 = r0
            X.TQp r2 = (X.C13224TQp) r2
            int r2 = r2.A00
            if (r2 > 0) goto L_0x08f1
            java.lang.Object r4 = r1.A01
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
        L_0x08e5:
            androidx.fragment.app.Fragment r2 = r4.mParentFragment
            boolean r1 = r2 instanceof X.C13783Tgy
            if (r1 == 0) goto L_0x0018
            X.Tgy r2 = (X.C13783Tgy) r2
            r2.DG9(r0)
            return
        L_0x08f1:
            if (r0 == 0) goto L_0x0018
            java.lang.Object r4 = r1.A01
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            android.os.Bundle r3 = r4.requireArguments()
            r2 = 0
            java.lang.String r1 = "AUTH_FLOW_UTIL_SHOULD_OPEN_PAYPAL_LOGIN_DIRECTLY"
            boolean r1 = r3.getBoolean(r1, r2)
            if (r1 == 0) goto L_0x0018
            goto L_0x08e5
        L_0x0905:
            java.lang.String r2 = "fbpay_verify_cvv_fail"
            goto L_0x08d3
        L_0x0908:
            X.SUj r0 = (X.SUj) r0
            boolean r2 = X.SUj.A0V(r0)
            if (r2 == 0) goto L_0x091e
            java.lang.Object r1 = r1.A01
            X.Sul r1 = (X.C12453Sul) r1
            java.lang.Object r0 = X.SUj.A0D(r0)
            X.RpH r0 = (X.C10257RpH) r0
            X.C12453Sul.A00(r1, r0)
            return
        L_0x091e:
            boolean r2 = X.SUj.A0S(r0)
            if (r2 == 0) goto L_0x0018
            java.lang.Object r1 = r1.A01
            X.Sul r1 = (X.C12453Sul) r1
            X.QD2 r1 = r1.A02
            java.lang.Throwable r0 = r0.A02
            r0.getClass()
            X.2Fj r2 = r1.A01
        L_0x0931:
            X.SR4.A02(r2, r0)
            return
        L_0x0935:
            X.SUj r4 = X.Pxf.A0P(r0)
            java.lang.Object r3 = r1.A01
            X.QhK r3 = (X.C8126QhK) r3
            java.lang.Object r0 = r4.A01
            com.facebookpay.expresscheckout.models.TransactionInfo r0 = (com.facebookpay.expresscheckout.models.TransactionInfo) r0
            if (r0 == 0) goto L_0x0979
            java.util.ArrayList<com.facebookpay.expresscheckout.models.PriceInfo> r0 = r0.A07
            if (r0 == 0) goto L_0x0979
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x094f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x097b
            java.lang.Object r0 = r1.next()
            com.facebookpay.expresscheckout.models.PriceInfo r0 = (com.facebookpay.expresscheckout.models.PriceInfo) r0
            java.lang.String r10 = r0.A04
            java.lang.String r11 = r0.A05
            com.facebookpay.common.models.CurrencyAmount r6 = r0.A00
            java.lang.String r13 = r0.A03
            java.lang.Integer r0 = r0.A02
            java.lang.String r12 = X.DbX.A0t(r0)
            r9 = 0
            X.RH6 r7 = X.RH6.A0d
            com.facebookpay.expresscheckout.models.ItemDetails r8 = X.Pxh.A0V()
            com.facebookpay.common.recyclerview.adapteritems.PuxEntityItem r5 = new com.facebookpay.common.recyclerview.adapteritems.PuxEntityItem
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            X.SUj.A0O(r5, r2)
            goto L_0x094f
        L_0x0979:
            X.0sn r2 = X.0sn.A00
        L_0x097b:
            X.0eM r0 = r3.A06
            java.lang.Object r1 = r0.getValue()
            X.QEe r1 = (X.QEe) r1
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.fbpay.util.resource.FBPayResource<kotlin.Any>>"
            X.0qQ.A0C(r2, r0)
            r1.A00(r2)
            boolean r2 = X.AnonymousClass7TE.A1b(r2)
            java.lang.Throwable r4 = r4.A02
            java.util.Map r1 = r3.A05
            X.5tb r0 = X.C298525tb.ITEM_LIST
            if (r2 == 0) goto L_0x09a8
            X.SOw r1 = X.Pxh.A0T(r0, r1)
            if (r1 == 0) goto L_0x0018
            r0 = 39
            X.TY2 r0 = X.TY2.A00(r3, r0)
            r1.A03(r0)
            return
        L_0x09a8:
            X.SOw r2 = X.Pxh.A0T(r0, r1)
            if (r2 == 0) goto L_0x0018
            r1 = 48
            X.TVw r0 = new X.TVw
            r0.<init>(r1, r4, r3)
            r2.A01(r0)
            return
        L_0x09b9:
            X.SR4 r0 = (X.SR4) r0
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.lang.Object r0 = r0.A03()
            com.facebookpay.common.models.ErrorDialogContent r0 = (com.facebookpay.common.models.ErrorDialogContent) r0
            if (r0 == 0) goto L_0x0018
            X.SIG r3 = X.AnonymousClass2E0.A0H()
            java.lang.Object r5 = r1.A01
            X.QhP r5 = (X.C8131QhP) r5
            android.view.ContextThemeWrapper r4 = r5.A00
            java.lang.String r11 = "wrapperContext"
            if (r4 == 0) goto L_0x0ad8
            X.SPB r2 = X.AnonymousClass2E0.A0A()
            android.view.ContextThemeWrapper r1 = r5.A00
            if (r1 == 0) goto L_0x0ad8
            android.graphics.drawable.Drawable r7 = r2.A04(r1)
            android.view.ContextThemeWrapper r1 = r5.A00
            if (r1 == 0) goto L_0x0ad8
            java.lang.String r12 = r0.A05(r1)
            android.view.ContextThemeWrapper r1 = r5.A00
            if (r1 == 0) goto L_0x0ad8
            java.lang.String r13 = r0.A02(r1)
            android.view.ContextThemeWrapper r1 = r5.A00
            if (r1 == 0) goto L_0x0ad8
            java.lang.String r14 = r0.A03(r1)
            X.RGf r8 = r0.A00()
            boolean r18 = r0.A06()
            X.RuV r1 = r0.A00
            if (r1 == 0) goto L_0x0a33
            java.lang.String r2 = r1.A02
        L_0x0a08:
            android.view.ContextThemeWrapper r1 = r5.A00
            if (r1 == 0) goto L_0x0ad8
            java.lang.String r16 = r0.A04(r1)
            X.RGf r9 = r0.A01()
            X.RuV r1 = r0.A01
            if (r1 == 0) goto L_0x0a31
            java.lang.String r1 = r1.A02
        L_0x0a1a:
            r6 = 2
            X.SvZ r11 = new X.SvZ
            r11.<init>(r6, r0, r5)
            r0 = 4
            X.SvX r10 = new X.SvX
            r10.<init>(r5, r0)
            r17 = r1
            r15 = r2
            X.SOk r0 = X.SA0.A01(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.SIG.A00(r4, r0, r3)
            return
        L_0x0a31:
            r1 = 0
            goto L_0x0a1a
        L_0x0a33:
            r2 = 0
            goto L_0x0a08
        L_0x0a35:
            X.SUj r0 = (X.SUj) r0
            r4 = 0
            X.0qQ.A0B(r0, r4)
            X.RDz r2 = r0.A00
            if (r2 != 0) goto L_0x0c99
            r2 = -1
        L_0x0a40:
            r3 = 1
            java.lang.String r8 = "launchParams"
            java.lang.String r5 = "loggingContext"
            r13 = 0
            if (r2 == r3) goto L_0x0c4c
            if (r2 != r4) goto L_0x0018
            X.Sto r4 = X.C51965G9l.A0g()
            java.lang.Object r2 = r1.A01
            X.QCE r2 = (X.QCE) r2
            com.facebookpay.logging.LoggingContext r12 = r2.A05
            if (r12 == 0) goto L_0x0c94
            com.facebookpay.paypal.model.PaypalConsentLaunchParams r0 = r2.A06
            if (r0 == 0) goto L_0x0c8f
            java.lang.String r0 = r0.A05
            long r10 = java.lang.Long.parseLong(r0)
            X.0Ae r1 = r4.A00
            java.lang.String r0 = "client_submit_ecppaypalconversion_success"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 126(0x7e, float:1.77E-43)
            X.1Ln r0 = X.C51965G9l.A0U(r1, r0)
            r14 = 4
            X.Iww r9 = new X.Iww
            r9.<init>(r10, r12, r13, r14)
            X.C12411Sto.A03(r0, r12, r9)
            X.2gB r1 = r2.A09
            X.SUj r0 = X.SUj.A09(r13)
        L_0x0a7d:
            r1.A0B(r0)
            java.lang.String r0 = "progressIcon"
            java.lang.String r11 = "primaryButton"
            android.widget.ProgressBar r1 = r2.A01
            if (r1 == 0) goto L_0x0a9f
            r0 = 8
            r1.setVisibility(r0)
            com.facebookpay.widget.button.FBPayButton r0 = r2.A07
            if (r0 == 0) goto L_0x0ad8
            r0.setEnabled(r3)
            com.facebookpay.widget.button.FBPayButton r1 = r2.A07
            if (r1 == 0) goto L_0x0ad8
            com.facebookpay.paypal.model.PaypalConsentLaunchParams r0 = r2.A06
            if (r0 != 0) goto L_0x1194
            r0 = r8
        L_0x0a9f:
            X.0qQ.A0F(r0)
        L_0x0aa2:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0aa7:
            X.SUj r0 = (X.SUj) r0
            boolean r2 = X.SUj.A0V(r0)
            r5 = 0
            if (r2 == 0) goto L_0x0adc
            X.Sto r7 = X.C51965G9l.A0g()
            java.lang.Object r6 = r1.A01
            X.QhP r6 = (X.C8131QhP) r6
            com.facebookpay.logging.LoggingContext r4 = r6.A0A()
            X.QDH r2 = X.QDM.A02(r6)
            X.SEB r2 = r2.A03()
            java.util.LinkedHashMap r3 = X.SUU.A07(r2)
            java.lang.String r2 = "pux_checkout"
            r7.A0Z(r4, r2, r3)
            android.content.Context r4 = r6.requireContext()
            X.QD8 r3 = r6.A0N
            if (r3 != 0) goto L_0x0b5a
            java.lang.String r11 = "formViewModel"
        L_0x0ad8:
            X.0qQ.A0F(r11)
            goto L_0x0aa2
        L_0x0adc:
            boolean r2 = X.SUj.A0S(r0)
            if (r2 == 0) goto L_0x0b51
            java.lang.Throwable r10 = r0.A02
            boolean r0 = r10 instanceof X.C8286QnS
            java.lang.String r11 = "wrapperContext"
            if (r0 == 0) goto L_0x0b48
            X.SPB r2 = X.AnonymousClass2E0.A0A()
            java.lang.Object r8 = r1.A01
            X.QhP r8 = (X.C8131QhP) r8
            android.view.ContextThemeWrapper r0 = r8.A00
            if (r0 == 0) goto L_0x0ad8
            android.graphics.drawable.Drawable r12 = r2.A04(r0)
            r3 = r10
            X.QnS r3 = (X.C8286QnS) r3
            java.lang.String r9 = r3.A05
            java.lang.String r7 = r3.A04
            X.RuV r2 = r3.A01
            java.lang.String r6 = r2.A01
            X.RGf r13 = r2.A00
            X.RGf r0 = X.C8937RGf.DISMISS_AND_CLOSE
            boolean r23 = X.AnonymousClass7TF.A1W(r13, r0)
            java.lang.String r4 = r2.A02
            X.RuV r0 = r3.A02
            if (r0 == 0) goto L_0x0b45
            java.lang.String r5 = r0.A01
            X.RGf r14 = r0.A00
            java.lang.String r3 = r0.A02
        L_0x0b1a:
            r0 = 3
            X.SvZ r2 = new X.SvZ
            r2.<init>(r0, r10, r8)
            r0 = 5
            X.SvX r15 = new X.SvX
            r15.<init>(r8, r0)
            r21 = r5
            r22 = r3
            r20 = r4
            r19 = r6
            r18 = r7
            r17 = r9
            r16 = r2
            X.SOk r3 = X.SA0.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x0b38:
            X.SIG r2 = X.AnonymousClass2E0.A0H()
            android.view.ContextThemeWrapper r0 = r8.A00
            if (r0 == 0) goto L_0x0ad8
            X.SIG.A00(r0, r3, r2)
            goto L_0x0c31
        L_0x0b45:
            r14 = r5
            r3 = r5
            goto L_0x0b1a
        L_0x0b48:
            java.lang.Object r8 = r1.A01
            X.QhP r8 = (X.C8131QhP) r8
            X.SOk r3 = X.C8131QhP.A02(r8)
            goto L_0x0b38
        L_0x0b51:
            boolean r0 = X.SUj.A0T(r0)
            r2 = 0
            if (r0 != 0) goto L_0x0c33
            goto L_0x0c31
        L_0x0b5a:
            X.QDH r2 = X.QDM.A02(r6)
            X.SQ4.A03(r4, r3, r2)
            r6.A09()
            X.QDM r2 = r6.A09()
            boolean r2 = r2.A0E()
            if (r2 == 0) goto L_0x0c48
            java.lang.Integer r3 = X.AnonymousClass05K.A00
        L_0x0b70:
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            if (r3 != r2) goto L_0x0c46
            java.lang.Object r10 = r0.A01
            X.QXk r10 = (X.C7799QXk) r10
            if (r10 == 0) goto L_0x0c46
            X.QXE r0 = r10.A0E()
            if (r0 == 0) goto L_0x0c43
            X.QXg r0 = r0.A0E()
            if (r0 == 0) goto L_0x0c43
            X.QXK r0 = r0.A0E()
            if (r0 == 0) goto L_0x0c43
            X.QRp r2 = r0.A0E()
            if (r2 == 0) goto L_0x0c43
            java.lang.String r0 = "credential_id"
            java.lang.String r9 = r2.A09(r0)
        L_0x0b98:
            X.QRV r3 = r10.A0I()
            if (r3 == 0) goto L_0x0c41
            java.lang.Class<X.QXc> r2 = X.C7791QXc.class
            r0 = -507874568(0xffffffffe1ba72f8, float:-4.2992235E20)
            X.3lr r7 = r3.A01(r2, r0)
            if (r7 == 0) goto L_0x0c41
            java.lang.Class<X.QVL> r3 = X.QVL.class
            r4 = 0
            java.lang.String r2 = "shipping_address"
            r0 = 482258055(0x1cbeac87, float:1.2617743E-21)
            X.3lr r3 = r7.getOptionalTreeField(r4, r2, r3, r0)
            if (r3 == 0) goto L_0x0c41
            java.lang.Class<X.QVN> r2 = X.QVN.class
            r0 = -1235561061(0xffffffffb65ad59b, float:-3.2608866E-6)
            X.3lr r2 = r3.reinterpretRequired(r4, r2, r0)
            if (r2 == 0) goto L_0x0c41
            java.lang.String r0 = "id"
            java.lang.String r8 = r2.getOptionalStringField(r4, r0)
        L_0x0bc9:
            X.QXF r0 = r10.A0F()
            if (r0 == 0) goto L_0x0c3f
            X.QXN r7 = r0.A0E()
            if (r7 == 0) goto L_0x0c3f
            java.lang.Class<X.QSG> r3 = X.QSG.class
            r4 = 0
            java.lang.String r2 = "email"
            r0 = -1147891044(0xffffffffbb94929c, float:-0.0045340788)
            X.3lr r3 = r7.getOptionalTreeField(r4, r2, r3, r0)
            if (r3 == 0) goto L_0x0c3f
            java.lang.Class<X.QT5> r2 = X.QT5.class
            r0 = 693675366(0x2958a566, float:4.8105095E-14)
            X.3lr r2 = r3.reinterpretRequired(r4, r2, r0)
            if (r2 == 0) goto L_0x0c3f
            java.lang.String r0 = "id"
            java.lang.String r7 = r2.getOptionalStringField(r4, r0)
        L_0x0bf4:
            X.QXH r0 = r10.A0H()
            if (r0 == 0) goto L_0x0c20
            X.QXb r10 = r0.A0E()
            if (r10 == 0) goto L_0x0c20
            java.lang.Class<X.QVF> r3 = X.QVF.class
            r4 = 0
            java.lang.String r2 = "phone"
            r0 = -1981689008(0xffffffff89e1d350, float:-5.4365497E-33)
            X.3lr r3 = r10.getOptionalTreeField(r4, r2, r3, r0)
            if (r3 == 0) goto L_0x0c20
            java.lang.Class<X.QTI> r2 = X.QTI.class
            r0 = 1741235608(0x67c92598, float:1.8997783E24)
            X.3lr r2 = r3.reinterpretRequired(r4, r2, r0)
            if (r2 == 0) goto L_0x0c20
            java.lang.String r0 = "id"
            java.lang.String r5 = r2.getOptionalStringField(r4, r0)
        L_0x0c20:
            com.facebookpay.expresscheckout.models.ECPPreselectedFBPayData r3 = new com.facebookpay.expresscheckout.models.ECPPreselectedFBPayData
            r3.<init>(r9, r8, r7, r5)
        L_0x0c25:
            android.os.Bundle r2 = r6.requireArguments()
            java.lang.String r0 = "ECP_PRESELECTED_FBPAY_DATA"
            r2.putParcelable(r0, r3)
            X.C8131QhP.A04(r2, r6)
        L_0x0c31:
            r2 = 8
        L_0x0c33:
            java.lang.Object r0 = r1.A01
            X.QhP r0 = (X.C8131QhP) r0
            android.view.View r0 = r0.A03
            if (r0 != 0) goto L_0x11b7
            java.lang.String r11 = "loadingOverlay"
            goto L_0x0ad8
        L_0x0c3f:
            r7 = r5
            goto L_0x0bf4
        L_0x0c41:
            r8 = r5
            goto L_0x0bc9
        L_0x0c43:
            r9 = r5
            goto L_0x0b98
        L_0x0c46:
            r3 = r5
            goto L_0x0c25
        L_0x0c48:
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            goto L_0x0b70
        L_0x0c4c:
            X.Sto r7 = X.C51965G9l.A0g()
            java.lang.Object r2 = r1.A01
            X.QCE r2 = (X.QCE) r2
            com.facebookpay.logging.LoggingContext r6 = r2.A05
            if (r6 == 0) goto L_0x0c94
            com.facebookpay.paypal.model.PaypalConsentLaunchParams r1 = r2.A06
            if (r1 == 0) goto L_0x0c8f
            java.lang.String r1 = r1.A05
            long r15 = java.lang.Long.parseLong(r1)
            java.lang.Throwable r5 = r0.A02
            java.util.LinkedHashMap r4 = X.AnonymousClass7TE.A1H()
            X.Pxj.A1Q(r5, r4)
            X.0Ae r1 = r7.A00
            java.lang.String r0 = "client_submit_ecppaypalconversion_fail"
            X.0Aj r1 = X.C51969G9p.A0d(r1, r0)
            r0 = 124(0x7c, float:1.74E-43)
            X.1Ln r0 = X.C51965G9l.A0U(r1, r0)
            r19 = 2
            X.Iww r14 = new X.Iww
            r18 = r4
            r17 = r6
            r14.<init>(r15, r17, r18, r19)
            X.C12411Sto.A03(r0, r6, r14)
            X.2gB r1 = r2.A09
            X.SUj r0 = X.SUj.A0A(r13, r5)
            goto L_0x0a7d
        L_0x0c8f:
            X.0qQ.A0F(r8)
            goto L_0x0aa2
        L_0x0c94:
            X.0qQ.A0F(r5)
            goto L_0x0aa2
        L_0x0c99:
            int r2 = r2.ordinal()
            goto L_0x0a40
        L_0x0c9f:
            r2.A06(r3, r4, r5, r6, r7)
            return
        L_0x0ca3:
            X.2Fj r1 = r4.A02
            r1.A0B(r0)
            return
        L_0x0ca9:
            java.lang.String r0 = (java.lang.String) r0
            X.RRM r3 = X.AnonymousClass2E0.A07()
            java.lang.Object r2 = r1.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            r1 = 5
            goto L_0x0cc0
        L_0x0cb5:
            java.lang.String r0 = (java.lang.String) r0
            X.RRM r3 = X.AnonymousClass2E0.A07()
            java.lang.Object r2 = r1.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            r1 = 6
        L_0x0cc0:
            r3.A02(r2, r0, r1)
            return
        L_0x0cc4:
            java.lang.Object r1 = r1.A01
            X.S2Q r1 = (X.S2Q) r1
            X.2gB r1 = r1.A03
            goto L_0x1190
        L_0x0ccc:
            java.lang.Object r5 = r1.A01
            X.QD5 r5 = (X.QD5) r5
            X.Qn9 r0 = r5.A03
            X.2gB r0 = r0.A03
            java.lang.Object r0 = r0.A02()
            if (r0 == 0) goto L_0x0ce8
            X.Qn9 r0 = r5.A03
            X.2gB r0 = r0.A03
            java.lang.Object r0 = r0.A02()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x0d18
        L_0x0ce8:
            X.QD7 r0 = r5.A02
            X.2gB r0 = r0.A03
            java.lang.Object r0 = r0.A02()
            if (r0 == 0) goto L_0x0d00
            X.QD7 r0 = r5.A02
            X.2gB r0 = r0.A03
            java.lang.Object r0 = r0.A02()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x0d18
        L_0x0d00:
            X.QD7 r0 = r5.A01
            X.2gB r0 = r0.A03
            java.lang.Object r0 = r0.A02()
            if (r0 == 0) goto L_0x0d89
            X.QD7 r0 = r5.A01
            X.2gB r0 = r0.A03
            java.lang.Object r0 = r0.A02()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x0d89
        L_0x0d18:
            r0 = 1
        L_0x0d19:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            if (r0 != 0) goto L_0x0d7d
            boolean r0 = r5.A04
            if (r0 != 0) goto L_0x0d7d
            r0 = 1
            r5.A04 = r0
            X.Qn9 r0 = r5.A03
            X.2Fj r0 = r0.A08
            java.lang.Object r0 = r0.A02()
            if (r0 == 0) goto L_0x0d87
            X.Qn9 r0 = r5.A03
            X.2Fj r0 = r0.A08
            java.lang.Object r0 = r0.A02()
            X.RDz r1 = X.C8882RDz.SUCCESS
            if (r0 != r1) goto L_0x0d87
            X.QD7 r0 = r5.A02
            X.2Fj r0 = r0.A08
            java.lang.Object r0 = r0.A02()
            if (r0 == 0) goto L_0x0d50
            X.QD7 r0 = r5.A02
            X.2Fj r0 = r0.A08
            java.lang.Object r0 = r0.A02()
            if (r0 != r1) goto L_0x0d87
        L_0x0d50:
            X.QD7 r0 = r5.A01
            X.2Fj r0 = r0.A08
            java.lang.Object r0 = r0.A02()
            if (r0 == 0) goto L_0x0d64
            X.QD7 r0 = r5.A01
            X.2Fj r0 = r0.A08
            java.lang.Object r0 = r0.A02()
            if (r0 != r1) goto L_0x0d87
        L_0x0d64:
            r0 = 1
        L_0x0d65:
            r3 = 110176278(0x6912816, float:5.460184E-35)
            if (r0 == 0) goto L_0x0d83
            X.2FO r2 = r5.A08
            com.facebookpay.logging.FBPayLoggerData r0 = r5.A00
            java.util.LinkedHashMap r1 = X.C2818159r.A06(r0)
            java.lang.String r0 = "client_load_fbpayhubhome_success"
            r2.Cgl(r0, r1)
            com.facebook.quicklog.QuickPerformanceLogger r1 = r5.A07
            r0 = 2
        L_0x0d7a:
            r1.markerEnd(r3, r0)
        L_0x0d7d:
            X.2gB r0 = r5.A05
            r0.A0B(r4)
            return
        L_0x0d83:
            com.facebook.quicklog.QuickPerformanceLogger r1 = r5.A07
            r0 = 3
            goto L_0x0d7a
        L_0x0d87:
            r0 = 0
            goto L_0x0d65
        L_0x0d89:
            r0 = 0
            goto L_0x0d19
        L_0x0d8b:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.Object r1 = r1.A01
            X.QCT r1 = (X.QCT) r1
            android.view.View r1 = r1.A00
            boolean r0 = r0.booleanValue()
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
            return
        L_0x0d9f:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.Object r1 = r1.A01
            X.QDC r1 = (X.QDC) r1
            X.2gB r2 = r1.A05
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0ddb
            X.QD8 r0 = r1.A00
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x0ddb
            goto L_0x0dd6
        L_0x0db6:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.Object r1 = r1.A01
            X.QDC r1 = (X.QDC) r1
            X.2gB r2 = r1.A05
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0ddb
            X.2gB r1 = r1.A04
            java.lang.Object r0 = r1.A02()
            if (r0 == 0) goto L_0x0dd6
            java.lang.Object r0 = r1.A02()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x0ddb
        L_0x0dd6:
            r0 = 1
        L_0x0dd7:
            X.JTP.A1B(r2, r0)
            return
        L_0x0ddb:
            r0 = 0
            goto L_0x0dd7
        L_0x0ddd:
            X.SUj r0 = (X.SUj) r0
            boolean r2 = X.SUj.A0T(r0)
            if (r2 == 0) goto L_0x0df7
            java.lang.Object r4 = r1.A01
            X.QDC r4 = (X.QDC) r4
            com.fbpay.hub.form.params.FormParams r3 = r4.A01
            com.facebookpay.logging.FBPayLoggerData r2 = r3.A00
            if (r2 == 0) goto L_0x0e82
            com.fbpay.hub.form.params.FormLogEvents r2 = r3.A02
            if (r2 == 0) goto L_0x0e82
            java.lang.String r7 = r2.A04
            goto L_0x0e76
        L_0x0df7:
            boolean r2 = X.SUj.A0V(r0)
            if (r2 == 0) goto L_0x0e0e
            java.lang.Object r4 = r1.A01
            X.QDC r4 = (X.QDC) r4
            com.fbpay.hub.form.params.FormParams r3 = r4.A01
            com.facebookpay.logging.FBPayLoggerData r2 = r3.A00
            if (r2 == 0) goto L_0x0e82
            com.fbpay.hub.form.params.FormLogEvents r2 = r3.A02
            if (r2 == 0) goto L_0x0e82
            java.lang.String r7 = r2.A07
            goto L_0x0e76
        L_0x0e0e:
            boolean r2 = X.SUj.A0S(r0)
            if (r2 == 0) goto L_0x0e82
            java.lang.Throwable r2 = r0.A02
            boolean r3 = r2 instanceof X.C13219TQk
            if (r3 == 0) goto L_0x0e49
            java.lang.Object r3 = r1.A01
            X.QDC r3 = (X.QDC) r3
            X.2Fj r4 = r3.A07
            r6 = 0
            r3 = r2
            X.TQk r3 = (X.C13219TQk) r3
            java.lang.String r13 = r3.A02
            java.lang.String r10 = r3.A01
            r3 = 31
            X.SVE r8 = X.SVE.A00(r1, r3)
            r14 = 0
            r18 = 1
            r19 = 17039370(0x104000a, float:2.42446E-38)
            X.SOk r5 = new X.SOk
            r7 = r6
            r9 = r6
            r11 = r6
            r12 = r6
            r15 = r14
            r16 = r14
            r17 = r14
            r20 = r14
            r21 = r18
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.SR4.A01(r4, r5)
        L_0x0e49:
            java.lang.Object r5 = r1.A01
            X.QDC r5 = (X.QDC) r5
            r2.getClass()
            com.fbpay.hub.form.params.FormParams r4 = r5.A01
            com.facebookpay.logging.FBPayLoggerData r3 = r4.A00
            if (r3 == 0) goto L_0x0e82
            com.fbpay.hub.form.params.FormLogEvents r3 = r4.A02
            if (r3 == 0) goto L_0x0e82
            java.lang.String r7 = r3.A06
            goto L_0x0f0e
        L_0x0e5e:
            X.SUj r0 = (X.SUj) r0
            boolean r2 = X.SUj.A0T(r0)
            if (r2 == 0) goto L_0x0e94
            java.lang.Object r4 = r1.A01
            X.QDC r4 = (X.QDC) r4
            com.fbpay.hub.form.params.FormParams r3 = r4.A01
            com.facebookpay.logging.FBPayLoggerData r2 = r3.A00
            if (r2 == 0) goto L_0x0e82
            com.fbpay.hub.form.params.FormLogEvents r2 = r3.A02
            if (r2 == 0) goto L_0x0e82
            java.lang.String r7 = r2.A08
        L_0x0e76:
            if (r7 == 0) goto L_0x0e82
            X.2FO r6 = r4.A09
            r2 = 0
            java.util.Map r2 = X.QDC.A00(r4, r2, r2)
        L_0x0e7f:
            r6.Cgl(r7, r2)
        L_0x0e82:
            java.lang.Object r1 = r1.A01
            X.QDC r1 = (X.QDC) r1
            X.2gB r1 = r1.A03
            boolean r0 = X.SUj.A0V(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.SR4.A01(r1, r0)
            return
        L_0x0e94:
            boolean r2 = X.SUj.A0V(r0)
            if (r2 == 0) goto L_0x0ec0
            java.lang.Object r5 = r1.A01
            X.QDC r5 = (X.QDC) r5
            java.lang.Object r2 = r0.A01
            r2.getClass()
            X.RsK r2 = (X.C10443RsK) r2
            java.lang.Object r4 = r2.A01
            r4.getClass()
            com.fbpay.hub.form.params.FormParams r3 = r5.A01
            com.facebookpay.logging.FBPayLoggerData r2 = r3.A00
            if (r2 == 0) goto L_0x0e82
            com.fbpay.hub.form.params.FormLogEvents r2 = r3.A02
            if (r2 == 0) goto L_0x0e82
            java.lang.String r7 = r2.A0B
            if (r7 == 0) goto L_0x0e82
            X.2FO r6 = r5.A09
            r2 = 0
            java.util.Map r2 = X.QDC.A00(r5, r4, r2)
            goto L_0x0e7f
        L_0x0ec0:
            boolean r2 = X.SUj.A0S(r0)
            if (r2 == 0) goto L_0x0e82
            java.lang.Throwable r2 = r0.A02
            boolean r3 = r2 instanceof X.C13219TQk
            if (r3 == 0) goto L_0x0efb
            java.lang.Object r3 = r1.A01
            X.QDC r3 = (X.QDC) r3
            X.2Fj r4 = r3.A07
            r6 = 0
            r3 = r2
            X.TQk r3 = (X.C13219TQk) r3
            java.lang.String r13 = r3.A02
            java.lang.String r10 = r3.A01
            r3 = 30
            X.SVE r8 = X.SVE.A00(r1, r3)
            r14 = 0
            r18 = 1
            r19 = 17039370(0x104000a, float:2.42446E-38)
            X.SOk r5 = new X.SOk
            r7 = r6
            r9 = r6
            r11 = r6
            r12 = r6
            r15 = r14
            r16 = r14
            r17 = r14
            r20 = r14
            r21 = r18
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.SR4.A01(r4, r5)
        L_0x0efb:
            java.lang.Object r5 = r1.A01
            X.QDC r5 = (X.QDC) r5
            r2.getClass()
            com.fbpay.hub.form.params.FormParams r4 = r5.A01
            com.facebookpay.logging.FBPayLoggerData r3 = r4.A00
            if (r3 == 0) goto L_0x0e82
            com.fbpay.hub.form.params.FormLogEvents r3 = r4.A02
            if (r3 == 0) goto L_0x0e82
            java.lang.String r7 = r3.A0A
        L_0x0f0e:
            if (r7 == 0) goto L_0x0e82
            X.2FO r6 = r5.A09
            r3 = 0
            java.util.Map r2 = X.QDC.A00(r5, r3, r2)
            goto L_0x0e7f
        L_0x0f19:
            java.lang.Object r1 = r1.A01
            X.Rwa r1 = (X.C10696Rwa) r1
            X.2gB r1 = r1.A01
            goto L_0x1190
        L_0x0f21:
            java.lang.Object r1 = r1.A01
            X.Rwa r1 = (X.C10696Rwa) r1
            X.2gB r1 = r1.A00
            goto L_0x1190
        L_0x0f29:
            java.lang.Object r1 = r1.A01
            X.Rui r1 = (X.C10588Rui) r1
            X.2gB r1 = r1.A00
            goto L_0x1190
        L_0x0f31:
            java.lang.Object r2 = r1.A01
            X.Tg8 r2 = (X.C13736Tg8) r2
            X.SUj r0 = (X.SUj) r0
            boolean r1 = X.SUj.A0V(r0)
            if (r1 == 0) goto L_0x0f47
            java.lang.Object r0 = X.SUj.A0D(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2.Das(r0)
            return
        L_0x0f47:
            java.lang.Throwable r1 = r0.A02
            if (r1 != 0) goto L_0x0f52
            java.lang.String r0 = "An unknown error was thrown during the authorization process"
            X.RJg r1 = new X.RJg
            r1.<init>(r0)
        L_0x0f52:
            r0 = 0
            r2.Dap(r0, r0, r1)
            return
        L_0x0f57:
            java.lang.Object r1 = r1.A01
            X.QDA r1 = (X.QDA) r1
            X.2gB r2 = r1.A03
            X.2Fk r1 = r1.A01
            r2.A0D(r1)
            X.SR4.A02(r2, r0)
            return
        L_0x0f66:
            X.RsH r0 = (X.C10440RsH) r0
            X.S7M r2 = X.AnonymousClass2E0.A03()
            java.lang.Object r1 = r1.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.SSY r2 = r2.A01(r1)
            X.Sun r1 = new X.Sun
            r1.<init>()
            X.SSY.A02(r1, r0, r2)
            return
        L_0x0f7d:
            java.lang.Object r1 = r1.A01
            X.2Fk r1 = (X.2Fk) r1
            r1.A0A(r0)
            return
        L_0x0f85:
            java.lang.Object r2 = r1.A01
            X.SSY r2 = (X.SSY) r2
            X.S4v r0 = (X.C11001S4v) r0
            androidx.fragment.app.Fragment r1 = r2.A01
            if (r1 == 0) goto L_0x0f93
            r0.A01(r1)
            return
        L_0x0f93:
            androidx.fragment.app.FragmentActivity r7 = r2.A02
            r7.getClass()
            X.Rws r6 = r0.A03
            if (r6 == 0) goto L_0x0fdf
            java.util.concurrent.Executor r5 = r0.A06
            X.RLE r4 = r0.A01
            r4.getClass()
            X.SGZ r3 = new X.SGZ
            r3.<init>()
            if (r5 == 0) goto L_0x0fd8
            X.0hq r2 = r7.getSupportFragmentManager()
            X.QDG r1 = X.Pxj.A0M(r7)
            r3.A00 = r2
            if (r1 == 0) goto L_0x0fba
            r1.A0H = r5
            r1.A04 = r4
        L_0x0fba:
            r0.A00 = r3
            X.SR5 r1 = r0.A02
            r1.getClass()
            r3.A01(r1, r6)
            X.S7M r1 = X.AnonymousClass2E0.A03()
            X.2FO r2 = r1.A01
            X.RsH r0 = r0.A05
            android.os.Bundle r0 = r0.A01
            java.util.Map r1 = X.S9s.A01(r0)
            java.lang.String r0 = "display_biometric_dialog"
            r2.Cgl(r0, r1)
            return
        L_0x0fd8:
            java.lang.String r0 = "Executor must not be null."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0fdf:
            X.S7M r1 = X.AnonymousClass2E0.A03()
            X.SSY r4 = r1.A02(r7)
            X.RsH r3 = r0.A05
            java.util.concurrent.Executor r2 = r0.A06
            X.Tg7 r1 = r0.A04
            if (r2 == 0) goto L_0x0ffa
            if (r1 == 0) goto L_0x0ffa
            X.Suo r0 = new X.Suo
            r0.<init>(r1, r2)
        L_0x0ff6:
            X.SSY.A02(r0, r3, r4)
            return
        L_0x0ffa:
            X.Sun r0 = new X.Sun
            r0.<init>()
            goto L_0x0ff6
        L_0x1000:
            X.RQq r0 = (X.RQq) r0
            X.Rye r5 = new X.Rye
            r5.<init>()
            java.lang.String r2 = r0.A06
            r5.A06 = r2
            java.lang.String r2 = r0.A05
            r5.A05 = r2
            X.SGr r2 = r0.A00
            if (r2 != 0) goto L_0x1026
            java.lang.String r2 = r0.A03
            java.lang.String r4 = A01(r2, r2)
            java.util.List r3 = java.util.Collections.emptyList()
            r2 = 1
            X.0qQ.A0B(r3, r2)
            X.SGr r2 = new X.SGr
            r2.<init>(r4, r3)
        L_0x1026:
            r5.A00 = r2
            java.lang.String r2 = r0.A04
            r5.A01 = r2
            java.lang.String r2 = r0.A02
            r5.A04 = r2
            java.util.List r2 = r5.A08
            r2.clear()
            java.util.List r0 = r0.A07
            if (r0 == 0) goto L_0x107d
            r2.addAll(r0)
            goto L_0x107d
        L_0x103d:
            X.RQo r0 = (X.C9139RQo) r0
            X.Rye r5 = new X.Rye
            r5.<init>()
            java.lang.String r2 = r0.A06
            r5.A06 = r2
            java.lang.String r2 = r0.A05
            r5.A05 = r2
            java.lang.String r2 = r0.A01
            java.lang.String r4 = A01(r2, r2)
            java.util.List r3 = java.util.Collections.emptyList()
            r2 = 1
            X.0qQ.A0B(r3, r2)
            X.SGr r2 = new X.SGr
            r2.<init>(r4, r3)
            r5.A00 = r2
            java.lang.String r2 = r0.A02
            r5.A01 = r2
            java.lang.String r2 = r0.A00
            r5.A07 = r2
            java.lang.String r2 = r0.A04
            r5.A03 = r2
            java.util.List r3 = r5.A08
            r3.clear()
            java.lang.String r2 = r0.A03
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x107d
            r3.add(r2)
        L_0x107d:
            java.lang.Object r0 = r1.A01
            X.QCm r0 = (X.QCm) r0
            r0.A00 = r5
            X.QCm.A00(r0)
            return
        L_0x1087:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Object r1 = r1.A01
            X.QCm r1 = (X.QCm) r1
            r1.A01 = r0
            X.QCm.A00(r1)
            return
        L_0x1093:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.Object r2 = r1.A01
            X.QCI r2 = (X.QCI) r2
            X.Ryv r1 = r2.A00
            android.view.View r1 = r1.A00
            boolean r3 = r0.booleanValue()
            int r0 = X.DbW.A01(r3)
            r1.setVisibility(r0)
            X.Ryv r0 = r2.A00
            android.widget.EditText r1 = r0.A02
            goto L_0x10c6
        L_0x10ad:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.Object r2 = r1.A01
            X.QCU r2 = (X.QCU) r2
            X.Ryu r1 = r2.A00
            android.view.View r1 = r1.A01
            boolean r3 = r0.booleanValue()
            int r0 = X.DbW.A01(r3)
            r1.setVisibility(r0)
            X.Ryu r0 = r2.A00
            android.widget.EditText r1 = r0.A03
        L_0x10c6:
            r0 = r3 ^ 1
            r1.setEnabled(r0)
            return
        L_0x10cc:
            X.34S r0 = (X.AnonymousClass34S) r0
            java.lang.Object r4 = r1.A01
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            X.S7M r3 = X.AnonymousClass2E0.A03()
            java.lang.Object r2 = r0.A00
            r2.getClass()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r0.A01
            android.os.Bundle r1 = (android.os.Bundle) r1
            X.S3z r0 = r3.A04
            androidx.fragment.app.Fragment r2 = r0.A01(r1, r2)
            X.0s1 r1 = X.DbW.A0C(r4)
            r0 = 2131428303(0x7f0b03cf, float:1.8478247E38)
            r1.A0A(r2, r0)
            r1.A00()
            return
        L_0x10f5:
            X.S4v r0 = (X.C11001S4v) r0
            java.lang.Object r1 = r1.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r0.A01(r1)
            return
        L_0x10ff:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Object r2 = r1.A01
            X.QC9 r2 = (X.QC9) r2
            r1 = 0
            r2.AVU(r1, r1, r0)
            return
        L_0x110a:
            X.34S r0 = (X.AnonymousClass34S) r0
            java.lang.Object r5 = r1.A01
            X.QC9 r5 = (X.QC9) r5
            android.os.Bundle r2 = r5.requireArguments()
            java.lang.String r1 = "AUTH_EXTENSION_ID"
            java.lang.String r2 = r2.getString(r1)
            java.lang.Object r6 = r0.A00
            X.SNj r6 = (X.C11330SNj) r6
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x1173
            r6.getClass()
            java.lang.Object r3 = r0.A01
            X.S7M r0 = X.AnonymousClass2E0.A03()
            r5.requireArguments()
            X.RpG r1 = r0.A02
            java.lang.String r0 = "ENABLE_PIN"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x1164
            java.lang.String r0 = "DISABLE_PIN"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x116c
            X.SIS r0 = r1.A00
            X.Suu r2 = new X.Suu
            r2.<init>(r0)
        L_0x1149:
            r5.A01 = r2
            X.Sum r1 = new X.Sum
            r1.<init>()
            r1.A00 = r5
            android.os.Bundle r0 = r5.requireArguments()
            X.2gB r4 = r2.EwZ(r0, r1, r6)
            r2 = 1
            X.Sdf r1 = new X.Sdf
            r1.<init>(r2, r3, r4, r5, r6)
            r4.A06(r5, r1)
            return
        L_0x1164:
            X.SIS r0 = r1.A00
            X.Suv r2 = new X.Suv
            r2.<init>(r0)
            goto L_0x1149
        L_0x116c:
            java.lang.String r0 = "extension not found "
            java.lang.RuntimeException r0 = X.Pxg.A0k(r0, r2)
            throw r0
        L_0x1173:
            java.lang.Object r1 = r0.A01
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0 = 0
            r5.AVU(r1, r6, r0)
            return
        L_0x117c:
            java.lang.Object r1 = r1.A01
            X.QDE r1 = (X.QDE) r1
            X.2gB r1 = r1.A04
            r1.A0A(r0)
            return
        L_0x1186:
            java.lang.Object r1 = r1.A01
            X.Suq r1 = (X.C12458Suq) r1
            java.lang.Object r1 = r1.A01
            X.QDE r1 = (X.QDE) r1
            X.2gB r1 = r1.A04
        L_0x1190:
            r1.A0B(r0)
            return
        L_0x1194:
            java.lang.String r0 = r0.A06
            r1.setText(r0)
            X.STG.A01(r2)
            return
        L_0x119d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.Object r4 = r1.A01
            X.QCS r4 = (X.QCS) r4
            boolean r3 = r0.booleanValue()
            android.view.View r1 = r4.A02
            r2 = 8
            int r0 = X.DbW.A00(r3)
            r1.setVisibility(r0)
            android.view.View r0 = r4.A03
            if (r3 == 0) goto L_0x11b7
            r2 = 0
        L_0x11b7:
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11652Sdu.onChanged(java.lang.Object):void");
    }

    public static String A01(CharSequence charSequence, String str) {
        if (TextUtils.isEmpty(charSequence)) {
            return "";
        }
        return str;
    }
}
