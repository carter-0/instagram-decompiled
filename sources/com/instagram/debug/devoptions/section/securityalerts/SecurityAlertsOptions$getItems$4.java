package com.instagram.debug.devoptions.section.securityalerts;

import X.0qQ;
import X.19E;
import X.AnonymousClass0fD;
import X.AnonymousClass12T;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C59689JTv;
import X.DbX;
import X.MHF;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class SecurityAlertsOptions$getItems$4 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public SecurityAlertsOptions$getItems$4(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$activity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1938928619);
        UserSession userSession = this.$userSession;
        0qQ.A0B(userSession, 0);
        AnonymousClass7TE.A1Z(new MHF(userSession, (AnonymousClass4D7) null, 38), 19E.A02(DbX.A0c(AnonymousClass12T.A00)));
        C59689JTv.A03(this.$activity, "Mock keys changed alert generated", (String) null, 0);
        AnonymousClass0fD.A0C(1952151632, A05);
    }
}
