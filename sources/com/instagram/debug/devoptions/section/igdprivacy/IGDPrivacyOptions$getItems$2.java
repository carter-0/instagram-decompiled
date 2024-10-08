package com.instagram.debug.devoptions.section.igdprivacy;

import X.0xY;
import X.AnonymousClass0fD;
import X.AnonymousClass7TF;
import X.C59689JTv;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class IGDPrivacyOptions$getItems$2 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public IGDPrivacyOptions$getItems$2(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$activity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1959683296);
        0xY A0N = AnonymousClass7TF.A0N(this.$userSession);
        A0N.E5Z("friendly_feed_nux_seen_count", 0);
        A0N.E5c("friendly_feed_nux_last_shown_time_ms", 0);
        A0N.apply();
        C59689JTv.A07(this.$activity, 2131957927);
        AnonymousClass0fD.A0C(-2055848305, A05);
    }
}
