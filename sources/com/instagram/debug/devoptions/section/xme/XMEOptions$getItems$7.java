package com.instagram.debug.devoptions.section.xme;

import X.AnonymousClass0fD;
import X.C309516Yo;
import X.DbS;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class XMEOptions$getItems$7 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public XMEOptions$getItems$7(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$activity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-979406356);
        C309516Yo A0M = DbS.A0M(this.$activity, this.$userSession);
        A0M.A0D(new Xme3dViewerFragment());
        A0M.A04();
        AnonymousClass0fD.A0C(358335288, A05);
    }
}
