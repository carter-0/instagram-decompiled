package com.instagram.debug.devoptions.section.takeabreak;

import X.1Au;
import X.AnonymousClass0fD;
import X.Dba;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class TakeABreakOptions$getItems$2 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public TakeABreakOptions$getItems$2(UserSession userSession, FragmentActivity fragmentActivity) {
        this.$userSession = userSession;
        this.$activity = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(76436014);
        1Au.A00(this.$userSession).A0l(System.currentTimeMillis() - 172800000);
        Dba.A0r(this.$activity, "Take a Break upsell last seen time has been updated to two days ago");
        AnonymousClass0fD.A0C(-1215120359, A05);
    }
}
