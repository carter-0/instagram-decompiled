package com.instagram.debug.devoptions.section.creator.agents;

import X.AnonymousClass0fD;
import X.AnonymousClass1q4;
import X.AnonymousClass7TE;
import X.C333357Yq;
import X.FHB;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.disclosure.inthread.repository.CreatorAIFanNuxRepository;

public final class CreatorAgentsDeveloperOptions$getItems$6 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public CreatorAgentsDeveloperOptions$getItems$6(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$activity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1712062964);
        CreatorAgentsDeveloperOptions$getItems$6$analyticsModule$1 creatorAgentsDeveloperOptions$getItems$6$analyticsModule$1 = new CreatorAgentsDeveloperOptions$getItems$6$analyticsModule$1("CREATOR_AI_DEV_OPTIONS");
        new C333357Yq(this.$userSession).A04();
        UserSession userSession = this.$userSession;
        AnonymousClass1q4.A00();
        userSession.A03(CreatorAIFanNuxRepository.class);
        FHB.A0D(this.$activity, creatorAgentsDeveloperOptions$getItems$6$analyticsModule$1, this.$userSession, "com.bloks.www.creators_genai.reset_fan_consent_action", "CREATOR_AI_DEV_OPTIONS", AnonymousClass7TE.A1E());
        AnonymousClass0fD.A0C(-1377023165, A05);
    }
}
