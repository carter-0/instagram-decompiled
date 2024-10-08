package com.instagram.debug.devoptions.section.activityfeed;

import X.0xY;
import X.0xa;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.DbU;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class ActivityFeedOptions$getItems$1 implements View.OnClickListener {
    public final /* synthetic */ UserSession $userSession;

    public ActivityFeedOptions$getItems$1(UserSession userSession) {
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(502033164);
        0xa A0q = AnonymousClass7TE.A0q(this.$userSession);
        0xY AR4 = A0q.AR4();
        AR4.E5Z("newsfeed_row_inline_controls_nux_view_count", 0);
        0xY A0e = DbU.A0e(AR4, A0q);
        A0e.E5c("newsfeed_row_inline_controls_nux_timestamp", 0);
        A0e.apply();
        AnonymousClass0fD.A0C(1913492883, A05);
    }
}
