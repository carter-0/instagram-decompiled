package com.instagram.urlhandlers.passwordreset;

import X.AnonymousClass08W;
import X.AnonymousClass0wW;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public class PasswordResetExternalUrlHandlerActivity extends BaseFragmentActivity implements AnonymousClass08W {
    public AnonymousClass0wW A00;
    public String A01;
    public String A02;

    public final void A0j(Bundle bundle) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0343, code lost:
        if (X.AnonymousClass7TE.A19(r6, 1).equals("password_reset") != false) goto L_0x0345;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x02c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r24) {
        /*
            r23 = this;
            r0 = -1478099048(0xffffffffa7e5ff98, float:-6.3837383E-15)
            int r14 = X.AnonymousClass0fD.A00(r0)
            r8 = r23
            android.os.Bundle r12 = X.DbX.A0A(r8)
            if (r12 != 0) goto L_0x0019
            r8.finish()
            r0 = -628984745(0xffffffffda827457, float:-1.8359832E16)
        L_0x0015:
            X.AnonymousClass0fD.A07(r0, r14)
            return
        L_0x0019:
            X.08y r5 = X.09i.A0A
            X.0wW r0 = r5.A04(r12)
            r8.A00 = r0
            r0 = r24
            super.onCreate(r0)
            java.lang.String r10 = "original_url"
            java.lang.String r0 = r12.getString(r10)
            if (r0 != 0) goto L_0x0035
            r8.finish()
            r0 = -1516951486(0xffffffffa5952842, float:-2.587466E-16)
            goto L_0x0015
        L_0x0035:
            r13 = 0
            android.net.Uri r1 = X.0cp.A03(r0)
            java.lang.String r2 = r1.getScheme()
            java.lang.String r0 = "http"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L_0x02c7
            java.lang.String r0 = "https"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L_0x02c7
            java.lang.String r0 = "instagram"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0388
            java.util.Set r3 = r1.getQueryParameterNames()
            java.lang.String r2 = "u"
            boolean r0 = r3.contains(r2)
            if (r0 == 0) goto L_0x0388
            java.lang.String r6 = "t"
            boolean r0 = r3.contains(r6)
            if (r0 == 0) goto L_0x0388
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            java.lang.String r2 = r1.getQueryParameter(r2)
            java.util.regex.Pattern r0 = X.0mp.A01
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r11 = 36
            long r2 = java.lang.Long.parseLong(r2, r11)
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "argument_user_id"
            r4.putString(r3, r0)
            java.lang.String r2 = r1.getQueryParameter(r6)
        L_0x008b:
            java.lang.String r9 = "argument_reset_token"
            r4.putString(r9, r2)
        L_0x0090:
            r12.putAll(r4)
            X.02m r0 = X.02m.A0p
            r4 = 725091390(0x2b38043e, float:6.537582E-13)
            r0.markerStart(r4)
            X.02m r2 = X.02m.A0p
            java.lang.String r1 = "flow"
            java.lang.String r0 = "prod"
            r2.markerAnnotate(r4, r1, r0)
            X.0wW r1 = r8.A00
            boolean r0 = r1 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x02c1
            r5.A03(r8)
            java.lang.String r0 = "IgSessionManager.LOGGED_OUT_TOKEN"
        L_0x00af:
            X.DbS.A1A(r12, r0)
            X.0aP r5 = r5.A02(r12)
            boolean r0 = X.FFT.A02(r5)
            if (r0 != 0) goto L_0x00ca
            r0 = 2131965890(0x7f1337c2, float:1.9568603E38)
            X.C59689JTv.A07(r8, r0)
            r8.finish()
        L_0x00c5:
            r0 = 1455705665(0x56c44e41, float:1.07920189E14)
            goto L_0x0015
        L_0x00ca:
            java.lang.String r4 = r12.getString(r3)
            java.lang.String r7 = r12.getString(r9)
            java.lang.String r6 = "afv_from_link"
            java.lang.String r3 = r12.getString(r6)
            java.lang.String r1 = r8.A01
            r2 = 1
            if (r1 == 0) goto L_0x014e
            java.lang.String r0 = "one_click_login_email"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0102
            java.lang.String r0 = "password_reset_sms"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0102
            java.lang.String r0 = "password_reset_email"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x014e
            X.0Tu r15 = X.0Tu.A06
            r0 = 2324144582121492309(0x2041052f00000f55, double:2.5388562398913706E-153)
            boolean r0 = X.1AW.A06(r15, r0)
            if (r0 != 0) goto L_0x014e
        L_0x0102:
            r16 = 1
        L_0x0104:
            X.0Tu r15 = X.0Tu.A05
            r0 = 18308981726391412(0x410bec00002c74, double:1.89649384465884E-307)
            boolean r0 = X.1AW.A06(r15, r0)
            if (r0 != 0) goto L_0x0117
            X.0wW r0 = r8.A00
            boolean r0 = r0 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L_0x01f2
        L_0x0117:
            boolean r0 = X.0mp.A0B(r4)
            if (r0 != 0) goto L_0x01f2
            boolean r0 = X.0mp.A0B(r7)
            if (r0 != 0) goto L_0x01f2
            if (r16 == 0) goto L_0x01f2
            X.0hq r1 = r8.getSupportFragmentManager()
            X.U7z r0 = new X.U7z
            r0.<init>(r8, r2)
            r1.A0r(r0, r2)
            r0 = 2
            X.0qQ.A0B(r4, r0)
            java.lang.String r12 = "token"
            r0 = 3
            X.0qQ.A0B(r7, r0)
            java.lang.String r9 = X.AnonymousClass7TF.A0c()
            X.0qQ.A07(r9)
            X.4fB r10 = X.C269474fB.A00
            X.4cw r2 = new X.4cw
            r2.<init>(r10)
            X.0tS r15 = X.DbT.A0h()
            goto L_0x0151
        L_0x014e:
            r16 = 0
            goto L_0x0104
        L_0x0151:
            long r0 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x01e0 }
            java.lang.String r1 = java.lang.Long.toString(r0, r11)     // Catch:{ NumberFormatException -> 0x01e0 }
            X.0qQ.A07(r1)     // Catch:{ NumberFormatException -> 0x01e0 }
            java.lang.String r0 = "uidb36"
            r2.A0E(r0, r1)     // Catch:{ NumberFormatException -> 0x01e0 }
            java.lang.Integer r17 = X.AnonymousClass05K.A00
            java.lang.String r18 = "ig_deeplink_controller_invoked_native_client"
            java.lang.String r19 = "link_recovery_start"
            r20 = r4
            r21 = r9
            r22 = r13
            r16 = r5
            X.C48759Eji.A00(r16, r17, r18, r19, r20, r21, r22)
            r2.A0E(r12, r7)
            java.lang.String r7 = X.0qv.A00(r8)
            r4 = 0
            r1 = 9
            r0 = 4
            java.lang.String r0 = X.Dbe.A02(r4, r1, r0)
            r2.A0E(r0, r7)
            X.0jh r1 = X.DbT.A0P(r5)
            X.19f r0 = X.19f.A1O
            java.lang.String r1 = r1.A02(r0)
            java.lang.String r0 = "family_device_id"
            r2.A0E(r0, r1)
            java.lang.String r1 = X.DbT.A0s(r8)
            java.lang.String r0 = "qe_device_id"
            r2.A0E(r0, r1)
            java.lang.String r1 = "offline_experiment_group"
            java.lang.String r0 = "caa_iteration_v3_perf_ig_4"
            r2.A0E(r1, r0)
            java.lang.String r0 = "event_request_id"
            r2.A0E(r0, r9)
            java.lang.String r1 = r15.A08()
            java.lang.String r0 = "waterfall_id"
            r2.A0E(r0, r1)
            r2.A0E(r6, r3)
            java.util.HashMap r4 = X.DbZ.A0r(r2, r10)
            X.FFt r1 = new X.FFt
            r1.<init>()
            X.Di7 r0 = X.C46627Di7.ENABLED
            r1.A02 = r0
            X.Di6 r0 = X.C46626Di6.FULL_SCREEN
            r1.A03 = r0
            X.DfZ r3 = r1.A03()
            X.F1e r0 = new X.F1e
            r0.<init>(r5)
            java.lang.String r2 = "com.bloks.www.caa.ar.ig.deeplink"
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = r0.A00
            r1.A0R = r2
            r0.A00(r3)
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            X.C46649DiU.A08(r8, r1, r2, r4, r0)
            goto L_0x00c5
        L_0x01e0:
            java.lang.Integer r16 = X.AnonymousClass05K.A00
            java.lang.String r17 = "ig_deeplink_controller_uid_conversion_error_client"
            java.lang.String r18 = "link_recovery_start"
            r19 = r4
            r20 = r9
            r21 = r13
            r15 = r5
            X.C48759Eji.A00(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x00c5
        L_0x01f2:
            java.lang.String r0 = r8.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x026e
            X.0hq r3 = r8.getSupportFragmentManager()
            r1 = 2
            X.U7z r0 = new X.U7z
            r0.<init>(r8, r1)
            r3.A0r(r0, r2)
            java.lang.String r11 = r8.A02
            java.lang.String r15 = r12.getString(r9)
            java.lang.String r12 = r8.A01
            android.content.Context r10 = r8.getApplicationContext()
            r7 = 0
            java.lang.String r9 = "uidb36"
            X.0qQ.A0B(r11, r2)
            java.lang.String r4 = "token"
            X.0qQ.A0B(r15, r1)
            java.lang.String r1 = "source"
            r0 = 3
            X.0qQ.A0B(r12, r0)
            r6 = 4
            X.0qQ.A0B(r10, r6)
            X.1NY r3 = X.AnonymousClass7TG.A0a(r5)
            java.lang.String r0 = "accounts/password_reset/"
            r3.A0A(r0)
            r3.A9m(r4, r15)
            r3.A9m(r9, r11)
            java.lang.String r1 = X.DbT.A0u(r10, r3, r1, r12)
            r0 = 9
            java.lang.String r0 = X.Dbe.A02(r7, r0, r6)
            X.DbY.A1J(r3, r0, r1)
            java.lang.Class<X.DwG> r1 = X.DwG.class
            java.lang.Class<X.F8a> r0 = X.C49813F8a.class
            X.1OC r4 = X.DbT.A0R(r13, r3, r1, r0, r7)
            X.0hq r3 = r8.getSupportFragmentManager()
            android.content.Context r1 = r8.getApplicationContext()
            X.0qQ.A0B(r3, r2)
            X.0qQ.A0B(r1, r6)
            X.EQQ r0 = new X.EQQ
            r0.<init>(r3)
            r0.A01 = r3
            r0.A02 = r8
            r0.A03 = r5
            r0.A00 = r1
            r4.A00 = r0
            r8.schedule(r4)
            goto L_0x00c5
        L_0x026e:
            X.E4d r4 = new X.E4d
            r4.<init>()
            java.lang.String r0 = r12.getString(r10)
            if (r0 == 0) goto L_0x028a
            java.lang.String r0 = r12.getString(r10)
            java.lang.String r1 = "fxcal"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x028a
            java.lang.String r0 = "flow_id"
            r12.putString(r0, r1)
        L_0x028a:
            r12.remove(r10)
            X.FEx r3 = X.C49922FEx.A00(r12)
            android.os.Bundle r2 = r3.A00
            X.EUp r0 = X.C48071EUp.A0B
            java.lang.String r1 = X.DbX.A0s(r0)
            java.lang.String r0 = "LINK"
            java.lang.String r0 = X.AnonymousClass7TF.A0j(r0)
            r2.putString(r1, r0)
            r3.A02()
            android.os.Bundle r0 = X.AnonymousClass7TE.A0a()
            r0.putAll(r2)
            r12.putAll(r0)
            r4.setArguments(r12)
            X.0s1 r1 = X.DbW.A0D(r8)
            r0 = 2131435209(0x7f0b1ec9, float:1.8492254E38)
            r1.A0A(r4, r0)
            r1.A00()
            goto L_0x00c5
        L_0x02c1:
            java.lang.String r0 = r1.getToken()
            goto L_0x00af
        L_0x02c7:
            java.util.List r6 = r1.getPathSegments()
            int r2 = r6.size()
            r0 = 4
            if (r2 != r0) goto L_0x0305
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "uidb36"
            java.lang.String r3 = r1.getQueryParameter(r0)
            java.lang.String r0 = "token"
            java.lang.String r2 = r1.getQueryParameter(r0)
            if (r3 == 0) goto L_0x0388
            if (r2 == 0) goto L_0x0388
            java.lang.String r0 = "s"
            java.lang.String r0 = r1.getQueryParameter(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0345
            java.util.regex.Pattern r0 = X.0mp.A01
            r11 = 36
            long r0 = java.lang.Long.parseLong(r3, r11)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "argument_user_id"
            r4.putString(r3, r0)
            goto L_0x008b
        L_0x0305:
            int r2 = r6.size()
            r0 = 6
            if (r2 != r0) goto L_0x0331
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            r0 = 4
            java.lang.String r1 = X.AnonymousClass7TE.A19(r6, r0)
            java.util.regex.Pattern r0 = X.0mp.A01
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r11 = 36
            long r0 = java.lang.Long.parseLong(r1, r11)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "argument_user_id"
            r4.putString(r3, r0)
            r0 = 5
            java.lang.String r2 = X.AnonymousClass7TE.A19(r6, r0)
            goto L_0x008b
        L_0x0331:
            int r2 = r6.size()
            r0 = 2
            if (r2 != r0) goto L_0x0388
            r0 = 1
            java.lang.String r2 = X.AnonymousClass7TE.A19(r6, r0)
            java.lang.String r0 = "password_reset"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0388
        L_0x0345:
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "uidb36"
            java.lang.String r0 = r1.getQueryParameter(r0)
            r8.A02 = r0
            java.lang.String r0 = "token"
            java.lang.String r6 = r1.getQueryParameter(r0)
            java.lang.String r0 = "afv"
            java.lang.String r2 = r1.getQueryParameter(r0)
            java.lang.String r0 = "s"
            java.lang.String r0 = r1.getQueryParameter(r0)
            r8.A01 = r0
            java.lang.String r1 = r8.A02
            java.util.regex.Pattern r0 = X.0mp.A01
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r11 = 36
            long r0 = java.lang.Long.parseLong(r1, r11)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "argument_user_id"
            r4.putString(r3, r0)
            java.lang.String r9 = "argument_reset_token"
            r4.putString(r9, r6)
            java.lang.String r0 = "afv_from_link"
            r4.putString(r0, r2)
            goto L_0x0090
        L_0x0388:
            r8.finish()
            r0 = -1576846137(0xffffffffa2033cc7, float:-1.7785986E-18)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.passwordreset.PasswordResetExternalUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
