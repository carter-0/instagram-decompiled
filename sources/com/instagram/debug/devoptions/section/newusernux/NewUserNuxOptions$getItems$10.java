package com.instagram.debug.devoptions.section.newusernux;

import X.AnonymousClass0fD;
import X.C309516Yo;
import X.DbS;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class NewUserNuxOptions$getItems$10 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public NewUserNuxOptions$getItems$10(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$activity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(521496712);
        C309516Yo A0M = DbS.A0M(this.$activity, this.$userSession);
        A0M.A0D(new NuxSelectionFragment());
        A0M.A04();
        AnonymousClass0fD.A0C(-381085643, A05);
    }
}
