package com.instagram.debug.devoptions.section.modernarchitecture;

import X.AnonymousClass0fD;
import X.DbS;
import X.Dba;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.modernarchitecture.RepositoryInfoFragment;

public final class ModernArchitectureOptions$getItems$1 implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ UserSession $userSession;

    public ModernArchitectureOptions$getItems$1(FragmentActivity fragmentActivity, UserSession userSession) {
        this.$activity = fragmentActivity;
        this.$userSession = userSession;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(251540559);
        Dba.A12(new RepositoryInfoFragment(), DbS.A0M(this.$activity, this.$userSession));
        AnonymousClass0fD.A0C(1072660896, A05);
    }
}
