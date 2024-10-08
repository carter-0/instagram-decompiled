package com.instagram.urlhandlers.consentaction;

import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.DbT;
import android.os.Bundle;
import android.view.Window;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class ConsentActionUrlHandlerActivity extends BaseFragmentActivity implements AnonymousClass0iw {
    public UserSession A00;

    public final void A0j(Bundle bundle) {
    }

    public final String getModuleName() {
        return AnonymousClass000.A00(2918);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.instagram.urlhandlers.consentaction.ConsentActionUrlHandlerActivity, android.content.Context, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            r0 = 777913492(0x2e5e0494, float:5.0481022E-11)
            int r3 = X.AnonymousClass0fD.A00(r0)
            r6 = r11
            super.onCreate(r12)
            android.os.Bundle r5 = X.DbX.A0A(r11)
            if (r5 != 0) goto L_0x001b
            r11.finish()
            r0 = -893279103(0xffffffffcac1a481, float:-6345280.5)
        L_0x0017:
            X.AnonymousClass0fD.A07(r0, r3)
            return
        L_0x001b:
            com.instagram.common.session.UserSession r7 = X.DbS.A0U(r5)
            r11.A00 = r7
            java.lang.String r9 = "CONSENT_ACTION"
            X.0cS r2 = new X.0cS
            r2.<init>()
            r2.A01()
            X.0PH r1 = X.C60020ci.A0m
            java.lang.String r0 = "com.instagram.android"
            r2.A02(r1, r0)
            X.0cT r2 = r2.A00()
            android.content.Intent r1 = r11.getIntent()     // Catch:{ SecurityException -> 0x003f, IllegalStateException -> 0x0043 }
            r0 = 0
            r2.A02(r11, r1, r0)     // Catch:{ SecurityException -> 0x003f, IllegalStateException -> 0x0043 }
            goto L_0x004a
        L_0x003f:
            r1 = move-exception
            java.lang.String r0 = "Security issue with caller"
            goto L_0x0046
        L_0x0043:
            r1 = move-exception
            java.lang.String r0 = "Failed to verify caller"
        L_0x0046:
            X.0KC.A0F(r9, r0, r1)
            goto L_0x00b6
        L_0x004a:
            com.instagram.common.session.UserSession r4 = r11.A00
            if (r4 == 0) goto L_0x00be
            X.0Tu r2 = X.0Tu.A05
            r0 = 36312075882201993(0x8101a400040389, double:3.02724123267337E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r2, r4, r0)
            if (r0 == 0) goto L_0x00be
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00be
            X.2ZQ r0 = X.C71172bH.A00()
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            if (r0 == 0) goto L_0x00be
            X.0hq r1 = r0.getSupportFragmentManager()
            r4 = 0
            if (r1 == 0) goto L_0x00be
            r0 = 2131435209(0x7f0b1ec9, float:1.8492254E38)
            androidx.fragment.app.Fragment r1 = r1.A0P(r0)
            if (r1 == 0) goto L_0x00be
            boolean r0 = r1 instanceof X.AnonymousClass3M3
            if (r0 != 0) goto L_0x009e
            X.0hq r0 = r1.getChildFragmentManager()
            X.0qQ.A07(r0)
            X.06j r0 = r0.A0U
            java.util.List r0 = r0.A04()
            java.util.Iterator r2 = r0.iterator()
        L_0x008e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00be
            java.lang.Object r1 = X.AnonymousClass7TF.A0a(r2)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            boolean r0 = r1 instanceof X.AnonymousClass3M3
            if (r0 == 0) goto L_0x008e
        L_0x009e:
            X.3M3 r1 = (X.AnonymousClass3M3) r1
            X.DiQ r0 = r1.A05
            if (r0 == 0) goto L_0x00f8
            java.lang.String r2 = r0.A09
            r1 = 1
            if (r2 == 0) goto L_0x00be
            java.lang.String r0 = "com.bloks.www.privacy.consent"
            boolean r0 = X.00p.A0k(r2, r0, r4)
            if (r0 != r1) goto L_0x00be
            java.lang.String r0 = "Consent Screen Already showing"
            X.0KC.A0C(r9, r0)
        L_0x00b6:
            r11.finish()
            r0 = -2086490636(0xffffffff83a2adf4, float:-9.561442E-37)
            goto L_0x0017
        L_0x00be:
            java.lang.String r0 = X.DbS.A0m(r5)
            if (r0 == 0) goto L_0x00b6
            android.net.Uri r1 = X.DbT.A09(r0)
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00b6
            if (r7 == 0) goto L_0x00b6
            java.lang.String r0 = "params"
            java.lang.String r0 = r1.getQueryParameter(r0)
            if (r0 == 0) goto L_0x00dd
            java.util.HashMap r10 = X.F5I.A01(r7, r0)     // Catch:{ IOException -> 0x00ff }
            goto L_0x00de
        L_0x00dd:
            r10 = 0
        L_0x00de:
            X.2ZQ r5 = X.C71172bH.A00()
            androidx.fragment.app.FragmentActivity r5 = (androidx.fragment.app.FragmentActivity) r5
            if (r10 == 0) goto L_0x00b6
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x00b6
            if (r5 == 0) goto L_0x00b6
            r0 = 553(0x229, float:7.75E-43)
            java.lang.String r8 = X.AnonymousClass000.A00(r0)
            X.FHB.A0D(r5, r6, r7, r8, r9, r10)
            goto L_0x00b6
        L_0x00f8:
            java.lang.String r0 = "BloksSurfaceProps not found"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x00ff:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.consentaction.ConsentActionUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.urlhandlers.consentaction.ConsentActionUrlHandlerActivity, android.content.Context, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity] */
    public final void onResume() {
        int A002 = AnonymousClass0fD.A00(-1557060764);
        super.onResume();
        Window window = getWindow();
        if (!(window == null || window.getDecorView() == null)) {
            DbT.A16(getApplicationContext(), getWindow().getDecorView(), R.color.igds_creation_menu_background);
        }
        AnonymousClass0fD.A07(-1473240209, A002);
    }
}
