package com.instagram.urlhandlers.billingwizard;

import X.002;
import X.08y;
import X.09i;
import X.0cp;
import X.0wj;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C18676VwZ;
import X.DbS;
import X.DbT;
import X.DbX;
import X.FFQ;
import X.WGT;
import X.WO9;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class BillingWizardUrlHandlerActivity extends BaseFragmentActivity {
    public static final void A00(BillingWizardUrlHandlerActivity billingWizardUrlHandlerActivity, String str, String str2, String str3, String str4) {
        String str5 = str;
        if (str != null && str.length() != 0) {
            String str6 = str3;
            if (str3 != null && str3.length() != 0) {
                BillingWizardUrlHandlerActivity billingWizardUrlHandlerActivity2 = billingWizardUrlHandlerActivity;
                UserSession session = billingWizardUrlHandlerActivity.getSession();
                DbS.A1Z(session);
                WGT.A02(billingWizardUrlHandlerActivity2, session, str5, str6, (String) null, (String) null, str2, str4, true);
                billingWizardUrlHandlerActivity2.A0a();
            }
        }
    }

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.app.Activity, com.instagram.urlhandlers.billingwizard.BillingWizardUrlHandlerActivity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.base.activity.BaseFragmentActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity, com.instagram.urlhandlers.billingwizard.BillingWizardUrlHandlerActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = AnonymousClass0fD.A00(-1706077397);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = -2119690280;
        } else if (!(getSession() instanceof UserSession)) {
            FFQ.A03(A0A, this);
            finish();
            i = -666936813;
        } else {
            String string = A0A.getString("original_url");
            if (string == null || string.length() == 0) {
                finish();
                i = 322825440;
            } else {
                Uri A09 = DbT.A09(string);
                try {
                    0cp.A03(string);
                    String queryParameter = A09.getQueryParameter("paymentAccountID");
                    String queryParameter2 = A09.getQueryParameter("placement");
                    String queryParameter3 = A09.getQueryParameter("wizardName");
                    UserSession session = getSession();
                    DbS.A1Z(session);
                    C18676VwZ.A00(this, new WO9(this, queryParameter, queryParameter2, queryParameter3), session);
                    i = -228050117;
                } catch (Exception e) {
                    DbT.A1Q(0wj.A01, 002.A0u("BillingWizardUrlHandlerActivity: Exception: ", e.getMessage(), " when parsing uri: ", string), 817897458);
                    finish();
                    i = -643056211;
                }
            }
        }
        AnonymousClass0fD.A07(i, A00);
    }
}
