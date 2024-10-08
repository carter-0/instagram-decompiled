package com.instagram.urlhandlers.location;

import android.os.Bundle;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

public final class LocationUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [android.app.Activity, androidx.fragment.app.FragmentActivity] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0097, code lost:
        if (X.182.A06(r3, r7, 36321125378040961L) == false) goto L_0x0099;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0n(android.os.Bundle r18, android.os.Bundle r19, com.instagram.common.session.UserSession r20) {
        /*
            r17 = this;
            r2 = r19
            r7 = r20
            X.AnonymousClass7TG.A1O(r7, r2)
            X.0Tu r3 = X.0Tu.A05
            r0 = 36321125378106498(0x8109df00012482, double:3.032964170322774E-306)
            boolean r0 = X.182.A06(r3, r7, r0)
            r8 = r17
            if (r0 == 0) goto L_0x0100
            java.lang.String r1 = X.DbS.A0m(r2)
            if (r1 == 0) goto L_0x0100
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0100
            r6 = 0
            android.net.Uri r1 = X.DbT.A09(r1)
            java.lang.String r2 = r1.getHost()
            java.lang.String r13 = "thread_id"
            java.lang.String r5 = r1.getQueryParameter(r13)
            java.lang.String r10 = "latitude"
            java.lang.String r0 = r1.getQueryParameter(r10)
            if (r0 == 0) goto L_0x00fc
            java.lang.Double r16 = X.012.A0p(r0)
        L_0x003d:
            java.lang.String r9 = "longitude"
            java.lang.String r0 = r1.getQueryParameter(r9)
            if (r0 == 0) goto L_0x00f9
            java.lang.Double r15 = X.012.A0p(r0)
        L_0x0049:
            java.lang.String r0 = "address"
            java.lang.String r12 = r1.getQueryParameter(r0)
            java.lang.String r0 = "cta_url"
            java.lang.String r11 = r1.getQueryParameter(r0)
            if (r2 == 0) goto L_0x0100
            if (r5 == 0) goto L_0x0100
            if (r16 == 0) goto L_0x0100
            if (r15 == 0) goto L_0x0100
            X.2Dm r0 = X.1bJ.A00(r7)
            X.3U9 r1 = X.C66580MXl.A0d(r0, r5)
            if (r1 == 0) goto L_0x0100
            X.3Tu r0 = r1.AiM()
            boolean r0 = X.C331057Pi.A02(r0)
            if (r0 != 0) goto L_0x0099
            boolean r0 = r1.CVE()
            if (r0 != 0) goto L_0x0099
            boolean r0 = r1.Axj()
            if (r0 != 0) goto L_0x0099
            X.9HW r4 = X.AnonymousClass9HV.A00(r7)
            X.3t0 r1 = X.C66580MXl.A0g(r5)
            r0 = 59
            boolean r0 = r4.A00(r1, r0)
            if (r0 == 0) goto L_0x0099
            r0 = 36321125378040961(0x8109df00002481, double:3.0329641702813283E-306)
            boolean r0 = X.182.A06(r3, r7, r0)
            r14 = 1
            if (r0 != 0) goto L_0x009a
        L_0x0099:
            r14 = 0
        L_0x009a:
            java.lang.String r0 = "live_location"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00cc
            double r2 = r16.doubleValue()
            double r0 = r15.doubleValue()
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            r4.putDouble(r10, r2)
            r4.putDouble(r9, r0)
            r4.putString(r13, r5)
            java.lang.String r0 = "creation_enabled"
            r4.putBoolean(r0, r14)
            X.Ukv r0 = new X.Ukv
            r0.<init>()
            r0.setArguments(r4)
        L_0x00c4:
            X.6Yo r0 = X.DbU.A0P(r6, r0, r8, r7)
            X.DbV.A1O(r0)
            return
        L_0x00cc:
            java.lang.String r0 = "pinned_location"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0100
            double r4 = r16.doubleValue()
            double r2 = r15.doubleValue()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            r1.putDouble(r10, r4)
            r1.putDouble(r9, r2)
            java.lang.String r0 = "pinned_address"
            r1.putString(r0, r12)
            java.lang.String r0 = "pinned_get_directions"
            r1.putString(r0, r11)
            X.Uku r0 = new X.Uku
            r0.<init>()
            r0.setArguments(r1)
            goto L_0x00c4
        L_0x00f9:
            r15 = r6
            goto L_0x0049
        L_0x00fc:
            r16 = r6
            goto L_0x003d
        L_0x0100:
            r8.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.location.LocationUrlHandlerActivity.A0n(android.os.Bundle, android.os.Bundle, com.instagram.common.session.UserSession):void");
    }
}
