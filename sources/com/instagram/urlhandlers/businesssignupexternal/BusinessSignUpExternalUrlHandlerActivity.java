package com.instagram.urlhandlers.businesssignupexternal;

import X.0kR;
import X.1Q9;
import X.AnonymousClass00P;
import X.AnonymousClass0Dg;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C322576w3;
import X.DbS;
import X.DbT;
import X.DbU;
import X.FFQ;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;

public final class BusinessSignUpExternalUrlHandlerActivity extends IgFragmentActivity {
    public AnonymousClass0wW A00;

    public final AnonymousClass0wW getSession() {
        AnonymousClass0wW r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.content.Context, com.instagram.urlhandlers.businesssignupexternal.BusinessSignUpExternalUrlHandlerActivity, java.lang.Object, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0fD.A00(-1276462688);
        super.onCreate(bundle);
        this.A00 = DbS.A0S(this);
        Intent intent = getIntent();
        Bundle A0A = DbT.A0A(intent);
        if (!DbT.A1Z(this) || A0A == null) {
            FFQ.A03(A0A, this);
        } else {
            String stringExtra = intent.getStringExtra("entry_ref");
            String stringExtra2 = intent.getStringExtra("fb_user_id");
            String stringExtra3 = intent.getStringExtra("page_id");
            C322576w3.A00();
            Intent A04 = DbU.A04(this);
            AnonymousClass0wW session = getSession();
            DbS.A1Z(session);
            AnonymousClass0Dg.A00(A0A, session);
            1Q9.A01("business_conversion_flow").A08();
            DbS.A1B(A0A, stringExtra);
            A0A.putInt("business_account_flow", 7);
            A0A.putString("upsell_fb_user_id", stringExtra2);
            A0A.putString("upsell_page_id", stringExtra3);
            A04.putExtras(A0A);
            0kR.A07(this, A04, 12);
            finish();
        }
        AnonymousClass0fD.A07(462613051, A002);
    }
}
