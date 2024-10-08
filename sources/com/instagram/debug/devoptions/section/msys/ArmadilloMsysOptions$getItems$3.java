package com.instagram.debug.devoptions.section.msys;

import X.AnonymousClass0fD;
import X.C309516Yo;
import X.DbS;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class ArmadilloMsysOptions$getItems$3 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public ArmadilloMsysOptions$getItems$3(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$activity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1605668885);
        C309516Yo A0M = DbS.A0M(this.$activity, this.$userSession);
        A0M.A0D(new MsysDecouplingViewSettingsFragment());
        A0M.A04();
        AnonymousClass0fD.A0C(267002738, A05);
    }
}
