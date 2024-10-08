package com.instagram.debug.devoptions.section.prodash;

import X.AnonymousClass0fD;
import X.C375949Fw;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class ProDashOptions$getItems$1 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public ProDashOptions$getItems$1(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$activity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(327824943);
        C375949Fw.A02(this.$userSession, this.$activity, false);
        AnonymousClass0fD.A0C(-275914110, A05);
    }
}
