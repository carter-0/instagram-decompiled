package com.instagram.urlhandlers.supportpersonalizedads;

import X.AnonymousClass06Q;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.C50128FQl;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class SupportPersonalizedAdsUrlHandlerActivity extends BaseFragmentActivity implements AnonymousClass0iw {
    public AnonymousClass0wW A00;
    public final AnonymousClass06Q A01 = new C50128FQl(this, 32);

    public final void A0j(Bundle bundle) {
    }

    public final String getModuleName() {
        return "spa_deep_link_handler_activity";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r25) {
        /*
            r24 = this;
            r0 = -1198351854(0xffffffffb8929a12, float:-6.99052E-5)
            int r4 = X.AnonymousClass0fD.A00(r0)
            r6 = r24
            r0 = r25
            super.onCreate(r0)
            android.content.Intent r2 = r6.getIntent()
            android.os.Bundle r0 = X.DbT.A0A(r2)
            if (r0 == 0) goto L_0x001e
            X.0wW r0 = X.DbT.A0W(r0)
            r6.A00 = r0
        L_0x001e:
            X.0wW r0 = r6.A00
            boolean r0 = r0 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L_0x0074
            android.content.Context r0 = r6.getApplicationContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131962090(0x7f1328ea, float:1.9560895E38)
            java.lang.String r22 = X.AnonymousClass7TF.A0d(r1, r0)
            java.lang.String r23 = "https://fb.com/deservetobefound"
            r8 = 0
            r10 = 0
            r15 = 1
            com.instagram.simplewebview.SimpleWebViewConfig r7 = new com.instagram.simplewebview.SimpleWebViewConfig
            r9 = r8
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r16 = r10
            r17 = r15
            r18 = r15
            r19 = r10
            r20 = r10
            r21 = r10
            r7.<init>((java.lang.String) r8, (java.lang.String) r9, (boolean) r10, (boolean) r11, (boolean) r12, (boolean) r13, (boolean) r14, (boolean) r15, (boolean) r16, (boolean) r17, (boolean) r18, (boolean) r19, (boolean) r20, (boolean) r21, (java.lang.String) r22, (java.lang.String) r23)
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG"
            r2.putParcelable(r0, r7)
            X.R8R r1 = new X.R8R
            r1.<init>()
            r1.setArguments(r2)
            X.0wW r0 = r6.A00
            X.6Yo r0 = X.DbS.A0M(r6, r0)
            r0.A0D = r10
            r0.A0B(r8, r1)
            r0.A04()
        L_0x006d:
            r0 = -1864294748(0xffffffff90e11ea4, float:-8.879406E-29)
            X.AnonymousClass0fD.A07(r0, r4)
            return
        L_0x0074:
            X.0hq r1 = r6.getSupportFragmentManager()
            X.06Q r0 = r6.A01
            r1.A0s(r0)
            java.lang.String r0 = "entryPoint"
            java.lang.String r5 = r2.getStringExtra(r0)
            X.0wW r1 = r6.A00
            X.0qQ.A0A(r1)
            r0 = 0
            X.2nI r3 = X.C229382nI.A01(r0, r6, r6, r1)
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "entry_point"
            r2.put(r0, r5)
            X.0wW r1 = r6.A00
            X.0qQ.A0A(r1)
            java.lang.String r0 = "com.instagram.ads.spa.components.hub.business_spa_hub.main_screen_action"
            X.8ey r1 = X.C359988do.A05(r1, r0, r2)
            r0 = 23
            X.E84.A00(r1, r3, r0)
            X.1ES.A03(r1)
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.supportpersonalizedads.SupportPersonalizedAdsUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
