package com.instagram.debug.devoptions.section.msys;

import X.1aD;
import X.1xy;
import X.AnonymousClass0fD;
import X.C59689JTv;
import X.MZA;
import X.MZC;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class ArmadilloMsysOptions$getItems$2 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public ArmadilloMsysOptions$getItems$2(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$activity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(371241516);
        boolean A00 = 1xy.A00(this.$userSession).A00();
        FragmentActivity fragmentActivity = this.$activity;
        if (A00) {
            C59689JTv.A09(fragmentActivity, "Msys mailbox already initialized");
        } else {
            C59689JTv.A09(fragmentActivity, "Triggering msys mailbox initialization");
            MZA.A00(this.$userSession).A00("Triggered manual msys mailbox init from dev settings");
            MZC.A00(this.$userSession).A02("Triggered manual msys mailbox init from dev settings");
            1aD.A01(this.$userSession, ArmadilloMsysOptions.TAG).A02(ArmadilloMsysOptions.TAG);
        }
        AnonymousClass0fD.A0C(1633278837, A05);
    }
}
