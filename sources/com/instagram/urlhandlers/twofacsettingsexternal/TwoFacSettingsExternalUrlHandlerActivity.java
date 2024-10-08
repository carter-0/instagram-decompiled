package com.instagram.urlhandlers.twofacsettingsexternal;

import X.AnonymousClass06Q;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.C50128FQl;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class TwoFacSettingsExternalUrlHandlerActivity extends BaseFragmentActivity implements AnonymousClass0iw {
    public AnonymousClass0wW A00;
    public final AnonymousClass06Q A01 = new C50128FQl(this, 33);

    public final void A0j(Bundle bundle) {
    }

    public final String getModuleName() {
        return "two_fac_settings_url_handler";
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.twofacsettingsexternal.TwoFacSettingsExternalUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (X.C49955FGk.A05(r5, r11, r7, "two_factor", "two_factor", true) == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            r0 = -794279072(0xffffffffd0a84360, float:-2.25839022E10)
            int r3 = X.AnonymousClass0fD.A00(r0)
            r5 = r11
            super.onCreate(r12)
            android.os.Bundle r4 = X.DbX.A0A(r11)
            if (r4 != 0) goto L_0x001b
            r11.finish()
            r0 = -471401363(0xffffffffe3e6fc6d, float:-8.5218807E21)
        L_0x0017:
            X.AnonymousClass0fD.A07(r0, r3)
            return
        L_0x001b:
            X.0wW r7 = X.DbT.A0W(r4)
            r11.A00 = r7
            boolean r0 = r7 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0063
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            boolean r0 = X.DbY.A1a(r7)
            if (r0 == 0) goto L_0x0048
            X.0hq r1 = r11.getSupportFragmentManager()
            X.06Q r0 = r11.A01
            r1.A0s(r0)
            java.lang.String r8 = "two_factor"
            r10 = 1
            r6 = r11
            r9 = r8
            boolean r0 = X.C49955FGk.A05(r5, r6, r7, r8, r9, r10)
            if (r0 != 0) goto L_0x0044
        L_0x0041:
            r11.finish()
        L_0x0044:
            r0 = -1341790147(0xffffffffb005e83d, float:-4.871515E-10)
            goto L_0x0017
        L_0x0048:
            X.DbU.A1D(r4, r7)
            X.F3Y r2 = X.FFR.A00()
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r1 = 0
            X.E2h r0 = r2.A02(r0, r1, r1)
            r0.setArguments(r4)
            X.6Yo r0 = X.DbV.A0M(r0, r11, r7)
            r0.A0D = r1
            r0.A04()
            goto L_0x0044
        L_0x0063:
            X.FFQ.A01(r11, r4, r7)
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.twofacsettingsexternal.TwoFacSettingsExternalUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
