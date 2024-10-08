package X;

public final class T0J implements 2IR {
    public final int A00;
    public final Object A01;

    public T0J(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.facebook.oauthaccountlinking.OAuthAccountLinkingActivityBase, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r4v2, types: [com.facebook.oauthaccountlinking.OAuthAccountLinkingActivityBase, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r4v4, types: [com.facebook.oauthaccountlinking.OAuthAccountLinkingActivityBase, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0069, code lost:
        r3[r2] = r6;
        X.0KC.A09(r4, "Failed to download model %s:%d", r3);
        ((X.C13721Tfn) r5.A01).DAH();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0077, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00f9, code lost:
        com.facebook.oauthaccountlinking.OAuthAccountLinkingActivityBase.A00(r4, r3, (java.lang.Long) null, r6.getMessage(), X.2Og.A00(r6));
        r4.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0108, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFailure(java.lang.Throwable r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x00db;
                case 1: goto L_0x00bc;
                case 2: goto L_0x00b4;
                case 3: goto L_0x0097;
                case 4: goto L_0x0005;
                case 5: goto L_0x0078;
                case 6: goto L_0x0053;
                case 7: goto L_0x003c;
                case 8: goto L_0x0033;
                case 9: goto L_0x0027;
                case 10: goto L_0x0027;
                case 11: goto L_0x0005;
                case 12: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.String r1 = com.instagram.common.resources.downloadable.impl.WaitingForStringsActivity.A0A
            java.lang.String r0 = "Failed to fetch string from server."
            X.0KC.A0F(r1, r0, r6)
            X.02m r2 = X.02m.A0p
            r1 = 4456452(0x440004, float:6.24482E-39)
            r0 = 3
            r2.markerEnd(r1, r0)
            java.lang.Object r1 = r5.A01
            com.instagram.common.resources.downloadable.impl.WaitingForStringsActivity r1 = (com.instagram.common.resources.downloadable.impl.WaitingForStringsActivity) r1
            X.THU r0 = new X.THU
            r0.<init>(r1, r6)
            r1.runOnUiThread(r0)
            return
        L_0x0027:
            java.lang.Object r1 = r5.A01
            X.4D7 r1 = (X.AnonymousClass4D7) r1
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            r1.resumeWith(r0)
            return
        L_0x0033:
            java.lang.Object r1 = r5.A01
            X.Tg8 r1 = (X.C13736Tg8) r1
            r0 = 0
            r1.Dap(r0, r0, r6)
            return
        L_0x003c:
            r1 = 0
            X.0qQ.A0B(r6, r1)
            java.lang.Class<com.facebook.smartcapture.download.IgVoltronAndNmlModulesDownloader> r4 = com.facebook.smartcapture.download.IgVoltronAndNmlModulesDownloader.class
            r0 = 3
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = "ocr2go_credit_card_models"
            r3[r1] = r0
            r2 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0 = 1
            r3[r0] = r1
            goto L_0x0069
        L_0x0053:
            r1 = 0
            X.0qQ.A0B(r6, r1)
            java.lang.Class<com.facebook.smartcapture.download.IgVoltronAndNmlModulesDownloader> r4 = com.facebook.smartcapture.download.IgVoltronAndNmlModulesDownloader.class
            r0 = 3
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r0 = "model"
            r3[r1] = r0
            r1 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3[r1] = r0
            r2 = 2
        L_0x0069:
            r3[r2] = r6
            java.lang.String r0 = "Failed to download model %s:%d"
            X.0KC.A09(r4, r0, r3)
            java.lang.Object r0 = r5.A01
            X.Tfn r0 = (X.C13721Tfn) r0
            r0.DAH()
            return
        L_0x0078:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r3 = r5.A01
            X.Q2X r3 = (X.Q2X) r3
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            com.google.common.collect.ImmutableMap r1 = com.google.common.collect.RegularImmutableMap.A02
            X.0qQ.A07(r1)
            java.lang.String r0 = "Document model fetch error"
            r3.Dlm(r1, r2, r0)
            java.lang.String r1 = "Showreel Native Animation Resource API call failed"
            X.RKD r0 = new X.RKD
            r0.<init>(r1, r6)
            r3.D9i(r0)
            return
        L_0x0097:
            java.lang.Object r0 = r5.A01
            X.SH0 r0 = (X.SH0) r0
            r2 = 0
            X.0jk r0 = r0.A00
            X.0jl r0 = r0.A00
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "PHONEID_APP_DEVICEID_SYNCED"
            r1.E5T(r0, r2)
            r1.apply()
            java.util.concurrent.atomic.AtomicBoolean r0 = X.SH0.A02
            r0.set(r2)
            return
        L_0x00b4:
            java.lang.Object r0 = r5.A01
            com.facebook.papaya.client.platform.PlatformRichJobSchedulingGuard r0 = (com.facebook.papaya.client.platform.PlatformRichJobSchedulingGuard) r0
            r0.A01()
            return
        L_0x00bc:
            r3 = 0
            X.0qQ.A0B(r6, r3)
            android.content.Intent r2 = X.DbS.A09()
            java.lang.String r1 = "result_operation_type"
            java.lang.String r0 = "new_access_token"
            android.content.Intent r0 = X.Pxj.A0F(r2, r1, r0, r6)
            X.0qQ.A07(r0)
            java.lang.Object r4 = r5.A01
            com.facebook.oauthaccountlinking.OAuthAccountLinkingActivityBase r4 = (com.facebook.oauthaccountlinking.OAuthAccountLinkingActivityBase) r4
            r4.setResult(r3, r0)
            java.lang.Integer r3 = X.AnonymousClass05K.A0j
            goto L_0x00f9
        L_0x00db:
            r3 = 0
            X.0qQ.A0B(r6, r3)
            android.content.Intent r2 = X.DbS.A09()
            java.lang.String r1 = "result_operation_type"
            java.lang.String r0 = "new_access_token"
            android.content.Intent r0 = X.Pxj.A0F(r2, r1, r0, r6)
            X.0qQ.A07(r0)
            java.lang.Object r4 = r5.A01
            com.facebook.oauthaccountlinking.OAuthAccountLinkingActivityBase r4 = (com.facebook.oauthaccountlinking.OAuthAccountLinkingActivityBase) r4
            r4.setResult(r3, r0)
            java.lang.Integer r3 = X.AnonymousClass05K.A0Y
        L_0x00f9:
            java.lang.String r2 = r6.getMessage()
            java.lang.String r1 = X.2Og.A00(r6)
            r0 = 0
            com.facebook.oauthaccountlinking.OAuthAccountLinkingActivityBase.A00(r4, r3, r0, r2, r1)
            r4.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T0J.onFailure(java.lang.Throwable):void");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [com.facebook.oauthaccountlinking.OAuthAccountLinkingActivityBase, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r2v14, types: [java.util.AbstractMap, java.util.EnumMap] */
    /* JADX WARNING: type inference failed for: r4v9, types: [android.content.Context, java.lang.Object, com.facebook.oauthaccountlinking.OAuthAccountLinkingActivityBase, android.app.Activity] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007a, code lost:
        if (r11 != null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01d6, code lost:
        ((X.C13721Tfn) r10.A01).DAJ(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01dd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01e4, code lost:
        r0 = "Failed to download model %s:%d";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01ef, code lost:
        X.0KC.A09(r2, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01f2, code lost:
        ((X.C13721Tfn) r10.A01).DAH();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01f9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x020c, code lost:
        r2.D9k(r1, X.C14527Txn.A00(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0213, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x023a;
                case 1: goto L_0x004d;
                case 2: goto L_0x0232;
                case 3: goto L_0x0214;
                case 4: goto L_0x0204;
                case 5: goto L_0x01fa;
                case 6: goto L_0x01c6;
                case 7: goto L_0x0178;
                case 8: goto L_0x016b;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x002c;
                case 12: goto L_0x0011;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r10.A01
            X.4D7 r1 = (X.AnonymousClass4D7) r1
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            r1.resumeWith(r0)
        L_0x0010:
            return
        L_0x0011:
            X.1Zu r11 = (X.1Zu) r11
            if (r11 == 0) goto L_0x0010
            boolean r0 = r11.A01
            if (r0 == 0) goto L_0x02cb
            java.lang.Object r2 = r10.A01
            com.instagram.common.resources.downloadable.impl.WaitingForStringsActivity r2 = (com.instagram.common.resources.downloadable.impl.WaitingForStringsActivity) r2
            X.13u r0 = r2.A03
            if (r0 != 0) goto L_0x02be
            java.lang.String r0 = "resourcesLogger"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x002c:
            java.util.List r11 = (java.util.List) r11
            if (r11 == 0) goto L_0x0010
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x0010
            java.lang.Object r0 = r10.A01
            X.QJI r0 = (X.QJI) r0
            X.R8a r0 = r0.A01
            X.T5o r3 = r0.A01
            android.view.View r2 = r0.requireView()
            java.util.concurrent.Executor r1 = r3.A03
            X.TJC r0 = new X.TJC
            r0.<init>(r2, r3, r11)
            r1.execute(r0)
            return
        L_0x004d:
            X.3JD r11 = (X.AnonymousClass3JD) r11
            java.lang.Object r4 = r10.A01
            com.facebook.oauthaccountlinking.OAuthAccountLinkingActivityBase r4 = (com.facebook.oauthaccountlinking.OAuthAccountLinkingActivityBase) r4
            java.lang.Integer r0 = X.AnonymousClass05K.A02
            r3 = 0
            com.facebook.oauthaccountlinking.OAuthAccountLinkingActivityBase.A00(r4, r0, r3, r3, r3)
            java.lang.String r9 = ""
            if (r11 == 0) goto L_0x0079
            X.3lr r5 = X.C41845B3m.A0U(r11)
            if (r5 == 0) goto L_0x0079
            java.lang.Class<X.QUA> r2 = X.QUA.class
            java.lang.String r1 = "xfb_oauth_account_linking_authorization_url(auth_integration_id:$oauth_integration_id,surface:$surface)"
            r0 = 1240424405(0x49ef5fd5, float:1960954.6)
            X.3lr r1 = r5.A03(r2, r1, r0)
            if (r1 == 0) goto L_0x0079
            java.lang.String r0 = "login_url"
            java.lang.String r8 = r1.A08(r0)
            if (r8 != 0) goto L_0x007c
        L_0x0079:
            r8 = r9
            if (r11 == 0) goto L_0x009a
        L_0x007c:
            X.3lr r6 = X.C41845B3m.A0U(r11)
            if (r6 == 0) goto L_0x009a
            java.lang.Class<X.QUA> r5 = X.QUA.class
            r2 = 0
            java.lang.String r1 = "xfb_oauth_account_linking_authorization_url(auth_integration_id:$oauth_integration_id,surface:$surface)"
            r0 = 1240424405(0x49ef5fd5, float:1960954.6)
            X.3lr r1 = r6.getOptionalTreeField(r2, r1, r5, r0)
            if (r1 == 0) goto L_0x009a
            java.lang.String r0 = "app_login_url"
            java.lang.String r0 = r1.getOptionalStringField(r2, r0)
            if (r0 == 0) goto L_0x009a
            r9 = r0
        L_0x009a:
            int r7 = r8.length()
            r5 = 0
            if (r7 != 0) goto L_0x00cc
            int r0 = r9.length()
            if (r0 != 0) goto L_0x00cc
            android.content.Intent r2 = X.DbS.A09()
            java.lang.String r1 = "result_operation_type"
            java.lang.String r0 = "new_access_token"
            android.content.Intent r2 = r2.putExtra(r1, r0)
            java.lang.String r0 = "error"
            java.lang.String r1 = "NULL_LOGIN_URL"
            android.content.Intent r0 = r2.putExtra(r0, r1)
            X.0qQ.A07(r0)
            r4.setResult(r5, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            com.facebook.oauthaccountlinking.OAuthAccountLinkingActivityBase.A00(r4, r0, r3, r1, r3)
        L_0x00c8:
            r4.finish()
            return
        L_0x00cc:
            if (r11 == 0) goto L_0x0123
            X.3lr r6 = X.C41845B3m.A0U(r11)
            if (r6 == 0) goto L_0x0123
            java.lang.Class<X.QUA> r2 = X.QUA.class
            java.lang.String r1 = "xfb_oauth_account_linking_authorization_url(auth_integration_id:$oauth_integration_id,surface:$surface)"
            r0 = 1240424405(0x49ef5fd5, float:1960954.6)
            X.3lr r6 = r6.getOptionalTreeField(r5, r1, r2, r0)
            if (r6 == 0) goto L_0x0123
            X.RG3 r2 = X.RG3.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 3
            java.lang.String r0 = "browser_type"
            java.lang.Enum r2 = r6.getOptionalEnumField(r1, r0, r2)
            X.RG3 r2 = (X.RG3) r2
        L_0x00ed:
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            com.facebook.oauthaccountlinking.OAuthAccountLinkingActivityBase.A00(r4, r0, r3, r3, r3)
            android.content.Intent r6 = r4.getIntent()
            r1 = 1
            if (r6 == 0) goto L_0x0101
            java.lang.String r0 = "is_app2app_enabled"
            boolean r0 = r6.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0125
        L_0x0101:
            int r0 = r9.length()
            if (r0 == 0) goto L_0x0125
            android.net.Uri r0 = X.DbT.A09(r9)
            android.content.Intent r1 = X.Pxe.A0F(r0)
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            if (r0 == 0) goto L_0x0125
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            android.content.ComponentName r0 = r1.resolveActivity(r0)
            if (r0 == 0) goto L_0x0125
            r4.startActivity(r1)
            return
        L_0x0123:
            r2 = 0
            goto L_0x00ed
        L_0x0125:
            if (r7 != 0) goto L_0x0149
            android.content.Intent r2 = X.DbS.A09()
            java.lang.String r1 = "result_operation_type"
            java.lang.String r0 = "new_access_token"
            android.content.Intent r2 = r2.putExtra(r1, r0)
            java.lang.String r0 = "error"
            java.lang.String r1 = "NULL_LOGIN_URL"
            android.content.Intent r0 = r2.putExtra(r0, r1)
            X.0qQ.A07(r0)
            r4.setResult(r5, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            com.facebook.oauthaccountlinking.OAuthAccountLinkingActivityBase.A00(r4, r0, r3, r1, r3)
            goto L_0x00c8
        L_0x0149:
            X.T9K r0 = r4.A02
            if (r0 == 0) goto L_0x0010
            r1 = 3
            if (r2 == 0) goto L_0x02d4
            int r0 = r2.ordinal()
            if (r0 != r1) goto L_0x02d4
            android.util.LruCache r0 = X.0cp.A00
            android.net.Uri r0 = android.net.Uri.parse(r8)
            X.0qQ.A07(r0)
            android.content.Intent r1 = X.Pxe.A0F(r0)
            android.content.Context r0 = r4.getApplicationContext()
            X.0kR.A0D(r0, r1)
            return
        L_0x016b:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r0 = r10.A01
            X.Tg8 r0 = (X.C13736Tg8) r0
            r11.getClass()
            r0.Das(r11)
            return
        L_0x0178:
            com.facebook.models.ModelMetadata r11 = (com.facebook.models.ModelMetadata) r11
            if (r11 == 0) goto L_0x01bb
            java.lang.String r0 = "det_model_"
            com.facebook.models.ModelAssetMetadata r5 = r11.getAssetMetadata(r0)
            java.lang.String r0 = "rcg_model_"
            com.facebook.models.ModelAssetMetadata r4 = r11.getAssetMetadata(r0)
            java.lang.String r0 = "ocr_config_"
            com.facebook.models.ModelAssetMetadata r3 = r11.getAssetMetadata(r0)
            if (r5 == 0) goto L_0x01b3
            if (r4 == 0) goto L_0x01b3
            if (r3 == 0) goto L_0x01b3
            java.lang.Class<X.RE8> r0 = X.RE8.class
            java.util.EnumMap r2 = new java.util.EnumMap
            r2.<init>(r0)
            X.RE8 r1 = X.RE8.DETECTOR
            java.lang.String r0 = r5.path
            r2.put(r1, r0)
            X.RE8 r1 = X.RE8.RECOGNIZER
            java.lang.String r0 = r4.path
            r2.put(r1, r0)
            X.RE8 r1 = X.RE8.CONFIGURATION
            java.lang.String r0 = r3.path
            r2.put(r1, r0)
            goto L_0x01d6
        L_0x01b3:
            java.lang.Class<com.facebook.smartcapture.download.IgVoltronAndNmlModulesDownloader> r1 = com.facebook.smartcapture.download.IgVoltronAndNmlModulesDownloader.class
            java.lang.String r0 = "Failed to download OCR model via NMLML. Missing required assets."
            X.0KC.A02(r1, r0)
            goto L_0x01f2
        L_0x01bb:
            java.lang.Class<com.facebook.smartcapture.download.IgVoltronAndNmlModulesDownloader> r2 = com.facebook.smartcapture.download.IgVoltronAndNmlModulesDownloader.class
            r1 = 2
            java.lang.String r0 = "ocr2go_credit_card_models"
            java.lang.Object[] r1 = X.C51968G9o.A1Z(r0, r1)
            goto L_0x01e4
        L_0x01c6:
            com.facebook.models.ModelMetadata r11 = (com.facebook.models.ModelMetadata) r11
            r0 = 1
            java.lang.String r1 = "model"
            if (r11 == 0) goto L_0x01de
            com.facebook.models.ModelAssetMetadata r0 = r11.getAssetMetadata(r1)
            if (r0 == 0) goto L_0x01e7
            java.lang.String r2 = r0.path
        L_0x01d6:
            java.lang.Object r0 = r10.A01
            X.Tfn r0 = (X.C13721Tfn) r0
            r0.DAJ(r2)
            return
        L_0x01de:
            java.lang.Class<com.facebook.smartcapture.download.IgVoltronAndNmlModulesDownloader> r2 = com.facebook.smartcapture.download.IgVoltronAndNmlModulesDownloader.class
            java.lang.Object[] r1 = X.C51968G9o.A1Z(r1, r0)
        L_0x01e4:
            java.lang.String r0 = "Failed to download model %s:%d"
            goto L_0x01ef
        L_0x01e7:
            java.lang.Class<com.facebook.smartcapture.download.IgVoltronAndNmlModulesDownloader> r2 = com.facebook.smartcapture.download.IgVoltronAndNmlModulesDownloader.class
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = "Failed to download ID Detector model via NMLML. Can't find asset: %s"
        L_0x01ef:
            X.0KC.A09(r2, r0, r1)
        L_0x01f2:
            java.lang.Object r0 = r10.A01
            X.Tfn r0 = (X.C13721Tfn) r0
            r0.DAH()
            return
        L_0x01fa:
            X.Txb r11 = (X.C14515Txb) r11
            java.lang.Object r2 = r10.A01
            X.Q2X r2 = (X.Q2X) r2
            java.lang.String r1 = "network"
            goto L_0x020c
        L_0x0204:
            X.Txb r11 = (X.C14515Txb) r11
            java.lang.Object r2 = r10.A01
            X.Q2X r2 = (X.Q2X) r2
            java.lang.String r1 = "cache"
        L_0x020c:
            int r0 = X.C14527Txn.A00(r11)
            r2.D9k(r1, r0)
            return
        L_0x0214:
            java.lang.Object r0 = r10.A01
            X.SH0 r0 = (X.SH0) r0
            r2 = 1
            X.0jk r0 = r0.A00
            X.0jl r0 = r0.A00
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "PHONEID_APP_DEVICEID_SYNCED"
            r1.E5T(r0, r2)
            r1.apply()
            java.util.concurrent.atomic.AtomicBoolean r1 = X.SH0.A02
            r0 = 0
            r1.set(r0)
            return
        L_0x0232:
            java.lang.Object r0 = r10.A01
            com.facebook.papaya.client.platform.PlatformRichJobSchedulingGuard r0 = (com.facebook.papaya.client.platform.PlatformRichJobSchedulingGuard) r0
            r0.A01()
            return
        L_0x023a:
            X.3JD r11 = (X.AnonymousClass3JD) r11
            java.lang.Object r3 = r10.A01
            com.facebook.oauthaccountlinking.OAuthAccountLinkingActivityBase r3 = (com.facebook.oauthaccountlinking.OAuthAccountLinkingActivityBase) r3
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            r2 = 0
            com.facebook.oauthaccountlinking.OAuthAccountLinkingActivityBase.A00(r3, r0, r2, r2, r2)
            r7 = 0
            if (r11 == 0) goto L_0x02bb
            X.3lr r6 = X.C41845B3m.A0U(r11)
            if (r6 == 0) goto L_0x02bb
            java.lang.Class<X.QU8> r4 = X.QU8.class
            r5 = 0
            java.lang.String r1 = "xfb_oauth_account_linking_create_access_token(auth_code:$authCode,state:$state,surface:$surface)"
            r0 = 1409570817(0x54045801, float:2.27364857E12)
            X.3lr r4 = r6.getOptionalTreeField(r5, r1, r4, r0)
            if (r4 == 0) goto L_0x02bc
            java.lang.String r0 = "access_token"
            java.lang.String r5 = r4.getOptionalStringField(r5, r0)
            r1 = 1
            java.lang.String r0 = "expiry_time"
            int r0 = r4.getCoercedIntField(r1, r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
        L_0x026f:
            java.lang.String r1 = "new_access_token"
            java.lang.String r0 = "result_operation_type"
            if (r4 == 0) goto L_0x02a5
            if (r5 == 0) goto L_0x02a5
            if (r7 == 0) goto L_0x02a5
            int r4 = r7.intValue()
            if (r4 == 0) goto L_0x02a5
            android.content.Intent r1 = X.Pxi.A0B(r0, r1)
            java.lang.String r0 = "access_token"
            android.content.Intent r1 = r1.putExtra(r0, r5)
            java.lang.String r0 = "access_token_expiry_time"
            android.content.Intent r1 = r1.putExtra(r0, r4)
            X.0qQ.A07(r1)
            r0 = -1
            r3.setResult(r0, r1)
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            java.lang.Long r0 = X.DbS.A0j(r4)
            com.facebook.oauthaccountlinking.OAuthAccountLinkingActivityBase.A00(r3, r1, r0, r2, r2)
        L_0x02a1:
            r3.finish()
            return
        L_0x02a5:
            r5 = 0
            android.content.Intent r4 = X.Pxi.A0B(r0, r1)
            java.lang.String r0 = "error"
            java.lang.String r1 = "NULL_ACCESS_TOKEN_OR_EXPIRY"
            android.content.Intent r0 = r4.putExtra(r0, r1)
            r3.setResult(r5, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            com.facebook.oauthaccountlinking.OAuthAccountLinkingActivityBase.A00(r3, r0, r2, r1, r2)
            goto L_0x02a1
        L_0x02bb:
            r4 = r2
        L_0x02bc:
            r5 = r2
            goto L_0x026f
        L_0x02be:
            X.0Ae r1 = r0.A01
            java.lang.String r0 = "fbresources_waiting_complete"
            X.0wc r1 = (X.0wc) r1
            X.DbZ.A1R(r1, r0)
            com.instagram.common.resources.downloadable.impl.WaitingForStringsActivity.A01(r2)
            return
        L_0x02cb:
            java.lang.Throwable r0 = r11.A00
            X.0qQ.A0A(r0)
            r10.onFailure(r0)
            return
        L_0x02d4:
            com.instagram.common.session.UserSession r7 = X.Pxe.A0a(r4)
            android.util.LruCache r0 = X.0cp.A00
            android.net.Uri r3 = android.net.Uri.parse(r8)
            X.0qQ.A07(r3)
            android.content.Intent r1 = r4.getIntent()
            if (r1 == 0) goto L_0x0349
            java.lang.String r0 = "iab_intent"
            android.os.Parcelable r2 = r1.getParcelableExtra(r0)
            android.content.Intent r2 = (android.content.Intent) r2
        L_0x02ef:
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            if (r2 == 0) goto L_0x0307
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2)
            android.content.Intent r0 = r0.setData(r3)
            android.content.Intent r6 = r0.setFlags(r1)
            X.0qQ.A07(r6)
        L_0x0303:
            X.0kR.A0B(r4, r6)
            return
        L_0x0307:
            java.lang.String r0 = "com.instagram.inappbrowser.fragments.BrowserLiteInMainProcessIGActivity"
            java.lang.Class r0 = java.lang.Class.forName(r0)
            android.content.Intent r0 = X.C66580MXl.A0A(r4, r0)
            android.content.Intent r0 = r0.setData(r3)
            android.content.Intent r6 = r0.setFlags(r1)
            X.0qQ.A07(r6)
            java.lang.String r1 = r7.getToken()
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r6.putExtra(r0, r1)
            X.S6q r3 = new X.S6q
            r3.<init>()
            android.content.res.Configuration r0 = X.Pxf.A0G(r4)
            java.util.Locale r2 = r0.locale
            android.content.Intent r1 = r3.A02
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_LOCALE"
            r1.putExtra(r0, r2)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_SHOW_DOMAIN_NAME"
            r1.putExtra(r0, r5)
            java.lang.String r0 = "BrowserLiteIntent.IAB_EXTERNAL_INTERSTITIAL_ENABLED"
            r1.putExtra(r0, r5)
            android.content.Intent r0 = r3.A00()
            r6.putExtras(r0)
            goto L_0x0303
        L_0x0349:
            r2 = 0
            goto L_0x02ef
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T0J.onSuccess(java.lang.Object):void");
    }
}
