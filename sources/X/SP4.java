package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.Date;
import java.util.EnumSet;
import org.json.JSONException;
import org.json.JSONObject;

public final class SP4 {
    public int A00;
    public LoginClient$Request A01;
    public C7413QBx A02;
    public String A03;
    public C13710TfX[] A04;
    public 0lg A05;
    public final Fragment A06;
    public final String A07;

    public final void A03(LoginClient$Result loginClient$Result) {
        AccessToken accessToken;
        this.A01 = null;
        C7413QBx qBx = this.A02;
        if (qBx != null) {
            LoginClient$Result loginClient$Result2 = loginClient$Result;
            Integer num = loginClient$Result2.A02;
            if (num == AnonymousClass05K.A00 && (accessToken = loginClient$Result2.A00) != null) {
                LoginClient$Request loginClient$Request = qBx.A00;
                if (loginClient$Request == null || loginClient$Request.A00 != C8894REl.PROMOTE_PRO2PRO) {
                    SQM A002 = SQM.A00(qBx.A01);
                    if (!(A002 instanceof QHW)) {
                        QHX qhx = (QHX) A002;
                        AccessToken accessToken2 = qhx.A00;
                        qhx.A00 = accessToken;
                        qhx.A01 = new Date(0);
                        C10178Rnt rnt = qhx.A03;
                        try {
                            JSONObject A012 = S88.A01(accessToken);
                            String str = rnt.A00;
                            String obj = A012.toString();
                            0qQ.A0B(str, 0);
                            0xY AR4 = 1Al.A00(1An.A1J, str).AR4();
                            AR4.E5g("com.facebook.AccessTokenManager.CachedAccessToken", obj);
                            AR4.apply();
                        } catch (JSONException unused) {
                        }
                        if (accessToken2 == null || !accessToken2.equals(accessToken)) {
                            Intent A0G = Pxe.A0G("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
                            A0G.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken2);
                            A0G.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken);
                            qhx.A02.A02(A0G);
                        }
                    }
                } else {
                    String str2 = qBx.A01;
                    0qQ.A0B(str2, 0);
                    long currentTimeMillis = System.currentTimeMillis() + C10027RlM.A00;
                    Date date = AccessToken.A0A;
                    AccessToken accessToken3 = new AccessToken(accessToken.A00, accessToken.A02, accessToken.A01, accessToken.A03, accessToken.A07, accessToken.A06, new Date(currentTimeMillis), accessToken.A05);
                    UserSession A0U = DbS.A0U(DbY.A0B("IgSessionManager.SESSION_TOKEN_KEY", str2));
                    0qQ.A0B(A0U, 0);
                    try {
                        1Av A003 = 1Au.A00(A0U);
                        String obj2 = S88.A01(accessToken3).toString();
                        0qQ.A0B(obj2, 0);
                        0xY AR42 = A003.A01.AR4();
                        AR42.E5g("promote_pro2pro_client_token", obj2);
                        AR42.apply();
                    } catch (JSONException unused2) {
                    }
                }
            }
            int i = -1;
            if (num == AnonymousClass05K.A01) {
                i = 0;
            }
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putParcelable(AnonymousClass000.A00(554), loginClient$Result2);
            Intent A09 = DbS.A09();
            A09.putExtras(A0a);
            qBx.requireActivity().setResult(i, A09);
            DbT.A1K(qBx);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.AccessToken A00(android.os.Bundle r14, java.lang.Integer r15, java.lang.String r16, java.util.Collection r17) {
        /*
            r11 = r17
            java.util.Date r3 = new java.util.Date
            r3.<init>()
            java.util.Date r0 = com.facebook.AccessToken.A0A
            r6 = 0
            java.lang.String r0 = "expires_in"
            java.lang.Object r1 = r14.get(r0)
            boolean r0 = r1 instanceof java.lang.Long
            if (r0 == 0) goto L_0x0083
            long r4 = X.AnonymousClass7TE.A0R(r1)
        L_0x0018:
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x007a
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0023:
            java.util.Date r13 = new java.util.Date
            r13.<init>(r0)
        L_0x0028:
            java.lang.String r0 = "access_token"
            java.lang.String r8 = r14.getString(r0)
            java.lang.String r0 = "granted_scopes"
            java.lang.String r1 = r14.getString(r0)
            boolean r0 = X.C11406SSd.A05(r1)
            java.lang.String r2 = ","
            if (r0 != 0) goto L_0x0044
            java.lang.String[] r0 = r1.split(r2)
            java.util.ArrayList r11 = X.Pxf.A0q(r0)
        L_0x0044:
            java.lang.String r0 = "denied_scopes"
            java.lang.String r1 = r14.getString(r0)
            boolean r0 = X.C11406SSd.A05(r1)
            if (r0 != 0) goto L_0x0078
            java.lang.String[] r0 = r1.split(r2)
            java.util.ArrayList r12 = X.Pxf.A0q(r0)
        L_0x0058:
            boolean r0 = X.C11406SSd.A05(r8)
            if (r0 != 0) goto L_0x00c6
            java.lang.String r0 = "userid"
            java.lang.String r10 = r14.getString(r0)
            if (r10 != 0) goto L_0x00b9
            java.lang.String r0 = "signed_request"
            java.lang.String r1 = r14.getString(r0)
            r10 = 0
            if (r1 == 0) goto L_0x00b9
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00b9
            goto L_0x0090
        L_0x0078:
            r12 = r6
            goto L_0x0058
        L_0x007a:
            long r0 = r3.getTime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r2
            long r0 = r0 + r4
            goto L_0x0023
        L_0x0083:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x008e
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x008e }
            long r4 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x008e }
            goto L_0x0018
        L_0x008e:
            r13 = r6
            goto L_0x0028
        L_0x0090:
            java.lang.String r0 = "\\."
            java.lang.String[] r2 = r1.split(r0)     // Catch:{ Exception -> 0x00b5 }
            int r1 = r2.length     // Catch:{ Exception -> 0x00b5 }
            r0 = 2
            if (r1 != r0) goto L_0x00b9
            r0 = 1
            r1 = r2[r0]     // Catch:{ Exception -> 0x00b5 }
            r0 = 0
            byte[] r2 = android.util.Base64.decode(r1, r0)     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r1 = "UTF-8"
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x00b5 }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x00b5 }
            org.json.JSONObject r1 = X.C66580MXl.A17(r0)     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r0 = "user_id"
            java.lang.String r10 = r1.getString(r0)     // Catch:{ Exception -> 0x00b5 }
            goto L_0x00b9
        L_0x00b5:
            r0 = move-exception
            r0.toString()
        L_0x00b9:
            java.util.Date r14 = new java.util.Date
            r14.<init>()
            com.facebook.AccessToken r6 = new com.facebook.AccessToken
            r7 = r15
            r9 = r16
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x00c6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SP4.A00(android.os.Bundle, java.lang.Integer, java.lang.String, java.util.Collection):com.facebook.AccessToken");
    }

    public final void A02() {
        C13710TfX tfX;
        int i = this.A00 + 1;
        this.A00 = i;
        C13710TfX[] tfXArr = this.A04;
        if (i >= tfXArr.length || (tfX = tfXArr[i]) == null) {
            A03(LoginClient$Result.A02(this.A01, "Login attempt failed.", (String) null, (String) null));
        } else {
            tfX.FI6(this.A01);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(com.facebook.login.LoginClient$Result r7) {
        /*
            r6 = this;
            com.facebook.AccessToken r4 = r7.A00
            if (r4 == 0) goto L_0x0040
            java.lang.String r2 = r6.A03
            X.SQM r1 = X.SQM.A00(r2)
            boolean r0 = r1 instanceof X.QHW
            if (r0 != 0) goto L_0x0040
            X.QHX r1 = (X.QHX) r1
            com.facebook.AccessToken r0 = r1.A00
            if (r0 == 0) goto L_0x0040
            X.SQM r1 = X.SQM.A00(r2)
            boolean r0 = r1 instanceof X.QHW
            if (r0 != 0) goto L_0x0033
            X.QHX r1 = (X.QHX) r1
            com.facebook.AccessToken r0 = r1.A00
            if (r0 == 0) goto L_0x0033
            java.lang.String r1 = r0.A03     // Catch:{ Exception -> 0x0044 }
            java.lang.String r0 = r4.A03     // Catch:{ Exception -> 0x0044 }
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x0044 }
            if (r0 == 0) goto L_0x0033
            com.facebook.login.LoginClient$Request r0 = r6.A01     // Catch:{ Exception -> 0x0044 }
            com.facebook.login.LoginClient$Result r0 = com.facebook.login.LoginClient$Result.A00(r4, r0)     // Catch:{ Exception -> 0x0044 }
            goto L_0x003c
        L_0x0033:
            com.facebook.login.LoginClient$Request r2 = r6.A01     // Catch:{ Exception -> 0x0044 }
            java.lang.String r1 = "User logged in as different Facebook user."
            r0 = 0
            com.facebook.login.LoginClient$Result r0 = com.facebook.login.LoginClient$Result.A02(r2, r1, r0, r0)     // Catch:{ Exception -> 0x0044 }
        L_0x003c:
            r6.A03(r0)     // Catch:{ Exception -> 0x0044 }
            goto L_0x0055
        L_0x0040:
            r6.A03(r7)
            goto L_0x0055
        L_0x0044:
            r0 = move-exception
            com.facebook.login.LoginClient$Request r3 = r6.A01
            java.lang.String r2 = r0.getMessage()
            java.lang.String r1 = "Caught exception"
            r0 = 0
            com.facebook.login.LoginClient$Result r0 = com.facebook.login.LoginClient$Result.A02(r3, r1, r2, r0)
            r6.A03(r0)
        L_0x0055:
            r5 = 0
            if (r4 == 0) goto L_0x006c
            java.lang.Integer r1 = r4.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x006d
            X.0lg r3 = r6.A05
            com.facebook.login.LoginClient$Request r0 = r7.A01
            java.lang.String r2 = r0.A01
            boolean r1 = r0.A02
            java.lang.String r0 = "native_auth_verification_success"
        L_0x0069:
            X.C9831Rht.A00(r3, r0, r2, r5, r1)
        L_0x006c:
            return
        L_0x006d:
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r1 != r0) goto L_0x006c
            X.0lg r3 = r6.A05
            com.facebook.login.LoginClient$Request r0 = r7.A01
            java.lang.String r2 = r0.A01
            boolean r1 = r0.A02
            java.lang.String r0 = "web_auth_verification_success"
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SP4.A04(com.facebook.login.LoginClient$Result):void");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, X.Snd, X.TfX] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.TfX, X.Snb] */
    /* JADX WARNING: type inference failed for: r0v17, types: [java.lang.Object, X.Sne, X.TfX] */
    public SP4(Fragment fragment, LoginClient$Request loginClient$Request, String str, int i) {
        C13710TfX[] tfXArr;
        this.A06 = fragment;
        Bundle bundle = fragment.mArguments;
        08y r2 = 09i.A0A;
        AnonymousClass0wW A042 = r2.A04(bundle);
        this.A05 = A042;
        this.A03 = loginClient$Request.A05;
        this.A02 = (C7413QBx) fragment;
        this.A01 = loginClient$Request;
        this.A00 = i;
        this.A07 = str;
        C8894REl rEl = loginClient$Request.A00;
        CallerContext callerContext = C46508DgB.A00;
        0qQ.A0B(A042, 0);
        if (!(A042 instanceof UserSession) || Collections.unmodifiableSet(EnumSet.of(C8894REl.LOG_IN, new C8894REl[]{C8894REl.SIGN_UP, C8894REl.NUX_ADD_PROFILE_PICTURE_SCREEN, C8894REl.NUX_DISCOVER_PEOPLE_SCREEN, C8894REl.NUX_FIND_FRIENDS, C8894REl.NUX_FIND_FRIENDS_DIALOG, C8894REl.PROMOTE_PRO2PRO, C8894REl.ACCOUNT_RECOVERY})).contains(rEl)) {
            ? obj = new Object();
            obj.A01 = this;
            obj.A00 = this;
            obj.A02 = A042;
            C12132Snc snc = new C12132Snc(this, this.A07);
            String str2 = this.A03;
            ? obj2 = new Object();
            obj2.A01 = this;
            obj2.A04 = str2;
            obj2.A00 = this;
            obj2.A02 = r2.A04(this.A06.mArguments);
            tfXArr = new C13710TfX[]{obj, snc, obj2};
        } else {
            ? obj3 = new Object();
            obj3.A01 = this;
            obj3.A00 = this;
            obj3.A02 = A042;
            tfXArr = new C13710TfX[]{obj3};
        }
        this.A04 = tfXArr;
    }

    public static String A01() {
        JSONObject A11 = DbS.A11();
        try {
            A11.put("init", System.currentTimeMillis());
        } catch (JSONException e) {
            e.toString();
        }
        return A11.toString();
    }
}
