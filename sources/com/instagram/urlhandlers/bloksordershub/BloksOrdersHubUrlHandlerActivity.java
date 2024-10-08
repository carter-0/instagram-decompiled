package com.instagram.urlhandlers.bloksordershub;

import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C324476zN;
import X.DbS;
import X.DbT;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class BloksOrdersHubUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.bloksordershub.BloksOrdersHubUrlHandlerActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        UserSession userSession;
        int A002 = AnonymousClass0fD.A00(890632314);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A0A = DbT.A0A(intent);
        if (A0A != null) {
            userSession = DbS.A0U(A0A);
            this.A00 = userSession;
        } else {
            userSession = null;
        }
        String stringExtra = intent.getStringExtra("referrer_surface");
        String stringExtra2 = intent.getStringExtra("additional_logging_data");
        String stringExtra3 = intent.getStringExtra("deeplink_destination");
        String stringExtra4 = intent.getStringExtra("deeplink_destination_params");
        if (userSession != null) {
            C324476zN.A0K(this, userSession, stringExtra, stringExtra2, stringExtra3, stringExtra4);
        }
        AnonymousClass0fD.A07(1300214731, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
