package com.instagram.urlhandlers.infocenterfactexternal;

import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class InfoCenterFactExternalUrlHandlerActivity extends BaseFragmentActivity implements AnonymousClass0iw {
    public AnonymousClass0wW A00;
    public UserSession A01;

    public final void A0j(Bundle bundle) {
    }

    public final String getModuleName() {
        return "info_center_fact";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = -1622647775(0xffffffff9f485c21, float:-4.2427855E-20)
            int r7 = X.AnonymousClass0fD.A00(r0)
            super.onCreate(r9)
            android.os.Bundle r3 = X.DbX.A0A(r8)
            if (r3 != 0) goto L_0x001a
            r8.finish()
            r0 = -1371901064(0xffffffffae3a7378, float:-4.239406E-11)
        L_0x0016:
            X.AnonymousClass0fD.A07(r0, r7)
            return
        L_0x001a:
            X.08y r1 = X.09i.A0A
            X.0wW r0 = r1.A04(r3)
            r8.A00 = r0
            com.instagram.common.session.UserSession r0 = r1.A06(r3)
            r8.A01 = r0
            X.0wW r0 = r8.A00
            if (r0 == 0) goto L_0x00b2
            java.lang.String r2 = "INFO_CENTER_FACT"
            java.lang.String r1 = X.DbS.A0m(r3)
            if (r1 == 0) goto L_0x0064
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0064
            android.net.Uri r2 = X.0cp.A03(r1)     // Catch:{ NullPointerException -> 0x003f, SecurityException -> 0x0042 }
            goto L_0x0048
        L_0x003f:
            java.lang.String r0 = "Error parsing uri with NullPointerException"
            goto L_0x0044
        L_0x0042:
            java.lang.String r0 = "Error parsing uri with SecurityException"
        L_0x0044:
            X.0wb.A03(r2, r0)
            goto L_0x0064
        L_0x0048:
            java.lang.String r1 = r2.getScheme()
            java.lang.String r0 = "https"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x006b
            java.lang.String r0 = "http"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x006b
            java.lang.String r0 = "instagram"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x006b
        L_0x0064:
            r8.finish()
        L_0x0067:
            r0 = -1773595305(0xffffffff96491557, float:-1.6243384E-25)
            goto L_0x0016
        L_0x006b:
            java.lang.String r0 = "params"
            java.lang.String r1 = r2.getQueryParameter(r0)
            com.instagram.common.session.UserSession r0 = r8.A01
            if (r0 == 0) goto L_0x0064
            if (r1 == 0) goto L_0x0064
            java.util.HashMap r6 = X.F5I.A01(r0, r1)     // Catch:{ IOException -> 0x00ba }
            if (r6 == 0) goto L_0x0064
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0064
            X.0wW r5 = r8.A00
            if (r5 == 0) goto L_0x0067
            X.6ST r4 = X.DbV.A0h(r8)
            X.DbX.A15(r8, r4)
            X.AnonymousClass0fN.A00(r4)
            X.0hq r3 = X.DbT.A0F(r8)
            r1 = 4
            X.FQk r0 = new X.FQk
            r0.<init>(r1, r8, r3)
            r3.A0s(r0)
            r0 = 0
            X.2nI r2 = X.C229382nI.A01(r0, r8, r8, r5)
            java.lang.String r0 = "com.instagram.stories.bloks_tappable_stickers.covid_fact.action"
            X.8ey r1 = X.C359988do.A05(r5, r0, r6)
            r0 = 15
            X.E85.A00(r1, r4, r3, r2, r0)
            X.1ES.A03(r1)
            goto L_0x0067
        L_0x00b2:
            r8.finish()
            r0 = 2024786196(0x78afc914, float:2.8522822E34)
            goto L_0x0016
        L_0x00ba:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.infocenterfactexternal.InfoCenterFactExternalUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
