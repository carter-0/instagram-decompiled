package com.instagram.debug.devoptions.section.xme;

import X.0xY;
import X.0xa;
import X.1Au;
import X.AnonymousClass0fD;
import X.C59689JTv;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class XMEOptions$getItems$8 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public XMEOptions$getItems$8(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$activity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1648273068);
        0xa r3 = 1Au.A00(this.$userSession).A01;
        0xY AR4 = r3.AR4();
        AR4.E5c("world_pages_tooltip_last_seen_timestamp_ms", 0);
        AR4.apply();
        0xY AR42 = r3.AR4();
        AR42.E5Z("world_pages_tooltip_impression_count", 0);
        AR42.apply();
        FragmentActivity fragmentActivity = this.$activity;
        C59689JTv.A09(fragmentActivity, fragmentActivity.getString(2131958395));
        AnonymousClass0fD.A0C(1218519875, A05);
    }
}
