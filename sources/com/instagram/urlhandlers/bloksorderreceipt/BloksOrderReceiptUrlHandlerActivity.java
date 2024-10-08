package com.instagram.urlhandlers.bloksorderreceipt;

import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C324476zN;
import X.DbS;
import X.DbT;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class BloksOrderReceiptUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.urlhandlers.bloksorderreceipt.BloksOrderReceiptUrlHandlerActivity, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0fD.A00(2053078095);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A0A = DbT.A0A(intent);
        if (A0A != null) {
            UserSession A0U = DbS.A0U(A0A);
            this.A00 = A0U;
            C324476zN.A0D(this, A0U, intent.getStringExtra("order_id"));
        }
        AnonymousClass0fD.A07(1299110281, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
