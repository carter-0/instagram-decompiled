package com.instagram.urlhandlers.openinexternalbrowser;

import X.0bY;
import X.AnonymousClass0wW;
import X.DbS;
import X.DbW;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class OpenInExternalBrowserUrlHandlerActivity extends BaseFragmentActivity {
    public final 0bY A00 = DbW.A0G();

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [android.content.Context, com.instagram.urlhandlers.openinexternalbrowser.OpenInExternalBrowserUrlHandlerActivity, com.instagram.base.activity.BaseFragmentActivity, java.lang.Object, android.app.Activity] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            r0 = 1449522142(0x5665f3de, float:6.3208891E13)
            int r4 = X.AnonymousClass0fD.A00(r0)
            super.onCreate(r13)
            android.content.Intent r0 = r12.getIntent()
            java.lang.String r8 = "com.instagram.url.extra.BUNDLE"
            android.os.Bundle r1 = r0.getBundleExtra(r8)
            if (r1 != 0) goto L_0x0020
            r12.finish()
            r0 = -1606128307(0xffffffffa0446d4d, float:-1.663801E-19)
        L_0x001c:
            X.AnonymousClass0fD.A07(r0, r4)
            return
        L_0x0020:
            java.lang.String r0 = "original_url"
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L_0x0030
            r12.finish()
            r0 = -1650929513(0xffffffff9d98d097, float:-4.044974E-21)
            goto L_0x001c
        L_0x0030:
            r3 = 0
            android.net.Uri r0 = X.0cp.A03(r0)     // Catch:{ SecurityException -> 0x012f }
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r6 = "ad_id"
            X.DbU.A1B(r0, r2, r6)
            java.lang.String r7 = "url"
            X.DbU.A1B(r0, r2, r7)
            java.lang.String r5 = "tracking_token"
            X.DbU.A1B(r0, r2, r5)
            android.content.Intent r0 = r12.getIntent()
            android.os.Bundle r1 = r0.getBundleExtra(r8)
            if (r1 == 0) goto L_0x0119
            java.lang.String r0 = "extra_source_intent"
            android.os.Parcelable r1 = r1.getParcelable(r0)
            android.content.Intent r1 = (android.content.Intent) r1
            X.0cS r0 = new X.0cS
            r0.<init>()
            r0.A01()
            X.0cT r0 = r0.A00()
            boolean r0 = r0.A03(r12, r1, r3)
            if (r0 == 0) goto L_0x0119
            r0 = 1
        L_0x006f:
            java.lang.String r3 = "OpenInExternalBrowserUrlHandlerActivity"
            if (r0 != 0) goto L_0x007f
            java.lang.String r0 = "Open in external browser url handler untrusted caller"
        L_0x0075:
            X.0wb.A03(r3, r0)
        L_0x0078:
            r12.finish()
            r0 = -1259410235(0xffffffffb4eeecc5, float:-4.4503227E-7)
            goto L_0x001c
        L_0x007f:
            com.instagram.common.session.UserSession r9 = X.Pxe.A0a(r12)
            java.lang.String r1 = r2.getString(r7)
            java.lang.String r11 = r2.getString(r6)
            java.lang.String r7 = r2.getString(r5)
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = java.net.URLDecoder.decode(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x0111 }
            X.0qQ.A07(r1)     // Catch:{ UnsupportedEncodingException -> 0x0111 }
            X.0bY r0 = r12.A00     // Catch:{ UnsupportedEncodingException -> 0x0111 }
            android.net.Uri r10 = X.0cp.A00(r0, r1)     // Catch:{ UnsupportedEncodingException -> 0x0111 }
            if (r10 == 0) goto L_0x0115
            java.lang.String r1 = r10.getScheme()     // Catch:{ UnsupportedEncodingException -> 0x0111 }
            java.lang.String r0 = "https"
            if (r1 == 0) goto L_0x0115
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ UnsupportedEncodingException -> 0x0111 }
            if (r0 == 0) goto L_0x0115
            android.content.Intent r1 = X.Pxe.A0F(r10)
            java.lang.String r0 = "android.intent.category.BROWSABLE"
            android.content.Intent r8 = r1.addCategory(r0)
            X.0qQ.A07(r8)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313579121215596(0x810302000b086c, double:3.02819188707863E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x00d8
            com.instagram.inappbrowser.launcher.ExternalBrowserLauncher r0 = new com.instagram.inappbrowser.launcher.ExternalBrowserLauncher
            r0.<init>(r12, r9)
            X.Rwo r0 = r0.A01(r10)
            if (r0 == 0) goto L_0x00d8
            java.lang.String r0 = r0.A01
            r8.setPackage(r0)
        L_0x00d8:
            boolean r0 = X.0kR.A0D(r12, r8)
            if (r0 == 0) goto L_0x010d
            X.0wc r1 = X.AnonymousClass0kN.A02(r9)
            java.lang.String r0 = "iab_browser_choice_selection"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.Long r2 = X.DbZ.A0d(r11)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0078
            java.lang.String r1 = "FB_EXTERNAL_SCHEME_EXTERNAL_BROWSER_FLOW_WITH_DEFAULT_BROWSER_CHOSEN"
            java.lang.String r0 = "selection_experience"
            r3.AAJ(r0, r1)
            r3.A9F(r6, r2)
            r3.AAJ(r5, r7)
            java.lang.String r1 = "INSTAGRAM_EXTBROWSER_DEEPLINK_URL_HANDLER"
            java.lang.String r0 = "reason"
            r3.AAJ(r0, r1)
            r3.Cgf()
            goto L_0x0078
        L_0x010d:
            java.lang.String r0 = "Open in external browser url handler activity failed"
            goto L_0x0075
        L_0x0111:
            r0 = move-exception
            X.0wb.A07(r3, r0)
        L_0x0115:
            java.lang.String r0 = "Open in external browser url handler invalid URI"
            goto L_0x0075
        L_0x0119:
            X.0cS r0 = new X.0cS
            r0.<init>()
            r0.A01()
            X.0cT r1 = r0.A00()
            android.content.Intent r0 = r12.getIntent()
            boolean r0 = r1.A03(r12, r0, r3)
            goto L_0x006f
        L_0x012f:
            r12.finish()
            r0 = 856702369(0x33103da1, float:3.3583664E-8)
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.openinexternalbrowser.OpenInExternalBrowserUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
