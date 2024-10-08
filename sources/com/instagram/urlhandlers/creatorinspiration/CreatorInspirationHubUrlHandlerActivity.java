package com.instagram.urlhandlers.creatorinspiration;

import X.AnonymousClass0wW;
import X.DbX;
import X.Dbb;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class CreatorInspirationHubUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.urlhandlers.creatorinspiration.CreatorInspirationHubUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        return Dbb.A0M(DbX.A0A(this));
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.creatorinspiration.CreatorInspirationHubUrlHandlerActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        if (r4.equals("pro_dash") != false) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = -361763003(0xffffffffea6fef45, float:-7.2515797E25)
            int r5 = X.AnonymousClass0fD.A00(r0)
            super.onCreate(r9)
            if (r9 == 0) goto L_0x0013
            r0 = -161368756(0xfffffffff661b54c, float:-1.1444765E33)
        L_0x000f:
            X.AnonymousClass0fD.A07(r0, r5)
            return
        L_0x0013:
            android.os.Bundle r3 = X.DbX.A0A(r8)
            if (r3 != 0) goto L_0x0020
            r8.finish()
            r0 = -321869745(0xffffffffecd0a84f, float:-2.0180111E27)
            goto L_0x000f
        L_0x0020:
            java.lang.String r0 = X.DbS.A0m(r3)
            if (r0 != 0) goto L_0x002d
            r8.finish()
            r0 = -213022753(0xfffffffff34d87df, float:-1.6283823E31)
            goto L_0x000f
        L_0x002d:
            android.net.Uri r7 = X.DbT.A09(r0)
            java.lang.String r6 = "entry_point"
            java.lang.String r4 = r7.getQueryParameter(r6)
            java.lang.String r0 = "default_tab"
            java.lang.String r2 = r7.getQueryParameter(r0)
            X.0wW r1 = r8.getSession()
            if (r1 == 0) goto L_0x004a
            boolean r0 = r1 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L_0x004e
            X.FFQ.A01(r8, r3, r1)
        L_0x004a:
            r0 = 135238480(0x80f9350, float:4.320566E-34)
            goto L_0x000f
        L_0x004e:
            X.2ZQ r1 = X.C71172bH.A00()
            if (r1 == 0) goto L_0x00ae
            java.lang.String r0 = "deep_link"
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 == 0) goto L_0x0061
            X.1QK r0 = X.1QK.A0E
            r1.Eng(r0)
        L_0x0061:
            r3.putString(r6, r4)
            if (r4 == 0) goto L_0x006f
            java.lang.String r0 = "pro_dash"
            boolean r0 = r4.equals(r0)
            r1 = 1
            if (r0 == 0) goto L_0x0070
        L_0x006f:
            r1 = 0
        L_0x0070:
            r0 = 1819(0x71b, float:2.549E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.putBoolean(r0, r1)
            r0 = 1794(0x702, float:2.514E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.putString(r0, r2)
            X.0wW r2 = r8.getSession()
            java.lang.Class<com.instagram.modal.ModalActivity> r1 = com.instagram.modal.ModalActivity.class
            r0 = 2953(0xb89, float:4.138E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.6W8 r4 = X.DbS.A0b(r8, r3, r2, r1, r0)
            r3 = 2130772095(0x7f01007f, float:1.7147299E38)
            r2 = 2130772066(0x7f010062, float:1.714724E38)
            r1 = 2130772064(0x7f010060, float:1.7147236E38)
            r0 = 2130772097(0x7f010081, float:1.7147303E38)
            int[] r0 = new int[]{r3, r2, r1, r0}
            r4.A0J = r0
            r0 = 1
            r4.A08 = r0
            r4.A0C(r8)
        L_0x00aa:
            r8.finish()
            goto L_0x004a
        L_0x00ae:
            X.DbZ.A0v(r8, r7)
            goto L_0x00aa
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.creatorinspiration.CreatorInspirationHubUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }
}
