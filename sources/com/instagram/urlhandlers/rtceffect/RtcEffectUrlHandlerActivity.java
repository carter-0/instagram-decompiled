package com.instagram.urlhandlers.rtceffect;

import X.08y;
import X.09i;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.DbX;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class RtcEffectUrlHandlerActivity extends BaseFragmentActivity implements AnonymousClass0iw {
    public final void A0j(Bundle bundle) {
    }

    public final String getModuleName() {
        return "RtcEffectUrlHandlerActivity";
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.rtceffect.RtcEffectUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.content.Context} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r17) {
        /*
            r16 = this;
            r0 = 2104890826(0x7d7615ca, float:2.0443951E37)
            int r2 = X.AnonymousClass0fD.A00(r0)
            r7 = r16
            r0 = r17
            super.onCreate(r0)
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r3 = "com.instagram.url.extra.BUNDLE"
            android.os.Bundle r5 = r0.getBundleExtra(r3)
            if (r5 == 0) goto L_0x012c
            java.lang.String r1 = "original_url"
            java.lang.String r0 = r5.getString(r1)
            r4 = 0
            if (r0 == 0) goto L_0x012c
            int r0 = r0.length()
            if (r0 == 0) goto L_0x012c
            java.lang.String r6 = r5.getString(r1)
            android.view.Window r1 = r7.getWindow()
            if (r1 == 0) goto L_0x003b
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r4)
            r1.setBackgroundDrawable(r0)
        L_0x003b:
            android.os.Bundle r5 = X.DbU.A06(r7)
            if (r5 == 0) goto L_0x0134
            java.lang.String r1 = "uri"
            r5.putString(r1, r6)
            X.0wW r8 = r7.getSession()
            boolean r0 = r8 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L_0x0058
            X.FFQ.A01(r7, r5, r8)
        L_0x0051:
            r0 = 350444374(0x14e35b56, float:2.2957168E-26)
        L_0x0054:
            X.AnonymousClass0fD.A07(r0, r2)
            return
        L_0x0058:
            java.lang.String r0 = r5.getString(r1)
            if (r0 == 0) goto L_0x0051
            r13 = 0
            android.net.Uri r5 = X.DbT.A09(r0)
            boolean r0 = r5.isHierarchical()
            if (r0 == 0) goto L_0x00fc
            java.lang.String r1 = "effect_id"
            java.lang.String r11 = r5.getQueryParameter(r1)
            if (r11 != 0) goto L_0x0079
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r11 = r0.getStringExtra(r1)
        L_0x0079:
            java.lang.String r0 = "ch"
            java.lang.String r12 = r5.getQueryParameter(r0)
            java.lang.String r0 = "rev_id"
            java.lang.String r13 = r5.getQueryParameter(r0)
            java.lang.String r0 = "utm_source"
            java.lang.String r5 = r5.getQueryParameter(r0)
        L_0x008b:
            android.content.Intent r0 = r7.getIntent()
            android.os.Bundle r1 = r0.getBundleExtra(r3)
            if (r1 == 0) goto L_0x00b5
            if (r11 == 0) goto L_0x00b5
            int r0 = r11.length()
            if (r0 == 0) goto L_0x00b5
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            X.DbU.A1D(r1, r8)
            X.1X9 r0 = X.AnonymousClass38W.A00()
            if (r5 != 0) goto L_0x00b9
            boolean r0 = r0.A02(r7, r8)
            if (r0 == 0) goto L_0x00b9
            r6 = r7
            r9 = r11
            r10 = r12
            r11 = r13
            X.C49895FBy.A00(r6, r7, r8, r9, r10, r11)
        L_0x00b5:
            r7.finish()
            goto L_0x0051
        L_0x00b9:
            boolean r0 = r7.isTaskRoot()
            if (r0 == 0) goto L_0x0100
            r0 = 328(0x148, float:4.6E-43)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            r0 = 47
            java.lang.String r0 = X.002.A0S(r1, r11, r0)
            android.net.Uri$Builder r3 = X.DbW.A07(r0)
            java.lang.String r0 = "effect_id"
            r3.appendQueryParameter(r0, r11)
            if (r5 == 0) goto L_0x00db
            java.lang.String r0 = "utm_source"
            r3.appendQueryParameter(r0, r5)
        L_0x00db:
            if (r12 == 0) goto L_0x00e2
            java.lang.String r0 = "ch"
            r3.appendQueryParameter(r0, r12)
        L_0x00e2:
            if (r13 == 0) goto L_0x00e9
            java.lang.String r0 = "rev_id"
            r3.appendQueryParameter(r0, r13)
        L_0x00e9:
            java.lang.String r1 = "src"
            java.lang.String r0 = "vc"
            r3.appendQueryParameter(r1, r0)
            X.14B r0 = X.DbT.A0e()
            android.content.Intent r0 = r0.A03(r7, r4)
            X.Dba.A0o(r7, r0, r3)
            goto L_0x00b5
        L_0x00fc:
            r5 = r13
            r11 = r13
            r12 = r13
            goto L_0x008b
        L_0x0100:
            X.LHg r9 = new X.LHg
            r9.<init>()
            if (r12 != 0) goto L_0x0127
            if (r13 != 0) goto L_0x0127
            X.12T r0 = X.AnonymousClass12T.A00
            X.4CZ r1 = r0.A04
            r14 = 0
            X.1HY r0 = new X.1HY
            r0.<init>(r14)
            X.4Cc r0 = X.AnonymousClass199.A02(r1, r0)
            X.19S r0 = X.19E.A02(r0)
            r15 = 2
            X.MFm r6 = new X.MFm
            r10 = r7
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.AnonymousClass7TE.A1Z(r6, r0)
            goto L_0x0051
        L_0x0127:
            X.C63988LHg.A00(r7, r8, r11, r12, r13)
            goto L_0x0051
        L_0x012c:
            r7.finish()
            r0 = -231231314(0xfffffffff237b0ae, float:-3.6383584E30)
            goto L_0x0054
        L_0x0134:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -1648920836(0xffffffff9db776fc, float:-4.8562724E-21)
            X.AnonymousClass0fD.A07(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.rtceffect.RtcEffectUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }
}
