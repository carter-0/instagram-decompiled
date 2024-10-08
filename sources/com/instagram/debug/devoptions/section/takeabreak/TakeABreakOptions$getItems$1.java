package com.instagram.debug.devoptions.section.takeabreak;

import X.0qQ;
import X.0xY;
import X.2B0;
import X.2B1;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.DbV;
import X.Dba;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class TakeABreakOptions$getItems$1 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public TakeABreakOptions$getItems$1(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$activity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-167593512);
        2B1 r1 = 2B0.A01;
        UserSession userSession = this.$userSession;
        0qQ.A0B(userSession, 0);
        0xY A0c = DbV.A0c(userSession, r1);
        A0c.E5T(AnonymousClass000.A00(954), false);
        A0c.apply();
        Dba.A0r(this.$activity, "Has seen take a break cleared");
        AnonymousClass0fD.A0C(-1213260161, A05);
    }
}
