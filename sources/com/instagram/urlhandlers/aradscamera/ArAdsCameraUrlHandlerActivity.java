package com.instagram.urlhandlers.aradscamera;

import X.AnonymousClass0wW;
import X.DbS;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class ArAdsCameraUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008d, code lost:
        if (X.AnonymousClass000.A00(5387).equalsIgnoreCase(r8.getHost()) == false) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009d, code lost:
        if (r0.equalsIgnoreCase(r1) != false) goto L_0x009f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r20) {
        /*
            r19 = this;
            r0 = 277108529(0x10845731, float:5.219916E-29)
            int r9 = X.AnonymousClass0fD.A00(r0)
            r12 = r19
            r0 = r20
            super.onCreate(r0)
            android.content.Intent r1 = r12.getIntent()
            java.lang.String r0 = "com.instagram.url.extra.BUNDLE"
            android.os.Bundle r1 = r1.getBundleExtra(r0)
            if (r1 != 0) goto L_0x0024
            r12.finish()
            r0 = -318366791(0xffffffffed061bb9, float:-2.5940316E27)
        L_0x0020:
            X.AnonymousClass0fD.A07(r0, r9)
            return
        L_0x0024:
            java.lang.String r0 = "original_url"
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L_0x0034
            r12.finish()
            r0 = -1483925827(0xffffffffa78d16bd, float:-3.9160015E-15)
            goto L_0x0020
        L_0x0034:
            android.net.Uri r8 = X.0cp.A03(r0)     // Catch:{ SecurityException -> 0x0169 }
            java.lang.String r2 = r8.getScheme()
            java.lang.String r1 = r8.getHost()
            if (r2 == 0) goto L_0x016f
            int r0 = r2.length()
            if (r0 == 0) goto L_0x016f
            if (r1 == 0) goto L_0x016f
            int r0 = r1.length()
            if (r0 == 0) goto L_0x016f
            java.lang.String r0 = "https"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = "http"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = "instagram"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x016f
            java.lang.String r0 = "aradscamera"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x009f
            java.lang.String r0 = "ar_commerce"
            goto L_0x0099
        L_0x0073:
            java.lang.String r1 = r8.getHost()
            java.lang.String r0 = "instagram.com"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0091
            java.lang.String r1 = r8.getHost()
            r0 = 5387(0x150b, float:7.549E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0091
            goto L_0x016f
        L_0x0091:
            java.lang.String r1 = r8.getPath()
            if (r1 == 0) goto L_0x016f
            java.lang.String r0 = "/aradscamera/"
        L_0x0099:
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x016f
        L_0x009f:
            android.os.Bundle r7 = X.AnonymousClass7TE.A0a()
            java.lang.String r10 = "encoded_token"
            X.DbU.A1B(r8, r7, r10)
            java.lang.String r11 = "effect_id"
            X.DbU.A1B(r8, r7, r11)
            r0 = 12
            java.lang.String r6 = X.C66579MXk.A00(r0)
            X.DbU.A1B(r8, r7, r6)
            java.lang.String r5 = "media_id"
            X.DbU.A1B(r8, r7, r5)
            java.lang.String r4 = "mode"
            X.DbU.A1B(r8, r7, r4)
            java.lang.String r3 = "ad_impression_client_token"
            X.DbU.A1B(r8, r7, r3)
            java.lang.String r2 = "adgroup_id"
            X.DbU.A1B(r8, r7, r2)
            java.lang.String r1 = "product_id"
            X.DbU.A1B(r8, r7, r1)
            java.lang.String r8 = r8.getHost()
            java.lang.String r0 = "ar_commerce"
            boolean r0 = X.0qQ.A0K(r8, r0)
            if (r0 == 0) goto L_0x0113
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x00e0:
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x0110
            java.lang.String r8 = "AR_ADS"
        L_0x00e8:
            java.lang.String r0 = "camera_name"
            r7.putString(r0, r8)
            X.0wW r8 = X.DbS.A0S(r12)
            com.instagram.common.session.UserSession r14 = X.0Gl.A00(r8)
            java.lang.String r16 = r7.getString(r11)
            java.lang.String r18 = r7.getString(r10)
            if (r16 == 0) goto L_0x0161
            if (r18 == 0) goto L_0x0161
            X.1ZN r11 = X.C297725sE.A00()
            X.28D r13 = X.28D.A0P
            r17 = 0
            java.lang.String r8 = r7.getString(r0)
            if (r8 == 0) goto L_0x0131
            goto L_0x0116
        L_0x0110:
            java.lang.String r8 = "DYNAMIC_AR_ADS"
            goto L_0x00e8
        L_0x0113:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x00e0
        L_0x0116:
            java.lang.String r0 = "DYNAMIC_AR_ADS"
            boolean r0 = r8.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0134 }
            if (r0 == 0) goto L_0x0121
            java.lang.Integer r15 = X.AnonymousClass05K.A00     // Catch:{ IllegalArgumentException -> 0x0134 }
            goto L_0x0136
        L_0x0121:
            java.lang.String r0 = "AR_ADS"
            boolean r0 = r8.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0134 }
            if (r0 == 0) goto L_0x012c
            java.lang.Integer r15 = X.AnonymousClass05K.A01     // Catch:{ IllegalArgumentException -> 0x0134 }
            goto L_0x0136
        L_0x012c:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r8)     // Catch:{ IllegalArgumentException -> 0x0134 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0134 }
        L_0x0131:
            java.lang.Integer r15 = X.AnonymousClass05K.A01
            goto L_0x0136
        L_0x0134:
            java.lang.Integer r15 = X.AnonymousClass05K.A01
        L_0x0136:
            X.ViY r8 = r11.A01(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r0 = r7.getString(r6)
            r8.A02 = r0
            java.lang.String r0 = r7.getString(r5)
            r8.A03 = r0
            java.lang.String r0 = r7.getString(r4)
            r8.A04 = r0
            java.lang.String r0 = r7.getString(r2)
            r8.A00 = r0
            java.lang.String r0 = r7.getString(r3)
            r8.A01 = r0
            java.lang.String r0 = r7.getString(r1)
            r8.A05 = r0
            r8.A00()
        L_0x0161:
            r12.finish()
            r0 = -561091411(0xffffffffde8e6cad, float:-5.1313839E18)
            goto L_0x0020
        L_0x0169:
            r1 = move-exception
            java.lang.String r0 = "arads_camera_url_handler"
            X.0wb.A07(r0, r1)
        L_0x016f:
            r12.finish()
            r0 = 24816569(0x17aabb9, float:4.6040953E-38)
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.aradscamera.ArAdsCameraUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
