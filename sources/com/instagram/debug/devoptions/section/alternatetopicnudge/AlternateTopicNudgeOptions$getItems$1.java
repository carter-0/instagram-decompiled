package com.instagram.debug.devoptions.section.alternatetopicnudge;

import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass7TG;
import X.C59689JTv;
import X.I3D;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class AlternateTopicNudgeOptions$getItems$1 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public AlternateTopicNudgeOptions$getItems$1(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$activity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(948352617);
        I3D.A02(this.$userSession, AnonymousClass05K.A00, AnonymousClass7TG.A0I());
        C59689JTv.A00(this.$activity, "Added ALTERNATE_TOPIC_NUDGE entry", (String) null, 1);
        AnonymousClass0fD.A0C(-1556841856, A05);
    }
}
