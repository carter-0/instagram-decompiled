package com.instagram.debug.devoptions.section.xme;

import X.AnonymousClass0fD;
import X.C309516Yo;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class XMEOptions$getItems$5 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public XMEOptions$getItems$5(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$activity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1094279645);
        C309516Yo r1 = new C309516Yo(this.$activity, this.$userSession);
        r1.A0D(new WearableMediaDownloadToolFragment());
        r1.A04();
        AnonymousClass0fD.A0C(-1651791453, A05);
    }
}
