package X;

public final class TTG extends 03J implements C62320sa {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TTG(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L_0x0013;
                case 1: goto L_0x001d;
                case 2: goto L_0x0027;
                case 3: goto L_0x002f;
                case 4: goto L_0x0037;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<X.R8N> r3 = X.R8N.class
            r1 = 0
            java.lang.String r4 = "bindLinkHistorySettings"
            java.lang.String r5 = "bindLinkHistorySettings()V"
        L_0x000d:
            r2 = r8
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0013:
            java.lang.Class<X.QDD> r3 = X.QDD.class
            r1 = 0
            java.lang.String r4 = "onCareIconClick"
            java.lang.String r5 = "onCareIconClick()V"
            goto L_0x000d
        L_0x001d:
            java.lang.Class<X.QDD> r3 = X.QDD.class
            r1 = 0
            java.lang.String r4 = "onSettingsIconClick"
            java.lang.String r5 = "onSettingsIconClick()V"
            goto L_0x000d
        L_0x0027:
            java.lang.Class<X.0eK> r3 = X.AnonymousClass0eK.class
            r1 = 0
            java.lang.String r4 = "get"
            java.lang.String r5 = "get()Ljava/lang/Object;"
            goto L_0x000d
        L_0x002f:
            java.lang.Class<X.SlK> r3 = X.SlK.class
            r1 = 0
            java.lang.String r4 = "footerRenderingFinished"
            java.lang.String r5 = "footerRenderingFinished()V"
            goto L_0x000d
        L_0x0037:
            java.lang.Class<X.R8N> r3 = X.R8N.class
            r1 = 0
            java.lang.String r4 = "bindClearBrowserData"
            java.lang.String r5 = "bindClearBrowserData()V"
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TTG.<init>(java.lang.Object, int):void");
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [X.QcV, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b9, code lost:
        X.SR4.A01(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ef, code lost:
        r6 = "loggingData";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f1, code lost:
        X.0qQ.A0F(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        X.R8N.A05(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x0034;
                case 1: goto L_0x0077;
                case 2: goto L_0x00e6;
                case 3: goto L_0x00be;
                case 4: goto L_0x00dd;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r9.receiver
            X.R8N r3 = (X.R8N) r3
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x002f
            X.0eM r0 = r3.A0C
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.SSz r2 = X.Ri1.A00(r0)
            java.lang.String r1 = "browser_link_history_opt_in_key"
            X.0xa r0 = r2.A03
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0032
            java.lang.Boolean r0 = r2.A05()
            boolean r0 = X.DbX.A1a(r0)
        L_0x0029:
            X.R8N.A07(r3, r0)
        L_0x002c:
            X.R8N.A05(r3)
        L_0x002f:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0032:
            r0 = 0
            goto L_0x0029
        L_0x0034:
            java.lang.Object r8 = r9.receiver
            X.QDD r8 = (X.QDD) r8
            java.lang.String r7 = r8.A01
            if (r7 == 0) goto L_0x002f
            java.lang.String r6 = "careUrl"
            java.lang.String r5 = "payouthub_contact_link"
            java.lang.String r4 = X.QDD.A00(r8)
            java.lang.String r3 = "user_click_payouthub_atomic"
            X.2FO r2 = X.C11426STk.A00()
            com.facebookpay.msc.logging.LoggingData r0 = r8.A00
            if (r0 == 0) goto L_0x00ef
            java.util.HashMap r1 = X.C9634ReE.A00(r0)
            java.lang.String r0 = "target_name"
            r1.put(r0, r5)
            java.lang.String r0 = "target_url"
            r1.put(r0, r7)
            if (r4 == 0) goto L_0x0068
            java.lang.String r0 = "view_name"
            r1.put(r0, r4)
        L_0x0068:
            r2.Cgl(r3, r1)
            X.2Fj r3 = r8.A0C
            java.lang.String r0 = r8.A01
            if (r0 == 0) goto L_0x00f1
            X.Stz r2 = new X.Stz
            r2.<init>(r0)
            goto L_0x00b9
        L_0x0077:
            java.lang.Object r6 = r9.receiver
            X.QDD r6 = (X.QDD) r6
            java.util.List r0 = r6.A03
            if (r0 == 0) goto L_0x002f
            java.lang.String r5 = "payouthub_settings_link"
            java.lang.String r4 = X.QDD.A00(r6)
            java.lang.String r3 = "user_click_payouthub_atomic"
            X.2FO r2 = X.C11426STk.A00()
            com.facebookpay.msc.logging.LoggingData r0 = r6.A00
            if (r0 == 0) goto L_0x00ef
            java.util.HashMap r1 = X.C9634ReE.A00(r0)
            java.lang.String r0 = "target_name"
            r1.put(r0, r5)
            if (r4 == 0) goto L_0x00a3
            java.lang.String r0 = "view_name"
            r1.put(r0, r4)
        L_0x00a3:
            r2.Cgl(r3, r1)
            java.lang.String r1 = "settings_fragment"
            java.lang.String r0 = "home_icon"
            r6.A02(r1, r0)
            X.2Fj r3 = r6.A0C
            android.os.Bundle r0 = r6.A01()
            X.Su0 r2 = new X.Su0
            r2.<init>(r1, r0)
        L_0x00b9:
            X.SR4.A01(r3, r2)
            goto L_0x002f
        L_0x00be:
            java.lang.Object r4 = r9.receiver
            X.SlK r4 = (X.SlK) r4
            X.QLA r0 = r4.A00
            if (r0 == 0) goto L_0x002f
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.QcV r3 = r0.A04
            if (r3 == 0) goto L_0x002f
            X.Th4 r0 = r4.A01
            if (r0 == 0) goto L_0x002f
            android.view.View r2 = r0.B7F()
            if (r2 == 0) goto L_0x002f
            r0 = 250(0xfa, double:1.235E-321)
            X.SlK.A01(r3, r2, r4, r0)
            goto L_0x002f
        L_0x00dd:
            java.lang.Object r3 = r9.receiver
            X.R8N r3 = (X.R8N) r3
            X.R8N.A03(r3)
            goto L_0x002c
        L_0x00e6:
            java.lang.Object r0 = r9.receiver
            X.0eK r0 = (X.AnonymousClass0eK) r0
            java.lang.Object r0 = r0.get()
            return r0
        L_0x00ef:
            java.lang.String r6 = "loggingData"
        L_0x00f1:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TTG.invoke():java.lang.Object");
    }
}
