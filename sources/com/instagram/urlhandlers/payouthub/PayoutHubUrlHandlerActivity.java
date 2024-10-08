package com.instagram.urlhandlers.payouthub;

import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C272504kq;
import X.C309516Yo;
import X.C48892Els;
import X.C49055EoZ;
import X.DbS;
import X.DbT;
import X.DbX;
import X.DbZ;
import X.Dba;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.base.activity.BaseFragmentActivity;

public final class PayoutHubUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.instagram.urlhandlers.payouthub.PayoutHubUrlHandlerActivity, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        UserMonetizationProductType userMonetizationProductType;
        int i;
        int A002 = AnonymousClass0fD.A00(-883668819);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = 1505011486;
        } else {
            String A0m = DbS.A0m(A0A);
            if (A0m == null) {
                finish();
                i = 416054233;
            } else {
                this.A00 = DbT.A0W(A0A);
                Uri A09 = DbT.A09(A0m);
                AnonymousClass0wW r6 = this.A00;
                String queryParameter = A09.getQueryParameter("monetization_type");
                String A0h = DbZ.A0h(A09);
                String queryParameter2 = A09.getQueryParameter("upl_session_id");
                String queryParameter3 = A09.getQueryParameter("financial_entity_id");
                if (queryParameter != null) {
                    userMonetizationProductType = C272504kq.A00(queryParameter);
                } else {
                    userMonetizationProductType = null;
                }
                C309516Yo A0B = Dba.A0B(this, r6);
                if (r6 != null) {
                    A0B.A0B((Bundle) null, C48892Els.A00(userMonetizationProductType, C49055EoZ.A00(A0h), queryParameter3, queryParameter2));
                    A0B.A04();
                    i = 727646448;
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
