package com.instagram.urlhandlers.promotepaymentstatus;

import X.1WM;
import X.AnonymousClass0fD;
import X.AnonymousClass0t1;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.DbT;
import X.FFQ;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class PromotePaymentStatusUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.instagram.urlhandlers.promotepaymentstatus.PromotePaymentStatusUrlHandlerActivity, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        double d;
        int i;
        int A002 = AnonymousClass0fD.A00(68156686);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A0A = DbT.A0A(intent);
        if (A0A != null) {
            UserSession A0W = DbT.A0W(A0A);
            this.A00 = A0W;
            String stringExtra = intent.getStringExtra("account");
            String stringExtra2 = intent.getStringExtra("contextID");
            String stringExtra3 = intent.getStringExtra("paymentID");
            A0A.putString("account", stringExtra);
            A0A.putString("contextID", stringExtra2);
            A0A.putString("paymentID", stringExtra3);
            String stringExtra4 = intent.getStringExtra("originRootTag");
            if (stringExtra4 == null || stringExtra4.length() == 0) {
                d = 0.0d;
            } else {
                d = Double.parseDouble(stringExtra4);
            }
            A0A.putDouble("originRootTag", d);
            if (!(A0W instanceof UserSession) || !AnonymousClass0t1.A01.A01(A0W).A1M()) {
                FFQ.A01(this, A0A, A0W);
                i = -241370319;
            } else {
                finish();
                1WM.getInstance().navigateToReactNativeApp(A0W, "AdsPaymentsPrepayPaymentStatusRoute", A0A);
                i = -4390570;
            }
            AnonymousClass0fD.A07(i, A002);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A07(1705685707, A002);
        throw A0y;
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
