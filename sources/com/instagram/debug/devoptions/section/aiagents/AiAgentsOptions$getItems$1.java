package com.instagram.debug.devoptions.section.aiagents;

import X.AnonymousClass0fD;
import X.C331227Qb;
import X.C59689JTv;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class AiAgentsOptions$getItems$1 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public AiAgentsOptions$getItems$1(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$activity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(2139106116);
        C331227Qb.A00(this.$userSession, false);
        C59689JTv.A07(this.$activity, 2131957698);
        AnonymousClass0fD.A0C(500400929, A05);
    }
}
