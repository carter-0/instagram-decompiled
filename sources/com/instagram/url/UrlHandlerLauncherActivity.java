package com.instagram.url;

import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.C2366634p;
import X.DbS;
import X.Dc1;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class UrlHandlerLauncherActivity extends BaseFragmentActivity implements AnonymousClass0iw {
    public AnonymousClass0wW A00;
    public C2366634p A01;
    public Dc1 A02;

    public final void A0j(Bundle bundle) {
    }

    public final String getModuleName() {
        return "url_handler_launcher";
    }

    public final AnonymousClass0wW getSession() {
        AnonymousClass0wW r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.url.UrlHandlerLauncherActivity, java.lang.Object, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r21) {
        /*
            r20 = this;
            r0 = 719836187(0x2ae7d41b, float:4.118102E-13)
            int r5 = X.AnonymousClass0fD.A00(r0)
            android.os.Bundle r7 = X.C66588MXu.A00(r21)
            X.0wX r13 = X.C61170le.A00
            X.18g r2 = X.C638918c.A01(r13)
            java.lang.String r1 = "URL_LAUNCHER_ACTIVITY_ONCREATE_START"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r2.A02
            r2.A0O(r0, r1)
            r15 = r20
            X.0wW r0 = X.DbS.A0S(r15)
            r6 = 0
            X.0qQ.A0B(r0, r6)
            r15.A00 = r0
            X.0wW r0 = r15.getSession()
            X.Dc1 r0 = X.GAH.A00(r0)
            r15.A02 = r0
            java.lang.String r9 = "deeplinkPerfLogger"
            r4 = 0
            if (r0 == 0) goto L_0x0238
            java.lang.String r1 = "url_handler_launcher_activity"
            X.Dc0 r0 = r0.A00
            X.34p r0 = r0.A02(r1)
            r15.A01 = r0
            X.Dc1 r8 = r15.A02
            if (r8 == 0) goto L_0x0238
            X.Dc0 r1 = r8.A00
            if (r1 == 0) goto L_0x004c
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x004c
            r1.A06()
        L_0x004c:
            X.0lg r2 = r8.A03
            r1 = 29
            X.FyD r0 = new X.FyD
            r0.<init>(r8, r1)
            X.Dc0 r1 = new X.Dc0
            r1.<init>(r2, r0)
            r8.A00 = r1
            X.2cc r0 = X.C71342cb.A00(r2)
            r3 = 1
            r1.A0Q(r15, r0, r4, r3)
            X.Dc0 r0 = r8.A00
            r0.A0N()
            java.lang.String r1 = "version"
            X.Dc0 r0 = r8.A00
            r0.A0G(r1, r3)
            X.34p r0 = r15.A01
            java.lang.String r12 = "deeplinkPerfLoggerComponent"
            if (r0 == 0) goto L_0x023c
            r0.A08(r4)
            super.onCreate(r7)
            android.content.Intent r0 = r15.getIntent()
            android.net.Uri r7 = r0.getData()
            X.0wW r8 = r15.getSession()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318621412235586(0x81079800021942, double:3.031380652223348E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 != 0) goto L_0x0230
            if (r7 == 0) goto L_0x022d
            java.lang.String r0 = "short_redirect"
            java.lang.String r1 = r7.getQueryParameter(r0)
        L_0x009d:
            java.lang.String r0 = "1"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0230
            boolean r0 = X.0kR.A0F(r15, r7)
            if (r0 != 0) goto L_0x00cd
            boolean r0 = X.DbT.A1Z(r15)
            if (r0 == 0) goto L_0x00cd
            X.0wW r0 = r15.getSession()
            com.instagram.common.session.UserSession r16 = X.0Gl.A00(r0)
            java.lang.String r18 = r7.toString()
            X.2EG r17 = X.2EG.A1S
            X.SUL r14 = new X.SUL
            r19 = r6
            r14.<init>(r15, r16, r17, r18, r19)
            java.lang.String r0 = "url_launcher"
            r14.A0S = r0
            r14.A0A()
        L_0x00cd:
            r7 = 1
        L_0x00ce:
            java.lang.String r1 = "opened_uri_in_external_browser"
            X.Dc1 r0 = r15.A02
            if (r7 == 0) goto L_0x00ec
            if (r0 == 0) goto L_0x0238
            X.Dc0 r0 = r0.A00
            r0.A0K(r1, r3)
            X.34p r0 = r15.A01
            if (r0 == 0) goto L_0x023c
            r0.A05()
            r15.finish()
            r0 = -1749620988(0xffffffff97b6e704, float:-1.1819791E-24)
        L_0x00e8:
            X.AnonymousClass0fD.A07(r0, r5)
            return
        L_0x00ec:
            if (r0 == 0) goto L_0x0238
            X.Dc0 r0 = r0.A00
            r0.A0K(r1, r6)
            android.content.Intent r9 = r15.getIntent()
            X.0qQ.A0A(r9)
            X.0qQ.A0B(r9, r3)
            android.net.Uri r0 = r15.getReferrer()
            if (r0 == 0) goto L_0x01dc
            java.lang.String r0 = r0.toString()
        L_0x0107:
            java.lang.String r8 = "EXTRA_REFERRER"
            r9.putExtra(r8, r0)
            X.2ZQ r1 = X.C71172bH.A00()
            java.lang.String r10 = "CI_SKIP_CALLER_FROM_ACTIVITY"
            r0 = 2249(0x8c9, float:3.152E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r0)
            if (r1 != 0) goto L_0x01ae
            X.0wW r6 = r15.getSession()
            r0 = 36323045229275925(0x810b9e000d2b15, double:3.03417829193294E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x01ae
            android.content.Intent r6 = X.DbX.A08(r15)
            android.net.Uri r0 = r9.getData()
            r6.setData(r0)
            r6.putExtras(r9)
            X.0wW r11 = r15.getSession()
            r0 = 36330484111786644(0x81126200004294, double:3.038882671186694E-306)
            boolean r0 = X.182.A06(r2, r11, r0)
            if (r0 != 0) goto L_0x014c
            r6.putExtra(r7, r9)
            r6.putExtra(r10, r3)
        L_0x014c:
            java.lang.String r0 = "InstagramUrlLaunchConstants.EXTRA_SHOULD_BYPASS_STARTING_ARGUMENTS"
            r6.putExtra(r0, r3)
            android.net.Uri r0 = r9.getData()
            X.0wW r3 = r15.getSession()
            if (r0 == 0) goto L_0x0161
            java.lang.String r1 = r0.getPath()
            if (r1 != 0) goto L_0x0163
        L_0x0161:
            java.lang.String r1 = ""
        L_0x0163:
            int r0 = r1.length()
            if (r0 == 0) goto L_0x01ac
            java.lang.String r0 = "/mainfeed"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01ac
            r0 = 36323045229800221(0x810b9e00152b1d, double:3.034178292264507E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
        L_0x017a:
            java.lang.String r1 = "InstagramUrlLaunchConstants.EXTRA_SHOULD_DISABLE_AD_LOAD_ON_MAIN_ACTIVITY"
            r6.putExtra(r1, r0)
        L_0x017f:
            android.net.Uri r0 = r15.getReferrer()
            if (r0 == 0) goto L_0x019f
            java.lang.String r0 = r0.toString()
        L_0x0189:
            r6.putExtra(r8, r0)
            X.0wW r3 = r15.getSession()
            r0 = 36330484111786644(0x81126200004294, double:3.038882671186694E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x020b
            X.0b6 r7 = X.0kR.A00
            monitor-enter(r7)
            goto L_0x01ea
        L_0x019f:
            java.lang.String r0 = X.C49166EqX.A00(r6)
            if (r0 != 0) goto L_0x0189
            java.lang.String r0 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r0 = r6.getStringExtra(r0)
            goto L_0x0189
        L_0x01ac:
            r0 = 0
            goto L_0x017a
        L_0x01ae:
            android.content.Intent r6 = X.DbS.A09()
            java.lang.String r0 = "com.instagram.url.UrlHandlerActivity"
            r6.setClassName(r15, r0)
            android.net.Uri r0 = r9.getData()
            r6.setData(r0)
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r6.setFlags(r0)
            r6.putExtras(r9)
            X.0wW r11 = r15.getSession()
            r0 = 36330484111786644(0x81126200004294, double:3.038882671186694E-306)
            boolean r0 = X.182.A06(r2, r11, r0)
            if (r0 != 0) goto L_0x017f
            r6.putExtra(r7, r9)
            r6.putExtra(r10, r3)
            goto L_0x017f
        L_0x01dc:
            java.lang.String r0 = X.C49166EqX.A00(r9)
            if (r0 != 0) goto L_0x0107
            java.lang.String r0 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r0 = r9.getStringExtra(r0)
            goto L_0x0107
        L_0x01ea:
            X.0R7 r2 = r7.A01     // Catch:{ all -> 0x0235 }
            if (r2 != 0) goto L_0x020f
            X.0bW r3 = r7.A05     // Catch:{ all -> 0x0233 }
            if (r3 != 0) goto L_0x01ff
            X.0bJ r2 = X.0b6.A0N     // Catch:{ all -> 0x0233 }
            X.0WX r1 = X.0b6.A0M     // Catch:{ all -> 0x0233 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0233 }
            X.0bW r3 = new X.0bW     // Catch:{ all -> 0x0233 }
            r3.<init>(r2, r1, r0)     // Catch:{ all -> 0x0233 }
            r7.A05 = r3     // Catch:{ all -> 0x0233 }
        L_0x01ff:
            java.util.Set r1 = r7.A0I     // Catch:{ all -> 0x0235 }
            java.util.List r0 = r7.A0H     // Catch:{ all -> 0x0235 }
            X.0R7 r2 = new X.0R7     // Catch:{ all -> 0x0235 }
            r2.<init>(r3, r4, r0, r1)     // Catch:{ all -> 0x0235 }
            r7.A01 = r2     // Catch:{ all -> 0x0235 }
            goto L_0x020f
        L_0x020b:
            X.0kR.A0B(r15, r6)
            goto L_0x0213
        L_0x020f:
            monitor-exit(r7)
            r2.A0G(r15, r6)
        L_0x0213:
            r15.finish()
            X.34p r0 = r15.A01
            if (r0 == 0) goto L_0x023c
            r0.A05()
            X.18g r2 = X.C638918c.A01(r13)
            java.lang.String r1 = "URL_LAUNCHER_ACTIVITY_ONCREATE_END"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r2.A02
            r2.A0O(r0, r1)
            r0 = -886275685(0xffffffffcb2c819b, float:-1.1305371E7)
            goto L_0x00e8
        L_0x022d:
            r1 = 0
            goto L_0x009d
        L_0x0230:
            r7 = 0
            goto L_0x00ce
        L_0x0233:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0235 }
        L_0x0235:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0238:
            X.0qQ.A0F(r9)
            goto L_0x023f
        L_0x023c:
            X.0qQ.A0F(r12)
        L_0x023f:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.url.UrlHandlerLauncherActivity.onCreate(android.os.Bundle):void");
    }

    public final void onResume() {
        int A002 = AnonymousClass0fD.A00(368148440);
        super.onResume();
        AnonymousClass0fD.A07(-970635600, A002);
    }
}
