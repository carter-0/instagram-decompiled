package com.instagram.debug.devoptions.section.newusernux;

import X.1WU;
import X.1xC;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass35B;
import X.AnonymousClass7TE;
import X.C50256FVn;
import X.EXD;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.section.newusernux.NewUserNuxOptions;

public final class NewUserNuxOptions$getItems$4 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public NewUserNuxOptions$getItems$4(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$activity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1544246392);
        1xC.A01.A02(new NewUserNuxOptions.OnboardingStatusEventListener(this.$activity), C50256FVn.class);
        1WU A00 = AnonymousClass35B.A00();
        FragmentActivity fragmentActivity = this.$activity;
        UserSession userSession = this.$userSession;
        A00.A02(fragmentActivity, userSession, EXD.A03, AnonymousClass7TE.A0q(userSession).getBoolean(AnonymousClass000.A00(245), false), false, true, true, false);
        AnonymousClass0fD.A0C(-1654657204, A05);
    }
}
