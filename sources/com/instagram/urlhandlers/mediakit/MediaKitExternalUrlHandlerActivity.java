package com.instagram.urlhandlers.mediakit;

import X.AnonymousClass0wW;
import X.DbS;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class MediaKitExternalUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, java.lang.Object, com.instagram.urlhandlers.mediakit.MediaKitExternalUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006b, code lost:
        if (X.182.A06(r2, r3, r0) == false) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            r0 = 1244953671(0x4a347c47, float:2957073.8)
            int r4 = X.AnonymousClass0fD.A00(r0)
            super.onCreate(r13)
            android.os.Bundle r2 = X.DbX.A0A(r12)
            if (r2 == 0) goto L_0x007a
            java.lang.String r1 = X.DbS.A0m(r2)
            if (r1 == 0) goto L_0x007a
            X.0wW r3 = X.DbS.A0S(r12)
            boolean r0 = r3 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x014b
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            r2 = 0
            android.net.Uri r5 = X.0cp.A03(r1)
            if (r5 == 0) goto L_0x007a
            java.lang.String r6 = r5.getScheme()
            if (r6 == 0) goto L_0x007a
            int r1 = r6.hashCode()
            r0 = 3213448(0x310888, float:4.503E-39)
            if (r1 == r0) goto L_0x0147
            r0 = 28903346(0x1b907b2, float:6.796931E-38)
            if (r1 == r0) goto L_0x00c2
            r0 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r1 != r0) goto L_0x007a
            java.lang.String r0 = "https"
        L_0x0042:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x007a
            java.util.List r0 = r5.getPathSegments()
            X.0qQ.A07(r0)
            java.lang.Object r1 = X.00k.A0L(r0)
            java.lang.String r1 = (java.lang.String) r1
            com.instagram.mediakit.analytics.MediaKitEntryPoint r0 = com.instagram.mediakit.analytics.MediaKitEntryPoint.EXTERNAL_LINK
            com.instagram.mediakit.config.MediaKitConfig r5 = new com.instagram.mediakit.config.MediaKitConfig
            if (r1 == 0) goto L_0x00be
            r5.<init>(r0, r2, r1)
        L_0x005e:
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36316289244926153(0x810579000110c9, double:3.029905780225979E-306)
        L_0x0067:
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x007a
        L_0x006d:
            X.2ZQ r0 = X.C71172bH.A00()
            if (r0 == 0) goto L_0x0084
            X.1ZX r0 = X.AnonymousClass1ZZ.A00()
            r0.E18(r12, r3, r5)
        L_0x007a:
            r12.finish()
        L_0x007d:
            r0 = 1710778138(0x65f8671a, float:1.466311E23)
            X.AnonymousClass0fD.A07(r0, r4)
            return
        L_0x0084:
            android.content.Intent r3 = X.DbX.A08(r12)
            java.lang.String r0 = "instagram://mediakit"
            android.net.Uri$Builder r2 = X.DbW.A07(r0)
            java.lang.String r1 = "destination"
            java.lang.String r0 = "view"
            r2.appendQueryParameter(r1, r0)
            java.lang.String r1 = r5.A02
            if (r1 == 0) goto L_0x009e
            java.lang.String r0 = "short_code"
            r2.appendQueryParameter(r0, r1)
        L_0x009e:
            java.lang.String r1 = r5.A01
            if (r1 == 0) goto L_0x00a7
            java.lang.String r0 = "id"
            r2.appendQueryParameter(r0, r1)
        L_0x00a7:
            com.instagram.mediakit.analytics.MediaKitEntryPoint r0 = r5.A00
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "entry_point"
            r2.appendQueryParameter(r0, r1)
            android.net.Uri r0 = r2.build()
            X.0qQ.A07(r0)
            r3.setData(r0)
            X.0kR.A0B(r12, r3)
            goto L_0x007a
        L_0x00be:
            r5.<init>(r0, r2, r2)
            goto L_0x005e
        L_0x00c2:
            java.lang.String r0 = "instagram"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x007a
            java.lang.String r1 = r5.getHost()
            java.lang.String r0 = "mediakit"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x007a
            java.lang.String r0 = "destination"
            java.lang.String r10 = r5.getQueryParameter(r0)
            java.lang.String r11 = X.DbT.A0v(r5)
            java.lang.String r0 = "short_code"
            java.lang.String r9 = r5.getQueryParameter(r0)
            java.lang.String r8 = X.DbZ.A0h(r5)
            com.instagram.mediakit.analytics.MediaKitEntryPoint[] r7 = com.instagram.mediakit.analytics.MediaKitEntryPoint.values()
            int r5 = r7.length
            r1 = 0
        L_0x00f0:
            if (r1 >= r5) goto L_0x00ff
            r6 = r7[r1]
            java.lang.String r0 = r6.A00
            boolean r0 = X.0qQ.A0K(r0, r8)
            if (r0 != 0) goto L_0x0101
            int r1 = r1 + 1
            goto L_0x00f0
        L_0x00ff:
            com.instagram.mediakit.analytics.MediaKitEntryPoint r6 = com.instagram.mediakit.analytics.MediaKitEntryPoint.UNKNOWN
        L_0x0101:
            if (r10 == 0) goto L_0x007a
            java.lang.String r0 = "view"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x012f
            if (r11 != 0) goto L_0x0111
            if (r9 != 0) goto L_0x0111
            goto L_0x007a
        L_0x0111:
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36316289244926153(0x810579000110c9, double:3.029905780225979E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x007a
            r1 = 0
            r0 = 0
            if (r11 == 0) goto L_0x0125
            r1 = r11
        L_0x0125:
            if (r9 == 0) goto L_0x0128
            r0 = r9
        L_0x0128:
            com.instagram.mediakit.config.MediaKitConfig r5 = new com.instagram.mediakit.config.MediaKitConfig
            r5.<init>(r6, r1, r0)
            goto L_0x006d
        L_0x012f:
            java.lang.String r0 = "create"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x007a
            com.instagram.mediakit.config.MediaKitConfig r5 = new com.instagram.mediakit.config.MediaKitConfig
            r5.<init>(r6, r2, r2)
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36316289244860616(0x810579000010c8, double:3.029905780184533E-306)
            goto L_0x0067
        L_0x0147:
            java.lang.String r0 = "http"
            goto L_0x0042
        L_0x014b:
            X.FFQ.A01(r12, r2, r3)
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.mediakit.MediaKitExternalUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
