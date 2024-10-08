package com.instagram.urlhandlers.igtv;

import X.AnonymousClass0wW;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public class IGTVExternalUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.igtv.IGTVExternalUrlHandlerActivity, android.app.Activity] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009e, code lost:
        if (r1 != false) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = -2027743217(0xffffffff8723180f, float:-1.2269827E-34)
            int r5 = X.AnonymousClass0fD.A00(r0)
            super.onCreate(r9)
            android.os.Bundle r6 = X.DbX.A0A(r8)
            if (r6 == 0) goto L_0x00c7
            java.lang.String r1 = "original_url"
            java.lang.String r0 = r6.getString(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00c7
            X.0wW r0 = X.DbT.A0W(r6)
            r8.A00 = r0
            java.lang.String r1 = r6.getString(r1)
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            if (r1 == 0) goto L_0x0056
            X.0bY r0 = X.C49282EsR.A00
            r7 = 1
            android.net.Uri r3 = X.0cp.A01(r0, r1)
            if (r3 == 0) goto L_0x0056
            java.util.List r2 = r3.getPathSegments()
            int r0 = X.DbT.A02(r2, r7)
            java.lang.String r0 = X.AnonymousClass7TE.A19(r2, r0)
            int r1 = r0.length()
            r0 = 28
            if (r1 > r0) goto L_0x00b8
            int r0 = X.DbT.A02(r2, r7)
            java.lang.String r1 = X.AnonymousClass7TE.A19(r2, r0)
            java.lang.String r0 = "igtv_deeplink_short_url_arg"
            r4.putString(r0, r1)
        L_0x0056:
            r6.putAll(r4)
            java.lang.String r0 = "igtv_deeplink_short_url_arg"
            java.lang.String r3 = r6.getString(r0)
            java.lang.String r0 = "igtv_deeplink_should_open_in_browser"
            boolean r1 = r6.getBoolean(r0)
            X.0wW r0 = r8.A00
            boolean r0 = r0 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L_0x007b
            X.1WK r1 = X.FFQ.A00()
            X.0wW r0 = r8.A00
            r1.A00(r8, r6, r0)
        L_0x0074:
            r0 = -1343150069(0xffffffffaff1280b, float:-4.3866097E-10)
        L_0x0077:
            X.AnonymousClass0fD.A07(r0, r5)
            return
        L_0x007b:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x009e
            if (r1 != 0) goto L_0x00a0
            X.14B r0 = X.AnonymousClass14B.A00()
            android.content.Intent r2 = r0.A01(r8)
            java.lang.String r0 = "instagram://tv_viewer"
            android.net.Uri$Builder r1 = X.DbW.A07(r0)
            java.lang.String r0 = "short_url"
            android.net.Uri$Builder r0 = r1.appendQueryParameter(r0, r3)
            X.Dba.A0o(r8, r2, r0)
        L_0x009a:
            r8.finish()
            goto L_0x0074
        L_0x009e:
            if (r1 == 0) goto L_0x0074
        L_0x00a0:
            X.0wW r3 = r8.A00
            java.lang.String r0 = "igtv_deeplink_full_url_arg"
            java.lang.String r2 = r6.getString(r0)
            r0 = 133(0x85, float:1.86E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r1 = r6.getString(r0)
            X.2EG r0 = X.2EG.A23
            X.FHB.A04(r8, r3, r0, r2, r1)
            goto L_0x009a
        L_0x00b8:
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = "igtv_deeplink_full_url_arg"
            r4.putString(r0, r1)
            java.lang.String r0 = "igtv_deeplink_should_open_in_browser"
            r4.putBoolean(r0, r7)
            goto L_0x0056
        L_0x00c7:
            r8.finish()
            r0 = 532921218(0x1fc3bb82, float:8.289592E-20)
            goto L_0x0077
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.igtv.IGTVExternalUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
