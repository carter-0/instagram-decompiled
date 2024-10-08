package com.instagram.urlhandlers.bloksleavereview;

import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C324476zN;
import X.DbS;
import X.DbT;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class BloksLeaveReviewUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.bloksleavereview.BloksLeaveReviewUrlHandlerActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        UserSession userSession;
        int A002 = AnonymousClass0fD.A00(83990019);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A0A = DbT.A0A(intent);
        if (A0A != null) {
            userSession = DbS.A0U(A0A);
            this.A00 = userSession;
        } else {
            userSession = null;
        }
        String stringExtra = intent.getStringExtra("product_id");
        String stringExtra2 = intent.getStringExtra("merchant_id");
        String stringExtra3 = intent.getStringExtra("prefilled_rating");
        String stringExtra4 = intent.getStringExtra("survey_entry_point");
        String stringExtra5 = intent.getStringExtra("referral_surface");
        if (userSession != null) {
            C324476zN.A0L(this, userSession, stringExtra, stringExtra2, stringExtra3, stringExtra4, stringExtra5);
        }
        AnonymousClass0fD.A07(-431780139, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
