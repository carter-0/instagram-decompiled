package com.instagram.debug.devoptions.section.activityfeed;

import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass5GL;
import X.C59689JTv;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class ActivityFeedOptions$getItems$3 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public ActivityFeedOptions$getItems$3(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$activity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-619230609);
        UserSession userSession = this.$userSession;
        0qQ.A0B(userSession, 0);
        AnonymousClass5GL.A00(userSession).A01();
        C59689JTv.A09(this.$activity, "Local AF db cleared");
        AnonymousClass0fD.A0C(-1990694691, A05);
    }
}
