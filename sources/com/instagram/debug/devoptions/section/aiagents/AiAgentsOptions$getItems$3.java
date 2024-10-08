package com.instagram.debug.devoptions.section.aiagents;

import X.0xY;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass9BC;
import X.C59689JTv;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class AiAgentsOptions$getItems$3 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public AiAgentsOptions$getItems$3(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$activity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1036761966);
        0xY AR4 = new AnonymousClass9BC(this.$userSession).A00.AR4();
        AR4.E5T(AnonymousClass000.A00(1519), false);
        AR4.apply();
        C59689JTv.A07(this.$activity, 2131957698);
        AnonymousClass0fD.A0C(-275825764, A05);
    }
}
