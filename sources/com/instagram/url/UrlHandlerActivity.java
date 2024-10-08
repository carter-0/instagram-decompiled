package com.instagram.url;

import X.0Tu;
import X.0bY;
import X.0hq;
import X.182;
import X.1AW;
import X.1Q7;
import X.AnonymousClass000;
import X.AnonymousClass06S;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.AnonymousClass2LF;
import X.AnonymousClass3GL;
import X.C2366634p;
import X.C238833Dp;
import X.C340057kd;
import X.C71172bH;
import X.C71342cb;
import X.Dc1;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;

public class UrlHandlerActivity extends BaseFragmentActivity implements AnonymousClass0iw, CallerContextable {
    public static final 0bY A05 = new 1Q7("IgSecureUriParser").A00;
    public C2366634p A00;
    public AnonymousClass0wW A01;
    public AnonymousClass2LF A02;
    public Dc1 A03;
    public boolean A04;

    public final void A0j(Bundle bundle) {
    }

    public final String getModuleName() {
        return "url_handler";
    }

    private void A00(Intent intent) {
        Intent intent2 = (Intent) intent.getParcelableExtra(AnonymousClass000.A00(2249));
        if (!1AW.A06(0Tu.A05, 2324142851249801709L) || intent2 == null) {
            A01(intent);
        } else {
            A01(intent2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: android.content.Context} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x018b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01(android.content.Intent r20) {
        /*
            r19 = this;
            r7 = r19
            X.Dc1 r1 = r7.A03
            X.Dc0 r0 = r1.A00
            X.34p r0 = r0.A00
            r15 = 0
            r0.A08(r15)
            X.Dc0 r0 = r1.A00
            X.34p r0 = r0.A01
            r0.A08(r15)
            r8 = r20
            java.lang.String r1 = r8.getDataString()
            r0 = 3
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r12 = 0
            boolean r0 = r8.getBooleanExtra(r0, r12)
            r7.A04 = r0
            X.0wW r0 = r7.A01
            X.C71332ca.A00(r7, r8, r7, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = "al_applink_data"
            android.os.Bundle r1 = r8.getBundleExtra(r0)
            if (r1 == 0) goto L_0x005b
            java.lang.String r0 = "extras"
            android.os.Bundle r1 = r1.getBundle(r0)
            if (r1 == 0) goto L_0x005b
            java.lang.String r0 = "com.facebook.orca.extra.METADATA"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L_0x005b
            X.16F r0 = X.16P.A00(r0)     // Catch:{ IOException -> 0x0054 }
            X.CtI r0 = X.C45130Cqo.parseFromJson(r0)     // Catch:{ IOException -> 0x0054 }
            if (r0 == 0) goto L_0x005b
            goto L_0x0183
        L_0x0054:
            java.lang.String r1 = "launch_from_messenger"
            java.lang.String r0 = "Can't parse metadata."
            X.0wb.A03(r1, r0)
        L_0x005b:
            r1 = 0
            goto L_0x0185
        L_0x005e:
            java.lang.String r2 = "(?i)instagr\\.am"
            r0 = 1468(0x5bc, float:2.057E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r11 = r1.replaceAll(r2, r0)
            java.lang.String r2 = "url_handler"
            X.0wW r0 = r7.A01
            android.os.Bundle r9 = X.FGU.A00(r0, r11, r2)
            r0 = 227(0xe3, float:3.18E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r3 = r8.getBooleanExtra(r0, r12)
            X.FFW r0 = X.C49851F9q.A00
            boolean r1 = X.FFW.A02(r11)
            X.0wW r0 = r7.A01
            boolean r0 = X.FFW.A01(r0, r3, r1)
            r6 = r0 ^ 1
            r16 = 86400000(0x5265c00, float:7.82218E-36)
            r17 = 0
            r13 = r7
            r14 = r8
            X.0RJ r0 = X.C59950cE.A01(r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x00a0
            r0 = 33
            java.lang.String r0 = X.Pxd.A00(r0)
            r9.putParcelable(r0, r8)
        L_0x00a0:
            r0 = 4342(0x10f6, float:6.084E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = r8.getStringExtra(r0)
            java.lang.String r0 = "EXTRA_SOURCE_REFERRER"
            r9.putString(r0, r1)
            X.0wW r10 = r7.A01
            X.34S r3 = X.FGU.A01(r7, r8, r9, r10, r11, r12)
            java.lang.Object r0 = r3.A00
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x010a
            X.0bY r1 = A05
            r0 = 1
            android.net.Uri r5 = X.0cp.A01(r1, r11)
            X.Dc1 r4 = r7.A03
            java.lang.Object r3 = r3.A01
            android.content.Intent r3 = (android.content.Intent) r3
            X.0qQ.A0B(r3, r0)
            android.content.ComponentName r0 = r3.getComponent()
            if (r0 == 0) goto L_0x00e2
            java.lang.String r2 = r0.getClassName()
            if (r2 == 0) goto L_0x00e2
            java.lang.String r1 = "activity_class_name"
            X.Dc0 r0 = r4.A00
            r0.A0J(r1, r2)
        L_0x00e2:
            android.content.ComponentName r0 = r3.getComponent()
            if (r0 == 0) goto L_0x0108
            java.lang.String r1 = r0.getClassName()
        L_0x00ec:
            java.lang.String r0 = "dfa"
            X.Dc1.A00(r3, r5, r4, r0, r1)
            if (r6 == 0) goto L_0x00f8
            X.0wW r0 = r7.A01
            X.C49851F9q.A00(r3, r7, r0, r11)
        L_0x00f8:
            X.34p r0 = r7.A00
            r0.A05()
            r7.finish()
            X.2LF r0 = r7.A02
            if (r0 == 0) goto L_0x01a6
            r0.A00(r8, r3)
            return
        L_0x0108:
            r1 = 0
            goto L_0x00ec
        L_0x010a:
            X.14E r0 = X.14D.A04
            X.14D r1 = r0.A00()
            if (r1 == 0) goto L_0x0179
            X.0wW r0 = r7.A01
            X.34S r1 = r1.A00(r0, r11)
            if (r1 == 0) goto L_0x0179
            if (r6 == 0) goto L_0x0121
            X.0wW r0 = r7.A01
            X.C49851F9q.A00(r8, r7, r0, r11)
        L_0x0121:
            java.lang.Object r5 = r1.A00
            X.G7o r5 = (X.C51920G7o) r5
            java.lang.Object r0 = r1.A01
            android.os.Bundle r0 = (android.os.Bundle) r0
            r9.putAll(r0)
            boolean r0 = r5.EHn()
            if (r0 != 0) goto L_0x014a
            r0 = 2131435209(0x7f0b1ec9, float:1.8492254E38)
            android.view.View r2 = r7.findViewById(r0)
            if (r2 == 0) goto L_0x014a
            r0 = 2130970269(0x7f04069d, float:1.7549243E38)
            int r1 = X.2Yu.A0F(r7, r0)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r2.setBackground(r0)
        L_0x014a:
            X.0wW r0 = r7.A01
            r5.CI1(r9, r7, r0)
            X.0bY r0 = A05
            android.net.Uri r4 = X.0cp.A01(r0, r11)
            X.Dc1 r3 = r7.A03
            java.lang.Class r0 = r5.getClass()
            java.lang.String r2 = X.0Jf.A00(r0)
            r0 = 2
            X.0qQ.A0B(r2, r0)
            java.lang.String r1 = "legacy_handler_class_name"
            X.Dc0 r0 = r3.A00
            r0.A0J(r1, r2)
            r0 = 1547(0x60b, float:2.168E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.Dc1.A00(r8, r4, r3, r0, r2)
            X.34p r0 = r7.A00
            r0.A05()
            return
        L_0x0179:
            java.lang.String r0 = "unable to handle url:"
            java.lang.String r1 = X.002.A0R(r0, r11)
            X.0wb.A03(r2, r1)
            goto L_0x0192
        L_0x0183:
            java.lang.String r1 = r0.A00
        L_0x0185:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x005e
            java.lang.String r1 = "Intent missing data url"
            java.lang.Class<com.instagram.url.UrlHandlerActivity> r0 = com.instagram.url.UrlHandlerActivity.class
            X.0KC.A03(r0, r1)
        L_0x0192:
            X.Dc1 r0 = r7.A03
            X.0qQ.A0B(r1, r12)
            X.Dc0 r0 = r0.A00
            X.34p r0 = r0.A01
            r0.A07(r1)
            X.34p r0 = r7.A00
            r0.A01()
            r7.finish()
        L_0x01a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.url.UrlHandlerActivity.A01(android.content.Intent):void");
    }

    public final C340057kd getGnvGestureHandler() {
        AnonymousClass0wW r3 = this.A01;
        if (r3 == null || !182.A06(0Tu.A05, r3, 36311646388355759L) || !AnonymousClass3GL.A02(this.A01)) {
            return null;
        }
        C340057kd A002 = C340057kd.A00(r3);
        C238833Dp A003 = C238833Dp.A00(r3);
        A002.A03(A003);
        A002.A02(A003);
        return C340057kd.A00(r3);
    }

    public final AnonymousClass0wW getSession() {
        return this.A01;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.url.UrlHandlerActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity] */
    public final void onBackPressed() {
        FragmentActivity A002;
        Fragment A0P;
        boolean z = true;
        if (getSupportFragmentManager().A0M() < 1 && this.A04) {
            z = false;
        }
        if (!(!Boolean.valueOf(182.A06(0Tu.A05, this.A01, 36323045229406999L)).booleanValue() || (A002 = C71172bH.A00()) == null || (A0P = A002.getSupportFragmentManager().A0P(R.id.layout_container_main)) == null)) {
            0hq childFragmentManager = A0P.getChildFragmentManager();
            if (AnonymousClass06S.A01(childFragmentManager) && childFragmentManager.A0M() > 0) {
                childFragmentManager.A0d(childFragmentManager.A0T(0).A00);
            }
        }
        if (z) {
            super.onBackPressed();
            return;
        }
        C71342cb.A00(this.A01).A0A(this, "up");
        finish();
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, java.lang.Object, com.instagram.url.UrlHandlerActivity, android.app.Activity] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0082, code lost:
        if (r1 == false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008f, code lost:
        if (r0.getString("autologin") == null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009f, code lost:
        if (r0.getString("fresh_sign_in") == null) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            r0 = 2087277595(0x7c69541b, float:4.846044E36)
            int r5 = X.AnonymousClass0fD.A00(r0)
            android.os.Bundle r7 = X.C66588MXu.A00(r10)
            X.08y r0 = X.09i.A0A
            X.0wW r0 = r0.A05(r9)
            r9.A01 = r0
            super.onCreate(r7)
            X.0wW r0 = r9.A01
            X.Dc1 r0 = X.GAH.A00(r0)
            r9.A03 = r0
            X.2LA r1 = X.AnonymousClass2LA.A02
            monitor-enter(r1)
            X.2LF r0 = X.AnonymousClass2LA.A01     // Catch:{ all -> 0x00f9 }
            monitor-exit(r1)
            if (r0 != 0) goto L_0x00f3
            r0 = 0
        L_0x0027:
            r9.A02 = r0
            X.Dc1 r0 = r9.A03
            java.lang.String r1 = "url_handler_activity"
            X.Dc0 r0 = r0.A00
            X.34p r1 = r0.A02(r1)
            r9.A00 = r1
            r0 = 0
            r1.A08(r0)
            X.0wX r0 = X.C61170le.A00
            X.18g r2 = X.C638918c.A01(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0j
            android.content.Intent r0 = r9.getIntent()
            r2.A0K(r0, r1)
            X.0wW r1 = r9.A01
            boolean r0 = r1 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x005b
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.0rJ r1 = X.0rL.A00(r1)
            android.content.Context r0 = r9.getApplicationContext()
            r1.A01(r0)
        L_0x005b:
            android.content.Intent r8 = r9.getIntent()
            r0 = 0
            X.0qQ.A0B(r8, r0)
            java.lang.String r1 = r8.getDataString()
            java.lang.String r4 = "fresh_sign_in"
            java.lang.String r3 = "autologin"
            r6 = 1
            if (r1 == 0) goto L_0x00f1
            X.0bY r0 = X.FHB.A00
            android.net.Uri r0 = X.0cp.A01(r0, r1)
            if (r0 == 0) goto L_0x00e0
            java.util.Set r0 = r0.getQueryParameterNames()
            boolean r1 = r0.contains(r3)
            boolean r2 = r0.contains(r4)
            if (r1 != 0) goto L_0x0092
        L_0x0084:
            android.os.Bundle r0 = r8.getExtras()
            if (r0 == 0) goto L_0x0091
            java.lang.String r0 = r0.getString(r3)
            r1 = 1
            if (r0 != 0) goto L_0x0092
        L_0x0091:
            r1 = 0
        L_0x0092:
            if (r2 != 0) goto L_0x00a2
            android.os.Bundle r0 = r8.getExtras()
            if (r0 == 0) goto L_0x00a1
            java.lang.String r0 = r0.getString(r4)
            r2 = 1
            if (r0 != 0) goto L_0x00a2
        L_0x00a1:
            r2 = 0
        L_0x00a2:
            if (r1 == 0) goto L_0x00e0
            if (r2 == 0) goto L_0x00e0
            if (r7 != 0) goto L_0x00e0
            X.0wW r0 = r9.A01
            boolean r0 = r0 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x00e0
            X.6ap r4 = new X.6ap
            r4.<init>()
            android.content.res.Resources r3 = r9.getResources()
            r2 = 2131965553(0x7f133671, float:1.956792E38)
            X.0wW r1 = r9.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r0.A01(r1)
            java.lang.String r0 = r0.getUsername()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r3.getString(r2, r0)
            r4.A0D = r0
            X.Dc2 r2 = r4.A00()
            X.1xC r1 = X.1xC.A01
            X.3GP r0 = new X.3GP
            r0.<init>(r2)
            r1.A00(r0)
        L_0x00e0:
            android.content.Intent r0 = r9.getIntent()
            r9.A00(r0)
            X.C2594141p.A00(r9, r6)
            r0 = 873011247(0x3409182f, float:1.2767917E-7)
            X.AnonymousClass0fD.A07(r0, r5)
            return
        L_0x00f1:
            r2 = 0
            goto L_0x0084
        L_0x00f3:
            monitor-enter(r1)
            X.2LF r0 = X.AnonymousClass2LA.A01     // Catch:{ all -> 0x00f9 }
            monitor-exit(r1)
            goto L_0x0027
        L_0x00f9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.url.UrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final void onNewIntent(Intent intent) {
        UrlHandlerActivity.super.onNewIntent(intent);
        A00(intent);
    }

    public final void onPause() {
        int A002 = AnonymousClass0fD.A00(2014607849);
        super.onPause();
        AnonymousClass0fD.A07(1720025843, A002);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.url.UrlHandlerActivity, android.app.Activity] */
    public final void onRestart() {
        int A002 = AnonymousClass0fD.A00(-980644910);
        UrlHandlerActivity.super.onRestart();
        AnonymousClass0fD.A07(-431990365, A002);
    }

    public final void onResume() {
        int A002 = AnonymousClass0fD.A00(-674887196);
        super.onResume();
        AnonymousClass0fD.A07(-704226386, A002);
    }
}
