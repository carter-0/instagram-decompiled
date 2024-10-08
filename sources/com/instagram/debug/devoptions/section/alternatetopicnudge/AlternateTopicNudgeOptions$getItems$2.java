package com.instagram.debug.devoptions.section.alternatetopicnudge;

import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.C59689JTv;
import X.I3D;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class AlternateTopicNudgeOptions$getItems$2 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public AlternateTopicNudgeOptions$getItems$2(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$activity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1130348968);
        I3D.A01(this.$userSession, AnonymousClass05K.A00);
        C59689JTv.A00(this.$activity, "Cleared all entries for ALTERNATE_TOPIC_NUDGE", (String) null, 1);
        AnonymousClass0fD.A0C(721064596, A05);
    }
}
