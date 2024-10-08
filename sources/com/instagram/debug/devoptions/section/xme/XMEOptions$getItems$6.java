package com.instagram.debug.devoptions.section.xme;

import X.AnonymousClass0fD;
import X.C309516Yo;
import X.C61363K4f;
import X.DbS;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class XMEOptions$getItems$6 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public XMEOptions$getItems$6(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$activity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1423124600);
        C309516Yo A0M = DbS.A0M(this.$activity, this.$userSession);
        A0M.A0D(new C61363K4f());
        A0M.A04();
        AnonymousClass0fD.A0C(1771420638, A05);
    }
}
