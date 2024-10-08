package com.instagram.urlhandlers.adspaynow;

import X.09i;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.FFQ;
import X.Pxd;
import X.WGT;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class AdsPayNowUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.adspaynow.AdsPayNowUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0fD.A00(602079204);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle bundleExtra = intent.getBundleExtra(Pxd.A00(13));
        if (bundleExtra != null) {
            this.A00 = 09i.A0A.A04(bundleExtra);
        }
        String stringExtra = intent.getStringExtra(AnonymousClass000.A00(1073));
        if (bundleExtra != null) {
            bundleExtra.putString("paymentAccountID", stringExtra);
            bundleExtra.putString("entryPoint", "instagram");
        }
        UserSession userSession = this.A00;
        if (!(userSession instanceof UserSession)) {
            if (userSession != null) {
                FFQ.A00().A00(this, bundleExtra, userSession);
            }
        } else if (!(stringExtra == null || stringExtra.length() == 0)) {
            WGT.A01(this, userSession, stringExtra, (String) null);
        }
        AnonymousClass0fD.A07(-1087055987, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
