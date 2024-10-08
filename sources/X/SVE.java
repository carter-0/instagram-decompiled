package X;

import android.content.DialogInterface;

public final class SVE implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;

    public SVE(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static SVE A00(Object obj, int i) {
        return new SVE(obj, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.QnA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: X.QnF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: X.QnA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: X.QnA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: X.5tS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v45, resolved type: X.Qff} */
    /* JADX WARNING: type inference failed for: r0v11, types: [X.QcV, android.webkit.WebView] */
    /* JADX WARNING: type inference failed for: r0v65, types: [X.R9j, X.11X] */
    /* JADX WARNING: type inference failed for: r0v69, types: [X.R9j, X.11X] */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02b9, code lost:
        r4.getScrollingViewProxy().AZK().notifyDataSetChanged();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02c6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x033d, code lost:
        X.C11652Sdu.A03(r2, r1, r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0340, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x038c, code lost:
        r1.A0B(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0394, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0399, code lost:
        r0 = "loggingContext";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x039d, code lost:
        r0 = "formParams";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x042f, code lost:
        r0 = "viewModel";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0432, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0439, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e2, code lost:
        r1.A01(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01f4, code lost:
        r2.A05.A0B(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01f9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0056, code lost:
        r1.Cgl(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0205, code lost:
        r8.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0208, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r8, int r9) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0424;
                case 1: goto L_0x03f1;
                case 2: goto L_0x0209;
                case 3: goto L_0x03cd;
                case 4: goto L_0x03b5;
                case 5: goto L_0x03ad;
                case 6: goto L_0x01fa;
                case 7: goto L_0x03a1;
                case 8: goto L_0x01e0;
                case 9: goto L_0x01cf;
                case 10: goto L_0x0357;
                case 11: goto L_0x005b;
                case 12: goto L_0x0005;
                case 13: goto L_0x0005;
                case 14: goto L_0x0005;
                case 15: goto L_0x0005;
                case 16: goto L_0x0005;
                case 17: goto L_0x0005;
                case 18: goto L_0x0005;
                case 19: goto L_0x0005;
                case 20: goto L_0x0005;
                case 21: goto L_0x0005;
                case 22: goto L_0x0005;
                case 23: goto L_0x0005;
                case 24: goto L_0x0005;
                case 25: goto L_0x0005;
                case 26: goto L_0x0005;
                case 27: goto L_0x0005;
                case 28: goto L_0x0005;
                case 29: goto L_0x0005;
                case 30: goto L_0x0205;
                case 31: goto L_0x0205;
                case 32: goto L_0x01bb;
                case 33: goto L_0x0341;
                case 34: goto L_0x003d;
                case 35: goto L_0x0309;
                case 36: goto L_0x001d;
                case 37: goto L_0x02c7;
                case 38: goto L_0x0205;
                case 39: goto L_0x025f;
                case 40: goto L_0x00e6;
                case 41: goto L_0x00ba;
                case 42: goto L_0x0095;
                case 43: goto L_0x000b;
                case 44: goto L_0x029c;
                case 45: goto L_0x027b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.A01
            X.DbS.A1U(r0)
        L_0x000a:
            return
        L_0x000b:
            java.lang.Object r0 = r7.A01
            X.S3Q r0 = (X.S3Q) r0
            r8.getClass()
            X.SHc r2 = r0.A03
            java.lang.String r1 = "settings_clear_cancel_clicked"
            r0 = 0
            X.C11242SHc.A00(r2, r1, r0)
            goto L_0x0205
        L_0x001d:
            java.lang.Object r0 = r7.A01
            X.SbJ r0 = (X.C11496SbJ) r0
            java.lang.Object r3 = r0.A01
            X.QnF r3 = (X.C8273QnF) r3
            com.facebookpay.logging.FBPayLoggerData r0 = r3.A01
            java.util.LinkedHashMap r2 = X.C2818159r.A06(r0)
            java.lang.String r1 = "target_name"
            java.lang.String r0 = "remove_shoppay_cancel"
            r2.put(r1, r0)
            X.C8273QnF.A01(r3, r2)
            X.2FO r1 = r3.A06
            java.lang.String r0 = "user_remove_credential_exit"
            goto L_0x0056
        L_0x003d:
            java.lang.Object r0 = r7.A01
            X.SbJ r0 = (X.C11496SbJ) r0
            java.lang.Object r1 = r0.A01
            X.QnA r1 = (X.C8268QnA) r1
            com.facebookpay.logging.FBPayLoggerData r0 = r1.A01
            java.util.LinkedHashMap r2 = X.C2818159r.A06(r0)
            com.fbpay.hub.paymentmethods.api.FbPayPayPal r0 = r1.A02
            java.lang.String r0 = r0.A00
            X.Pxj.A1N(r0, r2)
            X.2FO r1 = r1.A04
            java.lang.String r0 = "fbpay_remove_paypal_cancel"
        L_0x0056:
            r1.Cgl(r0, r2)
            goto L_0x0205
        L_0x005b:
            java.lang.Object r6 = r7.A01
            X.QDK r6 = (X.QDK) r6
            com.facebookpay.form.fragment.model.FormParams r5 = r6.A01
            r0 = 0
            if (r5 == 0) goto L_0x039d
            com.facebookpay.form.fragment.model.FormLoggingEvents r1 = r5.A09
            if (r1 == 0) goto L_0x006a
            com.facebookpay.form.fragment.model.FormClickEvent r0 = r1.A00
        L_0x006a:
            X.RLo r4 = r6.A0E
            if (r4 == 0) goto L_0x0090
            com.facebookpay.logging.LoggingContext r3 = r6.A03
            r2 = 0
            if (r3 == 0) goto L_0x0399
            java.lang.String r0 = r5.A0H
            if (r0 == 0) goto L_0x007b
            java.lang.Long r2 = X.DbV.A0q(r0)
        L_0x007b:
            X.QDH r0 = r6.A06()
            java.util.LinkedHashMap r1 = X.SUU.A08(r0)
            boolean r0 = r4 instanceof X.C8059QgB
            if (r0 == 0) goto L_0x0205
            X.Sto r0 = X.C51965G9l.A0g()
            r0.A0K(r3, r2, r1)
            goto L_0x0205
        L_0x0090:
            X.QDK.A02(r0, r6)
            goto L_0x0205
        L_0x0095:
            java.lang.String r0 = "https://help.instagram.com/563153788532689"
            android.net.Uri r1 = X.0cp.A03(r0)
            java.lang.Object r2 = r7.A01
            X.R8N r2 = (X.R8N) r2
            android.content.Context r0 = r2.requireContext()
            X.0kR.A0F(r0, r1)
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x000a
            X.S3Q r1 = X.R8N.A00(r2)
            java.lang.String r2 = r2.A00
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.SHc r1 = r1.A03
            java.lang.String r0 = "warning_learn_more_clicked"
            goto L_0x00e2
        L_0x00ba:
            java.lang.Object r5 = r7.A01
            X.R8N r5 = (X.R8N) r5
            X.0eM r0 = r5.A0D
            java.lang.Object r4 = r0.getValue()
            X.1Av r4 = (X.1Av) r4
            r3 = 0
            X.0s0 r2 = r4.A7C
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 168(0xa8, float:2.35E-43)
            X.AnonymousClass7TF.A1J(r4, r2, r1, r0, r3)
            boolean r0 = r5.A06
            if (r0 == 0) goto L_0x000a
            X.S3Q r0 = X.R8N.A00(r5)
            java.lang.String r2 = r5.A00
            X.0qQ.A0B(r2, r3)
            X.SHc r1 = r0.A03
            java.lang.String r0 = "warning_settings_toggle_off"
        L_0x00e2:
            r1.A01(r2, r0)
            return
        L_0x00e6:
            java.lang.Object r3 = r7.A01
            com.instagram.business.instantexperiences.ui.InstantExperiencesBrowserChrome r3 = (com.instagram.business.instantexperiences.ui.InstantExperiencesBrowserChrome) r3
            java.lang.CharSequence[] r2 = r3.getMenuOptions()
            r1 = r2[r9]
            android.content.Context r4 = r3.getContext()
            r0 = 2131964400(0x7f1331f0, float:1.956558E38)
            java.lang.String r0 = r4.getString(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0135
            com.instagram.common.session.UserSession r0 = r3.A09
            X.0xa r2 = X.AnonymousClass7TE.A0q(r0)
            X.0xY r1 = r2.AR4()
            java.lang.String r0 = "ix_autofill_name"
            r1.ED3(r0)
            X.0xY r1 = X.DbU.A0e(r1, r2)
            java.lang.String r0 = "ix_autofill_phone"
            r1.ED3(r0)
            X.0xY r1 = X.DbU.A0e(r1, r2)
            java.lang.String r0 = "ix_autofill_address"
            r1.ED3(r0)
            X.0xY r1 = X.DbU.A0e(r1, r2)
            java.lang.String r0 = "ix_autofill_email"
            r1.ED3(r0)
            r1.apply()
            r0 = 2131964399(0x7f1331ef, float:1.9565579E38)
        L_0x0131:
            X.C59689JTv.A07(r4, r0)
            return
        L_0x0135:
            r1 = r2[r9]
            r0 = 2131964405(0x7f1331f5, float:1.956559E38)
            java.lang.String r0 = r4.getString(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0152
            X.SQu r0 = r3.A08
            java.util.Stack r0 = r0.A0D
            java.lang.Object r0 = r0.peek()
            android.webkit.WebView r0 = (android.webkit.WebView) r0
            r0.reload()
            return
        L_0x0152:
            r1 = r2[r9]
            r0 = 2131964401(0x7f1331f1, float:1.9565583E38)
            java.lang.String r0 = r4.getString(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x017a
            java.lang.String r0 = "clipboard"
            java.lang.Object r2 = r4.getSystemService(r0)
            android.content.ClipboardManager r2 = (android.content.ClipboardManager) r2
            java.lang.String r1 = X.C11382SQu.A01(r3)
            java.lang.String r0 = "Instant Experiences Link URL"
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r0, r1)
            r2.setPrimaryClip(r0)
            r0 = 2131964403(0x7f1331f3, float:1.9565587E38)
            goto L_0x0131
        L_0x017a:
            r1 = r2[r9]
            r0 = 2131964404(0x7f1331f4, float:1.9565589E38)
            java.lang.String r0 = r4.getString(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000a
            android.content.Intent r2 = X.DbS.A09()
            java.lang.String r0 = "android.intent.action.VIEW"
            r2.setAction(r0)
            X.SQu r0 = r3.A08
            java.util.Stack r0 = r0.A0D
            java.lang.Object r0 = r0.peek()
            if (r0 == 0) goto L_0x01ad
            java.lang.String r0 = X.C11382SQu.A01(r3)
            if (r0 == 0) goto L_0x01ad
            java.lang.String r0 = X.C11382SQu.A01(r3)
            android.net.Uri r0 = X.0cp.A03(r0)
            r2.setData(r0)
        L_0x01ad:
            X.0b6 r0 = X.0b6.A00()
            X.0Qv r1 = r0.A0A()
            android.content.Context r0 = r3.A00
            r1.A0G(r0, r2)
            return
        L_0x01bb:
            java.lang.Object r2 = r7.A01
            X.QDC r2 = (X.QDC) r2
            com.fbpay.hub.form.params.FormParams r1 = r2.A01
            com.facebookpay.logging.FBPayLoggerData r0 = r1.A00
            if (r0 == 0) goto L_0x000a
            com.fbpay.hub.form.params.FormLogEvents r0 = r1.A02
            if (r0 == 0) goto L_0x000a
            java.lang.String r0 = r0.A01
            X.Pxj.A1I(r2, r0)
            return
        L_0x01cf:
            java.lang.Object r0 = r7.A01
            X.QgG r0 = (X.C8064QgG) r0
            X.Qff r2 = r0.A00
            if (r2 == 0) goto L_0x042f
            java.lang.String[] r0 = r0.getOptions()
            r1 = r0[r9]
            if (r1 == 0) goto L_0x000a
            goto L_0x01f4
        L_0x01e0:
            java.lang.Object r0 = r7.A01
            X.QgH r0 = (X.C8065QgH) r0
            X.5tS r2 = r0.A00
            if (r2 == 0) goto L_0x042f
            com.google.common.collect.ImmutableList r0 = r2.A02
            java.lang.Object r0 = r0.get(r9)
            com.facebookpay.form.model.FormCountry r0 = (com.facebookpay.form.model.FormCountry) r0
            if (r0 == 0) goto L_0x000a
            com.facebook.common.locale.Country r1 = r0.A00
        L_0x01f4:
            X.2gB r0 = r2.A05
            r0.A0B(r1)
            return
        L_0x01fa:
            java.lang.Object r0 = r7.A01
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto L_0x0203
            r0.finish()
        L_0x0203:
            if (r8 == 0) goto L_0x000a
        L_0x0205:
            r8.dismiss()
            return
        L_0x0209:
            java.lang.Object r3 = r7.A01
            X.QC4 r3 = (X.QC4) r3
            com.facebook.browser.lite.BrowserLiteFragment r5 = r3.A00
            if (r5 == 0) goto L_0x043a
            boolean r0 = r3.isResumed()
            if (r0 == 0) goto L_0x043a
            X.QLA r4 = r5.C8U()
            r2 = 0
            if (r4 == 0) goto L_0x000a
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "BrowserLiteIntent.InstagramExtras.EXTRA_SSL_ERROR_DIALOG_GO_BACK_FIX_ENABLED"
            boolean r1 = r1.getBooleanExtra(r0, r2)
            java.util.Stack r0 = r5.A1M
            int r0 = r0.size()
            r2 = 1
            if (r0 != r2) goto L_0x000a
            X.T9q r0 = r4.A01()
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0257
            if (r1 == 0) goto L_0x000a
            java.lang.String r1 = r5.A0l
            if (r1 == 0) goto L_0x000a
            java.lang.String r0 = "https://l.instagram.com"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x000a
            X.T9q r0 = r4.A01()
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            if (r0 != r2) goto L_0x000a
        L_0x0257:
            com.facebook.browser.lite.BrowserLiteFragment r2 = r3.A00
            r1 = 2
            r0 = 0
            r2.AI4(r1, r0)
            return
        L_0x025f:
            java.lang.Object r3 = r7.A01
            X.R8X r3 = (X.R8X) r3
            X.R8X.A00(r3)
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            android.content.Intent r1 = r3.A00
            if (r1 != 0) goto L_0x0273
            java.lang.String r0 = "resultIntent"
            goto L_0x0432
        L_0x0273:
            r0 = -1
            r2.setResult(r0, r1)
            X.DbT.A1J(r3)
            return
        L_0x027b:
            java.lang.Object r4 = r7.A01
            X.ESF r4 = (X.ESF) r4
            X.PR9 r0 = r4.A05
            r3 = 0
            r0.A0D = r3
            X.1Av r0 = r4.A01
            r0.A1E(r3)
            X.SFf r0 = r4.A00
            r0.A02 = r3
            X.PR9 r2 = r4.A05
            r1 = 1
            X.R9j r0 = new X.R9j
            r0.<init>(r4, r2, r3, r1)
            X.1ES.A03(r0)
            X.ESF.A06(r4)
            goto L_0x02b9
        L_0x029c:
            java.lang.Object r4 = r7.A01
            X.ESF r4 = (X.ESF) r4
            X.PR9 r0 = r4.A03
            r3 = 0
            r0.A0D = r3
            X.1Av r0 = r4.A01
            r0.A1f(r3)
            X.SFf r0 = r4.A00
            r0.A04 = r3
            X.PR9 r2 = r4.A03
            r1 = 1
            X.R9j r0 = new X.R9j
            r0.<init>(r4, r2, r3, r1)
            X.1ES.A03(r0)
        L_0x02b9:
            X.3Ar r0 = r4.getScrollingViewProxy()
            X.2rL r0 = r0.AZK()
            X.2Rw r0 = (X.2Rw) r0
            r0.notifyDataSetChanged()
            return
        L_0x02c7:
            java.lang.Object r0 = r7.A01
            X.SbJ r0 = (X.C11496SbJ) r0
            java.lang.Object r5 = r0.A01
            X.QnF r5 = (X.C8273QnF) r5
            com.facebookpay.logging.FBPayLoggerData r0 = r5.A01
            java.util.LinkedHashMap r2 = X.C2818159r.A06(r0)
            java.lang.String r1 = "target_name"
            java.lang.String r0 = "remove_shoppay_save"
            r2.put(r1, r0)
            X.C8273QnF.A01(r5, r2)
            X.2FO r1 = r5.A06
            java.lang.String r0 = "user_remove_credential_submit"
            r1.Cgl(r0, r2)
            X.S2Q r6 = r5.A07
            com.fbpay.hub.paymentmethods.api.FbPayShopPay r0 = r5.A02
            java.lang.String r4 = r0.A00
            com.facebookpay.logging.FBPayLoggerData r0 = r5.A01
            java.lang.String r3 = r0.A00()
            r3.getClass()
            X.5A3 r2 = r6.A00
            r1 = 3
            X.Sc8 r0 = new X.Sc8
            r0.<init>(r6, r4, r3, r1)
            X.QCn r2 = X.C8282QnO.A01(r0, r2)
            X.2gB r1 = r5.A03
            r0 = 69
            goto L_0x033d
        L_0x0309:
            java.lang.Object r0 = r7.A01
            X.SbJ r0 = (X.C11496SbJ) r0
            java.lang.Object r5 = r0.A01
            X.QnA r5 = (X.C8268QnA) r5
            com.facebookpay.logging.FBPayLoggerData r0 = r5.A01
            java.util.LinkedHashMap r2 = X.C2818159r.A06(r0)
            com.fbpay.hub.paymentmethods.api.FbPayPayPal r0 = r5.A02
            java.lang.String r0 = r0.A00
            X.Pxj.A1N(r0, r2)
            X.2FO r1 = r5.A04
            java.lang.String r0 = "fbpay_remove_paypal_save"
            r1.Cgl(r0, r2)
            X.S2Q r4 = r5.A05
            com.fbpay.hub.paymentmethods.api.FbPayPayPal r0 = r5.A02
            java.lang.String r3 = r0.A02
            X.5A3 r2 = r4.A00
            r1 = 2
            X.Sc4 r0 = new X.Sc4
            r0.<init>(r3, r4, r1)
            X.QCn r2 = X.C8282QnO.A01(r0, r2)
            r5.A00 = r2
            X.2gB r1 = r5.A03
            r0 = 65
        L_0x033d:
            X.C11652Sdu.A03(r2, r1, r5, r0)
            return
        L_0x0341:
            java.lang.Object r2 = r7.A01
            X.QDC r2 = (X.QDC) r2
            com.fbpay.hub.form.params.FormParams r1 = r2.A01
            com.facebookpay.logging.FBPayLoggerData r0 = r1.A00
            if (r0 == 0) goto L_0x0354
            com.fbpay.hub.form.params.FormLogEvents r0 = r1.A02
            if (r0 == 0) goto L_0x0354
            java.lang.String r0 = r0.A02
            X.Pxj.A1I(r2, r0)
        L_0x0354:
            X.2Fj r1 = r2.A06
            goto L_0x038c
        L_0x0357:
            java.lang.Object r6 = r7.A01
            X.QDK r6 = (X.QDK) r6
            com.facebookpay.form.fragment.model.FormParams r5 = r6.A01
            r0 = 0
            if (r5 == 0) goto L_0x039d
            com.facebookpay.form.fragment.model.FormLoggingEvents r1 = r5.A09
            if (r1 == 0) goto L_0x0366
            com.facebookpay.form.fragment.model.FormClickEvent r0 = r1.A02
        L_0x0366:
            X.RLo r4 = r6.A0E
            if (r4 == 0) goto L_0x0395
            com.facebookpay.logging.LoggingContext r3 = r6.A03
            r2 = 0
            if (r3 == 0) goto L_0x0399
            java.lang.String r0 = r5.A0H
            if (r0 == 0) goto L_0x0377
            java.lang.Long r2 = X.DbV.A0q(r0)
        L_0x0377:
            X.QDH r0 = r6.A06()
            java.util.LinkedHashMap r1 = X.SUU.A08(r0)
            boolean r0 = r4 instanceof X.C8059QgB
            if (r0 == 0) goto L_0x038a
            X.Sto r0 = X.C51965G9l.A0g()
            r0.A0M(r3, r2, r1)
        L_0x038a:
            X.2Fj r1 = r6.A0C
        L_0x038c:
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0B(r0)
            return
        L_0x0395:
            X.QDK.A02(r0, r6)
            goto L_0x038a
        L_0x0399:
            java.lang.String r0 = "loggingContext"
            goto L_0x0432
        L_0x039d:
            java.lang.String r0 = "formParams"
            goto L_0x0432
        L_0x03a1:
            java.lang.Object r0 = r7.A01
            com.facebook.smartcapture.logging.IdCaptureLogger r1 = X.Pxj.A0V(r0)
            com.facebook.smartcapture.logging.CancelReason r0 = com.facebook.smartcapture.logging.CancelReason.PHOTO_SAVE_FAILURE
            r1.logFlowCancel(r0)
            return
        L_0x03ad:
            java.lang.Object r0 = r7.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.DbX.A1I(r0)
            return
        L_0x03b5:
            java.lang.Object r3 = r7.A01
            r1 = 6
            X.TNH r0 = new X.TNH
            r0.<init>(r3, r1)
            X.XtE r2 = X.XtE.A00(r0)
            r0 = 2
            X.SgD r1 = new X.SgD
            r1.<init>(r3, r0)
            java.util.concurrent.Executor r0 = X.XtE.A0B
            r2.A02(r1, r0)
            return
        L_0x03cd:
            java.lang.String r0 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            android.content.Intent r4 = X.Pxe.A0G(r0)
            java.lang.Object r3 = r7.A01
            X.U7x r3 = (X.U7x) r3
            android.content.Context r0 = r3.requireContext()
            java.lang.String r2 = r0.getPackageName()
            java.lang.String r1 = "package"
            r0 = 0
            android.net.Uri r0 = android.net.Uri.fromParts(r1, r2, r0)
            r4.setData(r0)
            r3.startActivity(r4)
            r0 = 0
            r3.A04 = r0
            return
        L_0x03f1:
            java.lang.Object r3 = r7.A01
            X.SHX r3 = (X.SHX) r3
            X.7ka r1 = r3.A04
            X.0hq r0 = r1.getChildFragmentManager()
            r0.getClass()
            r0.A0c()
            r0 = 0
            r1.Eow(r0)
            X.RrG r2 = r3.A03
            java.lang.String r1 = r3.A02
            X.QLA r0 = r2.A01
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.QcV r0 = r0.A04
            r0.loadUrl(r1)
            X.Slb r1 = r2.A00
            r0 = 1
            r1.A00 = r0
            X.ThK r1 = r3.A01
            if (r1 == 0) goto L_0x0420
            java.lang.String r0 = r3.A02
            r1.ClK(r0)
        L_0x0420:
            X.SHX.A00(r3)
            return
        L_0x0424:
            java.lang.Object r0 = r7.A01
            androidx.biometric.FingerprintDialogFragment r0 = (androidx.biometric.FingerprintDialogFragment) r0
            X.QDG r1 = r0.A04
            r0 = 1
            r1.A04(r0)
            return
        L_0x042f:
            java.lang.String r0 = "viewModel"
        L_0x0432:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x043a:
            r8.cancel()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SVE.onClick(android.content.DialogInterface, int):void");
    }
}
