package com.instagram.debug.devoptions.section.alternatetopicnudge;

import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.C59689JTv;
import X.I3D;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class AlternateTopicNudgeOptions$getItems$3 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public AlternateTopicNudgeOptions$getItems$3(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$activity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1009278030);
        Integer num = AnonymousClass05K.A00;
        I3D.A02(this.$userSession, num, 1648142445);
        I3D.A02(this.$userSession, num, 1648145403);
        I3D.A02(this.$userSession, num, 1648147574);
        C59689JTv.A00(this.$activity, "Cleared all entries for ALTERNATE_TOPIC_NUDGE", (String) null, 1);
        AnonymousClass0fD.A0C(-738607270, A05);
    }
}
