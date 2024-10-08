package com.instagram.debug.devoptions.section.aiagents;

import X.AnonymousClass0fD;
import X.C331227Qb;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class AiAgentsOptions$getItems$2 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public AiAgentsOptions$getItems$2(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$activity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(299156787);
        C331227Qb.A01(this.$userSession, false);
        AiAgentsOptions.INSTANCE.resetAiAgentsCharacterNuxOnServer(this.$userSession, this.$activity);
        AnonymousClass0fD.A0C(163712125, A05);
    }
}
