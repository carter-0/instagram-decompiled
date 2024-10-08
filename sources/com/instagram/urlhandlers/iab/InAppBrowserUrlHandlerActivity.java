package com.instagram.urlhandlers.iab;

import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.DbS;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class InAppBrowserUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.base.activity.BaseFragmentActivity, android.app.Activity, com.instagram.urlhandlers.iab.InAppBrowserUrlHandlerActivity] */
    public final void onCreate(Bundle bundle) {
        int A00 = AnonymousClass0fD.A00(80980179);
        super.onCreate(bundle);
        finish();
        AnonymousClass0fD.A07(-2001068107, A00);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
