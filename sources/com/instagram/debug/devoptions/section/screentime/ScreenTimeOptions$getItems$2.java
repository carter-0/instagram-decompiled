package com.instagram.debug.devoptions.section.screentime;

import X.AnonymousClass0fD;
import X.AnonymousClass1HX;
import X.Dba;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.screentime.IGScreenTimeApi;

public final class ScreenTimeOptions$getItems$2 implements View.OnClickListener {
    public final /* synthetic */ UserSession $userSession;

    public ScreenTimeOptions$getItems$2(UserSession userSession) {
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(807294625);
        Object A00 = this.$userSession.A00(IGScreenTimeApi.class);
        if (A00 != null) {
            Dba.A1S(A00, AnonymousClass1HX.A02(487035921, 3), 45, true);
        }
        AnonymousClass0fD.A0C(725134585, A05);
    }
}
