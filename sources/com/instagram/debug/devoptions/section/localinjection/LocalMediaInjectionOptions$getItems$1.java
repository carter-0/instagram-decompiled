package com.instagram.debug.devoptions.section.localinjection;

import X.AnonymousClass0fD;
import X.DbS;
import X.Dba;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class LocalMediaInjectionOptions$getItems$1 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public LocalMediaInjectionOptions$getItems$1(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$activity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(252626990);
        Dba.A12(new InjectMediaToolFragment(), DbS.A0M(this.$activity, this.$userSession));
        AnonymousClass0fD.A0C(1219938743, A05);
    }
}
