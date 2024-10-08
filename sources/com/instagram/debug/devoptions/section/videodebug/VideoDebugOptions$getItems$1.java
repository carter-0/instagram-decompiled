package com.instagram.debug.devoptions.section.videodebug;

import X.AnonymousClass0fD;
import X.C309516Yo;
import X.DbS;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class VideoDebugOptions$getItems$1 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public VideoDebugOptions$getItems$1(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$activity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-775446031);
        C309516Yo A0M = DbS.A0M(this.$activity, this.$userSession);
        A0M.A0D(new VideoDebugSettingsFragment());
        A0M.A04();
        AnonymousClass0fD.A0C(384897931, A05);
    }
}
