package com.instagram.urlhandlers.clipsapp;

import X.AnonymousClass0eM;
import X.AnonymousClass0wW;
import X.AnonymousClass1YB;
import X.C20698WxU;
import X.DbS;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class ClipsAppUrlHandlerActivity extends BaseFragmentActivity {
    public final AnonymousClass0eM A00 = AnonymousClass1YB.A00(new C20698WxU((Object) this, 45));

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.1Xj r13, com.instagram.urlhandlers.clipsapp.ClipsAppUrlHandlerActivity r14) {
        /*
            r11 = 0
            X.DUF r2 = X.C51965G9l.A0j(r13)
            r3 = r14
            if (r2 == 0) goto L_0x0058
            X.DU6 r1 = r2.Bch()
            com.instagram.user.model.User r0 = r1.Bge()
            r14 = 0
            if (r0 == 0) goto L_0x005e
            java.lang.String r10 = r0.getUsername()
            com.instagram.user.model.User r0 = r1.Bge()
            if (r0 == 0) goto L_0x005c
            com.instagram.common.typedurl.ImageUrl r6 = r0.Bh3()
        L_0x0021:
            com.instagram.user.model.User r0 = r1.Bge()
            if (r0 == 0) goto L_0x002b
            boolean r14 = r0.isVerified()
        L_0x002b:
            com.instagram.user.model.User r0 = r1.Bge()
            if (r0 == 0) goto L_0x0035
            java.lang.String r11 = r0.getId()
        L_0x0035:
            X.0eM r0 = r3.A00
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r7 = r2.getAttributionAppId()
            java.lang.String r8 = r2.getAttributionAppName()
            java.lang.String r9 = r1.getContentUrl()
            com.instagram.common.typedurl.ImageUrl r5 = r1.Awq()
            java.lang.String r12 = r1.getMediaCount()
            java.lang.String r13 = r13.getId()
            if (r13 == 0) goto L_0x0061
            X.C52273GLp.A04(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0058:
            r3.finish()
            return
        L_0x005c:
            r6 = r11
            goto L_0x0021
        L_0x005e:
            r10 = r11
            r6 = r11
            goto L_0x0035
        L_0x0061:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.clipsapp.ClipsAppUrlHandlerActivity.A00(X.1Xj, com.instagram.urlhandlers.clipsapp.ClipsAppUrlHandlerActivity):void");
    }

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.base.activity.BaseFragmentActivity, java.lang.Object, com.instagram.urlhandlers.clipsapp.ClipsAppUrlHandlerActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        if (r1 != null) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            r0 = -886573191(0xffffffffcb27f779, float:-1.1007865E7)
            int r4 = X.AnonymousClass0fD.A00(r0)
            super.onCreate(r6)
            android.os.Bundle r2 = X.DbX.A0A(r5)
            if (r2 != 0) goto L_0x001a
            r5.finish()
            r0 = -1932925142(0xffffffff8cc9e72a, float:-3.110808E-31)
        L_0x0016:
            X.AnonymousClass0fD.A07(r0, r4)
            return
        L_0x001a:
            java.lang.String r1 = X.DbS.A0m(r2)
            if (r1 == 0) goto L_0x006e
            int r0 = r1.length()
            if (r0 == 0) goto L_0x006e
            X.0wW r3 = X.DbS.A0S(r5)
            boolean r0 = r3 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L_0x0039
            X.1WK r0 = X.FFQ.A00()
            r0.A00(r5, r2, r3)
        L_0x0035:
            r0 = 1102213538(0x41b271a2, float:22.305485)
            goto L_0x0016
        L_0x0039:
            android.net.Uri r2 = X.DbT.A09(r1)
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.String r0 = "media_id"
            java.lang.String r1 = r2.getQueryParameter(r0)
            if (r1 != 0) goto L_0x0057
            java.util.List r1 = r2.getPathSegments()
            X.0qQ.A07(r1)
            r0 = 3
            java.lang.Object r1 = X.00k.A0O(r1, r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0035
        L_0x0057:
            X.1Xj r0 = X.DbV.A0U(r3, r1)
            if (r0 != 0) goto L_0x006a
            X.1OC r1 = X.C3724090s.A04(r3, r1)
            r0 = 19
            X.H50.A00(r1, r5, r0)
            r5.schedule(r1)
            goto L_0x0035
        L_0x006a:
            A00(r0, r5)
            goto L_0x0035
        L_0x006e:
            r5.finish()
            r0 = 2078582138(0x7be4a57a, float:2.3743999E36)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.clipsapp.ClipsAppUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
