package com.instagram.debug.devoptions.section.creator.agents;

import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.FHB;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class CreatorAgentsDeveloperOptions$getItems$5 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public CreatorAgentsDeveloperOptions$getItems$5(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$activity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1872452799);
        FHB.A0D(this.$activity, new CreatorAgentsDeveloperOptions$getItems$5$analyticsModule$1("CREATOR_AI_DEV_OPTIONS"), this.$userSession, "com.bloks.www.creators_genai.reset_consent_action", "CREATOR_AI_DEV_OPTIONS", AnonymousClass7TE.A1E());
        AnonymousClass0fD.A0C(410204359, A05);
    }
}
