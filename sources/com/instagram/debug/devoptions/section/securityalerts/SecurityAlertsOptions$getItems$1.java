package com.instagram.debug.devoptions.section.securityalerts;

import X.0qQ;
import X.19E;
import X.AnonymousClass0fD;
import X.AnonymousClass12T;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C59689JTv;
import X.DbX;
import X.MHE;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class SecurityAlertsOptions$getItems$1 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public SecurityAlertsOptions$getItems$1(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$activity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1789592762);
        UserSession userSession = this.$userSession;
        0qQ.A0B(userSession, 0);
        AnonymousClass7TE.A1Z(new MHE(userSession, (AnonymousClass4D7) null, 0), 19E.A02(DbX.A0c(AnonymousClass12T.A00)));
        C59689JTv.A03(this.$activity, "Mock login notification generated", (String) null, 0);
        AnonymousClass0fD.A0C(1085443064, A05);
    }
}
