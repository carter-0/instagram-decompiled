package com.instagram.urlhandlers.igredirect;

import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.DbS;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class OpenTrustlyUrlHandlerActivity extends BaseFragmentActivity implements AnonymousClass0iw {
    public UserSession A00;

    public final void A0j(Bundle bundle) {
    }

    public final String getModuleName() {
        return "open_trustly_url_handler_activity";
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.igredirect.OpenTrustlyUrlHandlerActivity, android.app.Activity] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        if (X.00l.A0W(r7) != false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r27) {
        /*
            r26 = this;
            r0 = -250159578(0xfffffffff116de26, float:-7.47061E29)
            int r4 = X.AnonymousClass0fD.A00(r0)
            r5 = r26
            r0 = r27
            super.onCreate(r0)
            android.os.Bundle r9 = X.DbX.A0A(r5)
            if (r9 != 0) goto L_0x001e
            r5.finish()
            r0 = 598753802(0x23b0420a, float:1.9109927E-17)
        L_0x001a:
            X.AnonymousClass0fD.A07(r0, r4)
            return
        L_0x001e:
            java.lang.String r0 = X.DbS.A0m(r9)
            if (r0 != 0) goto L_0x002b
            r5.finish()
            r0 = 744317359(0x2c5d61af, float:3.1460214E-12)
            goto L_0x001a
        L_0x002b:
            r10 = 0
            android.net.Uri r1 = X.DbT.A09(r0)
            java.lang.String r0 = "initial_path"
            java.lang.String r25 = r1.getQueryParameter(r0)
            java.lang.String r3 = "completion_path"
            java.lang.String r0 = r1.getQueryParameter(r3)
            if (r25 == 0) goto L_0x0101
            if (r0 == 0) goto L_0x0101
            r12 = 0
            android.net.Uri r0 = X.DbT.A09(r25)
            java.lang.String r7 = r0.getHost()
            r2 = 1
            if (r7 == 0) goto L_0x0053
            boolean r1 = X.00l.A0W(r7)
            r0 = 0
            if (r1 == 0) goto L_0x0054
        L_0x0053:
            r0 = 1
        L_0x0054:
            r1 = 2
            if (r0 == 0) goto L_0x009e
            r5.finish()
        L_0x005a:
            java.lang.String r6 = "facebook.com"
            java.lang.String r0 = "instagram.com"
            java.lang.String[] r8 = new java.lang.String[]{r6, r0}
            if (r7 == 0) goto L_0x00f9
            java.lang.String r0 = "."
            java.util.List r7 = X.DbV.A18(r7, r0)
            if (r7 == 0) goto L_0x00f9
            int r0 = r7.size()
            if (r0 < r1) goto L_0x00f9
            int r0 = X.DbT.A02(r7, r1)
            java.lang.String r6 = X.AnonymousClass7TE.A19(r7, r0)
            r1 = 46
            int r0 = X.DbT.A02(r7, r2)
            java.lang.String r0 = X.AnonymousClass7TE.A19(r7, r0)
            java.lang.String r0 = X.002.A0T(r6, r0, r1)
            boolean r0 = X.03t.A0O(r0, r8)
            if (r0 == 0) goto L_0x00f9
            com.instagram.common.session.UserSession r1 = X.DbS.A0U(r9)
            r5.A00 = r1
            if (r1 != 0) goto L_0x00af
            r5.finish()
            r0 = -672419281(0xffffffffd7ebb22f, float:-5.1830105E14)
            goto L_0x001a
        L_0x009e:
            java.lang.String r0 = "www"
            boolean r0 = X.00l.A0d(r7, r0, r12)
            if (r0 == 0) goto L_0x005a
            r0 = 4
            java.lang.String r7 = r7.substring(r0)
            X.0qQ.A07(r7)
            goto L_0x005a
        L_0x00af:
            com.instagram.simplewebview.SimpleWebViewConfig r9 = new com.instagram.simplewebview.SimpleWebViewConfig
            r11 = r10
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r18 = r12
            r19 = r12
            r20 = r2
            r21 = r12
            r22 = r12
            r23 = r12
            r24 = r10
            r17 = r2
            r9.<init>((java.lang.String) r10, (java.lang.String) r11, (boolean) r12, (boolean) r13, (boolean) r14, (boolean) r15, (boolean) r16, (boolean) r17, (boolean) r18, (boolean) r19, (boolean) r20, (boolean) r21, (boolean) r22, (boolean) r23, (java.lang.String) r24, (java.lang.String) r25)
            java.lang.String r0 = "SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r9)
            java.lang.String r1 = r1.A05
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            X.0eP r1 = X.AnonymousClass7TE.A1L(r0, r1)
            android.content.Intent r0 = r5.getIntent()
            java.lang.String r0 = r0.getStringExtra(r3)
            android.os.Bundle r3 = X.DbY.A0C(r3, r0, r2, r1)
            com.instagram.common.session.UserSession r2 = r5.A00
            java.lang.Class<com.instagram.modal.ModalActivity> r1 = com.instagram.modal.ModalActivity.class
            r0 = 865(0x361, float:1.212E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.DbU.A0w(r5, r3, r2, r1, r0)
            r5.finish()
            r0 = -864823690(0xffffffffcc73d676, float:-6.39206E7)
            goto L_0x001a
        L_0x00f9:
            r5.finish()
            r0 = -1532100821(0xffffffffa4adff2b, float:-7.545906E-17)
            goto L_0x001a
        L_0x0101:
            r5.finish()
            r0 = 474834471(0x1c4d6627, float:6.796084E-22)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.igredirect.OpenTrustlyUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
