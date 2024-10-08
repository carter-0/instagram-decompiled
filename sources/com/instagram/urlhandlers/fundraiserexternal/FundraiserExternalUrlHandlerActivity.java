package com.instagram.urlhandlers.fundraiserexternal;

import X.08y;
import X.09i;
import X.0qQ;
import X.1ES;
import X.AnonymousClass06Q;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C229382nI;
import X.C359988do;
import X.C360678ey;
import X.C50128FQl;
import X.DbS;
import X.DbT;
import X.E84;
import X.FFQ;
import X.FUZ;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

public final class FundraiserExternalUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;
    public final AnonymousClass06Q A01 = new C50128FQl(this, 13);

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.fundraiserexternal.FundraiserExternalUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0fD.A00(-222218453);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A0A = DbT.A0A(intent);
        08y r0 = 09i.A0A;
        0qQ.A0A(A0A);
        AnonymousClass0wW A04 = r0.A04(A0A);
        this.A00 = A04;
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("fundraiser_id", intent.getStringExtra("fundraiser_id"));
        A1E.put("source_name", intent.getStringExtra("source_name"));
        getSupportFragmentManager().A0s(this.A01);
        if (!(A04 instanceof UserSession)) {
            FFQ.A01(this, A0A, A04);
        } else {
            DbS.A1Z(A04);
            C229382nI A0N = DbT.A0N(this, new FUZ(), A04);
            C360678ey A05 = C359988do.A05(A04, "com.instagram.social_impact.fundraiser.personal.details.full_screen_action", A1E);
            E84.A00(A05, A0N, 20);
            1ES.A03(A05);
        }
        AnonymousClass0fD.A07(1363554571, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
