package com.instagram.urlhandlers.wonderwall;

import X.AnonymousClass0wW;
import X.DbS;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class WonderWallUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.wonderwall.WonderWallUrlHandlerActivity, java.lang.Object, android.app.Activity] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = -1532201595(0xffffffffa4ac7585, float:-7.4792195E-17)
            int r4 = X.AnonymousClass0fD.A00(r0)
            super.onCreate(r9)
            android.os.Bundle r3 = X.DbX.A0A(r8)
            if (r3 == 0) goto L_0x004e
            java.lang.String r2 = X.DbS.A0m(r3)
            if (r2 == 0) goto L_0x004e
            X.0wW r1 = X.DbS.A0S(r8)
            boolean r0 = r1 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x010a
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            r3 = 0
            android.net.Uri r2 = X.DbT.A09(r2)
            java.lang.String r7 = r2.getHost()
            if (r7 == 0) goto L_0x004e
            int r5 = r7.hashCode()
            r0 = -682122235(0xffffffffd757a405, float:-2.37099458E14)
            if (r5 == r0) goto L_0x0061
            r0 = -283036151(0xffffffffef213609, float:-4.989241E28)
            if (r5 != r0) goto L_0x004e
            java.lang.String r0 = "wonderwall_activity"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x004e
            X.2ZQ r0 = X.C71172bH.A00()
            if (r0 == 0) goto L_0x0058
            X.1Zy r0 = X.C65001Zz.A00()
            r0.CfU(r8, r1)
        L_0x004e:
            r8.finish()
        L_0x0051:
            r0 = -440813836(0xffffffffe5b9b6f4, float:-1.0962659E23)
            X.AnonymousClass0fD.A07(r0, r4)
            return
        L_0x0058:
            android.content.Intent r1 = X.DbX.A08(r8)
            r1.setData(r2)
            goto L_0x0105
        L_0x0061:
            java.lang.String r6 = "wonderwall"
            boolean r0 = r7.equals(r6)
            if (r0 == 0) goto L_0x004e
            java.lang.String r7 = r2.getScheme()
            if (r7 == 0) goto L_0x0098
            int r5 = r7.hashCode()
            r0 = 3213448(0x310888, float:4.503E-39)
            if (r5 == r0) goto L_0x00cb
            r0 = 28903346(0x1b907b2, float:6.796931E-38)
            if (r5 == r0) goto L_0x00ba
            r0 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r5 != r0) goto L_0x0098
            java.lang.String r0 = "https"
        L_0x0084:
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0098
            java.lang.String r0 = X.DbT.A10(r2)
            boolean r0 = X.DbU.A1a(r0, r6)
        L_0x0092:
            if (r0 == 0) goto L_0x0098
            com.instagram.wonderwall.model.WallLaunchConfig r3 = X.C49255Ery.A00(r2, r1)
        L_0x0098:
            X.C65001Zz.A00()
            X.0Tu r0 = X.AnonymousClass7TF.A0H(r1)
            r5 = 36322353738688598(0x810afd00002856, double:3.033740990501105E-306)
            boolean r0 = X.182.A06(r0, r1, r5)
            if (r0 == 0) goto L_0x004e
            if (r3 == 0) goto L_0x004e
            X.2ZQ r0 = X.C71172bH.A00()
            if (r0 == 0) goto L_0x00ce
            X.1Zy r0 = X.C65001Zz.A00()
            r0.Cfg(r8, r1, r3)
            goto L_0x004e
        L_0x00ba:
            java.lang.String r0 = "instagram"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0098
            java.lang.String r0 = r2.getHost()
            boolean r0 = X.0qQ.A0K(r0, r6)
            goto L_0x0092
        L_0x00cb:
            java.lang.String r0 = "http"
            goto L_0x0084
        L_0x00ce:
            java.lang.String r0 = "instagram://wonderwall"
            android.net.Uri$Builder r2 = X.DbW.A07(r0)
            java.lang.String r1 = r3.A01
            java.lang.String r0 = "wall_owner_id"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r0, r1)
            X.0qQ.A07(r2)
            com.instagram.wonderwall.model.Destination r3 = r3.A00
            boolean r0 = r3 instanceof com.instagram.wonderwall.model.Destination.Composer
            if (r0 == 0) goto L_0x00f7
            java.lang.String r1 = "destination"
            java.lang.String r0 = "create"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r1, r0)
            com.instagram.wonderwall.model.Destination$Composer r3 = (com.instagram.wonderwall.model.Destination.Composer) r3
            java.lang.String r1 = r3.A00
            java.lang.String r0 = "post_id"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r0, r1)
        L_0x00f7:
            android.net.Uri r0 = r2.build()
            X.0qQ.A07(r0)
            android.content.Intent r1 = X.DbX.A08(r8)
            r1.setData(r0)
        L_0x0105:
            X.0kR.A0B(r8, r1)
            goto L_0x004e
        L_0x010a:
            X.FFQ.A01(r8, r3, r1)
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.wonderwall.WonderWallUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
