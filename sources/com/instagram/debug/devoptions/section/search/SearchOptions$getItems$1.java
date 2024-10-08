package com.instagram.debug.devoptions.section.search;

import X.AnonymousClass0fD;
import X.C309516Yo;
import X.Dba;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class SearchOptions$getItems$1 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public SearchOptions$getItems$1(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$activity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(978908094);
        Dba.A12(new SearchDebugSettingsFragment(), new C309516Yo(this.$activity, this.$userSession));
        AnonymousClass0fD.A0C(2147163765, A05);
    }
}
