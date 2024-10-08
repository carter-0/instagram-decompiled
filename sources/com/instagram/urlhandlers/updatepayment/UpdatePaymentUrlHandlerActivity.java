package com.instagram.urlhandlers.updatepayment;

import X.08y;
import X.09i;
import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C324476zN;
import X.DbS;
import X.DbT;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class UpdatePaymentUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.updatepayment.UpdatePaymentUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0fD.A00(1059763919);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A0A = DbT.A0A(intent);
        08y r0 = 09i.A0A;
        0qQ.A0A(A0A);
        UserSession A04 = r0.A04(A0A);
        this.A00 = A04;
        DbS.A1Z(A04);
        C324476zN.A0G(this, A04, intent.getStringExtra("order_id"));
        AnonymousClass0fD.A07(-172755301, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
