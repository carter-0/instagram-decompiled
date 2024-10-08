package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.facebook.CustomTabMainActivity;
import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;
import com.facebook.login.LoginClient$Request;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.Snc  reason: case insensitive filesystem */
public final class C12132Snc implements C13710TfX {
    public String A00 = null;
    public String A01 = "";
    public final SP4 A02;
    public final SP4 A03;
    public final 0lg A04;
    public final String A05;

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Ctj(android.content.Intent r12, int r13, int r14) {
        /*
            r11 = this;
            r5 = 0
            if (r12 == 0) goto L_0x0011
            java.lang.String r0 = "CustomTabMainActivity.no_activity_exception"
            boolean r0 = r12.getBooleanExtra(r0, r5)
            if (r0 == 0) goto L_0x0011
            X.SP4 r0 = r11.A02
            r0.A02()
        L_0x0010:
            return r5
        L_0x0011:
            r4 = 1
            if (r13 != r4) goto L_0x0010
            X.SP4 r2 = r11.A03
            com.facebook.login.LoginClient$Request r6 = r2.A01
            r10 = -1
            if (r14 != r10) goto L_0x0130
            if (r12 != 0) goto L_0x0036
            r1 = 0
        L_0x001e:
            r5 = 0
            if (r1 == 0) goto L_0x010f
            java.lang.String r0 = "fbconnect://cct."
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = r11.A01
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x010f
        L_0x0031:
            android.os.Bundle r3 = X.C11406SSd.A01(r1)
            goto L_0x003d
        L_0x0036:
            java.lang.String r0 = "CustomTabMainActivity.extra_url"
            java.lang.String r1 = r12.getStringExtra(r0)
            goto L_0x001e
        L_0x003d:
            java.lang.String r0 = "state"
            java.lang.String r0 = r3.getString(r0)     // Catch:{ JSONException -> 0x0122 }
            if (r0 == 0) goto L_0x0122
            org.json.JSONObject r1 = X.C66580MXl.A17(r0)     // Catch:{ JSONException -> 0x0122 }
            java.lang.String r0 = "7_challenge"
            java.lang.String r1 = r1.getString(r0)     // Catch:{ JSONException -> 0x0122 }
            java.lang.String r0 = r11.A05     // Catch:{ JSONException -> 0x0122 }
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0122 }
            if (r0 == 0) goto L_0x0122
            java.lang.String r2 = "error"
            java.lang.String r9 = r3.getString(r2)
            if (r9 != 0) goto L_0x0066
            java.lang.String r0 = "error_type"
            java.lang.String r9 = r3.getString(r0)
        L_0x0066:
            java.lang.String r0 = "error_msg"
            java.lang.String r8 = r3.getString(r0)
            if (r8 != 0) goto L_0x007c
            java.lang.String r0 = "error_message"
            java.lang.String r8 = r3.getString(r0)
            if (r8 != 0) goto L_0x007c
            java.lang.String r0 = "error_description"
            java.lang.String r8 = r3.getString(r0)
        L_0x007c:
            java.lang.String r0 = "error_code"
            java.lang.String r7 = r3.getString(r0)
            boolean r0 = X.C11406SSd.A05(r7)
            if (r0 != 0) goto L_0x0097
            if (r7 == 0) goto L_0x008f
            int r1 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x0097 }
            goto L_0x0098
        L_0x008f:
            java.lang.String r1 = "Cannot parse null errorCodeString"
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException     // Catch:{ NumberFormatException -> 0x0097 }
            r0.<init>(r1)     // Catch:{ NumberFormatException -> 0x0097 }
            throw r0     // Catch:{ NumberFormatException -> 0x0097 }
        L_0x0097:
            r1 = -1
        L_0x0098:
            boolean r0 = X.C11406SSd.A05(r9)
            if (r0 == 0) goto L_0x00c3
            boolean r0 = X.C11406SSd.A05(r8)
            if (r0 == 0) goto L_0x00c3
            if (r1 != r10) goto L_0x00c3
            java.util.Set r2 = r6.A06
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            java.lang.String r0 = r6.A03
            com.facebook.AccessToken r7 = X.SP4.A00(r3, r1, r0, r2)
            X.0lg r3 = r11.A04
            if (r3 == 0) goto L_0x00be
            java.lang.String r2 = r6.A01
            boolean r1 = r6.A02
            java.lang.String r0 = "web_auth_success"
            X.C9831Rht.A00(r3, r0, r2, r5, r1)
        L_0x00be:
            com.facebook.login.LoginClient$Result r1 = com.facebook.login.LoginClient$Result.A00(r7, r6)
            goto L_0x012a
        L_0x00c3:
            java.lang.String r10 = "User canceled log in."
            if (r9 == 0) goto L_0x00ea
            java.lang.String r0 = "access_denied"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x00d7
            java.lang.String r0 = "OAuthAccessDeniedException"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x00ea
        L_0x00d7:
            X.0lg r3 = r11.A04
            if (r3 == 0) goto L_0x00e5
            java.lang.String r2 = r6.A01
            boolean r1 = r6.A02
            java.lang.String r0 = "web_auth_cancel"
            X.C9831Rht.A00(r3, r0, r2, r5, r1)
        L_0x00e5:
            com.facebook.login.LoginClient$Result r1 = com.facebook.login.LoginClient$Result.A01(r6, r10)
            goto L_0x012a
        L_0x00ea:
            r0 = 4201(0x1069, float:5.887E-42)
            if (r1 == r0) goto L_0x00d7
            java.util.HashMap r5 = X.Dba.A0f(r2, r9)
            java.lang.String r0 = "errorCodeString"
            r5.put(r0, r7)
            java.lang.String r0 = "errorMessage"
            r5.put(r0, r8)
            X.0lg r3 = r11.A04
            if (r3 == 0) goto L_0x010a
            java.lang.String r2 = r6.A01
            boolean r1 = r6.A02
            java.lang.String r0 = "web_auth_error"
            X.C9831Rht.A00(r3, r0, r2, r5, r1)
        L_0x010a:
            com.facebook.login.LoginClient$Result r1 = com.facebook.login.LoginClient$Result.A02(r6, r9, r7, r8)
            goto L_0x012a
        L_0x010f:
            X.0lg r3 = r11.A04
            if (r3 == 0) goto L_0x011d
            java.lang.String r2 = r6.A01
            boolean r1 = r6.A02
            java.lang.String r0 = "web_auth_error"
            X.C9831Rht.A00(r3, r0, r2, r5, r1)
        L_0x011d:
            com.facebook.login.LoginClient$Result r1 = com.facebook.login.LoginClient$Result.A02(r6, r5, r5, r5)
            goto L_0x012a
        L_0x0122:
            com.facebook.login.LoginClient$Request r1 = r2.A01
            java.lang.String r0 = "Invalid state parameter"
            com.facebook.login.LoginClient$Result r1 = com.facebook.login.LoginClient$Result.A02(r1, r5, r0, r5)
        L_0x012a:
            X.SP4 r0 = r11.A02
            r0.A04(r1)
            return r4
        L_0x0130:
            X.0lg r7 = r11.A04
            if (r7 == 0) goto L_0x013f
            r4 = 0
            java.lang.String r3 = r6.A01
            boolean r1 = r6.A02
            java.lang.String r0 = "web_auth_cancel"
            X.C9831Rht.A00(r7, r0, r3, r4, r1)
        L_0x013f:
            com.facebook.login.LoginClient$Request r1 = r2.A01
            java.lang.String r0 = "User canceled log in."
            com.facebook.login.LoginClient$Result r1 = com.facebook.login.LoginClient$Result.A01(r1, r0)
            X.SP4 r0 = r11.A02
            r0.A04(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12132Snc.Ctj(android.content.Intent, int, int):boolean");
    }

    public final void FI6(LoginClient$Request loginClient$Request) {
        List<ResolveInfo> queryIntentServices;
        String str = this.A01;
        if (str.isEmpty()) {
            this.A02.A02();
            return;
        }
        0lg r5 = this.A04;
        if (r5 != null) {
            C9831Rht.A00(r5, "web_auth_attempted", loginClient$Request.A01, (HashMap) null, loginClient$Request.A02);
        }
        Bundle A0a = AnonymousClass7TE.A0a();
        Set set = loginClient$Request.A06;
        if (set.size() != 0) {
            A0a.putString("scope", TextUtils.join(",", set));
        }
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("0_auth_logger_id", loginClient$Request.A04);
        A1E.put("3_method", "custom_tab");
        A1E.put("7_challenge", this.A05);
        A0a.putString(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, JTQ.A0c(A1E));
        A0a.putString("cbt", String.valueOf(System.currentTimeMillis()));
        A0a.putString("redirect_uri", str);
        A0a.putString("app_id", loginClient$Request.A03);
        A0a.putString("e2e", SP4.A01());
        A0a.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        A0a.putString("return_scopes", "true");
        A0a.putString("sso", "chrome_custom_tab");
        if (loginClient$Request.A00 == C8894REl.PROMOTE_PRO2PRO) {
            A0a.putString("is_promote_auth", "true");
        }
        Collection collection = C10070Rm7.A01;
        C11406SSd.A00(A0a, String.format("m.%s", new Object[]{IGPixelRequestBuffer.URL_PREFIX}), 002.A0u("v2.3", "/", "dialog/", "oauth"));
        Fragment fragment = this.A03.A06;
        Intent A0A = C66580MXl.A0A(fragment.getActivity(), CustomTabMainActivity.class);
        A0A.putExtra("CustomTabMainActivity.extra_action", "oauth");
        A0A.putExtra("CustomTabMainActivity.extra_params", A0a);
        String str2 = this.A00;
        if (C11406SSd.A05(str2)) {
            Context context = AnonymousClass1KO.A00;
            Intent A0G = Pxe.A0G("android.support.customtabs.action.CustomTabsService");
            PackageManager packageManager = context.getPackageManager();
            str2 = null;
            if (packageManager != null && (queryIntentServices = packageManager.queryIntentServices(A0G, 0)) != null) {
                HashSet A0s = Pxf.A0s(C9933Rjm.A00);
                Iterator<ResolveInfo> it = queryIntentServices.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ServiceInfo serviceInfo = it.next().serviceInfo;
                        if (serviceInfo != null && A0s.contains(serviceInfo.packageName)) {
                            str2 = serviceInfo.packageName;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            this.A00 = str2;
        }
        A0A.putExtra("CustomTabMainActivity.extra_chromePackage", str2);
        Pxf.A0O().A0H(A0A, fragment, 1);
    }

    public C12132Snc(SP4 sp4, String str) {
        AnonymousClass0wW r0 = null;
        this.A03 = sp4;
        this.A02 = sp4;
        this.A01 = 002.A0R("fbconnect://cct.", AnonymousClass1KO.A00.getPackageName());
        this.A05 = str;
        Bundle bundle = sp4.A06.mArguments;
        this.A04 = bundle != null ? 09i.A0A.A04(bundle) : r0;
    }
}
