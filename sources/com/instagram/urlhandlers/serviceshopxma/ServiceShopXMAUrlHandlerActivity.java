package com.instagram.urlhandlers.serviceshopxma;

import X.08y;
import X.09i;
import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C309516Yo;
import X.C46649DiU;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbX;
import X.Dba;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import java.util.HashMap;

public final class ServiceShopXMAUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.serviceshopxma.ServiceShopXMAUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.serviceshopxma.ServiceShopXMAUrlHandlerActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        Bundle A0A;
        int A00 = AnonymousClass0fD.A00(-1161881457);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || (A0A = DbT.A0A(intent)) == null) {
            finish();
            i = -466833547;
        } else {
            String A0m = DbS.A0m(A0A);
            if (!(A0m == null || A0m.length() == 0)) {
                Uri A09 = DbT.A09(A0m);
                if (DbV.A03(A09) == 2 && 0qQ.A0K(A09.getPathSegments().get(1), "service_details_page")) {
                    HashMap A1E = AnonymousClass7TE.A1E();
                    Dba.A0u(A09, "service_id", A1E);
                    Dba.A0u(A09, "referrer_ui_surface", A1E);
                    Dba.A0u(A09, "referrer_ui_component", A1E);
                    AnonymousClass0wW session = getSession();
                    C309516Yo A0Q = DbU.A0Q(this, session);
                    A0Q.A0D = false;
                    A0Q.A0D(C46649DiU.A02(session, "com.bloks.www.service.buyer.service-details-page", A1E));
                    A0Q.A04();
                    i = 469404682;
                }
            }
            finish();
            i = 469404682;
        }
        AnonymousClass0fD.A07(i, A00);
    }
}
