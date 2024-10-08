package com.instagram.urlhandlers.professionaldashboardexternal;

import X.08y;
import X.09i;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.DbT;
import X.DbX;
import X.FFQ;
import X.FHB;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import java.util.HashMap;

public final class ProfessionalDashboardExternalUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.professionaldashboardexternal.ProfessionalDashboardExternalUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.professionaldashboardexternal.ProfessionalDashboardExternalUrlHandlerActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        String str;
        int A00 = AnonymousClass0fD.A00(-152613700);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (!DbT.A1Z(this)) {
            FFQ.A03(A0A, this);
        } else {
            HashMap A1E = AnonymousClass7TE.A1E();
            Intent intent = getIntent();
            if (intent == null || (str = intent.getStringExtra("origin")) == null || str.length() == 0) {
                str = "deep_link";
            }
            A1E.put("origin", str);
            FHB.A0E(this, getSession(), A1E);
        }
        AnonymousClass0fD.A07(183218028, A00);
    }
}
