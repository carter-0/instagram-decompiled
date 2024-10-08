package com.instagram.urlhandlers.professionalsignupexternal;

import X.0kR;
import X.1Q9;
import X.AnonymousClass0Dg;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C322576w3;
import X.DbS;
import X.DbT;
import X.DbU;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;

public final class ProfessionalSignUpExternalUrlHandlerActivity extends IgFragmentActivity {
    public AnonymousClass0wW A00;

    /* JADX WARNING: type inference failed for: r11v0, types: [android.content.Context, com.instagram.urlhandlers.professionalsignupexternal.ProfessionalSignUpExternalUrlHandlerActivity, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0fD.A00(999364440);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A0A = DbT.A0A(intent);
        if (A0A != null) {
            AnonymousClass0wW A0W = DbT.A0W(A0A);
            this.A00 = A0W;
            String stringExtra = intent.getStringExtra("entry_ref");
            String stringExtra2 = intent.getStringExtra("account_id");
            String stringExtra3 = intent.getStringExtra("fb_page_id");
            String stringExtra4 = intent.getStringExtra("user_type");
            C322576w3.A00();
            Intent A04 = DbU.A04(this);
            if (stringExtra == null) {
                stringExtra = "deep_link";
            }
            AnonymousClass0Dg.A00(A0A, A0W);
            1Q9.A01("business_conversion_flow").A08();
            DbS.A1B(A0A, stringExtra);
            A0A.putInt("business_account_flow", 7);
            A0A.putString("account_id", stringExtra2);
            A0A.putString("user_type", stringExtra4);
            A0A.putString("upsell_page_id", stringExtra3);
            A04.putExtras(A0A);
            0kR.A07(this, A04, 12);
        }
        finish();
        AnonymousClass0fD.A07(1626889403, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
