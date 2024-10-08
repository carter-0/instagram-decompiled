package com.instagram.debug.devoptions.section.disappearingmessages;

import X.0qQ;
import X.1Au;
import X.AnonymousClass0fD;
import X.Dba;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class DisappearingMessagesOptions$getItems$2 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public DisappearingMessagesOptions$getItems$2(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$activity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(293138359);
        UserSession userSession = this.$userSession;
        0qQ.A0B(userSession, 0);
        1Au.A00(userSession).A0d(2);
        Dba.A0r(this.$activity, "DM NUX State Set to `Seen a non-E2EE DM NUX`");
        AnonymousClass0fD.A0C(126656096, A05);
    }
}
