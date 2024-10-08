package com.instagram.wellbeing.timespent.activity;

import X.08y;
import X.09i;
import X.0s1;
import X.1We;
import X.1Wg;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass3M3;
import X.AnonymousClass7TE;
import X.DbS;
import X.DbU;
import X.DbW;
import X.EWJ;
import android.os.Bundle;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class TimeSpentDashboardActivity extends BaseFragmentActivity {
    public UserSession A00;

    public final void A0j(Bundle bundle) {
        1We r0;
        if (getSupportFragmentManager().A0P(R.id.layout_container_main) == null && (r0 = 1We.A02) != null) {
            1Wg A002 = 1We.A00(r0);
            EWJ ewj = EWJ.IG_TS_EDIT_REMINDER_DIALOG;
            UserSession userSession = this.A00;
            if (userSession == null) {
                DbS.A17();
                throw AnonymousClass00P.createAndThrow();
            }
            AnonymousClass3M3 A01 = A002.A01(userSession, ewj);
            0s1 A0D = DbW.A0D(this);
            A0D.A0A(A01, R.id.layout_container_main);
            A0D.A00();
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.wellbeing.timespent.activity.TimeSpentDashboardActivity, android.app.Activity] */
    public final void finish() {
        TimeSpentDashboardActivity.super.finish();
        overridePendingTransition(R.anim.left_in, R.anim.right_out);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.wellbeing.timespent.activity.TimeSpentDashboardActivity, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0fD.A00(595417369);
        08y r1 = 09i.A0A;
        Bundle A06 = DbU.A06(this);
        if (A06 != null) {
            this.A00 = r1.A06(A06);
            super.onCreate(bundle);
            overridePendingTransition(R.anim.right_in, R.anim.left_out);
            AnonymousClass0fD.A07(-1583341520, A002);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A07(-746640960, A002);
        throw A0y;
    }
}
