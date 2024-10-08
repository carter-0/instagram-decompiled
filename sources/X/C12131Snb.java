package X;

import android.content.Intent;

/* renamed from: X.Snb  reason: case insensitive filesystem */
public final class C12131Snb implements C13710TfX {
    public SP4 A00;
    public SP4 A01;
    public 0lg A02;
    public String A03;
    public String A04;
    public Q5J A05;

    public final boolean Ctj(Intent intent, int i, int i2) {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FI6(com.facebook.login.LoginClient$Request r11) {
        /*
            r10 = this;
            X.0lg r3 = r10.A02
            java.lang.String r2 = r11.A01
            boolean r1 = r11.A02
            java.lang.String r0 = "web_auth_attempted"
            r4 = 0
            X.C9831Rht.A00(r3, r0, r2, r4, r1)
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.util.Set r1 = r11.A06
            int r0 = r1.size()
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = ","
            java.lang.String r1 = android.text.TextUtils.join(r0, r1)
            java.lang.String r0 = "scope"
            r2.putString(r0, r1)
        L_0x0025:
            X.REl r1 = r11.A00
            X.REl r0 = X.C8894REl.PROMOTE_PRO2PRO
            if (r1 != r0) goto L_0x0033
            java.lang.String r1 = "is_promote_auth"
            java.lang.String r0 = "true"
            r2.putString(r1, r0)
        L_0x0033:
            java.lang.String r1 = "default_audience"
            java.lang.String r0 = "friends"
            r2.putString(r1, r0)
            java.lang.String r3 = r10.A04
            X.SQM r1 = X.SQM.A00(r3)
            boolean r0 = r1 instanceof X.QHW
            if (r0 != 0) goto L_0x004e
            X.QHX r1 = (X.QHX) r1
            com.facebook.AccessToken r0 = r1.A00
            if (r0 == 0) goto L_0x004e
            java.lang.String r4 = r0.A02
            if (r4 != 0) goto L_0x0114
        L_0x004e:
            java.lang.String r0 = "fbsdk_logged_out_id"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x006b
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.String r4 = "com.facebook.login.WebViewAuthHandler.TOKEN_KEY"
            java.lang.String r1 = ""
            X.1An r0 = X.1An.A1J
            X.0tX r0 = X.1Al.A00(r0, r3)
            java.lang.String r4 = r0.getString(r4, r1)
            X.0qQ.A07(r4)
        L_0x006b:
            X.SP4 r0 = r10.A01
            androidx.fragment.app.Fragment r0 = r0.A06
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            java.lang.String r0 = "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY"
            android.content.SharedPreferences r0 = X.Pxe.A0H(r1, r0)
            if (r0 == 0) goto L_0x007e
            X.Pxg.A1C(r0)
        L_0x007e:
            if (r4 != 0) goto L_0x0114
            X.SP4 r0 = r10.A01
            androidx.fragment.app.Fragment r0 = r0.A06
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            java.lang.String r0 = "facebook.com"
            X.C11406SSd.A04(r1, r0)
            java.lang.String r0 = ".facebook.com"
            X.C11406SSd.A04(r1, r0)
            java.lang.String r0 = "https://facebook.com"
            X.C11406SSd.A04(r1, r0)
            java.lang.String r0 = "https://.facebook.com"
            X.C11406SSd.A04(r1, r0)
        L_0x009c:
            X.SnY r6 = new X.SnY
            r6.<init>(r11, r10)
            java.lang.String r0 = X.SP4.A01()
            r10.A03 = r0
            X.SP4 r0 = r10.A01
            androidx.fragment.app.Fragment r0 = r0.A06
            androidx.fragment.app.FragmentActivity r4 = r0.getActivity()
            java.lang.String r9 = r11.A03
            java.lang.String r5 = "oauth"
            if (r9 != 0) goto L_0x00b8
            java.lang.String r9 = X.AnonymousClass1KO.A02
        L_0x00b8:
            java.lang.String r8 = r10.A03
            boolean r7 = r11.A07
            java.lang.String r1 = "redirect_uri"
            java.lang.String r0 = "fbconnect://success"
            r2.putString(r1, r0)
            java.lang.String r0 = "client_id"
            r2.putString(r0, r9)
            java.lang.String r0 = "e2e"
            r2.putString(r0, r8)
            java.lang.String r1 = "response_type"
            java.lang.String r0 = "token,signed_request"
            r2.putString(r1, r0)
            java.lang.String r1 = "return_scopes"
            java.lang.String r0 = "true"
            r2.putString(r1, r0)
            if (r7 == 0) goto L_0x00ea
            java.lang.String r1 = "auth_type"
            java.lang.String r0 = "rerequest"
            r2.putString(r1, r0)
        L_0x00ea:
            X.Q5J r0 = new X.Q5J
            r0.<init>(r4, r2, r6, r5)
            r10.A05 = r0
            X.QBw r2 = new X.QBw
            r2.<init>()
            r0 = 1
            r2.setRetainInstance(r0)
            X.Q5J r0 = r10.A05
            r2.A00 = r0
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "arg_session_id"
            r1.putString(r0, r3)
            r2.setArguments(r1)
            X.0hq r1 = r4.getSupportFragmentManager()
            java.lang.String r0 = "FacebookDialogFragment"
            r2.A0B(r1, r0)
            return
        L_0x0114:
            java.lang.String r0 = "access_token"
            r2.putString(r0, r4)
            goto L_0x009c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12131Snb.FI6(com.facebook.login.LoginClient$Request):void");
    }
}
